/**
 */
package raaml.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import raaml.core.CoreFactory;
import raaml.core.CorePackage;
import raaml.core.Scenario;

import raaml.fmea.FmeaFactory;

import raaml.fta.FtaFactory;

/**
 * This is the item provider adapter for a {@link raaml.core.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider extends AnySituationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.SCENARIO__SCENARIO_STEPS);
			childrenFeatures.add(CorePackage.Literals.SCENARIO__TRIGGERS);
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
		String label = ((Scenario)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scenario_type") :
			getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
			case CorePackage.SCENARIO__SCENARIO_STEPS:
			case CorePackage.SCENARIO__TRIGGERS:
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
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 CoreFactory.eINSTANCE.createProcessModelFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createBasicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createTopEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createConditionalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createDormantEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createUndevelopedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createHouseEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FtaFactory.eINSTANCE.createZeroEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FmeaFactory.eINSTANCE.createLossOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FmeaFactory.eINSTANCE.createDegradationOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FmeaFactory.eINSTANCE.createIntermittentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FmeaFactory.eINSTANCE.createPartialFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FmeaFactory.eINSTANCE.createExceedingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FmeaFactory.eINSTANCE.createUnintendedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__SCENARIO_STEPS,
				 FmeaFactory.eINSTANCE.createDelayedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createBasicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createTopEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createConditionalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createDormantEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createUndevelopedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createHouseEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FtaFactory.eINSTANCE.createZeroEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FmeaFactory.eINSTANCE.createLossOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FmeaFactory.eINSTANCE.createDegradationOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FmeaFactory.eINSTANCE.createIntermittentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FmeaFactory.eINSTANCE.createPartialFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FmeaFactory.eINSTANCE.createExceedingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
				 FmeaFactory.eINSTANCE.createUnintendedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.SCENARIO__TRIGGERS,
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
			childFeature == CorePackage.Literals.SCENARIO__SCENARIO_STEPS ||
			childFeature == CorePackage.Literals.SCENARIO__TRIGGERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
