/**
 */
package simplePalladio.AssemblyViewPoint.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;

/**
 * This is the item provider adapter for a {@link simplePalladio.AssemblyViewPoint.AssemblyContext} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyContextItemProvider extends AbstractSystemElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContextItemProvider(AdapterFactory adapterFactory) {
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

			addComponentPropertyDescriptor(object);
			addProvidedRolesPropertyDescriptor(object);
			addRequiredRolesPropertyDescriptor(object);
			addAllocationContextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssemblyContext_component_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AssemblyContext_component_feature",
						"_UI_AssemblyContext_type"),
				AssemblyViewPointPackage.Literals.ASSEMBLY_CONTEXT__COMPONENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Provided Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssemblyContext_providedRoles_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AssemblyContext_providedRoles_feature",
						"_UI_AssemblyContext_type"),
				AssemblyViewPointPackage.Literals.ASSEMBLY_CONTEXT__PROVIDED_ROLES, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Required Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AssemblyContext_requiredRoles_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AssemblyContext_requiredRoles_feature",
						"_UI_AssemblyContext_type"),
				AssemblyViewPointPackage.Literals.ASSEMBLY_CONTEXT__REQUIRED_ROLES, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Allocation Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocationContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AssemblyContext_allocationContext_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AssemblyContext_allocationContext_feature",
								"_UI_AssemblyContext_type"),
						AssemblyViewPointPackage.Literals.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, true, false, true, null,
						null, null));
	}

	/**
	 * This returns AssemblyContext.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssemblyContext"));
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
		String label = ((AssemblyContext) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AssemblyContext_type")
				: getString("_UI_AssemblyContext_type") + " " + label;
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
