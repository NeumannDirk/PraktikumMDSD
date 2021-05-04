/**
 */
package simplePalladio.AssemblyViewPoint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage
 * @generated
 */
public class AssemblyViewPointAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyViewPointPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyViewPointAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssemblyViewPointPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyViewPointSwitch<Adapter> modelSwitch = new AssemblyViewPointSwitch<Adapter>() {
		@Override
		public Adapter caseAssemblyViewType(AssemblyViewType object) {
			return createAssemblyViewTypeAdapter();
		}

		@Override
		public Adapter caseSystem(simplePalladio.AssemblyViewPoint.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseAssemblyContext(AssemblyContext object) {
			return createAssemblyContextAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseDelegationConnector(DelegationConnector object) {
			return createDelegationConnectorAdapter();
		}

		@Override
		public Adapter caseAssemblyConnector(AssemblyConnector object) {
			return createAssemblyConnectorAdapter();
		}

		@Override
		public Adapter caseAbstractConnector(AbstractConnector object) {
			return createAbstractConnectorAdapter();
		}

		@Override
		public Adapter caseAbstractSystemElement(AbstractSystemElement object) {
			return createAbstractSystemElementAdapter();
		}

		@Override
		public Adapter caseInterfaceCommunicator(InterfaceCommunicator object) {
			return createInterfaceCommunicatorAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.AssemblyViewType <em>Assembly View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewType
	 * @generated
	 */
	public Adapter createAssemblyViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.AssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext
	 * @generated
	 */
	public Adapter createAssemblyContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.DelegationConnector
	 * @generated
	 */
	public Adapter createDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyConnector
	 * @generated
	 */
	public Adapter createAssemblyConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.AbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.AbstractConnector
	 * @generated
	 */
	public Adapter createAbstractConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.AssemblyViewPoint.AbstractSystemElement <em>Abstract System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.AssemblyViewPoint.AbstractSystemElement
	 * @generated
	 */
	public Adapter createAbstractSystemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator <em>Interface Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator
	 * @generated
	 */
	public Adapter createInterfaceCommunicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplePalladio.Common.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplePalladio.Common.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssemblyViewPointAdapterFactory
