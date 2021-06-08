/**
 */
package simplePalladio.AssemblyViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.Role;
import simplePalladio.DeploymentViewPoint.AllocationContext;
import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;

import simplePalladio.SystemIndependentViewPoint.AbstractComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl#getAllocationContext <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends AbstractSystemElementImpl implements AssemblyContext {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected AbstractComponent component;

	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> providedRoles;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> requiredRoles;

	/**
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected AllocationContext allocationContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyViewPointPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (AbstractComponent) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AssemblyViewPointPackage.ASSEMBLY_CONTEXT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(AbstractComponent newComponent) {
		AbstractComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyViewPointPackage.ASSEMBLY_CONTEXT__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectWithInverseResolvingEList<Role>(Role.class, this,
					AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES,
					AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRequiredRoles() {
		if (requiredRoles == null) {
			requiredRoles = new EObjectWithInverseResolvingEList<Role>(Role.class, this,
					AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES,
					AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT);
		}
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext getAllocationContext() {
		if (allocationContext != null && allocationContext.eIsProxy()) {
			InternalEObject oldAllocationContext = (InternalEObject) allocationContext;
			allocationContext = (AllocationContext) eResolveProxy(oldAllocationContext);
			if (allocationContext != oldAllocationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext,
							allocationContext));
			}
		}
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext basicGetAllocationContext() {
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationContext(AllocationContext newAllocationContext, NotificationChain msgs) {
		AllocationContext oldAllocationContext = allocationContext;
		allocationContext = newAllocationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext,
					newAllocationContext);
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
	public void setAllocationContext(AllocationContext newAllocationContext) {
		if (newAllocationContext != allocationContext) {
			NotificationChain msgs = null;
			if (allocationContext != null)
				msgs = ((InternalEObject) allocationContext).eInverseRemove(this,
						DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY, AllocationContext.class, msgs);
			if (newAllocationContext != null)
				msgs = ((InternalEObject) newAllocationContext).eInverseAdd(this,
						DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY, AllocationContext.class, msgs);
			msgs = basicSetAllocationContext(newAllocationContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, newAllocationContext,
					newAllocationContext));
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
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidedRoles()).basicAdd(otherEnd, msgs);
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredRoles()).basicAdd(otherEnd, msgs);
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			if (allocationContext != null)
				msgs = ((InternalEObject) allocationContext).eInverseRemove(this,
						DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY, AllocationContext.class, msgs);
			return basicSetAllocationContext((AllocationContext) otherEnd, msgs);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return ((InternalEList<?>) getProvidedRoles()).basicRemove(otherEnd, msgs);
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return ((InternalEList<?>) getRequiredRoles()).basicRemove(otherEnd, msgs);
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			return basicSetAllocationContext(null, msgs);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return getProvidedRoles();
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return getRequiredRoles();
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			if (resolve)
				return getAllocationContext();
			return basicGetAllocationContext();
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
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__COMPONENT:
			setComponent((AbstractComponent) newValue);
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			getProvidedRoles().clear();
			getProvidedRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			getRequiredRoles().clear();
			getRequiredRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			setAllocationContext((AllocationContext) newValue);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__COMPONENT:
			setComponent((AbstractComponent) null);
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			getProvidedRoles().clear();
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			getRequiredRoles().clear();
			return;
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			setAllocationContext((AllocationContext) null);
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
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__COMPONENT:
			return component != null;
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES:
			return providedRoles != null && !providedRoles.isEmpty();
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES:
			return requiredRoles != null && !requiredRoles.isEmpty();
		case AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
			return allocationContext != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyContextImpl
