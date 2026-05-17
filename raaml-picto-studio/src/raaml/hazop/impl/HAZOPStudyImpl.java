/**
 */
package raaml.hazop.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.AnalysisImpl;

import raaml.hazop.HAZOPNode;
import raaml.hazop.HAZOPStudy;
import raaml.hazop.HazopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAZOP Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hazop.impl.HAZOPStudyImpl#getStudyDate <em>Study Date</em>}</li>
 *   <li>{@link raaml.hazop.impl.HAZOPStudyImpl#getStandardReference <em>Standard Reference</em>}</li>
 *   <li>{@link raaml.hazop.impl.HAZOPStudyImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HAZOPStudyImpl extends AnalysisImpl implements HAZOPStudy {
	/**
	 * The default value of the '{@link #getStudyDate() <em>Study Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDate()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudyDate() <em>Study Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDate()
	 * @generated
	 * @ordered
	 */
	protected String studyDate = STUDY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardReference() <em>Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardReference()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_REFERENCE_EDEFAULT = "IEC 61882:2016";

	/**
	 * The cached value of the '{@link #getStandardReference() <em>Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardReference()
	 * @generated
	 * @ordered
	 */
	protected String standardReference = STANDARD_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<HAZOPNode> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAZOPStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazopPackage.Literals.HAZOP_STUDY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStudyDate() {
		return studyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyDate(String newStudyDate) {
		String oldStudyDate = studyDate;
		studyDate = newStudyDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.HAZOP_STUDY__STUDY_DATE, oldStudyDate, studyDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardReference() {
		return standardReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardReference(String newStandardReference) {
		String oldStandardReference = standardReference;
		standardReference = newStandardReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.HAZOP_STUDY__STANDARD_REFERENCE, oldStandardReference, standardReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HAZOPNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<HAZOPNode>(HAZOPNode.class, this, HazopPackage.HAZOP_STUDY__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazopPackage.HAZOP_STUDY__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case HazopPackage.HAZOP_STUDY__STUDY_DATE:
				return getStudyDate();
			case HazopPackage.HAZOP_STUDY__STANDARD_REFERENCE:
				return getStandardReference();
			case HazopPackage.HAZOP_STUDY__NODES:
				return getNodes();
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
			case HazopPackage.HAZOP_STUDY__STUDY_DATE:
				setStudyDate((String)newValue);
				return;
			case HazopPackage.HAZOP_STUDY__STANDARD_REFERENCE:
				setStandardReference((String)newValue);
				return;
			case HazopPackage.HAZOP_STUDY__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends HAZOPNode>)newValue);
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
			case HazopPackage.HAZOP_STUDY__STUDY_DATE:
				setStudyDate(STUDY_DATE_EDEFAULT);
				return;
			case HazopPackage.HAZOP_STUDY__STANDARD_REFERENCE:
				setStandardReference(STANDARD_REFERENCE_EDEFAULT);
				return;
			case HazopPackage.HAZOP_STUDY__NODES:
				getNodes().clear();
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
			case HazopPackage.HAZOP_STUDY__STUDY_DATE:
				return STUDY_DATE_EDEFAULT == null ? studyDate != null : !STUDY_DATE_EDEFAULT.equals(studyDate);
			case HazopPackage.HAZOP_STUDY__STANDARD_REFERENCE:
				return STANDARD_REFERENCE_EDEFAULT == null ? standardReference != null : !STANDARD_REFERENCE_EDEFAULT.equals(standardReference);
			case HazopPackage.HAZOP_STUDY__NODES:
				return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (studyDate: ");
		result.append(studyDate);
		result.append(", standardReference: ");
		result.append(standardReference);
		result.append(')');
		return result.toString();
	}

} //HAZOPStudyImpl
