/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Service#getSignature <em>Signature</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Service#getBehaviourDescription <em>Behaviour Description</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Service#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(Signature)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getService_Signature()
	 * @model required="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.Service#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Behaviour Description</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Description</em>' containment reference.
	 * @see #setBehaviourDescription(BehaviourDescription)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getService_BehaviourDescription()
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getService
	 * @model opposite="service" containment="true" required="true"
	 * @generated
	 */
	BehaviourDescription getBehaviourDescription();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.Service#getBehaviourDescription <em>Behaviour Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Description</em>' containment reference.
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	void setBehaviourDescription(BehaviourDescription value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.Component#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getService_Component()
	 * @see simplePalladio.SystemIndependentViewPoint.Component#getServices
	 * @model opposite="services" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.Service#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // Service
