/**
 */
package simplePalladio.AssemblyViewPoint;

import org.eclipse.emf.common.util.EList;
import simplePalladio.DeploymentViewPoint.AllocationContext;

import simplePalladio.SystemIndependentViewPoint.AbstractComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getComponent <em>Component</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyContext()
 * @model
 * @generated
 */
public interface AssemblyContext extends AbstractSystemElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(AbstractComponent)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyContext_Component()
	 * @model required="true"
	 * @generated
	 */
	AbstractComponent getComponent();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(AbstractComponent value);

	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.AssemblyViewPoint.Role}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.Role#getParentProviderAssemblyContext <em>Parent Provider Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' reference list.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyContext_ProvidedRoles()
	 * @see simplePalladio.AssemblyViewPoint.Role#getParentProviderAssemblyContext
	 * @model opposite="parentProviderAssemblyContext" required="true"
	 * @generated
	 */
	EList<Role> getProvidedRoles();

	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' reference list.
	 * The list contents are of type {@link simplePalladio.AssemblyViewPoint.Role}.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.Role#getParentRequirereeAssemblyContext <em>Parent Requireree Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' reference list.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyContext_RequiredRoles()
	 * @see simplePalladio.AssemblyViewPoint.Role#getParentRequirereeAssemblyContext
	 * @model opposite="parentRequirereeAssemblyContext"
	 * @generated
	 */
	EList<Role> getRequiredRoles();

	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.DeploymentViewPoint.AllocationContext#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' reference.
	 * @see #setAllocationContext(AllocationContext)
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#getAssemblyContext_AllocationContext()
	 * @see simplePalladio.DeploymentViewPoint.AllocationContext#getAssembly
	 * @model opposite="assembly"
	 * @generated
	 */
	AllocationContext getAllocationContext();

	/**
	 * Sets the value of the '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getAllocationContext <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Context</em>' reference.
	 * @see #getAllocationContext()
	 * @generated
	 */
	void setAllocationContext(AllocationContext value);

} // AssemblyContext
