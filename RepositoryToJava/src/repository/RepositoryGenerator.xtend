package repository

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement
import simplePalladio.SystemIndependentViewPoint.Component
import simplePalladio.SystemIndependentViewPoint.Interface
import simplePalladio.SystemIndependentViewPoint.RepositoryViewType
import simplePalladio.SystemIndependentViewPoint.Signature
import simplePalladio.SystemIndependentViewPoint.Type

public class RepositoryGenerator implements IGenerator {	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
            (resource.contents.head as RepositoryViewType).generate(fsa)
    }
 
    def dispatch void generate (RepositoryViewType r, IFileSystemAccess fsa) {
        for (AbstractRepositoryElement aRE : r.repositoryElements) {
            aRE.generate(fsa)
        }
        
        //Methods assertNull and assertNotNull per Interface
        fsa.generateFile("repository/Helper.java", '''
        package repository;
        public class Helper {
        	«FOR i : r.repositoryElements.filter[e | return e instanceof Interface].map[e | return e as Interface]»
        	public static void assertNull(«i.name» «i.name.toFirstLower()») {
        		assert(«i.name.toFirstLower()» == null);
        	}
        	
        	public static void assertNotNull(«i.name» «i.name.toFirstLower()») {
        		assert(«i.name.toFirstLower()» != null);
        	}
        	«ENDFOR»
        	
        }
        ''')
    }
 
    def dispatch void generate(Interface i, IFileSystemAccess fsa) {
        fsa.generateFile('repository' + '/' + i.name+".java", '''
        package repository;
        public interface «i.name» {
        	«FOR sig: i.signatures»
        		«sig.generate()»;
        	«ENDFOR»
        }
        ''')
    }
    
    def generate(Signature s) {
    	'''«s.returnValue.generate()» «s.name» («FOR par: s.parameters SEPARATOR ', '» «par.type.generate()» «par.name»«ENDFOR»)'''
    }
    
    def generate(Type t) {
    	 switch t {
    	 	case VOID: "void"
    	 	case BOOLEAN: "boolean"
    	 	case INT: "int"
    	 	case CHAR: "char"
    	 	case FLOAT: "float"
    	 	case DOUBLE: "double"
    	 	case LONG: "long"
    	 	case STRING: "String"
    	 }
    }
    
    def dispatch void generate(Component c, IFileSystemAccess fsa) {
        fsa.generateFile(c.name + '/' + c.name+"Impl.java", '''
        package «c.name»;
        
        «FOR i: c.providedInterfaces»
        	import repository.«i.name»;
        «ENDFOR»
        «FOR i: c.requiredInterfaces.filter[i| !c.providedInterfaces.contains(i)]»
        	import repository.«i.name»;
        «ENDFOR»
        «IF !c.requiredInterfaces.empty»
        	import repository.Helper;
        «ENDIF»
        
        public class «c.name»Impl implements «FOR i: c.providedInterfaces SEPARATOR ','» «i.name» «ENDFOR» {
        	«FOR i: c.requiredInterfaces»
        		private «i.name» «i.name.toFirstLower()»;
        	«ENDFOR»
        	
        	public «c.name»Impl() {}
        	
        	«FOR i: c.requiredInterfaces»
        		public void set«i.name»(«i.name» «i.name.toFirstLower()») {
        			Helper.assertNull(this.«i.name.toFirstLower()»);
        			this.«i.name.toFirstLower()» = «i.name.toFirstLower()»;
        		}
        	«ENDFOR»
        	
        	«FOR i: c.providedInterfaces»
        		«FOR s: i.signatures»
        			//Implementing «s.name» from interface «i.name»
        			@Override
        			public «s.generate()» {
        				«FOR ireq: c.requiredInterfaces»
        					Helper.assertNotNull(this.«ireq.name.toFirstLower()»);
        				«ENDFOR»
        				//TODO: implement
        			}
        		«ENDFOR»
        	«ENDFOR»
        }
        ''')    	
    }
    
    def dispatch void generate(AbstractRepositoryElement aRE, IFileSystemAccess fsa) {} 
}