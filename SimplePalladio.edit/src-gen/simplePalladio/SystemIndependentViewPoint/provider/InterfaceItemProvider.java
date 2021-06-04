/**
 */
package simplePalladio.SystemIndependentViewPoint.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import simplePalladio.SystemIndependentViewPoint.Interface;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * This is the item provider adapter for a {@link simplePalladio.SystemIndependentViewPoint.Interface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceItemProvider extends AbstractRepositoryElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSignaturesPropertyDescriptor(object);
			addParentProviderCommunicatorPropertyDescriptor(object);
			addParentRequirereeCommunicatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Signatures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Interface_signatures_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Interface_signatures_feature",
								"_UI_Interface_type"),
						SystemIndependentViewPointPackage.Literals.INTERFACE__SIGNATURES, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Parent Provider Communicator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentProviderCommunicatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Interface_parentProviderCommunicator_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Interface_parentProviderCommunicator_feature", "_UI_Interface_type"),
						SystemIndependentViewPointPackage.Literals.INTERFACE__PARENT_PROVIDER_COMMUNICATOR, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Parent Requireree Communicator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentRequirereeCommunicatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Interface_parentRequirereeCommunicator_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Interface_parentRequirereeCommunicator_feature", "_UI_Interface_type"),
						SystemIndependentViewPointPackage.Literals.INTERFACE__PARENT_REQUIREREE_COMMUNICATOR, true,
						false, true, null, null, null));
	}

	/**
	 * This returns Interface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interface"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interface) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Interface_type")
				: getString("_UI_Interface_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
