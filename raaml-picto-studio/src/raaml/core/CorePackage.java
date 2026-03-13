/**
 */
package raaml.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * Core elements shared across all safety analysis types
 * <!-- end-model-doc -->
 * @see raaml.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = raaml.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.NamedElementImpl
	 * @see raaml.core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VISIBILITY = 3;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AnalysisImpl
	 * @see raaml.core.impl.CorePackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AbstractLibraryImpl <em>Abstract Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AbstractLibraryImpl
	 * @see raaml.core.impl.CorePackageImpl#getAbstractLibrary()
	 * @generated
	 */
	int ABSTRACT_LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIBRARY__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIBRARY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIBRARY__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIBRARY__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIBRARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.CoreSafetyElementImpl <em>Safety Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.CoreSafetyElementImpl
	 * @see raaml.core.impl.CorePackageImpl#getCoreSafetyElement()
	 * @generated
	 */
	int CORE_SAFETY_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_SAFETY_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_SAFETY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_SAFETY_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_SAFETY_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Safety Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_SAFETY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safety Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_SAFETY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.SituationImpl <em>Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.SituationImpl
	 * @see raaml.core.impl.CorePackageImpl#getSituation()
	 * @generated
	 */
	int SITUATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__ID = CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__NAME = CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__DESCRIPTION = CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__VISIBILITY = CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_FEATURE_COUNT = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_OPERATION_COUNT = CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.FailureModeImpl <em>Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.FailureModeImpl
	 * @see raaml.core.impl.CorePackageImpl#getFailureMode()
	 * @generated
	 */
	int FAILURE_MODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__ID = SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__NAME = SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__DESCRIPTION = SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__VISIBILITY = SITUATION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_FEATURE_COUNT = SITUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_OPERATION_COUNT = SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.HazardImpl
	 * @see raaml.core.impl.CorePackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ID = SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NAME = SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__DESCRIPTION = SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__VISIBILITY = SITUATION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = SITUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_OPERATION_COUNT = SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ErrorImpl
	 * @see raaml.core.impl.CorePackageImpl#getError()
	 * @generated
	 */
	int ERROR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ID = SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__NAME = SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DESCRIPTION = SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__VISIBILITY = SITUATION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = SITUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_OPERATION_COUNT = SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.FaultImpl <em>Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.FaultImpl
	 * @see raaml.core.impl.CorePackageImpl#getFault()
	 * @generated
	 */
	int FAULT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__ID = SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__NAME = SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__DESCRIPTION = SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__VISIBILITY = SITUATION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FEATURE_COUNT = SITUATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_OPERATION_COUNT = SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ControllingMeasureImpl <em>Controlling Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ControllingMeasureImpl
	 * @see raaml.core.impl.CorePackageImpl#getControllingMeasure()
	 * @generated
	 */
	int CONTROLLING_MEASURE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_MEASURE__ID = CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_MEASURE__NAME = CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_MEASURE__DESCRIPTION = CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_MEASURE__VISIBILITY = CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_MEASURE__AFFECTS = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controlling Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_MEASURE_FEATURE_COUNT = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controlling Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_MEASURE_OPERATION_COUNT = CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.DetectionImpl <em>Detection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.DetectionImpl
	 * @see raaml.core.impl.CorePackageImpl#getDetection()
	 * @generated
	 */
	int DETECTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTION__ID = CONTROLLING_MEASURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTION__NAME = CONTROLLING_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTION__DESCRIPTION = CONTROLLING_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTION__VISIBILITY = CONTROLLING_MEASURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTION__AFFECTS = CONTROLLING_MEASURE__AFFECTS;

	/**
	 * The number of structural features of the '<em>Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTION_FEATURE_COUNT = CONTROLLING_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Detection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTION_OPERATION_COUNT = CONTROLLING_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.RecommendationImpl <em>Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.RecommendationImpl
	 * @see raaml.core.impl.CorePackageImpl#getRecommendation()
	 * @generated
	 */
	int RECOMMENDATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__ID = CONTROLLING_MEASURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__NAME = CONTROLLING_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__DESCRIPTION = CONTROLLING_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__VISIBILITY = CONTROLLING_MEASURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__AFFECTS = CONTROLLING_MEASURE__AFFECTS;

	/**
	 * The number of structural features of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_FEATURE_COUNT = CONTROLLING_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_OPERATION_COUNT = CONTROLLING_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.MitigationImpl <em>Mitigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.MitigationImpl
	 * @see raaml.core.impl.CorePackageImpl#getMitigation()
	 * @generated
	 */
	int MITIGATION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION__ID = CONTROLLING_MEASURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION__NAME = CONTROLLING_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION__DESCRIPTION = CONTROLLING_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION__VISIBILITY = CONTROLLING_MEASURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION__AFFECTS = CONTROLLING_MEASURE__AFFECTS;

	/**
	 * The number of structural features of the '<em>Mitigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_FEATURE_COUNT = CONTROLLING_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mitigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATION_OPERATION_COUNT = CONTROLLING_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.PreventionImpl <em>Prevention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.PreventionImpl
	 * @see raaml.core.impl.CorePackageImpl#getPrevention()
	 * @generated
	 */
	int PREVENTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTION__ID = CONTROLLING_MEASURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTION__NAME = CONTROLLING_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTION__DESCRIPTION = CONTROLLING_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTION__VISIBILITY = CONTROLLING_MEASURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTION__AFFECTS = CONTROLLING_MEASURE__AFFECTS;

	/**
	 * The number of structural features of the '<em>Prevention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTION_FEATURE_COUNT = CONTROLLING_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prevention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTION_OPERATION_COUNT = CONTROLLING_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.StateImpl
	 * @see raaml.core.impl.CorePackageImpl#getState()
	 * @generated
	 */
	int STATE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTION = CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VISIBILITY = CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.FailureStateImpl <em>Failure State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.FailureStateImpl
	 * @see raaml.core.impl.CorePackageImpl#getFailureState()
	 * @generated
	 */
	int FAILURE_STATE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_STATE__ID = STATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_STATE__DESCRIPTION = STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_STATE__VISIBILITY = STATE__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Failure State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.DirectedRelationshipImpl
	 * @see raaml.core.impl.CorePackageImpl#getDirectedRelationship()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__ID = CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__NAME = CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__DESCRIPTION = CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__VISIBILITY = CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_FEATURE_COUNT = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_OPERATION_COUNT = CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.RelevantToImpl <em>Relevant To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.RelevantToImpl
	 * @see raaml.core.impl.CorePackageImpl#getRelevantTo()
	 * @generated
	 */
	int RELEVANT_TO = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO__ID = DIRECTED_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO__DESCRIPTION = DIRECTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO__VISIBILITY = DIRECTED_RELATIONSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Relevant To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relevant To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_TO_OPERATION_COUNT = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.PresentInImpl <em>Present In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.PresentInImpl
	 * @see raaml.core.impl.CorePackageImpl#getPresentIn()
	 * @generated
	 */
	int PRESENT_IN = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN__ID = RELEVANT_TO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN__NAME = RELEVANT_TO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN__DESCRIPTION = RELEVANT_TO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN__VISIBILITY = RELEVANT_TO__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN__SOURCE = RELEVANT_TO__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN__TARGET = RELEVANT_TO__TARGET;

	/**
	 * The number of structural features of the '<em>Present In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN_FEATURE_COUNT = RELEVANT_TO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Present In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENT_IN_OPERATION_COUNT = RELEVANT_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ViolatesImpl <em>Violates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ViolatesImpl
	 * @see raaml.core.impl.CorePackageImpl#getViolates()
	 * @generated
	 */
	int VIOLATES = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES__ID = DIRECTED_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES__DESCRIPTION = DIRECTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES__VISIBILITY = DIRECTED_RELATIONSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Violates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Violates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATES_OPERATION_COUNT = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ItemImpl
	 * @see raaml.core.impl.CorePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VISIBILITY = CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MEMBERS = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BOUNDARY_MEMBERS = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.SingleElementItemImpl <em>Single Element Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.SingleElementItemImpl
	 * @see raaml.core.impl.CorePackageImpl#getSingleElementItem()
	 * @generated
	 */
	int SINGLE_ELEMENT_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM__ID = ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM__VISIBILITY = ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM__MEMBERS = ITEM__MEMBERS;

	/**
	 * The feature id for the '<em><b>Boundary Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM__BOUNDARY_MEMBERS = ITEM__BOUNDARY_MEMBERS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM__REFERENCED_ELEMENT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Element Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Element Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ElementGroupImpl <em>Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ElementGroupImpl
	 * @see raaml.core.impl.CorePackageImpl#getElementGroup()
	 * @generated
	 */
	int ELEMENT_GROUP = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__ID = CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__NAME = CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__DESCRIPTION = CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__VISIBILITY = CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Group Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__GROUP_CRITERION = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__ORDERED_MEMBERS = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_FEATURE_COUNT = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_OPERATION_COUNT = CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ElementGroupBasedItemImpl <em>Element Group Based Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ElementGroupBasedItemImpl
	 * @see raaml.core.impl.CorePackageImpl#getElementGroupBasedItem()
	 * @generated
	 */
	int ELEMENT_GROUP_BASED_ITEM = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__ID = ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__VISIBILITY = ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__MEMBERS = ITEM__MEMBERS;

	/**
	 * The feature id for the '<em><b>Boundary Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__BOUNDARY_MEMBERS = ITEM__BOUNDARY_MEMBERS;

	/**
	 * The feature id for the '<em><b>Group Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Group Based Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Group Based Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_BASED_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AnySituationImpl <em>Any Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AnySituationImpl
	 * @see raaml.core.impl.CorePackageImpl#getAnySituation()
	 * @generated
	 */
	int ANY_SITUATION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION__ID = SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION__NAME = SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION__DESCRIPTION = SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION__VISIBILITY = SITUATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION__FROM = SITUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION__TO = SITUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Any Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION_FEATURE_COUNT = SITUATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Any Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_SITUATION_OPERATION_COUNT = SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.FactorImpl
	 * @see raaml.core.impl.CorePackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__ID = ANY_SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__NAME = ANY_SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__DESCRIPTION = ANY_SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__VISIBILITY = ANY_SITUATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__FROM = ANY_SITUATION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__TO = ANY_SITUATION__TO;

	/**
	 * The feature id for the '<em><b>Process Model Flaw</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__PROCESS_MODEL_FLAW = ANY_SITUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = ANY_SITUATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_OPERATION_COUNT = ANY_SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ProcessModelFlawImpl <em>Process Model Flaw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ProcessModelFlawImpl
	 * @see raaml.core.impl.CorePackageImpl#getProcessModelFlaw()
	 * @generated
	 */
	int PROCESS_MODEL_FLAW = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__ID = ANY_SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__NAME = ANY_SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__DESCRIPTION = ANY_SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__VISIBILITY = ANY_SITUATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__FROM = ANY_SITUATION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__TO = ANY_SITUATION__TO;

	/**
	 * The feature id for the '<em><b>Causal Factor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__CAUSAL_FACTOR = ANY_SITUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undesired Control Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION = ANY_SITUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Model Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW_FEATURE_COUNT = ANY_SITUATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process Model Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FLAW_OPERATION_COUNT = ANY_SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.HarmPotentialImpl <em>Harm Potential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.HarmPotentialImpl
	 * @see raaml.core.impl.CorePackageImpl#getHarmPotential()
	 * @generated
	 */
	int HARM_POTENTIAL = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARM_POTENTIAL__ID = CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARM_POTENTIAL__NAME = CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARM_POTENTIAL__DESCRIPTION = CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARM_POTENTIAL__VISIBILITY = CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Undesired Control Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Harm Potential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARM_POTENTIAL_FEATURE_COUNT = CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Harm Potential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARM_POTENTIAL_OPERATION_COUNT = CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AbstractEventImpl
	 * @see raaml.core.impl.CorePackageImpl#getAbstractEvent()
	 * @generated
	 */
	int ABSTRACT_EVENT = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__ID = ANY_SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__NAME = ANY_SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__DESCRIPTION = ANY_SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__VISIBILITY = ANY_SITUATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__FROM = ANY_SITUATION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__TO = ANY_SITUATION__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT__LIKELIHOOD = ANY_SITUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_FEATURE_COUNT = ANY_SITUATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_OPERATION_COUNT = ANY_SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.DysfunctionalEventImpl <em>Dysfunctional Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.DysfunctionalEventImpl
	 * @see raaml.core.impl.CorePackageImpl#getDysfunctionalEvent()
	 * @generated
	 */
	int DYSFUNCTIONAL_EVENT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__ID = ABSTRACT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__NAME = ABSTRACT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__DESCRIPTION = ABSTRACT_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__VISIBILITY = ABSTRACT_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__FROM = ABSTRACT_EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__TO = ABSTRACT_EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__LIKELIHOOD = ABSTRACT_EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__TO_ERROR = ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__FROM_ERROR = ABSTRACT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__ERROR = ABSTRACT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__FAILURE = ABSTRACT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT__FAULT = ABSTRACT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dysfunctional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT_FEATURE_COUNT = ABSTRACT_EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dysfunctional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYSFUNCTIONAL_EVENT_OPERATION_COUNT = ABSTRACT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AbstractEffectImpl <em>Abstract Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AbstractEffectImpl
	 * @see raaml.core.impl.CorePackageImpl#getAbstractEffect()
	 * @generated
	 */
	int ABSTRACT_EFFECT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__ID = DYSFUNCTIONAL_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__NAME = DYSFUNCTIONAL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__DESCRIPTION = DYSFUNCTIONAL_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__VISIBILITY = DYSFUNCTIONAL_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__FROM = DYSFUNCTIONAL_EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__TO = DYSFUNCTIONAL_EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__LIKELIHOOD = DYSFUNCTIONAL_EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__TO_ERROR = DYSFUNCTIONAL_EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__FROM_ERROR = DYSFUNCTIONAL_EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__ERROR = DYSFUNCTIONAL_EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__FAILURE = DYSFUNCTIONAL_EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__FAULT = DYSFUNCTIONAL_EVENT__FAULT;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT__SEVERITY = DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT_FEATURE_COUNT = DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EFFECT_OPERATION_COUNT = DYSFUNCTIONAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.UndesiredStateImpl <em>Undesired State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.UndesiredStateImpl
	 * @see raaml.core.impl.CorePackageImpl#getUndesiredState()
	 * @generated
	 */
	int UNDESIRED_STATE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__ID = DYSFUNCTIONAL_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__NAME = DYSFUNCTIONAL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__DESCRIPTION = DYSFUNCTIONAL_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__VISIBILITY = DYSFUNCTIONAL_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__FROM = DYSFUNCTIONAL_EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__TO = DYSFUNCTIONAL_EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__LIKELIHOOD = DYSFUNCTIONAL_EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__TO_ERROR = DYSFUNCTIONAL_EVENT__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__FROM_ERROR = DYSFUNCTIONAL_EVENT__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__ERROR = DYSFUNCTIONAL_EVENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__FAILURE = DYSFUNCTIONAL_EVENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE__FAULT = DYSFUNCTIONAL_EVENT__FAULT;

	/**
	 * The number of structural features of the '<em>Undesired State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE_FEATURE_COUNT = DYSFUNCTIONAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undesired State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRED_STATE_OPERATION_COUNT = DYSFUNCTIONAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AbstractFailureModeImpl <em>Abstract Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AbstractFailureModeImpl
	 * @see raaml.core.impl.CorePackageImpl#getAbstractFailureMode()
	 * @generated
	 */
	int ABSTRACT_FAILURE_MODE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__ID = UNDESIRED_STATE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__NAME = UNDESIRED_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__DESCRIPTION = UNDESIRED_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__VISIBILITY = UNDESIRED_STATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__FROM = UNDESIRED_STATE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__TO = UNDESIRED_STATE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__LIKELIHOOD = UNDESIRED_STATE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__TO_ERROR = UNDESIRED_STATE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__FROM_ERROR = UNDESIRED_STATE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__ERROR = UNDESIRED_STATE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__FAILURE = UNDESIRED_STATE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__FAULT = UNDESIRED_STATE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE__DETECTABILITY = UNDESIRED_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE_FEATURE_COUNT = UNDESIRED_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FAILURE_MODE_OPERATION_COUNT = UNDESIRED_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AbstractCauseImpl <em>Abstract Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AbstractCauseImpl
	 * @see raaml.core.impl.CorePackageImpl#getAbstractCause()
	 * @generated
	 */
	int ABSTRACT_CAUSE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__ID = ABSTRACT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__NAME = ABSTRACT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__DESCRIPTION = ABSTRACT_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__VISIBILITY = ABSTRACT_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__FROM = ABSTRACT_EVENT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__TO = ABSTRACT_EVENT__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__LIKELIHOOD = ABSTRACT_EVENT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>Process Model Flaw</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__PROCESS_MODEL_FLAW = ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__OCCURRENCE = ABSTRACT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE__ERROR = ABSTRACT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE_FEATURE_COUNT = ABSTRACT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CAUSE_OPERATION_COUNT = ABSTRACT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.ScenarioImpl
	 * @see raaml.core.impl.CorePackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID = ANY_SITUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = ANY_SITUATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = ANY_SITUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VISIBILITY = ANY_SITUATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__FROM = ANY_SITUATION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TO = ANY_SITUATION__TO;

	/**
	 * The feature id for the '<em><b>Scenario Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_STEPS = ANY_SITUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TRIGGERS = ANY_SITUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = ANY_SITUATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = ANY_SITUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.core.impl.AbstractRiskImpl <em>Abstract Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.core.impl.AbstractRiskImpl
	 * @see raaml.core.impl.CorePackageImpl#getAbstractRisk()
	 * @generated
	 */
	int ABSTRACT_RISK = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__ID = SCENARIO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__NAME = SCENARIO__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__DESCRIPTION = SCENARIO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__VISIBILITY = SCENARIO__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__FROM = SCENARIO__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__TO = SCENARIO__TO;

	/**
	 * The feature id for the '<em><b>Scenario Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__SCENARIO_STEPS = SCENARIO__SCENARIO_STEPS;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__TRIGGERS = SCENARIO__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Risk Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__RISK_SCORE = SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Harm Potentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__HARM_POTENTIALS = SCENARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Harms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK__HARMS = SCENARIO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK_FEATURE_COUNT = SCENARIO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RISK_OPERATION_COUNT = SCENARIO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link raaml.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see raaml.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see raaml.core.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see raaml.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see raaml.core.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.NamedElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see raaml.core.NamedElement#getVisibility()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Visibility();

	/**
	 * Returns the meta object for class '{@link raaml.core.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see raaml.core.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.core.Analysis#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see raaml.core.Analysis#getElements()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Elements();

	/**
	 * Returns the meta object for class '{@link raaml.core.AbstractLibrary <em>Abstract Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Library</em>'.
	 * @see raaml.core.AbstractLibrary
	 * @generated
	 */
	EClass getAbstractLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.core.AbstractLibrary#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see raaml.core.AbstractLibrary#getElements()
	 * @see #getAbstractLibrary()
	 * @generated
	 */
	EReference getAbstractLibrary_Elements();

	/**
	 * Returns the meta object for class '{@link raaml.core.CoreSafetyElement <em>Safety Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Element</em>'.
	 * @see raaml.core.CoreSafetyElement
	 * @generated
	 */
	EClass getCoreSafetyElement();

	/**
	 * Returns the meta object for class '{@link raaml.core.Situation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation</em>'.
	 * @see raaml.core.Situation
	 * @generated
	 */
	EClass getSituation();

	/**
	 * Returns the meta object for class '{@link raaml.core.FailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode</em>'.
	 * @see raaml.core.FailureMode
	 * @generated
	 */
	EClass getFailureMode();

	/**
	 * Returns the meta object for class '{@link raaml.core.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see raaml.core.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for class '{@link raaml.core.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see raaml.core.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for class '{@link raaml.core.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault</em>'.
	 * @see raaml.core.Fault
	 * @generated
	 */
	EClass getFault();

	/**
	 * Returns the meta object for class '{@link raaml.core.ControllingMeasure <em>Controlling Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlling Measure</em>'.
	 * @see raaml.core.ControllingMeasure
	 * @generated
	 */
	EClass getControllingMeasure();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.ControllingMeasure#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affects</em>'.
	 * @see raaml.core.ControllingMeasure#getAffects()
	 * @see #getControllingMeasure()
	 * @generated
	 */
	EAttribute getControllingMeasure_Affects();

	/**
	 * Returns the meta object for class '{@link raaml.core.Detection <em>Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detection</em>'.
	 * @see raaml.core.Detection
	 * @generated
	 */
	EClass getDetection();

	/**
	 * Returns the meta object for class '{@link raaml.core.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation</em>'.
	 * @see raaml.core.Recommendation
	 * @generated
	 */
	EClass getRecommendation();

	/**
	 * Returns the meta object for class '{@link raaml.core.Mitigation <em>Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mitigation</em>'.
	 * @see raaml.core.Mitigation
	 * @generated
	 */
	EClass getMitigation();

	/**
	 * Returns the meta object for class '{@link raaml.core.Prevention <em>Prevention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prevention</em>'.
	 * @see raaml.core.Prevention
	 * @generated
	 */
	EClass getPrevention();

	/**
	 * Returns the meta object for class '{@link raaml.core.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see raaml.core.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link raaml.core.FailureState <em>Failure State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure State</em>'.
	 * @see raaml.core.FailureState
	 * @generated
	 */
	EClass getFailureState();

	/**
	 * Returns the meta object for class '{@link raaml.core.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see raaml.core.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.DirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see raaml.core.DirectedRelationship#getSource()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.DirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see raaml.core.DirectedRelationship#getTarget()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Target();

	/**
	 * Returns the meta object for class '{@link raaml.core.RelevantTo <em>Relevant To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relevant To</em>'.
	 * @see raaml.core.RelevantTo
	 * @generated
	 */
	EClass getRelevantTo();

	/**
	 * Returns the meta object for class '{@link raaml.core.PresentIn <em>Present In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Present In</em>'.
	 * @see raaml.core.PresentIn
	 * @generated
	 */
	EClass getPresentIn();

	/**
	 * Returns the meta object for class '{@link raaml.core.Violates <em>Violates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violates</em>'.
	 * @see raaml.core.Violates
	 * @generated
	 */
	EClass getViolates();

	/**
	 * Returns the meta object for class '{@link raaml.core.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see raaml.core.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.Item#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see raaml.core.Item#getMembers()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Members();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.Item#getBoundaryMembers <em>Boundary Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boundary Members</em>'.
	 * @see raaml.core.Item#getBoundaryMembers()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_BoundaryMembers();

	/**
	 * Returns the meta object for class '{@link raaml.core.SingleElementItem <em>Single Element Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element Item</em>'.
	 * @see raaml.core.SingleElementItem
	 * @generated
	 */
	EClass getSingleElementItem();

	/**
	 * Returns the meta object for the reference '{@link raaml.core.SingleElementItem#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see raaml.core.SingleElementItem#getReferencedElement()
	 * @see #getSingleElementItem()
	 * @generated
	 */
	EReference getSingleElementItem_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link raaml.core.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group</em>'.
	 * @see raaml.core.ElementGroup
	 * @generated
	 */
	EClass getElementGroup();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.ElementGroup#getGroupCriterion <em>Group Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Criterion</em>'.
	 * @see raaml.core.ElementGroup#getGroupCriterion()
	 * @see #getElementGroup()
	 * @generated
	 */
	EAttribute getElementGroup_GroupCriterion();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.ElementGroup#getOrderedMembers <em>Ordered Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ordered Members</em>'.
	 * @see raaml.core.ElementGroup#getOrderedMembers()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_OrderedMembers();

	/**
	 * Returns the meta object for class '{@link raaml.core.ElementGroupBasedItem <em>Element Group Based Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group Based Item</em>'.
	 * @see raaml.core.ElementGroupBasedItem
	 * @generated
	 */
	EClass getElementGroupBasedItem();

	/**
	 * Returns the meta object for class '{@link raaml.core.AnySituation <em>Any Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Situation</em>'.
	 * @see raaml.core.AnySituation
	 * @generated
	 */
	EClass getAnySituation();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.AnySituation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see raaml.core.AnySituation#getFrom()
	 * @see #getAnySituation()
	 * @generated
	 */
	EReference getAnySituation_From();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.AnySituation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see raaml.core.AnySituation#getTo()
	 * @see #getAnySituation()
	 * @generated
	 */
	EReference getAnySituation_To();

	/**
	 * Returns the meta object for class '{@link raaml.core.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see raaml.core.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.Factor#getProcessModelFlaw <em>Process Model Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Model Flaw</em>'.
	 * @see raaml.core.Factor#getProcessModelFlaw()
	 * @see #getFactor()
	 * @generated
	 */
	EReference getFactor_ProcessModelFlaw();

	/**
	 * Returns the meta object for class '{@link raaml.core.ProcessModelFlaw <em>Process Model Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Model Flaw</em>'.
	 * @see raaml.core.ProcessModelFlaw
	 * @generated
	 */
	EClass getProcessModelFlaw();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.ProcessModelFlaw#getCausalFactor <em>Causal Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Causal Factor</em>'.
	 * @see raaml.core.ProcessModelFlaw#getCausalFactor()
	 * @see #getProcessModelFlaw()
	 * @generated
	 */
	EReference getProcessModelFlaw_CausalFactor();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.ProcessModelFlaw#getUndesiredControlAction <em>Undesired Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Undesired Control Action</em>'.
	 * @see raaml.core.ProcessModelFlaw#getUndesiredControlAction()
	 * @see #getProcessModelFlaw()
	 * @generated
	 */
	EReference getProcessModelFlaw_UndesiredControlAction();

	/**
	 * Returns the meta object for class '{@link raaml.core.HarmPotential <em>Harm Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Harm Potential</em>'.
	 * @see raaml.core.HarmPotential
	 * @generated
	 */
	EClass getHarmPotential();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.HarmPotential#getUndesiredControlAction <em>Undesired Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Undesired Control Action</em>'.
	 * @see raaml.core.HarmPotential#getUndesiredControlAction()
	 * @see #getHarmPotential()
	 * @generated
	 */
	EReference getHarmPotential_UndesiredControlAction();

	/**
	 * Returns the meta object for class '{@link raaml.core.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Event</em>'.
	 * @see raaml.core.AbstractEvent
	 * @generated
	 */
	EClass getAbstractEvent();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.AbstractEvent#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see raaml.core.AbstractEvent#getLikelihood()
	 * @see #getAbstractEvent()
	 * @generated
	 */
	EAttribute getAbstractEvent_Likelihood();

	/**
	 * Returns the meta object for class '{@link raaml.core.DysfunctionalEvent <em>Dysfunctional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dysfunctional Event</em>'.
	 * @see raaml.core.DysfunctionalEvent
	 * @generated
	 */
	EClass getDysfunctionalEvent();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.DysfunctionalEvent#getToError <em>To Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Error</em>'.
	 * @see raaml.core.DysfunctionalEvent#getToError()
	 * @see #getDysfunctionalEvent()
	 * @generated
	 */
	EReference getDysfunctionalEvent_ToError();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.DysfunctionalEvent#getFromError <em>From Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Error</em>'.
	 * @see raaml.core.DysfunctionalEvent#getFromError()
	 * @see #getDysfunctionalEvent()
	 * @generated
	 */
	EReference getDysfunctionalEvent_FromError();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.DysfunctionalEvent#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error</em>'.
	 * @see raaml.core.DysfunctionalEvent#getError()
	 * @see #getDysfunctionalEvent()
	 * @generated
	 */
	EReference getDysfunctionalEvent_Error();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.DysfunctionalEvent#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure</em>'.
	 * @see raaml.core.DysfunctionalEvent#getFailure()
	 * @see #getDysfunctionalEvent()
	 * @generated
	 */
	EReference getDysfunctionalEvent_Failure();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.DysfunctionalEvent#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fault</em>'.
	 * @see raaml.core.DysfunctionalEvent#getFault()
	 * @see #getDysfunctionalEvent()
	 * @generated
	 */
	EReference getDysfunctionalEvent_Fault();

	/**
	 * Returns the meta object for class '{@link raaml.core.AbstractEffect <em>Abstract Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Effect</em>'.
	 * @see raaml.core.AbstractEffect
	 * @generated
	 */
	EClass getAbstractEffect();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.AbstractEffect#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see raaml.core.AbstractEffect#getSeverity()
	 * @see #getAbstractEffect()
	 * @generated
	 */
	EAttribute getAbstractEffect_Severity();

	/**
	 * Returns the meta object for class '{@link raaml.core.UndesiredState <em>Undesired State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undesired State</em>'.
	 * @see raaml.core.UndesiredState
	 * @generated
	 */
	EClass getUndesiredState();

	/**
	 * Returns the meta object for class '{@link raaml.core.AbstractFailureMode <em>Abstract Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Failure Mode</em>'.
	 * @see raaml.core.AbstractFailureMode
	 * @generated
	 */
	EClass getAbstractFailureMode();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.AbstractFailureMode#getDetectability <em>Detectability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detectability</em>'.
	 * @see raaml.core.AbstractFailureMode#getDetectability()
	 * @see #getAbstractFailureMode()
	 * @generated
	 */
	EAttribute getAbstractFailureMode_Detectability();

	/**
	 * Returns the meta object for class '{@link raaml.core.AbstractCause <em>Abstract Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cause</em>'.
	 * @see raaml.core.AbstractCause
	 * @generated
	 */
	EClass getAbstractCause();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.AbstractCause#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see raaml.core.AbstractCause#getOccurrence()
	 * @see #getAbstractCause()
	 * @generated
	 */
	EAttribute getAbstractCause_Occurrence();

	/**
	 * Returns the meta object for the reference list '{@link raaml.core.AbstractCause#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error</em>'.
	 * @see raaml.core.AbstractCause#getError()
	 * @see #getAbstractCause()
	 * @generated
	 */
	EReference getAbstractCause_Error();

	/**
	 * Returns the meta object for class '{@link raaml.core.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see raaml.core.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.core.Scenario#getScenarioSteps <em>Scenario Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Steps</em>'.
	 * @see raaml.core.Scenario#getScenarioSteps()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ScenarioSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.core.Scenario#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see raaml.core.Scenario#getTriggers()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Triggers();

	/**
	 * Returns the meta object for class '{@link raaml.core.AbstractRisk <em>Abstract Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Risk</em>'.
	 * @see raaml.core.AbstractRisk
	 * @generated
	 */
	EClass getAbstractRisk();

	/**
	 * Returns the meta object for the attribute '{@link raaml.core.AbstractRisk#getRiskScore <em>Risk Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Score</em>'.
	 * @see raaml.core.AbstractRisk#getRiskScore()
	 * @see #getAbstractRisk()
	 * @generated
	 */
	EAttribute getAbstractRisk_RiskScore();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.core.AbstractRisk#getHarmPotentials <em>Harm Potentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Harm Potentials</em>'.
	 * @see raaml.core.AbstractRisk#getHarmPotentials()
	 * @see #getAbstractRisk()
	 * @generated
	 */
	EReference getAbstractRisk_HarmPotentials();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.core.AbstractRisk#getHarms <em>Harms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Harms</em>'.
	 * @see raaml.core.AbstractRisk#getHarms()
	 * @see #getAbstractRisk()
	 * @generated
	 */
	EReference getAbstractRisk_Harms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link raaml.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.NamedElementImpl
		 * @see raaml.core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VISIBILITY = eINSTANCE.getNamedElement_Visibility();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AnalysisImpl
		 * @see raaml.core.impl.CorePackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__ELEMENTS = eINSTANCE.getAnalysis_Elements();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AbstractLibraryImpl <em>Abstract Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AbstractLibraryImpl
		 * @see raaml.core.impl.CorePackageImpl#getAbstractLibrary()
		 * @generated
		 */
		EClass ABSTRACT_LIBRARY = eINSTANCE.getAbstractLibrary();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LIBRARY__ELEMENTS = eINSTANCE.getAbstractLibrary_Elements();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.CoreSafetyElementImpl <em>Safety Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.CoreSafetyElementImpl
		 * @see raaml.core.impl.CorePackageImpl#getCoreSafetyElement()
		 * @generated
		 */
		EClass CORE_SAFETY_ELEMENT = eINSTANCE.getCoreSafetyElement();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.SituationImpl <em>Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.SituationImpl
		 * @see raaml.core.impl.CorePackageImpl#getSituation()
		 * @generated
		 */
		EClass SITUATION = eINSTANCE.getSituation();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.FailureModeImpl <em>Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.FailureModeImpl
		 * @see raaml.core.impl.CorePackageImpl#getFailureMode()
		 * @generated
		 */
		EClass FAILURE_MODE = eINSTANCE.getFailureMode();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.HazardImpl
		 * @see raaml.core.impl.CorePackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ErrorImpl
		 * @see raaml.core.impl.CorePackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.FaultImpl <em>Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.FaultImpl
		 * @see raaml.core.impl.CorePackageImpl#getFault()
		 * @generated
		 */
		EClass FAULT = eINSTANCE.getFault();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ControllingMeasureImpl <em>Controlling Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ControllingMeasureImpl
		 * @see raaml.core.impl.CorePackageImpl#getControllingMeasure()
		 * @generated
		 */
		EClass CONTROLLING_MEASURE = eINSTANCE.getControllingMeasure();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLING_MEASURE__AFFECTS = eINSTANCE.getControllingMeasure_Affects();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.DetectionImpl <em>Detection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.DetectionImpl
		 * @see raaml.core.impl.CorePackageImpl#getDetection()
		 * @generated
		 */
		EClass DETECTION = eINSTANCE.getDetection();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.RecommendationImpl <em>Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.RecommendationImpl
		 * @see raaml.core.impl.CorePackageImpl#getRecommendation()
		 * @generated
		 */
		EClass RECOMMENDATION = eINSTANCE.getRecommendation();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.MitigationImpl <em>Mitigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.MitigationImpl
		 * @see raaml.core.impl.CorePackageImpl#getMitigation()
		 * @generated
		 */
		EClass MITIGATION = eINSTANCE.getMitigation();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.PreventionImpl <em>Prevention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.PreventionImpl
		 * @see raaml.core.impl.CorePackageImpl#getPrevention()
		 * @generated
		 */
		EClass PREVENTION = eINSTANCE.getPrevention();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.StateImpl
		 * @see raaml.core.impl.CorePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.FailureStateImpl <em>Failure State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.FailureStateImpl
		 * @see raaml.core.impl.CorePackageImpl#getFailureState()
		 * @generated
		 */
		EClass FAILURE_STATE = eINSTANCE.getFailureState();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.DirectedRelationshipImpl
		 * @see raaml.core.impl.CorePackageImpl#getDirectedRelationship()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getDirectedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getDirectedRelationship_Target();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.RelevantToImpl <em>Relevant To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.RelevantToImpl
		 * @see raaml.core.impl.CorePackageImpl#getRelevantTo()
		 * @generated
		 */
		EClass RELEVANT_TO = eINSTANCE.getRelevantTo();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.PresentInImpl <em>Present In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.PresentInImpl
		 * @see raaml.core.impl.CorePackageImpl#getPresentIn()
		 * @generated
		 */
		EClass PRESENT_IN = eINSTANCE.getPresentIn();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ViolatesImpl <em>Violates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ViolatesImpl
		 * @see raaml.core.impl.CorePackageImpl#getViolates()
		 * @generated
		 */
		EClass VIOLATES = eINSTANCE.getViolates();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ItemImpl
		 * @see raaml.core.impl.CorePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__MEMBERS = eINSTANCE.getItem_Members();

		/**
		 * The meta object literal for the '<em><b>Boundary Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__BOUNDARY_MEMBERS = eINSTANCE.getItem_BoundaryMembers();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.SingleElementItemImpl <em>Single Element Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.SingleElementItemImpl
		 * @see raaml.core.impl.CorePackageImpl#getSingleElementItem()
		 * @generated
		 */
		EClass SINGLE_ELEMENT_ITEM = eINSTANCE.getSingleElementItem();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT_ITEM__REFERENCED_ELEMENT = eINSTANCE.getSingleElementItem_ReferencedElement();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ElementGroupImpl <em>Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ElementGroupImpl
		 * @see raaml.core.impl.CorePackageImpl#getElementGroup()
		 * @generated
		 */
		EClass ELEMENT_GROUP = eINSTANCE.getElementGroup();

		/**
		 * The meta object literal for the '<em><b>Group Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUP__GROUP_CRITERION = eINSTANCE.getElementGroup_GroupCriterion();

		/**
		 * The meta object literal for the '<em><b>Ordered Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__ORDERED_MEMBERS = eINSTANCE.getElementGroup_OrderedMembers();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ElementGroupBasedItemImpl <em>Element Group Based Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ElementGroupBasedItemImpl
		 * @see raaml.core.impl.CorePackageImpl#getElementGroupBasedItem()
		 * @generated
		 */
		EClass ELEMENT_GROUP_BASED_ITEM = eINSTANCE.getElementGroupBasedItem();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AnySituationImpl <em>Any Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AnySituationImpl
		 * @see raaml.core.impl.CorePackageImpl#getAnySituation()
		 * @generated
		 */
		EClass ANY_SITUATION = eINSTANCE.getAnySituation();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_SITUATION__FROM = eINSTANCE.getAnySituation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_SITUATION__TO = eINSTANCE.getAnySituation_To();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.FactorImpl
		 * @see raaml.core.impl.CorePackageImpl#getFactor()
		 * @generated
		 */
		EClass FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '<em><b>Process Model Flaw</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTOR__PROCESS_MODEL_FLAW = eINSTANCE.getFactor_ProcessModelFlaw();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ProcessModelFlawImpl <em>Process Model Flaw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ProcessModelFlawImpl
		 * @see raaml.core.impl.CorePackageImpl#getProcessModelFlaw()
		 * @generated
		 */
		EClass PROCESS_MODEL_FLAW = eINSTANCE.getProcessModelFlaw();

		/**
		 * The meta object literal for the '<em><b>Causal Factor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL_FLAW__CAUSAL_FACTOR = eINSTANCE.getProcessModelFlaw_CausalFactor();

		/**
		 * The meta object literal for the '<em><b>Undesired Control Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION = eINSTANCE.getProcessModelFlaw_UndesiredControlAction();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.HarmPotentialImpl <em>Harm Potential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.HarmPotentialImpl
		 * @see raaml.core.impl.CorePackageImpl#getHarmPotential()
		 * @generated
		 */
		EClass HARM_POTENTIAL = eINSTANCE.getHarmPotential();

		/**
		 * The meta object literal for the '<em><b>Undesired Control Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION = eINSTANCE.getHarmPotential_UndesiredControlAction();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AbstractEventImpl
		 * @see raaml.core.impl.CorePackageImpl#getAbstractEvent()
		 * @generated
		 */
		EClass ABSTRACT_EVENT = eINSTANCE.getAbstractEvent();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EVENT__LIKELIHOOD = eINSTANCE.getAbstractEvent_Likelihood();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.DysfunctionalEventImpl <em>Dysfunctional Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.DysfunctionalEventImpl
		 * @see raaml.core.impl.CorePackageImpl#getDysfunctionalEvent()
		 * @generated
		 */
		EClass DYSFUNCTIONAL_EVENT = eINSTANCE.getDysfunctionalEvent();

		/**
		 * The meta object literal for the '<em><b>To Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYSFUNCTIONAL_EVENT__TO_ERROR = eINSTANCE.getDysfunctionalEvent_ToError();

		/**
		 * The meta object literal for the '<em><b>From Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYSFUNCTIONAL_EVENT__FROM_ERROR = eINSTANCE.getDysfunctionalEvent_FromError();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYSFUNCTIONAL_EVENT__ERROR = eINSTANCE.getDysfunctionalEvent_Error();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYSFUNCTIONAL_EVENT__FAILURE = eINSTANCE.getDysfunctionalEvent_Failure();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYSFUNCTIONAL_EVENT__FAULT = eINSTANCE.getDysfunctionalEvent_Fault();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AbstractEffectImpl <em>Abstract Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AbstractEffectImpl
		 * @see raaml.core.impl.CorePackageImpl#getAbstractEffect()
		 * @generated
		 */
		EClass ABSTRACT_EFFECT = eINSTANCE.getAbstractEffect();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EFFECT__SEVERITY = eINSTANCE.getAbstractEffect_Severity();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.UndesiredStateImpl <em>Undesired State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.UndesiredStateImpl
		 * @see raaml.core.impl.CorePackageImpl#getUndesiredState()
		 * @generated
		 */
		EClass UNDESIRED_STATE = eINSTANCE.getUndesiredState();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AbstractFailureModeImpl <em>Abstract Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AbstractFailureModeImpl
		 * @see raaml.core.impl.CorePackageImpl#getAbstractFailureMode()
		 * @generated
		 */
		EClass ABSTRACT_FAILURE_MODE = eINSTANCE.getAbstractFailureMode();

		/**
		 * The meta object literal for the '<em><b>Detectability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FAILURE_MODE__DETECTABILITY = eINSTANCE.getAbstractFailureMode_Detectability();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AbstractCauseImpl <em>Abstract Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AbstractCauseImpl
		 * @see raaml.core.impl.CorePackageImpl#getAbstractCause()
		 * @generated
		 */
		EClass ABSTRACT_CAUSE = eINSTANCE.getAbstractCause();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CAUSE__OCCURRENCE = eINSTANCE.getAbstractCause_Occurrence();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CAUSE__ERROR = eINSTANCE.getAbstractCause_Error();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.ScenarioImpl
		 * @see raaml.core.impl.CorePackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SCENARIO_STEPS = eINSTANCE.getScenario_ScenarioSteps();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__TRIGGERS = eINSTANCE.getScenario_Triggers();

		/**
		 * The meta object literal for the '{@link raaml.core.impl.AbstractRiskImpl <em>Abstract Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.core.impl.AbstractRiskImpl
		 * @see raaml.core.impl.CorePackageImpl#getAbstractRisk()
		 * @generated
		 */
		EClass ABSTRACT_RISK = eINSTANCE.getAbstractRisk();

		/**
		 * The meta object literal for the '<em><b>Risk Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RISK__RISK_SCORE = eINSTANCE.getAbstractRisk_RiskScore();

		/**
		 * The meta object literal for the '<em><b>Harm Potentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RISK__HARM_POTENTIALS = eINSTANCE.getAbstractRisk_HarmPotentials();

		/**
		 * The meta object literal for the '<em><b>Harms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RISK__HARMS = eINSTANCE.getAbstractRisk_Harms();

	}

} //CorePackage
