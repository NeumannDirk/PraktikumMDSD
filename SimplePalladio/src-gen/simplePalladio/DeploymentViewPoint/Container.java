/**
 */
package simplePalladio.DeploymentViewPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.Container#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends AbstractEnvironmentElement {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.DeploymentViewPoint.Link}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.DeploymentViewPoint.Link#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getContainer_Links()
	 * @see simplePalladio.DeploymentViewPoint.Link#getContainers
	 * @model opposite="containers"
	 * @generated
	 */
	EList<Link> getLinks();

} // Container
