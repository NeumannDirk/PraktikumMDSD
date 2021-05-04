/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.BehaviorElement#getBehaviourDescription <em>Behaviour Description</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getBehaviorElement()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviour Description</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getBehaviorElements <em>Behavior Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Description</em>' container reference.
	 * @see #setBehaviourDescription(BehaviourDescription)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getBehaviorElement_BehaviourDescription()
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getBehaviorElements
	 * @model opposite="behaviorElements" required="true" transient="false"
	 * @generated
	 */
	BehaviourDescription getBehaviourDescription();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.BehaviorElement#getBehaviourDescription <em>Behaviour Description</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Description</em>' container reference.
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	void setBehaviourDescription(BehaviourDescription value);

} // BehaviorElement
