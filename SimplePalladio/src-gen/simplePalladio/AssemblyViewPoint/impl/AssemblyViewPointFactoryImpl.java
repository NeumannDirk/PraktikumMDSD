/**
 */
package simplePalladio.AssemblyViewPoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointFactory;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.AssemblyViewType;
import simplePalladio.AssemblyViewPoint.DelegationConnector;
import simplePalladio.AssemblyViewPoint.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyViewPointFactoryImpl extends EFactoryImpl implements AssemblyViewPointFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssemblyViewPointFactory init() {
		try {
			AssemblyViewPointFactory theAssemblyViewPointFactory = (AssemblyViewPointFactory) EPackage.Registry.INSTANCE
					.getEFactory(AssemblyViewPointPackage.eNS_URI);
			if (theAssemblyViewPointFactory != null) {
				return theAssemblyViewPointFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssemblyViewPointFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyViewPointFactoryImpl() {
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
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE:
			return createAssemblyViewType();
		case AssemblyViewPointPackage.SYSTEM:
			return createSystem();
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT:
			return createAssemblyContext();
		case AssemblyViewPointPackage.ROLE:
			return createRole();
		case AssemblyViewPointPackage.DELEGATION_CONNECTOR:
			return createDelegationConnector();
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR:
			return createAssemblyConnector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyViewType createAssemblyViewType() {
		AssemblyViewTypeImpl assemblyViewType = new AssemblyViewTypeImpl();
		return assemblyViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplePalladio.AssemblyViewPoint.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext createAssemblyContext() {
		AssemblyContextImpl assemblyContext = new AssemblyContextImpl();
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnector createDelegationConnector() {
		DelegationConnectorImpl delegationConnector = new DelegationConnectorImpl();
		return delegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector createAssemblyConnector() {
		AssemblyConnectorImpl assemblyConnector = new AssemblyConnectorImpl();
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyViewPointPackage getAssemblyViewPointPackage() {
		return (AssemblyViewPointPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssemblyViewPointPackage getPackage() {
		return AssemblyViewPointPackage.eINSTANCE;
	}

} //AssemblyViewPointFactoryImpl
