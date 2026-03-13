/**
 */
package raaml.stpa.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import raaml.core.CorePackage;

import raaml.core.provider.AbstractLibraryItemProvider;

import raaml.provider.RaamlEditPlugin;

import raaml.stpa.STPALibrary;
import raaml.stpa.StpaFactory;
import raaml.stpa.StpaPackage;

/**
 * This is the item provider adapter for a {@link raaml.stpa.STPALibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class STPALibraryItemProvider extends AbstractLibraryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPALibraryItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StpaPackage.Literals.STPA_LIBRARY__CONTROL_STRUCTURES);
			childrenFeatures.add(StpaPackage.Literals.STPA_LIBRARY__CONTROL_ACTIONS);
			childrenFeatures.add(StpaPackage.Literals.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns STPALibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/STPALibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((STPALibrary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_STPALibrary_type") :
			getString("_UI_STPALibrary_type") + " " + label;
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

		switch (notification.getFeatureID(STPALibrary.class)) {
			case StpaPackage.STPA_LIBRARY__CONTROL_STRUCTURES:
			case StpaPackage.STPA_LIBRARY__CONTROL_ACTIONS:
			case StpaPackage.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.STPA_LIBRARY__CONTROL_STRUCTURES,
				 StpaFactory.eINSTANCE.createControlStructure()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.STPA_LIBRARY__CONTROL_ACTIONS,
				 StpaFactory.eINSTANCE.createControlAction()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS,
				 StpaFactory.eINSTANCE.createUndesiredControlAction()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.ABSTRACT_LIBRARY__ELEMENTS ||
			childFeature == StpaPackage.Literals.STPA_LIBRARY__CONTROL_STRUCTURES ||
			childFeature == StpaPackage.Literals.STPA_LIBRARY__CONTROL_ACTIONS ||
			childFeature == StpaPackage.Literals.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RaamlEditPlugin.INSTANCE;
	}

}
