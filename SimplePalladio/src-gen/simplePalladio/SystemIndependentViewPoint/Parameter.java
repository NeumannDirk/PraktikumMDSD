/**
 */
package simplePalladio.SystemIndependentViewPoint;

import simplePalladio.Common.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeMustNotBeVoid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TypeMustNotBeVoid='type &lt;&gt; Type::VOID'"
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"BOOLEAN"</code>.
	 * The literals are from the enumeration {@link simplePalladio.SystemIndependentViewPoint.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see simplePalladio.SystemIndependentViewPoint.Type
	 * @see #setType(Type)
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getParameter_Type()
	 * @model default="BOOLEAN" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link simplePalladio.SystemIndependentViewPoint.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see simplePalladio.SystemIndependentViewPoint.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Parameter
