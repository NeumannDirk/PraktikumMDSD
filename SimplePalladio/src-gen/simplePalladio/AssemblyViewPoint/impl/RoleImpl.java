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

import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.Role;

import simplePalladio.Common.CommonPackage;
import simplePalladio.Common.NamedElement;
import simplePalladio.SystemIndependentViewPoint.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl#getParentProviderAssemblyContext <em>Parent Provider Assembly Context</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl#getFromAssemblyConnectors <em>From Assembly Connectors</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl#getParentRequirereeAssemblyContext <em>Parent Requireree Assembly Context</em>}</li>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl#getToAssemblyConnector <em>To Assembly Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends AbstractSystemElementImpl implements Role {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentProviderAssemblyContext() <em>Parent Provider Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProviderAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext parentProviderAssemblyContext;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * The cached value of the '{@link #getFromAssemblyConnectors() <em>From Assembly Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAssemblyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> fromAssemblyConnectors;

	/**
	 * The cached value of the '{@link #getParentRequirereeAssemblyContext() <em>Parent Requireree Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRequirereeAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext parentRequirereeAssemblyContext;

	/**
	 * The cached value of the '{@link #getToAssemblyConnector() <em>To Assembly Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAssemblyConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyConnector> toAssemblyConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyViewPointPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyViewPointPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getParentProviderAssemblyContext() {
		if (parentProviderAssemblyContext != null && parentProviderAssemblyContext.eIsProxy()) {
			InternalEObject oldParentProviderAssemblyContext = (InternalEObject) parentProviderAssemblyContext;
			parentProviderAssemblyContext = (AssemblyContext) eResolveProxy(oldParentProviderAssemblyContext);
			if (parentProviderAssemblyContext != oldParentProviderAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT,
							oldParentProviderAssemblyContext, parentProviderAssemblyContext));
			}
		}
		return parentProviderAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetParentProviderAssemblyContext() {
		return parentProviderAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentProviderAssemblyContext(AssemblyContext newParentProviderAssemblyContext,
			NotificationChain msgs) {
		AssemblyContext oldParentProviderAssemblyContext = parentProviderAssemblyContext;
		parentProviderAssemblyContext = newParentProviderAssemblyContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT, oldParentProviderAssemblyContext,
					newParentProviderAssemblyContext);
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
	public void setParentProviderAssemblyContext(AssemblyContext newParentProviderAssemblyContext) {
		if (newParentProviderAssemblyContext != parentProviderAssemblyContext) {
			NotificationChain msgs = null;
			if (parentProviderAssemblyContext != null)
				msgs = ((InternalEObject) parentProviderAssemblyContext).eInverseRemove(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES, AssemblyContext.class, msgs);
			if (newParentProviderAssemblyContext != null)
				msgs = ((InternalEObject) newParentProviderAssemblyContext).eInverseAdd(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES, AssemblyContext.class, msgs);
			msgs = basicSetParentProviderAssemblyContext(newParentProviderAssemblyContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT, newParentProviderAssemblyContext,
					newParentProviderAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject) interface_;
			interface_ = (Interface) eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyViewPointPackage.ROLE__INTERFACE,
							oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyViewPointPackage.ROLE__INTERFACE,
					oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyConnector> getFromAssemblyConnectors() {
		if (fromAssemblyConnectors == null) {
			fromAssemblyConnectors = new EObjectWithInverseResolvingEList<AssemblyConnector>(AssemblyConnector.class,
					this, AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS,
					AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE);
		}
		return fromAssemblyConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getParentRequirereeAssemblyContext() {
		if (parentRequirereeAssemblyContext != null && parentRequirereeAssemblyContext.eIsProxy()) {
			InternalEObject oldParentRequirereeAssemblyContext = (InternalEObject) parentRequirereeAssemblyContext;
			parentRequirereeAssemblyContext = (AssemblyContext) eResolveProxy(oldParentRequirereeAssemblyContext);
			if (parentRequirereeAssemblyContext != oldParentRequirereeAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT,
							oldParentRequirereeAssemblyContext, parentRequirereeAssemblyContext));
			}
		}
		return parentRequirereeAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetParentRequirereeAssemblyContext() {
		return parentRequirereeAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRequirereeAssemblyContext(AssemblyContext newParentRequirereeAssemblyContext,
			NotificationChain msgs) {
		AssemblyContext oldParentRequirereeAssemblyContext = parentRequirereeAssemblyContext;
		parentRequirereeAssemblyContext = newParentRequirereeAssemblyContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT,
					oldParentRequirereeAssemblyContext, newParentRequirereeAssemblyContext);
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
	public void setParentRequirereeAssemblyContext(AssemblyContext newParentRequirereeAssemblyContext) {
		if (newParentRequirereeAssemblyContext != parentRequirereeAssemblyContext) {
			NotificationChain msgs = null;
			if (parentRequirereeAssemblyContext != null)
				msgs = ((InternalEObject) parentRequirereeAssemblyContext).eInverseRemove(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES, AssemblyContext.class, msgs);
			if (newParentRequirereeAssemblyContext != null)
				msgs = ((InternalEObject) newParentRequirereeAssemblyContext).eInverseAdd(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES, AssemblyContext.class, msgs);
			msgs = basicSetParentRequirereeAssemblyContext(newParentRequirereeAssemblyContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT,
					newParentRequirereeAssemblyContext, newParentRequirereeAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyConnector> getToAssemblyConnector() {
		if (toAssemblyConnector == null) {
			toAssemblyConnector = new EObjectWithInverseResolvingEList<AssemblyConnector>(AssemblyConnector.class, this,
					AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR,
					AssemblyViewPointPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE);
		}
		return toAssemblyConnector;
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
		case AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT:
			if (parentProviderAssemblyContext != null)
				msgs = ((InternalEObject) parentProviderAssemblyContext).eInverseRemove(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLES, AssemblyContext.class, msgs);
			return basicSetParentProviderAssemblyContext((AssemblyContext) otherEnd, msgs);
		case AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFromAssemblyConnectors()).basicAdd(otherEnd,
					msgs);
		case AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT:
			if (parentRequirereeAssemblyContext != null)
				msgs = ((InternalEObject) parentRequirereeAssemblyContext).eInverseRemove(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLES, AssemblyContext.class, msgs);
			return basicSetParentRequirereeAssemblyContext((AssemblyContext) otherEnd, msgs);
		case AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getToAssemblyConnector()).basicAdd(otherEnd,
					msgs);
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
		case AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT:
			return basicSetParentProviderAssemblyContext(null, msgs);
		case AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS:
			return ((InternalEList<?>) getFromAssemblyConnectors()).basicRemove(otherEnd, msgs);
		case AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT:
			return basicSetParentRequirereeAssemblyContext(null, msgs);
		case AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR:
			return ((InternalEList<?>) getToAssemblyConnector()).basicRemove(otherEnd, msgs);
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
		case AssemblyViewPointPackage.ROLE__NAME:
			return getName();
		case AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT:
			if (resolve)
				return getParentProviderAssemblyContext();
			return basicGetParentProviderAssemblyContext();
		case AssemblyViewPointPackage.ROLE__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
		case AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS:
			return getFromAssemblyConnectors();
		case AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT:
			if (resolve)
				return getParentRequirereeAssemblyContext();
			return basicGetParentRequirereeAssemblyContext();
		case AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR:
			return getToAssemblyConnector();
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
		case AssemblyViewPointPackage.ROLE__NAME:
			setName((String) newValue);
			return;
		case AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT:
			setParentProviderAssemblyContext((AssemblyContext) newValue);
			return;
		case AssemblyViewPointPackage.ROLE__INTERFACE:
			setInterface((Interface) newValue);
			return;
		case AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS:
			getFromAssemblyConnectors().clear();
			getFromAssemblyConnectors().addAll((Collection<? extends AssemblyConnector>) newValue);
			return;
		case AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT:
			setParentRequirereeAssemblyContext((AssemblyContext) newValue);
			return;
		case AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR:
			getToAssemblyConnector().clear();
			getToAssemblyConnector().addAll((Collection<? extends AssemblyConnector>) newValue);
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
		case AssemblyViewPointPackage.ROLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT:
			setParentProviderAssemblyContext((AssemblyContext) null);
			return;
		case AssemblyViewPointPackage.ROLE__INTERFACE:
			setInterface((Interface) null);
			return;
		case AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS:
			getFromAssemblyConnectors().clear();
			return;
		case AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT:
			setParentRequirereeAssemblyContext((AssemblyContext) null);
			return;
		case AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR:
			getToAssemblyConnector().clear();
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
		case AssemblyViewPointPackage.ROLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AssemblyViewPointPackage.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT:
			return parentProviderAssemblyContext != null;
		case AssemblyViewPointPackage.ROLE__INTERFACE:
			return interface_ != null;
		case AssemblyViewPointPackage.ROLE__FROM_ASSEMBLY_CONNECTORS:
			return fromAssemblyConnectors != null && !fromAssemblyConnectors.isEmpty();
		case AssemblyViewPointPackage.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT:
			return parentRequirereeAssemblyContext != null;
		case AssemblyViewPointPackage.ROLE__TO_ASSEMBLY_CONNECTOR:
			return toAssemblyConnector != null && !toAssemblyConnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case AssemblyViewPointPackage.ROLE__NAME:
				return CommonPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case CommonPackage.NAMED_ELEMENT__NAME:
				return AssemblyViewPointPackage.ROLE__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
