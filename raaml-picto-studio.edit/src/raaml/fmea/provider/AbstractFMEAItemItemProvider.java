/**
 */
package raaml.fmea.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import raaml.core.provider.CoreSafetyElementItemProvider;

import raaml.fmea.AbstractFMEAItem;
import raaml.fmea.FmeaFactory;
import raaml.fmea.FmeaPackage;

import raaml.provider.RaamlEditPlugin;

/**
 * This is the item provider adapter for a {@link raaml.fmea.AbstractFMEAItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractFMEAItemItemProvider extends CoreSafetyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFMEAItemItemProvider(AdapterFactory adapterFactory) {
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

			addRPNPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the RPN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRPNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractFMEAItem_RPN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractFMEAItem_RPN_feature", "_UI_AbstractFMEAItem_type"),
				 FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__RPN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE);
			childrenFeatures.add(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT);
			childrenFeatures.add(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractFMEAItem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractFMEAItem_type") :
			getString("_UI_AbstractFMEAItem_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractFMEAItem.class)) {
			case FmeaPackage.ABSTRACT_FMEA_ITEM__RPN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FAILURE_MODE:
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FINAL_EFFECT:
			case FmeaPackage.ABSTRACT_FMEA_ITEM__CAUSE:
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
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE,
				 FmeaFactory.eINSTANCE.createLossOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE,
				 FmeaFactory.eINSTANCE.createDegradationOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE,
				 FmeaFactory.eINSTANCE.createIntermittentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE,
				 FmeaFactory.eINSTANCE.createPartialFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE,
				 FmeaFactory.eINSTANCE.createExceedingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE,
				 FmeaFactory.eINSTANCE.createUnintendedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE,
				 FmeaFactory.eINSTANCE.createDelayedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT,
				 FmeaFactory.eINSTANCE.createLossOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT,
				 FmeaFactory.eINSTANCE.createDegradationOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT,
				 FmeaFactory.eINSTANCE.createIntermittentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT,
				 FmeaFactory.eINSTANCE.createPartialFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT,
				 FmeaFactory.eINSTANCE.createExceedingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT,
				 FmeaFactory.eINSTANCE.createUnintendedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT,
				 FmeaFactory.eINSTANCE.createDelayedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE,
				 FmeaFactory.eINSTANCE.createLossOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE,
				 FmeaFactory.eINSTANCE.createDegradationOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE,
				 FmeaFactory.eINSTANCE.createIntermittentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE,
				 FmeaFactory.eINSTANCE.createPartialFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE,
				 FmeaFactory.eINSTANCE.createExceedingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE,
				 FmeaFactory.eINSTANCE.createUnintendedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE,
				 FmeaFactory.eINSTANCE.createDelayedFunction()));
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
			childFeature == FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FAILURE_MODE ||
			childFeature == FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__FINAL_EFFECT ||
			childFeature == FmeaPackage.Literals.ABSTRACT_FMEA_ITEM__CAUSE;

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
