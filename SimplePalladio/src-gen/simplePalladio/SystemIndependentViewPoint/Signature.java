/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Signature#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Signature#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends AbstractRepositoryElement {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' attribute.
	 * The literals are from the enumeration {@link simplePalladio.SystemIndependentViewPoint.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' attribute.
	 * @see simplePalladio.SystemIndependentViewPoint.Type
	 * @see #setReturnValue(Type)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getSignature_ReturnValue()
	 * @model required="true"
	 * @generated
	 */
	Type getReturnValue();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.Signature#getReturnValue <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' attribute.
	 * @see simplePalladio.SystemIndependentViewPoint.Type
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Type value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getSignature_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Signature
