/**
 */
package simplePalladio.DeploymentViewPoint.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import simplePalladio.DeploymentViewPoint.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage
 * @generated
 */
public class DeploymentViewPointValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentViewPointValidator INSTANCE = new DeploymentViewPointValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "simplePalladio.DeploymentViewPoint";

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
	public DeploymentViewPointValidator() {
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
		return DeploymentViewPointPackage.eINSTANCE;
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
		case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE:
			return validateEnvironmentViewType((EnvironmentViewType) value, diagnostics, context);
		case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE:
			return validateAllocationViewType((AllocationViewType) value, diagnostics, context);
		case DeploymentViewPointPackage.CONTAINER:
			return validateContainer((Container) value, diagnostics, context);
		case DeploymentViewPointPackage.LINK:
			return validateLink((Link) value, diagnostics, context);
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT:
			return validateAllocationContext((AllocationContext) value, diagnostics, context);
		case DeploymentViewPointPackage.ABSTRACT_ENVIRONMENT_ELEMENT:
			return validateAbstractEnvironmentElement((AbstractEnvironmentElement) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentViewType(EnvironmentViewType environmentViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationViewType(AllocationViewType allocationViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocationViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocationContext, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAllocationContext_ConnectedAssemblyContextsMustBeOnConnectedContainers(allocationContext,
					diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConnectedAssemblyContextsMustBeOnConnectedContainers constraint of '<em>Allocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION_CONTEXT__CONNECTED_ASSEMBLY_CONTEXTS_MUST_BE_ON_CONNECTED_CONTAINERS__EEXPRESSION = "assembly.requiredRoles->forAll(r :simplePalladio::AssemblyViewPoint::Role | r.fromAssemblyConnectors->forAll(ac : simplePalladio::AssemblyViewPoint::AssemblyConnector | let c1:Container =  ac.providedRole.parentProviderAssemblyContext.allocationContext.container in c1 = self.container or c1.links->includes(self.container)))";

	/**
	 * Validates the ConnectedAssemblyContextsMustBeOnConnectedContainers constraint of '<em>Allocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext_ConnectedAssemblyContextsMustBeOnConnectedContainers(
			AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT, allocationContext, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"ConnectedAssemblyContextsMustBeOnConnectedContainers",
				ALLOCATION_CONTEXT__CONNECTED_ASSEMBLY_CONTEXTS_MUST_BE_ON_CONNECTED_CONTAINERS__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractEnvironmentElement(AbstractEnvironmentElement abstractEnvironmentElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractEnvironmentElement, diagnostics, context);
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

} //DeploymentViewPointValidator
