/**
 */
package simplePalladio.AssemblyViewPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getRequiredRole <em>Required Role</em>}</li>
 * </ul>
 *
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AssemblyContextsMustNotMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AssemblyContextsMustNotMatch='providedRole.parentProviderAssemblyContext &lt;&gt; requiredRole.parentRequirereeAssemblyContext'"
 * @generated
 */
public interface AssemblyConnector extends AbstractConnector {
	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.Role#getToAssemblyConnector <em>To Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(Role)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyConnector_ProvidedRole()
	 * @see simplePalladio.AssemblyViewPoint.Role#getToAssemblyConnector
	 * @model opposite="toAssemblyConnector" required="true"
	 * @generated
	 */
	Role getProvidedRole();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(Role value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.Role#getFromAssemblyConnectors <em>From Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(Role)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyConnector_RequiredRole()
	 * @see simplePalladio.AssemblyViewPoint.Role#getFromAssemblyConnectors
	 * @model opposite="fromAssemblyConnectors" required="true"
	 * @generated
	 */
	Role getRequiredRole();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(Role value);

} // AssemblyConnector
