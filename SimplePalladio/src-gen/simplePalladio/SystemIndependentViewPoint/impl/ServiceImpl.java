/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simplePalladio.SystemIndependentViewPoint.BehaviourDescription;
import simplePalladio.SystemIndependentViewPoint.Component;
import simplePalladio.SystemIndependentViewPoint.Service;
import simplePalladio.SystemIndependentViewPoint.Signature;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.ServiceImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.ServiceImpl#getBehaviourDescription <em>Behaviour Description</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.ServiceImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature signature;

	/**
	 * The cached value of the '{@link #getBehaviourDescription() <em>Behaviour Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourDescription()
	 * @generated
	 * @ordered
	 */
	protected BehaviourDescription behaviourDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject) signature;
			signature = (Signature) eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SystemIndependentViewPointPackage.SERVICE__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Signature newSignature) {
		Signature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemIndependentViewPointPackage.SERVICE__SIGNATURE,
					oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourDescription getBehaviourDescription() {
		return behaviourDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviourDescription(BehaviourDescription newBehaviourDescription,
			NotificationChain msgs) {
		BehaviourDescription oldBehaviourDescription = behaviourDescription;
		behaviourDescription = newBehaviourDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION, oldBehaviourDescription,
					newBehaviourDescription);
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
	public void setBehaviourDescription(BehaviourDescription newBehaviourDescription) {
		if (newBehaviourDescription != behaviourDescription) {
			NotificationChain msgs = null;
			if (behaviourDescription != null)
				msgs = ((InternalEObject) behaviourDescription).eInverseRemove(this,
						SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE, BehaviourDescription.class,
						msgs);
			if (newBehaviourDescription != null)
				msgs = ((InternalEObject) newBehaviourDescription).eInverseAdd(this,
						SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE, BehaviourDescription.class,
						msgs);
			msgs = basicSetBehaviourDescription(newBehaviourDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION, newBehaviourDescription,
					newBehaviourDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (eContainerFeatureID() != SystemIndependentViewPointPackage.SERVICE__COMPONENT)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newComponent, SystemIndependentViewPointPackage.SERVICE__COMPONENT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer()
				|| (eContainerFeatureID() != SystemIndependentViewPointPackage.SERVICE__COMPONENT
						&& newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject) newComponent).eInverseAdd(this,
						SystemIndependentViewPointPackage.COMPONENT__SERVICES, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemIndependentViewPointPackage.SERVICE__COMPONENT,
					newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION:
			if (behaviourDescription != null)
				msgs = ((InternalEObject) behaviourDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION, null,
						msgs);
			return basicSetBehaviourDescription((BehaviourDescription) otherEnd, msgs);
		case SystemIndependentViewPointPackage.SERVICE__COMPONENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetComponent((Component) otherEnd, msgs);
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
		case SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION:
			return basicSetBehaviourDescription(null, msgs);
		case SystemIndependentViewPointPackage.SERVICE__COMPONENT:
			return basicSetComponent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SystemIndependentViewPointPackage.SERVICE__COMPONENT:
			return eInternalContainer().eInverseRemove(this, SystemIndependentViewPointPackage.COMPONENT__SERVICES,
					Component.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.SERVICE__SIGNATURE:
			if (resolve)
				return getSignature();
			return basicGetSignature();
		case SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION:
			return getBehaviourDescription();
		case SystemIndependentViewPointPackage.SERVICE__COMPONENT:
			return getComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.SERVICE__SIGNATURE:
			setSignature((Signature) newValue);
			return;
		case SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION:
			setBehaviourDescription((BehaviourDescription) newValue);
			return;
		case SystemIndependentViewPointPackage.SERVICE__COMPONENT:
			setComponent((Component) newValue);
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
		case SystemIndependentViewPointPackage.SERVICE__SIGNATURE:
			setSignature((Signature) null);
			return;
		case SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION:
			setBehaviourDescription((BehaviourDescription) null);
			return;
		case SystemIndependentViewPointPackage.SERVICE__COMPONENT:
			setComponent((Component) null);
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
		case SystemIndependentViewPointPackage.SERVICE__SIGNATURE:
			return signature != null;
		case SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION:
			return behaviourDescription != null;
		case SystemIndependentViewPointPackage.SERVICE__COMPONENT:
			return getComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
