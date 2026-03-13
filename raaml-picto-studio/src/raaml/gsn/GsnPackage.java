/**
 */
package raaml.gsn;

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
 * Goal Structuring Notation for safety case development and assurance arguments
 * <!-- end-model-doc -->
 * @see raaml.gsn.GsnFactory
 * @model kind="package"
 * @generated
 */
public interface GsnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/gsn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.gsn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GsnPackage eINSTANCE = raaml.gsn.impl.GsnPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.GSNImpl <em>GSN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.GSNImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getGSN()
	 * @generated
	 */
	int GSN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__ID = CorePackage.ANALYSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__NAME = CorePackage.ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__DESCRIPTION = CorePackage.ANALYSIS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__VISIBILITY = CorePackage.ANALYSIS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__ELEMENTS = CorePackage.ANALYSIS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Contextual Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__CONTEXTUAL_INFORMATION = CorePackage.ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gsn Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__GSN_NODES = CorePackage.ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__SUPPORTED_BY = CorePackage.ANALYSIS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Context Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN__IN_CONTEXT_OF = CorePackage.ANALYSIS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GSN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_FEATURE_COUNT = CorePackage.ANALYSIS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GSN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_OPERATION_COUNT = CorePackage.ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.GSNNodeImpl <em>GSN Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.GSNNodeImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getGSNNode()
	 * @generated
	 */
	int GSN_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_NODE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_NODE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_NODE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_NODE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_NODE__NODE_ID = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSN Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_NODE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSN Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_NODE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.GSNArgumentNodeImpl <em>GSN Argument Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.GSNArgumentNodeImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getGSNArgumentNode()
	 * @generated
	 */
	int GSN_ARGUMENT_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_ARGUMENT_NODE__ID = GSN_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_ARGUMENT_NODE__NAME = GSN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_ARGUMENT_NODE__DESCRIPTION = GSN_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_ARGUMENT_NODE__VISIBILITY = GSN_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_ARGUMENT_NODE__NODE_ID = GSN_NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>GSN Argument Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_ARGUMENT_NODE_FEATURE_COUNT = GSN_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSN Argument Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSN_ARGUMENT_NODE_OPERATION_COUNT = GSN_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.GoalImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = GSN_ARGUMENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = GSN_ARGUMENT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = GSN_ARGUMENT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__VISIBILITY = GSN_ARGUMENT_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NODE_ID = GSN_ARGUMENT_NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = GSN_ARGUMENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = GSN_ARGUMENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.StrategyImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ID = GSN_ARGUMENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = GSN_ARGUMENT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = GSN_ARGUMENT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__VISIBILITY = GSN_ARGUMENT_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NODE_ID = GSN_ARGUMENT_NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = GSN_ARGUMENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = GSN_ARGUMENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.SolutionImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ID = GSN_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = GSN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = GSN_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__VISIBILITY = GSN_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NODE_ID = GSN_NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = GSN_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = GSN_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.ContextualInformationImpl <em>Contextual Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.ContextualInformationImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getContextualInformation()
	 * @generated
	 */
	int CONTEXTUAL_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_INFORMATION__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_INFORMATION__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_INFORMATION__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_INFORMATION__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_INFORMATION__CONTEXT_ID = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contextual Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_INFORMATION_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contextual Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_INFORMATION_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.ContextImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = CONTEXTUAL_INFORMATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = CONTEXTUAL_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = CONTEXTUAL_INFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VISIBILITY = CONTEXTUAL_INFORMATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_ID = CONTEXTUAL_INFORMATION__CONTEXT_ID;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = CONTEXTUAL_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = CONTEXTUAL_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.JustificationImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ID = CONTEXTUAL_INFORMATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NAME = CONTEXTUAL_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = CONTEXTUAL_INFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__VISIBILITY = CONTEXTUAL_INFORMATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONTEXT_ID = CONTEXTUAL_INFORMATION__CONTEXT_ID;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = CONTEXTUAL_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_OPERATION_COUNT = CONTEXTUAL_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.AssumptionImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ID = CONTEXTUAL_INFORMATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = CONTEXTUAL_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = CONTEXTUAL_INFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__VISIBILITY = CONTEXTUAL_INFORMATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTEXT_ID = CONTEXTUAL_INFORMATION__CONTEXT_ID;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = CONTEXTUAL_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_OPERATION_COUNT = CONTEXTUAL_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.DependencyImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.InContextOfImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__ID = DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__DESCRIPTION = DEPENDENCY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__VISIBILITY = DEPENDENCY__VISIBILITY;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.SupportedByImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ID = DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__DESCRIPTION = DEPENDENCY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__VISIBILITY = DEPENDENCY__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.RationaleImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.ASILOverrideRationaleImpl <em>ASIL Override Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.ASILOverrideRationaleImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getASILOverrideRationale()
	 * @generated
	 */
	int ASIL_OVERRIDE_RATIONALE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_OVERRIDE_RATIONALE__ID = RATIONALE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_OVERRIDE_RATIONALE__NAME = RATIONALE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_OVERRIDE_RATIONALE__DESCRIPTION = RATIONALE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_OVERRIDE_RATIONALE__VISIBILITY = RATIONALE__VISIBILITY;

	/**
	 * The number of structural features of the '<em>ASIL Override Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_OVERRIDE_RATIONALE_FEATURE_COUNT = RATIONALE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ASIL Override Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_OVERRIDE_RATIONALE_OPERATION_COUNT = RATIONALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.gsn.impl.LessonLearnedImpl <em>Lesson Learned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.gsn.impl.LessonLearnedImpl
	 * @see raaml.gsn.impl.GsnPackageImpl#getLessonLearned()
	 * @generated
	 */
	int LESSON_LEARNED = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSON_LEARNED__ID = RATIONALE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSON_LEARNED__NAME = RATIONALE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSON_LEARNED__DESCRIPTION = RATIONALE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSON_LEARNED__VISIBILITY = RATIONALE__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Lesson Learned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSON_LEARNED_FEATURE_COUNT = RATIONALE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lesson Learned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSON_LEARNED_OPERATION_COUNT = RATIONALE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link raaml.gsn.GSN <em>GSN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSN</em>'.
	 * @see raaml.gsn.GSN
	 * @generated
	 */
	EClass getGSN();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.gsn.GSN#getContextualInformation <em>Contextual Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contextual Information</em>'.
	 * @see raaml.gsn.GSN#getContextualInformation()
	 * @see #getGSN()
	 * @generated
	 */
	EReference getGSN_ContextualInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.gsn.GSN#getGsnNodes <em>Gsn Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gsn Nodes</em>'.
	 * @see raaml.gsn.GSN#getGsnNodes()
	 * @see #getGSN()
	 * @generated
	 */
	EReference getGSN_GsnNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.gsn.GSN#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported By</em>'.
	 * @see raaml.gsn.GSN#getSupportedBy()
	 * @see #getGSN()
	 * @generated
	 */
	EReference getGSN_SupportedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.gsn.GSN#getInContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Context Of</em>'.
	 * @see raaml.gsn.GSN#getInContextOf()
	 * @see #getGSN()
	 * @generated
	 */
	EReference getGSN_InContextOf();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.GSNNode <em>GSN Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSN Node</em>'.
	 * @see raaml.gsn.GSNNode
	 * @generated
	 */
	EClass getGSNNode();

	/**
	 * Returns the meta object for the attribute '{@link raaml.gsn.GSNNode#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see raaml.gsn.GSNNode#getNodeId()
	 * @see #getGSNNode()
	 * @generated
	 */
	EAttribute getGSNNode_NodeId();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.GSNArgumentNode <em>GSN Argument Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSN Argument Node</em>'.
	 * @see raaml.gsn.GSNArgumentNode
	 * @generated
	 */
	EClass getGSNArgumentNode();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see raaml.gsn.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see raaml.gsn.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see raaml.gsn.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.ContextualInformation <em>Contextual Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Information</em>'.
	 * @see raaml.gsn.ContextualInformation
	 * @generated
	 */
	EClass getContextualInformation();

	/**
	 * Returns the meta object for the attribute '{@link raaml.gsn.ContextualInformation#getContextId <em>Context Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Id</em>'.
	 * @see raaml.gsn.ContextualInformation#getContextId()
	 * @see #getContextualInformation()
	 * @generated
	 */
	EAttribute getContextualInformation_ContextId();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see raaml.gsn.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see raaml.gsn.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see raaml.gsn.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see raaml.gsn.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see raaml.gsn.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see raaml.gsn.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see raaml.gsn.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.ASILOverrideRationale <em>ASIL Override Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASIL Override Rationale</em>'.
	 * @see raaml.gsn.ASILOverrideRationale
	 * @generated
	 */
	EClass getASILOverrideRationale();

	/**
	 * Returns the meta object for class '{@link raaml.gsn.LessonLearned <em>Lesson Learned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lesson Learned</em>'.
	 * @see raaml.gsn.LessonLearned
	 * @generated
	 */
	EClass getLessonLearned();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GsnFactory getGsnFactory();

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
		 * The meta object literal for the '{@link raaml.gsn.impl.GSNImpl <em>GSN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.GSNImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getGSN()
		 * @generated
		 */
		EClass GSN = eINSTANCE.getGSN();

		/**
		 * The meta object literal for the '<em><b>Contextual Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSN__CONTEXTUAL_INFORMATION = eINSTANCE.getGSN_ContextualInformation();

		/**
		 * The meta object literal for the '<em><b>Gsn Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSN__GSN_NODES = eINSTANCE.getGSN_GsnNodes();

		/**
		 * The meta object literal for the '<em><b>Supported By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSN__SUPPORTED_BY = eINSTANCE.getGSN_SupportedBy();

		/**
		 * The meta object literal for the '<em><b>In Context Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSN__IN_CONTEXT_OF = eINSTANCE.getGSN_InContextOf();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.GSNNodeImpl <em>GSN Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.GSNNodeImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getGSNNode()
		 * @generated
		 */
		EClass GSN_NODE = eINSTANCE.getGSNNode();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSN_NODE__NODE_ID = eINSTANCE.getGSNNode_NodeId();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.GSNArgumentNodeImpl <em>GSN Argument Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.GSNArgumentNodeImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getGSNArgumentNode()
		 * @generated
		 */
		EClass GSN_ARGUMENT_NODE = eINSTANCE.getGSNArgumentNode();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.GoalImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.StrategyImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.SolutionImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.ContextualInformationImpl <em>Contextual Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.ContextualInformationImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getContextualInformation()
		 * @generated
		 */
		EClass CONTEXTUAL_INFORMATION = eINSTANCE.getContextualInformation();

		/**
		 * The meta object literal for the '<em><b>Context Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXTUAL_INFORMATION__CONTEXT_ID = eINSTANCE.getContextualInformation_ContextId();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.ContextImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.JustificationImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.AssumptionImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.DependencyImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.InContextOfImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.SupportedByImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.RationaleImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.ASILOverrideRationaleImpl <em>ASIL Override Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.ASILOverrideRationaleImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getASILOverrideRationale()
		 * @generated
		 */
		EClass ASIL_OVERRIDE_RATIONALE = eINSTANCE.getASILOverrideRationale();

		/**
		 * The meta object literal for the '{@link raaml.gsn.impl.LessonLearnedImpl <em>Lesson Learned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.gsn.impl.LessonLearnedImpl
		 * @see raaml.gsn.impl.GsnPackageImpl#getLessonLearned()
		 * @generated
		 */
		EClass LESSON_LEARNED = eINSTANCE.getLessonLearned();

	}

} //GsnPackage
