/**
 */
package raaml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import raaml.RaamlPackage;
import raaml.SafetyAnalysis;

import raaml.core.provider.NamedElementItemProvider;

import raaml.fmea.FmeaFactory;

import raaml.fta.FtaFactory;

import raaml.gsn.GsnFactory;

import raaml.hara.HaraFactory;

import raaml.library.LibraryFactory;

import raaml.req.ReqFactory;

import raaml.stpa.StpaFactory;

/**
 * This is the item provider adapter for a {@link raaml.SafetyAnalysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyAnalysisItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyAnalysisItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RaamlPackage.Literals.SAFETY_ANALYSIS__ANALYSES);
			childrenFeatures.add(RaamlPackage.Literals.SAFETY_ANALYSIS__LIBRARIES);
			childrenFeatures.add(RaamlPackage.Literals.SAFETY_ANALYSIS__REQUIREMENTS);
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
	 * This returns SafetyAnalysis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SafetyAnalysis"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SafetyAnalysis)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SafetyAnalysis_type") :
			getString("_UI_SafetyAnalysis_type") + " " + label;
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

		switch (notification.getFeatureID(SafetyAnalysis.class)) {
			case RaamlPackage.SAFETY_ANALYSIS__ANALYSES:
			case RaamlPackage.SAFETY_ANALYSIS__LIBRARIES:
			case RaamlPackage.SAFETY_ANALYSIS__REQUIREMENTS:
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
				(RaamlPackage.Literals.SAFETY_ANALYSIS__ANALYSES,
				 FtaFactory.eINSTANCE.createFTA()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__ANALYSES,
				 FmeaFactory.eINSTANCE.createFMEA()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__ANALYSES,
				 HaraFactory.eINSTANCE.createISO26262()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__ANALYSES,
				 StpaFactory.eINSTANCE.createSTPA()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__ANALYSES,
				 GsnFactory.eINSTANCE.createGSN()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__LIBRARIES,
				 LibraryFactory.eINSTANCE.createGeneralLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__LIBRARIES,
				 FtaFactory.eINSTANCE.createFTALibrary()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__LIBRARIES,
				 FmeaFactory.eINSTANCE.createFMEALibrary()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__LIBRARIES,
				 HaraFactory.eINSTANCE.createISO26262Library()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__LIBRARIES,
				 StpaFactory.eINSTANCE.createSTPALibrary()));

		newChildDescriptors.add
			(createChildParameter
				(RaamlPackage.Literals.SAFETY_ANALYSIS__REQUIREMENTS,
				 ReqFactory.eINSTANCE.createRequirementsModel()));
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
