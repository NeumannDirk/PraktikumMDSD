/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import simplePalladio.SystemIndependentViewPoint.BehaviorElement;
import simplePalladio.SystemIndependentViewPoint.Branch;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.BranchImpl#getBehaviorElements <em>Behavior Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchImpl extends BehaviorElementImpl implements Branch {
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
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorElement> getBehaviorElements() {
		if (behaviorElements == null) {
			behaviorElements = new EObjectContainmentEList<BehaviorElement>(BehaviorElement.class, this,
					SystemIndependentViewPointPackage.BRANCH__BEHAVIOR_ELEMENTS);
		}
		return behaviorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.BRANCH__BEHAVIOR_ELEMENTS:
			return ((InternalEList<?>) getBehaviorElements()).basicRemove(otherEnd, msgs);
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
		case SystemIndependentViewPointPackage.BRANCH__BEHAVIOR_ELEMENTS:
			return getBehaviorElements();
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
		case SystemIndependentViewPointPackage.BRANCH__BEHAVIOR_ELEMENTS:
			getBehaviorElements().clear();
			getBehaviorElements().addAll((Collection<? extends BehaviorElement>) newValue);
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
		case SystemIndependentViewPointPackage.BRANCH__BEHAVIOR_ELEMENTS:
			getBehaviorElements().clear();
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
		case SystemIndependentViewPointPackage.BRANCH__BEHAVIOR_ELEMENTS:
			return behaviorElements != null && !behaviorElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BranchImpl
