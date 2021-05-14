package org.xtext.mdsd.simplepalladio.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mdsd.simplepalladio.services.AssemblyViewTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssemblyViewTypeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AssemblyViewType'", "'{'", "'systems'", "','", "'}'", "'System'", "'requiredInterfaces'", "'('", "')'", "'providedInterfaces'", "'systemElements'", "'AssemblyContext'", "'component'", "'providedRoles'", "'requiredRoles'", "'Role'", "'interface'", "'DelegationConnector'", "'role'", "'AssemblyConnector'", "'providedRole'", "'requiredRole'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalAssemblyViewTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAssemblyViewTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAssemblyViewTypeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAssemblyViewType.g"; }



     	private AssemblyViewTypeGrammarAccess grammarAccess;

        public InternalAssemblyViewTypeParser(TokenStream input, AssemblyViewTypeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AssemblyViewType";
       	}

       	@Override
       	protected AssemblyViewTypeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAssemblyViewType"
    // InternalAssemblyViewType.g:64:1: entryRuleAssemblyViewType returns [EObject current=null] : iv_ruleAssemblyViewType= ruleAssemblyViewType EOF ;
    public final EObject entryRuleAssemblyViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyViewType = null;


        try {
            // InternalAssemblyViewType.g:64:57: (iv_ruleAssemblyViewType= ruleAssemblyViewType EOF )
            // InternalAssemblyViewType.g:65:2: iv_ruleAssemblyViewType= ruleAssemblyViewType EOF
            {
             newCompositeNode(grammarAccess.getAssemblyViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyViewType=ruleAssemblyViewType();

            state._fsp--;

             current =iv_ruleAssemblyViewType; 
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
    // $ANTLR end "entryRuleAssemblyViewType"


    // $ANTLR start "ruleAssemblyViewType"
    // InternalAssemblyViewType.g:71:1: ruleAssemblyViewType returns [EObject current=null] : (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAssemblyViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_systems_4_0 = null;

        EObject lv_systems_6_0 = null;



        	enterRule();

        try {
            // InternalAssemblyViewType.g:77:2: ( (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalAssemblyViewType.g:78:2: (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalAssemblyViewType.g:78:2: (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalAssemblyViewType.g:79:3: otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyViewTypeAccess().getAssemblyViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyViewTypeAccess().getSystemsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAssemblyViewType.g:95:3: ( (lv_systems_4_0= ruleSystem ) )
            // InternalAssemblyViewType.g:96:4: (lv_systems_4_0= ruleSystem )
            {
            // InternalAssemblyViewType.g:96:4: (lv_systems_4_0= ruleSystem )
            // InternalAssemblyViewType.g:97:5: lv_systems_4_0= ruleSystem
            {

            					newCompositeNode(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_systems_4_0=ruleSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyViewTypeRule());
            					}
            					add(
            						current,
            						"systems",
            						lv_systems_4_0,
            						"org.xtext.mdsd.simplepalladio.AssemblyViewType.System");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssemblyViewType.g:114:3: (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAssemblyViewType.g:115:4: otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAssemblyViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalAssemblyViewType.g:119:4: ( (lv_systems_6_0= ruleSystem ) )
            	    // InternalAssemblyViewType.g:120:5: (lv_systems_6_0= ruleSystem )
            	    {
            	    // InternalAssemblyViewType.g:120:5: (lv_systems_6_0= ruleSystem )
            	    // InternalAssemblyViewType.g:121:6: lv_systems_6_0= ruleSystem
            	    {

            	    						newCompositeNode(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_systems_6_0=ruleSystem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssemblyViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"systems",
            	    							lv_systems_6_0,
            	    							"org.xtext.mdsd.simplepalladio.AssemblyViewType.System");
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

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAssemblyViewType"


    // $ANTLR start "entryRuleAbstractSystemElement"
    // InternalAssemblyViewType.g:151:1: entryRuleAbstractSystemElement returns [EObject current=null] : iv_ruleAbstractSystemElement= ruleAbstractSystemElement EOF ;
    public final EObject entryRuleAbstractSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSystemElement = null;


        try {
            // InternalAssemblyViewType.g:151:62: (iv_ruleAbstractSystemElement= ruleAbstractSystemElement EOF )
            // InternalAssemblyViewType.g:152:2: iv_ruleAbstractSystemElement= ruleAbstractSystemElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractSystemElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSystemElement=ruleAbstractSystemElement();

            state._fsp--;

             current =iv_ruleAbstractSystemElement; 
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
    // $ANTLR end "entryRuleAbstractSystemElement"


    // $ANTLR start "ruleAbstractSystemElement"
    // InternalAssemblyViewType.g:158:1: ruleAbstractSystemElement returns [EObject current=null] : (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector ) ;
    public final EObject ruleAbstractSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_AssemblyContext_0 = null;

        EObject this_Role_1 = null;

        EObject this_DelegationConnector_2 = null;

        EObject this_AssemblyConnector_3 = null;



        	enterRule();

        try {
            // InternalAssemblyViewType.g:164:2: ( (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector ) )
            // InternalAssemblyViewType.g:165:2: (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector )
            {
            // InternalAssemblyViewType.g:165:2: (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 30:
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
                    // InternalAssemblyViewType.g:166:3: this_AssemblyContext_0= ruleAssemblyContext
                    {

                    			newCompositeNode(grammarAccess.getAbstractSystemElementAccess().getAssemblyContextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssemblyContext_0=ruleAssemblyContext();

                    state._fsp--;


                    			current = this_AssemblyContext_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAssemblyViewType.g:175:3: this_Role_1= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getAbstractSystemElementAccess().getRoleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_1=ruleRole();

                    state._fsp--;


                    			current = this_Role_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAssemblyViewType.g:184:3: this_DelegationConnector_2= ruleDelegationConnector
                    {

                    			newCompositeNode(grammarAccess.getAbstractSystemElementAccess().getDelegationConnectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelegationConnector_2=ruleDelegationConnector();

                    state._fsp--;


                    			current = this_DelegationConnector_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAssemblyViewType.g:193:3: this_AssemblyConnector_3= ruleAssemblyConnector
                    {

                    			newCompositeNode(grammarAccess.getAbstractSystemElementAccess().getAssemblyConnectorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssemblyConnector_3=ruleAssemblyConnector();

                    state._fsp--;


                    			current = this_AssemblyConnector_3;
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
    // $ANTLR end "ruleAbstractSystemElement"


    // $ANTLR start "entryRuleSystem"
    // InternalAssemblyViewType.g:205:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalAssemblyViewType.g:205:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalAssemblyViewType.g:206:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalAssemblyViewType.g:212:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= '{' (otherlv_2= 'requiredInterfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'providedInterfaces' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= 'systemElements' otherlv_15= '{' ( (lv_systemElements_16_0= ruleAbstractSystemElement ) ) (otherlv_17= ',' ( (lv_systemElements_18_0= ruleAbstractSystemElement ) ) )* otherlv_19= '}' otherlv_20= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_systemElements_16_0 = null;

        EObject lv_systemElements_18_0 = null;



        	enterRule();

        try {
            // InternalAssemblyViewType.g:218:2: ( (otherlv_0= 'System' otherlv_1= '{' (otherlv_2= 'requiredInterfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'providedInterfaces' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= 'systemElements' otherlv_15= '{' ( (lv_systemElements_16_0= ruleAbstractSystemElement ) ) (otherlv_17= ',' ( (lv_systemElements_18_0= ruleAbstractSystemElement ) ) )* otherlv_19= '}' otherlv_20= '}' ) )
            // InternalAssemblyViewType.g:219:2: (otherlv_0= 'System' otherlv_1= '{' (otherlv_2= 'requiredInterfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'providedInterfaces' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= 'systemElements' otherlv_15= '{' ( (lv_systemElements_16_0= ruleAbstractSystemElement ) ) (otherlv_17= ',' ( (lv_systemElements_18_0= ruleAbstractSystemElement ) ) )* otherlv_19= '}' otherlv_20= '}' )
            {
            // InternalAssemblyViewType.g:219:2: (otherlv_0= 'System' otherlv_1= '{' (otherlv_2= 'requiredInterfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'providedInterfaces' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= 'systemElements' otherlv_15= '{' ( (lv_systemElements_16_0= ruleAbstractSystemElement ) ) (otherlv_17= ',' ( (lv_systemElements_18_0= ruleAbstractSystemElement ) ) )* otherlv_19= '}' otherlv_20= '}' )
            // InternalAssemblyViewType.g:220:3: otherlv_0= 'System' otherlv_1= '{' (otherlv_2= 'requiredInterfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'providedInterfaces' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' otherlv_14= 'systemElements' otherlv_15= '{' ( (lv_systemElements_16_0= ruleAbstractSystemElement ) ) (otherlv_17= ',' ( (lv_systemElements_18_0= ruleAbstractSystemElement ) ) )* otherlv_19= '}' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAssemblyViewType.g:228:3: (otherlv_2= 'requiredInterfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAssemblyViewType.g:229:4: otherlv_2= 'requiredInterfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getRequiredInterfacesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalAssemblyViewType.g:237:4: ( ( ruleEString ) )
                    // InternalAssemblyViewType.g:238:5: ( ruleEString )
                    {
                    // InternalAssemblyViewType.g:238:5: ( ruleEString )
                    // InternalAssemblyViewType.g:239:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAssemblyViewType.g:253:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAssemblyViewType.g:254:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalAssemblyViewType.g:258:5: ( ( ruleEString ) )
                    	    // InternalAssemblyViewType.g:259:6: ( ruleEString )
                    	    {
                    	    // InternalAssemblyViewType.g:259:6: ( ruleEString )
                    	    // InternalAssemblyViewType.g:260:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSystemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_3());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_4());
            		
            // InternalAssemblyViewType.g:288:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:289:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:289:4: ( ruleEString )
            // InternalAssemblyViewType.g:290:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssemblyViewType.g:304:3: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAssemblyViewType.g:305:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAssemblyViewType.g:309:4: ( ( ruleEString ) )
            	    // InternalAssemblyViewType.g:310:5: ( ruleEString )
            	    {
            	    // InternalAssemblyViewType.g:310:5: ( ruleEString )
            	    // InternalAssemblyViewType.g:311:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_6_1_0());
            	    					
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

            otherlv_13=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getRightParenthesisKeyword_7());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getSystemElementsKeyword_8());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalAssemblyViewType.g:338:3: ( (lv_systemElements_16_0= ruleAbstractSystemElement ) )
            // InternalAssemblyViewType.g:339:4: (lv_systemElements_16_0= ruleAbstractSystemElement )
            {
            // InternalAssemblyViewType.g:339:4: (lv_systemElements_16_0= ruleAbstractSystemElement )
            // InternalAssemblyViewType.g:340:5: lv_systemElements_16_0= ruleAbstractSystemElement
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_systemElements_16_0=ruleAbstractSystemElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					add(
            						current,
            						"systemElements",
            						lv_systemElements_16_0,
            						"org.xtext.mdsd.simplepalladio.AssemblyViewType.AbstractSystemElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssemblyViewType.g:357:3: (otherlv_17= ',' ( (lv_systemElements_18_0= ruleAbstractSystemElement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAssemblyViewType.g:358:4: otherlv_17= ',' ( (lv_systemElements_18_0= ruleAbstractSystemElement ) )
            	    {
            	    otherlv_17=(Token)match(input,14,FOLLOW_14); 

            	    				newLeafNode(otherlv_17, grammarAccess.getSystemAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAssemblyViewType.g:362:4: ( (lv_systemElements_18_0= ruleAbstractSystemElement ) )
            	    // InternalAssemblyViewType.g:363:5: (lv_systemElements_18_0= ruleAbstractSystemElement )
            	    {
            	    // InternalAssemblyViewType.g:363:5: (lv_systemElements_18_0= ruleAbstractSystemElement )
            	    // InternalAssemblyViewType.g:364:6: lv_systemElements_18_0= ruleAbstractSystemElement
            	    {

            	    						newCompositeNode(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_systemElements_18_0=ruleAbstractSystemElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"systemElements",
            	    							lv_systemElements_18_0,
            	    							"org.xtext.mdsd.simplepalladio.AssemblyViewType.AbstractSystemElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_19=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_19, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleEString"
    // InternalAssemblyViewType.g:394:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAssemblyViewType.g:394:47: (iv_ruleEString= ruleEString EOF )
            // InternalAssemblyViewType.g:395:2: iv_ruleEString= ruleEString EOF
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
    // InternalAssemblyViewType.g:401:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAssemblyViewType.g:407:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAssemblyViewType.g:408:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAssemblyViewType.g:408:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAssemblyViewType.g:409:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAssemblyViewType.g:417:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalAssemblyViewType.g:428:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalAssemblyViewType.g:428:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalAssemblyViewType.g:429:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalAssemblyViewType.g:435:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAssemblyViewType.g:441:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalAssemblyViewType.g:442:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalAssemblyViewType.g:442:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalAssemblyViewType.g:443:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalAssemblyViewType.g:447:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAssemblyViewType.g:448:4: (lv_name_1_0= ruleEString )
            {
            // InternalAssemblyViewType.g:448:4: (lv_name_1_0= ruleEString )
            // InternalAssemblyViewType.g:449:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.simplepalladio.AssemblyViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalAssemblyViewType.g:474:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:475:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:475:4: ( ruleEString )
            // InternalAssemblyViewType.g:476:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentAbstractComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6());
            		
            // InternalAssemblyViewType.g:498:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:499:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:499:4: ( ruleEString )
            // InternalAssemblyViewType.g:500:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_7_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssemblyViewType.g:514:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAssemblyViewType.g:515:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalAssemblyViewType.g:519:4: ( ( ruleEString ) )
            	    // InternalAssemblyViewType.g:520:5: ( ruleEString )
            	    {
            	    // InternalAssemblyViewType.g:520:5: ( ruleEString )
            	    // InternalAssemblyViewType.g:521:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAssemblyContextRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_8_1_0());
            	    					
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

            otherlv_10=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_9());
            		
            // InternalAssemblyViewType.g:540:3: (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAssemblyViewType.g:541:4: otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalAssemblyViewType.g:549:4: ( ( ruleEString ) )
                    // InternalAssemblyViewType.g:550:5: ( ruleEString )
                    {
                    // InternalAssemblyViewType.g:550:5: ( ruleEString )
                    // InternalAssemblyViewType.g:551:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAssemblyViewType.g:565:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalAssemblyViewType.g:566:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAssemblyViewType.g:570:5: ( ( ruleEString ) )
                    	    // InternalAssemblyViewType.g:571:6: ( ruleEString )
                    	    {
                    	    // InternalAssemblyViewType.g:571:6: ( ruleEString )
                    	    // InternalAssemblyViewType.g:572:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleRole"
    // InternalAssemblyViewType.g:600:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalAssemblyViewType.g:600:45: (iv_ruleRole= ruleRole EOF )
            // InternalAssemblyViewType.g:601:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalAssemblyViewType.g:607:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'interface' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAssemblyViewType.g:613:2: ( (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'interface' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalAssemblyViewType.g:614:2: (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'interface' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalAssemblyViewType.g:614:2: (otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'interface' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalAssemblyViewType.g:615:3: otherlv_0= 'Role' otherlv_1= '{' otherlv_2= 'interface' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getInterfaceKeyword_2());
            		
            // InternalAssemblyViewType.g:627:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:628:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:628:4: ( ruleEString )
            // InternalAssemblyViewType.g:629:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalAssemblyViewType.g:651:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalAssemblyViewType.g:651:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalAssemblyViewType.g:652:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationConnector=ruleDelegationConnector();

            state._fsp--;

             current =iv_ruleDelegationConnector; 
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
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalAssemblyViewType.g:658:1: ruleDelegationConnector returns [EObject current=null] : (otherlv_0= 'DelegationConnector' otherlv_1= '{' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'interface' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAssemblyViewType.g:664:2: ( (otherlv_0= 'DelegationConnector' otherlv_1= '{' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'interface' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAssemblyViewType.g:665:2: (otherlv_0= 'DelegationConnector' otherlv_1= '{' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'interface' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAssemblyViewType.g:665:2: (otherlv_0= 'DelegationConnector' otherlv_1= '{' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'interface' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAssemblyViewType.g:666:3: otherlv_0= 'DelegationConnector' otherlv_1= '{' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'interface' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorAccess().getRoleKeyword_2());
            		
            // InternalAssemblyViewType.g:678:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:679:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:679:4: ( ruleEString )
            // InternalAssemblyViewType.g:680:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorAccess().getInterfaceKeyword_4());
            		
            // InternalAssemblyViewType.g:698:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:699:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:699:4: ( ruleEString )
            // InternalAssemblyViewType.g:700:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalAssemblyViewType.g:722:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalAssemblyViewType.g:722:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalAssemblyViewType.g:723:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
            {
             newCompositeNode(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyConnector=ruleAssemblyConnector();

            state._fsp--;

             current =iv_ruleAssemblyConnector; 
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
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalAssemblyViewType.g:729:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'providedRole' ( ( ruleEString ) ) otherlv_4= 'requiredRole' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAssemblyViewType.g:735:2: ( (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'providedRole' ( ( ruleEString ) ) otherlv_4= 'requiredRole' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAssemblyViewType.g:736:2: (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'providedRole' ( ( ruleEString ) ) otherlv_4= 'requiredRole' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAssemblyViewType.g:736:2: (otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'providedRole' ( ( ruleEString ) ) otherlv_4= 'requiredRole' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAssemblyViewType.g:737:3: otherlv_0= 'AssemblyConnector' otherlv_1= '{' otherlv_2= 'providedRole' ( ( ruleEString ) ) otherlv_4= 'requiredRole' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_2());
            		
            // InternalAssemblyViewType.g:749:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:750:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:750:4: ( ruleEString )
            // InternalAssemblyViewType.g:751:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_4());
            		
            // InternalAssemblyViewType.g:769:3: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:770:4: ( ruleEString )
            {
            // InternalAssemblyViewType.g:770:4: ( ruleEString )
            // InternalAssemblyViewType.g:771:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAssemblyConnector"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000054400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});

}