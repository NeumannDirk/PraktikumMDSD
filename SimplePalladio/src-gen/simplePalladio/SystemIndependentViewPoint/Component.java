/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Component#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.Service}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.Service#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getComponent_Services()
	 * @see simplePalladio.SystemIndependentViewPoint.Service#getComponent
	 * @model opposite="component" containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

} // Component
