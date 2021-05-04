/**
 */
package simplePalladio.AssemblyViewPoint.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import simplePalladio.AssemblyViewPoint.AbstractConnector;
import simplePalladio.AssemblyViewPoint.AbstractSystemElement;
import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.AssemblyViewType;
import simplePalladio.AssemblyViewPoint.DelegationConnector;
import simplePalladio.AssemblyViewPoint.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage
 * @generated
 */
public class AssemblyViewPointValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssemblyViewPointValidator INSTANCE = new AssemblyViewPointValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "simplePalladio.AssemblyViewPoint";

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
	public AssemblyViewPointValidator() {
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
		return AssemblyViewPointPackage.eINSTANCE;
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
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE:
			return validateAssemblyViewType((AssemblyViewType) value, diagnostics, context);
		case AssemblyViewPointPackage.SYSTEM:
			return validateSystem((simplePalladio.AssemblyViewPoint.System) value, diagnostics, context);
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT:
			return validateAssemblyContext((AssemblyContext) value, diagnostics, context);
		case AssemblyViewPointPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case AssemblyViewPointPackage.DELEGATION_CONNECTOR:
			return validateDelegationConnector((DelegationConnector) value, diagnostics, context);
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR:
			return validateAssemblyConnector((AssemblyConnector) value, diagnostics, context);
		case AssemblyViewPointPackage.ABSTRACT_CONNECTOR:
			return validateAbstractConnector((AbstractConnector) value, diagnostics, context);
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT:
			return validateAbstractSystemElement((AbstractSystemElement) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyViewType(AssemblyViewType assemblyViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(simplePalladio.AssemblyViewPoint.System system, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(role, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(role, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRole_MustHaveOnlyOneParent(role, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustHaveOnlyOneParent constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE__MUST_HAVE_ONLY_ONE_PARENT__EEXPRESSION = "parentRequirereeAssemblyContext.oclIsUndefined() <> parentProviderAssemblyContext.oclIsUndefined()";

	/**
	 * Validates the MustHaveOnlyOneParent constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole_MustHaveOnlyOneParent(Role role, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AssemblyViewPointPackage.Literals.ROLE, role, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MustHaveOnlyOneParent",
				ROLE__MUST_HAVE_ONLY_ONE_PARENT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationConnector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDelegationConnector_InterfaceMustMatch(delegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDelegationConnector_ConnectedMustBeOfSameKind(delegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InterfaceMustMatch constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__INTERFACE_MUST_MATCH__EEXPRESSION = "role.interface = interface";

	/**
	 * Validates the InterfaceMustMatch constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_InterfaceMustMatch(DelegationConnector delegationConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR, delegationConnector, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "InterfaceMustMatch",
				DELEGATION_CONNECTOR__INTERFACE_MUST_MATCH__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ConnectedMustBeOfSameKind constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DELEGATION_CONNECTOR__CONNECTED_MUST_BE_OF_SAME_KIND__EEXPRESSION = "let system : System = self.system in (system.providedInterfaces->includes(interface) and role.parentProviderAssemblyContext.providedRoles->includes(role)) or (system.requiredInterfaces->includes(interface) and role.parentRequirereeAssemblyContext.requiredRoles->includes(role))";

	/**
	 * Validates the ConnectedMustBeOfSameKind constraint of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector_ConnectedMustBeOfSameKind(DelegationConnector delegationConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR, delegationConnector, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ConnectedMustBeOfSameKind",
				DELEGATION_CONNECTOR__CONNECTED_MUST_BE_OF_SAME_KIND__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAssemblyConnector_AssemblyContextsMustNotMatch(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AssemblyContextsMustNotMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_CONTEXTS_MUST_NOT_MATCH__EEXPRESSION = "providedRole.parentProviderAssemblyContext <> requiredRole.parentRequirereeAssemblyContext";

	/**
	 * Validates the AssemblyContextsMustNotMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyContextsMustNotMatch(AssemblyConnector assemblyConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR, assemblyConnector, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AssemblyContextsMustNotMatch",
				ASSEMBLY_CONNECTOR__ASSEMBLY_CONTEXTS_MUST_NOT_MATCH__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractConnector(AbstractConnector abstractConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSystemElement(AbstractSystemElement abstractSystemElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSystemElement, diagnostics, context);
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

} //AssemblyViewPointValidator
