/**
 */
package raaml.hara.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import raaml.hara.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HaraFactoryImpl extends EFactoryImpl implements HaraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HaraFactory init() {
		try {
			HaraFactory theHaraFactory = (HaraFactory)EPackage.Registry.INSTANCE.getEFactory(HaraPackage.eNS_URI);
			if (theHaraFactory != null) {
				return theHaraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HaraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HaraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HaraPackage.ISO26262: return createISO26262();
			case HaraPackage.OPERATIONAL_SITUATION: return createOperationalSituation();
			case HaraPackage.MALFUNCTIONING_BEHAVIOUR: return createMalfunctioningBehaviour();
			case HaraPackage.VERIFIED: return createVerified();
			case HaraPackage.CONFIRMED: return createConfirmed();
			case HaraPackage.ASIL_ASSIGNMENT: return createASILAssignment();
			case HaraPackage.ISO26262_LIBRARY: return createISO26262Library();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HaraPackage.ASIL:
				return createASILFromString(eDataType, initialValue);
			case HaraPackage.CONTROLLABILITY:
				return createControllabilityFromString(eDataType, initialValue);
			case HaraPackage.EXPOSURE:
				return createExposureFromString(eDataType, initialValue);
			case HaraPackage.SEVERITY:
				return createSeverityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HaraPackage.ASIL:
				return convertASILToString(eDataType, instanceValue);
			case HaraPackage.CONTROLLABILITY:
				return convertControllabilityToString(eDataType, instanceValue);
			case HaraPackage.EXPOSURE:
				return convertExposureToString(eDataType, instanceValue);
			case HaraPackage.SEVERITY:
				return convertSeverityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISO26262 createISO26262() {
		ISO26262Impl iso26262 = new ISO26262Impl();
		return iso26262;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationalSituation createOperationalSituation() {
		OperationalSituationImpl operationalSituation = new OperationalSituationImpl();
		return operationalSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MalfunctioningBehaviour createMalfunctioningBehaviour() {
		MalfunctioningBehaviourImpl malfunctioningBehaviour = new MalfunctioningBehaviourImpl();
		return malfunctioningBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verified createVerified() {
		VerifiedImpl verified = new VerifiedImpl();
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Confirmed createConfirmed() {
		ConfirmedImpl confirmed = new ConfirmedImpl();
		return confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASILAssignment createASILAssignment() {
		ASILAssignmentImpl asilAssignment = new ASILAssignmentImpl();
		return asilAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISO26262Library createISO26262Library() {
		ISO26262LibraryImpl iso26262Library = new ISO26262LibraryImpl();
		return iso26262Library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASIL createASILFromString(EDataType eDataType, String initialValue) {
		ASIL result = ASIL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASILToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controllability createControllabilityFromString(EDataType eDataType, String initialValue) {
		Controllability result = Controllability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControllabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exposure createExposureFromString(EDataType eDataType, String initialValue) {
		Exposure result = Exposure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverityFromString(EDataType eDataType, String initialValue) {
		Severity result = Severity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaraPackage getHaraPackage() {
		return (HaraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HaraPackage getPackage() {
		return HaraPackage.eINSTANCE;
	}

} //HaraFactoryImpl
