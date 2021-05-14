/*
 * generated by Xtext 2.24.0
 */
grammar InternalRepositoryViewType;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.mdsd.simplepalladio.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.mdsd.simplepalladio.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mdsd.simplepalladio.services.RepositoryViewTypeGrammarAccess;

}

@parser::members {

 	private RepositoryViewTypeGrammarAccess grammarAccess;

    public InternalRepositoryViewTypeParser(TokenStream input, RepositoryViewTypeGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RepositoryViewType";
   	}

   	@Override
   	protected RepositoryViewTypeGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRepositoryViewType
entryRuleRepositoryViewType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRepositoryViewTypeRule()); }
	iv_ruleRepositoryViewType=ruleRepositoryViewType
	{ $current=$iv_ruleRepositoryViewType.current; }
	EOF;

// Rule RepositoryViewType
ruleRepositoryViewType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RepositoryViewType'
		{
			newLeafNode(otherlv_0, grammarAccess.getRepositoryViewTypeAccess().getRepositoryViewTypeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='repositoryElements'
		{
			newLeafNode(otherlv_2, grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_4_0());
				}
				lv_repositoryElements_4_0=ruleAbstractRepositoryElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRepositoryViewTypeRule());
					}
					add(
						$current,
						"repositoryElements",
						lv_repositoryElements_4_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.AbstractRepositoryElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getRepositoryViewTypeAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_5_1_0());
					}
					lv_repositoryElements_6_0=ruleAbstractRepositoryElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRepositoryViewTypeRule());
						}
						add(
							$current,
							"repositoryElements",
							lv_repositoryElements_6_0,
							"org.xtext.mdsd.simplepalladio.RepositoryViewType.AbstractRepositoryElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleAbstractRepositoryElement
entryRuleAbstractRepositoryElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractRepositoryElementRule()); }
	iv_ruleAbstractRepositoryElement=ruleAbstractRepositoryElement
	{ $current=$iv_ruleAbstractRepositoryElement.current; }
	EOF;

// Rule AbstractRepositoryElement
ruleAbstractRepositoryElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getInterfaceParserRuleCall_0());
		}
		this_Interface_0=ruleInterface
		{
			$current = $this_Interface_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getCompositeComponentParserRuleCall_1());
		}
		this_CompositeComponent_1=ruleCompositeComponent
		{
			$current = $this_CompositeComponent_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getSignatureParserRuleCall_2());
		}
		this_Signature_2=ruleSignature
		{
			$current = $this_Signature_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getComponentParserRuleCall_3());
		}
		this_Component_3=ruleComponent
		{
			$current = $this_Component_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBehaviorElement
entryRuleBehaviorElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehaviorElementRule()); }
	iv_ruleBehaviorElement=ruleBehaviorElement
	{ $current=$iv_ruleBehaviorElement.current; }
	EOF;

// Rule BehaviorElement
ruleBehaviorElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBehaviorElementAccess().getInternalActionParserRuleCall_0());
		}
		this_InternalAction_0=ruleInternalAction
		{
			$current = $this_InternalAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBehaviorElementAccess().getExternalCallParserRuleCall_1());
		}
		this_ExternalCall_1=ruleExternalCall
		{
			$current = $this_ExternalCall_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBehaviorElementAccess().getLoopParserRuleCall_2());
		}
		this_Loop_2=ruleLoop
		{
			$current = $this_Loop_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBehaviorElementAccess().getBranchParserRuleCall_3());
		}
		this_Branch_3=ruleBranch
		{
			$current = $this_Branch_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleInterface
entryRuleInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInterfaceRule()); }
	iv_ruleInterface=ruleInterface
	{ $current=$iv_ruleInterface.current; }
	EOF;

// Rule Interface
ruleInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Interface'
		{
			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInterfaceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='signatures'
		{
			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getSignaturesKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInterfaceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInterfaceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_6_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleCompositeComponent
entryRuleCompositeComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeComponentRule()); }
	iv_ruleCompositeComponent=ruleCompositeComponent
	{ $current=$iv_ruleCompositeComponent.current; }
	EOF;

// Rule CompositeComponent
ruleCompositeComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CompositeComponent'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='requiredInterfaces'
			{
				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getRequiredInterfacesKeyword_3_0());
			}
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCompositeComponentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCompositeComponentRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		otherlv_9='providedInterfaces'
		{
			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getProvidedInterfacesKeyword_4());
		}
		otherlv_10='('
		{
			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositeComponentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12=','
			{
				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCompositeComponentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_14=')'
		{
			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8());
		}
		otherlv_15='system'
		{
			newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getSystemKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositeComponentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCompositeComponentAccess().getSystemSystemCrossReference_10_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleSignature
entryRuleSignature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSignatureRule()); }
	iv_ruleSignature=ruleSignature
	{ $current=$iv_ruleSignature.current; }
	EOF;

