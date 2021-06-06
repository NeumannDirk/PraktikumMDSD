/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;

import simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl;

import simplePalladio.Common.CommonPackage;

import simplePalladio.Common.impl.CommonPackageImpl;

import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;

import simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl;

import simplePalladio.SystemIndependentViewPoint.AbstractComponent;
import simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement;
import simplePalladio.SystemIndependentViewPoint.BehaviorElement;
import simplePalladio.SystemIndependentViewPoint.BehaviourDescription;
import simplePalladio.SystemIndependentViewPoint.Branch;
import simplePalladio.SystemIndependentViewPoint.Component;
import simplePalladio.SystemIndependentViewPoint.CompositeComponent;
import simplePalladio.SystemIndependentViewPoint.ExternalCall;
import simplePalladio.SystemIndependentViewPoint.Interface;
import simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator;
import simplePalladio.SystemIndependentViewPoint.InternalAction;
import simplePalladio.SystemIndependentViewPoint.Loop;
import simplePalladio.SystemIndependentViewPoint.Parameter;
import simplePalladio.SystemIndependentViewPoint.RepositoryViewType;
import simplePalladio.SystemIndependentViewPoint.Service;
import simplePalladio.SystemIndependentViewPoint.Signature;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointFactory;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;
import simplePalladio.SystemIndependentViewPoint.Type;

