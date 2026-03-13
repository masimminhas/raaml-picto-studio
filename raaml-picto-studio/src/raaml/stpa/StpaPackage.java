/**
 */
package raaml.stpa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import raaml.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Systems Theoretic Process Analysis (STPA) elements
 * <!-- end-model-doc -->
 * @see raaml.stpa.StpaFactory
 * @model kind="package"
 * @generated
 */
public interface StpaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stpa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/stpa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.stpa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StpaPackage eINSTANCE = raaml.stpa.impl.StpaPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.STPAImpl <em>STPA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.STPAImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getSTPA()
	 * @generated
	 */
	int STPA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__ID = CorePackage.ANALYSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__NAME = CorePackage.ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__DESCRIPTION = CorePackage.ANALYSIS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__VISIBILITY = CorePackage.ANALYSIS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__ELEMENTS = CorePackage.ANALYSIS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Control Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__CONTROL_STRUCTURES = CorePackage.ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Losses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__LOSSES = CorePackage.ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__HAZARDS = CorePackage.ANALYSIS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__UNSAFE_CONTROL_ACTIONS = CorePackage.ANALYSIS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Control Flaws</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA__CONTROL_FLAWS = CorePackage.ANALYSIS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>STPA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_FEATURE_COUNT = CorePackage.ANALYSIS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>STPA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_OPERATION_COUNT = CorePackage.ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.LossImpl <em>Loss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.LossImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getLoss()
	 * @generated
	 */
	int LOSS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__CATEGORY = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.ControlStructureImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROLLERS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controlled Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROLLED_PROCESSES = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__ACTUATORS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SENSORS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.ControllerImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Control Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROL_ACTIONS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__FEEDBACK = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.ControlledProcessImpl <em>Controlled Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.ControlledProcessImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getControlledProcess()
	 * @generated
	 */
	int CONTROLLED_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Received Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__RECEIVED_ACTIONS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__PROVIDED_FEEDBACK = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controlled Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controlled Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.ActuatorImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Executed Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__EXECUTED_ACTIONS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.SensorImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Provided Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PROVIDED_FEEDBACK = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.ControlActionImpl <em>Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.ControlActionImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getControlAction()
	 * @generated
	 */
	int CONTROL_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__TYPE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__SOURCE_CONTROLLER = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__TARGET_PROCESS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.FeedbackImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__TYPE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__SOURCE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__TARGET_CONTROLLER = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.UndesiredControlActionImpl <em>Undesired Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.UndesiredControlActionImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getUndesiredControlAction()
	 * @generated
	 */
	int UNDESIRED_CONTROL_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Control Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__CONTROL_ACTION = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unsafe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__UNSAFE_TYPE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Model Flaw</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__PROCESS_MODEL_FLAW = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Harm Potential</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__HARM_POTENTIAL = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Causal Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION__SCENARIOS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Undesired Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Undesired Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_CONTROL_ACTION_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.stpa.impl.STPALibraryImpl <em>STPA Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.stpa.impl.STPALibraryImpl
	 * @see raaml.stpa.impl.StpaPackageImpl#getSTPALibrary()
	 * @generated
	 */
	int STPA_LIBRARY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__ID = CorePackage.ABSTRACT_LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__NAME = CorePackage.ABSTRACT_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__DESCRIPTION = CorePackage.ABSTRACT_LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__VISIBILITY = CorePackage.ABSTRACT_LIBRARY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__ELEMENTS = CorePackage.ABSTRACT_LIBRARY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Control Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__CONTROL_STRUCTURES = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__CONTROL_ACTIONS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>STPA Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY_FEATURE_COUNT = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>STPA Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_LIBRARY_OPERATION_COUNT = CorePackage.ABSTRACT_LIBRARY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link raaml.stpa.STPA <em>STPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STPA</em>'.
	 * @see raaml.stpa.STPA
	 * @generated
	 */
	EClass getSTPA();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPA#getControlStructures <em>Control Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Structures</em>'.
	 * @see raaml.stpa.STPA#getControlStructures()
	 * @see #getSTPA()
	 * @generated
	 */
	EReference getSTPA_ControlStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPA#getLosses <em>Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Losses</em>'.
	 * @see raaml.stpa.STPA#getLosses()
	 * @see #getSTPA()
	 * @generated
	 */
	EReference getSTPA_Losses();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPA#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazards</em>'.
	 * @see raaml.stpa.STPA#getHazards()
	 * @see #getSTPA()
	 * @generated
	 */
	EReference getSTPA_Hazards();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPA#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unsafe Control Actions</em>'.
	 * @see raaml.stpa.STPA#getUnsafeControlActions()
	 * @see #getSTPA()
	 * @generated
	 */
	EReference getSTPA_UnsafeControlActions();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPA#getControlFlaws <em>Control Flaws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Flaws</em>'.
	 * @see raaml.stpa.STPA#getControlFlaws()
	 * @see #getSTPA()
	 * @generated
	 */
	EReference getSTPA_ControlFlaws();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.Loss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss</em>'.
	 * @see raaml.stpa.Loss
	 * @generated
	 */
	EClass getLoss();

	/**
	 * Returns the meta object for the attribute '{@link raaml.stpa.Loss#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see raaml.stpa.Loss#getCategory()
	 * @see #getLoss()
	 * @generated
	 */
	EAttribute getLoss_Category();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see raaml.stpa.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.ControlStructure#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see raaml.stpa.ControlStructure#getControllers()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Controllers();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.ControlStructure#getControlledProcesses <em>Controlled Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Processes</em>'.
	 * @see raaml.stpa.ControlStructure#getControlledProcesses()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_ControlledProcesses();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.ControlStructure#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see raaml.stpa.ControlStructure#getActuators()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Actuators();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.ControlStructure#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see raaml.stpa.ControlStructure#getSensors()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Sensors();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see raaml.stpa.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.Controller#getControlActions <em>Control Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Actions</em>'.
	 * @see raaml.stpa.Controller#getControlActions()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ControlActions();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.Controller#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback</em>'.
	 * @see raaml.stpa.Controller#getFeedback()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Feedback();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.ControlledProcess <em>Controlled Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlled Process</em>'.
	 * @see raaml.stpa.ControlledProcess
	 * @generated
	 */
	EClass getControlledProcess();

	/**
	 * Returns the meta object for the reference list '{@link raaml.stpa.ControlledProcess#getReceivedActions <em>Received Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Received Actions</em>'.
	 * @see raaml.stpa.ControlledProcess#getReceivedActions()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_ReceivedActions();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.ControlledProcess#getProvidedFeedback <em>Provided Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Feedback</em>'.
	 * @see raaml.stpa.ControlledProcess#getProvidedFeedback()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_ProvidedFeedback();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see raaml.stpa.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the reference list '{@link raaml.stpa.Actuator#getExecutedActions <em>Executed Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Actions</em>'.
	 * @see raaml.stpa.Actuator#getExecutedActions()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_ExecutedActions();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see raaml.stpa.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.Sensor#getProvidedFeedback <em>Provided Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Feedback</em>'.
	 * @see raaml.stpa.Sensor#getProvidedFeedback()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_ProvidedFeedback();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.ControlAction <em>Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Action</em>'.
	 * @see raaml.stpa.ControlAction
	 * @generated
	 */
	EClass getControlAction();

	/**
	 * Returns the meta object for the attribute '{@link raaml.stpa.ControlAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see raaml.stpa.ControlAction#getType()
	 * @see #getControlAction()
	 * @generated
	 */
	EAttribute getControlAction_Type();

	/**
	 * Returns the meta object for the reference '{@link raaml.stpa.ControlAction#getSourceController <em>Source Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Controller</em>'.
	 * @see raaml.stpa.ControlAction#getSourceController()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_SourceController();

	/**
	 * Returns the meta object for the reference '{@link raaml.stpa.ControlAction#getTargetProcess <em>Target Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Process</em>'.
	 * @see raaml.stpa.ControlAction#getTargetProcess()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_TargetProcess();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see raaml.stpa.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link raaml.stpa.Feedback#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see raaml.stpa.Feedback#getType()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Type();

	/**
	 * Returns the meta object for the reference '{@link raaml.stpa.Feedback#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see raaml.stpa.Feedback#getSource()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_Source();

	/**
	 * Returns the meta object for the reference '{@link raaml.stpa.Feedback#getTargetController <em>Target Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Controller</em>'.
	 * @see raaml.stpa.Feedback#getTargetController()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_TargetController();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.UndesiredControlAction <em>Undesired Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undesired Control Action</em>'.
	 * @see raaml.stpa.UndesiredControlAction
	 * @generated
	 */
	EClass getUndesiredControlAction();

	/**
	 * Returns the meta object for the reference '{@link raaml.stpa.UndesiredControlAction#getControlAction <em>Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Action</em>'.
	 * @see raaml.stpa.UndesiredControlAction#getControlAction()
	 * @see #getUndesiredControlAction()
	 * @generated
	 */
	EReference getUndesiredControlAction_ControlAction();

	/**
	 * Returns the meta object for the attribute '{@link raaml.stpa.UndesiredControlAction#getUnsafeType <em>Unsafe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsafe Type</em>'.
	 * @see raaml.stpa.UndesiredControlAction#getUnsafeType()
	 * @see #getUndesiredControlAction()
	 * @generated
	 */
	EAttribute getUndesiredControlAction_UnsafeType();

	/**
	 * Returns the meta object for the reference list '{@link raaml.stpa.UndesiredControlAction#getProcessModelFlaw <em>Process Model Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Model Flaw</em>'.
	 * @see raaml.stpa.UndesiredControlAction#getProcessModelFlaw()
	 * @see #getUndesiredControlAction()
	 * @generated
	 */
	EReference getUndesiredControlAction_ProcessModelFlaw();

	/**
	 * Returns the meta object for the reference list '{@link raaml.stpa.UndesiredControlAction#getHarmPotential <em>Harm Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Harm Potential</em>'.
	 * @see raaml.stpa.UndesiredControlAction#getHarmPotential()
	 * @see #getUndesiredControlAction()
	 * @generated
	 */
	EReference getUndesiredControlAction_HarmPotential();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.UndesiredControlAction#getCausalFactors <em>Causal Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Causal Factors</em>'.
	 * @see raaml.stpa.UndesiredControlAction#getCausalFactors()
	 * @see #getUndesiredControlAction()
	 * @generated
	 */
	EReference getUndesiredControlAction_CausalFactors();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.UndesiredControlAction#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see raaml.stpa.UndesiredControlAction#getScenarios()
	 * @see #getUndesiredControlAction()
	 * @generated
	 */
	EReference getUndesiredControlAction_Scenarios();

	/**
	 * Returns the meta object for class '{@link raaml.stpa.STPALibrary <em>STPA Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STPA Library</em>'.
	 * @see raaml.stpa.STPALibrary
	 * @generated
	 */
	EClass getSTPALibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPALibrary#getControlStructures <em>Control Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Structures</em>'.
	 * @see raaml.stpa.STPALibrary#getControlStructures()
	 * @see #getSTPALibrary()
	 * @generated
	 */
	EReference getSTPALibrary_ControlStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPALibrary#getControlActions <em>Control Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Actions</em>'.
	 * @see raaml.stpa.STPALibrary#getControlActions()
	 * @see #getSTPALibrary()
	 * @generated
	 */
	EReference getSTPALibrary_ControlActions();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.stpa.STPALibrary#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unsafe Control Actions</em>'.
	 * @see raaml.stpa.STPALibrary#getUnsafeControlActions()
	 * @see #getSTPALibrary()
	 * @generated
	 */
	EReference getSTPALibrary_UnsafeControlActions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StpaFactory getStpaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.STPAImpl <em>STPA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.STPAImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getSTPA()
		 * @generated
		 */
		EClass STPA = eINSTANCE.getSTPA();

		/**
		 * The meta object literal for the '<em><b>Control Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA__CONTROL_STRUCTURES = eINSTANCE.getSTPA_ControlStructures();

		/**
		 * The meta object literal for the '<em><b>Losses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA__LOSSES = eINSTANCE.getSTPA_Losses();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA__HAZARDS = eINSTANCE.getSTPA_Hazards();

		/**
		 * The meta object literal for the '<em><b>Unsafe Control Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA__UNSAFE_CONTROL_ACTIONS = eINSTANCE.getSTPA_UnsafeControlActions();

		/**
		 * The meta object literal for the '<em><b>Control Flaws</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA__CONTROL_FLAWS = eINSTANCE.getSTPA_ControlFlaws();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.LossImpl <em>Loss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.LossImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getLoss()
		 * @generated
		 */
		EClass LOSS = eINSTANCE.getLoss();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS__CATEGORY = eINSTANCE.getLoss_Category();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.ControlStructureImpl <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.ControlStructureImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROLLERS = eINSTANCE.getControlStructure_Controllers();

		/**
		 * The meta object literal for the '<em><b>Controlled Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROLLED_PROCESSES = eINSTANCE.getControlStructure_ControlledProcesses();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__ACTUATORS = eINSTANCE.getControlStructure_Actuators();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SENSORS = eINSTANCE.getControlStructure_Sensors();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.ControllerImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Control Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CONTROL_ACTIONS = eINSTANCE.getController_ControlActions();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__FEEDBACK = eINSTANCE.getController_Feedback();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.ControlledProcessImpl <em>Controlled Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.ControlledProcessImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getControlledProcess()
		 * @generated
		 */
		EClass CONTROLLED_PROCESS = eINSTANCE.getControlledProcess();

		/**
		 * The meta object literal for the '<em><b>Received Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__RECEIVED_ACTIONS = eINSTANCE.getControlledProcess_ReceivedActions();

		/**
		 * The meta object literal for the '<em><b>Provided Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__PROVIDED_FEEDBACK = eINSTANCE.getControlledProcess_ProvidedFeedback();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.ActuatorImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Executed Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__EXECUTED_ACTIONS = eINSTANCE.getActuator_ExecutedActions();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.SensorImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Provided Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PROVIDED_FEEDBACK = eINSTANCE.getSensor_ProvidedFeedback();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.ControlActionImpl <em>Control Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.ControlActionImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getControlAction()
		 * @generated
		 */
		EClass CONTROL_ACTION = eINSTANCE.getControlAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_ACTION__TYPE = eINSTANCE.getControlAction_Type();

		/**
		 * The meta object literal for the '<em><b>Source Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__SOURCE_CONTROLLER = eINSTANCE.getControlAction_SourceController();

		/**
		 * The meta object literal for the '<em><b>Target Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__TARGET_PROCESS = eINSTANCE.getControlAction_TargetProcess();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.FeedbackImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__TYPE = eINSTANCE.getFeedback_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__SOURCE = eINSTANCE.getFeedback_Source();

		/**
		 * The meta object literal for the '<em><b>Target Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__TARGET_CONTROLLER = eINSTANCE.getFeedback_TargetController();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.UndesiredControlActionImpl <em>Undesired Control Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.UndesiredControlActionImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getUndesiredControlAction()
		 * @generated
		 */
		EClass UNDESIRED_CONTROL_ACTION = eINSTANCE.getUndesiredControlAction();

		/**
		 * The meta object literal for the '<em><b>Control Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDESIRED_CONTROL_ACTION__CONTROL_ACTION = eINSTANCE.getUndesiredControlAction_ControlAction();

		/**
		 * The meta object literal for the '<em><b>Unsafe Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDESIRED_CONTROL_ACTION__UNSAFE_TYPE = eINSTANCE.getUndesiredControlAction_UnsafeType();

		/**
		 * The meta object literal for the '<em><b>Process Model Flaw</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDESIRED_CONTROL_ACTION__PROCESS_MODEL_FLAW = eINSTANCE.getUndesiredControlAction_ProcessModelFlaw();

		/**
		 * The meta object literal for the '<em><b>Harm Potential</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDESIRED_CONTROL_ACTION__HARM_POTENTIAL = eINSTANCE.getUndesiredControlAction_HarmPotential();

		/**
		 * The meta object literal for the '<em><b>Causal Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS = eINSTANCE.getUndesiredControlAction_CausalFactors();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDESIRED_CONTROL_ACTION__SCENARIOS = eINSTANCE.getUndesiredControlAction_Scenarios();

		/**
		 * The meta object literal for the '{@link raaml.stpa.impl.STPALibraryImpl <em>STPA Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.stpa.impl.STPALibraryImpl
		 * @see raaml.stpa.impl.StpaPackageImpl#getSTPALibrary()
		 * @generated
		 */
		EClass STPA_LIBRARY = eINSTANCE.getSTPALibrary();

		/**
		 * The meta object literal for the '<em><b>Control Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_LIBRARY__CONTROL_STRUCTURES = eINSTANCE.getSTPALibrary_ControlStructures();

		/**
		 * The meta object literal for the '<em><b>Control Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_LIBRARY__CONTROL_ACTIONS = eINSTANCE.getSTPALibrary_ControlActions();

		/**
		 * The meta object literal for the '<em><b>Unsafe Control Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS = eINSTANCE.getSTPALibrary_UnsafeControlActions();

	}

} //StpaPackage
