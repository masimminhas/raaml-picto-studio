/**
 */
package raaml.req.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.CoreSafetyElement;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.req.ReqPackage;
import raaml.req.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.impl.RequirementImpl#getText <em>Text</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementImpl#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementImpl#getParentRequirement <em>Parent Requirement</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementImpl#getChildRequirements <em>Child Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends CoreSafetyElementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedElements() <em>Related Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreSafetyElement> relatedElements;

	/**
	 * The cached value of the '{@link #getParentRequirement() <em>Parent Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement parentRequirement;

	/**
	 * The cached value of the '{@link #getChildRequirements() <em>Child Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> childRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.REQUIREMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.REQUIREMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoreSafetyElement> getRelatedElements() {
		if (relatedElements == null) {
			relatedElements = new EObjectResolvingEList<CoreSafetyElement>(CoreSafetyElement.class, this, ReqPackage.REQUIREMENT__RELATED_ELEMENTS);
		}
		return relatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getParentRequirement() {
		if (parentRequirement != null && parentRequirement.eIsProxy()) {
			InternalEObject oldParentRequirement = (InternalEObject)parentRequirement;
			parentRequirement = (Requirement)eResolveProxy(oldParentRequirement);
			if (parentRequirement != oldParentRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.REQUIREMENT__PARENT_REQUIREMENT, oldParentRequirement, parentRequirement));
			}
		}
		return parentRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetParentRequirement() {
		return parentRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentRequirement(Requirement newParentRequirement) {
		Requirement oldParentRequirement = parentRequirement;
		parentRequirement = newParentRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.REQUIREMENT__PARENT_REQUIREMENT, oldParentRequirement, parentRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getChildRequirements() {
		if (childRequirements == null) {
			childRequirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, ReqPackage.REQUIREMENT__CHILD_REQUIREMENTS);
		}
		return childRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqPackage.REQUIREMENT__CHILD_REQUIREMENTS:
				return ((InternalEList<?>)getChildRequirements()).basicRemove(otherEnd, msgs);
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
			case ReqPackage.REQUIREMENT__TEXT:
				return getText();
			case ReqPackage.REQUIREMENT__TYPE:
				return getType();
			case ReqPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case ReqPackage.REQUIREMENT__STATUS:
				return getStatus();
			case ReqPackage.REQUIREMENT__RELATED_ELEMENTS:
				return getRelatedElements();
			case ReqPackage.REQUIREMENT__PARENT_REQUIREMENT:
				if (resolve) return getParentRequirement();
				return basicGetParentRequirement();
			case ReqPackage.REQUIREMENT__CHILD_REQUIREMENTS:
				return getChildRequirements();
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
			case ReqPackage.REQUIREMENT__TEXT:
				setText((String)newValue);
				return;
			case ReqPackage.REQUIREMENT__TYPE:
				setType((String)newValue);
				return;
			case ReqPackage.REQUIREMENT__PRIORITY:
				setPriority((String)newValue);
				return;
			case ReqPackage.REQUIREMENT__STATUS:
				setStatus((String)newValue);
				return;
			case ReqPackage.REQUIREMENT__RELATED_ELEMENTS:
				getRelatedElements().clear();
				getRelatedElements().addAll((Collection<? extends CoreSafetyElement>)newValue);
				return;
			case ReqPackage.REQUIREMENT__PARENT_REQUIREMENT:
				setParentRequirement((Requirement)newValue);
				return;
			case ReqPackage.REQUIREMENT__CHILD_REQUIREMENTS:
				getChildRequirements().clear();
				getChildRequirements().addAll((Collection<? extends Requirement>)newValue);
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
			case ReqPackage.REQUIREMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ReqPackage.REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ReqPackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ReqPackage.REQUIREMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ReqPackage.REQUIREMENT__RELATED_ELEMENTS:
				getRelatedElements().clear();
				return;
			case ReqPackage.REQUIREMENT__PARENT_REQUIREMENT:
				setParentRequirement((Requirement)null);
				return;
			case ReqPackage.REQUIREMENT__CHILD_REQUIREMENTS:
				getChildRequirements().clear();
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
			case ReqPackage.REQUIREMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ReqPackage.REQUIREMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ReqPackage.REQUIREMENT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case ReqPackage.REQUIREMENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ReqPackage.REQUIREMENT__RELATED_ELEMENTS:
				return relatedElements != null && !relatedElements.isEmpty();
			case ReqPackage.REQUIREMENT__PARENT_REQUIREMENT:
				return parentRequirement != null;
			case ReqPackage.REQUIREMENT__CHILD_REQUIREMENTS:
				return childRequirements != null && !childRequirements.isEmpty();
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
		result.append(" (text: ");
		result.append(text);
		result.append(", type: ");
		result.append(type);
		result.append(", priority: ");
		result.append(priority);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