// Rule Signature
ruleSignature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Signature'
		{
			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSignatureRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='returnValue'
		{
			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnValueKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSignatureAccess().getReturnValueTypeEnumRuleCall_4_0());
				}
				lv_returnValue_4_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSignatureRule());
					}
					set(
						$current,
						"returnValue",
						lv_returnValue_4_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='parameters'
			{
				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
					}
					lv_parameters_7_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSignatureRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_7_0,
							"org.xtext.mdsd.simplepalladio.RepositoryViewType.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
						}
						lv_parameters_9_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSignatureRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_9_0,
								"org.xtext.mdsd.simplepalladio.RepositoryViewType.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Component'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='requiredInterfaces'
			{
				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getRequiredInterfacesKeyword_3_0());
			}
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComponentRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		otherlv_9='providedInterfaces'
		{
			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getProvidedInterfacesKeyword_4());
		}
		otherlv_10='('
		{
			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12=','
			{
				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_14=')'
		{
			newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getRightParenthesisKeyword_8());
		}
		otherlv_15='services'
		{
			newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getServicesKeyword_9());
		}
		otherlv_16='{'
		{
			newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_11_0());
				}
				lv_services_17_0=ruleService
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"services",
						lv_services_17_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.Service");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_18=','
			{
				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getCommaKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_12_1_0());
					}
					lv_services_19_0=ruleService
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentRule());
						}
						add(
							$current,
							"services",
							lv_services_19_0,
							"org.xtext.mdsd.simplepalladio.RepositoryViewType.Service");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Parameter'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='type'
		{
			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleService
entryRuleService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceRule()); }
	iv_ruleService=ruleService
	{ $current=$iv_ruleService.current; }
	EOF;

// Rule Service
ruleService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Service'
		{
			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='signature'
		{
			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getSignatureKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getServiceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getServiceAccess().getSignatureSignatureCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='behaviourDescription'
		{
			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getBehaviourDescriptionKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceAccess().getBehaviourDescriptionBehaviourDescriptionParserRuleCall_5_0());
				}
				lv_behaviourDescription_5_0=ruleBehaviourDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceRule());
					}
					set(
						$current,
						"behaviourDescription",
						lv_behaviourDescription_5_0,
						"org.xtext.mdsd.simplepalladio.RepositoryViewType.BehaviourDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleBehaviourDescription
entryRuleBehaviourDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehaviourDescriptionRule()); }
	iv_ruleBehaviourDescription=ruleBehaviourDescription
	{ $current=$iv_ruleBehaviourDescription.current; }
	EOF;

// Rule BehaviourDescription
ruleBehaviourDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0(),
					$current);
			}
		)
		otherlv_1='BehaviourDescription'
		{
			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='behaviorElements'
			{
				newLeafNode(otherlv_3, grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0());
					}
					lv_behaviorElements_5_0=ruleBehaviorElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
						}
						add(
							$current,
							"behaviorElements",
							lv_behaviorElements_5_0,
							"org.xtext.mdsd.simplepalladio.RepositoryViewType.BehaviorElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0());
						}
						lv_behaviorElements_7_0=ruleBehaviorElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
							}
							add(
								$current,
								"behaviorElements",
								lv_behaviorElements_7_0,
								"org.xtext.mdsd.simplepalladio.RepositoryViewType.BehaviorElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleInternalAction
entryRuleInternalAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInternalActionRule()); }
	iv_ruleInternalAction=ruleInternalAction
	{ $current=$iv_ruleInternalAction.current; }
	EOF;

// Rule InternalAction
ruleInternalAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
					$current);
			}
		)
		otherlv_1='InternalAction'
		{
			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
		}
	)
;

// Entry rule entryRuleExternalCall
entryRuleExternalCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalCallRule()); }
	iv_ruleExternalCall=ruleExternalCall
	{ $current=$iv_ruleExternalCall.current; }
	EOF;

// Rule ExternalCall
ruleExternalCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExternalCall'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getExternalCallKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='signature'
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getSignatureKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalCallRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getExternalCallAccess().getSignatureSignatureCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getExternalCallAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLoop
entryRuleLoop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopRule()); }
	iv_ruleLoop=ruleLoop
	{ $current=$iv_ruleLoop.current; }
	EOF;

// Rule Loop
ruleLoop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLoopAccess().getLoopAction_0(),
					$current);
			}
		)
		otherlv_1='Loop'
		{
			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='behaviorElements'
			{
				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getBehaviorElementsKeyword_3_0());
			}
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLoopRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementCrossReference_3_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLoopRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementCrossReference_3_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleBranch
entryRuleBranch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBranchRule()); }
	iv_ruleBranch=ruleBranch
	{ $current=$iv_ruleBranch.current; }
	EOF;

// Rule Branch
ruleBranch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBranchAccess().getBranchAction_0(),
					$current);
			}
		)
		otherlv_1='Branch'
		{
			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='behaviorElements'
			{
				newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getBehaviorElementsKeyword_3_0());
			}
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBranchRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementCrossReference_3_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBranchRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementCrossReference_3_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='VOID'
			{
				$current = grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BOOLEAN'
			{
				$current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CHAR'
			{
				$current = grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='DATE'
			{
				$current = grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='DOUBLE'
			{
				$current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='FLOAT'
			{
				$current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='LIST'
			{
				$current = grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='INT'
			{
				$current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='LONG'
			{
				$current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='MAP'
			{
				$current = grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='STRING'
			{
				$current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_10());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
