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

import simplePalladio.SystemIndependentViewPoint.BehaviorElement;
import simplePalladio.SystemIndependentViewPoint.BehaviourDescription;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.BehaviorElementImpl#getBehaviourDescription <em>Behaviour Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehaviorElementImpl extends MinimalEObjectImpl.Container implements BehaviorElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.BEHAVIOR_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourDescription getBehaviourDescription() {
		if (eContainerFeatureID() != SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION)
			return null;
		return (BehaviourDescription) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviourDescription(BehaviourDescription newBehaviourDescription,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBehaviourDescription,
				SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviourDescription(BehaviourDescription newBehaviourDescription) {
		if (newBehaviourDescription != eInternalContainer()
				|| (eContainerFeatureID() != SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION
						&& newBehaviourDescription != null)) {
			if (EcoreUtil.isAncestor(this, newBehaviourDescription))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBehaviourDescription != null)
				msgs = ((InternalEObject) newBehaviourDescription).eInverseAdd(this,
						SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS,
						BehaviourDescription.class, msgs);
			msgs = basicSetBehaviourDescription(newBehaviourDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION, newBehaviourDescription,
					newBehaviourDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBehaviourDescription((BehaviourDescription) otherEnd, msgs);
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
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION:
			return basicSetBehaviourDescription(null, msgs);
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
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION:
			return eInternalContainer().eInverseRemove(this,
					SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS,
					BehaviourDescription.class, msgs);
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
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION:
			return getBehaviourDescription();
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
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION:
			setBehaviourDescription((BehaviourDescription) newValue);
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
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION:
			setBehaviourDescription((BehaviourDescription) null);
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
		case SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION:
			return getBehaviourDescription() != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorElementImpl
