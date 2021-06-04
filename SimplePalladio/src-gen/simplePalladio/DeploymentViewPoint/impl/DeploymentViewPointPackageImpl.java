/**
 */
package simplePalladio.DeploymentViewPoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;

import simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl;

import simplePalladio.Common.CommonPackage;

import simplePalladio.Common.impl.CommonPackageImpl;

import simplePalladio.DeploymentViewPoint.AbstractEnvironmentElement;
import simplePalladio.DeploymentViewPoint.AllocationContext;
import simplePalladio.DeploymentViewPoint.AllocationViewType;
import simplePalladio.DeploymentViewPoint.DeploymentViewPointFactory;
import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;
import simplePalladio.DeploymentViewPoint.EnvironmentViewType;
import simplePalladio.DeploymentViewPoint.Link;

import simplePalladio.DeploymentViewPoint.util.DeploymentViewPointValidator;

import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

import simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentViewPointPackageImpl extends EPackageImpl implements DeploymentViewPointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEnvironmentElementEClass = null;

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
	 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentViewPointPackageImpl() {
		super(eNS_URI, DeploymentViewPointFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeploymentViewPointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentViewPointPackage init() {
		if (isInited)
			return (DeploymentViewPointPackage) EPackage.Registry.INSTANCE
					.getEPackage(DeploymentViewPointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentViewPointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentViewPointPackageImpl theDeploymentViewPointPackage = registeredDeploymentViewPointPackage instanceof DeploymentViewPointPackageImpl
				? (DeploymentViewPointPackageImpl) registeredDeploymentViewPointPackage
				: new DeploymentViewPointPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemIndependentViewPointPackage.eNS_URI);
		SystemIndependentViewPointPackageImpl theSystemIndependentViewPointPackage = (SystemIndependentViewPointPackageImpl) (registeredPackage instanceof SystemIndependentViewPointPackageImpl
				? registeredPackage
				: SystemIndependentViewPointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssemblyViewPointPackage.eNS_URI);
		AssemblyViewPointPackageImpl theAssemblyViewPointPackage = (AssemblyViewPointPackageImpl) (registeredPackage instanceof AssemblyViewPointPackageImpl
				? registeredPackage
				: AssemblyViewPointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (registeredPackage instanceof CommonPackageImpl
				? registeredPackage
				: CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theDeploymentViewPointPackage.createPackageContents();
		theSystemIndependentViewPointPackage.createPackageContents();
		theAssemblyViewPointPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentViewPointPackage.initializePackageContents();
		theSystemIndependentViewPointPackage.initializePackageContents();
		theAssemblyViewPointPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDeploymentViewPointPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return DeploymentViewPointValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theDeploymentViewPointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentViewPointPackage.eNS_URI, theDeploymentViewPointPackage);
		return theDeploymentViewPointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentViewType() {
		return environmentViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentViewType_EnvironmentElements() {
		return (EReference) environmentViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationViewType() {
		return allocationViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationViewType_AllocationContexts() {
		return (EReference) allocationViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Links() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Containers() {
		return (EReference) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationContext() {
		return allocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_Container() {
		return (EReference) allocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_Assembly() {
		return (EReference) allocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEnvironmentElement() {
		return abstractEnvironmentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentViewPointFactory getDeploymentViewPointFactory() {
		return (DeploymentViewPointFactory) getEFactoryInstance();
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
		environmentViewTypeEClass = createEClass(ENVIRONMENT_VIEW_TYPE);
		createEReference(environmentViewTypeEClass, ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS);

		allocationViewTypeEClass = createEClass(ALLOCATION_VIEW_TYPE);
		createEReference(allocationViewTypeEClass, ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__LINKS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__CONTAINERS);

		allocationContextEClass = createEClass(ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__CONTAINER);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ASSEMBLY);

		abstractEnvironmentElementEClass = createEClass(ABSTRACT_ENVIRONMENT_ELEMENT);
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
		AssemblyViewPointPackage theAssemblyViewPointPackage = (AssemblyViewPointPackage) EPackage.Registry.INSTANCE
				.getEPackage(AssemblyViewPointPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage) EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getAbstractEnvironmentElement());
		linkEClass.getESuperTypes().add(this.getAbstractEnvironmentElement());
		abstractEnvironmentElementEClass.getESuperTypes().add(theCommonPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(environmentViewTypeEClass, EnvironmentViewType.class, "EnvironmentViewType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentViewType_EnvironmentElements(), this.getAbstractEnvironmentElement(), null,
				"environmentElements", null, 1, -1, EnvironmentViewType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationViewTypeEClass, AllocationViewType.class, "AllocationViewType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationViewType_AllocationContexts(), this.getAllocationContext(), null,
				"allocationContexts", null, 1, -1, AllocationViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, simplePalladio.DeploymentViewPoint.Container.class, "Container", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Links(), this.getLink(), this.getLink_Containers(), "links", null, 0, -1,
				simplePalladio.DeploymentViewPoint.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Containers(), this.getContainer(), this.getContainer_Links(), "containers", null, 2, -1,
				Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationContext_Container(), this.getContainer(), null, "container", null, 1, 1,
				AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationContext_Assembly(), theAssemblyViewPointPackage.getAssemblyContext(),
				theAssemblyViewPointPackage.getAssemblyContext_AllocationContext(), "assembly", null, 1, 1,
				AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEnvironmentElementEClass, AbstractEnvironmentElement.class, "AbstractEnvironmentElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(allocationContextEClass, source,
				new String[] { "constraints", "ConnectedAssemblyContextsMustBeOnConnectedContainers" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(allocationContextEClass, source, new String[] {
				"ConnectedAssemblyContextsMustBeOnConnectedContainers",
				"self.assembly.requiredRoles->forAll(r | r.fromAssemblyConnectors->collect(ac | ac.providedRole.parentProviderAssemblyContext.allocationContext.container)->forAll(c:Container | c = self.container or c.links->collect(l: Link|l.containers)->includes(self.container)))" });
	}

} //DeploymentViewPointPackageImpl
