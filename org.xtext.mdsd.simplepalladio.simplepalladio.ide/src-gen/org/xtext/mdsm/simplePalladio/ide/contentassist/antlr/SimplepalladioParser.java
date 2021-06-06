/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsm.simplePalladio.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.mdsm.simplePalladio.ide.contentassist.antlr.internal.InternalSimplepalladioParser;
import org.xtext.mdsm.simplePalladio.services.SimplepalladioGrammarAccess;

public class SimplepalladioParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SimplepalladioGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SimplepalladioGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractRepositoryElementAccess().getAlternatives(), "rule__AbstractRepositoryElement__Alternatives");
			builder.put(grammarAccess.getInterfaceCommunicatorAccess().getAlternatives(), "rule__InterfaceCommunicator__Alternatives");
			builder.put(grammarAccess.getAbstractComponentAccess().getAlternatives(), "rule__AbstractComponent__Alternatives");
			builder.put(grammarAccess.getBehaviorElementAccess().getAlternatives(), "rule__BehaviorElement__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getAbstractSystemElementAccess().getAlternatives(), "rule__AbstractSystemElement__Alternatives");
			builder.put(grammarAccess.getAbstractEnvironmentElementAccess().getAlternatives(), "rule__AbstractEnvironmentElement__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getRepositoryViewTypeAccess().getGroup(), "rule__RepositoryViewType__Group__0");
			builder.put(grammarAccess.getRepositoryViewTypeAccess().getGroup_5(), "rule__RepositoryViewType__Group_5__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_6(), "rule__Interface__Group_6__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup(), "rule__CompositeComponent__Group__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_3(), "rule__CompositeComponent__Group_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_3_3(), "rule__CompositeComponent__Group_3_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_7(), "rule__CompositeComponent__Group_7__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_5(), "rule__Signature__Group_5__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_5_3(), "rule__Signature__Group_5_3__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_3(), "rule__Component__Group_3__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_3_3(), "rule__Component__Group_3_3__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_7(), "rule__Component__Group_7__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_12(), "rule__Component__Group_12__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup(), "rule__BehaviourDescription__Group__0");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getGroup_6(), "rule__BehaviourDescription__Group_6__0");
			builder.put(grammarAccess.getInternalActionAccess().getGroup(), "rule__InternalAction__Group__0");
			builder.put(grammarAccess.getExternalCallAccess().getGroup(), "rule__ExternalCall__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_3(), "rule__Loop__Group_3__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_3_3(), "rule__Loop__Group_3_3__0");
			builder.put(grammarAccess.getBranchAccess().getGroup(), "rule__Branch__Group__0");
			builder.put(grammarAccess.getBranchAccess().getGroup_3(), "rule__Branch__Group_3__0");
			builder.put(grammarAccess.getBranchAccess().getGroup_3_3(), "rule__Branch__Group_3_3__0");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getGroup(), "rule__AssemblyViewType__Group__0");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getGroup_5(), "rule__AssemblyViewType__Group_5__0");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_3(), "rule__System__Group_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_3_3(), "rule__System__Group_3_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_7(), "rule__System__Group_7__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_12(), "rule__System__Group_12__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup(), "rule__AssemblyContext__Group__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_8(), "rule__AssemblyContext__Group_8__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_10(), "rule__AssemblyContext__Group_10__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_10_3(), "rule__AssemblyContext__Group_10_3__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getDelegationConnectorAccess().getGroup(), "rule__DelegationConnector__Group__0");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getGroup(), "rule__AssemblyConnector__Group__0");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getGroup(), "rule__EnvironmentViewType__Group__0");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getGroup_5(), "rule__EnvironmentViewType__Group_5__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_6(), "rule__Link__Group_6__0");
			builder.put(grammarAccess.getAllocationViewTypeAccess().getGroup(), "rule__AllocationViewType__Group__0");
			builder.put(grammarAccess.getAllocationViewTypeAccess().getGroup_5(), "rule__AllocationViewType__Group_5__0");
			builder.put(grammarAccess.getAllocationContextAccess().getGroup(), "rule__AllocationContext__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getRepositoryViewTypeAssignment_1(), "rule__Model__RepositoryViewTypeAssignment_1");
			builder.put(grammarAccess.getModelAccess().getAssemblyViewTypeAssignment_2(), "rule__Model__AssemblyViewTypeAssignment_2");
			builder.put(grammarAccess.getModelAccess().getEnvironmentViewTypeAssignment_3(), "rule__Model__EnvironmentViewTypeAssignment_3");
			builder.put(grammarAccess.getModelAccess().getAllocationViewTypeAssignment_4(), "rule__Model__AllocationViewTypeAssignment_4");
			builder.put(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAssignment_4(), "rule__RepositoryViewType__RepositoryElementsAssignment_4");
			builder.put(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAssignment_5_1(), "rule__RepositoryViewType__RepositoryElementsAssignment_5_1");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_1(), "rule__Interface__NameAssignment_1");
			builder.put(grammarAccess.getInterfaceAccess().getSignaturesAssignment_5(), "rule__Interface__SignaturesAssignment_5");
			builder.put(grammarAccess.getInterfaceAccess().getSignaturesAssignment_6_1(), "rule__Interface__SignaturesAssignment_6_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getNameAssignment_1(), "rule__CompositeComponent__NameAssignment_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesAssignment_3_2(), "rule__CompositeComponent__RequiredInterfacesAssignment_3_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesAssignment_3_3_1(), "rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesAssignment_6(), "rule__CompositeComponent__ProvidedInterfacesAssignment_6");
			builder.put(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesAssignment_7_1(), "rule__CompositeComponent__ProvidedInterfacesAssignment_7_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getSystemAssignment_10(), "rule__CompositeComponent__SystemAssignment_10");
			builder.put(grammarAccess.getSignatureAccess().getNameAssignment_1(), "rule__Signature__NameAssignment_1");
			builder.put(grammarAccess.getSignatureAccess().getReturnValueAssignment_4(), "rule__Signature__ReturnValueAssignment_4");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_5_2(), "rule__Signature__ParametersAssignment_5_2");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_5_3_1(), "rule__Signature__ParametersAssignment_5_3_1");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getRequiredInterfacesAssignment_3_2(), "rule__Component__RequiredInterfacesAssignment_3_2");
			builder.put(grammarAccess.getComponentAccess().getRequiredInterfacesAssignment_3_3_1(), "rule__Component__RequiredInterfacesAssignment_3_3_1");
			builder.put(grammarAccess.getComponentAccess().getProvidedInterfacesAssignment_6(), "rule__Component__ProvidedInterfacesAssignment_6");
			builder.put(grammarAccess.getComponentAccess().getProvidedInterfacesAssignment_7_1(), "rule__Component__ProvidedInterfacesAssignment_7_1");
			builder.put(grammarAccess.getComponentAccess().getServicesAssignment_11(), "rule__Component__ServicesAssignment_11");
			builder.put(grammarAccess.getComponentAccess().getServicesAssignment_12_1(), "rule__Component__ServicesAssignment_12_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_4(), "rule__Parameter__TypeAssignment_4");
			builder.put(grammarAccess.getServiceAccess().getSignatureAssignment_3(), "rule__Service__SignatureAssignment_3");
			builder.put(grammarAccess.getServiceAccess().getBehaviourDescriptionAssignment_5(), "rule__Service__BehaviourDescriptionAssignment_5");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsAssignment_5(), "rule__BehaviourDescription__BehaviorElementsAssignment_5");
			builder.put(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsAssignment_6_1(), "rule__BehaviourDescription__BehaviorElementsAssignment_6_1");
			builder.put(grammarAccess.getExternalCallAccess().getSignatureAssignment_3(), "rule__ExternalCall__SignatureAssignment_3");
			builder.put(grammarAccess.getLoopAccess().getBehaviorElementsAssignment_3_2(), "rule__Loop__BehaviorElementsAssignment_3_2");
			builder.put(grammarAccess.getLoopAccess().getBehaviorElementsAssignment_3_3_1(), "rule__Loop__BehaviorElementsAssignment_3_3_1");
			builder.put(grammarAccess.getBranchAccess().getBehaviorElementsAssignment_3_2(), "rule__Branch__BehaviorElementsAssignment_3_2");
			builder.put(grammarAccess.getBranchAccess().getBehaviorElementsAssignment_3_3_1(), "rule__Branch__BehaviorElementsAssignment_3_3_1");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_4(), "rule__AssemblyViewType__SystemsAssignment_4");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_5_1(), "rule__AssemblyViewType__SystemsAssignment_5_1");
			builder.put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
			builder.put(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_3_2(), "rule__System__RequiredInterfacesAssignment_3_2");
			builder.put(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_3_3_1(), "rule__System__RequiredInterfacesAssignment_3_3_1");
			builder.put(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_6(), "rule__System__ProvidedInterfacesAssignment_6");
			builder.put(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_7_1(), "rule__System__ProvidedInterfacesAssignment_7_1");
			builder.put(grammarAccess.getSystemAccess().getSystemElementsAssignment_11(), "rule__System__SystemElementsAssignment_11");
			builder.put(grammarAccess.getSystemAccess().getSystemElementsAssignment_12_1(), "rule__System__SystemElementsAssignment_12_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getNameAssignment_1(), "rule__AssemblyContext__NameAssignment_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4(), "rule__AssemblyContext__ComponentAssignment_4");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_7(), "rule__AssemblyContext__ProvidedRolesAssignment_7");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_8_1(), "rule__AssemblyContext__ProvidedRolesAssignment_8_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_2(), "rule__AssemblyContext__RequiredRolesAssignment_10_2");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_3_1(), "rule__AssemblyContext__RequiredRolesAssignment_10_3_1");
			builder.put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
			builder.put(grammarAccess.getRoleAccess().getInterfaceAssignment_4(), "rule__Role__InterfaceAssignment_4");
			builder.put(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_3(), "rule__DelegationConnector__RoleAssignment_3");
			builder.put(grammarAccess.getDelegationConnectorAccess().getInterfaceAssignment_5(), "rule__DelegationConnector__InterfaceAssignment_5");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleAssignment_3(), "rule__AssemblyConnector__ProvidedRoleAssignment_3");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleAssignment_5(), "rule__AssemblyConnector__RequiredRoleAssignment_5");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_4(), "rule__EnvironmentViewType__EnvironmentElementsAssignment_4");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_5_1(), "rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
			builder.put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
			builder.put(grammarAccess.getLinkAccess().getContainersAssignment_5(), "rule__Link__ContainersAssignment_5");
			builder.put(grammarAccess.getLinkAccess().getContainersAssignment_6_1(), "rule__Link__ContainersAssignment_6_1");
			builder.put(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_4(), "rule__AllocationViewType__AllocationContextsAssignment_4");
			builder.put(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_5_1(), "rule__AllocationViewType__AllocationContextsAssignment_5_1");
			builder.put(grammarAccess.getAllocationContextAccess().getContainerAssignment_3(), "rule__AllocationContext__ContainerAssignment_3");
			builder.put(grammarAccess.getAllocationContextAccess().getAssemblyAssignment_5(), "rule__AllocationContext__AssemblyAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SimplepalladioGrammarAccess grammarAccess;

	@Override
	protected InternalSimplepalladioParser createParser() {
		InternalSimplepalladioParser result = new InternalSimplepalladioParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SimplepalladioGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimplepalladioGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
