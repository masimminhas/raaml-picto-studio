/**
 */
package raaml.library;

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
 * General-purpose library for reusable safety analysis elements
 * <!-- end-model-doc -->
 * @see raaml.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq/dsis/metamodels/raaml/library";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "raaml.library";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = raaml.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link raaml.library.impl.GeneralLibraryImpl <em>General Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see raaml.library.impl.GeneralLibraryImpl
	 * @see raaml.library.impl.LibraryPackageImpl#getGeneralLibrary()
	 * @generated
	 */
	int GENERAL_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY__ID = CorePackage.ABSTRACT_LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY__NAME = CorePackage.ABSTRACT_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY__DESCRIPTION = CorePackage.ABSTRACT_LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY__VISIBILITY = CorePackage.ABSTRACT_LIBRARY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY__ELEMENTS = CorePackage.ABSTRACT_LIBRARY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Any Situations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY__ANY_SITUATIONS = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>General Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY_FEATURE_COUNT = CorePackage.ABSTRACT_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>General Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LIBRARY_OPERATION_COUNT = CorePackage.ABSTRACT_LIBRARY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link raaml.library.GeneralLibrary <em>General Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Library</em>'.
	 * @see raaml.library.GeneralLibrary
	 * @generated
	 */
	EClass getGeneralLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link raaml.library.GeneralLibrary#getAnySituations <em>Any Situations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Situations</em>'.
	 * @see raaml.library.GeneralLibrary#getAnySituations()
	 * @see #getGeneralLibrary()
	 * @generated
	 */
	EReference getGeneralLibrary_AnySituations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

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
		 * The meta object literal for the '{@link raaml.library.impl.GeneralLibraryImpl <em>General Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see raaml.library.impl.GeneralLibraryImpl
		 * @see raaml.library.impl.LibraryPackageImpl#getGeneralLibrary()
		 * @generated
		 */
		EClass GENERAL_LIBRARY = eINSTANCE.getGeneralLibrary();

		/**
		 * The meta object literal for the '<em><b>Any Situations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_LIBRARY__ANY_SITUATIONS = eINSTANCE.getGeneralLibrary_AnySituations();

	}

} //LibraryPackage
