/**
 */
package raaml.gsn.impl;

import org.eclipse.emf.ecore.EClass;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.gsn.Dependency;
import raaml.gsn.GsnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DependencyImpl extends CoreSafetyElementImpl implements Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsnPackage.Literals.DEPENDENCY;
	}

} //DependencyImpl
