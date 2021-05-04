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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import simplePalladio.SystemIndependentViewPoint.BehaviorElement;
import simplePalladio.SystemIndependentViewPoint.BehaviourDescription;
import simplePalladio.SystemIndependentViewPoint.Service;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.BehaviourDescriptionImpl#getBehaviorElements <em>Behavior Elements</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.BehaviourDescriptionImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourDescriptionImpl extends MinimalEObjectImpl.Container implements BehaviourDescription {
	/**
	 * The cached value of the '{@link #getBehaviorElements() <em>Behavior Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorElement> behaviorElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.BEHAVIOUR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorElement> getBehaviorElements() {
		if (behaviorElements == null) {
			behaviorElements = new EObjectContainmentWithInverseEList<BehaviorElement>(BehaviorElement.class, this,
					SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS,
					SystemIndependentViewPointPackage.BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION);
		}
		return behaviorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (eContainerFeatureID() != SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE)
			return null;
		return (Service) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newService,
				SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		if (newService != eInternalContainer()
				|| (eContainerFeatureID() != SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE
						&& newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject) newService).eInverseAdd(this,
						SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE, newService, newService));
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
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBehaviorElements()).basicAdd(otherEnd, msgs);
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetService((Service) otherEnd, msgs);
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
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS:
			return ((InternalEList<?>) getBehaviorElements()).basicRemove(otherEnd, msgs);
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE:
			return basicSetService(null, msgs);
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
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE:
			return eInternalContainer().eInverseRemove(this,
					SystemIndependentViewPointPackage.SERVICE__BEHAVIOUR_DESCRIPTION, Service.class, msgs);
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
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS:
			return getBehaviorElements();
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE:
			return getService();
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
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS:
			getBehaviorElements().clear();
			getBehaviorElements().addAll((Collection<? extends BehaviorElement>) newValue);
			return;
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE:
			setService((Service) newValue);
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
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS:
			getBehaviorElements().clear();
			return;
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE:
			setService((Service) null);
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
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS:
			return behaviorElements != null && !behaviorElements.isEmpty();
		case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION__SERVICE:
			return getService() != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviourDescriptionImpl
