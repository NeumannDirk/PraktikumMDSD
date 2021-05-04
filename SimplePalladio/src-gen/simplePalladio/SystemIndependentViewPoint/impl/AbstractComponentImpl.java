/**
 */
package simplePalladio.SystemIndependentViewPoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplePalladio.SystemIndependentViewPoint.AbstractComponent;
import simplePalladio.SystemIndependentViewPoint.Interface;
import simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.AbstractComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.impl.AbstractComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComponentImpl extends AbstractRepositoryElementImpl implements AbstractComponent {
	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemIndependentViewPointPackage.Literals.ABSTRACT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this,
					SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this,
					SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES,
					SystemIndependentViewPointPackage.INTERFACE__PARENT_PROVIDER_COMMUNICATOR);
		}
		return providedInterfaces;
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
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredInterfaces()).basicAdd(otherEnd,
					msgs);
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidedInterfaces()).basicAdd(otherEnd,
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
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES:
			return ((InternalEList<?>) getRequiredInterfaces()).basicRemove(otherEnd, msgs);
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES:
			return ((InternalEList<?>) getProvidedInterfaces()).basicRemove(otherEnd, msgs);
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
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES:
			return getRequiredInterfaces();
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES:
			return getProvidedInterfaces();
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
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES:
			getRequiredInterfaces().clear();
			getRequiredInterfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES:
			getProvidedInterfaces().clear();
			getProvidedInterfaces().addAll((Collection<? extends Interface>) newValue);
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
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES:
			getRequiredInterfaces().clear();
			return;
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES:
			getProvidedInterfaces().clear();
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
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES:
			return requiredInterfaces != null && !requiredInterfaces.isEmpty();
		case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES:
			return providedInterfaces != null && !providedInterfaces.isEmpty();
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
		if (baseClass == InterfaceCommunicator.class) {
			switch (derivedFeatureID) {
			case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES:
				return SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES;
			case SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES:
				return SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES;
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
		if (baseClass == InterfaceCommunicator.class) {
			switch (baseFeatureID) {
			case SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES:
				return SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__REQUIRED_INTERFACES;
			case SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES:
				return SystemIndependentViewPointPackage.ABSTRACT_COMPONENT__PROVIDED_INTERFACES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractComponentImpl
