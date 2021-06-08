/**
 */
package simplePalladio.AssemblyViewPoint.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.Role;

/**
 * This is the item provider adapter for a {@link simplePalladio.AssemblyViewPoint.Role} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleItemProvider extends AbstractSystemElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleItemProvider(AdapterFactory adapterFactory) {
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

			addParentProviderAssemblyContextPropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
			addFromAssemblyConnectorsPropertyDescriptor(object);
			addParentRequirereeAssemblyContextPropertyDescriptor(object);
			addToAssemblyConnectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Provider Assembly Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentProviderAssemblyContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Role_parentProviderAssemblyContext_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Role_parentProviderAssemblyContext_feature",
						"_UI_Role_type"),
				AssemblyViewPointPackage.Literals.ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Role_interface_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Role_interface_feature", "_UI_Role_type"),
						AssemblyViewPointPackage.Literals.ROLE__INTERFACE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the From Assembly Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromAssemblyConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Role_fromAssemblyConnectors_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Role_fromAssemblyConnectors_feature",
								"_UI_Role_type"),
						AssemblyViewPointPackage.Literals.ROLE__FROM_ASSEMBLY_CONNECTORS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Parent Requireree Assembly Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentRequirereeAssemblyContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Role_parentRequirereeAssemblyContext_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Role_parentRequirereeAssemblyContext_feature",
						"_UI_Role_type"),
				AssemblyViewPointPackage.Literals.ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the To Assembly Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToAssemblyConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Role_toAssemblyConnector_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Role_toAssemblyConnector_feature",
								"_UI_Role_type"),
						AssemblyViewPointPackage.Literals.ROLE__TO_ASSEMBLY_CONNECTOR, true, false, true, null, null,
						null));
	}

	/**
	 * This returns Role.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Role"));
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
		String label = ((Role) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Role_type")
				: getString("_UI_Role_type") + " " + label;
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
