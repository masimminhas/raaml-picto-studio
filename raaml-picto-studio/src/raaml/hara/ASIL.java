/**
 */
package raaml.hara;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ASIL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Automotive Safety Integrity Level
 * <!-- end-model-doc -->
 * @see raaml.hara.HaraPackage#getASIL()
 * @model
 * @generated
 */
public enum ASIL implements Enumerator {
	/**
	 * The '<em><b>Noassignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	NOASSIGNMENT(0, "noassignment", "noassignment"),

	/**
	 * The '<em><b>QM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QM_VALUE
	 * @generated
	 * @ordered
	 */
	QM(1, "QM", "QM"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(2, "A", "A"),

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(3, "B", "B"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(4, "C", "C"),

	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(5, "D", "D"),

	/**
	 * The '<em><b>AB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AB_VALUE
	 * @generated
	 * @ordered
	 */
	AB(6, "AB", "AB"),

	/**
	 * The '<em><b>AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AC_VALUE
	 * @generated
	 * @ordered
	 */
	AC(7, "AC", "AC"),

	/**
	 * The '<em><b>AD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD_VALUE
	 * @generated
	 * @ordered
	 */
	AD(8, "AD", "AD"),

	/**
	 * The '<em><b>BC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BC_VALUE
	 * @generated
	 * @ordered
	 */
	BC(9, "BC", "BC"),

	/**
	 * The '<em><b>CD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(10, "CD", "CD"),

	/**
	 * The '<em><b>AA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AA_VALUE
	 * @generated
	 * @ordered
	 */
	AA(11, "AA", "AA"),

	/**
	 * The '<em><b>BB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BB_VALUE
	 * @generated
	 * @ordered
	 */
	BB(12, "BB", "BB"),

	/**
	 * The '<em><b>CC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CC_VALUE
	 * @generated
	 * @ordered
	 */
	CC(13, "CC", "CC"),

	/**
	 * The '<em><b>DD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD_VALUE
	 * @generated
	 * @ordered
	 */
	DD(14, "DD", "DD"),

	/**
	 * The '<em><b>QMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMA_VALUE
	 * @generated
	 * @ordered
	 */
	QMA(15, "QMA", "QMA"),

	/**
	 * The '<em><b>QMB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMB_VALUE
	 * @generated
	 * @ordered
	 */
	QMB(16, "QMB", "QMB"),

	/**
	 * The '<em><b>QMC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMC_VALUE
	 * @generated
	 * @ordered
	 */
	QMC(17, "QMC", "QMC"),

	/**
	 * The '<em><b>QMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMD_VALUE
	 * @generated
	 * @ordered
	 */
	QMD(18, "QMD", "QMD");

	/**
	 * The '<em><b>Noassignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOASSIGNMENT
	 * @model name="noassignment"
	 * @generated
	 * @ordered
	 */
	public static final int NOASSIGNMENT_VALUE = 0;

	/**
	 * The '<em><b>QM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QM_VALUE = 1;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 2;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 3;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 4;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 5;

	/**
	 * The '<em><b>AB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AB_VALUE = 6;

	/**
	 * The '<em><b>AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AC_VALUE = 7;

	/**
	 * The '<em><b>AD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AD_VALUE = 8;

	/**
	 * The '<em><b>BC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BC_VALUE = 9;

	/**
	 * The '<em><b>CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 10;

	/**
	 * The '<em><b>AA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AA_VALUE = 11;

	/**
	 * The '<em><b>BB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BB_VALUE = 12;

	/**
	 * The '<em><b>CC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CC_VALUE = 13;

	/**
	 * The '<em><b>DD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DD_VALUE = 14;

	/**
	 * The '<em><b>QMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QMA_VALUE = 15;

	/**
	 * The '<em><b>QMB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QMB_VALUE = 16;

	/**
	 * The '<em><b>QMC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QMC_VALUE = 17;

	/**
	 * The '<em><b>QMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QMD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QMD_VALUE = 18;

	/**
	 * An array of all the '<em><b>ASIL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ASIL[] VALUES_ARRAY =
		new ASIL[] {
			NOASSIGNMENT,
			QM,
			A,
			B,
			C,
			D,
			AB,
			AC,
			AD,
			BC,
			CD,
			AA,
			BB,
			CC,
			DD,
			QMA,
			QMB,
			QMC,
			QMD,
		};

	/**
	 * A public read-only list of all the '<em><b>ASIL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ASIL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ASIL</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ASIL get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ASIL result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ASIL</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ASIL getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ASIL result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ASIL</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ASIL get(int value) {
		switch (value) {
			case NOASSIGNMENT_VALUE: return NOASSIGNMENT;
			case QM_VALUE: return QM;
			case A_VALUE: return A;
			case B_VALUE: return B;
			case C_VALUE: return C;
			case D_VALUE: return D;
			case AB_VALUE: return AB;
			case AC_VALUE: return AC;
			case AD_VALUE: return AD;
			case BC_VALUE: return BC;
			case CD_VALUE: return CD;
			case AA_VALUE: return AA;
			case BB_VALUE: return BB;
			case CC_VALUE: return CC;
			case DD_VALUE: return DD;
			case QMA_VALUE: return QMA;
			case QMB_VALUE: return QMB;
			case QMC_VALUE: return QMC;
			case QMD_VALUE: return QMD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ASIL(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ASIL
