/**
 */
package simplePalladio.SystemIndependentViewPoint.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import simplePalladio.SystemIndependentViewPoint.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage
 * @generated
 */
public class SystemIndependentViewPointValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SystemIndependentViewPointValidator INSTANCE = new SystemIndependentViewPointValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "simplePalladio.SystemIndependentViewPoint";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemIndependentViewPointValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SystemIndependentViewPointPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE:
			return validateRepositoryViewType((RepositoryViewType) value, diagnostics, context);
		case SystemIndependentViewPointPackage.INTERFACE:
			return validateInterface((Interface) value, diagnostics, context);
		case SystemIndependentViewPointPackage.COMPOSITE_COMPONENT:
			return validateCompositeComponent((CompositeComponent) value, diagnostics, context);
		case SystemIndependentViewPointPackage.SIGNATURE:
			return validateSignature((Signature) value, diagnostics, context);
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT:
			return validateAbstractComponent((AbstractComponent) value, diagnostics, context);
		case SystemIndependentViewPointPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case SystemIndependentViewPointPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case SystemIndependentViewPointPackage.ABSTRACT_REPOSITORY_ELEMENT:
			return validateAbstractRepositoryElement((AbstractRepositoryElement) value, diagnostics, context);
		case SystemIndependentViewPointPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION:
			return validateBehaviourDescription((BehaviourDescription) value, diagnostics, context);
		case SystemIndependentViewPointPackage.INTERNAL_ACTION:
			return validateInternalAction((InternalAction) value, diagnostics, context);
		case SystemIndependentViewPointPackage.EXTERNAL_CALL:
			return validateExternalCall((ExternalCall) value, diagnostics, context);
		case SystemIndependentViewPointPackage.LOOP:
			return validateLoop((Loop) value, diagnostics, context);
		case SystemIndependentViewPointPackage.BRANCH:
			return validateBranch((Branch) value, diagnostics, context);
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT:
			return validateBehaviorElement((BehaviorElement) value, diagnostics, context);
		case SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR:
			return validateInterfaceCommunicator((InterfaceCommunicator) value, diagnostics, context);
		case SystemIndependentViewPointPackage.TYPE:
			return validateType((Type) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryViewType(RepositoryViewType repositoryViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repositoryViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent(CompositeComponent compositeComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompositeComponent_ProvidedInterfacesMustMatchWithSystemProvidedInterfaces(
					compositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCompositeComponent_RequiredInterfacesMustMatchWithSystemRequiredInterfaces(
					compositeComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProvidedInterfacesMustMatchWithSystemProvidedInterfaces constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_COMPONENT__PROVIDED_INTERFACES_MUST_MATCH_WITH_SYSTEM_PROVIDED_INTERFACES__EEXPRESSION = "(system.providedInterfaces->includesAll(self.providedInterfaces)) and (providedInterfaces->includesAll(self.system.providedInterfaces))";

	/**
	 * Validates the ProvidedInterfacesMustMatchWithSystemProvidedInterfaces constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_ProvidedInterfacesMustMatchWithSystemProvidedInterfaces(
			CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemIndependentViewPointPackage.Literals.COMPOSITE_COMPONENT, compositeComponent, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"ProvidedInterfacesMustMatchWithSystemProvidedInterfaces",
				COMPOSITE_COMPONENT__PROVIDED_INTERFACES_MUST_MATCH_WITH_SYSTEM_PROVIDED_INTERFACES__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the RequiredInterfacesMustMatchWithSystemRequiredInterfaces constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_COMPONENT__REQUIRED_INTERFACES_MUST_MATCH_WITH_SYSTEM_REQUIRED_INTERFACES__EEXPRESSION = "(system.requiredInterfaces->includesAll(self.requiredInterfaces)) and (requiredInterfaces->includesAll(self.system.requiredInterfaces))";

	/**
	 * Validates the RequiredInterfacesMustMatchWithSystemRequiredInterfaces constraint of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent_RequiredInterfacesMustMatchWithSystemRequiredInterfaces(
			CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemIndependentViewPointPackage.Literals.COMPOSITE_COMPONENT, compositeComponent, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"RequiredInterfacesMustMatchWithSystemRequiredInterfaces",
				COMPOSITE_COMPONENT__REQUIRED_INTERFACES_MUST_MATCH_WITH_SYSTEM_REQUIRED_INTERFACES__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponent(AbstractComponent abstractComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateParameter_TypeMustNotBeVoid(parameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TypeMustNotBeVoid constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__TYPE_MUST_NOT_BE_VOID__EEXPRESSION = "type <> Type::VOID";

	/**
	 * Validates the TypeMustNotBeVoid constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_TypeMustNotBeVoid(Parameter parameter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SystemIndependentViewPointPackage.Literals.PARAMETER, parameter, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "TypeMustNotBeVoid",
				PARAMETER__TYPE_MUST_NOT_BE_VOID__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractRepositoryElement(AbstractRepositoryElement abstractRepositoryElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractRepositoryElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviourDescription(BehaviourDescription behaviourDescription, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviourDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction(InternalAction internalAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCall(ExternalCall externalCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalCall, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(externalCall, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExternalCall_MustCallRequiredInterfaces(externalCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustCallRequiredInterfaces constraint of '<em>External Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTERNAL_CALL__MUST_CALL_REQUIRED_INTERFACES__EEXPRESSION = "self.behaviourDescription.service.component.requiredInterfaces->exists(it: Interface | it.signatures->includes(signature))";

	/**
	 * Validates the MustCallRequiredInterfaces constraint of '<em>External Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCall_MustCallRequiredInterfaces(ExternalCall externalCall,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(SystemIndependentViewPointPackage.Literals.EXTERNAL_CALL, externalCall, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustCallRequiredInterfaces",
				EXTERNAL_CALL__MUST_CALL_REQUIRED_INTERFACES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorElement(BehaviorElement behaviorElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviorElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceCommunicator(InterfaceCommunicator interfaceCommunicator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceCommunicator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SystemIndependentViewPointValidator
