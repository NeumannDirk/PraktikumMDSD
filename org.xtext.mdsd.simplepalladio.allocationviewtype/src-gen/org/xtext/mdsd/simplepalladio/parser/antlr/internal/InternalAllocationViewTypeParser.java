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
import org.xtext.mdsd.simplepalladio.services.AllocationViewTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAllocationViewTypeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllocationViewType'", "'{'", "'allocationContexts'", "','", "'}'", "'AllocationContext'", "'container'", "'assembly'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAllocationViewTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAllocationViewTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAllocationViewTypeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAllocationViewType.g"; }



     	private AllocationViewTypeGrammarAccess grammarAccess;

        public InternalAllocationViewTypeParser(TokenStream input, AllocationViewTypeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AllocationViewType";
       	}

       	@Override
       	protected AllocationViewTypeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAllocationViewType"
    // InternalAllocationViewType.g:64:1: entryRuleAllocationViewType returns [EObject current=null] : iv_ruleAllocationViewType= ruleAllocationViewType EOF ;
    public final EObject entryRuleAllocationViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationViewType = null;


        try {
            // InternalAllocationViewType.g:64:59: (iv_ruleAllocationViewType= ruleAllocationViewType EOF )
            // InternalAllocationViewType.g:65:2: iv_ruleAllocationViewType= ruleAllocationViewType EOF
            {
             newCompositeNode(grammarAccess.getAllocationViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationViewType=ruleAllocationViewType();

            state._fsp--;

             current =iv_ruleAllocationViewType; 
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
    // $ANTLR end "entryRuleAllocationViewType"


    // $ANTLR start "ruleAllocationViewType"
    // InternalAllocationViewType.g:71:1: ruleAllocationViewType returns [EObject current=null] : (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAllocationViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_allocationContexts_4_0 = null;

        EObject lv_allocationContexts_6_0 = null;



        	enterRule();

        try {
            // InternalAllocationViewType.g:77:2: ( (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalAllocationViewType.g:78:2: (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalAllocationViewType.g:78:2: (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalAllocationViewType.g:79:3: otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationViewTypeAccess().getAllocationViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationViewTypeAccess().getAllocationContextsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAllocationViewType.g:95:3: ( (lv_allocationContexts_4_0= ruleAllocationContext ) )
            // InternalAllocationViewType.g:96:4: (lv_allocationContexts_4_0= ruleAllocationContext )
            {
            // InternalAllocationViewType.g:96:4: (lv_allocationContexts_4_0= ruleAllocationContext )
            // InternalAllocationViewType.g:97:5: lv_allocationContexts_4_0= ruleAllocationContext
            {

            					newCompositeNode(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_allocationContexts_4_0=ruleAllocationContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationViewTypeRule());
            					}
            					add(
            						current,
            						"allocationContexts",
            						lv_allocationContexts_4_0,
            						"org.xtext.mdsd.simplepalladio.AllocationViewType.AllocationContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocationViewType.g:114:3: (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAllocationViewType.g:115:4: otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAllocationViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalAllocationViewType.g:119:4: ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
            	    // InternalAllocationViewType.g:120:5: (lv_allocationContexts_6_0= ruleAllocationContext )
            	    {
            	    // InternalAllocationViewType.g:120:5: (lv_allocationContexts_6_0= ruleAllocationContext )
            	    // InternalAllocationViewType.g:121:6: lv_allocationContexts_6_0= ruleAllocationContext
            	    {

            	    						newCompositeNode(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_allocationContexts_6_0=ruleAllocationContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAllocationViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"allocationContexts",
            	    							lv_allocationContexts_6_0,
            	    							"org.xtext.mdsd.simplepalladio.AllocationViewType.AllocationContext");
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

            			newLeafNode(otherlv_7, grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAllocationViewType"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalAllocationViewType.g:151:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalAllocationViewType.g:151:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalAllocationViewType.g:152:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalAllocationViewType.g:158:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAllocationViewType.g:164:2: ( (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAllocationViewType.g:165:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAllocationViewType.g:165:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAllocationViewType.g:166:3: otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getContainerKeyword_2());
            		
            // InternalAllocationViewType.g:178:3: ( ( ruleEString ) )
            // InternalAllocationViewType.g:179:4: ( ruleEString )
            {
            // InternalAllocationViewType.g:179:4: ( ruleEString )
            // InternalAllocationViewType.g:180:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getAssemblyKeyword_4());
            		
            // InternalAllocationViewType.g:198:3: ( ( ruleEString ) )
            // InternalAllocationViewType.g:199:4: ( ruleEString )
            {
            // InternalAllocationViewType.g:199:4: ( ruleEString )
            // InternalAllocationViewType.g:200:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleEString"
    // InternalAllocationViewType.g:222:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAllocationViewType.g:222:47: (iv_ruleEString= ruleEString EOF )
            // InternalAllocationViewType.g:223:2: iv_ruleEString= ruleEString EOF
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
    // InternalAllocationViewType.g:229:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAllocationViewType.g:235:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAllocationViewType.g:236:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAllocationViewType.g:236:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAllocationViewType.g:237:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAllocationViewType.g:245:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}