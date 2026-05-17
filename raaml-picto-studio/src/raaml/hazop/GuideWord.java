/**
 */
package raaml.hazop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Guide Word</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Standard HAZOP guide words per IEC 61882:2016 Annex B
 * <!-- end-model-doc -->
 * @see raaml.hazop.HazopPackage#getGuideWord()
 * @model
 * @generated
 */
public enum GuideWord implements Enumerator {
	/**
	 * The '<em><b>NO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(0, "NO", "NO"),

	/**
	 * The '<em><b>MORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORE_VALUE
	 * @generated
	 * @ordered
	 */
	MORE(1, "MORE", "MORE"),

	/**
	 * The '<em><b>LESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS(2, "LESS", "LESS"),

	/**
	 * The '<em><b>AS WELL AS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_WELL_AS_VALUE
	 * @generated
	 * @ordered
	 */
	AS_WELL_AS(3, "AS_WELL_AS", "AS WELL AS"),

	/**
	 * The '<em><b>PART OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART_OF_VALUE
	 * @generated
	 * @ordered
	 */
	PART_OF(4, "PART_OF", "PART OF"),

	/**
	 * The '<em><b>REVERSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERSE_VALUE
	 * @generated
	 * @ordered
	 */
	REVERSE(5, "REVERSE", "REVERSE"),

	/**
	 * The '<em><b>OTHER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_THAN(6, "OTHER_THAN", "OTHER THAN"),

	/**
	 * The '<em><b>EARLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLY_VALUE
	 * @generated
	 * @ordered
	 */
	EARLY(7, "EARLY", "EARLY"),

	/**
	 * The '<em><b>LATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATE_VALUE
	 * @generated
	 * @ordered
	 */
	LATE(8, "LATE", "LATE"),

	/**
	 * The '<em><b>BEFORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(9, "BEFORE", "BEFORE"),

	/**
	 * The '<em><b>AFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(10, "AFTER", "AFTER");

	/**
	 * The '<em><b>NO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 0;

	/**
	 * The '<em><b>MORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MORE_VALUE = 1;

	/**
	 * The '<em><b>LESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_VALUE = 2;

	/**
	 * The '<em><b>AS WELL AS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_WELL_AS
	 * @model literal="AS WELL AS"
	 * @generated
	 * @ordered
	 */
	public static final int AS_WELL_AS_VALUE = 3;

	/**
	 * The '<em><b>PART OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART_OF
	 * @model literal="PART OF"
	 * @generated
	 * @ordered
	 */
	public static final int PART_OF_VALUE = 4;

	/**
	 * The '<em><b>REVERSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REVERSE_VALUE = 5;

	/**
	 * The '<em><b>OTHER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_THAN
	 * @model literal="OTHER THAN"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_THAN_VALUE = 6;

	/**
	 * The '<em><b>EARLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARLY_VALUE = 7;

	/**
	 * The '<em><b>LATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATE_VALUE = 8;

	/**
	 * The '<em><b>BEFORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 9;

	/**
	 * The '<em><b>AFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 10;

	/**
	 * An array of all the '<em><b>Guide Word</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuideWord[] VALUES_ARRAY =
		new GuideWord[] {
			NO,
			MORE,
			LESS,
			AS_WELL_AS,
			PART_OF,
			REVERSE,
			OTHER_THAN,
			EARLY,
			LATE,
			BEFORE,
			AFTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Guide Word</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuideWord> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guide Word</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideWord get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideWord result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Word</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideWord getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideWord result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Word</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideWord get(int value) {
		switch (value) {
			case NO_VALUE: return NO;
			case MORE_VALUE: return MORE;
			case LESS_VALUE: return LESS;
			case AS_WELL_AS_VALUE: return AS_WELL_AS;
			case PART_OF_VALUE: return PART_OF;
			case REVERSE_VALUE: return REVERSE;
			case OTHER_THAN_VALUE: return OTHER_THAN;
			case EARLY_VALUE: return EARLY;
			case LATE_VALUE: return LATE;
			case BEFORE_VALUE: return BEFORE;
			case AFTER_VALUE: return AFTER;
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
	private GuideWord(int value, String name, String literal) {
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
	
} //GuideWord
