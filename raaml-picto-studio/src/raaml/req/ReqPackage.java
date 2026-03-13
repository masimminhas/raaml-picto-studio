/**
 */
package raaml.req;

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
 * Requirements modeling for safety analysis
 * <!-- end-model-doc -->
 * @see raaml.req.ReqFactory
 * @model kind="package"
 * @generated
 */
public interface ReqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "req";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/req";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.req";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqPackage eINSTANCE = raaml.req.impl.ReqPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.req.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.RequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATUS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RELATED_ELEMENTS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT_REQUIREMENT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILD_REQUIREMENTS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.RequirementComponentImpl <em>Requirement Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.RequirementComponentImpl
	 * @see raaml.req.impl.ReqPackageImpl#getRequirementComponent()
	 * @generated
	 */
	int REQUIREMENT_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT__HARA_OWNER = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Requirement Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_COMPONENT_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.AbstractionImpl <em>Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.AbstractionImpl
	 * @see raaml.req.impl.ReqPackageImpl#getAbstraction()
	 * @generated
	 */
	int ABSTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__ID = REQUIREMENT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__NAME = REQUIREMENT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__DESCRIPTION = REQUIREMENT_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__VISIBILITY = REQUIREMENT_COMPONENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__HARA_OWNER = REQUIREMENT_COMPONENT__HARA_OWNER;

	/**
	 * The number of structural features of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_FEATURE_COUNT = REQUIREMENT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_OPERATION_COUNT = REQUIREMENT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.DeriveRequirementImpl <em>Derive Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.DeriveRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getDeriveRequirement()
	 * @generated
	 */
	int DERIVE_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__ID = ABSTRACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__NAME = ABSTRACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__DESCRIPTION = ABSTRACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__VISIBILITY = ABSTRACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__HARA_OWNER = ABSTRACTION__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__SOURCE = ABSTRACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__TARGET = ABSTRACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derive Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT_FEATURE_COUNT = ABSTRACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Derive Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT_OPERATION_COUNT = ABSTRACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.IndependenceRequirementImpl <em>Independence Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.IndependenceRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getIndependenceRequirement()
	 * @generated
	 */
	int INDEPENDENCE_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT__ID = DERIVE_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT__NAME = DERIVE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT__DESCRIPTION = DERIVE_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT__VISIBILITY = DERIVE_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT__HARA_OWNER = DERIVE_REQUIREMENT__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT__SOURCE = DERIVE_REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT__TARGET = DERIVE_REQUIREMENT__TARGET;

	/**
	 * The number of structural features of the '<em>Independence Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT_FEATURE_COUNT = DERIVE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Independence Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENCE_REQUIREMENT_OPERATION_COUNT = DERIVE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.ASILDecomposeImpl <em>ASIL Decompose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.ASILDecomposeImpl
	 * @see raaml.req.impl.ReqPackageImpl#getASILDecompose()
	 * @generated
	 */
	int ASIL_DECOMPOSE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE__ID = DERIVE_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE__NAME = DERIVE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE__DESCRIPTION = DERIVE_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE__VISIBILITY = DERIVE_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE__HARA_OWNER = DERIVE_REQUIREMENT__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE__SOURCE = DERIVE_REQUIREMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE__TARGET = DERIVE_REQUIREMENT__TARGET;

	/**
	 * The number of structural features of the '<em>ASIL Decompose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE_FEATURE_COUNT = DERIVE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ASIL Decompose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIL_DECOMPOSE_OPERATION_COUNT = DERIVE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.SatisfyImpl <em>Satisfy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.SatisfyImpl
	 * @see raaml.req.impl.ReqPackageImpl#getSatisfy()
	 * @generated
	 */
	int SATISFY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__ID = ABSTRACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__NAME = ABSTRACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__DESCRIPTION = ABSTRACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__VISIBILITY = ABSTRACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__HARA_OWNER = ABSTRACTION__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SOURCE = ABSTRACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__TARGET = ABSTRACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_FEATURE_COUNT = ABSTRACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_OPERATION_COUNT = ABSTRACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.UserInfoRequirementImpl <em>User Info Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.UserInfoRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getUserInfoRequirement()
	 * @generated
	 */
	int USER_INFO_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT__ID = SATISFY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT__NAME = SATISFY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT__DESCRIPTION = SATISFY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT__VISIBILITY = SATISFY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT__HARA_OWNER = SATISFY__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT__SOURCE = SATISFY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT__TARGET = SATISFY__TARGET;

	/**
	 * The number of structural features of the '<em>User Info Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Info Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INFO_REQUIREMENT_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.RecoveryRequirementImpl <em>Recovery Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.RecoveryRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getRecoveryRequirement()
	 * @generated
	 */
	int RECOVERY_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT__ID = SATISFY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT__NAME = SATISFY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT__DESCRIPTION = SATISFY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT__VISIBILITY = SATISFY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT__HARA_OWNER = SATISFY__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT__SOURCE = SATISFY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT__TARGET = SATISFY__TARGET;

	/**
	 * The number of structural features of the '<em>Recovery Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recovery Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_REQUIREMENT_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.DependabilityRequirementImpl <em>Dependability Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.DependabilityRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getDependabilityRequirement()
	 * @generated
	 */
	int DEPENDABILITY_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__VISIBILITY = REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__TEXT = REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__TYPE = REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__STATUS = REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__RELATED_ELEMENTS = REQUIREMENT__RELATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__PARENT_REQUIREMENT = REQUIREMENT__PARENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__CHILD_REQUIREMENTS = REQUIREMENT__CHILD_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Dependability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.FunctionalSafetyRequirementImpl <em>Functional Safety Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.FunctionalSafetyRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getFunctionalSafetyRequirement()
	 * @generated
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__VISIBILITY = DEPENDABILITY_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__TEXT = DEPENDABILITY_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__TYPE = DEPENDABILITY_REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__PRIORITY = DEPENDABILITY_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__STATUS = DEPENDABILITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__RELATED_ELEMENTS = DEPENDABILITY_REQUIREMENT__RELATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__PARENT_REQUIREMENT = DEPENDABILITY_REQUIREMENT__PARENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT__CHILD_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__CHILD_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Functional Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SAFETY_REQUIREMENT_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.SoftwareSafetyRequirementImpl <em>Software Safety Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.SoftwareSafetyRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getSoftwareSafetyRequirement()
	 * @generated
	 */
	int SOFTWARE_SAFETY_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__VISIBILITY = DEPENDABILITY_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__TEXT = DEPENDABILITY_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__TYPE = DEPENDABILITY_REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__PRIORITY = DEPENDABILITY_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__STATUS = DEPENDABILITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__RELATED_ELEMENTS = DEPENDABILITY_REQUIREMENT__RELATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__PARENT_REQUIREMENT = DEPENDABILITY_REQUIREMENT__PARENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT__CHILD_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__CHILD_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Software Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Software Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SAFETY_REQUIREMENT_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.HardwareSafetyRequirementImpl <em>Hardware Safety Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.HardwareSafetyRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getHardwareSafetyRequirement()
	 * @generated
	 */
	int HARDWARE_SAFETY_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__VISIBILITY = DEPENDABILITY_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__TEXT = DEPENDABILITY_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__TYPE = DEPENDABILITY_REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__PRIORITY = DEPENDABILITY_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__STATUS = DEPENDABILITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__RELATED_ELEMENTS = DEPENDABILITY_REQUIREMENT__RELATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__PARENT_REQUIREMENT = DEPENDABILITY_REQUIREMENT__PARENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT__CHILD_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__CHILD_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Hardware Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_SAFETY_REQUIREMENT_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.TechnicalSafetyRequirementImpl <em>Technical Safety Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.TechnicalSafetyRequirementImpl
	 * @see raaml.req.impl.ReqPackageImpl#getTechnicalSafetyRequirement()
	 * @generated
	 */
	int TECHNICAL_SAFETY_REQUIREMENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__VISIBILITY = DEPENDABILITY_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__TEXT = DEPENDABILITY_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__TYPE = DEPENDABILITY_REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__PRIORITY = DEPENDABILITY_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__STATUS = DEPENDABILITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__RELATED_ELEMENTS = DEPENDABILITY_REQUIREMENT__RELATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__PARENT_REQUIREMENT = DEPENDABILITY_REQUIREMENT__PARENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT__CHILD_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__CHILD_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Technical Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Technical Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_SAFETY_REQUIREMENT_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.SafetyGoalImpl <em>Safety Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.SafetyGoalImpl
	 * @see raaml.req.impl.ReqPackageImpl#getSafetyGoal()
	 * @generated
	 */
	int SAFETY_GOAL = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__VISIBILITY = DEPENDABILITY_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__TEXT = DEPENDABILITY_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__TYPE = DEPENDABILITY_REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__PRIORITY = DEPENDABILITY_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__STATUS = DEPENDABILITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__RELATED_ELEMENTS = DEPENDABILITY_REQUIREMENT__RELATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__PARENT_REQUIREMENT = DEPENDABILITY_REQUIREMENT__PARENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL__CHILD_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__CHILD_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Safety Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safety Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_GOAL_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.DependencyImpl
	 * @see raaml.req.impl.ReqPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ID = REQUIREMENT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = REQUIREMENT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DESCRIPTION = REQUIREMENT_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VISIBILITY = REQUIREMENT_COMPONENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__HARA_OWNER = REQUIREMENT_COMPONENT__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = REQUIREMENT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = REQUIREMENT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = REQUIREMENT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = REQUIREMENT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.SafeStateImpl <em>Safe State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.SafeStateImpl
	 * @see raaml.req.impl.ReqPackageImpl#getSafeState()
	 * @generated
	 */
	int SAFE_STATE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE__ID = DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE__DESCRIPTION = DEPENDENCY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE__VISIBILITY = DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE__HARA_OWNER = DEPENDENCY__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE__TARGET = DEPENDENCY__TARGET;

	/**
	 * The number of structural features of the '<em>Safe State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safe State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_STATE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.OperatingModeImpl <em>Operating Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.OperatingModeImpl
	 * @see raaml.req.impl.ReqPackageImpl#getOperatingMode()
	 * @generated
	 */
	int OPERATING_MODE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE__ID = DEPENDENCY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE__DESCRIPTION = DEPENDENCY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE__VISIBILITY = DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE__HARA_OWNER = DEPENDENCY__HARA_OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE__TARGET = DEPENDENCY__TARGET;

	/**
	 * The number of structural features of the '<em>Operating Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operating Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_MODE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.HazardAndRiskAssessmentImpl <em>Hazard And Risk Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.HazardAndRiskAssessmentImpl
	 * @see raaml.req.impl.ReqPackageImpl#getHazardAndRiskAssessment()
	 * @generated
	 */
	int HAZARD_AND_RISK_ASSESSMENT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_AND_RISK_ASSESSMENT__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_AND_RISK_ASSESSMENT__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_AND_RISK_ASSESSMENT__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_AND_RISK_ASSESSMENT__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Hara Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hazard And Risk Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_AND_RISK_ASSESSMENT_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hazard And Risk Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_AND_RISK_ASSESSMENT_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.ISO26262SafetyRequirementTemplateImpl <em>ISO26262 Safety Requirement Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.ISO26262SafetyRequirementTemplateImpl
	 * @see raaml.req.impl.ReqPackageImpl#getISO26262SafetyRequirementTemplate()
	 * @generated
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__VISIBILITY = DEPENDABILITY_REQUIREMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__TEXT = DEPENDABILITY_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__TYPE = DEPENDABILITY_REQUIREMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__PRIORITY = DEPENDABILITY_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__STATUS = DEPENDABILITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__RELATED_ELEMENTS = DEPENDABILITY_REQUIREMENT__RELATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__PARENT_REQUIREMENT = DEPENDABILITY_REQUIREMENT__PARENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Child Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__CHILD_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__CHILD_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>ASIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FTTI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ISO26262 Safety Requirement Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ISO26262 Safety Requirement Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO26262_SAFETY_REQUIREMENT_TEMPLATE_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link raaml.req.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.req.impl.RequirementsModelImpl
	 * @see raaml.req.impl.ReqPackageImpl#getRequirementsModel()
	 * @generated
	 */
	int REQUIREMENTS_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__ID = CorePackage.CORE_SAFETY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__NAME = CorePackage.CORE_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__DESCRIPTION = CorePackage.CORE_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__VISIBILITY = CorePackage.CORE_SAFETY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__REQUIREMENTS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derivations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__DERIVATIONS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Satisfactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__SATISFACTIONS = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__DEPENDENCIES = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Requirements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_FEATURE_COUNT = CorePackage.CORE_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Requirements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_OPERATION_COUNT = CorePackage.CORE_SAFETY_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link raaml.req.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see raaml.req.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link raaml.req.Requirement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see raaml.req.Requirement#getText()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Text();

	/**
	 * Returns the meta object for the attribute '{@link raaml.req.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see raaml.req.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for the attribute '{@link raaml.req.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see raaml.req.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link raaml.req.Requirement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see raaml.req.Requirement#getStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Status();

	/**
	 * Returns the meta object for the reference list '{@link raaml.req.Requirement#getRelatedElements <em>Related Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Elements</em>'.
	 * @see raaml.req.Requirement#getRelatedElements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RelatedElements();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.Requirement#getParentRequirement <em>Parent Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Requirement</em>'.
	 * @see raaml.req.Requirement#getParentRequirement()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ParentRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.req.Requirement#getChildRequirements <em>Child Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Requirements</em>'.
	 * @see raaml.req.Requirement#getChildRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ChildRequirements();

	/**
	 * Returns the meta object for class '{@link raaml.req.RequirementComponent <em>Requirement Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Component</em>'.
	 * @see raaml.req.RequirementComponent
	 * @generated
	 */
	EClass getRequirementComponent();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.RequirementComponent#getHaraOwner <em>Hara Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hara Owner</em>'.
	 * @see raaml.req.RequirementComponent#getHaraOwner()
	 * @see #getRequirementComponent()
	 * @generated
	 */
	EReference getRequirementComponent_HaraOwner();

	/**
	 * Returns the meta object for class '{@link raaml.req.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction</em>'.
	 * @see raaml.req.Abstraction
	 * @generated
	 */
	EClass getAbstraction();

	/**
	 * Returns the meta object for class '{@link raaml.req.DeriveRequirement <em>Derive Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derive Requirement</em>'.
	 * @see raaml.req.DeriveRequirement
	 * @generated
	 */
	EClass getDeriveRequirement();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.DeriveRequirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see raaml.req.DeriveRequirement#getSource()
	 * @see #getDeriveRequirement()
	 * @generated
	 */
	EReference getDeriveRequirement_Source();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.DeriveRequirement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see raaml.req.DeriveRequirement#getTarget()
	 * @see #getDeriveRequirement()
	 * @generated
	 */
	EReference getDeriveRequirement_Target();

	/**
	 * Returns the meta object for class '{@link raaml.req.IndependenceRequirement <em>Independence Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Independence Requirement</em>'.
	 * @see raaml.req.IndependenceRequirement
	 * @generated
	 */
	EClass getIndependenceRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.ASILDecompose <em>ASIL Decompose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASIL Decompose</em>'.
	 * @see raaml.req.ASILDecompose
	 * @generated
	 */
	EClass getASILDecompose();

	/**
	 * Returns the meta object for class '{@link raaml.req.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfy</em>'.
	 * @see raaml.req.Satisfy
	 * @generated
	 */
	EClass getSatisfy();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.Satisfy#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see raaml.req.Satisfy#getSource()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_Source();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.Satisfy#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see raaml.req.Satisfy#getTarget()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_Target();

	/**
	 * Returns the meta object for class '{@link raaml.req.UserInfoRequirement <em>User Info Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Info Requirement</em>'.
	 * @see raaml.req.UserInfoRequirement
	 * @generated
	 */
	EClass getUserInfoRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.RecoveryRequirement <em>Recovery Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recovery Requirement</em>'.
	 * @see raaml.req.RecoveryRequirement
	 * @generated
	 */
	EClass getRecoveryRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.DependabilityRequirement <em>Dependability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependability Requirement</em>'.
	 * @see raaml.req.DependabilityRequirement
	 * @generated
	 */
	EClass getDependabilityRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.FunctionalSafetyRequirement <em>Functional Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Safety Requirement</em>'.
	 * @see raaml.req.FunctionalSafetyRequirement
	 * @generated
	 */
	EClass getFunctionalSafetyRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.SoftwareSafetyRequirement <em>Software Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Safety Requirement</em>'.
	 * @see raaml.req.SoftwareSafetyRequirement
	 * @generated
	 */
	EClass getSoftwareSafetyRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.HardwareSafetyRequirement <em>Hardware Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Safety Requirement</em>'.
	 * @see raaml.req.HardwareSafetyRequirement
	 * @generated
	 */
	EClass getHardwareSafetyRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.TechnicalSafetyRequirement <em>Technical Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical Safety Requirement</em>'.
	 * @see raaml.req.TechnicalSafetyRequirement
	 * @generated
	 */
	EClass getTechnicalSafetyRequirement();

	/**
	 * Returns the meta object for class '{@link raaml.req.SafetyGoal <em>Safety Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Goal</em>'.
	 * @see raaml.req.SafetyGoal
	 * @generated
	 */
	EClass getSafetyGoal();

	/**
	 * Returns the meta object for class '{@link raaml.req.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see raaml.req.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.Dependency#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see raaml.req.Dependency#getSource()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Source();

	/**
	 * Returns the meta object for the reference '{@link raaml.req.Dependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see raaml.req.Dependency#getTarget()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Target();

	/**
	 * Returns the meta object for class '{@link raaml.req.SafeState <em>Safe State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safe State</em>'.
	 * @see raaml.req.SafeState
	 * @generated
	 */
	EClass getSafeState();

	/**
	 * Returns the meta object for class '{@link raaml.req.OperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Mode</em>'.
	 * @see raaml.req.OperatingMode
	 * @generated
	 */
	EClass getOperatingMode();

	/**
	 * Returns the meta object for class '{@link raaml.req.HazardAndRiskAssessment <em>Hazard And Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard And Risk Assessment</em>'.
	 * @see raaml.req.HazardAndRiskAssessment
	 * @generated
	 */
	EClass getHazardAndRiskAssessment();

	/**
	 * Returns the meta object for the reference list '{@link raaml.req.HazardAndRiskAssessment#getHaraRequirements <em>Hara Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hara Requirements</em>'.
	 * @see raaml.req.HazardAndRiskAssessment#getHaraRequirements()
	 * @see #getHazardAndRiskAssessment()
	 * @generated
	 */
	EReference getHazardAndRiskAssessment_HaraRequirements();

	/**
	 * Returns the meta object for class '{@link raaml.req.ISO26262SafetyRequirementTemplate <em>ISO26262 Safety Requirement Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO26262 Safety Requirement Template</em>'.
	 * @see raaml.req.ISO26262SafetyRequirementTemplate
	 * @generated
	 */
	EClass getISO26262SafetyRequirementTemplate();

	/**
	 * Returns the meta object for the attribute '{@link raaml.req.ISO26262SafetyRequirementTemplate#getASIL <em>ASIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ASIL</em>'.
	 * @see raaml.req.ISO26262SafetyRequirementTemplate#getASIL()
	 * @see #getISO26262SafetyRequirementTemplate()
	 * @generated
	 */
	EAttribute getISO26262SafetyRequirementTemplate_ASIL();

	/**
	 * Returns the meta object for the attribute '{@link raaml.req.ISO26262SafetyRequirementTemplate#getFTTI <em>FTTI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FTTI</em>'.
	 * @see raaml.req.ISO26262SafetyRequirementTemplate#getFTTI()
	 * @see #getISO26262SafetyRequirementTemplate()
	 * @generated
	 */
	EAttribute getISO26262SafetyRequirementTemplate_FTTI();

	/**
	 * Returns the meta object for class '{@link raaml.req.RequirementsModel <em>Requirements Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Model</em>'.
	 * @see raaml.req.RequirementsModel
	 * @generated
	 */
	EClass getRequirementsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.req.RequirementsModel#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see raaml.req.RequirementsModel#getRequirements()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.req.RequirementsModel#getDerivations <em>Derivations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derivations</em>'.
	 * @see raaml.req.RequirementsModel#getDerivations()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Derivations();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.req.RequirementsModel#getSatisfactions <em>Satisfactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satisfactions</em>'.
	 * @see raaml.req.RequirementsModel#getSatisfactions()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Satisfactions();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.req.RequirementsModel#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see raaml.req.RequirementsModel#getDependencies()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Dependencies();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReqFactory getReqFactory();

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
		 * The meta object literal for the '{@link raaml.req.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.RequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TEXT = eINSTANCE.getRequirement_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATUS = eINSTANCE.getRequirement_Status();

		/**
		 * The meta object literal for the '<em><b>Related Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__RELATED_ELEMENTS = eINSTANCE.getRequirement_RelatedElements();

		/**
		 * The meta object literal for the '<em><b>Parent Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PARENT_REQUIREMENT = eINSTANCE.getRequirement_ParentRequirement();

		/**
		 * The meta object literal for the '<em><b>Child Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CHILD_REQUIREMENTS = eINSTANCE.getRequirement_ChildRequirements();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.RequirementComponentImpl <em>Requirement Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.RequirementComponentImpl
		 * @see raaml.req.impl.ReqPackageImpl#getRequirementComponent()
		 * @generated
		 */
		EClass REQUIREMENT_COMPONENT = eINSTANCE.getRequirementComponent();

		/**
		 * The meta object literal for the '<em><b>Hara Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_COMPONENT__HARA_OWNER = eINSTANCE.getRequirementComponent_HaraOwner();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.AbstractionImpl <em>Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.AbstractionImpl
		 * @see raaml.req.impl.ReqPackageImpl#getAbstraction()
		 * @generated
		 */
		EClass ABSTRACTION = eINSTANCE.getAbstraction();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.DeriveRequirementImpl <em>Derive Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.DeriveRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getDeriveRequirement()
		 * @generated
		 */
		EClass DERIVE_REQUIREMENT = eINSTANCE.getDeriveRequirement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE_REQUIREMENT__SOURCE = eINSTANCE.getDeriveRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE_REQUIREMENT__TARGET = eINSTANCE.getDeriveRequirement_Target();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.IndependenceRequirementImpl <em>Independence Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.IndependenceRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getIndependenceRequirement()
		 * @generated
		 */
		EClass INDEPENDENCE_REQUIREMENT = eINSTANCE.getIndependenceRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.ASILDecomposeImpl <em>ASIL Decompose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.ASILDecomposeImpl
		 * @see raaml.req.impl.ReqPackageImpl#getASILDecompose()
		 * @generated
		 */
		EClass ASIL_DECOMPOSE = eINSTANCE.getASILDecompose();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.SatisfyImpl <em>Satisfy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.SatisfyImpl
		 * @see raaml.req.impl.ReqPackageImpl#getSatisfy()
		 * @generated
		 */
		EClass SATISFY = eINSTANCE.getSatisfy();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFY__SOURCE = eINSTANCE.getSatisfy_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFY__TARGET = eINSTANCE.getSatisfy_Target();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.UserInfoRequirementImpl <em>User Info Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.UserInfoRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getUserInfoRequirement()
		 * @generated
		 */
		EClass USER_INFO_REQUIREMENT = eINSTANCE.getUserInfoRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.RecoveryRequirementImpl <em>Recovery Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.RecoveryRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getRecoveryRequirement()
		 * @generated
		 */
		EClass RECOVERY_REQUIREMENT = eINSTANCE.getRecoveryRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.DependabilityRequirementImpl <em>Dependability Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.DependabilityRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getDependabilityRequirement()
		 * @generated
		 */
		EClass DEPENDABILITY_REQUIREMENT = eINSTANCE.getDependabilityRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.FunctionalSafetyRequirementImpl <em>Functional Safety Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.FunctionalSafetyRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getFunctionalSafetyRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_SAFETY_REQUIREMENT = eINSTANCE.getFunctionalSafetyRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.SoftwareSafetyRequirementImpl <em>Software Safety Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.SoftwareSafetyRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getSoftwareSafetyRequirement()
		 * @generated
		 */
		EClass SOFTWARE_SAFETY_REQUIREMENT = eINSTANCE.getSoftwareSafetyRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.HardwareSafetyRequirementImpl <em>Hardware Safety Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.HardwareSafetyRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getHardwareSafetyRequirement()
		 * @generated
		 */
		EClass HARDWARE_SAFETY_REQUIREMENT = eINSTANCE.getHardwareSafetyRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.TechnicalSafetyRequirementImpl <em>Technical Safety Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.TechnicalSafetyRequirementImpl
		 * @see raaml.req.impl.ReqPackageImpl#getTechnicalSafetyRequirement()
		 * @generated
		 */
		EClass TECHNICAL_SAFETY_REQUIREMENT = eINSTANCE.getTechnicalSafetyRequirement();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.SafetyGoalImpl <em>Safety Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.SafetyGoalImpl
		 * @see raaml.req.impl.ReqPackageImpl#getSafetyGoal()
		 * @generated
		 */
		EClass SAFETY_GOAL = eINSTANCE.getSafetyGoal();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.DependencyImpl
		 * @see raaml.req.impl.ReqPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SOURCE = eINSTANCE.getDependency_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TARGET = eINSTANCE.getDependency_Target();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.SafeStateImpl <em>Safe State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.SafeStateImpl
		 * @see raaml.req.impl.ReqPackageImpl#getSafeState()
		 * @generated
		 */
		EClass SAFE_STATE = eINSTANCE.getSafeState();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.OperatingModeImpl <em>Operating Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.OperatingModeImpl
		 * @see raaml.req.impl.ReqPackageImpl#getOperatingMode()
		 * @generated
		 */
		EClass OPERATING_MODE = eINSTANCE.getOperatingMode();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.HazardAndRiskAssessmentImpl <em>Hazard And Risk Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.HazardAndRiskAssessmentImpl
		 * @see raaml.req.impl.ReqPackageImpl#getHazardAndRiskAssessment()
		 * @generated
		 */
		EClass HAZARD_AND_RISK_ASSESSMENT = eINSTANCE.getHazardAndRiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Hara Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS = eINSTANCE.getHazardAndRiskAssessment_HaraRequirements();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.ISO26262SafetyRequirementTemplateImpl <em>ISO26262 Safety Requirement Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.ISO26262SafetyRequirementTemplateImpl
		 * @see raaml.req.impl.ReqPackageImpl#getISO26262SafetyRequirementTemplate()
		 * @generated
		 */
		EClass ISO26262_SAFETY_REQUIREMENT_TEMPLATE = eINSTANCE.getISO26262SafetyRequirementTemplate();

		/**
		 * The meta object literal for the '<em><b>ASIL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL = eINSTANCE.getISO26262SafetyRequirementTemplate_ASIL();

		/**
		 * The meta object literal for the '<em><b>FTTI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI = eINSTANCE.getISO26262SafetyRequirementTemplate_FTTI();

		/**
		 * The meta object literal for the '{@link raaml.req.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.req.impl.RequirementsModelImpl
		 * @see raaml.req.impl.ReqPackageImpl#getRequirementsModel()
		 * @generated
		 */
		EClass REQUIREMENTS_MODEL = eINSTANCE.getRequirementsModel();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__REQUIREMENTS = eINSTANCE.getRequirementsModel_Requirements();

		/**
		 * The meta object literal for the '<em><b>Derivations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__DERIVATIONS = eINSTANCE.getRequirementsModel_Derivations();

		/**
		 * The meta object literal for the '<em><b>Satisfactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__SATISFACTIONS = eINSTANCE.getRequirementsModel_Satisfactions();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__DEPENDENCIES = eINSTANCE.getRequirementsModel_Dependencies();

	}

} //ReqPackage
