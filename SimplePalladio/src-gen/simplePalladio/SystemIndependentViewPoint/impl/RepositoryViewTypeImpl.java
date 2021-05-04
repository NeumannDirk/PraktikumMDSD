/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement;
import simplePalladio.SystemIndependentViewPoint.RepositoryViewType;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.RepositoryViewTypeImpl#getRepositoryElements <em>Repository Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryViewTypeImpl extends MinimalEObjectImpl.Container implements RepositoryViewType {
	/**
	 * The cached value of the '{@link #getRepositoryElements() <em>Repository Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRepositoryElement> repositoryElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.REPOSITORY_VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractRepositoryElement> getRepositoryElements() {
		if (repositoryElements == null) {
			repositoryElements = new EObjectContainmentEList<AbstractRepositoryElement>(AbstractRepositoryElement.class,
					this, SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS);
		}
		return repositoryElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS:
			return ((InternalEList<?>) getRepositoryElements()).basicRemove(otherEnd, msgs);
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
		case SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS:
			return getRepositoryElements();
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
		case SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS:
			getRepositoryElements().clear();
			getRepositoryElements().addAll((Collection<? extends AbstractRepositoryElement>) newValue);
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
		case SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS:
			getRepositoryElements().clear();
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
		case SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS:
			return repositoryElements != null && !repositoryElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryViewTypeImpl
