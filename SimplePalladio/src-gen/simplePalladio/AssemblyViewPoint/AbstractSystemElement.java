/**
 */
package simplePalladio.AssemblyViewPoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract System Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AbstractSystemElement#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAbstractSystemElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSystemElement extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.System#getSystemElements <em>System Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(simplePalladio.AssemblyViewPoint.System)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAbstractSystemElement_System()
	 * @see simplePalladio.AssemblyViewPoint.System#getSystemElements
	 * @model opposite="systemElements" required="true" transient="false"
	 * @generated
	 */
	simplePalladio.AssemblyViewPoint.System getSystem();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.AbstractSystemElement#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(simplePalladio.AssemblyViewPoint.System value);

} // AbstractSystemElement
