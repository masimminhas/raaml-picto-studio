/**
 */
package raaml.hazop;

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
 * Hazard and Operability Study (IEC 61882:2016). Guide-word-based deviation analysis on a system's nodes, parameters, and design intent.
 * <!-- end-model-doc -->
 * @see raaml.hazop.HazopFactory
 * @model kind="package"
 *        annotation="http://edu.kit.sdq/raaml/native-ecore rationale='IEC 61882 is a worksheet-only methodology with no normative OMG UML profile. This package is native to the standalone Ecore (no Pair-1/Pair-2 ETL is provided or possible). Demonstrates that the standalone-Ecore approach delivers value even where no source UML profile exists.'"
 * @generated
 */
public interface HazopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hazop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/hazop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.hazop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazopPackage eINSTANCE = raaml.hazop.impl.HazopPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.hazop.impl.HAZOPStudyImpl <em>HAZOP Study</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.impl.HAZOPStudyImpl
	 * @see raaml.hazop.impl.HazopPackageImpl#getHAZOPStudy()
	 * @generated
	 */
	int HAZOP_STUDY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__ID = CorePackage.ANALYSIS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__NAME = CorePackage.ANALYSIS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__DESCRIPTION = CorePackage.ANALYSIS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__VISIBILITY = CorePackage.ANALYSIS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__ELEMENTS = CorePackage.ANALYSIS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Study Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__STUDY_DATE = CorePackage.ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__STANDARD_REFERENCE = CorePackage.ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY__NODES = CorePackage.ANALYSIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HAZOP Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY_FEATURE_COUNT = CorePackage.ANALYSIS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>HAZOP Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_STUDY_OPERATION_COUNT = CorePackage.ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hazop.impl.HAZOPNodeImpl <em>HAZOP Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.impl.HAZOPNodeImpl
	 * @see raaml.hazop.impl.HazopPackageImpl#getHAZOPNode()
	 * @generated
	 */
	int HAZOP_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Subsystem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE__SUBSYSTEM = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE__DESIGN_INTENT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deviations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE__DEVIATIONS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HAZOP Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>HAZOP Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZOP_NODE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hazop.impl.DeviationImpl <em>Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.impl.DeviationImpl
	 * @see raaml.hazop.impl.HazopPackageImpl#getDeviation()
	 * @generated
	 */
	int DEVIATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Guide Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__GUIDE_WORD = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__PARAMETER = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__DEVIATION_TEXT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risk Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__RISK_LEVEL = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__ASIL = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__CAUSES = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__CONSEQUENCES = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Safeguards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__SAFEGUARDS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Recommendations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__RECOMMENDATIONS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hazop.impl.CauseImpl <em>Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.impl.CauseImpl
	 * @see raaml.hazop.impl.HazopPackageImpl#getCause()
	 * @generated
	 */
	int CAUSE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hazop.impl.ConsequenceImpl <em>Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.impl.ConsequenceImpl
	 * @see raaml.hazop.impl.HazopPackageImpl#getConsequence()
	 * @generated
	 */
	int CONSEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hazop.impl.SafeguardImpl <em>Safeguard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.impl.SafeguardImpl
	 * @see raaml.hazop.impl.HazopPackageImpl#getSafeguard()
	 * @generated
	 */
	int SAFEGUARD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFEGUARD__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFEGUARD__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFEGUARD__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFEGUARD__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Safeguard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFEGUARD_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safeguard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFEGUARD_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hazop.impl.RecommendationImpl <em>Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.impl.RecommendationImpl
	 * @see raaml.hazop.impl.HazopPackageImpl#getRecommendation()
	 * @generated
	 */
	int RECOMMENDATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.hazop.GuideWord <em>Guide Word</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.GuideWord
	 * @see raaml.hazop.impl.HazopPackageImpl#getGuideWord()
	 * @generated
	 */
	int GUIDE_WORD = 7;

	/**
	 * The meta object id for the '{@link raaml.hazop.RiskLevel <em>Risk Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.hazop.RiskLevel
	 * @see raaml.hazop.impl.HazopPackageImpl#getRiskLevel()
	 * @generated
	 */
	int RISK_LEVEL = 8;


	/**
	 * Returns the meta object for class '{@link raaml.hazop.HAZOPStudy <em>HAZOP Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAZOP Study</em>'.
	 * @see raaml.hazop.HAZOPStudy
	 * @generated
	 */
	EClass getHAZOPStudy();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.HAZOPStudy#getStudyDate <em>Study Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Date</em>'.
	 * @see raaml.hazop.HAZOPStudy#getStudyDate()
	 * @see #getHAZOPStudy()
	 * @generated
	 */
	EAttribute getHAZOPStudy_StudyDate();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.HAZOPStudy#getStandardReference <em>Standard Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Reference</em>'.
	 * @see raaml.hazop.HAZOPStudy#getStandardReference()
	 * @see #getHAZOPStudy()
	 * @generated
	 */
	EAttribute getHAZOPStudy_StandardReference();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hazop.HAZOPStudy#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see raaml.hazop.HAZOPStudy#getNodes()
	 * @see #getHAZOPStudy()
	 * @generated
	 */
	EReference getHAZOPStudy_Nodes();

	/**
	 * Returns the meta object for class '{@link raaml.hazop.HAZOPNode <em>HAZOP Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAZOP Node</em>'.
	 * @see raaml.hazop.HAZOPNode
	 * @generated
	 */
	EClass getHAZOPNode();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.HAZOPNode#getSubsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subsystem</em>'.
	 * @see raaml.hazop.HAZOPNode#getSubsystem()
	 * @see #getHAZOPNode()
	 * @generated
	 */
	EAttribute getHAZOPNode_Subsystem();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.HAZOPNode#getDesignIntent <em>Design Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Intent</em>'.
	 * @see raaml.hazop.HAZOPNode#getDesignIntent()
	 * @see #getHAZOPNode()
	 * @generated
	 */
	EAttribute getHAZOPNode_DesignIntent();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hazop.HAZOPNode#getDeviations <em>Deviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deviations</em>'.
	 * @see raaml.hazop.HAZOPNode#getDeviations()
	 * @see #getHAZOPNode()
	 * @generated
	 */
	EReference getHAZOPNode_Deviations();

	/**
	 * Returns the meta object for class '{@link raaml.hazop.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviation</em>'.
	 * @see raaml.hazop.Deviation
	 * @generated
	 */
	EClass getDeviation();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.Deviation#getGuideWord <em>Guide Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guide Word</em>'.
	 * @see raaml.hazop.Deviation#getGuideWord()
	 * @see #getDeviation()
	 * @generated
	 */
	EAttribute getDeviation_GuideWord();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.Deviation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see raaml.hazop.Deviation#getParameter()
	 * @see #getDeviation()
	 * @generated
	 */
	EAttribute getDeviation_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.Deviation#getDeviationText <em>Deviation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deviation Text</em>'.
	 * @see raaml.hazop.Deviation#getDeviationText()
	 * @see #getDeviation()
	 * @generated
	 */
	EAttribute getDeviation_DeviationText();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.Deviation#getRiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Level</em>'.
	 * @see raaml.hazop.Deviation#getRiskLevel()
	 * @see #getDeviation()
	 * @generated
	 */
	EAttribute getDeviation_RiskLevel();

	/**
	 * Returns the meta object for the attribute '{@link raaml.hazop.Deviation#getAsil <em>Asil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asil</em>'.
	 * @see raaml.hazop.Deviation#getAsil()
	 * @see #getDeviation()
	 * @generated
	 */
	EAttribute getDeviation_Asil();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hazop.Deviation#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Causes</em>'.
	 * @see raaml.hazop.Deviation#getCauses()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_Causes();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hazop.Deviation#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consequences</em>'.
	 * @see raaml.hazop.Deviation#getConsequences()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_Consequences();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hazop.Deviation#getSafeguards <em>Safeguards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safeguards</em>'.
	 * @see raaml.hazop.Deviation#getSafeguards()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_Safeguards();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.hazop.Deviation#getRecommendations <em>Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recommendations</em>'.
	 * @see raaml.hazop.Deviation#getRecommendations()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_Recommendations();

	/**
	 * Returns the meta object for class '{@link raaml.hazop.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause</em>'.
	 * @see raaml.hazop.Cause
	 * @generated
	 */
	EClass getCause();

	/**
	 * Returns the meta object for class '{@link raaml.hazop.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consequence</em>'.
	 * @see raaml.hazop.Consequence
	 * @generated
	 */
	EClass getConsequence();

	/**
	 * Returns the meta object for class '{@link raaml.hazop.Safeguard <em>Safeguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safeguard</em>'.
	 * @see raaml.hazop.Safeguard
	 * @generated
	 */
	EClass getSafeguard();

	/**
	 * Returns the meta object for class '{@link raaml.hazop.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation</em>'.
	 * @see raaml.hazop.Recommendation
	 * @generated
	 */
	EClass getRecommendation();

	/**
	 * Returns the meta object for enum '{@link raaml.hazop.GuideWord <em>Guide Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guide Word</em>'.
	 * @see raaml.hazop.GuideWord
	 * @generated
	 */
	EEnum getGuideWord();

	/**
	 * Returns the meta object for enum '{@link raaml.hazop.RiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Level</em>'.
	 * @see raaml.hazop.RiskLevel
	 * @generated
	 */
	EEnum getRiskLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HazopFactory getHazopFactory();

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
		 * The meta object literal for the '{@link raaml.hazop.impl.HAZOPStudyImpl <em>HAZOP Study</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.impl.HAZOPStudyImpl
		 * @see raaml.hazop.impl.HazopPackageImpl#getHAZOPStudy()
		 * @generated
		 */
		EClass HAZOP_STUDY = eINSTANCE.getHAZOPStudy();

		/**
		 * The meta object literal for the '<em><b>Study Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZOP_STUDY__STUDY_DATE = eINSTANCE.getHAZOPStudy_StudyDate();

		/**
		 * The meta object literal for the '<em><b>Standard Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZOP_STUDY__STANDARD_REFERENCE = eINSTANCE.getHAZOPStudy_StandardReference();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZOP_STUDY__NODES = eINSTANCE.getHAZOPStudy_Nodes();

		/**
		 * The meta object literal for the '{@link raaml.hazop.impl.HAZOPNodeImpl <em>HAZOP Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.impl.HAZOPNodeImpl
		 * @see raaml.hazop.impl.HazopPackageImpl#getHAZOPNode()
		 * @generated
		 */
		EClass HAZOP_NODE = eINSTANCE.getHAZOPNode();

		/**
		 * The meta object literal for the '<em><b>Subsystem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZOP_NODE__SUBSYSTEM = eINSTANCE.getHAZOPNode_Subsystem();

		/**
		 * The meta object literal for the '<em><b>Design Intent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZOP_NODE__DESIGN_INTENT = eINSTANCE.getHAZOPNode_DesignIntent();

		/**
		 * The meta object literal for the '<em><b>Deviations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZOP_NODE__DEVIATIONS = eINSTANCE.getHAZOPNode_Deviations();

		/**
		 * The meta object literal for the '{@link raaml.hazop.impl.DeviationImpl <em>Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.impl.DeviationImpl
		 * @see raaml.hazop.impl.HazopPackageImpl#getDeviation()
		 * @generated
		 */
		EClass DEVIATION = eINSTANCE.getDeviation();

		/**
		 * The meta object literal for the '<em><b>Guide Word</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION__GUIDE_WORD = eINSTANCE.getDeviation_GuideWord();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION__PARAMETER = eINSTANCE.getDeviation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Deviation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION__DEVIATION_TEXT = eINSTANCE.getDeviation_DeviationText();

		/**
		 * The meta object literal for the '<em><b>Risk Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION__RISK_LEVEL = eINSTANCE.getDeviation_RiskLevel();

		/**
		 * The meta object literal for the '<em><b>Asil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION__ASIL = eINSTANCE.getDeviation_Asil();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATION__CAUSES = eINSTANCE.getDeviation_Causes();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATION__CONSEQUENCES = eINSTANCE.getDeviation_Consequences();

		/**
		 * The meta object literal for the '<em><b>Safeguards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATION__SAFEGUARDS = eINSTANCE.getDeviation_Safeguards();

		/**
		 * The meta object literal for the '<em><b>Recommendations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATION__RECOMMENDATIONS = eINSTANCE.getDeviation_Recommendations();

		/**
		 * The meta object literal for the '{@link raaml.hazop.impl.CauseImpl <em>Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.impl.CauseImpl
		 * @see raaml.hazop.impl.HazopPackageImpl#getCause()
		 * @generated
		 */
		EClass CAUSE = eINSTANCE.getCause();

		/**
		 * The meta object literal for the '{@link raaml.hazop.impl.ConsequenceImpl <em>Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.impl.ConsequenceImpl
		 * @see raaml.hazop.impl.HazopPackageImpl#getConsequence()
		 * @generated
		 */
		EClass CONSEQUENCE = eINSTANCE.getConsequence();

		/**
		 * The meta object literal for the '{@link raaml.hazop.impl.SafeguardImpl <em>Safeguard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.impl.SafeguardImpl
		 * @see raaml.hazop.impl.HazopPackageImpl#getSafeguard()
		 * @generated
		 */
		EClass SAFEGUARD = eINSTANCE.getSafeguard();

		/**
		 * The meta object literal for the '{@link raaml.hazop.impl.RecommendationImpl <em>Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.impl.RecommendationImpl
		 * @see raaml.hazop.impl.HazopPackageImpl#getRecommendation()
		 * @generated
		 */
		EClass RECOMMENDATION = eINSTANCE.getRecommendation();

		/**
		 * The meta object literal for the '{@link raaml.hazop.GuideWord <em>Guide Word</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.GuideWord
		 * @see raaml.hazop.impl.HazopPackageImpl#getGuideWord()
		 * @generated
		 */
		EEnum GUIDE_WORD = eINSTANCE.getGuideWord();

		/**
		 * The meta object literal for the '{@link raaml.hazop.RiskLevel <em>Risk Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.hazop.RiskLevel
		 * @see raaml.hazop.impl.HazopPackageImpl#getRiskLevel()
		 * @generated
		 */
		EEnum RISK_LEVEL = eINSTANCE.getRiskLevel();

	}

} //HazopPackage
