/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsd.simplepalladio.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EnvironmentViewTypeGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EnvironmentViewTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdsd.simplepalladio.EnvironmentViewType.EnvironmentViewType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnvironmentViewTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEnvironmentElementsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEnvironmentElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEnvironmentElementsAbstractEnvironmentElementParserRuleCall_4_0 = (RuleCall)cEnvironmentElementsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEnvironmentElementsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cEnvironmentElementsAbstractEnvironmentElementParserRuleCall_5_1_0 = (RuleCall)cEnvironmentElementsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//EnvironmentViewType DeploymentViewPoint::EnvironmentViewType:
		//	'EnvironmentViewType'
		//	'{'
		//	'environmentElements' '{' environmentElements+=AbstractEnvironmentElement (","
		//	environmentElements+=AbstractEnvironmentElement)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'EnvironmentViewType'
		//'{'
		//'environmentElements' '{' environmentElements+=AbstractEnvironmentElement (","
		//environmentElements+=AbstractEnvironmentElement)* '}'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'EnvironmentViewType'
		public Keyword getEnvironmentViewTypeKeyword_0() { return cEnvironmentViewTypeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'environmentElements'
		public Keyword getEnvironmentElementsKeyword_2() { return cEnvironmentElementsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//environmentElements+=AbstractEnvironmentElement
		public Assignment getEnvironmentElementsAssignment_4() { return cEnvironmentElementsAssignment_4; }
		
		//AbstractEnvironmentElement
		public RuleCall getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_4_0() { return cEnvironmentElementsAbstractEnvironmentElementParserRuleCall_4_0; }
		
		//("," environmentElements+=AbstractEnvironmentElement)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//environmentElements+=AbstractEnvironmentElement
		public Assignment getEnvironmentElementsAssignment_5_1() { return cEnvironmentElementsAssignment_5_1; }
		
		//AbstractEnvironmentElement
		public RuleCall getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_5_1_0() { return cEnvironmentElementsAbstractEnvironmentElementParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class AbstractEnvironmentElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdsd.simplepalladio.EnvironmentViewType.AbstractEnvironmentElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cContainerParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractEnvironmentElement DeploymentViewPoint::AbstractEnvironmentElement:
		//	Container | Link;
		@Override public ParserRule getRule() { return rule; }
		
		//Container | Link
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Container
		public RuleCall getContainerParserRuleCall_0() { return cContainerParserRuleCall_0; }
		
		//Link
		public RuleCall getLinkParserRuleCall_1() { return cLinkParserRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdsd.simplepalladio.EnvironmentViewType.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdsd.simplepalladio.EnvironmentViewType.Container");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContainerAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cContainerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Container DeploymentViewPoint::Container:
		//	{DeploymentViewPoint::Container}
		//	'Container'
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{DeploymentViewPoint::Container}
		//'Container'
		//name=EString
		public Group getGroup() { return cGroup; }
		
		//{DeploymentViewPoint::Container}
		public Action getContainerAction_0() { return cContainerAction_0; }
		
		//'Container'
		public Keyword getContainerKeyword_1() { return cContainerKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdsd.simplepalladio.EnvironmentViewType.Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cContainersKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cContainersAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cContainersContainerCrossReference_5_0 = (CrossReference)cContainersAssignment_5.eContents().get(0);
		private final RuleCall cContainersContainerEStringParserRuleCall_5_0_1 = (RuleCall)cContainersContainerCrossReference_5_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cContainersAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cContainersContainerCrossReference_6_1_0 = (CrossReference)cContainersAssignment_6_1.eContents().get(0);
		private final RuleCall cContainersContainerEStringParserRuleCall_6_1_0_1 = (RuleCall)cContainersContainerCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Link DeploymentViewPoint::Link:
		//	'Link'
		//	name=EString
		//	'{'
		//	'containers' '(' containers+=[DeploymentViewPoint::Container|EString] (","
		//	containers+=[DeploymentViewPoint::Container|EString])+ ')'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Link'
		//name=EString
		//'{'
		//'containers' '(' containers+=[DeploymentViewPoint::Container|EString] (","
		//containers+=[DeploymentViewPoint::Container|EString])+ ')'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Link'
		public Keyword getLinkKeyword_0() { return cLinkKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'containers'
		public Keyword getContainersKeyword_3() { return cContainersKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//containers+=[DeploymentViewPoint::Container|EString]
		public Assignment getContainersAssignment_5() { return cContainersAssignment_5; }
		
		//[DeploymentViewPoint::Container|EString]
		public CrossReference getContainersContainerCrossReference_5_0() { return cContainersContainerCrossReference_5_0; }
		
		//EString
		public RuleCall getContainersContainerEStringParserRuleCall_5_0_1() { return cContainersContainerEStringParserRuleCall_5_0_1; }
		
		//("," containers+=[DeploymentViewPoint::Container|EString])+
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//containers+=[DeploymentViewPoint::Container|EString]
		public Assignment getContainersAssignment_6_1() { return cContainersAssignment_6_1; }
		
		//[DeploymentViewPoint::Container|EString]
		public CrossReference getContainersContainerCrossReference_6_1_0() { return cContainersContainerCrossReference_6_1_0; }
		
		//EString
		public RuleCall getContainersContainerEStringParserRuleCall_6_1_0_1() { return cContainersContainerEStringParserRuleCall_6_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	
	
	private final EnvironmentViewTypeElements pEnvironmentViewType;
	private final AbstractEnvironmentElementElements pAbstractEnvironmentElement;
	private final EStringElements pEString;
	private final ContainerElements pContainer;
	private final LinkElements pLink;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EnvironmentViewTypeGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEnvironmentViewType = new EnvironmentViewTypeElements();
		this.pAbstractEnvironmentElement = new AbstractEnvironmentElementElements();
		this.pEString = new EStringElements();
		this.pContainer = new ContainerElements();
		this.pLink = new LinkElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.mdsd.simplepalladio.EnvironmentViewType".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//EnvironmentViewType DeploymentViewPoint::EnvironmentViewType:
	//	'EnvironmentViewType'
	//	'{'
	//	'environmentElements' '{' environmentElements+=AbstractEnvironmentElement (","
	//	environmentElements+=AbstractEnvironmentElement)* '}'
	//	'}';
	public EnvironmentViewTypeElements getEnvironmentViewTypeAccess() {
		return pEnvironmentViewType;
	}
	
	public ParserRule getEnvironmentViewTypeRule() {
		return getEnvironmentViewTypeAccess().getRule();
	}
	
	//AbstractEnvironmentElement DeploymentViewPoint::AbstractEnvironmentElement:
	//	Container | Link;
	public AbstractEnvironmentElementElements getAbstractEnvironmentElementAccess() {
		return pAbstractEnvironmentElement;
	}
	
	public ParserRule getAbstractEnvironmentElementRule() {
		return getAbstractEnvironmentElementAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Container DeploymentViewPoint::Container:
	//	{DeploymentViewPoint::Container}
	//	'Container'
	//	name=EString;
	public ContainerElements getContainerAccess() {
		return pContainer;
	}
	
	public ParserRule getContainerRule() {
		return getContainerAccess().getRule();
	}
	
	//Link DeploymentViewPoint::Link:
	//	'Link'
	//	name=EString
	//	'{'
	//	'containers' '(' containers+=[DeploymentViewPoint::Container|EString] (","
	//	containers+=[DeploymentViewPoint::Container|EString])+ ')'
	//	'}';
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
