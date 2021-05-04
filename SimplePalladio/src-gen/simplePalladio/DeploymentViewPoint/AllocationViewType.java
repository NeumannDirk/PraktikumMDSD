/**
 */
package simplePalladio.DeploymentViewPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.AllocationViewType#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getAllocationViewType()
 * @model
 * @generated
 */
public interface AllocationViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.DeploymentViewPoint.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getAllocationViewType_AllocationContexts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // AllocationViewType