import simplePalladio.SystemIndependentViewPoint.util.SystemIndependentViewPointValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemIndependentViewPointPackageImpl extends EPackageImpl implements SystemIndependentViewPointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRepositoryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceCommunicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

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
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemIndependentViewPointPackageImpl() {
		super(eNS_URI, SystemIndependentViewPointFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemIndependentViewPointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemIndependentViewPointPackage init() {
		if (isInited)
			return (SystemIndependentViewPointPackage) EPackage.Registry.INSTANCE
					.getEPackage(SystemIndependentViewPointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemIndependentViewPointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemIndependentViewPointPackageImpl theSystemIndependentViewPointPackage = registeredSystemIndependentViewPointPackage instanceof SystemIndependentViewPointPackageImpl
				? (SystemIndependentViewPointPackageImpl) registeredSystemIndependentViewPointPackage
				: new SystemIndependentViewPointPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssemblyViewPointPackage.eNS_URI);
		AssemblyViewPointPackageImpl theAssemblyViewPointPackage = (AssemblyViewPointPackageImpl) (registeredPackage instanceof AssemblyViewPointPackageImpl
				? registeredPackage
				: AssemblyViewPointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentViewPointPackage.eNS_URI);
		DeploymentViewPointPackageImpl theDeploymentViewPointPackage = (DeploymentViewPointPackageImpl) (registeredPackage instanceof DeploymentViewPointPackageImpl
				? registeredPackage
				: DeploymentViewPointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (registeredPackage instanceof CommonPackageImpl
				? registeredPackage
				: CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemIndependentViewPointPackage.createPackageContents();
		theAssemblyViewPointPackage.createPackageContents();
		theDeploymentViewPointPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theSystemIndependentViewPointPackage.initializePackageContents();
		theAssemblyViewPointPackage.initializePackageContents();
		theDeploymentViewPointPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSystemIndependentViewPointPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return SystemIndependentViewPointValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSystemIndependentViewPointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemIndependentViewPointPackage.eNS_URI, theSystemIndependentViewPointPackage);
		return theSystemIndependentViewPointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryViewType() {
		return repositoryViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryViewType_RepositoryElements() {
		return (EReference) repositoryViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Signatures() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ParentProviderCommunicator() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ParentRequirereeCommunicator() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeComponent() {
		return compositeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeComponent_System() {
		return (EReference) compositeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignature_ReturnValue() {
		return (EAttribute) signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_Parameters() {
		return (EReference) signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponent() {
		return abstractComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Services() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRepositoryElement() {
		return abstractRepositoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Signature() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_BehaviourDescription() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Component() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviourDescription() {
		return behaviourDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourDescription_BehaviorElements() {
		return (EReference) behaviourDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourDescription_Service() {
		return (EReference) behaviourDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalAction() {
		return internalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalCall() {
		return externalCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCall_Signature() {
		return (EReference) externalCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_BehaviorElements() {
		return (EReference) loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_BehaviorElements() {
		return (EReference) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorElement() {
		return behaviorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorElement_BehaviourDescription() {
		return (EReference) behaviorElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceCommunicator() {
		return interfaceCommunicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceCommunicator_RequiredInterfaces() {
		return (EReference) interfaceCommunicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceCommunicator_ProvidedInterfaces() {
		return (EReference) interfaceCommunicatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemIndependentViewPointFactory getSystemIndependentViewPointFactory() {
		return (SystemIndependentViewPointFactory) getEFactoryInstance();
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
		repositoryViewTypeEClass = createEClass(REPOSITORY_VIEW_TYPE);
		createEReference(repositoryViewTypeEClass, REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__SIGNATURES);
		createEReference(interfaceEClass, INTERFACE__PARENT_PROVIDER_COMMUNICATOR);
		createEReference(interfaceEClass, INTERFACE__PARENT_REQUIREREE_COMMUNICATOR);

		compositeComponentEClass = createEClass(COMPOSITE_COMPONENT);
		createEReference(compositeComponentEClass, COMPOSITE_COMPONENT__SYSTEM);

		signatureEClass = createEClass(SIGNATURE);
		createEAttribute(signatureEClass, SIGNATURE__RETURN_VALUE);
		createEReference(signatureEClass, SIGNATURE__PARAMETERS);

		abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__SERVICES);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		abstractRepositoryElementEClass = createEClass(ABSTRACT_REPOSITORY_ELEMENT);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SIGNATURE);
		createEReference(serviceEClass, SERVICE__BEHAVIOUR_DESCRIPTION);
		createEReference(serviceEClass, SERVICE__COMPONENT);

		behaviourDescriptionEClass = createEClass(BEHAVIOUR_DESCRIPTION);
		createEReference(behaviourDescriptionEClass, BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS);
		createEReference(behaviourDescriptionEClass, BEHAVIOUR_DESCRIPTION__SERVICE);

		internalActionEClass = createEClass(INTERNAL_ACTION);

		externalCallEClass = createEClass(EXTERNAL_CALL);
		createEReference(externalCallEClass, EXTERNAL_CALL__SIGNATURE);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__BEHAVIOR_ELEMENTS);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__BEHAVIOR_ELEMENTS);

		behaviorElementEClass = createEClass(BEHAVIOR_ELEMENT);
		createEReference(behaviorElementEClass, BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION);

		interfaceCommunicatorEClass = createEClass(INTERFACE_COMMUNICATOR);
		createEReference(interfaceCommunicatorEClass, INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES);
		createEReference(interfaceCommunicatorEClass, INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES);

		// Create enums
		typeEEnum = createEEnum(TYPE);
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
		interfaceEClass.getESuperTypes().add(this.getAbstractRepositoryElement());
		compositeComponentEClass.getESuperTypes().add(this.getAbstractComponent());
		signatureEClass.getESuperTypes().add(this.getAbstractRepositoryElement());
		abstractComponentEClass.getESuperTypes().add(this.getAbstractRepositoryElement());
		abstractComponentEClass.getESuperTypes().add(this.getInterfaceCommunicator());
		componentEClass.getESuperTypes().add(this.getAbstractComponent());
		parameterEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		abstractRepositoryElementEClass.getESuperTypes().add(theCommonPackage.getNamedElement());
		internalActionEClass.getESuperTypes().add(this.getBehaviorElement());
		externalCallEClass.getESuperTypes().add(this.getBehaviorElement());
		loopEClass.getESuperTypes().add(this.getBehaviorElement());
		branchEClass.getESuperTypes().add(this.getBehaviorElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(repositoryViewTypeEClass, RepositoryViewType.class, "RepositoryViewType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepositoryViewType_RepositoryElements(), this.getAbstractRepositoryElement(), null,
				"repositoryElements", null, 1, -1, RepositoryViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Signatures(), this.getSignature(), null, "signatures", null, 1, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ParentProviderCommunicator(), this.getInterfaceCommunicator(),
				this.getInterfaceCommunicator_ProvidedInterfaces(), "parentProviderCommunicator", null, 0, -1,
				Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ParentRequirereeCommunicator(), this.getInterfaceCommunicator(),
				this.getInterfaceCommunicator_RequiredInterfaces(), "parentRequirereeCommunicator", null, 0, -1,
				Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeComponentEClass, CompositeComponent.class, "CompositeComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeComponent_System(), theAssemblyViewPointPackage.getSystem(), null, "system", null, 1,
				1, CompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignature_ReturnValue(), this.getType(), "returnValue", null, 1, 1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Signature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Services(), this.getService(), this.getService_Component(), "services", null, 1, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), this.getType(), "type", "BOOLEAN", 1, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRepositoryElementEClass, AbstractRepositoryElement.class, "AbstractRepositoryElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Signature(), this.getSignature(), null, "signature", null, 1, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_BehaviourDescription(), this.getBehaviourDescription(),
				this.getBehaviourDescription_Service(), "behaviourDescription", null, 1, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Component(), this.getComponent(), this.getComponent_Services(), "component", null, 1,
				1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourDescriptionEClass, BehaviourDescription.class, "BehaviourDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourDescription_BehaviorElements(), this.getBehaviorElement(),
				this.getBehaviorElement_BehaviourDescription(), "behaviorElements", null, 0, -1,
				BehaviourDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourDescription_Service(), this.getService(), this.getService_BehaviourDescription(),
				"service", null, 1, 1, BehaviourDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalActionEClass, InternalAction.class, "InternalAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalCallEClass, ExternalCall.class, "ExternalCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalCall_Signature(), this.getSignature(), null, "signature", null, 1, 1,
				ExternalCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_BehaviorElements(), this.getBehaviorElement(), null, "behaviorElements", null, 0, -1,
				Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_BehaviorElements(), this.getBehaviorElement(), null, "behaviorElements", null, 0, -1,
				Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorElementEClass, BehaviorElement.class, "BehaviorElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorElement_BehaviourDescription(), this.getBehaviourDescription(),
				this.getBehaviourDescription_BehaviorElements(), "behaviourDescription", null, 0, 1,
				BehaviorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceCommunicatorEClass, InterfaceCommunicator.class, "InterfaceCommunicator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceCommunicator_RequiredInterfaces(), this.getInterface(),
				this.getInterface_ParentRequirereeCommunicator(), "requiredInterfaces", null, 0, -1,
				InterfaceCommunicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceCommunicator_ProvidedInterfaces(), this.getInterface(),
				this.getInterface_ParentProviderCommunicator(), "providedInterfaces", null, 1, -1,
				InterfaceCommunicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.VOID);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.CHAR);
		addEEnumLiteral(typeEEnum, Type.DATE);
		addEEnumLiteral(typeEEnum, Type.DOUBLE);
		addEEnumLiteral(typeEEnum, Type.FLOAT);
		addEEnumLiteral(typeEEnum, Type.LIST);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.LONG);
		addEEnumLiteral(typeEEnum, Type.MAP);
		addEEnumLiteral(typeEEnum, Type.STRING);

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
		addAnnotation(compositeComponentEClass, source, new String[] { "constraints",
				"ProvidedInterfacesMustMatchWithSystemProvidedInterfaces RequiredInterfacesMustMatchWithSystemRequiredInterfaces" });
		addAnnotation(parameterEClass, source, new String[] { "constraints", "TypeMustNotBeVoid" });
		addAnnotation(externalCallEClass, source, new String[] { "constraints", "MustCallRequiredInterfaces" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(compositeComponentEClass, source, new String[] {
				"ProvidedInterfacesMustMatchWithSystemProvidedInterfaces",
				"(system.providedInterfaces->includesAll(self.providedInterfaces)) and (providedInterfaces->includesAll(self.system.providedInterfaces))",
				"RequiredInterfacesMustMatchWithSystemRequiredInterfaces",
				"(system.requiredInterfaces->includesAll(self.requiredInterfaces)) and (requiredInterfaces->includesAll(self.system.requiredInterfaces))" });
		addAnnotation(parameterEClass, source, new String[] { "TypeMustNotBeVoid", "type <> Type::VOID" });
		addAnnotation(externalCallEClass, source, new String[] { "MustCallRequiredInterfaces",
				"self.behaviourDescription.service.component.requiredInterfaces->exists(it: Interface | it.signatures->includes(signature))" });
	}

} //SystemIndependentViewPointPackageImpl
