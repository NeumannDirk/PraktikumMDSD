/**
 */
package simplePalladio.SystemIndependentViewPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.ExternalCall#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getExternalCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustCallRequiredInterfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MustCallRequiredInterfaces='self.behaviourDescription.service.component.requiredInterfaces-&gt;exists(it: Interface | it.signatures-&gt;includes(signature))'"
 * @generated
 */
public interface ExternalCall extends BehaviorElement {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(Signature)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getExternalCall_Signature()
	 * @model required="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.ExternalCall#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

} // ExternalCall
