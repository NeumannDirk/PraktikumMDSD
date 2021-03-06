/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsm.simplePalladio.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.mdsm.simplePalladio.services.SimplepalladioGrammarAccess;
import org.xtext.mdsm.simplePalladio.simplepalladio.Model;
import org.xtext.mdsm.simplePalladio.simplepalladio.SimplepalladioPackage;
import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.AssemblyViewType;
import simplePalladio.AssemblyViewPoint.DelegationConnector;
import simplePalladio.AssemblyViewPoint.Role;
import simplePalladio.Common.CommonPackage;
import simplePalladio.DeploymentViewPoint.AllocationContext;
import simplePalladio.DeploymentViewPoint.AllocationViewType;
import simplePalladio.DeploymentViewPoint.Container;
import simplePalladio.DeploymentViewPoint.DeploymentViewPointPackage;
import simplePalladio.DeploymentViewPoint.EnvironmentViewType;
import simplePalladio.DeploymentViewPoint.Link;
import simplePalladio.SystemIndependentViewPoint.BehaviourDescription;
import simplePalladio.SystemIndependentViewPoint.Branch;
import simplePalladio.SystemIndependentViewPoint.Component;
import simplePalladio.SystemIndependentViewPoint.CompositeComponent;
import simplePalladio.SystemIndependentViewPoint.ExternalCall;
import simplePalladio.SystemIndependentViewPoint.Interface;
import simplePalladio.SystemIndependentViewPoint.InternalAction;
import simplePalladio.SystemIndependentViewPoint.Loop;
import simplePalladio.SystemIndependentViewPoint.RepositoryViewType;
import simplePalladio.SystemIndependentViewPoint.Service;
import simplePalladio.SystemIndependentViewPoint.Signature;
import simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage;

