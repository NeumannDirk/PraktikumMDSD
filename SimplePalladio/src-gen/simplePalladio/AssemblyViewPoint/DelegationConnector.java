/**
 */
package simplePalladio.AssemblyViewPoint;

import simplePalladio.SystemIndependentViewPoint.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.DelegationConnector#getRole <em>Role</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.DelegationConnector#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InterfaceMustMatch ConnectedMustBeOfSameKind'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InterfaceMustMatch='role.interface = interface' ConnectedMustBeOfSameKind='let system : System = self.system in (system.providedInterfaces-&gt;includes(interface) and role.parentProviderAssemblyContext.providedRoles-&gt;includes(role)) or (system.requiredInterfaces-&gt;includes(interface) and role.parentRequirereeAssemblyContext.requiredRoles-&gt;includes(role))'"
 * @generated
 */
public interface DelegationConnector extends AbstractConnector {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getDelegationConnector_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.DelegationConnector#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getDelegationConnector_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.DelegationConnector#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // DelegationConnector
