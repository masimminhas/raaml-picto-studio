/**
 */
package raaml.stpa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import raaml.stpa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StpaFactoryImpl extends EFactoryImpl implements StpaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StpaFactory init() {
		try {
			StpaFactory theStpaFactory = (StpaFactory)EPackage.Registry.INSTANCE.getEFactory(StpaPackage.eNS_URI);
			if (theStpaFactory != null) {
				return theStpaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StpaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StpaFactoryImpl() {
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
			case StpaPackage.STPA: return createSTPA();
			case StpaPackage.LOSS: return createLoss();
			case StpaPackage.CONTROL_STRUCTURE: return createControlStructure();
			case StpaPackage.CONTROLLER: return createController();
			case StpaPackage.CONTROLLED_PROCESS: return createControlledProcess();
			case StpaPackage.ACTUATOR: return createActuator();
			case StpaPackage.SENSOR: return createSensor();
			case StpaPackage.CONTROL_ACTION: return createControlAction();
			case StpaPackage.FEEDBACK: return createFeedback();
			case StpaPackage.UNDESIRED_CONTROL_ACTION: return createUndesiredControlAction();
			case StpaPackage.STPA_LIBRARY: return createSTPALibrary();
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
	public STPA createSTPA() {
		STPAImpl stpa = new STPAImpl();
		return stpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loss createLoss() {
		LossImpl loss = new LossImpl();
		return loss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlStructure createControlStructure() {
		ControlStructureImpl controlStructure = new ControlStructureImpl();
		return controlStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlledProcess createControlledProcess() {
		ControlledProcessImpl controlledProcess = new ControlledProcessImpl();
		return controlledProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlAction createControlAction() {
		ControlActionImpl controlAction = new ControlActionImpl();
		return controlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feedback createFeedback() {
		FeedbackImpl feedback = new FeedbackImpl();
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UndesiredControlAction createUndesiredControlAction() {
		UndesiredControlActionImpl undesiredControlAction = new UndesiredControlActionImpl();
		return undesiredControlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STPALibrary createSTPALibrary() {
		STPALibraryImpl stpaLibrary = new STPALibraryImpl();
		return stpaLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StpaPackage getStpaPackage() {
		return (StpaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StpaPackage getPackage() {
		return StpaPackage.eINSTANCE;
	}

} //StpaFactoryImpl
