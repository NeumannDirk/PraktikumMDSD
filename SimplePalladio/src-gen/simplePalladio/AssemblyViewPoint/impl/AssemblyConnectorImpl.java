/**
 */
package simplePalladio.AssemblyViewPoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AssemblyConnectorImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AssemblyConnectorImpl#getRequiredRole <em>Required Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends AbstractConnectorImpl implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected Role providedRole;

	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected Role requiredRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject) providedRole;
			providedRole = (Role) eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedRole(Role newProvidedRole, NotificationChain msgs) {
		Role oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, newProvidedRole);
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
	public void setProvidedRole(Role newProvidedRole) {
		if (newProvidedRole != providedRole) {
			NotificationChain msgs = null;
			if (providedRole != null)
				msgs = ((InternalEObject) providedRole).eInverseRemove(this,
						AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR, Role.class, msgs);
			if (newProvidedRole != null)
				msgs = ((InternalEObject) newProvidedRole).eInverseAdd(this,
						AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR, Role.class, msgs);
			msgs = basicSetProvidedRole(newProvidedRole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, newProvidedRole, newProvidedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRequiredRole() {
		if (requiredRole != null && requiredRole.eIsProxy()) {
			InternalEObject oldRequiredRole = (InternalEObject) requiredRole;
			requiredRole = (Role) eResolveProxy(oldRequiredRole);
			if (requiredRole != oldRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
			}
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredRole(Role newRequiredRole, NotificationChain msgs) {
		Role oldRequiredRole = requiredRole;
		requiredRole = newRequiredRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, newRequiredRole);
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
	public void setRequiredRole(Role newRequiredRole) {
		if (newRequiredRole != requiredRole) {
			NotificationChain msgs = null;
			if (requiredRole != null)
				msgs = ((InternalEObject) requiredRole).eInverseRemove(this,
						AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS, Role.class, msgs);
			if (newRequiredRole != null)
				msgs = ((InternalEObject) newRequiredRole).eInverseAdd(this,
						AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS, Role.class, msgs);
			msgs = basicSetRequiredRole(newRequiredRole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, newRequiredRole, newRequiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			if (providedRole != null)
				msgs = ((InternalEObject) providedRole).eInverseRemove(this,
						AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR, Role.class, msgs);
			return basicSetProvidedRole((Role) otherEnd, msgs);
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			if (requiredRole != null)
				msgs = ((InternalEObject) requiredRole).eInverseRemove(this,
						AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS, Role.class, msgs);
			return basicSetRequiredRole((Role) otherEnd, msgs);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			return basicSetProvidedRole(null, msgs);
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			return basicSetRequiredRole(null, msgs);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			if (resolve)
				return getProvidedRole();
			return basicGetProvidedRole();
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			if (resolve)
				return getRequiredRole();
			return basicGetRequiredRole();
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
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			setProvidedRole((Role) newValue);
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			setRequiredRole((Role) newValue);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			setProvidedRole((Role) null);
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			setRequiredRole((Role) null);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
			return providedRole != null;
		case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
			return requiredRole != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl
