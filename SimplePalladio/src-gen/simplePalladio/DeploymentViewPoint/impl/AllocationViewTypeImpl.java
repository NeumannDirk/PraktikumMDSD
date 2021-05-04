/**
 */
package simplePalladio.DeploymentViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplePalladio.DeploymentViewPoint.AllocationContext;
import simplePalladio.DeploymentViewPoint.AllocationViewType;
import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.impl.AllocationViewTypeImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationViewTypeImpl extends MinimalEObjectImpl.Container implements AllocationViewType {
	/**
	 * The cached value of the '{@link #getAllocationContexts() <em>Allocation Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationContext> allocationContexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentViewPointPackage.Literals.ALLOCATION_VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationContext> getAllocationContexts() {
		if (allocationContexts == null) {
			allocationContexts = new EObjectContainmentEList<AllocationContext>(AllocationContext.class, this,
					DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS);
		}
		return allocationContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS:
			return ((InternalEList<?>) getAllocationContexts()).basicRemove(otherEnd, msgs);
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
		case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS:
			return getAllocationContexts();
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
		case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS:
			getAllocationContexts().clear();
			getAllocationContexts().addAll((Collection<? extends AllocationContext>) newValue);
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
		case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS:
			getAllocationContexts().clear();
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
		case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS:
			return allocationContexts != null && !allocationContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationViewTypeImpl
