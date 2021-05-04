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

import simplePalladio.DeploymentViewPoint.AbstractEnvironmentElement;
import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;
import simplePalladio.DeploymentViewPoint.EnvironmentViewType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.DeploymentViewPoint.impl.EnvironmentViewTypeImpl#getEnvironmentElements <em>Environment Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentViewTypeImpl extends MinimalEObjectImpl.Container implements EnvironmentViewType {
	/**
	 * The cached value of the '{@link #getEnvironmentElements() <em>Environment Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEnvironmentElement> environmentElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentViewPointPackage.Literals.ENVIRONMENT_VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEnvironmentElement> getEnvironmentElements() {
		if (environmentElements == null) {
			environmentElements = new EObjectContainmentEList<AbstractEnvironmentElement>(
					AbstractEnvironmentElement.class, this,
					DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS);
		}
		return environmentElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS:
			return ((InternalEList<?>) getEnvironmentElements()).basicRemove(otherEnd, msgs);
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
		case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS:
			return getEnvironmentElements();
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
		case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS:
			getEnvironmentElements().clear();
			getEnvironmentElements().addAll((Collection<? extends AbstractEnvironmentElement>) newValue);
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
		case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS:
			getEnvironmentElements().clear();
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
		case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS:
			return environmentElements != null && !environmentElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentViewTypeImpl
