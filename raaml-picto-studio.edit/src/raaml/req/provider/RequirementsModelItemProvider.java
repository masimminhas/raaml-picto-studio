/**
 */
package raaml.req.provider;


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

import raaml.req.ReqFactory;
import raaml.req.ReqPackage;
import raaml.req.RequirementsModel;

/**
 * This is the item provider adapter for a {@link raaml.req.RequirementsModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsModelItemProvider extends CoreSafetyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS);
			childrenFeatures.add(ReqPackage.Literals.REQUIREMENTS_MODEL__DERIVATIONS);
			childrenFeatures.add(ReqPackage.Literals.REQUIREMENTS_MODEL__SATISFACTIONS);
			childrenFeatures.add(ReqPackage.Literals.REQUIREMENTS_MODEL__DEPENDENCIES);
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
	 * This returns RequirementsModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequirementsModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RequirementsModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RequirementsModel_type") :
			getString("_UI_RequirementsModel_type") + " " + label;
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

		switch (notification.getFeatureID(RequirementsModel.class)) {
			case ReqPackage.REQUIREMENTS_MODEL__REQUIREMENTS:
			case ReqPackage.REQUIREMENTS_MODEL__DERIVATIONS:
			case ReqPackage.REQUIREMENTS_MODEL__SATISFACTIONS:
			case ReqPackage.REQUIREMENTS_MODEL__DEPENDENCIES:
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
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createDependabilityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createFunctionalSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createSoftwareSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createHardwareSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createTechnicalSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createSafetyGoal()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createISO26262SafetyRequirementTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__DERIVATIONS,
				 ReqFactory.eINSTANCE.createDeriveRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__DERIVATIONS,
				 ReqFactory.eINSTANCE.createIndependenceRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__DERIVATIONS,
				 ReqFactory.eINSTANCE.createASILDecompose()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__SATISFACTIONS,
				 ReqFactory.eINSTANCE.createSatisfy()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__SATISFACTIONS,
				 ReqFactory.eINSTANCE.createUserInfoRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__SATISFACTIONS,
				 ReqFactory.eINSTANCE.createRecoveryRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__DEPENDENCIES,
				 ReqFactory.eINSTANCE.createSafeState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqPackage.Literals.REQUIREMENTS_MODEL__DEPENDENCIES,
				 ReqFactory.eINSTANCE.createOperatingMode()));
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
