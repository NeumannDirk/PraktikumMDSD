/**
 */
package simplePalladio.AssemblyViewPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AssemblyViewType#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyViewType()
 * @model
 * @generated
 */
public interface AssemblyViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.AssemblyViewPoint.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyViewType_Systems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<simplePalladio.AssemblyViewPoint.System> getSystems();

} // AssemblyViewType
