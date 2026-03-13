/**
 */
package raaml.hara.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import raaml.core.CorePackage;

import raaml.core.provider.AnalysisItemProvider;

import raaml.hara.HaraFactory;
import raaml.hara.HaraPackage;
import raaml.hara.ISO26262;

import raaml.provider.RaamlEditPlugin;

/**
 * This is the item provider adapter for a {@link raaml.hara.ISO26262} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ISO26262ItemProvider extends AnalysisItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO26262ItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HaraPackage.Literals.ISO26262__MALFUNCTIONING_BEHAVIORS);
			childrenFeatures.add(HaraPackage.Literals.ISO26262__OPERATIONAL_SITUATIONS);
			childrenFeatures.add(HaraPackage.Literals.ISO26262__CONFIRMED_ITEMS);
			childrenFeatures.add(HaraPackage.Literals.ISO26262__VERIFIED_ITEMS);
			childrenFeatures.add(HaraPackage.Literals.ISO26262__ASIL_ASSIGNMENTS);
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
	 * This returns ISO26262.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ISO26262"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ISO26262)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ISO26262_type") :
			getString("_UI_ISO26262_type") + " " + label;
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

		switch (notification.getFeatureID(ISO26262.class)) {
			case HaraPackage.ISO26262__MALFUNCTIONING_BEHAVIORS:
			case HaraPackage.ISO26262__OPERATIONAL_SITUATIONS:
			case HaraPackage.ISO26262__CONFIRMED_ITEMS:
			case HaraPackage.ISO26262__VERIFIED_ITEMS:
			case HaraPackage.ISO26262__ASIL_ASSIGNMENTS:
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
				(HaraPackage.Literals.ISO26262__MALFUNCTIONING_BEHAVIORS,
				 HaraFactory.eINSTANCE.createMalfunctioningBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(HaraPackage.Literals.ISO26262__OPERATIONAL_SITUATIONS,
				 HaraFactory.eINSTANCE.createOperationalSituation()));

		newChildDescriptors.add
			(createChildParameter
				(HaraPackage.Literals.ISO26262__CONFIRMED_ITEMS,
				 HaraFactory.eINSTANCE.createConfirmed()));

		newChildDescriptors.add
			(createChildParameter
				(HaraPackage.Literals.ISO26262__VERIFIED_ITEMS,
				 HaraFactory.eINSTANCE.createVerified()));

		newChildDescriptors.add
			(createChildParameter
				(HaraPackage.Literals.ISO26262__ASIL_ASSIGNMENTS,
				 HaraFactory.eINSTANCE.createASILAssignment()));
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
			childFeature == CorePackage.Literals.ANALYSIS__ELEMENTS ||
			childFeature == HaraPackage.Literals.ISO26262__OPERATIONAL_SITUATIONS ||
			childFeature == HaraPackage.Literals.ISO26262__MALFUNCTIONING_BEHAVIORS ||
			childFeature == HaraPackage.Literals.ISO26262__VERIFIED_ITEMS ||
			childFeature == HaraPackage.Literals.ISO26262__CONFIRMED_ITEMS ||
			childFeature == HaraPackage.Literals.ISO26262__ASIL_ASSIGNMENTS;

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
