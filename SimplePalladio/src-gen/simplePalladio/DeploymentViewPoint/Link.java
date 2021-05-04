/**
 */
package simplePalladio.DeploymentViewPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.Link#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends AbstractEnvironmentElement {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.DeploymentViewPoint.Container}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.DeploymentViewPoint.Container#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getLink_Containers()
	 * @see simplePalladio.DeploymentViewPoint.Container#getLinks
	 * @model opposite="links" lower="2"
	 * @generated
	 */
	EList<Container> getContainers();

} // Link
