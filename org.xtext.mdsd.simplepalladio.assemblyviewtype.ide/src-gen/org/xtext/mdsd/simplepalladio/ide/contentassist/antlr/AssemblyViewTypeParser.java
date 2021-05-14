/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsd.simplepalladio.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.mdsd.simplepalladio.ide.contentassist.antlr.internal.InternalAssemblyViewTypeParser;
import org.xtext.mdsd.simplepalladio.services.AssemblyViewTypeGrammarAccess;

public class AssemblyViewTypeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AssemblyViewTypeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AssemblyViewTypeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractSystemElementAccess().getAlternatives(), "rule__AbstractSystemElement__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getGroup(), "rule__AssemblyViewType__Group__0");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getGroup_5(), "rule__AssemblyViewType__Group_5__0");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_2(), "rule__System__Group_2__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_2_3(), "rule__System__Group_2_3__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_6(), "rule__System__Group_6__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_11(), "rule__System__Group_11__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup(), "rule__AssemblyContext__Group__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_8(), "rule__AssemblyContext__Group_8__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_10(), "rule__AssemblyContext__Group_10__0");
			builder.put(grammarAccess.getAssemblyContextAccess().getGroup_10_3(), "rule__AssemblyContext__Group_10_3__0");
			builder.put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
			builder.put(grammarAccess.getDelegationConnectorAccess().getGroup(), "rule__DelegationConnector__Group__0");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getGroup(), "rule__AssemblyConnector__Group__0");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_4(), "rule__AssemblyViewType__SystemsAssignment_4");
			builder.put(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_5_1(), "rule__AssemblyViewType__SystemsAssignment_5_1");
			builder.put(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_2_2(), "rule__System__RequiredInterfacesAssignment_2_2");
			builder.put(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_2_3_1(), "rule__System__RequiredInterfacesAssignment_2_3_1");
			builder.put(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_5(), "rule__System__ProvidedInterfacesAssignment_5");
			builder.put(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_6_1(), "rule__System__ProvidedInterfacesAssignment_6_1");
			builder.put(grammarAccess.getSystemAccess().getSystemElementsAssignment_10(), "rule__System__SystemElementsAssignment_10");
			builder.put(grammarAccess.getSystemAccess().getSystemElementsAssignment_11_1(), "rule__System__SystemElementsAssignment_11_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getNameAssignment_1(), "rule__AssemblyContext__NameAssignment_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4(), "rule__AssemblyContext__ComponentAssignment_4");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_7(), "rule__AssemblyContext__ProvidedRolesAssignment_7");
			builder.put(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_8_1(), "rule__AssemblyContext__ProvidedRolesAssignment_8_1");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_2(), "rule__AssemblyContext__RequiredRolesAssignment_10_2");
			builder.put(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_3_1(), "rule__AssemblyContext__RequiredRolesAssignment_10_3_1");
			builder.put(grammarAccess.getRoleAccess().getInterfaceAssignment_3(), "rule__Role__InterfaceAssignment_3");
			builder.put(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_3(), "rule__DelegationConnector__RoleAssignment_3");
			builder.put(grammarAccess.getDelegationConnectorAccess().getInterfaceAssignment_5(), "rule__DelegationConnector__InterfaceAssignment_5");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleAssignment_3(), "rule__AssemblyConnector__ProvidedRoleAssignment_3");
			builder.put(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleAssignment_5(), "rule__AssemblyConnector__RequiredRoleAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AssemblyViewTypeGrammarAccess grammarAccess;

	@Override
	protected InternalAssemblyViewTypeParser createParser() {
		InternalAssemblyViewTypeParser result = new InternalAssemblyViewTypeParser(null);
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

	public AssemblyViewTypeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AssemblyViewTypeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
