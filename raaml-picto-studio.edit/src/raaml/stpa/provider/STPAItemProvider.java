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

import raaml.core.CoreFactory;
import raaml.core.CorePackage;

import raaml.core.provider.AnalysisItemProvider;

import raaml.provider.RaamlEditPlugin;

import raaml.stpa.STPA;
import raaml.stpa.StpaFactory;
import raaml.stpa.StpaPackage;

/**
 * This is the item provider adapter for a {@link raaml.stpa.STPA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class STPAItemProvider extends AnalysisItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPAItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StpaPackage.Literals.STPA__CONTROL_STRUCTURES);
			childrenFeatures.add(StpaPackage.Literals.STPA__LOSSES);
			childrenFeatures.add(StpaPackage.Literals.STPA__HAZARDS);
			childrenFeatures.add(StpaPackage.Literals.STPA__UNSAFE_CONTROL_ACTIONS);
			childrenFeatures.add(StpaPackage.Literals.STPA__CONTROL_FLAWS);
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
	 * This returns STPA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/STPA"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((STPA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_STPA_type") :
			getString("_UI_STPA_type") + " " + label;
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

		switch (notification.getFeatureID(STPA.class)) {
			case StpaPackage.STPA__CONTROL_STRUCTURES:
			case StpaPackage.STPA__LOSSES:
			case StpaPackage.STPA__HAZARDS:
			case StpaPackage.STPA__UNSAFE_CONTROL_ACTIONS:
			case StpaPackage.STPA__CONTROL_FLAWS:
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
				(StpaPackage.Literals.STPA__CONTROL_STRUCTURES,
				 StpaFactory.eINSTANCE.createControlStructure()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.STPA__LOSSES,
				 StpaFactory.eINSTANCE.createLoss()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.STPA__HAZARDS,
				 CoreFactory.eINSTANCE.createHazard()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.STPA__UNSAFE_CONTROL_ACTIONS,
				 StpaFactory.eINSTANCE.createUndesiredControlAction()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.STPA__CONTROL_FLAWS,
				 CoreFactory.eINSTANCE.createProcessModelFlaw()));
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
			childFeature == StpaPackage.Literals.STPA__LOSSES ||
			childFeature == StpaPackage.Literals.STPA__CONTROL_STRUCTURES ||
			childFeature == StpaPackage.Literals.STPA__UNSAFE_CONTROL_ACTIONS ||
			childFeature == StpaPackage.Literals.STPA__HAZARDS ||
			childFeature == StpaPackage.Literals.STPA__CONTROL_FLAWS;

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
