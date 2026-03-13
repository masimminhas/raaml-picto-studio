/**
 */
package raaml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.RaamlPackage;
import raaml.SafetyAnalysis;

import raaml.core.AbstractLibrary;
import raaml.core.Analysis;

import raaml.core.impl.NamedElementImpl;

import raaml.req.RequirementsModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.impl.SafetyAnalysisImpl#getAnalyses <em>Analyses</em>}</li>
 *   <li>{@link raaml.impl.SafetyAnalysisImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link raaml.impl.SafetyAnalysisImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyAnalysisImpl extends NamedElementImpl implements SafetyAnalysis {
	/**
	 * The cached value of the '{@link #getAnalyses() <em>Analyses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyses()
	 * @generated
	 * @ordered
	 */
	protected EList<Analysis> analyses;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractLibrary> libraries;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsModel> requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaamlPackage.Literals.SAFETY_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Analysis> getAnalyses() {
		if (analyses == null) {
			analyses = new EObjectContainmentEList<Analysis>(Analysis.class, this, RaamlPackage.SAFETY_ANALYSIS__ANALYSES);
		}
		return analyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractLibrary> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<AbstractLibrary>(AbstractLibrary.class, this, RaamlPackage.SAFETY_ANALYSIS__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementsModel> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<RequirementsModel>(RequirementsModel.class, this, RaamlPackage.SAFETY_ANALYSIS__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaamlPackage.SAFETY_ANALYSIS__ANALYSES:
				return ((InternalEList<?>)getAnalyses()).basicRemove(otherEnd, msgs);
			case RaamlPackage.SAFETY_ANALYSIS__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case RaamlPackage.SAFETY_ANALYSIS__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaamlPackage.SAFETY_ANALYSIS__ANALYSES:
				return getAnalyses();
			case RaamlPackage.SAFETY_ANALYSIS__LIBRARIES:
				return getLibraries();
			case RaamlPackage.SAFETY_ANALYSIS__REQUIREMENTS:
				return getRequirements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaamlPackage.SAFETY_ANALYSIS__ANALYSES:
				getAnalyses().clear();
				getAnalyses().addAll((Collection<? extends Analysis>)newValue);
				return;
			case RaamlPackage.SAFETY_ANALYSIS__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends AbstractLibrary>)newValue);
				return;
			case RaamlPackage.SAFETY_ANALYSIS__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends RequirementsModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RaamlPackage.SAFETY_ANALYSIS__ANALYSES:
				getAnalyses().clear();
				return;
			case RaamlPackage.SAFETY_ANALYSIS__LIBRARIES:
				getLibraries().clear();
				return;
			case RaamlPackage.SAFETY_ANALYSIS__REQUIREMENTS:
				getRequirements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RaamlPackage.SAFETY_ANALYSIS__ANALYSES:
				return analyses != null && !analyses.isEmpty();
			case RaamlPackage.SAFETY_ANALYSIS__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case RaamlPackage.SAFETY_ANALYSIS__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SafetyAnalysisImpl
