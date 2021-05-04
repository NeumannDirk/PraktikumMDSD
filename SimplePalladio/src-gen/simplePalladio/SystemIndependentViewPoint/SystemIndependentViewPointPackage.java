/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import simplePalladio.Common.CommonPackage;

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
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SystemIndependentViewPointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SystemIndependentViewPoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simplePalladio/SystemIndependentViewPoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SystemIndependentViewPoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemIndependentViewPointPackage eINSTANCE = simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.RepositoryViewTypeImpl <em>Repository View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.RepositoryViewTypeImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getRepositoryViewType()
	 * @generated
	 */
	int REPOSITORY_VIEW_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Repository Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Repository View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_VIEW_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.AbstractRepositoryElementImpl <em>Abstract Repository Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.AbstractRepositoryElementImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getAbstractRepositoryElement()
	 * @generated
	 */
	int ABSTRACT_REPOSITORY_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY_ELEMENT__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Repository Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Repository Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY_ELEMENT_OPERATION_COUNT = CommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.InterfaceImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ABSTRACT_REPOSITORY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SIGNATURES = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Provider Communicator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_PROVIDER_COMMUNICATOR = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Requireree Communicator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_REQUIREREE_COMMUNICATOR = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = ABSTRACT_REPOSITORY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.AbstractComponentImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__NAME = ABSTRACT_REPOSITORY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__REQUIRED_INTERFACES = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__PROVIDED_INTERFACES = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION_COUNT = ABSTRACT_REPOSITORY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.CompositeComponentImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REQUIRED_INTERFACES = ABSTRACT_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PROVIDED_INTERFACES = ABSTRACT_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__SYSTEM = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SignatureImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = ABSTRACT_REPOSITORY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RETURN_VALUE = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETERS = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = ABSTRACT_REPOSITORY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = ABSTRACT_REPOSITORY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.ComponentImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_INTERFACES = ABSTRACT_COMPONENT__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_INTERFACES = ABSTRACT_COMPONENT__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SERVICES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.ParameterImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = CommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.ServiceImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BEHAVIOUR_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.BehaviourDescriptionImpl <em>Behaviour Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.BehaviourDescriptionImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getBehaviourDescription()
	 * @generated
	 */
	int BEHAVIOUR_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Behavior Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION__SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Behaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behaviour Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.BehaviorElementImpl <em>Behavior Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.BehaviorElementImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getBehaviorElement()
	 * @generated
	 */
	int BEHAVIOR_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Behavior Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavior Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.InternalActionImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__BEHAVIOUR_DESCRIPTION = BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = BEHAVIOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = BEHAVIOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ExternalCallImpl <em>External Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.ExternalCallImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getExternalCall()
	 * @generated
	 */
	int EXTERNAL_CALL = 11;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__BEHAVIOUR_DESCRIPTION = BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL__SIGNATURE = BEHAVIOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_FEATURE_COUNT = BEHAVIOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_OPERATION_COUNT = BEHAVIOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.LoopImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 12;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BEHAVIOUR_DESCRIPTION = BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Behavior Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BEHAVIOR_ELEMENTS = BEHAVIOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = BEHAVIOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = BEHAVIOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.BranchImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 13;

	/**
	 * The feature id for the '<em><b>Behaviour Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BEHAVIOUR_DESCRIPTION = BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Behavior Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BEHAVIOR_ELEMENTS = BEHAVIOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = BEHAVIOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = BEHAVIOR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.impl.InterfaceCommunicatorImpl <em>Interface Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.impl.InterfaceCommunicatorImpl
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getInterfaceCommunicator()
	 * @generated
	 */
	int INTERFACE_COMMUNICATOR = 15;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES = 1;

	/**
	 * The number of structural features of the '<em>Interface Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMMUNICATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMMUNICATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.SystemIndependentViewPoint.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.SystemIndependentViewPoint.Type
	 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 16;

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.RepositoryViewType <em>Repository View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository View Type</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.RepositoryViewType
	 * @generated
	 */
	EClass getRepositoryViewType();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.SystemIndependentViewPoint.RepositoryViewType#getRepositoryElements <em>Repository Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository Elements</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.RepositoryViewType#getRepositoryElements()
	 * @see #getRepositoryViewType()
	 * @generated
	 */
	EReference getRepositoryViewType_RepositoryElements();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.SystemIndependentViewPoint.Interface#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signatures</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Interface#getSignatures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Signatures();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.SystemIndependentViewPoint.Interface#getParentProviderCommunicator <em>Parent Provider Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Provider Communicator</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Interface#getParentProviderCommunicator()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentProviderCommunicator();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.SystemIndependentViewPoint.Interface#getParentRequirereeCommunicator <em>Parent Requireree Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Requireree Communicator</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Interface#getParentRequirereeCommunicator()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentRequirereeCommunicator();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.SystemIndependentViewPoint.CompositeComponent#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.CompositeComponent#getSystem()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_System();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the attribute '{@link simplePalladio.SystemIndependentViewPoint.Signature#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Value</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Signature#getReturnValue()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_ReturnValue();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.SystemIndependentViewPoint.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Signature#getParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameters();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.SystemIndependentViewPoint.Component#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Component#getServices()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Services();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link simplePalladio.SystemIndependentViewPoint.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement <em>Abstract Repository Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Repository Element</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement
	 * @generated
	 */
	EClass getAbstractRepositoryElement();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.SystemIndependentViewPoint.Service#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Service#getSignature()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Signature();

	/**
	 * Returns the meta object for the containment reference '{@link simplePalladio.SystemIndependentViewPoint.Service#getBehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviour Description</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Service#getBehaviourDescription()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_BehaviourDescription();

	/**
	 * Returns the meta object for the container reference '{@link simplePalladio.SystemIndependentViewPoint.Service#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Service#getComponent()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Component();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour Description</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviourDescription
	 * @generated
	 */
	EClass getBehaviourDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getBehaviorElements <em>Behavior Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Elements</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getBehaviorElements()
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	EReference getBehaviourDescription_BehaviorElements();

	/**
	 * Returns the meta object for the container reference '{@link simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviourDescription#getService()
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	EReference getBehaviourDescription_Service();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.ExternalCall <em>External Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.ExternalCall
	 * @generated
	 */
	EClass getExternalCall();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.SystemIndependentViewPoint.ExternalCall#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.ExternalCall#getSignature()
	 * @see #getExternalCall()
	 * @generated
	 */
	EReference getExternalCall_Signature();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.SystemIndependentViewPoint.Loop#getBehaviorElements <em>Behavior Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavior Elements</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Loop#getBehaviorElements()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_BehaviorElements();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.SystemIndependentViewPoint.Branch#getBehaviorElements <em>Behavior Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavior Elements</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Branch#getBehaviorElements()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_BehaviorElements();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.BehaviorElement <em>Behavior Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Element</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviorElement
	 * @generated
	 */
	EClass getBehaviorElement();

	/**
	 * Returns the meta object for the container reference '{@link simplePalladio.SystemIndependentViewPoint.BehaviorElement#getBehaviourDescription <em>Behaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Behaviour Description</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.BehaviorElement#getBehaviourDescription()
	 * @see #getBehaviorElement()
	 * @generated
	 */
	EReference getBehaviorElement_BehaviourDescription();

	/**
	 * Returns the meta object for class '{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator <em>Interface Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Communicator</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator
	 * @generated
	 */
	EClass getInterfaceCommunicator();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interfaces</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getRequiredInterfaces()
	 * @see #getInterfaceCommunicator()
	 * @generated
	 */
	EReference getInterfaceCommunicator_RequiredInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Interfaces</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.InterfaceCommunicator#getProvidedInterfaces()
	 * @see #getInterfaceCommunicator()
	 * @generated
	 */
	EReference getInterfaceCommunicator_ProvidedInterfaces();

	/**
	 * Returns the meta object for enum '{@link simplePalladio.SystemIndependentViewPoint.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see simplePalladio.SystemIndependentViewPoint.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemIndependentViewPointFactory getSystemIndependentViewPointFactory();

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
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.RepositoryViewTypeImpl <em>Repository View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.RepositoryViewTypeImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getRepositoryViewType()
		 * @generated
		 */
		EClass REPOSITORY_VIEW_TYPE = eINSTANCE.getRepositoryViewType();

		/**
		 * The meta object literal for the '<em><b>Repository Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_VIEW_TYPE__REPOSITORY_ELEMENTS = eINSTANCE.getRepositoryViewType_RepositoryElements();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.InterfaceImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SIGNATURES = eINSTANCE.getInterface_Signatures();

		/**
		 * The meta object literal for the '<em><b>Parent Provider Communicator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_PROVIDER_COMMUNICATOR = eINSTANCE.getInterface_ParentProviderCommunicator();

		/**
		 * The meta object literal for the '<em><b>Parent Requireree Communicator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_REQUIREREE_COMMUNICATOR = eINSTANCE.getInterface_ParentRequirereeCommunicator();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.CompositeComponentImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__SYSTEM = eINSTANCE.getCompositeComponent_System();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SignatureImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__RETURN_VALUE = eINSTANCE.getSignature_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.AbstractComponentImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.ComponentImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SERVICES = eINSTANCE.getComponent_Services();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.ParameterImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.AbstractRepositoryElementImpl <em>Abstract Repository Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.AbstractRepositoryElementImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getAbstractRepositoryElement()
		 * @generated
		 */
		EClass ABSTRACT_REPOSITORY_ELEMENT = eINSTANCE.getAbstractRepositoryElement();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.ServiceImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SIGNATURE = eINSTANCE.getService_Signature();

		/**
		 * The meta object literal for the '<em><b>Behaviour Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BEHAVIOUR_DESCRIPTION = eINSTANCE.getService_BehaviourDescription();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__COMPONENT = eINSTANCE.getService_Component();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.BehaviourDescriptionImpl <em>Behaviour Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.BehaviourDescriptionImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getBehaviourDescription()
		 * @generated
		 */
		EClass BEHAVIOUR_DESCRIPTION = eINSTANCE.getBehaviourDescription();

		/**
		 * The meta object literal for the '<em><b>Behavior Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_DESCRIPTION__BEHAVIOR_ELEMENTS = eINSTANCE.getBehaviourDescription_BehaviorElements();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_DESCRIPTION__SERVICE = eINSTANCE.getBehaviourDescription_Service();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.InternalActionImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.ExternalCallImpl <em>External Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.ExternalCallImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getExternalCall()
		 * @generated
		 */
		EClass EXTERNAL_CALL = eINSTANCE.getExternalCall();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL__SIGNATURE = eINSTANCE.getExternalCall_Signature();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.LoopImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Behavior Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BEHAVIOR_ELEMENTS = eINSTANCE.getLoop_BehaviorElements();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.BranchImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Behavior Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__BEHAVIOR_ELEMENTS = eINSTANCE.getBranch_BehaviorElements();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.BehaviorElementImpl <em>Behavior Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.BehaviorElementImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getBehaviorElement()
		 * @generated
		 */
		EClass BEHAVIOR_ELEMENT = eINSTANCE.getBehaviorElement();

		/**
		 * The meta object literal for the '<em><b>Behaviour Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ELEMENT__BEHAVIOUR_DESCRIPTION = eINSTANCE.getBehaviorElement_BehaviourDescription();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.impl.InterfaceCommunicatorImpl <em>Interface Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.impl.InterfaceCommunicatorImpl
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getInterfaceCommunicator()
		 * @generated
		 */
		EClass INTERFACE_COMMUNICATOR = eINSTANCE.getInterfaceCommunicator();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES = eINSTANCE
				.getInterfaceCommunicator_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES = eINSTANCE
				.getInterfaceCommunicator_ProvidedInterfaces();

		/**
		 * The meta object literal for the '{@link simplePalladio.SystemIndependentViewPoint.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.SystemIndependentViewPoint.Type
		 * @see simplePalladio.SystemIndependentViewPoint.impl.SystemIndependentViewPointPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //SystemIndependentViewPointPackage
