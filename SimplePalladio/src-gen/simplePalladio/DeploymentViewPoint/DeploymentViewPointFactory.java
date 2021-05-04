/**
 */
package simplePalladio.DeploymentViewPoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage
 * @generated
 */
public interface DeploymentViewPointFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentViewPointFactory eINSTANCE = simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Environment View Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment View Type</em>'.
	 * @generated
	 */
	EnvironmentViewType createEnvironmentViewType();

	/**
	 * Returns a new object of class '<em>Allocation View Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation View Type</em>'.
	 * @generated
	 */
	AllocationViewType createAllocationViewType();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Allocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Context</em>'.
	 * @generated
	 */
	AllocationContext createAllocationContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentViewPointPackage getDeploymentViewPointPackage();

} //DeploymentViewPointFactory
