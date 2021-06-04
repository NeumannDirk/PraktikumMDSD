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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRepositoryViewTypeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RepositoryViewType'", "'{'", "'repositoryElements'", "','", "'}'", "'Interface'", "'signatures'", "'('", "')'", "'CompositeComponent'", "'requiredInterfaces'", "'providedInterfaces'", "'system'", "'Signature'", "'returnValue'", "'parameters'", "'Component'", "'services'", "'Parameter'", "'type'", "'Service'", "'signature'", "'behaviourDescription'", "'BehaviourDescription'", "'behaviorElements'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'VOID'", "'BOOLEAN'", "'CHAR'", "'DATE'", "'DOUBLE'", "'FLOAT'", "'LIST'", "'INT'", "'LONG'", "'MAP'", "'STRING'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRepositoryViewTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRepositoryViewTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRepositoryViewTypeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRepositoryViewType.g"; }



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




    // $ANTLR start "entryRuleRepositoryViewType"
    // InternalRepositoryViewType.g:65:1: entryRuleRepositoryViewType returns [EObject current=null] : iv_ruleRepositoryViewType= ruleRepositoryViewType EOF ;
    public final EObject entryRuleRepositoryViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryViewType = null;


        try {
            // InternalRepositoryViewType.g:65:59: (iv_ruleRepositoryViewType= ruleRepositoryViewType EOF )
            // InternalRepositoryViewType.g:66:2: iv_ruleRepositoryViewType= ruleRepositoryViewType EOF
            {
             newCompositeNode(grammarAccess.getRepositoryViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryViewType=ruleRepositoryViewType();

            state._fsp--;

             current =iv_ruleRepositoryViewType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepositoryViewType"


    // $ANTLR start "ruleRepositoryViewType"
    // InternalRepositoryViewType.g:72:1: ruleRepositoryViewType returns [EObject current=null] : (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRepositoryViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_repositoryElements_4_0 = null;

        EObject lv_repositoryElements_6_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:78:2: ( (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRepositoryViewType.g:79:2: (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRepositoryViewType.g:79:2: (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRepositoryViewType.g:80:3: otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryViewTypeAccess().getRepositoryViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRepositoryViewType.g:96:3: ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) )
            // InternalRepositoryViewType.g:97:4: (lv_repositoryElements_4_0= ruleAbstractRepositoryElement )
            {
            // InternalRepositoryViewType.g:97:4: (lv_repositoryElements_4_0= ruleAbstractRepositoryElement )
            // InternalRepositoryViewType.g:98:5: lv_repositoryElements_4_0= ruleAbstractRepositoryElement
            {

            					newCompositeNode(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_repositoryElements_4_0=ruleAbstractRepositoryElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryViewTypeRule());
            					}
            					add(
            						current,
            						"repositoryElements",
            						lv_repositoryElements_4_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.AbstractRepositoryElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepositoryViewType.g:115:3: (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRepositoryViewType.g:116:4: otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRepositoryViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRepositoryViewType.g:120:4: ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) )
            	    // InternalRepositoryViewType.g:121:5: (lv_repositoryElements_6_0= ruleAbstractRepositoryElement )
            	    {
            	    // InternalRepositoryViewType.g:121:5: (lv_repositoryElements_6_0= ruleAbstractRepositoryElement )
            	    // InternalRepositoryViewType.g:122:6: lv_repositoryElements_6_0= ruleAbstractRepositoryElement
            	    {

            	    						newCompositeNode(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_repositoryElements_6_0=ruleAbstractRepositoryElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRepositoryViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"repositoryElements",
            	    							lv_repositoryElements_6_0,
            	    							"org.xtext.mdsd.simplepalladio.RepositoryViewType.AbstractRepositoryElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepositoryViewType"


    // $ANTLR start "entryRuleAbstractRepositoryElement"
    // InternalRepositoryViewType.g:152:1: entryRuleAbstractRepositoryElement returns [EObject current=null] : iv_ruleAbstractRepositoryElement= ruleAbstractRepositoryElement EOF ;
    public final EObject entryRuleAbstractRepositoryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRepositoryElement = null;


        try {
            // InternalRepositoryViewType.g:152:66: (iv_ruleAbstractRepositoryElement= ruleAbstractRepositoryElement EOF )
            // InternalRepositoryViewType.g:153:2: iv_ruleAbstractRepositoryElement= ruleAbstractRepositoryElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractRepositoryElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRepositoryElement=ruleAbstractRepositoryElement();

            state._fsp--;

             current =iv_ruleAbstractRepositoryElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractRepositoryElement"


    // $ANTLR start "ruleAbstractRepositoryElement"
    // InternalRepositoryViewType.g:159:1: ruleAbstractRepositoryElement returns [EObject current=null] : (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent ) ;
    public final EObject ruleAbstractRepositoryElement() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_CompositeComponent_1 = null;

        EObject this_Signature_2 = null;

        EObject this_Component_3 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:165:2: ( (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent ) )
            // InternalRepositoryViewType.g:166:2: (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent )
            {
            // InternalRepositoryViewType.g:166:2: (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRepositoryViewType.g:167:3: this_Interface_0= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getInterfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_0=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRepositoryViewType.g:176:3: this_CompositeComponent_1= ruleCompositeComponent
                    {

                    			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getCompositeComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeComponent_1=ruleCompositeComponent();

                    state._fsp--;


                    			current = this_CompositeComponent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRepositoryViewType.g:185:3: this_Signature_2= ruleSignature
                    {

                    			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getSignatureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Signature_2=ruleSignature();

                    state._fsp--;


                    			current = this_Signature_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRepositoryViewType.g:194:3: this_Component_3= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getAbstractRepositoryElementAccess().getComponentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_3=ruleComponent();

                    state._fsp--;


                    			current = this_Component_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractRepositoryElement"


    // $ANTLR start "entryRuleBehaviorElement"
    // InternalRepositoryViewType.g:206:1: entryRuleBehaviorElement returns [EObject current=null] : iv_ruleBehaviorElement= ruleBehaviorElement EOF ;
    public final EObject entryRuleBehaviorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorElement = null;


        try {
            // InternalRepositoryViewType.g:206:56: (iv_ruleBehaviorElement= ruleBehaviorElement EOF )
            // InternalRepositoryViewType.g:207:2: iv_ruleBehaviorElement= ruleBehaviorElement EOF
            {
             newCompositeNode(grammarAccess.getBehaviorElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorElement=ruleBehaviorElement();

            state._fsp--;

             current =iv_ruleBehaviorElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorElement"


    // $ANTLR start "ruleBehaviorElement"
    // InternalRepositoryViewType.g:213:1: ruleBehaviorElement returns [EObject current=null] : (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch ) ;
    public final EObject ruleBehaviorElement() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAction_0 = null;

        EObject this_ExternalCall_1 = null;

        EObject this_Loop_2 = null;

        EObject this_Branch_3 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:219:2: ( (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch ) )
            // InternalRepositoryViewType.g:220:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch )
            {
            // InternalRepositoryViewType.g:220:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRepositoryViewType.g:221:3: this_InternalAction_0= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getBehaviorElementAccess().getInternalActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_0=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRepositoryViewType.g:230:3: this_ExternalCall_1= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getBehaviorElementAccess().getExternalCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_1=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRepositoryViewType.g:239:3: this_Loop_2= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getBehaviorElementAccess().getLoopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_2=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRepositoryViewType.g:248:3: this_Branch_3= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getBehaviorElementAccess().getBranchParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Branch_3=ruleBranch();

                    state._fsp--;


                    			current = this_Branch_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorElement"


    // $ANTLR start "entryRuleEString"
    // InternalRepositoryViewType.g:260:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRepositoryViewType.g:260:47: (iv_ruleEString= ruleEString EOF )
            // InternalRepositoryViewType.g:261:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRepositoryViewType.g:267:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRepositoryViewType.g:273:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRepositoryViewType.g:274:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRepositoryViewType.g:274:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRepositoryViewType.g:275:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRepositoryViewType.g:283:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInterface"
    // InternalRepositoryViewType.g:294:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalRepositoryViewType.g:294:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalRepositoryViewType.g:295:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalRepositoryViewType.g:301:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:307:2: ( (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalRepositoryViewType.g:308:2: (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalRepositoryViewType.g:308:2: (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalRepositoryViewType.g:309:3: otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalRepositoryViewType.g:313:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepositoryViewType.g:314:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepositoryViewType.g:314:4: (lv_name_1_0= ruleEString )
            // InternalRepositoryViewType.g:315:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getSignaturesKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRepositoryViewType.g:344:3: ( ( ruleEString ) )
            // InternalRepositoryViewType.g:345:4: ( ruleEString )
            {
            // InternalRepositoryViewType.g:345:4: ( ruleEString )
            // InternalRepositoryViewType.g:346:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepositoryViewType.g:360:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRepositoryViewType.g:361:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRepositoryViewType.g:365:4: ( ( ruleEString ) )
            	    // InternalRepositoryViewType.g:366:5: ( ruleEString )
            	    {
            	    // InternalRepositoryViewType.g:366:5: ( ruleEString )
            	    // InternalRepositoryViewType.g:367:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInterfaceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalRepositoryViewType.g:394:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalRepositoryViewType.g:394:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalRepositoryViewType.g:395:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalRepositoryViewType.g:401:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleEString ) ) otherlv_17= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:407:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleEString ) ) otherlv_17= '}' ) )
            // InternalRepositoryViewType.g:408:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleEString ) ) otherlv_17= '}' )
            {
            // InternalRepositoryViewType.g:408:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleEString ) ) otherlv_17= '}' )
            // InternalRepositoryViewType.g:409:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleEString ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalRepositoryViewType.g:413:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepositoryViewType.g:414:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepositoryViewType.g:414:4: (lv_name_1_0= ruleEString )
            // InternalRepositoryViewType.g:415:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepositoryViewType.g:436:3: (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRepositoryViewType.g:437:4: otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getRequiredInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalRepositoryViewType.g:445:4: ( ( ruleEString ) )
                    // InternalRepositoryViewType.g:446:5: ( ruleEString )
                    {
                    // InternalRepositoryViewType.g:446:5: ( ruleEString )
                    // InternalRepositoryViewType.g:447:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepositoryViewType.g:461:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRepositoryViewType.g:462:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepositoryViewType.g:466:5: ( ( ruleEString ) )
                    	    // InternalRepositoryViewType.g:467:6: ( ruleEString )
                    	    {
                    	    // InternalRepositoryViewType.g:467:6: ( ruleEString )
                    	    // InternalRepositoryViewType.g:468:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getProvidedInterfacesKeyword_4());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRepositoryViewType.g:496:3: ( ( ruleEString ) )
            // InternalRepositoryViewType.g:497:4: ( ruleEString )
            {
            // InternalRepositoryViewType.g:497:4: ( ruleEString )
            // InternalRepositoryViewType.g:498:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepositoryViewType.g:512:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRepositoryViewType.g:513:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRepositoryViewType.g:517:4: ( ( ruleEString ) )
            	    // InternalRepositoryViewType.g:518:5: ( ruleEString )
            	    {
            	    // InternalRepositoryViewType.g:518:5: ( ruleEString )
            	    // InternalRepositoryViewType.g:519:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositeComponentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8());
            		
            otherlv_15=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getSystemKeyword_9());
            		
            // InternalRepositoryViewType.g:542:3: ( ( ruleEString ) )
            // InternalRepositoryViewType.g:543:4: ( ruleEString )
            {
            // InternalRepositoryViewType.g:543:4: ( ruleEString )
            // InternalRepositoryViewType.g:544:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getSystemSystemCrossReference_10_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleSignature"
    // InternalRepositoryViewType.g:566:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalRepositoryViewType.g:566:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalRepositoryViewType.g:567:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalRepositoryViewType.g:573:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_returnValue_4_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:579:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalRepositoryViewType.g:580:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalRepositoryViewType.g:580:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalRepositoryViewType.g:581:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalRepositoryViewType.g:585:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepositoryViewType.g:586:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepositoryViewType.g:586:4: (lv_name_1_0= ruleEString )
            // InternalRepositoryViewType.g:587:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnValueKeyword_3());
            		
            // InternalRepositoryViewType.g:612:3: ( (lv_returnValue_4_0= ruleType ) )
            // InternalRepositoryViewType.g:613:4: (lv_returnValue_4_0= ruleType )
            {
            // InternalRepositoryViewType.g:613:4: (lv_returnValue_4_0= ruleType )
            // InternalRepositoryViewType.g:614:5: lv_returnValue_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnValueTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_returnValue_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"returnValue",
            						lv_returnValue_4_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepositoryViewType.g:631:3: (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRepositoryViewType.g:632:4: otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRepositoryViewType.g:640:4: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalRepositoryViewType.g:641:5: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalRepositoryViewType.g:641:5: (lv_parameters_7_0= ruleParameter )
                    // InternalRepositoryViewType.g:642:6: lv_parameters_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_7_0,
                    							"org.xtext.mdsd.simplepalladio.RepositoryViewType.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepositoryViewType.g:659:4: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRepositoryViewType.g:660:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRepositoryViewType.g:664:5: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalRepositoryViewType.g:665:6: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalRepositoryViewType.g:665:6: (lv_parameters_9_0= ruleParameter )
                    	    // InternalRepositoryViewType.g:666:7: lv_parameters_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_9_0,
                    	    								"org.xtext.mdsd.simplepalladio.RepositoryViewType.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleComponent"
    // InternalRepositoryViewType.g:697:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRepositoryViewType.g:697:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalRepositoryViewType.g:698:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalRepositoryViewType.g:704:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_services_17_0 = null;

        EObject lv_services_19_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:710:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' ) )
            // InternalRepositoryViewType.g:711:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' )
            {
            // InternalRepositoryViewType.g:711:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' )
            // InternalRepositoryViewType.g:712:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalRepositoryViewType.g:716:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepositoryViewType.g:717:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepositoryViewType.g:717:4: (lv_name_1_0= ruleEString )
            // InternalRepositoryViewType.g:718:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepositoryViewType.g:739:3: (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRepositoryViewType.g:740:4: otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getRequiredInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalRepositoryViewType.g:748:4: ( ( ruleEString ) )
                    // InternalRepositoryViewType.g:749:5: ( ruleEString )
                    {
                    // InternalRepositoryViewType.g:749:5: ( ruleEString )
                    // InternalRepositoryViewType.g:750:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepositoryViewType.g:764:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRepositoryViewType.g:765:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepositoryViewType.g:769:5: ( ( ruleEString ) )
                    	    // InternalRepositoryViewType.g:770:6: ( ruleEString )
                    	    {
                    	    // InternalRepositoryViewType.g:770:6: ( ruleEString )
                    	    // InternalRepositoryViewType.g:771:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getProvidedInterfacesKeyword_4());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRepositoryViewType.g:799:3: ( ( ruleEString ) )
            // InternalRepositoryViewType.g:800:4: ( ruleEString )
            {
            // InternalRepositoryViewType.g:800:4: ( ruleEString )
            // InternalRepositoryViewType.g:801:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepositoryViewType.g:815:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRepositoryViewType.g:816:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRepositoryViewType.g:820:4: ( ( ruleEString ) )
            	    // InternalRepositoryViewType.g:821:5: ( ruleEString )
            	    {
            	    // InternalRepositoryViewType.g:821:5: ( ruleEString )
            	    // InternalRepositoryViewType.g:822:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getRightParenthesisKeyword_8());
            		
            otherlv_15=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getServicesKeyword_9());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalRepositoryViewType.g:849:3: ( (lv_services_17_0= ruleService ) )
            // InternalRepositoryViewType.g:850:4: (lv_services_17_0= ruleService )
            {
            // InternalRepositoryViewType.g:850:4: (lv_services_17_0= ruleService )
            // InternalRepositoryViewType.g:851:5: lv_services_17_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_6);
            lv_services_17_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"services",
            						lv_services_17_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepositoryViewType.g:868:3: (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRepositoryViewType.g:869:4: otherlv_18= ',' ( (lv_services_19_0= ruleService ) )
            	    {
            	    otherlv_18=(Token)match(input,14,FOLLOW_20); 

            	    				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRepositoryViewType.g:873:4: ( (lv_services_19_0= ruleService ) )
            	    // InternalRepositoryViewType.g:874:5: (lv_services_19_0= ruleService )
            	    {
            	    // InternalRepositoryViewType.g:874:5: (lv_services_19_0= ruleService )
            	    // InternalRepositoryViewType.g:875:6: lv_services_19_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_services_19_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"services",
            	    							lv_services_19_0,
            	    							"org.xtext.mdsd.simplepalladio.RepositoryViewType.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_20=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_20, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleParameter"
    // InternalRepositoryViewType.g:905:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRepositoryViewType.g:905:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRepositoryViewType.g:906:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRepositoryViewType.g:912:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:918:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) )
            // InternalRepositoryViewType.g:919:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            {
            // InternalRepositoryViewType.g:919:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            // InternalRepositoryViewType.g:920:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalRepositoryViewType.g:924:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepositoryViewType.g:925:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepositoryViewType.g:925:4: (lv_name_1_0= ruleEString )
            // InternalRepositoryViewType.g:926:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalRepositoryViewType.g:951:3: ( (lv_type_4_0= ruleType ) )
            // InternalRepositoryViewType.g:952:4: (lv_type_4_0= ruleType )
            {
            // InternalRepositoryViewType.g:952:4: (lv_type_4_0= ruleType )
            // InternalRepositoryViewType.g:953:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleService"
    // InternalRepositoryViewType.g:978:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalRepositoryViewType.g:978:48: (iv_ruleService= ruleService EOF )
            // InternalRepositoryViewType.g:979:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalRepositoryViewType.g:985:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_behaviourDescription_5_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:991:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' ) )
            // InternalRepositoryViewType.g:992:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' )
            {
            // InternalRepositoryViewType.g:992:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' )
            // InternalRepositoryViewType.g:993:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getSignatureKeyword_2());
            		
            // InternalRepositoryViewType.g:1005:3: ( ( ruleEString ) )
            // InternalRepositoryViewType.g:1006:4: ( ruleEString )
            {
            // InternalRepositoryViewType.g:1006:4: ( ruleEString )
            // InternalRepositoryViewType.g:1007:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getSignatureSignatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getBehaviourDescriptionKeyword_4());
            		
            // InternalRepositoryViewType.g:1025:3: ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) )
            // InternalRepositoryViewType.g:1026:4: (lv_behaviourDescription_5_0= ruleBehaviourDescription )
            {
            // InternalRepositoryViewType.g:1026:4: (lv_behaviourDescription_5_0= ruleBehaviourDescription )
            // InternalRepositoryViewType.g:1027:5: lv_behaviourDescription_5_0= ruleBehaviourDescription
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getBehaviourDescriptionBehaviourDescriptionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_behaviourDescription_5_0=ruleBehaviourDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"behaviourDescription",
            						lv_behaviourDescription_5_0,
            						"org.xtext.mdsd.simplepalladio.RepositoryViewType.BehaviourDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalRepositoryViewType.g:1052:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalRepositoryViewType.g:1052:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalRepositoryViewType.g:1053:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
            {
             newCompositeNode(grammarAccess.getBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourDescription=ruleBehaviourDescription();

            state._fsp--;

             current =iv_ruleBehaviourDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviourDescription"


    // $ANTLR start "ruleBehaviourDescription"
    // InternalRepositoryViewType.g:1059:1: ruleBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_behaviorElements_5_0 = null;

        EObject lv_behaviorElements_7_0 = null;



        	enterRule();

        try {
            // InternalRepositoryViewType.g:1065:2: ( ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRepositoryViewType.g:1066:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRepositoryViewType.g:1066:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRepositoryViewType.g:1067:3: () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRepositoryViewType.g:1067:3: ()
            // InternalRepositoryViewType.g:1068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepositoryViewType.g:1082:3: (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRepositoryViewType.g:1083:4: otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRepositoryViewType.g:1091:4: ( (lv_behaviorElements_5_0= ruleBehaviorElement ) )
                    // InternalRepositoryViewType.g:1092:5: (lv_behaviorElements_5_0= ruleBehaviorElement )
                    {
                    // InternalRepositoryViewType.g:1092:5: (lv_behaviorElements_5_0= ruleBehaviorElement )
                    // InternalRepositoryViewType.g:1093:6: lv_behaviorElements_5_0= ruleBehaviorElement
                    {

                    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_behaviorElements_5_0=ruleBehaviorElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"behaviorElements",
                    							lv_behaviorElements_5_0,
                    							"org.xtext.mdsd.simplepalladio.RepositoryViewType.BehaviorElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepositoryViewType.g:1110:4: (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRepositoryViewType.g:1111:5: otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepositoryViewType.g:1115:5: ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
                    	    // InternalRepositoryViewType.g:1116:6: (lv_behaviorElements_7_0= ruleBehaviorElement )
                    	    {
                    	    // InternalRepositoryViewType.g:1116:6: (lv_behaviorElements_7_0= ruleBehaviorElement )
                    	    // InternalRepositoryViewType.g:1117:7: lv_behaviorElements_7_0= ruleBehaviorElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_behaviorElements_7_0=ruleBehaviorElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviorElements",
                    	    								lv_behaviorElements_7_0,
                    	    								"org.xtext.mdsd.simplepalladio.RepositoryViewType.BehaviorElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleInternalAction"
    // InternalRepositoryViewType.g:1148:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalRepositoryViewType.g:1148:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalRepositoryViewType.g:1149:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalRepositoryViewType.g:1155:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepositoryViewType.g:1161:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalRepositoryViewType.g:1162:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalRepositoryViewType.g:1162:2: ( () otherlv_1= 'InternalAction' )
            // InternalRepositoryViewType.g:1163:3: () otherlv_1= 'InternalAction'
            {
            // InternalRepositoryViewType.g:1163:3: ()
            // InternalRepositoryViewType.g:1164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalRepositoryViewType.g:1178:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalRepositoryViewType.g:1178:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalRepositoryViewType.g:1179:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalRepositoryViewType.g:1185:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRepositoryViewType.g:1191:2: ( (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRepositoryViewType.g:1192:2: (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRepositoryViewType.g:1192:2: (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRepositoryViewType.g:1193:3: otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getExternalCallKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getSignatureKeyword_2());
            		
            // InternalRepositoryViewType.g:1205:3: ( ( ruleEString ) )
            // InternalRepositoryViewType.g:1206:4: ( ruleEString )
            {
            // InternalRepositoryViewType.g:1206:4: ( ruleEString )
            // InternalRepositoryViewType.g:1207:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternalCallAccess().getSignatureSignatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalCallAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalRepositoryViewType.g:1229:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalRepositoryViewType.g:1229:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalRepositoryViewType.g:1230:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalRepositoryViewType.g:1236:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRepositoryViewType.g:1242:2: ( ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // InternalRepositoryViewType.g:1243:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // InternalRepositoryViewType.g:1243:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // InternalRepositoryViewType.g:1244:3: () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // InternalRepositoryViewType.g:1244:3: ()
            // InternalRepositoryViewType.g:1245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepositoryViewType.g:1259:3: (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRepositoryViewType.g:1260:4: otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getBehaviorElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalRepositoryViewType.g:1268:4: ( ( ruleEString ) )
                    // InternalRepositoryViewType.g:1269:5: ( ruleEString )
                    {
                    // InternalRepositoryViewType.g:1269:5: ( ruleEString )
                    // InternalRepositoryViewType.g:1270:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepositoryViewType.g:1284:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRepositoryViewType.g:1285:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepositoryViewType.g:1289:5: ( ( ruleEString ) )
                    	    // InternalRepositoryViewType.g:1290:6: ( ruleEString )
                    	    {
                    	    // InternalRepositoryViewType.g:1290:6: ( ruleEString )
                    	    // InternalRepositoryViewType.g:1291:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoopRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalRepositoryViewType.g:1319:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalRepositoryViewType.g:1319:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalRepositoryViewType.g:1320:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalRepositoryViewType.g:1326:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRepositoryViewType.g:1332:2: ( ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // InternalRepositoryViewType.g:1333:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // InternalRepositoryViewType.g:1333:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // InternalRepositoryViewType.g:1334:3: () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // InternalRepositoryViewType.g:1334:3: ()
            // InternalRepositoryViewType.g:1335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepositoryViewType.g:1349:3: (otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRepositoryViewType.g:1350:4: otherlv_3= 'behaviorElements' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getBehaviorElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalRepositoryViewType.g:1358:4: ( ( ruleEString ) )
                    // InternalRepositoryViewType.g:1359:5: ( ruleEString )
                    {
                    // InternalRepositoryViewType.g:1359:5: ( ruleEString )
                    // InternalRepositoryViewType.g:1360:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepositoryViewType.g:1374:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRepositoryViewType.g:1375:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepositoryViewType.g:1379:5: ( ( ruleEString ) )
                    	    // InternalRepositoryViewType.g:1380:6: ( ruleEString )
                    	    {
                    	    // InternalRepositoryViewType.g:1380:6: ( ruleEString )
                    	    // InternalRepositoryViewType.g:1381:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBranchRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "ruleType"
    // InternalRepositoryViewType.g:1409:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalRepositoryViewType.g:1415:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) ) )
            // InternalRepositoryViewType.g:1416:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) )
            {
            // InternalRepositoryViewType.g:1416:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) )
            int alt21=11;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            case 43:
                {
                alt21=4;
                }
                break;
            case 44:
                {
                alt21=5;
                }
                break;
            case 45:
                {
                alt21=6;
                }
                break;
            case 46:
                {
                alt21=7;
                }
                break;
            case 47:
                {
                alt21=8;
                }
                break;
            case 48:
                {
                alt21=9;
                }
                break;
            case 49:
                {
                alt21=10;
                }
                break;
            case 50:
                {
                alt21=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalRepositoryViewType.g:1417:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalRepositoryViewType.g:1417:3: (enumLiteral_0= 'VOID' )
                    // InternalRepositoryViewType.g:1418:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRepositoryViewType.g:1425:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalRepositoryViewType.g:1425:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalRepositoryViewType.g:1426:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRepositoryViewType.g:1433:3: (enumLiteral_2= 'CHAR' )
                    {
                    // InternalRepositoryViewType.g:1433:3: (enumLiteral_2= 'CHAR' )
                    // InternalRepositoryViewType.g:1434:4: enumLiteral_2= 'CHAR'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRepositoryViewType.g:1441:3: (enumLiteral_3= 'DATE' )
                    {
                    // InternalRepositoryViewType.g:1441:3: (enumLiteral_3= 'DATE' )
                    // InternalRepositoryViewType.g:1442:4: enumLiteral_3= 'DATE'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRepositoryViewType.g:1449:3: (enumLiteral_4= 'DOUBLE' )
                    {
                    // InternalRepositoryViewType.g:1449:3: (enumLiteral_4= 'DOUBLE' )
                    // InternalRepositoryViewType.g:1450:4: enumLiteral_4= 'DOUBLE'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRepositoryViewType.g:1457:3: (enumLiteral_5= 'FLOAT' )
                    {
                    // InternalRepositoryViewType.g:1457:3: (enumLiteral_5= 'FLOAT' )
                    // InternalRepositoryViewType.g:1458:4: enumLiteral_5= 'FLOAT'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRepositoryViewType.g:1465:3: (enumLiteral_6= 'LIST' )
                    {
                    // InternalRepositoryViewType.g:1465:3: (enumLiteral_6= 'LIST' )
                    // InternalRepositoryViewType.g:1466:4: enumLiteral_6= 'LIST'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRepositoryViewType.g:1473:3: (enumLiteral_7= 'INT' )
                    {
                    // InternalRepositoryViewType.g:1473:3: (enumLiteral_7= 'INT' )
                    // InternalRepositoryViewType.g:1474:4: enumLiteral_7= 'INT'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRepositoryViewType.g:1481:3: (enumLiteral_8= 'LONG' )
                    {
                    // InternalRepositoryViewType.g:1481:3: (enumLiteral_8= 'LONG' )
                    // InternalRepositoryViewType.g:1482:4: enumLiteral_8= 'LONG'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRepositoryViewType.g:1489:3: (enumLiteral_9= 'MAP' )
                    {
                    // InternalRepositoryViewType.g:1489:3: (enumLiteral_9= 'MAP' )
                    // InternalRepositoryViewType.g:1490:4: enumLiteral_9= 'MAP'
                    {
                    enumLiteral_9=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalRepositoryViewType.g:1497:3: (enumLiteral_10= 'STRING' )
                    {
                    // InternalRepositoryViewType.g:1497:3: (enumLiteral_10= 'STRING' )
                    // InternalRepositoryViewType.g:1498:4: enumLiteral_10= 'STRING'
                    {
                    enumLiteral_10=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000009110000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0007FF0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000F000000000L});

}