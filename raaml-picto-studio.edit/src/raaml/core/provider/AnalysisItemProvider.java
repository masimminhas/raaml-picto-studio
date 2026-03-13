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

import raaml.core.Analysis;
import raaml.core.CoreFactory;
import raaml.core.CorePackage;

import raaml.fmea.FmeaFactory;

import raaml.fta.FtaFactory;

import raaml.gsn.GsnFactory;

import raaml.hara.HaraFactory;

import raaml.req.ReqFactory;

import raaml.stpa.StpaFactory;

/**
 * This is the item provider adapter for a {@link raaml.core.Analysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.ANALYSIS__ELEMENTS);
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
		String label = ((Analysis)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Analysis_type") :
			getString("_UI_Analysis_type") + " " + label;
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

		switch (notification.getFeatureID(Analysis.class)) {
			case CorePackage.ANALYSIS__ELEMENTS:
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
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createSituation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createFailureMode()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createHazard()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createFault()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createDetection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createRecommendation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createMitigation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createPrevention()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createFailureState()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createRelevantTo()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createPresentIn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createViolates()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createSingleElementItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createElementGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createElementGroupBasedItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 CoreFactory.eINSTANCE.createProcessModelFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createDeriveRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createIndependenceRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createASILDecompose()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createSatisfy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createUserInfoRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createRecoveryRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createDependabilityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createFunctionalSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createSoftwareSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createHardwareSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createTechnicalSafetyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createSafetyGoal()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createSafeState()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createOperatingMode()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createHazardAndRiskAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createISO26262SafetyRequirementTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 ReqFactory.eINSTANCE.createRequirementsModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createBasicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createTopEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createConditionalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createDormantEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createUndevelopedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createHouseEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createZeroEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createAND()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createOR()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createNOT()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createXOR()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createSEQ()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createINHIBIT()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createMAJORITY_VOTE()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FtaFactory.eINSTANCE.createFTATree()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createRPNCalculation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createFMEAItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createLossOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createDegradationOfFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createIntermittentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createPartialFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createExceedingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createUnintendedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 FmeaFactory.eINSTANCE.createDelayedFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 HaraFactory.eINSTANCE.createOperationalSituation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 HaraFactory.eINSTANCE.createMalfunctioningBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 HaraFactory.eINSTANCE.createVerified()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 HaraFactory.eINSTANCE.createConfirmed()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 HaraFactory.eINSTANCE.createASILAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createLoss()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createControlStructure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createControlledProcess()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createControlAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createFeedback()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 StpaFactory.eINSTANCE.createUndesiredControlAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createInContextOf()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createSupportedBy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createASILOverrideRationale()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ANALYSIS__ELEMENTS,
				 GsnFactory.eINSTANCE.createLessonLearned()));
	}

}
