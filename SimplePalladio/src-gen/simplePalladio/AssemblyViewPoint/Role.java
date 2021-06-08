/**
 */
package simplePalladio.AssemblyViewPoint;

import org.eclipse.emf.common.util.EList;
import simplePalladio.SystemIndependentViewPoint.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.Role#getParentProviderAssemblyContext <em>Parent Provider Assembly Context</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.Role#getInterface <em>Interface</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.Role#getFromAssemblyConnectors <em>From Assembly Connectors</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.Role#getParentRequirereeAssemblyContext <em>Parent Requireree Assembly Context</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.Role#getToAssemblyConnector <em>To Assembly Connector</em>}</li>
 * </ul>
 *
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getRole()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustHaveOnlyOneParent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MustHaveOnlyOneParent='parentRequirereeAssemblyContext.oclIsUndefined() &lt;&gt; parentProviderAssemblyContext.oclIsUndefined()'"
 * @generated
 */
public interface Role extends AbstractSystemElement {
	/**
	 * Returns the value of the '<em><b>Parent Provider Assembly Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Provider Assembly Context</em>' reference.
	 * @see #setParentProviderAssemblyContext(AssemblyContext)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getRole_ParentProviderAssemblyContext()
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext#getProvidedRoles
	 * @model opposite="providedRoles"
	 * @generated
	 */
	AssemblyContext getParentProviderAssemblyContext();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.Role#getParentProviderAssemblyContext <em>Parent Provider Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Provider Assembly Context</em>' reference.
	 * @see #getParentProviderAssemblyContext()
	 * @generated
	 */
	void setParentProviderAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getRole_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.Role#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>From Assembly Connectors</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.AssemblyViewPoint.AssemblyConnector}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Assembly Connectors</em>' reference list.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getRole_FromAssemblyConnectors()
	 * @see simplePalladio.AssemblyViewPoint.AssemblyConnector#getRequiredRole
	 * @model opposite="requiredRole"
	 * @generated
	 */
	EList<AssemblyConnector> getFromAssemblyConnectors();

	/**
	 * Returns the value of the '<em><b>Parent Requireree Assembly Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Requireree Assembly Context</em>' reference.
	 * @see #setParentRequirereeAssemblyContext(AssemblyContext)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getRole_ParentRequirereeAssemblyContext()
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext#getRequiredRoles
	 * @model opposite="requiredRoles"
	 * @generated
	 */
	AssemblyContext getParentRequirereeAssemblyContext();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.Role#getParentRequirereeAssemblyContext <em>Parent Requireree Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Requireree Assembly Context</em>' reference.
	 * @see #getParentRequirereeAssemblyContext()
	 * @generated
	 */
	void setParentRequirereeAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>To Assembly Connector</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.AssemblyViewPoint.AssemblyConnector}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Assembly Connector</em>' reference list.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getRole_ToAssemblyConnector()
	 * @see simplePalladio.AssemblyViewPoint.AssemblyConnector#getProvidedRole
	 * @model opposite="providedRole"
	 * @generated
	 */
	EList<AssemblyConnector> getToAssemblyConnector();

} // Role
