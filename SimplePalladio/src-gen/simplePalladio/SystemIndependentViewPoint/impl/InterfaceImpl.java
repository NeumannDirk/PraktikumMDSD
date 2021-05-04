/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getParentProviderCommunicator() <em>Parent Provider Communicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProviderCommunicator()
	 * @generated
	 * @ordered
	 */
	protected InterfaceCommunicator parentProviderCommunicator;

	/**
	 * The cached value of the '{@link #getParentRequirereeCommunicator() <em>Parent Requireree Communicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRequirereeCommunicator()
	 * @generated
	 * @ordered
	 */
	protected InterfaceCommunicator parentRequirereeCommunicator;

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
	public InterfaceCommunicator getParentProviderCommunicator() {
		if (parentProviderCommunicator != null && parentProviderCommunicator.eIsProxy()) {
			InternalEObject oldParentProviderCommunicator = (InternalEObject) parentProviderCommunicator;
			parentProviderCommunicator = (InterfaceCommunicator) eResolveProxy(oldParentProviderCommunicator);
			if (parentProviderCommunicator != oldParentProviderCommunicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR,
							oldParentProviderCommunicator, parentProviderCommunicator));
			}
		}
		return parentProviderCommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceCommunicator basicGetParentProviderCommunicator() {
		return parentProviderCommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentProviderCommunicator(InterfaceCommunicator newParentProviderCommunicator,
			NotificationChain msgs) {
		InterfaceCommunicator oldParentProviderCommunicator = parentProviderCommunicator;
		parentProviderCommunicator = newParentProviderCommunicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR,
					oldParentProviderCommunicator, newParentProviderCommunicator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProviderCommunicator(InterfaceCommunicator newParentProviderCommunicator) {
		if (newParentProviderCommunicator != parentProviderCommunicator) {
			NotificationChain msgs = null;
			if (parentProviderCommunicator != null)
				msgs = ((InternalEObject) parentProviderCommunicator).eInverseRemove(this,
						SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES,
						InterfaceCommunicator.class, msgs);
			if (newParentProviderCommunicator != null)
				msgs = ((InternalEObject) newParentProviderCommunicator).eInverseAdd(this,
						SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES,
						InterfaceCommunicator.class, msgs);
			msgs = basicSetParentProviderCommunicator(newParentProviderCommunicator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR,
					newParentProviderCommunicator, newParentProviderCommunicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceCommunicator getParentRequirereeCommunicator() {
		if (parentRequirereeCommunicator != null && parentRequirereeCommunicator.eIsProxy()) {
			InternalEObject oldParentRequirereeCommunicator = (InternalEObject) parentRequirereeCommunicator;
			parentRequirereeCommunicator = (InterfaceCommunicator) eResolveProxy(oldParentRequirereeCommunicator);
			if (parentRequirereeCommunicator != oldParentRequirereeCommunicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR,
							oldParentRequirereeCommunicator, parentRequirereeCommunicator));
			}
		}
		return parentRequirereeCommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceCommunicator basicGetParentRequirereeCommunicator() {
		return parentRequirereeCommunicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRequirereeCommunicator(InterfaceCommunicator newParentRequirereeCommunicator,
			NotificationChain msgs) {
		InterfaceCommunicator oldParentRequirereeCommunicator = parentRequirereeCommunicator;
		parentRequirereeCommunicator = newParentRequirereeCommunicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR,
					oldParentRequirereeCommunicator, newParentRequirereeCommunicator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRequirereeCommunicator(InterfaceCommunicator newParentRequirereeCommunicator) {
		if (newParentRequirereeCommunicator != parentRequirereeCommunicator) {
			NotificationChain msgs = null;
			if (parentRequirereeCommunicator != null)
				msgs = ((InternalEObject) parentRequirereeCommunicator).eInverseRemove(this,
						SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES,
						InterfaceCommunicator.class, msgs);
			if (newParentRequirereeCommunicator != null)
				msgs = ((InternalEObject) newParentRequirereeCommunicator).eInverseAdd(this,
						SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES,
						InterfaceCommunicator.class, msgs);
			msgs = basicSetParentRequirereeCommunicator(newParentRequirereeCommunicator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR,
					newParentRequirereeCommunicator, newParentRequirereeCommunicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR:
			if (parentProviderCommunicator != null)
				msgs = ((InternalEObject) parentProviderCommunicator).eInverseRemove(this,
						SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES,
						InterfaceCommunicator.class, msgs);
			return basicSetParentProviderCommunicator((InterfaceCommunicator) otherEnd, msgs);
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			if (parentRequirereeCommunicator != null)
				msgs = ((InternalEObject) parentRequirereeCommunicator).eInverseRemove(this,
						SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES,
						InterfaceCommunicator.class, msgs);
			return basicSetParentRequirereeCommunicator((InterfaceCommunicator) otherEnd, msgs);
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
			return basicSetParentProviderCommunicator(null, msgs);
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			return basicSetParentRequirereeCommunicator(null, msgs);
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
			if (resolve)
				return getParentProviderCommunicator();
			return basicGetParentProviderCommunicator();
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			if (resolve)
				return getParentRequirereeCommunicator();
			return basicGetParentRequirereeCommunicator();
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
			setParentProviderCommunicator((InterfaceCommunicator) newValue);
			return;
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			setParentRequirereeCommunicator((InterfaceCommunicator) newValue);
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
			setParentProviderCommunicator((InterfaceCommunicator) null);
			return;
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			setParentRequirereeCommunicator((InterfaceCommunicator) null);
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
			return parentProviderCommunicator != null;
		case SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR:
			return parentRequirereeCommunicator != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
