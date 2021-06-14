package repository

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import simplePalladio.SystemIndependentViewPoint.RepositoryViewType
import simplePalladio.SystemIndependentViewPoint.Interface
import simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement

class RepositoryGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {}
	
	/** override void doGenerate(Resource resource, IFileSystemAccess fsa) {
            (resource.contents.head as RepositoryViewType).generate(fsa)
    }
 
    def dispatch void generate (RepositoryViewType r, IFileSystemAccess fsa) {
        for (AbstractRepositoryElement aRE : r.repositoryElements) {
            aRE.generate(fsa)
        }
    }
 
    def generate(Interface i, IFileSystemAccess fsa) {
        fsa.generateFile(i.name+".java", '''
        public interface «i.name» {
        	dskjlaaö
        }
        ''')
    }
    
    def dispatch void generate(AbstractRepositoryElement aRE, IFileSystemAccess fsa) {} **/
}