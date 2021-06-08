/**
 */
package simplePalladio.AssemblyViewPoint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import simplePalladio.AssemblyViewPoint.AbstractConnector;
import simplePalladio.AssemblyViewPoint.AbstractSystemElement;
import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.AssemblyViewType;
import simplePalladio.AssemblyViewPoint.DelegationConnector;
import simplePalladio.AssemblyViewPoint.Role;

import simplePalladio.Common.NamedElement;

import simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage
 * @generated
 */
public class AssemblyViewPointSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyViewPointPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyViewPointSwitch() {
		if (modelPackage == null) {
			modelPackage = AssemblyViewPointPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE: {
			AssemblyViewType assemblyViewType = (AssemblyViewType) theEObject;
			T result = caseAssemblyViewType(assemblyViewType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssemblyViewPointPackage.SYSTEM: {
			simplePalladio.AssemblyViewPoint.System system = (simplePalladio.AssemblyViewPoint.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = caseInterfaceCommunicator(system);
			if (result == null)
				result = caseNamedElement(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT: {
			AssemblyContext assemblyContext = (AssemblyContext) theEObject;
			T result = caseAssemblyContext(assemblyContext);
			if (result == null)
				result = caseAbstractSystemElement(assemblyContext);
			if (result == null)
				result = caseNamedElement(assemblyContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssemblyViewPointPackage.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = caseAbstractSystemElement(role);
			if (result == null)
				result = caseNamedElement(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssemblyViewPointPackage.DELEGATION_CONNECTOR: {
			DelegationConnector delegationConnector = (DelegationConnector) theEObject;
			T result = caseDelegationConnector(delegationConnector);
			if (result == null)
				result = caseAbstractConnector(delegationConnector);
			if (result == null)
				result = caseAbstractSystemElement(delegationConnector);
			if (result == null)
				result = caseNamedElement(delegationConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR: {
			AssemblyConnector assemblyConnector = (AssemblyConnector) theEObject;
			T result = caseAssemblyConnector(assemblyConnector);
			if (result == null)
				result = caseAbstractConnector(assemblyConnector);
			if (result == null)
				result = caseAbstractSystemElement(assemblyConnector);
			if (result == null)
				result = caseNamedElement(assemblyConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssemblyViewPointPackage.ABSTRACT_CONNECTOR: {
			AbstractConnector abstractConnector = (AbstractConnector) theEObject;
			T result = caseAbstractConnector(abstractConnector);
			if (result == null)
				result = caseAbstractSystemElement(abstractConnector);
			if (result == null)
				result = caseNamedElement(abstractConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT: {
			AbstractSystemElement abstractSystemElement = (AbstractSystemElement) theEObject;
			T result = caseAbstractSystemElement(abstractSystemElement);
			if (result == null)
				result = caseNamedElement(abstractSystemElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyViewType(AssemblyViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(simplePalladio.AssemblyViewPoint.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyContext(AssemblyContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationConnector(DelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyConnector(AssemblyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConnector(AbstractConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract System Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract System Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSystemElement(AbstractSystemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Communicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Communicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceCommunicator(InterfaceCommunicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AssemblyViewPointSwitch
