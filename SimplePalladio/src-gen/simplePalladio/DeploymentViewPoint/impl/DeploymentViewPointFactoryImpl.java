/**
 */
package simplePalladio.DeploymentViewPoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplePalladio.DeploymentViewPoint.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentViewPointFactoryImpl extends EFactoryImpl implements DeploymentViewPointFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentViewPointFactory init() {
		try {
			DeploymentViewPointFactory theDeploymentViewPointFactory = (DeploymentViewPointFactory) EPackage.Registry.INSTANCE
					.getEFactory(DeploymentViewPointPackage.eNS_URI);
			if (theDeploymentViewPointFactory != null) {
				return theDeploymentViewPointFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentViewPointFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentViewPointFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE:
			return createEnvironmentViewType();
		case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE:
			return createAllocationViewType();
		case DeploymentViewPointPackage.CONTAINER:
			return createContainer();
		case DeploymentViewPointPackage.LINK:
			return createLink();
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT:
			return createAllocationContext();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentViewType createEnvironmentViewType() {
		EnvironmentViewTypeImpl environmentViewType = new EnvironmentViewTypeImpl();
		return environmentViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationViewType createAllocationViewType() {
		AllocationViewTypeImpl allocationViewType = new AllocationViewTypeImpl();
		return allocationViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplePalladio.DeploymentViewPoint.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext createAllocationContext() {
		AllocationContextImpl allocationContext = new AllocationContextImpl();
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentViewPointPackage getDeploymentViewPointPackage() {
		return (DeploymentViewPointPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentViewPointPackage getPackage() {
		return DeploymentViewPointPackage.eINSTANCE;
	}

} //DeploymentViewPointFactoryImpl
