/**
 */
package raaml.hara;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * ISO 26262 Hazard Analysis and Risk Assessment
 * <!-- end-model-doc -->
 * @see raaml.hara.HaraFactory
 * @model kind="package"
 * @generated
 */
public interface HaraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hara";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/hara";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.hara";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HaraPackage eINSTANCE = raaml.hara.impl.HaraPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.hara.impl.ISO26262Impl <em>ISO26262</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.ISO26262Impl
	 * @see raaml.hara.impl.HaraPackageImpl#getISO26262()
	 * @generated
	 */
	int ISO26262 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__ID = CorePackage.ANALYSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__NAME = CorePackage.ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__DESCRIPTION = CorePackage.ANALYSIS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__VISIBILITY = CorePackage.ANALYSIS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__ELEMENTS = CorePackage.ANALYSIS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Malfunctioning Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__MALFUNCTIONING_BEHAVIORS = CorePackage.ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Situations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__OPERATIONAL_SITUATIONS = CorePackage.ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirmed Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__CONFIRMED_ITEMS = CorePackage.ANALYSIS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verified Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__VERIFIED_ITEMS = CorePackage.ANALYSIS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asil Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262__ASIL_ASSIGNMENTS = CorePackage.ANALYSIS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ISO26262</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_FEATURE_COUNT = CorePackage.ANALYSIS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ISO26262</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_OPERATION_COUNT = CorePackage.ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.OperationalSituationImpl <em>Operational Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.OperationalSituationImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getOperationalSituation()
	 * @generated
	 */
	int OPERATIONAL_SITUATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__ID = CorePackage.SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__NAME = CorePackage.SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__DESCRIPTION = CorePackage.SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__VISIBILITY = CorePackage.SITUATION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Operational Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION_FEATURE_COUNT = CorePackage.SITUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operational Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION_OPERATION_COUNT = CorePackage.SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.MalfunctioningBehaviourImpl <em>Malfunctioning Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.MalfunctioningBehaviourImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getMalfunctioningBehaviour()
	 * @generated
	 */
	int MALFUNCTIONING_BEHAVIOUR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTIONING_BEHAVIOUR__ID = CorePackage.FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTIONING_BEHAVIOUR__NAME = CorePackage.FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTIONING_BEHAVIOUR__DESCRIPTION = CorePackage.FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTIONING_BEHAVIOUR__VISIBILITY = CorePackage.FAILURE_MODE__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Malfunctioning Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTIONING_BEHAVIOUR_FEATURE_COUNT = CorePackage.FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Malfunctioning Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTIONING_BEHAVIOUR_OPERATION_COUNT = CorePackage.FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.VerifiedImpl <em>Verified</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.VerifiedImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getVerified()
	 * @generated
	 */
	int VERIFIED = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED__RESULT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Verified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIED_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.ConfirmedImpl <em>Confirmed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.ConfirmedImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getConfirmed()
	 * @generated
	 */
	int CONFIRMED = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMED__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMED__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMED__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMED__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMED__RESULT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Confirmed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMED_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Confirmed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMED_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.ASILAssignmentImpl <em>ASIL Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.ASILAssignmentImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getASILAssignment()
	 * @generated
	 */
	int ASIL_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>ASIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT__ASIL = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ASIL Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT__ASIL_OVERRIDE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ASIL Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ASIL Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_ASSIGNMENT_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.OperationalConditionImpl <em>Operational Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.OperationalConditionImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getOperationalCondition()
	 * @generated
	 */
	int OPERATIONAL_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION__ID = CorePackage.ABSTRACT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION__NAME = CorePackage.ABSTRACT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION__DESCRIPTION = CorePackage.ABSTRACT_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION__VISIBILITY = CorePackage.ABSTRACT_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION__FROM = CorePackage.ABSTRACT_EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION__TO = CorePackage.ABSTRACT_EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION__LIKELIHOOD = CorePackage.ABSTRACT_EVENT__LIKELIHOOD;

	/**
	 * The number of structural features of the '<em>Operational Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION_FEATURE_COUNT = CorePackage.ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operational Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_CONDITION_OPERATION_COUNT = CorePackage.ABSTRACT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.AbstractOperationalSituationImpl <em>Abstract Operational Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.AbstractOperationalSituationImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getAbstractOperationalSituation()
	 * @generated
	 */
	int ABSTRACT_OPERATIONAL_SITUATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__ID = OPERATIONAL_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__NAME = OPERATIONAL_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__DESCRIPTION = OPERATIONAL_CONDITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__VISIBILITY = OPERATIONAL_CONDITION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__FROM = OPERATIONAL_CONDITION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__TO = OPERATIONAL_CONDITION__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__LIKELIHOOD = OPERATIONAL_CONDITION__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE = OPERATIONAL_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS = OPERATIONAL_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Operational Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION_FEATURE_COUNT = OPERATIONAL_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Operational Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATIONAL_SITUATION_OPERATION_COUNT = OPERATIONAL_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.AccidentScenarioImpl <em>Accident Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.AccidentScenarioImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getAccidentScenario()
	 * @generated
	 */
	int ACCIDENT_SCENARIO = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__ID = CorePackage.DYSFUNCTIONAL_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__NAME = CorePackage.DYSFUNCTIONAL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__DESCRIPTION = CorePackage.DYSFUNCTIONAL_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__VISIBILITY = CorePackage.DYSFUNCTIONAL_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__FROM = CorePackage.DYSFUNCTIONAL_EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__TO = CorePackage.DYSFUNCTIONAL_EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__LIKELIHOOD = CorePackage.DYSFUNCTIONAL_EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__TO_ERROR = CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__FROM_ERROR = CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__ERROR = CorePackage.DYSFUNCTIONAL_EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__FAILURE = CorePackage.DYSFUNCTIONAL_EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__FAULT = CorePackage.DYSFUNCTIONAL_EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Controllability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__CONTROLLABILITY = CorePackage.DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Situations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__SITUATIONS = CorePackage.DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Malfunctioning Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS = CorePackage.DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accident Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO_FEATURE_COUNT = CorePackage.DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Accident Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_SCENARIO_OPERATION_COUNT = CorePackage.DYSFUNCTIONAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.AnyMalfunctionImpl <em>Any Malfunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.AnyMalfunctionImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getAnyMalfunction()
	 * @generated
	 */
	int ANY_MALFUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__ID = CorePackage.UNDESIRED_STATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__NAME = CorePackage.UNDESIRED_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__DESCRIPTION = CorePackage.UNDESIRED_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__VISIBILITY = CorePackage.UNDESIRED_STATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__FROM = CorePackage.UNDESIRED_STATE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__TO = CorePackage.UNDESIRED_STATE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__LIKELIHOOD = CorePackage.UNDESIRED_STATE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__TO_ERROR = CorePackage.UNDESIRED_STATE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__FROM_ERROR = CorePackage.UNDESIRED_STATE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__ERROR = CorePackage.UNDESIRED_STATE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__FAILURE = CorePackage.UNDESIRED_STATE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION__FAULT = CorePackage.UNDESIRED_STATE__FAULT;

	/**
	 * The number of structural features of the '<em>Any Malfunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION_FEATURE_COUNT = CorePackage.UNDESIRED_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Malfunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_MALFUNCTION_OPERATION_COUNT = CorePackage.UNDESIRED_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.HazardousEventImpl <em>Hazardous Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.HazardousEventImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getHazardousEvent()
	 * @generated
	 */
	int HAZARDOUS_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__ID = CorePackage.ABSTRACT_RISK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__NAME = CorePackage.ABSTRACT_RISK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__DESCRIPTION = CorePackage.ABSTRACT_RISK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__VISIBILITY = CorePackage.ABSTRACT_RISK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__FROM = CorePackage.ABSTRACT_RISK__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__TO = CorePackage.ABSTRACT_RISK__TO;

	/**
	 * The feature id for the '<em><b>Scenario Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__SCENARIO_STEPS = CorePackage.ABSTRACT_RISK__SCENARIO_STEPS;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__TRIGGERS = CorePackage.ABSTRACT_RISK__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Risk Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__RISK_SCORE = CorePackage.ABSTRACT_RISK__RISK_SCORE;

	/**
	 * The feature id for the '<em><b>Harm Potentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__HARM_POTENTIALS = CorePackage.ABSTRACT_RISK__HARM_POTENTIALS;

	/**
	 * The feature id for the '<em><b>Harms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__HARMS = CorePackage.ABSTRACT_RISK__HARMS;

	/**
	 * The feature id for the '<em><b>ASIL</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__ASIL = CorePackage.ABSTRACT_RISK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__HAZARDS = CorePackage.ABSTRACT_RISK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__SCENARIOS = CorePackage.ABSTRACT_RISK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vehicle Level Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS = CorePackage.ABSTRACT_RISK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Level Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS = CorePackage.ABSTRACT_RISK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hazardous Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT_FEATURE_COUNT = CorePackage.ABSTRACT_RISK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Hazardous Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT_OPERATION_COUNT = CorePackage.ABSTRACT_RISK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.AutomotiveEffectImpl <em>Automotive Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.AutomotiveEffectImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getAutomotiveEffect()
	 * @generated
	 */
	int AUTOMOTIVE_EFFECT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__ID = CorePackage.ABSTRACT_EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__NAME = CorePackage.ABSTRACT_EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__DESCRIPTION = CorePackage.ABSTRACT_EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__VISIBILITY = CorePackage.ABSTRACT_EFFECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__FROM = CorePackage.ABSTRACT_EFFECT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__TO = CorePackage.ABSTRACT_EFFECT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__LIKELIHOOD = CorePackage.ABSTRACT_EFFECT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__TO_ERROR = CorePackage.ABSTRACT_EFFECT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__FROM_ERROR = CorePackage.ABSTRACT_EFFECT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__ERROR = CorePackage.ABSTRACT_EFFECT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__FAILURE = CorePackage.ABSTRACT_EFFECT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__FAULT = CorePackage.ABSTRACT_EFFECT__FAULT;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT__SEVERITY = CorePackage.ABSTRACT_EFFECT__SEVERITY;

	/**
	 * The number of structural features of the '<em>Automotive Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT_FEATURE_COUNT = CorePackage.ABSTRACT_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Automotive Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_EFFECT_OPERATION_COUNT = CorePackage.ABSTRACT_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.SystemLevelEffectImpl <em>System Level Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.SystemLevelEffectImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getSystemLevelEffect()
	 * @generated
	 */
	int SYSTEM_LEVEL_EFFECT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__ID = AUTOMOTIVE_EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__NAME = AUTOMOTIVE_EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__DESCRIPTION = AUTOMOTIVE_EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__VISIBILITY = AUTOMOTIVE_EFFECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__FROM = AUTOMOTIVE_EFFECT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__TO = AUTOMOTIVE_EFFECT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__LIKELIHOOD = AUTOMOTIVE_EFFECT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__TO_ERROR = AUTOMOTIVE_EFFECT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__FROM_ERROR = AUTOMOTIVE_EFFECT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__ERROR = AUTOMOTIVE_EFFECT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__FAILURE = AUTOMOTIVE_EFFECT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__FAULT = AUTOMOTIVE_EFFECT__FAULT;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT__SEVERITY = AUTOMOTIVE_EFFECT__SEVERITY;

	/**
	 * The number of structural features of the '<em>System Level Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT_FEATURE_COUNT = AUTOMOTIVE_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Level Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_EFFECT_OPERATION_COUNT = AUTOMOTIVE_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.VehicleLevelEffectImpl <em>Vehicle Level Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.VehicleLevelEffectImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getVehicleLevelEffect()
	 * @generated
	 */
	int VEHICLE_LEVEL_EFFECT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__ID = AUTOMOTIVE_EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__NAME = AUTOMOTIVE_EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__DESCRIPTION = AUTOMOTIVE_EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__VISIBILITY = AUTOMOTIVE_EFFECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__FROM = AUTOMOTIVE_EFFECT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__TO = AUTOMOTIVE_EFFECT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__LIKELIHOOD = AUTOMOTIVE_EFFECT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__TO_ERROR = AUTOMOTIVE_EFFECT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__FROM_ERROR = AUTOMOTIVE_EFFECT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__ERROR = AUTOMOTIVE_EFFECT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__FAILURE = AUTOMOTIVE_EFFECT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__FAULT = AUTOMOTIVE_EFFECT__FAULT;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT__SEVERITY = AUTOMOTIVE_EFFECT__SEVERITY;

	/**
	 * The number of structural features of the '<em>Vehicle Level Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT_FEATURE_COUNT = AUTOMOTIVE_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vehicle Level Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_LEVEL_EFFECT_OPERATION_COUNT = AUTOMOTIVE_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.impl.ISO26262LibraryImpl <em>ISO26262 Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.impl.ISO26262LibraryImpl
	 * @see raaml.hara.impl.HaraPackageImpl#getISO26262Library()
	 * @generated
	 */
	int ISO26262_LIBRARY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__ID = CorePackage.ABSTRACT_LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__NAME = CorePackage.ABSTRACT_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__DESCRIPTION = CorePackage.ABSTRACT_LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__VISIBILITY = CorePackage.ABSTRACT_LIBRARY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__ELEMENTS = CorePackage.ABSTRACT_LIBRARY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Operational Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__OPERATIONAL_CONDITIONS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hazardous Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__HAZARDOUS_EVENTS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accident Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY__ACCIDENT_SCENARIOS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ISO26262 Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY_FEATURE_COUNT = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ISO26262 Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_LIBRARY_OPERATION_COUNT = CorePackage.ABSTRACT_LIBRARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hara.ASIL <em>ASIL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.ASIL
	 * @see raaml.hara.impl.HaraPackageImpl#getASIL()
	 * @generated
	 */
	int ASIL = 15;

	/**
	 * The meta object id for the '{@link raaml.hara.Controllability <em>Controllability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.Controllability
	 * @see raaml.hara.impl.HaraPackageImpl#getControllability()
	 * @generated
	 */
	int CONTROLLABILITY = 16;

	/**
	 * The meta object id for the '{@link raaml.hara.Exposure <em>Exposure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.Exposure
	 * @see raaml.hara.impl.HaraPackageImpl#getExposure()
	 * @generated
	 */
	int EXPOSURE = 17;

	/**
	 * The meta object id for the '{@link raaml.hara.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hara.Severity
	 * @see raaml.hara.impl.HaraPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 18;


	/**
	 * Returns the meta object for class '{@link raaml.hara.ISO26262 <em>ISO26262</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO26262</em>'.
	 * @see raaml.hara.ISO26262
	 * @generated
	 */
	EClass getISO26262();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262#getMalfunctioningBehaviors <em>Malfunctioning Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Malfunctioning Behaviors</em>'.
	 * @see raaml.hara.ISO26262#getMalfunctioningBehaviors()
	 * @see #getISO26262()
	 * @generated
	 */
	EReference getISO26262_MalfunctioningBehaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262#getOperationalSituations <em>Operational Situations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operational Situations</em>'.
	 * @see raaml.hara.ISO26262#getOperationalSituations()
	 * @see #getISO26262()
	 * @generated
	 */
	EReference getISO26262_OperationalSituations();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262#getConfirmedItems <em>Confirmed Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Confirmed Items</em>'.
	 * @see raaml.hara.ISO26262#getConfirmedItems()
	 * @see #getISO26262()
	 * @generated
	 */
	EReference getISO26262_ConfirmedItems();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262#getVerifiedItems <em>Verified Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verified Items</em>'.
	 * @see raaml.hara.ISO26262#getVerifiedItems()
	 * @see #getISO26262()
	 * @generated
	 */
	EReference getISO26262_VerifiedItems();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262#getAsilAssignments <em>Asil Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asil Assignments</em>'.
	 * @see raaml.hara.ISO26262#getAsilAssignments()
	 * @see #getISO26262()
	 * @generated
	 */
	EReference getISO26262_AsilAssignments();

	/**
	 * Returns the meta object for class '{@link raaml.hara.OperationalSituation <em>Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Situation</em>'.
	 * @see raaml.hara.OperationalSituation
	 * @generated
	 */
	EClass getOperationalSituation();

	/**
	 * Returns the meta object for class '{@link raaml.hara.MalfunctioningBehaviour <em>Malfunctioning Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Malfunctioning Behaviour</em>'.
	 * @see raaml.hara.MalfunctioningBehaviour
	 * @generated
	 */
	EClass getMalfunctioningBehaviour();

	/**
	 * Returns the meta object for class '{@link raaml.hara.Verified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verified</em>'.
	 * @see raaml.hara.Verified
	 * @generated
	 */
	EClass getVerified();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hara.Verified#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see raaml.hara.Verified#getResult()
	 * @see #getVerified()
	 * @generated
	 */
	EAttribute getVerified_Result();

	/**
	 * Returns the meta object for class '{@link raaml.hara.Confirmed <em>Confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confirmed</em>'.
	 * @see raaml.hara.Confirmed
	 * @generated
	 */
	EClass getConfirmed();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hara.Confirmed#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see raaml.hara.Confirmed#getResult()
	 * @see #getConfirmed()
	 * @generated
	 */
	EAttribute getConfirmed_Result();

	/**
	 * Returns the meta object for class '{@link raaml.hara.ASILAssignment <em>ASIL Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASIL Assignment</em>'.
	 * @see raaml.hara.ASILAssignment
	 * @generated
	 */
	EClass getASILAssignment();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hara.ASILAssignment#getASIL <em>ASIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ASIL</em>'.
	 * @see raaml.hara.ASILAssignment#getASIL()
	 * @see #getASILAssignment()
	 * @generated
	 */
	EAttribute getASILAssignment_ASIL();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hara.ASILAssignment#getASILOverride <em>ASIL Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ASIL Override</em>'.
	 * @see raaml.hara.ASILAssignment#getASILOverride()
	 * @see #getASILAssignment()
	 * @generated
	 */
	EAttribute getASILAssignment_ASILOverride();

	/**
	 * Returns the meta object for class '{@link raaml.hara.OperationalCondition <em>Operational Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Condition</em>'.
	 * @see raaml.hara.OperationalCondition
	 * @generated
	 */
	EClass getOperationalCondition();

	/**
	 * Returns the meta object for class '{@link raaml.hara.AbstractOperationalSituation <em>Abstract Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Operational Situation</em>'.
	 * @see raaml.hara.AbstractOperationalSituation
	 * @generated
	 */
	EClass getAbstractOperationalSituation();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hara.AbstractOperationalSituation#getExposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure</em>'.
	 * @see raaml.hara.AbstractOperationalSituation#getExposure()
	 * @see #getAbstractOperationalSituation()
	 * @generated
	 */
	EAttribute getAbstractOperationalSituation_Exposure();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.AbstractOperationalSituation#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see raaml.hara.AbstractOperationalSituation#getConditions()
	 * @see #getAbstractOperationalSituation()
	 * @generated
	 */
	EReference getAbstractOperationalSituation_Conditions();

	/**
	 * Returns the meta object for class '{@link raaml.hara.AccidentScenario <em>Accident Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accident Scenario</em>'.
	 * @see raaml.hara.AccidentScenario
	 * @generated
	 */
	EClass getAccidentScenario();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hara.AccidentScenario#getControllability <em>Controllability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controllability</em>'.
	 * @see raaml.hara.AccidentScenario#getControllability()
	 * @see #getAccidentScenario()
	 * @generated
	 */
	EAttribute getAccidentScenario_Controllability();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.AccidentScenario#getSituations <em>Situations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Situations</em>'.
	 * @see raaml.hara.AccidentScenario#getSituations()
	 * @see #getAccidentScenario()
	 * @generated
	 */
	EReference getAccidentScenario_Situations();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.AccidentScenario#getMalfunctioningBehaviors <em>Malfunctioning Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Malfunctioning Behaviors</em>'.
	 * @see raaml.hara.AccidentScenario#getMalfunctioningBehaviors()
	 * @see #getAccidentScenario()
	 * @generated
	 */
	EReference getAccidentScenario_MalfunctioningBehaviors();

	/**
	 * Returns the meta object for class '{@link raaml.hara.AnyMalfunction <em>Any Malfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Malfunction</em>'.
	 * @see raaml.hara.AnyMalfunction
	 * @generated
	 */
	EClass getAnyMalfunction();

	/**
	 * Returns the meta object for class '{@link raaml.hara.HazardousEvent <em>Hazardous Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazardous Event</em>'.
	 * @see raaml.hara.HazardousEvent
	 * @generated
	 */
	EClass getHazardousEvent();

	/**
	 * Returns the meta object for the attribute list '{@link raaml.hara.HazardousEvent#getASIL <em>ASIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>ASIL</em>'.
	 * @see raaml.hara.HazardousEvent#getASIL()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EAttribute getHazardousEvent_ASIL();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.HazardousEvent#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazards</em>'.
	 * @see raaml.hara.HazardousEvent#getHazards()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_Hazards();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.HazardousEvent#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see raaml.hara.HazardousEvent#getScenarios()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_Scenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.HazardousEvent#getVehicleLevelEffects <em>Vehicle Level Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle Level Effects</em>'.
	 * @see raaml.hara.HazardousEvent#getVehicleLevelEffects()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_VehicleLevelEffects();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.HazardousEvent#getSystemLevelEffects <em>System Level Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Level Effects</em>'.
	 * @see raaml.hara.HazardousEvent#getSystemLevelEffects()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_SystemLevelEffects();

	/**
	 * Returns the meta object for class '{@link raaml.hara.AutomotiveEffect <em>Automotive Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automotive Effect</em>'.
	 * @see raaml.hara.AutomotiveEffect
	 * @generated
	 */
	EClass getAutomotiveEffect();

	/**
	 * Returns the meta object for class '{@link raaml.hara.SystemLevelEffect <em>System Level Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Level Effect</em>'.
	 * @see raaml.hara.SystemLevelEffect
	 * @generated
	 */
	EClass getSystemLevelEffect();

	/**
	 * Returns the meta object for class '{@link raaml.hara.VehicleLevelEffect <em>Vehicle Level Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Level Effect</em>'.
	 * @see raaml.hara.VehicleLevelEffect
	 * @generated
	 */
	EClass getVehicleLevelEffect();

	/**
	 * Returns the meta object for class '{@link raaml.hara.ISO26262Library <em>ISO26262 Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO26262 Library</em>'.
	 * @see raaml.hara.ISO26262Library
	 * @generated
	 */
	EClass getISO26262Library();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262Library#getOperationalConditions <em>Operational Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operational Conditions</em>'.
	 * @see raaml.hara.ISO26262Library#getOperationalConditions()
	 * @see #getISO26262Library()
	 * @generated
	 */
	EReference getISO26262Library_OperationalConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262Library#getHazardousEvents <em>Hazardous Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazardous Events</em>'.
	 * @see raaml.hara.ISO26262Library#getHazardousEvents()
	 * @see #getISO26262Library()
	 * @generated
	 */
	EReference getISO26262Library_HazardousEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hara.ISO26262Library#getAccidentScenarios <em>Accident Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accident Scenarios</em>'.
	 * @see raaml.hara.ISO26262Library#getAccidentScenarios()
	 * @see #getISO26262Library()
	 * @generated
	 */
	EReference getISO26262Library_AccidentScenarios();

	/**
	 * Returns the meta object for enum '{@link raaml.hara.ASIL <em>ASIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ASIL</em>'.
	 * @see raaml.hara.ASIL
	 * @generated
	 */
	EEnum getASIL();

	/**
	 * Returns the meta object for enum '{@link raaml.hara.Controllability <em>Controllability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Controllability</em>'.
	 * @see raaml.hara.Controllability
	 * @generated
	 */
	EEnum getControllability();

	/**
	 * Returns the meta object for enum '{@link raaml.hara.Exposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exposure</em>'.
	 * @see raaml.hara.Exposure
	 * @generated
	 */
	EEnum getExposure();

	/**
	 * Returns the meta object for enum '{@link raaml.hara.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see raaml.hara.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HaraFactory getHaraFactory();

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
		 * The meta object literal for the '{@link raaml.hara.impl.ISO26262Impl <em>ISO26262</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.ISO26262Impl
		 * @see raaml.hara.impl.HaraPackageImpl#getISO26262()
		 * @generated
		 */
		EClass ISO26262 = eINSTANCE.getISO26262();

		/**
		 * The meta object literal for the '<em><b>Malfunctioning Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262__MALFUNCTIONING_BEHAVIORS = eINSTANCE.getISO26262_MalfunctioningBehaviors();

		/**
		 * The meta object literal for the '<em><b>Operational Situations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262__OPERATIONAL_SITUATIONS = eINSTANCE.getISO26262_OperationalSituations();

		/**
		 * The meta object literal for the '<em><b>Confirmed Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262__CONFIRMED_ITEMS = eINSTANCE.getISO26262_ConfirmedItems();

		/**
		 * The meta object literal for the '<em><b>Verified Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262__VERIFIED_ITEMS = eINSTANCE.getISO26262_VerifiedItems();

		/**
		 * The meta object literal for the '<em><b>Asil Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262__ASIL_ASSIGNMENTS = eINSTANCE.getISO26262_AsilAssignments();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.OperationalSituationImpl <em>Operational Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.OperationalSituationImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getOperationalSituation()
		 * @generated
		 */
		EClass OPERATIONAL_SITUATION = eINSTANCE.getOperationalSituation();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.MalfunctioningBehaviourImpl <em>Malfunctioning Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.MalfunctioningBehaviourImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getMalfunctioningBehaviour()
		 * @generated
		 */
		EClass MALFUNCTIONING_BEHAVIOUR = eINSTANCE.getMalfunctioningBehaviour();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.VerifiedImpl <em>Verified</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.VerifiedImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getVerified()
		 * @generated
		 */
		EClass VERIFIED = eINSTANCE.getVerified();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFIED__RESULT = eINSTANCE.getVerified_Result();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.ConfirmedImpl <em>Confirmed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.ConfirmedImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getConfirmed()
		 * @generated
		 */
		EClass CONFIRMED = eINSTANCE.getConfirmed();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIRMED__RESULT = eINSTANCE.getConfirmed_Result();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.ASILAssignmentImpl <em>ASIL Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.ASILAssignmentImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getASILAssignment()
		 * @generated
		 */
		EClass ASIL_ASSIGNMENT = eINSTANCE.getASILAssignment();

		/**
		 * The meta object literal for the '<em><b>ASIL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIL_ASSIGNMENT__ASIL = eINSTANCE.getASILAssignment_ASIL();

		/**
		 * The meta object literal for the '<em><b>ASIL Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIL_ASSIGNMENT__ASIL_OVERRIDE = eINSTANCE.getASILAssignment_ASILOverride();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.OperationalConditionImpl <em>Operational Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.OperationalConditionImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getOperationalCondition()
		 * @generated
		 */
		EClass OPERATIONAL_CONDITION = eINSTANCE.getOperationalCondition();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.AbstractOperationalSituationImpl <em>Abstract Operational Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.AbstractOperationalSituationImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getAbstractOperationalSituation()
		 * @generated
		 */
		EClass ABSTRACT_OPERATIONAL_SITUATION = eINSTANCE.getAbstractOperationalSituation();

		/**
		 * The meta object literal for the '<em><b>Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE = eINSTANCE.getAbstractOperationalSituation_Exposure();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS = eINSTANCE.getAbstractOperationalSituation_Conditions();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.AccidentScenarioImpl <em>Accident Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.AccidentScenarioImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getAccidentScenario()
		 * @generated
		 */
		EClass ACCIDENT_SCENARIO = eINSTANCE.getAccidentScenario();

		/**
		 * The meta object literal for the '<em><b>Controllability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCIDENT_SCENARIO__CONTROLLABILITY = eINSTANCE.getAccidentScenario_Controllability();

		/**
		 * The meta object literal for the '<em><b>Situations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCIDENT_SCENARIO__SITUATIONS = eINSTANCE.getAccidentScenario_Situations();

		/**
		 * The meta object literal for the '<em><b>Malfunctioning Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS = eINSTANCE.getAccidentScenario_MalfunctioningBehaviors();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.AnyMalfunctionImpl <em>Any Malfunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.AnyMalfunctionImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getAnyMalfunction()
		 * @generated
		 */
		EClass ANY_MALFUNCTION = eINSTANCE.getAnyMalfunction();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.HazardousEventImpl <em>Hazardous Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.HazardousEventImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getHazardousEvent()
		 * @generated
		 */
		EClass HAZARDOUS_EVENT = eINSTANCE.getHazardousEvent();

		/**
		 * The meta object literal for the '<em><b>ASIL</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_EVENT__ASIL = eINSTANCE.getHazardousEvent_ASIL();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__HAZARDS = eINSTANCE.getHazardousEvent_Hazards();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__SCENARIOS = eINSTANCE.getHazardousEvent_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Vehicle Level Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS = eINSTANCE.getHazardousEvent_VehicleLevelEffects();

		/**
		 * The meta object literal for the '<em><b>System Level Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS = eINSTANCE.getHazardousEvent_SystemLevelEffects();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.AutomotiveEffectImpl <em>Automotive Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.AutomotiveEffectImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getAutomotiveEffect()
		 * @generated
		 */
		EClass AUTOMOTIVE_EFFECT = eINSTANCE.getAutomotiveEffect();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.SystemLevelEffectImpl <em>System Level Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.SystemLevelEffectImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getSystemLevelEffect()
		 * @generated
		 */
		EClass SYSTEM_LEVEL_EFFECT = eINSTANCE.getSystemLevelEffect();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.VehicleLevelEffectImpl <em>Vehicle Level Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.VehicleLevelEffectImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getVehicleLevelEffect()
		 * @generated
		 */
		EClass VEHICLE_LEVEL_EFFECT = eINSTANCE.getVehicleLevelEffect();

		/**
		 * The meta object literal for the '{@link raaml.hara.impl.ISO26262LibraryImpl <em>ISO26262 Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.impl.ISO26262LibraryImpl
		 * @see raaml.hara.impl.HaraPackageImpl#getISO26262Library()
		 * @generated
		 */
		EClass ISO26262_LIBRARY = eINSTANCE.getISO26262Library();

		/**
		 * The meta object literal for the '<em><b>Operational Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262_LIBRARY__OPERATIONAL_CONDITIONS = eINSTANCE.getISO26262Library_OperationalConditions();

		/**
		 * The meta object literal for the '<em><b>Hazardous Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262_LIBRARY__HAZARDOUS_EVENTS = eINSTANCE.getISO26262Library_HazardousEvents();

		/**
		 * The meta object literal for the '<em><b>Accident Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO26262_LIBRARY__ACCIDENT_SCENARIOS = eINSTANCE.getISO26262Library_AccidentScenarios();

		/**
		 * The meta object literal for the '{@link raaml.hara.ASIL <em>ASIL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.ASIL
		 * @see raaml.hara.impl.HaraPackageImpl#getASIL()
		 * @generated
		 */
		EEnum ASIL = eINSTANCE.getASIL();

		/**
		 * The meta object literal for the '{@link raaml.hara.Controllability <em>Controllability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.Controllability
		 * @see raaml.hara.impl.HaraPackageImpl#getControllability()
		 * @generated
		 */
		EEnum CONTROLLABILITY = eINSTANCE.getControllability();

		/**
		 * The meta object literal for the '{@link raaml.hara.Exposure <em>Exposure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.Exposure
		 * @see raaml.hara.impl.HaraPackageImpl#getExposure()
		 * @generated
		 */
		EEnum EXPOSURE = eINSTANCE.getExposure();

		/**
		 * The meta object literal for the '{@link raaml.hara.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hara.Severity
		 * @see raaml.hara.impl.HaraPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} //HaraPackage
