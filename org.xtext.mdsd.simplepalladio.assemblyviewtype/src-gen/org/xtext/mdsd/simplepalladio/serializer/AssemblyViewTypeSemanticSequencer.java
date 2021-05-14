/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsd.simplepalladio.serializer;

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
import org.xtext.mdsd.simplepalladio.services.AssemblyViewTypeGrammarAccess;
import simplePalladio.AssemblyViewPoint.AssemblyConnector;
import simplePalladio.AssemblyViewPoint.AssemblyContext;
import simplePalladio.AssemblyViewPoint.AssemblyViewPointPackage;
import simplePalladio.AssemblyViewPoint.AssemblyViewType;
import simplePalladio.AssemblyViewPoint.DelegationConnector;
import simplePalladio.AssemblyViewPoint.Role;

@SuppressWarnings("all")
public class AssemblyViewTypeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AssemblyViewTypeGrammarAccess grammarAccess;
	
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
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractSystemElement returns AssemblyConnector
	 *     AssemblyConnector returns AssemblyConnector
	 *
	 * Constraint:
	 *     (providedRole=[Role|EString] requiredRole=[Role|EString])
	 */
	protected void sequence_AssemblyConnector(ISerializationContext context, AssemblyConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleEStringParserRuleCall_3_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, false));
		feeder.accept(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleEStringParserRuleCall_5_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, false));
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
	 *     AbstractSystemElement returns DelegationConnector
	 *     DelegationConnector returns DelegationConnector
	 *
	 * Constraint:
	 *     (role=[Role|EString] interface=[Interface|EString])
	 */
	protected void sequence_DelegationConnector(ISerializationContext context, DelegationConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__ROLE));
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_3_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__ROLE, false));
		feeder.accept(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceEStringParserRuleCall_5_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.DELEGATION_CONNECTOR__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractSystemElement returns Role
	 *     Role returns Role
	 *
	 * Constraint:
	 *     interface=[Interface|EString]
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AssemblyViewPointPackage.Literals.ROLE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AssemblyViewPointPackage.Literals.ROLE__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getInterfaceInterfaceEStringParserRuleCall_3_0_1(), semanticObject.eGet(AssemblyViewPointPackage.Literals.ROLE__INTERFACE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceCommunicator returns System
	 *     System returns System
	 *
	 * Constraint:
	 *     (
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
