/**
 */
package simplePalladio.AssemblyViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.AssemblyViewType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.AssemblyViewPoint.impl.AssemblyViewTypeImpl#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyViewTypeImpl extends MinimalEObjectImpl.Container implements AssemblyViewType {
	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<simplePalladio.AssemblyViewPoint.System> systems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyViewPointPackage.Literals.ASSEMBLY_VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<simplePalladio.AssemblyViewPoint.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<simplePalladio.AssemblyViewPoint.System>(
					simplePalladio.AssemblyViewPoint.System.class, this,
					AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE__SYSTEMS:
			return ((InternalEList<?>) getSystems()).basicRemove(otherEnd, msgs);
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
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE__SYSTEMS:
			return getSystems();
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
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE__SYSTEMS:
			getSystems().clear();
			getSystems().addAll((Collection<? extends simplePalladio.AssemblyViewPoint.System>) newValue);
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
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE__SYSTEMS:
			getSystems().clear();
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
		case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE__SYSTEMS:
			return systems != null && !systems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyViewTypeImpl
