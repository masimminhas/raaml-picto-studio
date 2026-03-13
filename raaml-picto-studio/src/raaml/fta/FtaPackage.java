/**
 */
package raaml.fta;

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
 * Fault Tree Analysis elements for top-down deductive failure analysis
 * <!-- end-model-doc -->
 * @see raaml.fta.FtaFactory
 * @model kind="package"
 * @generated
 */
public interface FtaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/fta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.fta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtaPackage eINSTANCE = raaml.fta.impl.FtaPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.fta.impl.FTAImpl <em>FTA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.FTAImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getFTA()
	 * @generated
	 */
	int FTA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__ID = CorePackage.ANALYSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__NAME = CorePackage.ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__DESCRIPTION = CorePackage.ANALYSIS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__VISIBILITY = CorePackage.ANALYSIS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__ELEMENTS = CorePackage.ANALYSIS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__GATES = CorePackage.ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__EVENTS = CorePackage.ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA__TREES = CorePackage.ANALYSIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_FEATURE_COUNT = CorePackage.ANALYSIS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_OPERATION_COUNT = CorePackage.ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.FTAElementImpl <em>FTA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.FTAElementImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getFTAElement()
	 * @generated
	 */
	int FTA_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__ID = CorePackage.DYSFUNCTIONAL_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__NAME = CorePackage.DYSFUNCTIONAL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__DESCRIPTION = CorePackage.DYSFUNCTIONAL_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__VISIBILITY = CorePackage.DYSFUNCTIONAL_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__FROM = CorePackage.DYSFUNCTIONAL_EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__TO = CorePackage.DYSFUNCTIONAL_EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__LIKELIHOOD = CorePackage.DYSFUNCTIONAL_EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__TO_ERROR = CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__FROM_ERROR = CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__ERROR = CorePackage.DYSFUNCTIONAL_EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__FAILURE = CorePackage.DYSFUNCTIONAL_EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__FAULT = CorePackage.DYSFUNCTIONAL_EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__PROBABILITY = CorePackage.DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__SOURCE_GATE = CorePackage.DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FTA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT_FEATURE_COUNT = CorePackage.DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FTA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT_OPERATION_COUNT = CorePackage.DYSFUNCTIONAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.EventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = FTA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = FTA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VISIBILITY = FTA_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FROM = FTA_ELEMENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TO = FTA_ELEMENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LIKELIHOOD = FTA_ELEMENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TO_ERROR = FTA_ELEMENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FROM_ERROR = FTA_ELEMENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ERROR = FTA_ELEMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FAILURE = FTA_ELEMENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FAULT = FTA_ELEMENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROBABILITY = FTA_ELEMENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SOURCE_GATE = FTA_ELEMENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TARGET_GATE = FTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INHIBIT_GATE = FTA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FTA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = FTA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.BasicEventImpl <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.BasicEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.IntermediateEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getIntermediateEvent()
	 * @generated
	 */
	int INTERMEDIATE_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.TopEventImpl <em>Top Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.TopEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getTopEvent()
	 * @generated
	 */
	int TOP_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>Top Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.ConditionalEventImpl <em>Conditional Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.ConditionalEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getConditionalEvent()
	 * @generated
	 */
	int CONDITIONAL_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>Conditional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conditional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.DormantEventImpl <em>Dormant Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.DormantEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getDormantEvent()
	 * @generated
	 */
	int DORMANT_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>Dormant Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dormant Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORMANT_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.UndevelopedEventImpl <em>Undeveloped Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.UndevelopedEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getUndevelopedEvent()
	 * @generated
	 */
	int UNDEVELOPED_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>Undeveloped Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undeveloped Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.HouseEventImpl <em>House Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.HouseEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getHouseEvent()
	 * @generated
	 */
	int HOUSE_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>House Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>House Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.ZeroEventImpl <em>Zero Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.ZeroEventImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getZeroEvent()
	 * @generated
	 */
	int ZERO_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__FROM = EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__TO = EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__LIKELIHOOD = EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__TO_ERROR = EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__FROM_ERROR = EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__ERROR = EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__FAILURE = EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__FAULT = EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__PROBABILITY = EVENT__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Source Gate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__SOURCE_GATE = EVENT__SOURCE_GATE;

	/**
	 * The feature id for the '<em><b>Target Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__TARGET_GATE = EVENT__TARGET_GATE;

	/**
	 * The feature id for the '<em><b>Inhibit Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT__INHIBIT_GATE = EVENT__INHIBIT_GATE;

	/**
	 * The number of structural features of the '<em>Zero Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zero Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.GateImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__SOURCE_EVENT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__TARGET_EVENT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.ANDImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getAND()
	 * @generated
	 */
	int AND = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__VISIBILITY = GATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SOURCE_EVENT = GATE__SOURCE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__TARGET_EVENT = GATE__TARGET_EVENT;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.ORImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getOR()
	 * @generated
	 */
	int OR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__VISIBILITY = GATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SOURCE_EVENT = GATE__SOURCE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__TARGET_EVENT = GATE__TARGET_EVENT;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.NOTImpl <em>NOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.NOTImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getNOT()
	 * @generated
	 */
	int NOT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__VISIBILITY = GATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__SOURCE_EVENT = GATE__SOURCE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__TARGET_EVENT = GATE__TARGET_EVENT;

	/**
	 * The number of structural features of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.XORImpl <em>XOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.XORImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getXOR()
	 * @generated
	 */
	int XOR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__VISIBILITY = GATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__SOURCE_EVENT = GATE__SOURCE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__TARGET_EVENT = GATE__TARGET_EVENT;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.SEQImpl <em>SEQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.SEQImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getSEQ()
	 * @generated
	 */
	int SEQ = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__VISIBILITY = GATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__SOURCE_EVENT = GATE__SOURCE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__TARGET_EVENT = GATE__TARGET_EVENT;

	/**
	 * The number of structural features of the '<em>SEQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SEQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.INHIBITImpl <em>INHIBIT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.INHIBITImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getINHIBIT()
	 * @generated
	 */
	int INHIBIT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__VISIBILITY = GATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__SOURCE_EVENT = GATE__SOURCE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__TARGET_EVENT = GATE__TARGET_EVENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT__CONDITION = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>INHIBIT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_FEATURE_COUNT = GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>INHIBIT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.MAJORITY_VOTEImpl <em>MAJORITY VOTE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.MAJORITY_VOTEImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getMAJORITY_VOTE()
	 * @generated
	 */
	int MAJORITY_VOTE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE__ID = GATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE__VISIBILITY = GATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE__SOURCE_EVENT = GATE__SOURCE_EVENT;

	/**
	 * The feature id for the '<em><b>Target Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE__TARGET_EVENT = GATE__TARGET_EVENT;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE__M = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MAJORITY VOTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE_FEATURE_COUNT = GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MAJORITY VOTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORITY_VOTE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.FTATreeImpl <em>FTA Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.FTATreeImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getFTATree()
	 * @generated
	 */
	int FTA_TREE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Top Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE__TOP_EVENT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE__GATES = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FTA Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FTA Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_TREE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fta.impl.FTALibraryImpl <em>FTA Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fta.impl.FTALibraryImpl
	 * @see raaml.fta.impl.FtaPackageImpl#getFTALibrary()
	 * @generated
	 */
	int FTA_LIBRARY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY__ID = CorePackage.ABSTRACT_LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY__NAME = CorePackage.ABSTRACT_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY__DESCRIPTION = CorePackage.ABSTRACT_LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY__VISIBILITY = CorePackage.ABSTRACT_LIBRARY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY__ELEMENTS = CorePackage.ABSTRACT_LIBRARY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Fta Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY__FTA_ELEMENTS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY__GATES = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FTA Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY_FEATURE_COUNT = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FTA Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_LIBRARY_OPERATION_COUNT = CorePackage.ABSTRACT_LIBRARY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link raaml.fta.FTA <em>FTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA</em>'.
	 * @see raaml.fta.FTA
	 * @generated
	 */
	EClass getFTA();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fta.FTA#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see raaml.fta.FTA#getGates()
	 * @see #getFTA()
	 * @generated
	 */
	EReference getFTA_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fta.FTA#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see raaml.fta.FTA#getEvents()
	 * @see #getFTA()
	 * @generated
	 */
	EReference getFTA_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fta.FTA#getTrees <em>Trees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trees</em>'.
	 * @see raaml.fta.FTA#getTrees()
	 * @see #getFTA()
	 * @generated
	 */
	EReference getFTA_Trees();

	/**
	 * Returns the meta object for class '{@link raaml.fta.FTAElement <em>FTA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA Element</em>'.
	 * @see raaml.fta.FTAElement
	 * @generated
	 */
	EClass getFTAElement();

	/**
	 * Returns the meta object for the attribute '{@link raaml.fta.FTAElement#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see raaml.fta.FTAElement#getProbability()
	 * @see #getFTAElement()
	 * @generated
	 */
	EAttribute getFTAElement_Probability();

	/**
	 * Returns the meta object for the container reference '{@link raaml.fta.FTAElement#getSourceGate <em>Source Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Gate</em>'.
	 * @see raaml.fta.FTAElement#getSourceGate()
	 * @see #getFTAElement()
	 * @generated
	 */
	EReference getFTAElement_SourceGate();

	/**
	 * Returns the meta object for class '{@link raaml.fta.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see raaml.fta.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link raaml.fta.Event#getTargetGate <em>Target Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Gate</em>'.
	 * @see raaml.fta.Event#getTargetGate()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_TargetGate();

	/**
	 * Returns the meta object for the reference list '{@link raaml.fta.Event#getInhibitGate <em>Inhibit Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inhibit Gate</em>'.
	 * @see raaml.fta.Event#getInhibitGate()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_InhibitGate();

	/**
	 * Returns the meta object for class '{@link raaml.fta.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see raaml.fta.BasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event</em>'.
	 * @see raaml.fta.IntermediateEvent
	 * @generated
	 */
	EClass getIntermediateEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.TopEvent <em>Top Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Event</em>'.
	 * @see raaml.fta.TopEvent
	 * @generated
	 */
	EClass getTopEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.ConditionalEvent <em>Conditional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Event</em>'.
	 * @see raaml.fta.ConditionalEvent
	 * @generated
	 */
	EClass getConditionalEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.DormantEvent <em>Dormant Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dormant Event</em>'.
	 * @see raaml.fta.DormantEvent
	 * @generated
	 */
	EClass getDormantEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.UndevelopedEvent <em>Undeveloped Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undeveloped Event</em>'.
	 * @see raaml.fta.UndevelopedEvent
	 * @generated
	 */
	EClass getUndevelopedEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.HouseEvent <em>House Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House Event</em>'.
	 * @see raaml.fta.HouseEvent
	 * @generated
	 */
	EClass getHouseEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.ZeroEvent <em>Zero Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zero Event</em>'.
	 * @see raaml.fta.ZeroEvent
	 * @generated
	 */
	EClass getZeroEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see raaml.fta.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fta.Gate#getSourceEvent <em>Source Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Event</em>'.
	 * @see raaml.fta.Gate#getSourceEvent()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_SourceEvent();

	/**
	 * Returns the meta object for the reference '{@link raaml.fta.Gate#getTargetEvent <em>Target Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Event</em>'.
	 * @see raaml.fta.Gate#getTargetEvent()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_TargetEvent();

	/**
	 * Returns the meta object for class '{@link raaml.fta.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see raaml.fta.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for class '{@link raaml.fta.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see raaml.fta.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for class '{@link raaml.fta.NOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT</em>'.
	 * @see raaml.fta.NOT
	 * @generated
	 */
	EClass getNOT();

	/**
	 * Returns the meta object for class '{@link raaml.fta.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR</em>'.
	 * @see raaml.fta.XOR
	 * @generated
	 */
	EClass getXOR();

	/**
	 * Returns the meta object for class '{@link raaml.fta.SEQ <em>SEQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEQ</em>'.
	 * @see raaml.fta.SEQ
	 * @generated
	 */
	EClass getSEQ();

	/**
	 * Returns the meta object for class '{@link raaml.fta.INHIBIT <em>INHIBIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INHIBIT</em>'.
	 * @see raaml.fta.INHIBIT
	 * @generated
	 */
	EClass getINHIBIT();

	/**
	 * Returns the meta object for the reference list '{@link raaml.fta.INHIBIT#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see raaml.fta.INHIBIT#getCondition()
	 * @see #getINHIBIT()
	 * @generated
	 */
	EReference getINHIBIT_Condition();

	/**
	 * Returns the meta object for class '{@link raaml.fta.MAJORITY_VOTE <em>MAJORITY VOTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAJORITY VOTE</em>'.
	 * @see raaml.fta.MAJORITY_VOTE
	 * @generated
	 */
	EClass getMAJORITY_VOTE();

	/**
	 * Returns the meta object for the attribute '{@link raaml.fta.MAJORITY_VOTE#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see raaml.fta.MAJORITY_VOTE#getM()
	 * @see #getMAJORITY_VOTE()
	 * @generated
	 */
	EAttribute getMAJORITY_VOTE_M();

	/**
	 * Returns the meta object for class '{@link raaml.fta.FTATree <em>FTA Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA Tree</em>'.
	 * @see raaml.fta.FTATree
	 * @generated
	 */
	EClass getFTATree();

	/**
	 * Returns the meta object for the containment reference '{@link raaml.fta.FTATree#getTopEvent <em>Top Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top Event</em>'.
	 * @see raaml.fta.FTATree#getTopEvent()
	 * @see #getFTATree()
	 * @generated
	 */
	EReference getFTATree_TopEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fta.FTATree#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see raaml.fta.FTATree#getGates()
	 * @see #getFTATree()
	 * @generated
	 */
	EReference getFTATree_Gates();

	/**
	 * Returns the meta object for class '{@link raaml.fta.FTALibrary <em>FTA Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA Library</em>'.
	 * @see raaml.fta.FTALibrary
	 * @generated
	 */
	EClass getFTALibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fta.FTALibrary#getFtaElements <em>Fta Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fta Elements</em>'.
	 * @see raaml.fta.FTALibrary#getFtaElements()
	 * @see #getFTALibrary()
	 * @generated
	 */
	EReference getFTALibrary_FtaElements();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fta.FTALibrary#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see raaml.fta.FTALibrary#getGates()
	 * @see #getFTALibrary()
	 * @generated
	 */
	EReference getFTALibrary_Gates();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FtaFactory getFtaFactory();

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
		 * The meta object literal for the '{@link raaml.fta.impl.FTAImpl <em>FTA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.FTAImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getFTA()
		 * @generated
		 */
		EClass FTA = eINSTANCE.getFTA();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA__GATES = eINSTANCE.getFTA_Gates();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA__EVENTS = eINSTANCE.getFTA_Events();

		/**
		 * The meta object literal for the '<em><b>Trees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA__TREES = eINSTANCE.getFTA_Trees();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.FTAElementImpl <em>FTA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.FTAElementImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getFTAElement()
		 * @generated
		 */
		EClass FTA_ELEMENT = eINSTANCE.getFTAElement();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTA_ELEMENT__PROBABILITY = eINSTANCE.getFTAElement_Probability();

		/**
		 * The meta object literal for the '<em><b>Source Gate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_ELEMENT__SOURCE_GATE = eINSTANCE.getFTAElement_SourceGate();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.EventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Target Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TARGET_GATE = eINSTANCE.getEvent_TargetGate();

		/**
		 * The meta object literal for the '<em><b>Inhibit Gate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INHIBIT_GATE = eINSTANCE.getEvent_InhibitGate();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.BasicEventImpl <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.BasicEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.IntermediateEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getIntermediateEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_EVENT = eINSTANCE.getIntermediateEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.TopEventImpl <em>Top Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.TopEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getTopEvent()
		 * @generated
		 */
		EClass TOP_EVENT = eINSTANCE.getTopEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.ConditionalEventImpl <em>Conditional Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.ConditionalEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getConditionalEvent()
		 * @generated
		 */
		EClass CONDITIONAL_EVENT = eINSTANCE.getConditionalEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.DormantEventImpl <em>Dormant Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.DormantEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getDormantEvent()
		 * @generated
		 */
		EClass DORMANT_EVENT = eINSTANCE.getDormantEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.UndevelopedEventImpl <em>Undeveloped Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.UndevelopedEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getUndevelopedEvent()
		 * @generated
		 */
		EClass UNDEVELOPED_EVENT = eINSTANCE.getUndevelopedEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.HouseEventImpl <em>House Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.HouseEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getHouseEvent()
		 * @generated
		 */
		EClass HOUSE_EVENT = eINSTANCE.getHouseEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.ZeroEventImpl <em>Zero Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.ZeroEventImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getZeroEvent()
		 * @generated
		 */
		EClass ZERO_EVENT = eINSTANCE.getZeroEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.GateImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Source Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__SOURCE_EVENT = eINSTANCE.getGate_SourceEvent();

		/**
		 * The meta object literal for the '<em><b>Target Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__TARGET_EVENT = eINSTANCE.getGate_TargetEvent();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.ANDImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.ORImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.NOTImpl <em>NOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.NOTImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getNOT()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNOT();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.XORImpl <em>XOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.XORImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getXOR()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOR();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.SEQImpl <em>SEQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.SEQImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getSEQ()
		 * @generated
		 */
		EClass SEQ = eINSTANCE.getSEQ();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.INHIBITImpl <em>INHIBIT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.INHIBITImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getINHIBIT()
		 * @generated
		 */
		EClass INHIBIT = eINSTANCE.getINHIBIT();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHIBIT__CONDITION = eINSTANCE.getINHIBIT_Condition();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.MAJORITY_VOTEImpl <em>MAJORITY VOTE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.MAJORITY_VOTEImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getMAJORITY_VOTE()
		 * @generated
		 */
		EClass MAJORITY_VOTE = eINSTANCE.getMAJORITY_VOTE();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAJORITY_VOTE__M = eINSTANCE.getMAJORITY_VOTE_M();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.FTATreeImpl <em>FTA Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.FTATreeImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getFTATree()
		 * @generated
		 */
		EClass FTA_TREE = eINSTANCE.getFTATree();

		/**
		 * The meta object literal for the '<em><b>Top Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_TREE__TOP_EVENT = eINSTANCE.getFTATree_TopEvent();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_TREE__GATES = eINSTANCE.getFTATree_Gates();

		/**
		 * The meta object literal for the '{@link raaml.fta.impl.FTALibraryImpl <em>FTA Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fta.impl.FTALibraryImpl
		 * @see raaml.fta.impl.FtaPackageImpl#getFTALibrary()
		 * @generated
		 */
		EClass FTA_LIBRARY = eINSTANCE.getFTALibrary();

		/**
		 * The meta object literal for the '<em><b>Fta Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_LIBRARY__FTA_ELEMENTS = eINSTANCE.getFTALibrary_FtaElements();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_LIBRARY__GATES = eINSTANCE.getFTALibrary_Gates();

	}

} //FtaPackage
