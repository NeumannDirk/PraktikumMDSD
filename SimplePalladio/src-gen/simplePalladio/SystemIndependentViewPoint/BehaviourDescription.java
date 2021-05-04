/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getBehaviorElements <em>Behavior Elements</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getBehaviourDescription()
 * @model
 * @generated
 */
public interface BehaviourDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.BehaviorElement}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.BehaviorElement#getBehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Elements</em>' containment reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getBehaviourDescription_BehaviorElements()
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviorElement#getBehaviourDescription
	 * @model opposite="behaviourDescription" containment="true"
	 * @generated
	 */
	EList<BehaviorElement> getBehaviorElements();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.Service#getBehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(Service)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getBehaviourDescription_Service()
	 * @see simplePalladio.SystemIndependentViewPoint.Service#getBehaviourDescription
	 * @model opposite="behaviourDescription" required="true" transient="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // BehaviourDescription
