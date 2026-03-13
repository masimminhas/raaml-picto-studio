/**
 */
package raaml.library.provider;


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

import raaml.core.provider.AbstractLibraryItemProvider;

import raaml.fmea.FmeaFactory;

import raaml.fta.FtaFactory;

import raaml.library.GeneralLibrary;
import raaml.library.LibraryPackage;

import raaml.provider.RaamlEditPlugin;

/**
 * This is the item provider adapter for a {@link raaml.library.GeneralLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralLibraryItemProvider extends AbstractLibraryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLibraryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS);
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
	 * This returns GeneralLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GeneralLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GeneralLibrary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GeneralLibrary_type") :
			getString("_UI_GeneralLibrary_type") + " " + label;
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

		switch (notification.getFeatureID(GeneralLibrary.class)) {
			case LibraryPackage.GENERAL_LIBRARY__ANY_SITUATIONS:
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
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 CoreFactory.eINSTANCE.createProcessModelFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createBasicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createTopEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createConditionalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createDormantEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createUndevelopedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createHouseEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FtaFactory.eINSTANCE.createZeroEvent()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FmeaFactory.eINSTANCE.createLossOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FmeaFactory.eINSTANCE.createDegradationOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FmeaFactory.eINSTANCE.createIntermittentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FmeaFactory.eINSTANCE.createPartialFunction()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FmeaFactory.eINSTANCE.createExceedingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
				 FmeaFactory.eINSTANCE.createUnintendedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS,
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
			childFeature == CorePackage.Literals.ABSTRACT_LIBRARY__ELEMENTS ||
			childFeature == LibraryPackage.Literals.GENERAL_LIBRARY__ANY_SITUATIONS;

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