@SuppressWarnings("all")
public class SimplepalladioSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimplepalladioGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AssemblyViewPointPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AssemblyViewPointPackage.ASSEMBLY_CONNECTOR:
				sequence_AssemblyConnector(context, (AssemblyConnector) semanticObject); 
				return; 
			case AssemblyViewPointPackage.ASSEMBLY_CONTEXT:
				sequence_AssemblyContext(context, (AssemblyContext) semanticObject); 
				return; 
			case AssemblyViewPointPackage.ASSEMBLY_VIEW_TYPE:
				sequence_AssemblyViewType(context, (AssemblyViewType) semanticObject); 
				return; 
			case AssemblyViewPointPackage.DELEGATION_CONNECTOR:
				sequence_DelegationConnector(context, (DelegationConnector) semanticObject); 
				return; 
			case AssemblyViewPointPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case AssemblyViewPointPackage.SYSTEM:
				sequence_System(context, (simplePalladio.AssemblyViewPoint.System) semanticObject); 
				return; 
			}
		else if (epackage == DeploymentViewPointPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DeploymentViewPointPackage.ALLOCATION_CONTEXT:
				sequence_AllocationContext(context, (AllocationContext) semanticObject); 
				return; 
			case DeploymentViewPointPackage.ALLOCATION_VIEW_TYPE:
				sequence_AllocationViewType(context, (AllocationViewType) semanticObject); 
				return; 
			case DeploymentViewPointPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case DeploymentViewPointPackage.ENVIRONMENT_VIEW_TYPE:
				sequence_EnvironmentViewType(context, (EnvironmentViewType) semanticObject); 
				return; 
			case DeploymentViewPointPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			}
		else if (epackage == SystemIndependentViewPointPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SystemIndependentViewPointPackage.BEHAVIOUR_DESCRIPTION:
				sequence_BehaviourDescription(context, (BehaviourDescription) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.BRANCH:
				sequence_Branch(context, (Branch) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.COMPOSITE_COMPONENT:
				sequence_CompositeComponent(context, (CompositeComponent) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.EXTERNAL_CALL:
				sequence_ExternalCall(context, (ExternalCall) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.INTERNAL_ACTION:
				sequence_InternalAction(context, (InternalAction) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.PARAMETER:
				sequence_Parameter(context, (simplePalladio.SystemIndependentViewPoint.Parameter) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.REPOSITORY_VIEW_TYPE:
				sequence_RepositoryViewType(context, (RepositoryViewType) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case SystemIndependentViewPointPackage.SIGNATURE:
				sequence_Signature(context, (Signature) semanticObject); 
				return; 
			}
		else if (epackage == SimplepalladioPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimplepalladioPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AllocationContext returns AllocationContext
	 *
	 * Constraint:
	 *     (container=[Container|EString] assembly=[AssemblyContext|QualifiedName])
	 */
	protected void sequence_AllocationContext(ISerializationContext context, AllocationContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT__CONTAINER));
			if (transientValues.isValueTransient(semanticObject, DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT__ASSEMBLY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT__ASSEMBLY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1(), semanticObject.eGet(DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT__CONTAINER, false));
		feeder.accept(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextQualifiedNameParserRuleCall_5_0_1(), semanticObject.eGet(DeploymentViewPointPackage.Literals.ALLOCATION_CONTEXT__ASSEMBLY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AllocationViewType returns AllocationViewType
	 *
	 * Constraint:
	 *     (allocationContexts+=AllocationContext allocationContexts+=AllocationContext*)
	 */
	protected void sequence_AllocationViewType(ISerializationContext context, AllocationViewType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractSystemElement returns AssemblyConnector
	 *     AssemblyConnector returns AssemblyConnector
	 *
	 * Constraint:
	 *     (name=EString providedRole=[Role|EString] requiredRole=[Role|EString])
	 */
	protected void sequence_AssemblyConnector(ISerializationContext context, AssemblyConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleEStringParserRuleCall_4_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, false));
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleEStringParserRuleCall_6_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractSystemElement returns AssemblyContext
	 *     AssemblyContext returns AssemblyContext
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         component=[AbstractComponent|EString] 
	 *         providedRoles+=[Role|EString] 
	 *         providedRoles+=[Role|EString]* 
	 *         (requiredRoles+=[Role|EString] requiredRoles+=[Role|EString]*)?
	 *     )
	 */
	protected void sequence_AssemblyContext(ISerializationContext context, AssemblyContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AssemblyViewType returns AssemblyViewType
	 *
	 * Constraint:
	 *     (systems+=System systems+=System*)
	 */
	protected void sequence_AssemblyViewType(ISerializationContext context, AssemblyViewType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourDescription returns BehaviourDescription
	 *
	 * Constraint:
	 *     (behaviorElements+=BehaviorElement behaviorElements+=BehaviorElement*)
	 */
	protected void sequence_BehaviourDescription(ISerializationContext context, BehaviourDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviorElement returns Branch
	 *     Branch returns Branch
	 *
	 * Constraint:
	 *     (behaviorElements+=BehaviorElement behaviorElements+=BehaviorElement*)?
	 */
	protected void sequence_Branch(ISerializationContext context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRepositoryElement returns Component
	 *     InterfaceCommunicator returns Component
	 *     AbstractComponent returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (requiredInterfaces+=[Interface|EString] requiredInterfaces+=[Interface|EString]*)? 
	 *         providedInterfaces+=[Interface|EString] 
	 *         providedInterfaces+=[Interface|EString]* 
	 *         services+=Service 
	 *         services+=Service*
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRepositoryElement returns CompositeComponent
	 *     InterfaceCommunicator returns CompositeComponent
	 *     AbstractComponent returns CompositeComponent
	 *     CompositeComponent returns CompositeComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (requiredInterfaces+=[Interface|EString] requiredInterfaces+=[Interface|EString]*)? 
	 *         providedInterfaces+=[Interface|EString] 
	 *         providedInterfaces+=[Interface|EString]* 
	 *         system=[System|QualifiedName]
	 *     )
	 */
	protected void sequence_CompositeComponent(ISerializationContext context, CompositeComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractEnvironmentElement returns Container
	 *     Container returns Container
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractSystemElement returns DelegationConnector
	 *     DelegationConnector returns DelegationConnector
	 *
	 * Constraint:
	 *     (name=EString role=[Role|EString] interface=[Interface|EString])
	 */
	protected void sequence_DelegationConnector(ISerializationContext context, DelegationConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_4_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__ROLE, false));
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceEStringParserRuleCall_6_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnvironmentViewType returns EnvironmentViewType
	 *
	 * Constraint:
	 *     (environmentElements+=AbstractEnvironmentElement environmentElements+=AbstractEnvironmentElement*)
	 */
	protected void sequence_EnvironmentViewType(ISerializationContext context, EnvironmentViewType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviorElement returns ExternalCall
	 *     ExternalCall returns ExternalCall
	 *
	 * Constraint:
	 *     signature=[Signature|EString]
	 */
	protected void sequence_ExternalCall(ISerializationContext context, ExternalCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SystemIndependentViewPointPackage.Literals.EXTERNAL_CALL__SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemIndependentViewPointPackage.Literals.EXTERNAL_CALL__SIGNATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalCallAccess().getSignatureSignatureEStringParserRuleCall_3_0_1(), semanticObject.eGet(SystemIndependentViewPointPackage.Literals.EXTERNAL_CALL__SIGNATURE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRepositoryElement returns Interface
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=EString signatures+=[Signature|EString] signatures+=[Signature|EString]*)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviorElement returns InternalAction
	 *     InternalAction returns InternalAction
	 *
	 * Constraint:
	 *     {InternalAction}
	 */
	protected void sequence_InternalAction(ISerializationContext context, InternalAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractEnvironmentElement returns Link
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (name=EString containers+=[Container|EString] containers+=[Container|EString]+)
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviorElement returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (behaviorElements+=BehaviorElement behaviorElements+=BehaviorElement*)?
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         repositoryViewType=RepositoryViewType 
	 *         assemblyViewType=AssemblyViewType 
	 *         repositoryViewType2=RepositoryViewType? 
	 *         assemblyViewType2=AssemblyViewType? 
	 *         environmentViewType=EnvironmentViewType 
	 *         allocationViewType=AllocationViewType
	 *     )
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString type=Type)
	 */
	protected void sequence_Parameter(ISerializationContext context, simplePalladio.SystemIndependentViewPoint.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SystemIndependentViewPointPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemIndependentViewPointPackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RepositoryViewType returns RepositoryViewType
	 *
	 * Constraint:
	 *     (repositoryElements+=AbstractRepositoryElement repositoryElements+=AbstractRepositoryElement*)
	 */
	protected void sequence_RepositoryViewType(ISerializationContext context, RepositoryViewType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractSystemElement returns Role
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=EString interface=[Interface|EString])
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.ROLE__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (signature=[Signature|EString] behaviourDescription=BehaviourDescription)
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SystemIndependentViewPointPackage.Literals.SERVICE__SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemIndependentViewPointPackage.Literals.SERVICE__SIGNATURE));
			if (transientValues.isValueTransient(semanticObject, SystemIndependentViewPointPackage.Literals.SERVICE__BEHAVIOUR_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemIndependentViewPointPackage.Literals.SERVICE__BEHAVIOUR_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServiceAccess().getSignatureSignatureEStringParserRuleCall_3_0_1(), semanticObject.eGet(SystemIndependentViewPointPackage.Literals.SERVICE__SIGNATURE, false));
		feeder.accept(grammarAccess.getServiceAccess().getBehaviourDescriptionBehaviourDescriptionParserRuleCall_5_0(), semanticObject.getBehaviourDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRepositoryElement returns Signature
	 *     Signature returns Signature
	 *
	 * Constraint:
	 *     (name=EString returnValue=Type (parameters+=Parameter parameters+=Parameter*)?)
	 */
	protected void sequence_Signature(ISerializationContext context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceCommunicator returns System
	 *     System returns System
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (requiredInterfaces+=[Interface|EString] requiredInterfaces+=[Interface|EString]*)? 
	 *         providedInterfaces+=[Interface|EString] 
	 *         providedInterfaces+=[Interface|EString]* 
	 *         systemElements+=AbstractSystemElement 
	 *         systemElements+=AbstractSystemElement*
	 *     )
	 */
	protected void sequence_System(ISerializationContext context, simplePalladio.AssemblyViewPoint.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
