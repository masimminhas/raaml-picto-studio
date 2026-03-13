/**
 */
package raaml.gsn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.AnalysisImpl;

import raaml.gsn.ContextualInformation;
import raaml.gsn.GSN;
import raaml.gsn.GSNNode;
import raaml.gsn.GsnPackage;
import raaml.gsn.InContextOf;
import raaml.gsn.SupportedBy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.gsn.impl.GSNImpl#getContextualInformation <em>Contextual Information</em>}</li>
 *   <li>{@link raaml.gsn.impl.GSNImpl#getGsnNodes <em>Gsn Nodes</em>}</li>
 *   <li>{@link raaml.gsn.impl.GSNImpl#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link raaml.gsn.impl.GSNImpl#getInContextOf <em>In Context Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSNImpl extends AnalysisImpl implements GSN {
	/**
	 * The cached value of the '{@link #getContextualInformation() <em>Contextual Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextualInformation> contextualInformation;

	/**
	 * The cached value of the '{@link #getGsnNodes() <em>Gsn Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGsnNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<GSNNode> gsnNodes;

	/**
	 * The cached value of the '{@link #getSupportedBy() <em>Supported By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedBy> supportedBy;

	/**
	 * The cached value of the '{@link #getInContextOf() <em>In Context Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInContextOf()
	 * @generated
	 * @ordered
	 */
	protected EList<InContextOf> inContextOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsnPackage.Literals.GSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextualInformation> getContextualInformation() {
		if (contextualInformation == null) {
			contextualInformation = new EObjectContainmentEList<ContextualInformation>(ContextualInformation.class, this, GsnPackage.GSN__CONTEXTUAL_INFORMATION);
		}
		return contextualInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GSNNode> getGsnNodes() {
		if (gsnNodes == null) {
			gsnNodes = new EObjectContainmentEList<GSNNode>(GSNNode.class, this, GsnPackage.GSN__GSN_NODES);
		}
		return gsnNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupportedBy> getSupportedBy() {
		if (supportedBy == null) {
			supportedBy = new EObjectContainmentEList<SupportedBy>(SupportedBy.class, this, GsnPackage.GSN__SUPPORTED_BY);
		}
		return supportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InContextOf> getInContextOf() {
		if (inContextOf == null) {
			inContextOf = new EObjectContainmentEList<InContextOf>(InContextOf.class, this, GsnPackage.GSN__IN_CONTEXT_OF);
		}
		return inContextOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsnPackage.GSN__CONTEXTUAL_INFORMATION:
				return ((InternalEList<?>)getContextualInformation()).basicRemove(otherEnd, msgs);
			case GsnPackage.GSN__GSN_NODES:
				return ((InternalEList<?>)getGsnNodes()).basicRemove(otherEnd, msgs);
			case GsnPackage.GSN__SUPPORTED_BY:
				return ((InternalEList<?>)getSupportedBy()).basicRemove(otherEnd, msgs);
			case GsnPackage.GSN__IN_CONTEXT_OF:
				return ((InternalEList<?>)getInContextOf()).basicRemove(otherEnd, msgs);
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
			case GsnPackage.GSN__CONTEXTUAL_INFORMATION:
				return getContextualInformation();
			case GsnPackage.GSN__GSN_NODES:
				return getGsnNodes();
			case GsnPackage.GSN__SUPPORTED_BY:
				return getSupportedBy();
			case GsnPackage.GSN__IN_CONTEXT_OF:
				return getInContextOf();
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
			case GsnPackage.GSN__CONTEXTUAL_INFORMATION:
				getContextualInformation().clear();
				getContextualInformation().addAll((Collection<? extends ContextualInformation>)newValue);
				return;
			case GsnPackage.GSN__GSN_NODES:
				getGsnNodes().clear();
				getGsnNodes().addAll((Collection<? extends GSNNode>)newValue);
				return;
			case GsnPackage.GSN__SUPPORTED_BY:
				getSupportedBy().clear();
				getSupportedBy().addAll((Collection<? extends SupportedBy>)newValue);
				return;
			case GsnPackage.GSN__IN_CONTEXT_OF:
				getInContextOf().clear();
				getInContextOf().addAll((Collection<? extends InContextOf>)newValue);
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
			case GsnPackage.GSN__CONTEXTUAL_INFORMATION:
				getContextualInformation().clear();
				return;
			case GsnPackage.GSN__GSN_NODES:
				getGsnNodes().clear();
				return;
			case GsnPackage.GSN__SUPPORTED_BY:
				getSupportedBy().clear();
				return;
			case GsnPackage.GSN__IN_CONTEXT_OF:
				getInContextOf().clear();
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
			case GsnPackage.GSN__CONTEXTUAL_INFORMATION:
				return contextualInformation != null && !contextualInformation.isEmpty();
			case GsnPackage.GSN__GSN_NODES:
				return gsnNodes != null && !gsnNodes.isEmpty();
			case GsnPackage.GSN__SUPPORTED_BY:
				return supportedBy != null && !supportedBy.isEmpty();
			case GsnPackage.GSN__IN_CONTEXT_OF:
				return inContextOf != null && !inContextOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSNImpl
