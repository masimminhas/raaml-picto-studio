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

import raaml.core.provider.CoreSafetyElementItemProvider;

import raaml.provider.RaamlEditPlugin;

import raaml.stpa.ControlStructure;
import raaml.stpa.StpaFactory;
import raaml.stpa.StpaPackage;

/**
 * This is the item provider adapter for a {@link raaml.stpa.ControlStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlStructureItemProvider extends CoreSafetyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStructureItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StpaPackage.Literals.CONTROL_STRUCTURE__CONTROLLERS);
			childrenFeatures.add(StpaPackage.Literals.CONTROL_STRUCTURE__CONTROLLED_PROCESSES);
			childrenFeatures.add(StpaPackage.Literals.CONTROL_STRUCTURE__ACTUATORS);
			childrenFeatures.add(StpaPackage.Literals.CONTROL_STRUCTURE__SENSORS);
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
	 * This returns ControlStructure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlStructure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ControlStructure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ControlStructure_type") :
			getString("_UI_ControlStructure_type") + " " + label;
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

		switch (notification.getFeatureID(ControlStructure.class)) {
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLERS:
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLED_PROCESSES:
			case StpaPackage.CONTROL_STRUCTURE__ACTUATORS:
			case StpaPackage.CONTROL_STRUCTURE__SENSORS:
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
				(StpaPackage.Literals.CONTROL_STRUCTURE__CONTROLLERS,
				 StpaFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.CONTROL_STRUCTURE__CONTROLLED_PROCESSES,
				 StpaFactory.eINSTANCE.createControlledProcess()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.CONTROL_STRUCTURE__ACTUATORS,
				 StpaFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(StpaPackage.Literals.CONTROL_STRUCTURE__SENSORS,
				 StpaFactory.eINSTANCE.createSensor()));
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
