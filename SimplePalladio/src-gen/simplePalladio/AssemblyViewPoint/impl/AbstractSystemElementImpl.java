/**
 */
package simplePalladio.AssemblyViewPoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simplePalladio.AssemblyViewPoint.AbstractSystemElement;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract System Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AbstractSystemElementImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractSystemElementImpl extends MinimalEObjectImpl.Container implements AbstractSystemElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSystemElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyViewPointPackage.Literals.ABSTRACT_SYSTEM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplePalladio.AssemblyViewPoint.System getSystem() {
		if (eContainerFeatureID() != AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM)
			return null;
		return (simplePalladio.AssemblyViewPoint.System) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(simplePalladio.AssemblyViewPoint.System newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSystem, AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(simplePalladio.AssemblyViewPoint.System newSystem) {
		if (newSystem != eInternalContainer()
				|| (eContainerFeatureID() != AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM
						&& newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject) newSystem).eInverseAdd(this, AssemblyViewPointPackage.SYSTEM__SYSTEM_ELEMENTS,
						simplePalladio.AssemblyViewPoint.System.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSystem((simplePalladio.AssemblyViewPoint.System) otherEnd, msgs);
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
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM:
			return basicSetSystem(null, msgs);
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
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM:
			return eInternalContainer().eInverseRemove(this, AssemblyViewPointPackage.SYSTEM__SYSTEM_ELEMENTS,
					simplePalladio.AssemblyViewPoint.System.class, msgs);
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
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM:
			return getSystem();
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
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM:
			setSystem((simplePalladio.AssemblyViewPoint.System) newValue);
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
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM:
			setSystem((simplePalladio.AssemblyViewPoint.System) null);
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
		case AssemblyViewPointPackage.ABSTRACT_SYSTEM_ELEMENT__SYSTEM:
			return getSystem() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractSystemElementImpl
