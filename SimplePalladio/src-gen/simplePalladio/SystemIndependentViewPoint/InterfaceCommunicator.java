/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Communicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getInterfaceCommunicator()
 * @model abstract="true"
 * @generated
 */
public interface InterfaceCommunicator extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.Interface}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.Interface#getParentRequirereeCommunicator <em>Parent Requireree Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getInterfaceCommunicator_RequiredInterfaces()
	 * @see simplePalladio.SystemIndependentViewPoint.Interface#getParentRequirereeCommunicator
	 * @model opposite="parentRequirereeCommunicator"
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.Interface}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.Interface#getParentProviderCommunicator <em>Parent Provider Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getInterfaceCommunicator_ProvidedInterfaces()
	 * @see simplePalladio.SystemIndependentViewPoint.Interface#getParentProviderCommunicator
	 * @model opposite="parentProviderCommunicator" required="true"
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

} // InterfaceCommunicator
