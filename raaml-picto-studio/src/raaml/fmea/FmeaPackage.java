/**
 */
package raaml.fmea;

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
 * FMEA elements for bottom-up failure mode analysis
 * <!-- end-model-doc -->
 * @see raaml.fmea.FmeaFactory
 * @model kind="package"
 * @generated
 */
public interface FmeaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fmea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/fmea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.fmea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmeaPackage eINSTANCE = raaml.fmea.impl.FmeaPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.FMEAImpl <em>FMEA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.FMEAImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getFMEA()
	 * @generated
	 */
	int FMEA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__ID = CorePackage.ANALYSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__NAME = CorePackage.ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__DESCRIPTION = CorePackage.ANALYSIS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__VISIBILITY = CorePackage.ANALYSIS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__ELEMENTS = CorePackage.ANALYSIS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Fmea Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__FMEA_ITEMS = CorePackage.ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMEA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_FEATURE_COUNT = CorePackage.ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FMEA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_OPERATION_COUNT = CorePackage.ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.RPNCalculationImpl <em>RPN Calculation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.RPNCalculationImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getRPNCalculation()
	 * @generated
	 */
	int RPN_CALCULATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>RPN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__RPN = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SEV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__SEV = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>OCC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__OCC = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION__DET = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>RPN Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>RPN Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPN_CALCULATION_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.AbstractFMEAItemImpl <em>Abstract FMEA Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.AbstractFMEAItemImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getAbstractFMEAItem()
	 * @generated
	 */
	int ABSTRACT_FMEA_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>RPN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__RPN = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__FAILURE_MODE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__FINAL_EFFECT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM__CAUSE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FMEA_ITEM_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.FMEAItemImpl <em>FMEA Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.FMEAItemImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getFMEAItem()
	 * @generated
	 */
	int FMEA_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__ID = ABSTRACT_FMEA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__NAME = ABSTRACT_FMEA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__DESCRIPTION = ABSTRACT_FMEA_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__VISIBILITY = ABSTRACT_FMEA_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>RPN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__RPN = ABSTRACT_FMEA_ITEM__RPN;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__FAILURE_MODE = ABSTRACT_FMEA_ITEM__FAILURE_MODE;

	/**
	 * The feature id for the '<em><b>Final Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__FINAL_EFFECT = ABSTRACT_FMEA_ITEM__FINAL_EFFECT;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__CAUSE = ABSTRACT_FMEA_ITEM__CAUSE;

	/**
	 * The feature id for the '<em><b>Rpn Calculation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__RPN_CALCULATION = ABSTRACT_FMEA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM_FEATURE_COUNT = ABSTRACT_FMEA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM_OPERATION_COUNT = ABSTRACT_FMEA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.LossOfFunctionImpl <em>Loss Of Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.LossOfFunctionImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getLossOfFunction()
	 * @generated
	 */
	int LOSS_OF_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__ID = CorePackage.ABSTRACT_FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__NAME = CorePackage.ABSTRACT_FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__DESCRIPTION = CorePackage.ABSTRACT_FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__VISIBILITY = CorePackage.ABSTRACT_FAILURE_MODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__FROM = CorePackage.ABSTRACT_FAILURE_MODE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__TO = CorePackage.ABSTRACT_FAILURE_MODE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__LIKELIHOOD = CorePackage.ABSTRACT_FAILURE_MODE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__TO_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__FROM_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__ERROR = CorePackage.ABSTRACT_FAILURE_MODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__FAILURE = CorePackage.ABSTRACT_FAILURE_MODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__FAULT = CorePackage.ABSTRACT_FAILURE_MODE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION__DETECTABILITY = CorePackage.ABSTRACT_FAILURE_MODE__DETECTABILITY;

	/**
	 * The number of structural features of the '<em>Loss Of Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loss Of Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_FUNCTION_OPERATION_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.DegradationOfFunctionImpl <em>Degradation Of Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.DegradationOfFunctionImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getDegradationOfFunction()
	 * @generated
	 */
	int DEGRADATION_OF_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__ID = CorePackage.ABSTRACT_FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__NAME = CorePackage.ABSTRACT_FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__DESCRIPTION = CorePackage.ABSTRACT_FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__VISIBILITY = CorePackage.ABSTRACT_FAILURE_MODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__FROM = CorePackage.ABSTRACT_FAILURE_MODE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__TO = CorePackage.ABSTRACT_FAILURE_MODE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__LIKELIHOOD = CorePackage.ABSTRACT_FAILURE_MODE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__TO_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__FROM_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__ERROR = CorePackage.ABSTRACT_FAILURE_MODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__FAILURE = CorePackage.ABSTRACT_FAILURE_MODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__FAULT = CorePackage.ABSTRACT_FAILURE_MODE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION__DETECTABILITY = CorePackage.ABSTRACT_FAILURE_MODE__DETECTABILITY;

	/**
	 * The number of structural features of the '<em>Degradation Of Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Degradation Of Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGRADATION_OF_FUNCTION_OPERATION_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.IntermittentFunctionImpl <em>Intermittent Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.IntermittentFunctionImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getIntermittentFunction()
	 * @generated
	 */
	int INTERMITTENT_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__ID = CorePackage.ABSTRACT_FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__NAME = CorePackage.ABSTRACT_FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__DESCRIPTION = CorePackage.ABSTRACT_FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__VISIBILITY = CorePackage.ABSTRACT_FAILURE_MODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__FROM = CorePackage.ABSTRACT_FAILURE_MODE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__TO = CorePackage.ABSTRACT_FAILURE_MODE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__LIKELIHOOD = CorePackage.ABSTRACT_FAILURE_MODE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__TO_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__FROM_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__ERROR = CorePackage.ABSTRACT_FAILURE_MODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__FAILURE = CorePackage.ABSTRACT_FAILURE_MODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__FAULT = CorePackage.ABSTRACT_FAILURE_MODE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION__DETECTABILITY = CorePackage.ABSTRACT_FAILURE_MODE__DETECTABILITY;

	/**
	 * The number of structural features of the '<em>Intermittent Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermittent Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMITTENT_FUNCTION_OPERATION_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.PartialFunctionImpl <em>Partial Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.PartialFunctionImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getPartialFunction()
	 * @generated
	 */
	int PARTIAL_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__ID = CorePackage.ABSTRACT_FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__NAME = CorePackage.ABSTRACT_FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__DESCRIPTION = CorePackage.ABSTRACT_FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__VISIBILITY = CorePackage.ABSTRACT_FAILURE_MODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__FROM = CorePackage.ABSTRACT_FAILURE_MODE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__TO = CorePackage.ABSTRACT_FAILURE_MODE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__LIKELIHOOD = CorePackage.ABSTRACT_FAILURE_MODE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__TO_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__FROM_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__ERROR = CorePackage.ABSTRACT_FAILURE_MODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__FAILURE = CorePackage.ABSTRACT_FAILURE_MODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__FAULT = CorePackage.ABSTRACT_FAILURE_MODE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION__DETECTABILITY = CorePackage.ABSTRACT_FAILURE_MODE__DETECTABILITY;

	/**
	 * The number of structural features of the '<em>Partial Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partial Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION_OPERATION_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.ExceedingFunctionImpl <em>Exceeding Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.ExceedingFunctionImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getExceedingFunction()
	 * @generated
	 */
	int EXCEEDING_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__ID = CorePackage.ABSTRACT_FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__NAME = CorePackage.ABSTRACT_FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__DESCRIPTION = CorePackage.ABSTRACT_FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__VISIBILITY = CorePackage.ABSTRACT_FAILURE_MODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__FROM = CorePackage.ABSTRACT_FAILURE_MODE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__TO = CorePackage.ABSTRACT_FAILURE_MODE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__LIKELIHOOD = CorePackage.ABSTRACT_FAILURE_MODE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__TO_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__FROM_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__ERROR = CorePackage.ABSTRACT_FAILURE_MODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__FAILURE = CorePackage.ABSTRACT_FAILURE_MODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__FAULT = CorePackage.ABSTRACT_FAILURE_MODE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION__DETECTABILITY = CorePackage.ABSTRACT_FAILURE_MODE__DETECTABILITY;

	/**
	 * The number of structural features of the '<em>Exceeding Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exceeding Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEEDING_FUNCTION_OPERATION_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.UnintendedFunctionImpl <em>Unintended Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.UnintendedFunctionImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getUnintendedFunction()
	 * @generated
	 */
	int UNINTENDED_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__ID = CorePackage.ABSTRACT_FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__NAME = CorePackage.ABSTRACT_FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__DESCRIPTION = CorePackage.ABSTRACT_FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__VISIBILITY = CorePackage.ABSTRACT_FAILURE_MODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__FROM = CorePackage.ABSTRACT_FAILURE_MODE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__TO = CorePackage.ABSTRACT_FAILURE_MODE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__LIKELIHOOD = CorePackage.ABSTRACT_FAILURE_MODE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__TO_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__FROM_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__ERROR = CorePackage.ABSTRACT_FAILURE_MODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__FAILURE = CorePackage.ABSTRACT_FAILURE_MODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__FAULT = CorePackage.ABSTRACT_FAILURE_MODE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION__DETECTABILITY = CorePackage.ABSTRACT_FAILURE_MODE__DETECTABILITY;

	/**
	 * The number of structural features of the '<em>Unintended Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unintended Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTENDED_FUNCTION_OPERATION_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.DelayedFunctionImpl <em>Delayed Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.DelayedFunctionImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getDelayedFunction()
	 * @generated
	 */
	int DELAYED_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__ID = CorePackage.ABSTRACT_FAILURE_MODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__NAME = CorePackage.ABSTRACT_FAILURE_MODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__DESCRIPTION = CorePackage.ABSTRACT_FAILURE_MODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__VISIBILITY = CorePackage.ABSTRACT_FAILURE_MODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__FROM = CorePackage.ABSTRACT_FAILURE_MODE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__TO = CorePackage.ABSTRACT_FAILURE_MODE__TO;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__LIKELIHOOD = CorePackage.ABSTRACT_FAILURE_MODE__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>To Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__TO_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__TO_ERROR;

	/**
	 * The feature id for the '<em><b>From Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__FROM_ERROR = CorePackage.ABSTRACT_FAILURE_MODE__FROM_ERROR;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__ERROR = CorePackage.ABSTRACT_FAILURE_MODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__FAILURE = CorePackage.ABSTRACT_FAILURE_MODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__FAULT = CorePackage.ABSTRACT_FAILURE_MODE__FAULT;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION__DETECTABILITY = CorePackage.ABSTRACT_FAILURE_MODE__DETECTABILITY;

	/**
	 * The number of structural features of the '<em>Delayed Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION_FEATURE_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delayed Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_FUNCTION_OPERATION_COUNT = CorePackage.ABSTRACT_FAILURE_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.fmea.impl.FMEALibraryImpl <em>FMEA Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.fmea.impl.FMEALibraryImpl
	 * @see raaml.fmea.impl.FmeaPackageImpl#getFMEALibrary()
	 * @generated
	 */
	int FMEA_LIBRARY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY__ID = CorePackage.ABSTRACT_LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY__NAME = CorePackage.ABSTRACT_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY__DESCRIPTION = CorePackage.ABSTRACT_LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY__VISIBILITY = CorePackage.ABSTRACT_LIBRARY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY__ELEMENTS = CorePackage.ABSTRACT_LIBRARY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Abstract FMEA Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FMEA Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY_FEATURE_COUNT = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FMEA Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_LIBRARY_OPERATION_COUNT = CorePackage.ABSTRACT_LIBRARY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link raaml.fmea.FMEA <em>FMEA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA</em>'.
	 * @see raaml.fmea.FMEA
	 * @generated
	 */
	EClass getFMEA();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fmea.FMEA#getFmeaItems <em>Fmea Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fmea Items</em>'.
	 * @see raaml.fmea.FMEA#getFmeaItems()
	 * @see #getFMEA()
	 * @generated
	 */
	EReference getFMEA_FmeaItems();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.RPNCalculation <em>RPN Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPN Calculation</em>'.
	 * @see raaml.fmea.RPNCalculation
	 * @generated
	 */
	EClass getRPNCalculation();

	/**
	 * Returns the meta object for the attribute '{@link raaml.fmea.RPNCalculation#getRPN <em>RPN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RPN</em>'.
	 * @see raaml.fmea.RPNCalculation#getRPN()
	 * @see #getRPNCalculation()
	 * @generated
	 */
	EAttribute getRPNCalculation_RPN();

	/**
	 * Returns the meta object for the attribute '{@link raaml.fmea.RPNCalculation#getSEV <em>SEV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SEV</em>'.
	 * @see raaml.fmea.RPNCalculation#getSEV()
	 * @see #getRPNCalculation()
	 * @generated
	 */
	EAttribute getRPNCalculation_SEV();

	/**
	 * Returns the meta object for the attribute '{@link raaml.fmea.RPNCalculation#getOCC <em>OCC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OCC</em>'.
	 * @see raaml.fmea.RPNCalculation#getOCC()
	 * @see #getRPNCalculation()
	 * @generated
	 */
	EAttribute getRPNCalculation_OCC();

	/**
	 * Returns the meta object for the attribute '{@link raaml.fmea.RPNCalculation#getDET <em>DET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DET</em>'.
	 * @see raaml.fmea.RPNCalculation#getDET()
	 * @see #getRPNCalculation()
	 * @generated
	 */
	EAttribute getRPNCalculation_DET();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.AbstractFMEAItem <em>Abstract FMEA Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract FMEA Item</em>'.
	 * @see raaml.fmea.AbstractFMEAItem
	 * @generated
	 */
	EClass getAbstractFMEAItem();

	/**
	 * Returns the meta object for the attribute '{@link raaml.fmea.AbstractFMEAItem#getRPN <em>RPN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RPN</em>'.
	 * @see raaml.fmea.AbstractFMEAItem#getRPN()
	 * @see #getAbstractFMEAItem()
	 * @generated
	 */
	EAttribute getAbstractFMEAItem_RPN();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fmea.AbstractFMEAItem#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Mode</em>'.
	 * @see raaml.fmea.AbstractFMEAItem#getFailureMode()
	 * @see #getAbstractFMEAItem()
	 * @generated
	 */
	EReference getAbstractFMEAItem_FailureMode();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fmea.AbstractFMEAItem#getFinalEffect <em>Final Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Final Effect</em>'.
	 * @see raaml.fmea.AbstractFMEAItem#getFinalEffect()
	 * @see #getAbstractFMEAItem()
	 * @generated
	 */
	EReference getAbstractFMEAItem_FinalEffect();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fmea.AbstractFMEAItem#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause</em>'.
	 * @see raaml.fmea.AbstractFMEAItem#getCause()
	 * @see #getAbstractFMEAItem()
	 * @generated
	 */
	EReference getAbstractFMEAItem_Cause();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.FMEAItem <em>FMEA Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA Item</em>'.
	 * @see raaml.fmea.FMEAItem
	 * @generated
	 */
	EClass getFMEAItem();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fmea.FMEAItem#getRpnCalculation <em>Rpn Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rpn Calculation</em>'.
	 * @see raaml.fmea.FMEAItem#getRpnCalculation()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EReference getFMEAItem_RpnCalculation();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.LossOfFunction <em>Loss Of Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Of Function</em>'.
	 * @see raaml.fmea.LossOfFunction
	 * @generated
	 */
	EClass getLossOfFunction();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.DegradationOfFunction <em>Degradation Of Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degradation Of Function</em>'.
	 * @see raaml.fmea.DegradationOfFunction
	 * @generated
	 */
	EClass getDegradationOfFunction();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.IntermittentFunction <em>Intermittent Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermittent Function</em>'.
	 * @see raaml.fmea.IntermittentFunction
	 * @generated
	 */
	EClass getIntermittentFunction();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.PartialFunction <em>Partial Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Function</em>'.
	 * @see raaml.fmea.PartialFunction
	 * @generated
	 */
	EClass getPartialFunction();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.ExceedingFunction <em>Exceeding Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exceeding Function</em>'.
	 * @see raaml.fmea.ExceedingFunction
	 * @generated
	 */
	EClass getExceedingFunction();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.UnintendedFunction <em>Unintended Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unintended Function</em>'.
	 * @see raaml.fmea.UnintendedFunction
	 * @generated
	 */
	EClass getUnintendedFunction();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.DelayedFunction <em>Delayed Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayed Function</em>'.
	 * @see raaml.fmea.DelayedFunction
	 * @generated
	 */
	EClass getDelayedFunction();

	/**
	 * Returns the meta object for class '{@link raaml.fmea.FMEALibrary <em>FMEA Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA Library</em>'.
	 * @see raaml.fmea.FMEALibrary
	 * @generated
	 */
	EClass getFMEALibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.fmea.FMEALibrary#getAbstractFMEAItems <em>Abstract FMEA Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract FMEA Items</em>'.
	 * @see raaml.fmea.FMEALibrary#getAbstractFMEAItems()
	 * @see #getFMEALibrary()
	 * @generated
	 */
	EReference getFMEALibrary_AbstractFMEAItems();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FmeaFactory getFmeaFactory();

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
		 * The meta object literal for the '{@link raaml.fmea.impl.FMEAImpl <em>FMEA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.FMEAImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getFMEA()
		 * @generated
		 */
		EClass FMEA = eINSTANCE.getFMEA();

		/**
		 * The meta object literal for the '<em><b>Fmea Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA__FMEA_ITEMS = eINSTANCE.getFMEA_FmeaItems();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.RPNCalculationImpl <em>RPN Calculation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.RPNCalculationImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getRPNCalculation()
		 * @generated
		 */
		EClass RPN_CALCULATION = eINSTANCE.getRPNCalculation();

		/**
		 * The meta object literal for the '<em><b>RPN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPN_CALCULATION__RPN = eINSTANCE.getRPNCalculation_RPN();

		/**
		 * The meta object literal for the '<em><b>SEV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPN_CALCULATION__SEV = eINSTANCE.getRPNCalculation_SEV();

		/**
		 * The meta object literal for the '<em><b>OCC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPN_CALCULATION__OCC = eINSTANCE.getRPNCalculation_OCC();

		/**
		 * The meta object literal for the '<em><b>DET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPN_CALCULATION__DET = eINSTANCE.getRPNCalculation_DET();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.AbstractFMEAItemImpl <em>Abstract FMEA Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.AbstractFMEAItemImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getAbstractFMEAItem()
		 * @generated
		 */
		EClass ABSTRACT_FMEA_ITEM = eINSTANCE.getAbstractFMEAItem();

		/**
		 * The meta object literal for the '<em><b>RPN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FMEA_ITEM__RPN = eINSTANCE.getAbstractFMEAItem_RPN();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FMEA_ITEM__FAILURE_MODE = eINSTANCE.getAbstractFMEAItem_FailureMode();

		/**
		 * The meta object literal for the '<em><b>Final Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FMEA_ITEM__FINAL_EFFECT = eINSTANCE.getAbstractFMEAItem_FinalEffect();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FMEA_ITEM__CAUSE = eINSTANCE.getAbstractFMEAItem_Cause();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.FMEAItemImpl <em>FMEA Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.FMEAItemImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getFMEAItem()
		 * @generated
		 */
		EClass FMEA_ITEM = eINSTANCE.getFMEAItem();

		/**
		 * The meta object literal for the '<em><b>Rpn Calculation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_ITEM__RPN_CALCULATION = eINSTANCE.getFMEAItem_RpnCalculation();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.LossOfFunctionImpl <em>Loss Of Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.LossOfFunctionImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getLossOfFunction()
		 * @generated
		 */
		EClass LOSS_OF_FUNCTION = eINSTANCE.getLossOfFunction();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.DegradationOfFunctionImpl <em>Degradation Of Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.DegradationOfFunctionImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getDegradationOfFunction()
		 * @generated
		 */
		EClass DEGRADATION_OF_FUNCTION = eINSTANCE.getDegradationOfFunction();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.IntermittentFunctionImpl <em>Intermittent Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.IntermittentFunctionImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getIntermittentFunction()
		 * @generated
		 */
		EClass INTERMITTENT_FUNCTION = eINSTANCE.getIntermittentFunction();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.PartialFunctionImpl <em>Partial Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.PartialFunctionImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getPartialFunction()
		 * @generated
		 */
		EClass PARTIAL_FUNCTION = eINSTANCE.getPartialFunction();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.ExceedingFunctionImpl <em>Exceeding Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.ExceedingFunctionImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getExceedingFunction()
		 * @generated
		 */
		EClass EXCEEDING_FUNCTION = eINSTANCE.getExceedingFunction();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.UnintendedFunctionImpl <em>Unintended Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.UnintendedFunctionImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getUnintendedFunction()
		 * @generated
		 */
		EClass UNINTENDED_FUNCTION = eINSTANCE.getUnintendedFunction();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.DelayedFunctionImpl <em>Delayed Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.DelayedFunctionImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getDelayedFunction()
		 * @generated
		 */
		EClass DELAYED_FUNCTION = eINSTANCE.getDelayedFunction();

		/**
		 * The meta object literal for the '{@link raaml.fmea.impl.FMEALibraryImpl <em>FMEA Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.fmea.impl.FMEALibraryImpl
		 * @see raaml.fmea.impl.FmeaPackageImpl#getFMEALibrary()
		 * @generated
		 */
		EClass FMEA_LIBRARY = eINSTANCE.getFMEALibrary();

		/**
		 * The meta object literal for the '<em><b>Abstract FMEA Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS = eINSTANCE.getFMEALibrary_AbstractFMEAItems();

	}

} //FmeaPackage
