/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsm.simplePalladio.simplepalladio.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.mdsm.simplePalladio.simplepalladio.Model;
import org.xtext.mdsm.simplePalladio.simplepalladio.SimplepalladioFactory;
import org.xtext.mdsm.simplePalladio.simplepalladio.SimplepalladioPackage;

import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;

import simplePalladio.Common.CommonPackage;

import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;

import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplepalladioPackageImpl extends EPackageImpl implements SimplepalladioPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.mdsm.simplePalladio.simplepalladio.SimplepalladioPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimplepalladioPackageImpl()
  {
    super(eNS_URI, SimplepalladioFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link SimplepalladioPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimplepalladioPackage init()
  {
    if (isInited) return (SimplepalladioPackage)EPackage.Registry.INSTANCE.getEPackage(SimplepalladioPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSimplepalladioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SimplepalladioPackageImpl theSimplepalladioPackage = registeredSimplepalladioPackage instanceof SimplepalladioPackageImpl ? (SimplepalladioPackageImpl)registeredSimplepalladioPackage : new SimplepalladioPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    AssemblyViewPointPackage.eINSTANCE.eClass();
    DeploymentViewPointPackage.eINSTANCE.eClass();
    SystemIndependentViewPointPackage.eINSTANCE.eClass();
    CommonPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSimplepalladioPackage.createPackageContents();

    // Initialize created meta-data
    theSimplepalladioPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimplepalladioPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimplepalladioPackage.eNS_URI, theSimplepalladioPackage);
    return theSimplepalladioPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_RepositoryViewType()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_AssemblyViewType()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_RepositoryViewType2()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_AssemblyViewType2()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_EnvironmentViewType()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_AllocationViewType()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimplepalladioFactory getSimplepalladioFactory()
  {
    return (SimplepalladioFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__REPOSITORY_VIEW_TYPE);
    createEReference(modelEClass, MODEL__ASSEMBLY_VIEW_TYPE);
    createEReference(modelEClass, MODEL__REPOSITORY_VIEW_TYPE2);
    createEReference(modelEClass, MODEL__ASSEMBLY_VIEW_TYPE2);
    createEReference(modelEClass, MODEL__ENVIRONMENT_VIEW_TYPE);
    createEReference(modelEClass, MODEL__ALLOCATION_VIEW_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SystemIndependentViewPointPackage theSystemIndependentViewPointPackage = (SystemIndependentViewPointPackage)EPackage.Registry.INSTANCE.getEPackage(SystemIndependentViewPointPackage.eNS_URI);
    AssemblyViewPointPackage theAssemblyViewPointPackage = (AssemblyViewPointPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblyViewPointPackage.eNS_URI);
    DeploymentViewPointPackage theDeploymentViewPointPackage = (DeploymentViewPointPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentViewPointPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_RepositoryViewType(), theSystemIndependentViewPointPackage.getRepositoryViewType(), null, "repositoryViewType", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_AssemblyViewType(), theAssemblyViewPointPackage.getAssemblyViewType(), null, "assemblyViewType", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_RepositoryViewType2(), theSystemIndependentViewPointPackage.getRepositoryViewType(), null, "repositoryViewType2", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_AssemblyViewType2(), theAssemblyViewPointPackage.getAssemblyViewType(), null, "assemblyViewType2", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_EnvironmentViewType(), theDeploymentViewPointPackage.getEnvironmentViewType(), null, "environmentViewType", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_AllocationViewType(), theDeploymentViewPointPackage.getAllocationViewType(), null, "allocationViewType", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimplepalladioPackageImpl
