package SimplePalladio.design;

import org.eclipse.emf.ecore.EObject;
import simplePalladio.SystemIndependentViewPoint.Type;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self) {
       // TODO Auto-generated code
      System.out.println(self);
      return self;
    }
    
    public Type parse(String self) {
    	System.out.println("Test");
    	switch (self) {
		case "VOID":
		case "void":
	    	return Type.VOID;
		case "BOOLEAN":
		case "boolean":
			return Type.BOOLEAN;
		case "CHAR":
		case "char":
	    	return Type.CHAR;
		case "DATE":
		case "date":
	    	return Type.DATE;
		case "DOUBLE":
		case "double":
			return Type.DOUBLE;
		case "FLOAT":
		case "float":
	    	return Type.FLOAT;
		case "LIST":
		case "list":
	    	return Type.LIST;
		case "INT":
		case "int":
			return Type.INT;
		case "LONG":
		case "long":
	    	return Type.LONG;
		case "MAP":
		case "map":
			return Type.MAP;
		case "STRING":
		case "string":
	    	return Type.STRING;	   
		default:
			//Logging
			break;
		}
    	return Type.VOID;
    }
}
