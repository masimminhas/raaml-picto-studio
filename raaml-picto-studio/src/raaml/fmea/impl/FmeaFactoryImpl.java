/**
 */
package raaml.fmea.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import raaml.fmea.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmeaFactoryImpl extends EFactoryImpl implements FmeaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FmeaFactory init() {
		try {
			FmeaFactory theFmeaFactory = (FmeaFactory)EPackage.Registry.INSTANCE.getEFactory(FmeaPackage.eNS_URI);
			if (theFmeaFactory != null) {
				return theFmeaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FmeaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmeaFactoryImpl() {
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
			case FmeaPackage.FMEA: return createFMEA();
			case FmeaPackage.RPN_CALCULATION: return createRPNCalculation();
			case FmeaPackage.FMEA_ITEM: return createFMEAItem();
			case FmeaPackage.LOSS_OF_FUNCTION: return createLossOfFunction();
			case FmeaPackage.DEGRADATION_OF_FUNCTION: return createDegradationOfFunction();
			case FmeaPackage.INTERMITTENT_FUNCTION: return createIntermittentFunction();
			case FmeaPackage.PARTIAL_FUNCTION: return createPartialFunction();
			case FmeaPackage.EXCEEDING_FUNCTION: return createExceedingFunction();
			case FmeaPackage.UNINTENDED_FUNCTION: return createUnintendedFunction();
			case FmeaPackage.DELAYED_FUNCTION: return createDelayedFunction();
			case FmeaPackage.FMEA_LIBRARY: return createFMEALibrary();
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
	public FMEA createFMEA() {
		FMEAImpl fmea = new FMEAImpl();
		return fmea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPNCalculation createRPNCalculation() {
		RPNCalculationImpl rpnCalculation = new RPNCalculationImpl();
		return rpnCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMEAItem createFMEAItem() {
		FMEAItemImpl fmeaItem = new FMEAItemImpl();
		return fmeaItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LossOfFunction createLossOfFunction() {
		LossOfFunctionImpl lossOfFunction = new LossOfFunctionImpl();
		return lossOfFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegradationOfFunction createDegradationOfFunction() {
		DegradationOfFunctionImpl degradationOfFunction = new DegradationOfFunctionImpl();
		return degradationOfFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermittentFunction createIntermittentFunction() {
		IntermittentFunctionImpl intermittentFunction = new IntermittentFunctionImpl();
		return intermittentFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialFunction createPartialFunction() {
		PartialFunctionImpl partialFunction = new PartialFunctionImpl();
		return partialFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceedingFunction createExceedingFunction() {
		ExceedingFunctionImpl exceedingFunction = new ExceedingFunctionImpl();
		return exceedingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnintendedFunction createUnintendedFunction() {
		UnintendedFunctionImpl unintendedFunction = new UnintendedFunctionImpl();
		return unintendedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DelayedFunction createDelayedFunction() {
		DelayedFunctionImpl delayedFunction = new DelayedFunctionImpl();
		return delayedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMEALibrary createFMEALibrary() {
		FMEALibraryImpl fmeaLibrary = new FMEALibraryImpl();
		return fmeaLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FmeaPackage getFmeaPackage() {
		return (FmeaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FmeaPackage getPackage() {
		return FmeaPackage.eINSTANCE;
	}

} //FmeaFactoryImpl
