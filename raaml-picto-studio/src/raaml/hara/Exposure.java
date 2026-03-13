/**
 */
package raaml.hara;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exposure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ISO 26262 exposure rating
 * <!-- end-model-doc -->
 * @see raaml.hara.HaraPackage#getExposure()
 * @model
 * @generated
 */
public enum Exposure implements Enumerator {
	/**
	 * The '<em><b>E0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E0_VALUE
	 * @generated
	 * @ordered
	 */
	E0(0, "E0", "E0"),

	/**
	 * The '<em><b>E1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E1_VALUE
	 * @generated
	 * @ordered
	 */
	E1(1, "E1", "E1"),

	/**
	 * The '<em><b>E2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_VALUE
	 * @generated
	 * @ordered
	 */
	E2(2, "E2", "E2"),

	/**
	 * The '<em><b>E3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E3_VALUE
	 * @generated
	 * @ordered
	 */
	E3(3, "E3", "E3"),

	/**
	 * The '<em><b>E4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E4_VALUE
	 * @generated
	 * @ordered
	 */
	E4(4, "E4", "E4");

	/**
	 * The '<em><b>E0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E0_VALUE = 0;

	/**
	 * The '<em><b>E1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E1_VALUE = 1;

	/**
	 * The '<em><b>E2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E2_VALUE = 2;

	/**
	 * The '<em><b>E3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E3_VALUE = 3;

	/**
	 * The '<em><b>E4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Exposure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Exposure[] VALUES_ARRAY =
		new Exposure[] {
			E0,
			E1,
			E2,
			E3,
			E4,
		};

	/**
	 * A public read-only list of all the '<em><b>Exposure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Exposure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exposure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Exposure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Exposure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Exposure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Exposure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Exposure get(int value) {
		switch (value) {
			case E0_VALUE: return E0;
			case E1_VALUE: return E1;
			case E2_VALUE: return E2;
			case E3_VALUE: return E3;
			case E4_VALUE: return E4;
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
	private Exposure(int value, String name, String literal) {
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
	
} //Exposure
