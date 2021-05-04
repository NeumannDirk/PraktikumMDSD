/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Interface#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Interface#getParentProviderCommunicator <em>Parent Provider Communicator</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.Interface#getParentRequirereeCommunicator <em>Parent Requireree Communicator</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends AbstractRepositoryElement {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getInterface_Signatures()
	 * @model required="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Parent Provider Communicator</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Provider Communicator</em>' reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getInterface_ParentProviderCommunicator()
	 * @see simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getProvidedInterfaces
	 * @model opposite="providedInterfaces" required="true"
	 * @generated
	 */
	EList<InterfaceCommunicator> getParentProviderCommunicator();

	/**
	 * Returns the value of the '<em><b>Parent Requireree Communicator</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Requireree Communicator</em>' reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getInterface_ParentRequirereeCommunicator()
	 * @see simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getRequiredInterfaces
	 * @model opposite="requiredInterfaces" required="true"
	 * @generated
	 */
	EList<InterfaceCommunicator> getParentRequirereeCommunicator();

} // Interface
