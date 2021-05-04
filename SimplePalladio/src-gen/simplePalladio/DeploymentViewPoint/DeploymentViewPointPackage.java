/**
 */
package simplePalladio.DeploymentViewPoint;

import org.eclipse.emf.ecore.EClass;
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
 * @see simplePalladio.DeploymentViewPoint.DeploymentViewPointFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DeploymentViewPointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DeploymentViewPoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simplePalladio/DeploymentViewPoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DeploymentViewPoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentViewPointPackage eINSTANCE = simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link simplePalladio.DeploymentViewPoint.impl.EnvironmentViewTypeImpl <em>Environment View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.DeploymentViewPoint.impl.EnvironmentViewTypeImpl
	 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getEnvironmentViewType()
	 * @generated
	 */
	int ENVIRONMENT_VIEW_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Environment Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Environment View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VIEW_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Environment View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.DeploymentViewPoint.impl.AllocationViewTypeImpl <em>Allocation View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.DeploymentViewPoint.impl.AllocationViewTypeImpl
	 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getAllocationViewType()
	 * @generated
	 */
	int ALLOCATION_VIEW_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS = 0;

	/**
	 * The number of structural features of the '<em>Allocation View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_VIEW_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allocation View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_VIEW_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplePalladio.DeploymentViewPoint.impl.AbstractEnvironmentElementImpl <em>Abstract Environment Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.DeploymentViewPoint.impl.AbstractEnvironmentElementImpl
	 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getAbstractEnvironmentElement()
	 * @generated
	 */
	int ABSTRACT_ENVIRONMENT_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENVIRONMENT_ELEMENT__NAME = CommonPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Environment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENVIRONMENT_ELEMENT_FEATURE_COUNT = CommonPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Environment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENVIRONMENT_ELEMENT_OPERATION_COUNT = CommonPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.DeploymentViewPoint.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.DeploymentViewPoint.impl.ContainerImpl
	 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ABSTRACT_ENVIRONMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LINKS = ABSTRACT_ENVIRONMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ABSTRACT_ENVIRONMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ABSTRACT_ENVIRONMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.DeploymentViewPoint.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.DeploymentViewPoint.impl.LinkImpl
	 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = ABSTRACT_ENVIRONMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTAINERS = ABSTRACT_ENVIRONMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ABSTRACT_ENVIRONMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ABSTRACT_ENVIRONMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplePalladio.DeploymentViewPoint.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplePalladio.DeploymentViewPoint.impl.AllocationContextImpl
	 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getAllocationContext()
	 * @generated
	 */
	int ALLOCATION_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__ASSEMBLY = 1;

	/**
	 * The number of structural features of the '<em>Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link simplePalladio.DeploymentViewPoint.EnvironmentViewType <em>Environment View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment View Type</em>'.
	 * @see simplePalladio.DeploymentViewPoint.EnvironmentViewType
	 * @generated
	 */
	EClass getEnvironmentViewType();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.DeploymentViewPoint.EnvironmentViewType#getEnvironmentElements <em>Environment Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Elements</em>'.
	 * @see simplePalladio.DeploymentViewPoint.EnvironmentViewType#getEnvironmentElements()
	 * @see #getEnvironmentViewType()
	 * @generated
	 */
	EReference getEnvironmentViewType_EnvironmentElements();

	/**
	 * Returns the meta object for class '{@link simplePalladio.DeploymentViewPoint.AllocationViewType <em>Allocation View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation View Type</em>'.
	 * @see simplePalladio.DeploymentViewPoint.AllocationViewType
	 * @generated
	 */
	EClass getAllocationViewType();

	/**
	 * Returns the meta object for the containment reference list '{@link simplePalladio.DeploymentViewPoint.AllocationViewType#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Contexts</em>'.
	 * @see simplePalladio.DeploymentViewPoint.AllocationViewType#getAllocationContexts()
	 * @see #getAllocationViewType()
	 * @generated
	 */
	EReference getAllocationViewType_AllocationContexts();

	/**
	 * Returns the meta object for class '{@link simplePalladio.DeploymentViewPoint.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see simplePalladio.DeploymentViewPoint.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.DeploymentViewPoint.Container#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see simplePalladio.DeploymentViewPoint.Container#getLinks()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Links();

	/**
	 * Returns the meta object for class '{@link simplePalladio.DeploymentViewPoint.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see simplePalladio.DeploymentViewPoint.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link simplePalladio.DeploymentViewPoint.Link#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see simplePalladio.DeploymentViewPoint.Link#getContainers()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Containers();

	/**
	 * Returns the meta object for class '{@link simplePalladio.DeploymentViewPoint.AllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Context</em>'.
	 * @see simplePalladio.DeploymentViewPoint.AllocationContext
	 * @generated
	 */
	EClass getAllocationContext();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.DeploymentViewPoint.AllocationContext#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see simplePalladio.DeploymentViewPoint.AllocationContext#getContainer()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_Container();

	/**
	 * Returns the meta object for the reference '{@link simplePalladio.DeploymentViewPoint.AllocationContext#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly</em>'.
	 * @see simplePalladio.DeploymentViewPoint.AllocationContext#getAssembly()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_Assembly();

	/**
	 * Returns the meta object for class '{@link simplePalladio.DeploymentViewPoint.AbstractEnvironmentElement <em>Abstract Environment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Environment Element</em>'.
	 * @see simplePalladio.DeploymentViewPoint.AbstractEnvironmentElement
	 * @generated
	 */
	EClass getAbstractEnvironmentElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentViewPointFactory getDeploymentViewPointFactory();

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
		 * The meta object literal for the '{@link simplePalladio.DeploymentViewPoint.impl.EnvironmentViewTypeImpl <em>Environment View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.DeploymentViewPoint.impl.EnvironmentViewTypeImpl
		 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getEnvironmentViewType()
		 * @generated
		 */
		EClass ENVIRONMENT_VIEW_TYPE = eINSTANCE.getEnvironmentViewType();

		/**
		 * The meta object literal for the '<em><b>Environment Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_VIEW_TYPE__ENVIRONMENT_ELEMENTS = eINSTANCE.getEnvironmentViewType_EnvironmentElements();

		/**
		 * The meta object literal for the '{@link simplePalladio.DeploymentViewPoint.impl.AllocationViewTypeImpl <em>Allocation View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.DeploymentViewPoint.impl.AllocationViewTypeImpl
		 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getAllocationViewType()
		 * @generated
		 */
		EClass ALLOCATION_VIEW_TYPE = eINSTANCE.getAllocationViewType();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_VIEW_TYPE__ALLOCATION_CONTEXTS = eINSTANCE.getAllocationViewType_AllocationContexts();

		/**
		 * The meta object literal for the '{@link simplePalladio.DeploymentViewPoint.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.DeploymentViewPoint.impl.ContainerImpl
		 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__LINKS = eINSTANCE.getContainer_Links();

		/**
		 * The meta object literal for the '{@link simplePalladio.DeploymentViewPoint.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.DeploymentViewPoint.impl.LinkImpl
		 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONTAINERS = eINSTANCE.getLink_Containers();

		/**
		 * The meta object literal for the '{@link simplePalladio.DeploymentViewPoint.impl.AllocationContextImpl <em>Allocation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.DeploymentViewPoint.impl.AllocationContextImpl
		 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getAllocationContext()
		 * @generated
		 */
		EClass ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__CONTAINER = eINSTANCE.getAllocationContext_Container();

		/**
		 * The meta object literal for the '<em><b>Assembly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__ASSEMBLY = eINSTANCE.getAllocationContext_Assembly();

		/**
		 * The meta object literal for the '{@link simplePalladio.DeploymentViewPoint.impl.AbstractEnvironmentElementImpl <em>Abstract Environment Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplePalladio.DeploymentViewPoint.impl.AbstractEnvironmentElementImpl
		 * @see simplePalladio.DeploymentViewPoint.impl.DeploymentViewPointPackageImpl#getAbstractEnvironmentElement()
		 * @generated
		 */
		EClass ABSTRACT_ENVIRONMENT_ELEMENT = eINSTANCE.getAbstractEnvironmentElement();

	}

} //DeploymentViewPointPackage
