/**
 */
package simplePalladio.DeploymentViewPoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;

import simplePalladio.DeploymentViewPoint.AllocationContext;
import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.impl.AllocationContextImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link simplePalladio.DeploymentViewPoint.impl.AllocationContextImpl#getAssembly <em>Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends MinimalEObjectImpl.Container implements AllocationContext {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected simplePalladio.DeploymentViewPoint.Container container;

	/**
	 * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assembly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplePalladio.DeploymentViewPoint.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject) container;
			container = (simplePalladio.DeploymentViewPoint.Container) eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentViewPointPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplePalladio.DeploymentViewPoint.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(simplePalladio.DeploymentViewPoint.Container newContainer) {
		simplePalladio.DeploymentViewPoint.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeploymentViewPointPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssembly() {
		if (assembly != null && assembly.eIsProxy()) {
			InternalEObject oldAssembly = (InternalEObject) assembly;
			assembly = (AssemblyContext) eResolveProxy(oldAssembly);
			if (assembly != oldAssembly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY, oldAssembly, assembly));
			}
		}
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssembly() {
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssembly(AssemblyContext newAssembly, NotificationChain msgs) {
		AssemblyContext oldAssembly = assembly;
		assembly = newAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY, oldAssembly, newAssembly);
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
	public void setAssembly(AssemblyContext newAssembly) {
		if (newAssembly != assembly) {
			NotificationChain msgs = null;
			if (assembly != null)
				msgs = ((InternalEObject) assembly).eInverseRemove(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			if (newAssembly != null)
				msgs = ((InternalEObject) newAssembly).eInverseAdd(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			msgs = basicSetAssembly(newAssembly, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY, newAssembly, newAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY:
			if (assembly != null)
				msgs = ((InternalEObject) assembly).eInverseRemove(this,
						AssemblyViewPointPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			return basicSetAssembly((AssemblyContext) otherEnd, msgs);
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
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY:
			return basicSetAssembly(null, msgs);
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
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__CONTAINER:
			if (resolve)
				return getContainer();
			return basicGetContainer();
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY:
			if (resolve)
				return getAssembly();
			return basicGetAssembly();
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
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__CONTAINER:
			setContainer((simplePalladio.DeploymentViewPoint.Container) newValue);
			return;
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY:
			setAssembly((AssemblyContext) newValue);
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
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__CONTAINER:
			setContainer((simplePalladio.DeploymentViewPoint.Container) null);
			return;
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY:
			setAssembly((AssemblyContext) null);
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
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__CONTAINER:
			return container != null;
		case DeploymentViewPointPackage.ALLOCATION_CONTEXT__ASSEMBLY:
			return assembly != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl
