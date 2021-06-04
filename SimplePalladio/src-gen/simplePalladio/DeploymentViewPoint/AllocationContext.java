/**
 */
package simplePalladio.DeploymentViewPoint;

import org.eclipse.emf.ecore.EObject;

import simplePalladio.AssemblyViewPoint.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.AllocationContext#getContainer <em>Container</em>}</li>
 *   <li>{@link simplePalladio.DeploymentViewPoint.AllocationContext#getAssembly <em>Assembly</em>}</li>
 * </ul>
 *
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getAllocationContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConnectedAssemblyContextsMustBeOnConnectedContainers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConnectedAssemblyContextsMustBeOnConnectedContainers='self.assembly.requiredRoles-&gt;forAll(r | r.fromAssemblyConnectors-&gt;collect(ac | ac.providedRole.parentProviderAssemblyContext.allocationContext.container)-&gt;forAll(c:Container | c = self.container or c.links-&gt;collect(l: Link|l.containers)-&gt;includes(self.container)))'"
 * @generated
 */
public interface AllocationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getAllocationContext_Container()
	 * @model required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link simplePalladio.DeploymentViewPoint.AllocationContext#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Assembly</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly</em>' reference.
	 * @see #setAssembly(AssemblyContext)
	 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#getAllocationContext_Assembly()
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext#getAllocationContext
	 * @model opposite="allocationContext" required="true"
	 * @generated
	 */
	AssemblyContext getAssembly();

	/**
	 * Sets the value of the '{@link simplePalladio.DeploymentViewPoint.AllocationContext#getAssembly <em>Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly</em>' reference.
	 * @see #getAssembly()
	 * @generated
	 */
	void setAssembly(AssemblyContext value);

} // AllocationContext
