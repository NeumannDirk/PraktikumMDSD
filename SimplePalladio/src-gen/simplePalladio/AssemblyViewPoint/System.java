/**
 */
package simplePalladio.AssemblyViewPoint;

import org.eclipse.emf.common.util.EList;

import simplePalladio.Common.NamedElement;
import simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.System#getSystemElements <em>System Elements</em>}</li>
 * </ul>
 *
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends InterfaceCommunicator, NamedElement {
	/**
	 * Returns the value of the '<em><b>System Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.AssemblyViewPoint.AbstractSystemElement}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.AbstractSystemElement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Elements</em>' containment reference list.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getSystem_SystemElements()
	 * @see simplePalladio.AssemblyViewPoint.AbstractSystemElement#getSystem
	 * @model opposite="system" containment="true" required="true"
	 * @generated
	 */
	EList<AbstractSystemElement> getSystemElements();

} // System
