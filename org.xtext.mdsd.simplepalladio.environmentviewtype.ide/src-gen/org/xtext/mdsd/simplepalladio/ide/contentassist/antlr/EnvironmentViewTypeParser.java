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
import org.xtext.mdsd.simplepalladio.ide.contentassist.antlr.internal.InternalEnvironmentViewTypeParser;
import org.xtext.mdsd.simplepalladio.services.EnvironmentViewTypeGrammarAccess;

public class EnvironmentViewTypeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EnvironmentViewTypeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EnvironmentViewTypeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractEnvironmentElementAccess().getAlternatives(), "rule__AbstractEnvironmentElement__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getGroup(), "rule__EnvironmentViewType__Group__0");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getGroup_5(), "rule__EnvironmentViewType__Group_5__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_6(), "rule__Link__Group_6__0");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_4(), "rule__EnvironmentViewType__EnvironmentElementsAssignment_4");
			builder.put(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_5_1(), "rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
			builder.put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
			builder.put(grammarAccess.getLinkAccess().getContainersAssignment_5(), "rule__Link__ContainersAssignment_5");
			builder.put(grammarAccess.getLinkAccess().getContainersAssignment_6_1(), "rule__Link__ContainersAssignment_6_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EnvironmentViewTypeGrammarAccess grammarAccess;

	@Override
	protected InternalEnvironmentViewTypeParser createParser() {
		InternalEnvironmentViewTypeParser result = new InternalEnvironmentViewTypeParser(null);
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

	public EnvironmentViewTypeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EnvironmentViewTypeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
