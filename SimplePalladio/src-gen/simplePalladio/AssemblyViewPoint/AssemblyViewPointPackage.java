/**
 */
package simplePalladio.AssemblyViewPoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

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
 * @see simplePalladio.AssemblyViewPoint.AssemblyViewPointFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AssemblyViewPointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AssemblyViewPoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simplePalladio/AssemblyViewPoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AssemblyViewPoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyViewPointPackage eINSTANCE = simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl.init();

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.AssemblyViewTypeImpl <em>Assembly View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewTypeImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAssemblyViewType()
	 * @generated
	 */
	int ASSEMBLY_VIEW_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_TYPE__SYSTEMS = 0;

	/**
	 * The number of structural features of the '<em>Assembly View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assembly View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.SystemImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_INTERFACES = SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__REQUIRED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_INTERFACES = SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_ELEMENTS = SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = SystemIndependentViewPointPackage.INTERFACE_COMMUNICATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.AbstractSystemElementImpl <em>Abstract System Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.AbstractSystemElementImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAbstractSystemElement()
	 * @generated
	 */
	int ABSTRACT_SYSTEM_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYSTEM_ELEMENT__SYSTEM = 0;

	/**
	 * The number of structural features of the '<em>Abstract System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYSTEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__SYSTEM = ABSTRACT_SYSTEM_ELEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__NAME = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__COMPONENT = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PROVIDED_ROLES = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__REQUIRED_ROLES = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Assembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Assembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = ABSTRACT_SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.RoleImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SYSTEM = ABSTRACT_SYSTEM_ELEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Provider Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INTERFACE = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Assembly Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__FROM_ASSEMBLY_CONNECTORS = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Requireree Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To Assembly Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TO_ASSEMBLY_CONNECTOR = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ABSTRACT_SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.AbstractConnectorImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAbstractConnector()
	 * @generated
	 */
	int ABSTRACT_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR__SYSTEM = ABSTRACT_SYSTEM_ELEMENT__SYSTEM;

	/**
	 * The number of structural features of the '<em>Abstract Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_FEATURE_COUNT = ABSTRACT_SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTOR_OPERATION_COUNT = ABSTRACT_SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.DelegationConnectorImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__SYSTEM = ABSTRACT_CONNECTOR__SYSTEM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ROLE = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__INTERFACE = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = ABSTRACT_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.AssemblyViewPoint.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyConnectorImpl
	 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__SYSTEM = ABSTRACT_CONNECTOR__SYSTEM;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ROLE = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ROLE = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = ABSTRACT_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.AssemblyViewType <em>Assembly View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly View Type</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewType
	 * @generated
	 */
	EClass getAssemblyViewType();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.AssemblyViewPoint.AssemblyViewType#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyViewType#getSystems()
	 * @see #getAssemblyViewType()
	 * @generated
	 */
	EReference getAssemblyViewType_Systems();

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see simplePalladio.AssemblyViewPoint.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.AssemblyViewPoint.System#getSystemElements <em>System Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Elements</em>'.
	 * @see simplePalladio.AssemblyViewPoint.System#getSystemElements()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SystemElements();

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.AssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Context</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext#getComponent()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_Component();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Roles</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext#getProvidedRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ProvidedRoles();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Roles</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext#getRequiredRoles()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_RequiredRoles();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.AssemblyContext#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Context</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyContext#getAllocationContext()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_AllocationContext();

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see simplePalladio.AssemblyViewPoint.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.Role#getParentProviderAssemblyContext <em>Parent Provider Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Provider Assembly Context</em>'.
	 * @see simplePalladio.AssemblyViewPoint.Role#getParentProviderAssemblyContext()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ParentProviderAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.Role#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see simplePalladio.AssemblyViewPoint.Role#getInterface()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Interface();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.AssemblyViewPoint.Role#getFromAssemblyConnectors <em>From Assembly Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Assembly Connectors</em>'.
	 * @see simplePalladio.AssemblyViewPoint.Role#getFromAssemblyConnectors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_FromAssemblyConnectors();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.Role#getParentRequirereeAssemblyContext <em>Parent Requireree Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Requireree Assembly Context</em>'.
	 * @see simplePalladio.AssemblyViewPoint.Role#getParentRequirereeAssemblyContext()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ParentRequirereeAssemblyContext();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.AssemblyViewPoint.Role#getToAssemblyConnector <em>To Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Assembly Connector</em>'.
	 * @see simplePalladio.AssemblyViewPoint.Role#getToAssemblyConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ToAssemblyConnector();

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see simplePalladio.AssemblyViewPoint.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.DelegationConnector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see simplePalladio.AssemblyViewPoint.DelegationConnector#getRole()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_Role();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.DelegationConnector#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see simplePalladio.AssemblyViewPoint.DelegationConnector#getInterface()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_Interface();

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyConnector#getProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.AssemblyViewPoint.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AssemblyConnector#getRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredRole();

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.AbstractConnector <em>Abstract Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connector</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AbstractConnector
	 * @generated
	 */
	EClass getAbstractConnector();

	/**
	 * Returns the meta object for class '{@link simplePalladio.AssemblyViewPoint.AbstractSystemElement <em>Abstract System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract System Element</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AbstractSystemElement
	 * @generated
	 */
	EClass getAbstractSystemElement();

	/**
	 * Returns the meta object for the container reference '{@link simplePalladio.AssemblyViewPoint.AbstractSystemElement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see simplePalladio.AssemblyViewPoint.AbstractSystemElement#getSystem()
	 * @see #getAbstractSystemElement()
	 * @generated
	 */
	EReference getAbstractSystemElement_System();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyViewPointFactory getAssemblyViewPointFactory();

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
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.AssemblyViewTypeImpl <em>Assembly View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewTypeImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAssemblyViewType()
		 * @generated
		 */
		EClass ASSEMBLY_VIEW_TYPE = eINSTANCE.getAssemblyViewType();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_VIEW_TYPE__SYSTEMS = eINSTANCE.getAssemblyViewType_Systems();

		/**
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.SystemImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>System Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_ELEMENTS = eINSTANCE.getSystem_SystemElements();

		/**
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyContextImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__COMPONENT = eINSTANCE.getAssemblyContext_Component();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PROVIDED_ROLES = eINSTANCE.getAssemblyContext_ProvidedRoles();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__REQUIRED_ROLES = eINSTANCE.getAssemblyContext_RequiredRoles();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = eINSTANCE.getAssemblyContext_AllocationContext();

		/**
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.RoleImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Parent Provider Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PARENT_PROVIDER_ASSEMBLY_CONTEXT = eINSTANCE.getRole_ParentProviderAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INTERFACE = eINSTANCE.getRole_Interface();

		/**
		 * The meta object literal for the '<em><b>From Assembly Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__FROM_ASSEMBLY_CONNECTORS = eINSTANCE.getRole_FromAssemblyConnectors();

		/**
		 * The meta object literal for the '<em><b>Parent Requireree Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PARENT_REQUIREREE_ASSEMBLY_CONTEXT = eINSTANCE.getRole_ParentRequirereeAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>To Assembly Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__TO_ASSEMBLY_CONNECTOR = eINSTANCE.getRole_ToAssemblyConnector();

		/**
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.DelegationConnectorImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__ROLE = eINSTANCE.getDelegationConnector_Role();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__INTERFACE = eINSTANCE.getDelegationConnector_Interface();

		/**
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyConnectorImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_RequiredRole();

		/**
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.AbstractConnectorImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAbstractConnector()
		 * @generated
		 */
		EClass ABSTRACT_CONNECTOR = eINSTANCE.getAbstractConnector();

		/**
		 * The meta object literal for the '{@link simplePalladio.AssemblyViewPoint.impl.AbstractSystemElementImpl <em>Abstract System Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.AssemblyViewPoint.impl.AbstractSystemElementImpl
		 * @see simplePalladio.AssemblyViewPoint.impl.AssemblyViewPointPackageImpl#getAbstractSystemElement()
		 * @generated
		 */
		EClass ABSTRACT_SYSTEM_ELEMENT = eINSTANCE.getAbstractSystemElement();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SYSTEM_ELEMENT__SYSTEM = eINSTANCE.getAbstractSystemElement_System();

	}

} //AssemblyViewPointPackage
