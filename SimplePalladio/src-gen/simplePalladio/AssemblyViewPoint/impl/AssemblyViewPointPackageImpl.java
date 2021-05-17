/**
 */
package simplePalladio.AssemblyViewPoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplePalladio.AssemblyViewPoint.AbstractConnector;
import simplePalladio.AssemblyViewPoint.AbstractSystemElement;
import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointFactory;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.AssemblyViewType;
import simplePalladio.AssemblyViewPoint.DelegationConnector;
import simplePalladio.AssemblyViewPoint.Role;

import simplePalladio.AssemblyViewPoint.util.AssemblyViewPointValidator;

import simplePalladio.Common.CommonPackage;

import simplePalladio.Common.impl.CommonPackageImpl;

import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;

import simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl;

import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

import simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyViewPointPackageImpl extends EPackageImpl implements AssemblyViewPointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSystemElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssemblyViewPointPackageImpl() {
		super(eNS_URI, AssemblyViewPointFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AssemblyViewPointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssemblyViewPointPackage init() {
		if (isInited)
			return (AssemblyViewPointPackage) EPackage.Registry.INSTANCE.getEPackage(AssemblyViewPointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAssemblyViewPointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AssemblyViewPointPackageImpl theAssemblyViewPointPackage = registeredAssemblyViewPointPackage instanceof AssemblyViewPointPackageImpl
				? (AssemblyViewPointPackageImpl) registeredAssemblyViewPointPackage
				: new AssemblyViewPointPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemIndependentViewPointPackage.eNS_URI);
		SystemIndependentViewPointPackageImpl theSystemIndependentViewPointPackage = (SystemIndependentViewPointPackageImpl) (registeredPackage instanceof SystemIndependentViewPointPackageImpl
				? registeredPackage
				: SystemIndependentViewPointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentViewPointPackage.eNS_URI);
		DeploymentViewPointPackageImpl theDeploymentViewPointPackage = (DeploymentViewPointPackageImpl) (registeredPackage instanceof DeploymentViewPointPackageImpl
				? registeredPackage
				: DeploymentViewPointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (registeredPackage instanceof CommonPackageImpl
				? registeredPackage
				: CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblyViewPointPackage.createPackageContents();
		theSystemIndependentViewPointPackage.createPackageContents();
		theDeploymentViewPointPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblyViewPointPackage.initializePackageContents();
		theSystemIndependentViewPointPackage.initializePackageContents();
		theDeploymentViewPointPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theAssemblyViewPointPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return AssemblyViewPointValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theAssemblyViewPointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssemblyViewPointPackage.eNS_URI, theAssemblyViewPointPackage);
		return theAssemblyViewPointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyViewType() {
		return assemblyViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyViewType_Systems() {
		return (EReference) assemblyViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SystemElements() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyContext() {
		return assemblyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_Component() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_ProvidedRoles() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_RequiredRoles() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyContext_AllocationContext() {
		return (EReference) assemblyContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ParentProviderAssemblyContext() {
		return (EReference) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Interface() {
		return (EReference) roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_FromAssemblyConnectors() {
		return (EReference) roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ParentRequirereeAssemblyContext() {
		return (EReference) roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ToAssemblyConnector() {
		return (EReference) roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationConnector() {
		return delegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnector_Role() {
		return (EReference) delegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationConnector_Interface() {
		return (EReference) delegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyConnector() {
		return assemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_ProvidedRole() {
		return (EReference) assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyConnector_RequiredRole() {
		return (EReference) assemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnector() {
		return abstractConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSystemElement() {
		return abstractSystemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSystemElement_System() {
		return (EReference) abstractSystemElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyViewPointFactory getAssemblyViewPointFactory() {
		return (AssemblyViewPointFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		assemblyViewTypeEClass = createEClass(ASSEMBLY_VIEW_TYPE);
		createEReference(assemblyViewTypeEClass, ASSEMBLY_VIEW_TYPE__SYSTEMS);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__SYSTEM_ELEMENTS);

		assemblyContextEClass = createEClass(ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__COMPONENT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__PROVIDED_ROLES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__REQUIRED_ROLES);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT);
		createEReference(roleEClass, ROLE__INTERFACE);
		createEReference(roleEClass, ROLE__FROM_ASSEMBLY_CONNECTORS);
		createEReference(roleEClass, ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT);
		createEReference(roleEClass, ROLE__TO_ASSEMBLY_CONNECTOR);

		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__ROLE);
		createEReference(delegationConnectorEClass, DELEGATION_CONNECTOR__INTERFACE);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDED_ROLE);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRED_ROLE);

		abstractConnectorEClass = createEClass(ABSTRACT_CONNECTOR);

		abstractSystemElementEClass = createEClass(ABSTRACT_SYSTEM_ELEMENT);
		createEReference(abstractSystemElementEClass, ABSTRACT_SYSTEM_ELEMENT__SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SystemIndependentViewPointPackage theSystemIndependentViewPointPackage = (SystemIndependentViewPointPackage) EPackage.Registry.INSTANCE
				.getEPackage(SystemIndependentViewPointPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage) EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		DeploymentViewPointPackage theDeploymentViewPointPackage = (DeploymentViewPointPackage) EPackage.Registry.INSTANCE
				.getEPackage(DeploymentViewPointPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemEClass.getESuperTypes().add(theSystemIndependentViewPointPackage.getInterfaceCommunicator());
		systemEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		assemblyContextEClass.getESuperTypes().add(this.getAbstractSystemElement());
		assemblyContextEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		roleEClass.getESuperTypes().add(this.getAbstractSystemElement());
		roleEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		delegationConnectorEClass.getESuperTypes().add(this.getAbstractConnector());
		assemblyConnectorEClass.getESuperTypes().add(this.getAbstractConnector());
		abstractConnectorEClass.getESuperTypes().add(this.getAbstractSystemElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(assemblyViewTypeEClass, AssemblyViewType.class, "AssemblyViewType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyViewType_Systems(), this.getSystem(), null, "systems", null, 1, -1,
				AssemblyViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, simplePalladio.AssemblyViewPoint.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_SystemElements(), this.getAbstractSystemElement(),
				this.getAbstractSystemElement_System(), "systemElements", null, 1, -1,
				simplePalladio.AssemblyViewPoint.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyContextEClass, AssemblyContext.class, "AssemblyContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyContext_Component(), theSystemIndependentViewPointPackage.getAbstractComponent(),
				null, "component", null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_ProvidedRoles(), this.getRole(), this.getRole_ParentProviderAssemblyContext(),
				"providedRoles", null, 1, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_RequiredRoles(), this.getRole(),
				this.getRole_ParentRequirereeAssemblyContext(), "requiredRoles", null, 0, -1, AssemblyContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyContext_AllocationContext(), theDeploymentViewPointPackage.getAllocationContext(),
				theDeploymentViewPointPackage.getAllocationContext_Assembly(), "allocationContext", null, 0, 1,
				AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_ParentProviderAssemblyContext(), this.getAssemblyContext(),
				this.getAssemblyContext_ProvidedRoles(), "parentProviderAssemblyContext", null, 0, 1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Interface(), theSystemIndependentViewPointPackage.getInterface(), null, "interface",
				null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_FromAssemblyConnectors(), this.getAssemblyConnector(),
				this.getAssemblyConnector_RequiredRole(), "fromAssemblyConnectors", null, 0, -1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ParentRequirereeAssemblyContext(), this.getAssemblyContext(),
				this.getAssemblyContext_RequiredRoles(), "parentRequirereeAssemblyContext", null, 0, 1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ToAssemblyConnector(), this.getAssemblyConnector(),
				this.getAssemblyConnector_ProvidedRole(), "toAssemblyConnector", null, 0, -1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationConnector_Role(), this.getRole(), null, "role", null, 1, 1,
				DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationConnector_Interface(), theSystemIndependentViewPointPackage.getInterface(), null,
				"interface", null, 1, 1, DelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_ProvidedRole(), this.getRole(), this.getRole_ToAssemblyConnector(),
				"providedRole", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyConnector_RequiredRole(), this.getRole(), this.getRole_FromAssemblyConnectors(),
				"requiredRole", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConnectorEClass, AbstractConnector.class, "AbstractConnector", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSystemElementEClass, AbstractSystemElement.class, "AbstractSystemElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSystemElement_System(), this.getSystem(), this.getSystem_SystemElements(), "system",
				null, 1, 1, AbstractSystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(roleEClass, source, new String[] { "constraints", "MustHaveOnlyOneParent" });
		addAnnotation(delegationConnectorEClass, source,
				new String[] { "constraints", "InterfaceMustMatch ConnectedMustBeOfSameKind" });
		addAnnotation(assemblyConnectorEClass, source, new String[] { "constraints", "AssemblyContextsMustNotMatch" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(roleEClass, source, new String[] { "MustHaveOnlyOneParent",
				"parentRequirereeAssemblyContext.oclIsUndefined() <> parentProviderAssemblyContext.oclIsUndefined()" });
		addAnnotation(delegationConnectorEClass, source, new String[] { "InterfaceMustMatch",
				"role.interface = interface", "ConnectedMustBeOfSameKind",
				"let system : System = self.system in (system.providedInterfaces->includes(interface) and role.parentProviderAssemblyContext.providedRoles->includes(role)) or (system.requiredInterfaces->includes(interface) and role.parentRequirereeAssemblyContext.requiredRoles->includes(role))" });
		addAnnotation(assemblyConnectorEClass, source, new String[] { "AssemblyContextsMustNotMatch",
				"providedRole.parentProviderAssemblyContext <> requiredRole.parentRequirereeAssemblyContext" });
	}

} //AssemblyViewPointPackageImpl
