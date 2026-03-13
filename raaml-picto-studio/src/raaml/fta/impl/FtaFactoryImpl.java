/**
 */
package raaml.fta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import raaml.fta.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtaFactoryImpl extends EFactoryImpl implements FtaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FtaFactory init() {
		try {
			FtaFactory theFtaFactory = (FtaFactory)EPackage.Registry.INSTANCE.getEFactory(FtaPackage.eNS_URI);
			if (theFtaFactory != null) {
				return theFtaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FtaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FtaPackage.FTA: return createFTA();
			case FtaPackage.BASIC_EVENT: return createBasicEvent();
			case FtaPackage.INTERMEDIATE_EVENT: return createIntermediateEvent();
			case FtaPackage.TOP_EVENT: return createTopEvent();
			case FtaPackage.CONDITIONAL_EVENT: return createConditionalEvent();
			case FtaPackage.DORMANT_EVENT: return createDormantEvent();
			case FtaPackage.UNDEVELOPED_EVENT: return createUndevelopedEvent();
			case FtaPackage.HOUSE_EVENT: return createHouseEvent();
			case FtaPackage.ZERO_EVENT: return createZeroEvent();
			case FtaPackage.AND: return createAND();
			case FtaPackage.OR: return createOR();
			case FtaPackage.NOT: return createNOT();
			case FtaPackage.XOR: return createXOR();
			case FtaPackage.SEQ: return createSEQ();
			case FtaPackage.INHIBIT: return createINHIBIT();
			case FtaPackage.MAJORITY_VOTE: return createMAJORITY_VOTE();
			case FtaPackage.FTA_TREE: return createFTATree();
			case FtaPackage.FTA_LIBRARY: return createFTALibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FTA createFTA() {
		FTAImpl fta = new FTAImpl();
		return fta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopEvent createTopEvent() {
		TopEventImpl topEvent = new TopEventImpl();
		return topEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalEvent createConditionalEvent() {
		ConditionalEventImpl conditionalEvent = new ConditionalEventImpl();
		return conditionalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DormantEvent createDormantEvent() {
		DormantEventImpl dormantEvent = new DormantEventImpl();
		return dormantEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UndevelopedEvent createUndevelopedEvent() {
		UndevelopedEventImpl undevelopedEvent = new UndevelopedEventImpl();
		return undevelopedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HouseEvent createHouseEvent() {
		HouseEventImpl houseEvent = new HouseEventImpl();
		return houseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeroEvent createZeroEvent() {
		ZeroEventImpl zeroEvent = new ZeroEventImpl();
		return zeroEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AND createAND() {
		ANDImpl and = new ANDImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OR createOR() {
		ORImpl or = new ORImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NOT createNOT() {
		NOTImpl not = new NOTImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XOR createXOR() {
		XORImpl xor = new XORImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SEQ createSEQ() {
		SEQImpl seq = new SEQImpl();
		return seq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public INHIBIT createINHIBIT() {
		INHIBITImpl inhibit = new INHIBITImpl();
		return inhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAJORITY_VOTE createMAJORITY_VOTE() {
		MAJORITY_VOTEImpl majoritY_VOTE = new MAJORITY_VOTEImpl();
		return majoritY_VOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FTATree createFTATree() {
		FTATreeImpl ftaTree = new FTATreeImpl();
		return ftaTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FTALibrary createFTALibrary() {
		FTALibraryImpl ftaLibrary = new FTALibraryImpl();
		return ftaLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FtaPackage getFtaPackage() {
		return (FtaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FtaPackage getPackage() {
		return FtaPackage.eINSTANCE;
	}

} //FtaFactoryImpl
