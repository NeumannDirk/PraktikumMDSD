/**
 */
package simplePalladio.DeploymentViewPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.EnvironmentViewType#getEnvironmentElements <em>Environment Elements</em>}</li>
 * </ul>
 *
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getEnvironmentViewType()
 * @model
 * @generated
 */
public interface EnvironmentViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.DeploymentViewPoint.AbstractEnvironmentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Elements</em>' containment reference list.
	 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getEnvironmentViewType_EnvironmentElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractEnvironmentElement> getEnvironmentElements();

} // EnvironmentViewType
