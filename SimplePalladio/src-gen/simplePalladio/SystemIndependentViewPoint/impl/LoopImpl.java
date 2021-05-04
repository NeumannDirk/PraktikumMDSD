/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simplePalladio.SystemIndependentViewPoint.BehaviorElement;
import simplePalladio.SystemIndependentViewPoint.Loop;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.LoopImpl#getBehaviorElements <em>Behavior Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends BehaviorElementImpl implements Loop {
	/**
	 * The cached value of the '{@link #getBehaviorElements() <em>Behavior Elements</em>}' reference list.
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
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorElement> getBehaviorElements() {
		if (behaviorElements == null) {
			behaviorElements = new EObjectResolvingEList<BehaviorElement>(BehaviorElement.class, this,
					SystemIndependentViewPointPackage.LOOP__BEHAVIOR_ELEMENTS);
		}
		return behaviorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.LOOP__BEHAVIOR_ELEMENTS:
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
		case SystemIndependentViewPointPackage.LOOP__BEHAVIOR_ELEMENTS:
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
		case SystemIndependentViewPointPackage.LOOP__BEHAVIOR_ELEMENTS:
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
		case SystemIndependentViewPointPackage.LOOP__BEHAVIOR_ELEMENTS:
			return behaviorElements != null && !behaviorElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
