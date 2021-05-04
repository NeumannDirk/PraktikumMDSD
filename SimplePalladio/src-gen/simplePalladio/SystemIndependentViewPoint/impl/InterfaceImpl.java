/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplePalladio.SystemIndependentViewPoint.Interface;
import simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator;
import simplePalladio.SystemIndependentViewPoint.Signature;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.InterfaceImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.InterfaceImpl#getParentProviderCommunicator <em>Parent Provider Communicator</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.InterfaceImpl#getParentRequirereeCommunicator <em>Parent Requireree Communicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends AbstractRepositoryElementImpl implements Interface {
	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signatures;

	/**
	 * The cached value of the '{@link #getParentProviderCommunicator() <em>Parent Provider Communicator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProviderCommunicator()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceCommunicator> parentProviderCommunicator;

	/**
	 * The cached value of the '{@link #getParentRequirereeCommunicator() <em>Parent Requireree Communicator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRequirereeCommunicator()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceCommunicator> parentRequirereeCommunicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectResolvingEList<Signature>(Signature.class, this,
					SystemIndependentViewPointPackage.INTERFACE__SIGNATURES);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceCommunicator> getParentProviderCommunicator() {
		if (parentProviderCommunicator == null) {
			parentProviderCommunicator = new EObjectWithInverseResolvingEList.ManyInverse<InterfaceCommunicator>(
					InterfaceCommunicator.class, this,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR,
					SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES);
		}
		return parentProviderCommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceCommunicator> getParentRequirereeCommunicator() {
		if (parentRequirereeCommunicator == null) {
			parentRequirereeCommunicator = new EObjectWithInverseResolvingEList.ManyInverse<InterfaceCommunicator>(
					InterfaceCommunicator.class, this,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR,
					SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES);
		}
		return parentRequirereeCommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParentProviderCommunicator())
					.basicAdd(otherEnd, msgs);
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParentRequirereeCommunicator())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR:
			return ((InternalEList<?>) getParentProviderCommunicator()).basicRemove(otherEnd, msgs);
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			return ((InternalEList<?>) getParentRequirereeCommunicator()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.INTERFACE__SIGNATURES:
			return getSignatures();
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR:
			return getParentProviderCommunicator();
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			return getParentRequirereeCommunicator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.INTERFACE__SIGNATURES:
			getSignatures().clear();
			getSignatures().addAll((Collection<? extends Signature>) newValue);
			return;
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR:
			getParentProviderCommunicator().clear();
			getParentProviderCommunicator().addAll((Collection<? extends InterfaceCommunicator>) newValue);
			return;
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			getParentRequirereeCommunicator().clear();
			getParentRequirereeCommunicator().addAll((Collection<? extends InterfaceCommunicator>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.INTERFACE__SIGNATURES:
			getSignatures().clear();
			return;
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR:
			getParentProviderCommunicator().clear();
			return;
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			getParentRequirereeCommunicator().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.INTERFACE__SIGNATURES:
			return signatures != null && !signatures.isEmpty();
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR:
			return parentProviderCommunicator != null && !parentProviderCommunicator.isEmpty();
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			return parentRequirereeCommunicator != null && !parentRequirereeCommunicator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
