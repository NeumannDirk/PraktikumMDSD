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
import org.xtext.mdsd.simplepalladio.services.EnvironmentViewTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvironmentViewTypeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EnvironmentViewType'", "'{'", "'environmentElements'", "','", "'}'", "'Container'", "'Link'", "'containers'", "'('", "')'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalEnvironmentViewTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvironmentViewTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvironmentViewTypeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvironmentViewType.g"; }



     	private EnvironmentViewTypeGrammarAccess grammarAccess;

        public InternalEnvironmentViewTypeParser(TokenStream input, EnvironmentViewTypeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnvironmentViewType";
       	}

       	@Override
       	protected EnvironmentViewTypeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnvironmentViewType"
    // InternalEnvironmentViewType.g:64:1: entryRuleEnvironmentViewType returns [EObject current=null] : iv_ruleEnvironmentViewType= ruleEnvironmentViewType EOF ;
    public final EObject entryRuleEnvironmentViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentViewType = null;


        try {
            // InternalEnvironmentViewType.g:64:60: (iv_ruleEnvironmentViewType= ruleEnvironmentViewType EOF )
            // InternalEnvironmentViewType.g:65:2: iv_ruleEnvironmentViewType= ruleEnvironmentViewType EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentViewTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentViewType=ruleEnvironmentViewType();

            state._fsp--;

             current =iv_ruleEnvironmentViewType; 
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
    // $ANTLR end "entryRuleEnvironmentViewType"


    // $ANTLR start "ruleEnvironmentViewType"
    // InternalEnvironmentViewType.g:71:1: ruleEnvironmentViewType returns [EObject current=null] : (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleEnvironmentViewType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_environmentElements_4_0 = null;

        EObject lv_environmentElements_6_0 = null;



        	enterRule();

        try {
            // InternalEnvironmentViewType.g:77:2: ( (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalEnvironmentViewType.g:78:2: (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalEnvironmentViewType.g:78:2: (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalEnvironmentViewType.g:79:3: otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEnvironmentViewType.g:95:3: ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) )
            // InternalEnvironmentViewType.g:96:4: (lv_environmentElements_4_0= ruleAbstractEnvironmentElement )
            {
            // InternalEnvironmentViewType.g:96:4: (lv_environmentElements_4_0= ruleAbstractEnvironmentElement )
            // InternalEnvironmentViewType.g:97:5: lv_environmentElements_4_0= ruleAbstractEnvironmentElement
            {

            					newCompositeNode(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_environmentElements_4_0=ruleAbstractEnvironmentElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentViewTypeRule());
            					}
            					add(
            						current,
            						"environmentElements",
            						lv_environmentElements_4_0,
            						"org.xtext.mdsd.simplepalladio.EnvironmentViewType.AbstractEnvironmentElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEnvironmentViewType.g:114:3: (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEnvironmentViewType.g:115:4: otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalEnvironmentViewType.g:119:4: ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) )
            	    // InternalEnvironmentViewType.g:120:5: (lv_environmentElements_6_0= ruleAbstractEnvironmentElement )
            	    {
            	    // InternalEnvironmentViewType.g:120:5: (lv_environmentElements_6_0= ruleAbstractEnvironmentElement )
            	    // InternalEnvironmentViewType.g:121:6: lv_environmentElements_6_0= ruleAbstractEnvironmentElement
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_environmentElements_6_0=ruleAbstractEnvironmentElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environmentElements",
            	    							lv_environmentElements_6_0,
            	    							"org.xtext.mdsd.simplepalladio.EnvironmentViewType.AbstractEnvironmentElement");
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

            			newLeafNode(otherlv_7, grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEnvironmentViewType"


    // $ANTLR start "entryRuleAbstractEnvironmentElement"
    // InternalEnvironmentViewType.g:151:1: entryRuleAbstractEnvironmentElement returns [EObject current=null] : iv_ruleAbstractEnvironmentElement= ruleAbstractEnvironmentElement EOF ;
    public final EObject entryRuleAbstractEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEnvironmentElement = null;


        try {
            // InternalEnvironmentViewType.g:151:67: (iv_ruleAbstractEnvironmentElement= ruleAbstractEnvironmentElement EOF )
            // InternalEnvironmentViewType.g:152:2: iv_ruleAbstractEnvironmentElement= ruleAbstractEnvironmentElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractEnvironmentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractEnvironmentElement=ruleAbstractEnvironmentElement();

            state._fsp--;

             current =iv_ruleAbstractEnvironmentElement; 
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
    // $ANTLR end "entryRuleAbstractEnvironmentElement"


    // $ANTLR start "ruleAbstractEnvironmentElement"
    // InternalEnvironmentViewType.g:158:1: ruleAbstractEnvironmentElement returns [EObject current=null] : (this_Container_0= ruleContainer | this_Link_1= ruleLink ) ;
    public final EObject ruleAbstractEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Link_1 = null;



        	enterRule();

        try {
            // InternalEnvironmentViewType.g:164:2: ( (this_Container_0= ruleContainer | this_Link_1= ruleLink ) )
            // InternalEnvironmentViewType.g:165:2: (this_Container_0= ruleContainer | this_Link_1= ruleLink )
            {
            // InternalEnvironmentViewType.g:165:2: (this_Container_0= ruleContainer | this_Link_1= ruleLink )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEnvironmentViewType.g:166:3: this_Container_0= ruleContainer
                    {

                    			newCompositeNode(grammarAccess.getAbstractEnvironmentElementAccess().getContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Container_0=ruleContainer();

                    state._fsp--;


                    			current = this_Container_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEnvironmentViewType.g:175:3: this_Link_1= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractEnvironmentElementAccess().getLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_1=ruleLink();

                    state._fsp--;


                    			current = this_Link_1;
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
    // $ANTLR end "ruleAbstractEnvironmentElement"


    // $ANTLR start "entryRuleEString"
    // InternalEnvironmentViewType.g:187:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEnvironmentViewType.g:187:47: (iv_ruleEString= ruleEString EOF )
            // InternalEnvironmentViewType.g:188:2: iv_ruleEString= ruleEString EOF
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
    // InternalEnvironmentViewType.g:194:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEnvironmentViewType.g:200:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEnvironmentViewType.g:201:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEnvironmentViewType.g:201:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEnvironmentViewType.g:202:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEnvironmentViewType.g:210:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleContainer"
    // InternalEnvironmentViewType.g:221:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalEnvironmentViewType.g:221:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalEnvironmentViewType.g:222:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalEnvironmentViewType.g:228:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEnvironmentViewType.g:234:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEnvironmentViewType.g:235:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEnvironmentViewType.g:235:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalEnvironmentViewType.g:236:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEnvironmentViewType.g:236:3: ()
            // InternalEnvironmentViewType.g:237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalEnvironmentViewType.g:247:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEnvironmentViewType.g:248:4: (lv_name_2_0= ruleEString )
            {
            // InternalEnvironmentViewType.g:248:4: (lv_name_2_0= ruleEString )
            // InternalEnvironmentViewType.g:249:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.mdsd.simplepalladio.EnvironmentViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalEnvironmentViewType.g:270:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalEnvironmentViewType.g:270:45: (iv_ruleLink= ruleLink EOF )
            // InternalEnvironmentViewType.g:271:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalEnvironmentViewType.g:277:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
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
            // InternalEnvironmentViewType.g:283:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' ) )
            // InternalEnvironmentViewType.g:284:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalEnvironmentViewType.g:284:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' )
            // InternalEnvironmentViewType.g:285:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalEnvironmentViewType.g:289:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEnvironmentViewType.g:290:4: (lv_name_1_0= ruleEString )
            {
            // InternalEnvironmentViewType.g:290:4: (lv_name_1_0= ruleEString )
            // InternalEnvironmentViewType.g:291:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsd.simplepalladio.EnvironmentViewType.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalEnvironmentViewType.g:320:3: ( ( ruleEString ) )
            // InternalEnvironmentViewType.g:321:4: ( ruleEString )
            {
            // InternalEnvironmentViewType.g:321:4: ( ruleEString )
            // InternalEnvironmentViewType.g:322:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEnvironmentViewType.g:336:3: (otherlv_6= ',' ( ( ruleEString ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEnvironmentViewType.g:337:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalEnvironmentViewType.g:341:4: ( ( ruleEString ) )
            	    // InternalEnvironmentViewType.g:342:5: ( ruleEString )
            	    {
            	    // InternalEnvironmentViewType.g:342:5: ( ruleEString )
            	    // InternalEnvironmentViewType.g:343:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLink"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000104000L});

}