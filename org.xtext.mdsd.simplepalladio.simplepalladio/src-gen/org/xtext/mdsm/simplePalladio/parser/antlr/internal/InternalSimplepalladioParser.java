package org.xtext.mdsm.simplePalladio.parser.antlr.internal;

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
import org.xtext.mdsm.simplePalladio.services.SimplepalladioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplepalladioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'RepositoryViewType'", "'repositoryElements'", "','", "'Interface'", "'signatures'", "'('", "')'", "'CompositeComponent'", "'requiredInterfaces'", "'providedInterfaces'", "'system'", "'Signature'", "'returnValue'", "'parameters'", "'Component'", "'services'", "'Parameter'", "'type'", "'Service'", "'signature'", "'behaviourDescription'", "'BehaviourDescription'", "'behaviorElements'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'AssemblyViewType'", "'systems'", "'System'", "'systemElements'", "'AssemblyContext'", "'component'", "'providedRoles'", "'requiredRoles'", "'Role'", "'interface'", "'DelegationConnector'", "'role'", "'AssemblyConnector'", "'providedRole'", "'requiredRole'", "'EnvironmentViewType'", "'environmentElements'", "'Container'", "'Link'", "'containers'", "'AllocationViewType'", "'allocationContexts'", "'AllocationContext'", "'container'", "'assembly'", "'.'", "'VOID'", "'BOOLEAN'", "'CHAR'", "'DATE'", "'DOUBLE'", "'FLOAT'", "'LIST'", "'INT'", "'LONG'", "'MAP'", "'STRING'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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


        public InternalSimplepalladioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplepalladioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplepalladioParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimplepalladio.g"; }



     	private SimplepalladioGrammarAccess grammarAccess;

        public InternalSimplepalladioParser(TokenStream input, SimplepalladioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SimplepalladioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSimplepalladio.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSimplepalladio.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSimplepalladio.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimplepalladio.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= '{' ( (lv_repositoryViewType_1_0= ruleRepositoryViewType ) ) ( (lv_assemblyViewType_2_0= ruleAssemblyViewType ) ) ( (lv_repositoryViewType2_3_0= ruleRepositoryViewType ) )? ( (lv_assemblyViewType2_4_0= ruleAssemblyViewType ) )? ( (lv_environmentViewType_5_0= ruleEnvironmentViewType ) ) ( (lv_allocationViewType_6_0= ruleAllocationViewType ) ) otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_7=null;
        EObject lv_repositoryViewType_1_0 = null;

        EObject lv_assemblyViewType_2_0 = null;

        EObject lv_repositoryViewType2_3_0 = null;

        EObject lv_assemblyViewType2_4_0 = null;

        EObject lv_environmentViewType_5_0 = null;

        EObject lv_allocationViewType_6_0 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:78:2: ( (otherlv_0= '{' ( (lv_repositoryViewType_1_0= ruleRepositoryViewType ) ) ( (lv_assemblyViewType_2_0= ruleAssemblyViewType ) ) ( (lv_repositoryViewType2_3_0= ruleRepositoryViewType ) )? ( (lv_assemblyViewType2_4_0= ruleAssemblyViewType ) )? ( (lv_environmentViewType_5_0= ruleEnvironmentViewType ) ) ( (lv_allocationViewType_6_0= ruleAllocationViewType ) ) otherlv_7= '}' ) )
            // InternalSimplepalladio.g:79:2: (otherlv_0= '{' ( (lv_repositoryViewType_1_0= ruleRepositoryViewType ) ) ( (lv_assemblyViewType_2_0= ruleAssemblyViewType ) ) ( (lv_repositoryViewType2_3_0= ruleRepositoryViewType ) )? ( (lv_assemblyViewType2_4_0= ruleAssemblyViewType ) )? ( (lv_environmentViewType_5_0= ruleEnvironmentViewType ) ) ( (lv_allocationViewType_6_0= ruleAllocationViewType ) ) otherlv_7= '}' )
            {
            // InternalSimplepalladio.g:79:2: (otherlv_0= '{' ( (lv_repositoryViewType_1_0= ruleRepositoryViewType ) ) ( (lv_assemblyViewType_2_0= ruleAssemblyViewType ) ) ( (lv_repositoryViewType2_3_0= ruleRepositoryViewType ) )? ( (lv_assemblyViewType2_4_0= ruleAssemblyViewType ) )? ( (lv_environmentViewType_5_0= ruleEnvironmentViewType ) ) ( (lv_allocationViewType_6_0= ruleAllocationViewType ) ) otherlv_7= '}' )
            // InternalSimplepalladio.g:80:3: otherlv_0= '{' ( (lv_repositoryViewType_1_0= ruleRepositoryViewType ) ) ( (lv_assemblyViewType_2_0= ruleAssemblyViewType ) ) ( (lv_repositoryViewType2_3_0= ruleRepositoryViewType ) )? ( (lv_assemblyViewType2_4_0= ruleAssemblyViewType ) )? ( (lv_environmentViewType_5_0= ruleEnvironmentViewType ) ) ( (lv_allocationViewType_6_0= ruleAllocationViewType ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalSimplepalladio.g:84:3: ( (lv_repositoryViewType_1_0= ruleRepositoryViewType ) )
            // InternalSimplepalladio.g:85:4: (lv_repositoryViewType_1_0= ruleRepositoryViewType )
            {
            // InternalSimplepalladio.g:85:4: (lv_repositoryViewType_1_0= ruleRepositoryViewType )
            // InternalSimplepalladio.g:86:5: lv_repositoryViewType_1_0= ruleRepositoryViewType
            {

            					newCompositeNode(grammarAccess.getModelAccess().getRepositoryViewTypeRepositoryViewTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_repositoryViewType_1_0=ruleRepositoryViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"repositoryViewType",
            						lv_repositoryViewType_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.RepositoryViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:103:3: ( (lv_assemblyViewType_2_0= ruleAssemblyViewType ) )
            // InternalSimplepalladio.g:104:4: (lv_assemblyViewType_2_0= ruleAssemblyViewType )
            {
            // InternalSimplepalladio.g:104:4: (lv_assemblyViewType_2_0= ruleAssemblyViewType )
            // InternalSimplepalladio.g:105:5: lv_assemblyViewType_2_0= ruleAssemblyViewType
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAssemblyViewTypeAssemblyViewTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_assemblyViewType_2_0=ruleAssemblyViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"assemblyViewType",
            						lv_assemblyViewType_2_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.AssemblyViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:122:3: ( (lv_repositoryViewType2_3_0= ruleRepositoryViewType ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimplepalladio.g:123:4: (lv_repositoryViewType2_3_0= ruleRepositoryViewType )
                    {
                    // InternalSimplepalladio.g:123:4: (lv_repositoryViewType2_3_0= ruleRepositoryViewType )
                    // InternalSimplepalladio.g:124:5: lv_repositoryViewType2_3_0= ruleRepositoryViewType
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getRepositoryViewType2RepositoryViewTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_repositoryViewType2_3_0=ruleRepositoryViewType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"repositoryViewType2",
                    						lv_repositoryViewType2_3_0,
                    						"org.xtext.mdsm.simplePalladio.Simplepalladio.RepositoryViewType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimplepalladio.g:141:3: ( (lv_assemblyViewType2_4_0= ruleAssemblyViewType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimplepalladio.g:142:4: (lv_assemblyViewType2_4_0= ruleAssemblyViewType )
                    {
                    // InternalSimplepalladio.g:142:4: (lv_assemblyViewType2_4_0= ruleAssemblyViewType )
                    // InternalSimplepalladio.g:143:5: lv_assemblyViewType2_4_0= ruleAssemblyViewType
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getAssemblyViewType2AssemblyViewTypeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_assemblyViewType2_4_0=ruleAssemblyViewType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"assemblyViewType2",
                    						lv_assemblyViewType2_4_0,
                    						"org.xtext.mdsm.simplePalladio.Simplepalladio.AssemblyViewType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimplepalladio.g:160:3: ( (lv_environmentViewType_5_0= ruleEnvironmentViewType ) )
            // InternalSimplepalladio.g:161:4: (lv_environmentViewType_5_0= ruleEnvironmentViewType )
            {
            // InternalSimplepalladio.g:161:4: (lv_environmentViewType_5_0= ruleEnvironmentViewType )
            // InternalSimplepalladio.g:162:5: lv_environmentViewType_5_0= ruleEnvironmentViewType
            {

            					newCompositeNode(grammarAccess.getModelAccess().getEnvironmentViewTypeEnvironmentViewTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_environmentViewType_5_0=ruleEnvironmentViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"environmentViewType",
            						lv_environmentViewType_5_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EnvironmentViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:179:3: ( (lv_allocationViewType_6_0= ruleAllocationViewType ) )
            // InternalSimplepalladio.g:180:4: (lv_allocationViewType_6_0= ruleAllocationViewType )
            {
            // InternalSimplepalladio.g:180:4: (lv_allocationViewType_6_0= ruleAllocationViewType )
            // InternalSimplepalladio.g:181:5: lv_allocationViewType_6_0= ruleAllocationViewType
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAllocationViewTypeAllocationViewTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_allocationViewType_6_0=ruleAllocationViewType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"allocationViewType",
            						lv_allocationViewType_6_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.AllocationViewType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRepositoryViewType"
    // InternalSimplepalladio.g:206:1: entryRuleRepositoryViewType returns [EObject current=null] : iv_ruleRepositoryViewType= ruleRepositoryViewType EOF ;
    public final EObject entryRuleRepositoryViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryViewType = null;


        try {
            // InternalSimplepalladio.g:206:59: (iv_ruleRepositoryViewType= ruleRepositoryViewType EOF )
            // InternalSimplepalladio.g:207:2: iv_ruleRepositoryViewType= ruleRepositoryViewType EOF
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
    // InternalSimplepalladio.g:213:1: ruleRepositoryViewType returns [EObject current=null] : (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalSimplepalladio.g:219:2: ( (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalSimplepalladio.g:220:2: (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalSimplepalladio.g:220:2: (otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalSimplepalladio.g:221:3: otherlv_0= 'RepositoryViewType' otherlv_1= '{' otherlv_2= 'repositoryElements' otherlv_3= '{' ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) ) (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryViewTypeAccess().getRepositoryViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplepalladio.g:237:3: ( (lv_repositoryElements_4_0= ruleAbstractRepositoryElement ) )
            // InternalSimplepalladio.g:238:4: (lv_repositoryElements_4_0= ruleAbstractRepositoryElement )
            {
            // InternalSimplepalladio.g:238:4: (lv_repositoryElements_4_0= ruleAbstractRepositoryElement )
            // InternalSimplepalladio.g:239:5: lv_repositoryElements_4_0= ruleAbstractRepositoryElement
            {

            					newCompositeNode(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_repositoryElements_4_0=ruleAbstractRepositoryElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryViewTypeRule());
            					}
            					add(
            						current,
            						"repositoryElements",
            						lv_repositoryElements_4_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.AbstractRepositoryElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:256:3: (otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimplepalladio.g:257:4: otherlv_5= ',' ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRepositoryViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSimplepalladio.g:261:4: ( (lv_repositoryElements_6_0= ruleAbstractRepositoryElement ) )
            	    // InternalSimplepalladio.g:262:5: (lv_repositoryElements_6_0= ruleAbstractRepositoryElement )
            	    {
            	    // InternalSimplepalladio.g:262:5: (lv_repositoryElements_6_0= ruleAbstractRepositoryElement )
            	    // InternalSimplepalladio.g:263:6: lv_repositoryElements_6_0= ruleAbstractRepositoryElement
            	    {

            	    						newCompositeNode(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_repositoryElements_6_0=ruleAbstractRepositoryElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRepositoryViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"repositoryElements",
            	    							lv_repositoryElements_6_0,
            	    							"org.xtext.mdsm.simplePalladio.Simplepalladio.AbstractRepositoryElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:293:1: entryRuleAbstractRepositoryElement returns [EObject current=null] : iv_ruleAbstractRepositoryElement= ruleAbstractRepositoryElement EOF ;
    public final EObject entryRuleAbstractRepositoryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRepositoryElement = null;


        try {
            // InternalSimplepalladio.g:293:66: (iv_ruleAbstractRepositoryElement= ruleAbstractRepositoryElement EOF )
            // InternalSimplepalladio.g:294:2: iv_ruleAbstractRepositoryElement= ruleAbstractRepositoryElement EOF
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
    // InternalSimplepalladio.g:300:1: ruleAbstractRepositoryElement returns [EObject current=null] : (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent ) ;
    public final EObject ruleAbstractRepositoryElement() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_CompositeComponent_1 = null;

        EObject this_Signature_2 = null;

        EObject this_Component_3 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:306:2: ( (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent ) )
            // InternalSimplepalladio.g:307:2: (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent )
            {
            // InternalSimplepalladio.g:307:2: (this_Interface_0= ruleInterface | this_CompositeComponent_1= ruleCompositeComponent | this_Signature_2= ruleSignature | this_Component_3= ruleComponent )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSimplepalladio.g:308:3: this_Interface_0= ruleInterface
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
                    // InternalSimplepalladio.g:317:3: this_CompositeComponent_1= ruleCompositeComponent
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
                    // InternalSimplepalladio.g:326:3: this_Signature_2= ruleSignature
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
                    // InternalSimplepalladio.g:335:3: this_Component_3= ruleComponent
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
    // InternalSimplepalladio.g:347:1: entryRuleBehaviorElement returns [EObject current=null] : iv_ruleBehaviorElement= ruleBehaviorElement EOF ;
    public final EObject entryRuleBehaviorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorElement = null;


        try {
            // InternalSimplepalladio.g:347:56: (iv_ruleBehaviorElement= ruleBehaviorElement EOF )
            // InternalSimplepalladio.g:348:2: iv_ruleBehaviorElement= ruleBehaviorElement EOF
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
    // InternalSimplepalladio.g:354:1: ruleBehaviorElement returns [EObject current=null] : (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch ) ;
    public final EObject ruleBehaviorElement() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAction_0 = null;

        EObject this_ExternalCall_1 = null;

        EObject this_Loop_2 = null;

        EObject this_Branch_3 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:360:2: ( (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch ) )
            // InternalSimplepalladio.g:361:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch )
            {
            // InternalSimplepalladio.g:361:2: (this_InternalAction_0= ruleInternalAction | this_ExternalCall_1= ruleExternalCall | this_Loop_2= ruleLoop | this_Branch_3= ruleBranch )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 37:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            case 39:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSimplepalladio.g:362:3: this_InternalAction_0= ruleInternalAction
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
                    // InternalSimplepalladio.g:371:3: this_ExternalCall_1= ruleExternalCall
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
                    // InternalSimplepalladio.g:380:3: this_Loop_2= ruleLoop
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
                    // InternalSimplepalladio.g:389:3: this_Branch_3= ruleBranch
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
    // InternalSimplepalladio.g:401:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSimplepalladio.g:401:47: (iv_ruleEString= ruleEString EOF )
            // InternalSimplepalladio.g:402:2: iv_ruleEString= ruleEString EOF
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
    // InternalSimplepalladio.g:408:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSimplepalladio.g:414:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSimplepalladio.g:415:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSimplepalladio.g:415:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimplepalladio.g:416:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:424:3: this_ID_1= RULE_ID
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
    // InternalSimplepalladio.g:435:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalSimplepalladio.g:435:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalSimplepalladio.g:436:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalSimplepalladio.g:442:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalSimplepalladio.g:448:2: ( (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalSimplepalladio.g:449:2: (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalSimplepalladio.g:449:2: (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalSimplepalladio.g:450:3: otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signatures' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalSimplepalladio.g:454:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:455:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:455:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:456:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getSignaturesKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSimplepalladio.g:485:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:486:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:486:4: ( ruleEString )
            // InternalSimplepalladio.g:487:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:501:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimplepalladio.g:502:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSimplepalladio.g:506:4: ( ( ruleEString ) )
            	    // InternalSimplepalladio.g:507:5: ( ruleEString )
            	    {
            	    // InternalSimplepalladio.g:507:5: ( ruleEString )
            	    // InternalSimplepalladio.g:508:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInterfaceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:535:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalSimplepalladio.g:535:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalSimplepalladio.g:536:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
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
    // InternalSimplepalladio.g:542:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleQualifiedName ) ) otherlv_17= '}' ) ;
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
            // InternalSimplepalladio.g:548:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleQualifiedName ) ) otherlv_17= '}' ) )
            // InternalSimplepalladio.g:549:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleQualifiedName ) ) otherlv_17= '}' )
            {
            // InternalSimplepalladio.g:549:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleQualifiedName ) ) otherlv_17= '}' )
            // InternalSimplepalladio.g:550:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'system' ( ( ruleQualifiedName ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalSimplepalladio.g:554:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:555:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:555:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:556:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplepalladio.g:577:3: (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimplepalladio.g:578:4: otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getRequiredInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSimplepalladio.g:586:4: ( ( ruleEString ) )
                    // InternalSimplepalladio.g:587:5: ( ruleEString )
                    {
                    // InternalSimplepalladio.g:587:5: ( ruleEString )
                    // InternalSimplepalladio.g:588:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplepalladio.g:602:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:603:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSimplepalladio.g:607:5: ( ( ruleEString ) )
                    	    // InternalSimplepalladio.g:608:6: ( ruleEString )
                    	    {
                    	    // InternalSimplepalladio.g:608:6: ( ruleEString )
                    	    // InternalSimplepalladio.g:609:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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

                    otherlv_8=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getProvidedInterfacesKeyword_4());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5());
            		
            // InternalSimplepalladio.g:637:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:638:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:638:4: ( ruleEString )
            // InternalSimplepalladio.g:639:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:653:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimplepalladio.g:654:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSimplepalladio.g:658:4: ( ( ruleEString ) )
            	    // InternalSimplepalladio.g:659:5: ( ruleEString )
            	    {
            	    // InternalSimplepalladio.g:659:5: ( ruleEString )
            	    // InternalSimplepalladio.g:660:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositeComponentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8());
            		
            otherlv_15=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getSystemKeyword_9());
            		
            // InternalSimplepalladio.g:683:3: ( ( ruleQualifiedName ) )
            // InternalSimplepalladio.g:684:4: ( ruleQualifiedName )
            {
            // InternalSimplepalladio.g:684:4: ( ruleQualifiedName )
            // InternalSimplepalladio.g:685:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getSystemSystemCrossReference_10_0());
            				
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:707:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalSimplepalladio.g:707:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalSimplepalladio.g:708:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalSimplepalladio.g:714:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalSimplepalladio.g:720:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalSimplepalladio.g:721:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalSimplepalladio.g:721:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalSimplepalladio.g:722:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnValue' ( (lv_returnValue_4_0= ruleType ) ) (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalSimplepalladio.g:726:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:727:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:727:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:728:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnValueKeyword_3());
            		
            // InternalSimplepalladio.g:753:3: ( (lv_returnValue_4_0= ruleType ) )
            // InternalSimplepalladio.g:754:4: (lv_returnValue_4_0= ruleType )
            {
            // InternalSimplepalladio.g:754:4: (lv_returnValue_4_0= ruleType )
            // InternalSimplepalladio.g:755:5: lv_returnValue_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnValueTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_returnValue_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"returnValue",
            						lv_returnValue_4_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:772:3: (otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimplepalladio.g:773:4: otherlv_5= 'parameters' otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,11,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSimplepalladio.g:781:4: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalSimplepalladio.g:782:5: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalSimplepalladio.g:782:5: (lv_parameters_7_0= ruleParameter )
                    // InternalSimplepalladio.g:783:6: lv_parameters_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_7_0,
                    							"org.xtext.mdsm.simplePalladio.Simplepalladio.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplepalladio.g:800:4: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:801:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSimplepalladio.g:805:5: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalSimplepalladio.g:806:6: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalSimplepalladio.g:806:6: (lv_parameters_9_0= ruleParameter )
                    	    // InternalSimplepalladio.g:807:7: lv_parameters_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_9_0,
                    	    								"org.xtext.mdsm.simplePalladio.Simplepalladio.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:838:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSimplepalladio.g:838:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSimplepalladio.g:839:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalSimplepalladio.g:845:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' ) ;
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
            // InternalSimplepalladio.g:851:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' ) )
            // InternalSimplepalladio.g:852:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' )
            {
            // InternalSimplepalladio.g:852:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}' )
            // InternalSimplepalladio.g:853:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'services' otherlv_16= '{' ( (lv_services_17_0= ruleService ) ) (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )* otherlv_20= '}' otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalSimplepalladio.g:857:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:858:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:858:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:859:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplepalladio.g:880:3: (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimplepalladio.g:881:4: otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getRequiredInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSimplepalladio.g:889:4: ( ( ruleEString ) )
                    // InternalSimplepalladio.g:890:5: ( ruleEString )
                    {
                    // InternalSimplepalladio.g:890:5: ( ruleEString )
                    // InternalSimplepalladio.g:891:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplepalladio.g:905:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:906:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSimplepalladio.g:910:5: ( ( ruleEString ) )
                    	    // InternalSimplepalladio.g:911:6: ( ruleEString )
                    	    {
                    	    // InternalSimplepalladio.g:911:6: ( ruleEString )
                    	    // InternalSimplepalladio.g:912:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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

                    otherlv_8=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getProvidedInterfacesKeyword_4());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_5());
            		
            // InternalSimplepalladio.g:940:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:941:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:941:4: ( ruleEString )
            // InternalSimplepalladio.g:942:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:956:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSimplepalladio.g:957:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSimplepalladio.g:961:4: ( ( ruleEString ) )
            	    // InternalSimplepalladio.g:962:5: ( ruleEString )
            	    {
            	    // InternalSimplepalladio.g:962:5: ( ruleEString )
            	    // InternalSimplepalladio.g:963:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getRightParenthesisKeyword_8());
            		
            otherlv_15=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getServicesKeyword_9());
            		
            otherlv_16=(Token)match(input,11,FOLLOW_25); 

            			newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSimplepalladio.g:990:3: ( (lv_services_17_0= ruleService ) )
            // InternalSimplepalladio.g:991:4: (lv_services_17_0= ruleService )
            {
            // InternalSimplepalladio.g:991:4: (lv_services_17_0= ruleService )
            // InternalSimplepalladio.g:992:5: lv_services_17_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_services_17_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"services",
            						lv_services_17_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:1009:3: (otherlv_18= ',' ( (lv_services_19_0= ruleService ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSimplepalladio.g:1010:4: otherlv_18= ',' ( (lv_services_19_0= ruleService ) )
            	    {
            	    otherlv_18=(Token)match(input,15,FOLLOW_25); 

            	    				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalSimplepalladio.g:1014:4: ( (lv_services_19_0= ruleService ) )
            	    // InternalSimplepalladio.g:1015:5: (lv_services_19_0= ruleService )
            	    {
            	    // InternalSimplepalladio.g:1015:5: (lv_services_19_0= ruleService )
            	    // InternalSimplepalladio.g:1016:6: lv_services_19_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_services_19_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"services",
            	    							lv_services_19_0,
            	    							"org.xtext.mdsm.simplePalladio.Simplepalladio.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_20=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_20, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_21=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:1046:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSimplepalladio.g:1046:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSimplepalladio.g:1047:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSimplepalladio.g:1053:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) ;
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
            // InternalSimplepalladio.g:1059:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' ) )
            // InternalSimplepalladio.g:1060:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            {
            // InternalSimplepalladio.g:1060:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}' )
            // InternalSimplepalladio.g:1061:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalSimplepalladio.g:1065:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:1066:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:1066:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:1067:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalSimplepalladio.g:1092:3: ( (lv_type_4_0= ruleType ) )
            // InternalSimplepalladio.g:1093:4: (lv_type_4_0= ruleType )
            {
            // InternalSimplepalladio.g:1093:4: (lv_type_4_0= ruleType )
            // InternalSimplepalladio.g:1094:5: lv_type_4_0= ruleType
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
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:1119:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalSimplepalladio.g:1119:48: (iv_ruleService= ruleService EOF )
            // InternalSimplepalladio.g:1120:2: iv_ruleService= ruleService EOF
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
    // InternalSimplepalladio.g:1126:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' ) ;
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
            // InternalSimplepalladio.g:1132:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' ) )
            // InternalSimplepalladio.g:1133:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' )
            {
            // InternalSimplepalladio.g:1133:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}' )
            // InternalSimplepalladio.g:1134:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= 'behaviourDescription' ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getSignatureKeyword_2());
            		
            // InternalSimplepalladio.g:1146:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:1147:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:1147:4: ( ruleEString )
            // InternalSimplepalladio.g:1148:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getSignatureSignatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getBehaviourDescriptionKeyword_4());
            		
            // InternalSimplepalladio.g:1166:3: ( (lv_behaviourDescription_5_0= ruleBehaviourDescription ) )
            // InternalSimplepalladio.g:1167:4: (lv_behaviourDescription_5_0= ruleBehaviourDescription )
            {
            // InternalSimplepalladio.g:1167:4: (lv_behaviourDescription_5_0= ruleBehaviourDescription )
            // InternalSimplepalladio.g:1168:5: lv_behaviourDescription_5_0= ruleBehaviourDescription
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
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.BehaviourDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:1193:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalSimplepalladio.g:1193:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalSimplepalladio.g:1194:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
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
    // InternalSimplepalladio.g:1200:1: ruleBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
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
            // InternalSimplepalladio.g:1206:2: ( ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSimplepalladio.g:1207:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSimplepalladio.g:1207:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSimplepalladio.g:1208:3: () otherlv_1= 'BehaviourDescription' otherlv_2= '{' otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            // InternalSimplepalladio.g:1208:3: ()
            // InternalSimplepalladio.g:1209:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsKeyword_3());
            		
            otherlv_4=(Token)match(input,11,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSimplepalladio.g:1231:3: ( (lv_behaviorElements_5_0= ruleBehaviorElement ) )
            // InternalSimplepalladio.g:1232:4: (lv_behaviorElements_5_0= ruleBehaviorElement )
            {
            // InternalSimplepalladio.g:1232:4: (lv_behaviorElements_5_0= ruleBehaviorElement )
            // InternalSimplepalladio.g:1233:5: lv_behaviorElements_5_0= ruleBehaviorElement
            {

            					newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_behaviorElements_5_0=ruleBehaviorElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
            					}
            					add(
            						current,
            						"behaviorElements",
            						lv_behaviorElements_5_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.BehaviorElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:1250:3: (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSimplepalladio.g:1251:4: otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_31); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSimplepalladio.g:1255:4: ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
            	    // InternalSimplepalladio.g:1256:5: (lv_behaviorElements_7_0= ruleBehaviorElement )
            	    {
            	    // InternalSimplepalladio.g:1256:5: (lv_behaviorElements_7_0= ruleBehaviorElement )
            	    // InternalSimplepalladio.g:1257:6: lv_behaviorElements_7_0= ruleBehaviorElement
            	    {

            	    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_behaviorElements_7_0=ruleBehaviorElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"behaviorElements",
            	    							lv_behaviorElements_7_0,
            	    							"org.xtext.mdsm.simplePalladio.Simplepalladio.BehaviorElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_8=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalSimplepalladio.g:1287:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalSimplepalladio.g:1287:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalSimplepalladio.g:1288:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalSimplepalladio.g:1294:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSimplepalladio.g:1300:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalSimplepalladio.g:1301:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalSimplepalladio.g:1301:2: ( () otherlv_1= 'InternalAction' )
            // InternalSimplepalladio.g:1302:3: () otherlv_1= 'InternalAction'
            {
            // InternalSimplepalladio.g:1302:3: ()
            // InternalSimplepalladio.g:1303:4: 
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
    // InternalSimplepalladio.g:1317:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalSimplepalladio.g:1317:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalSimplepalladio.g:1318:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalSimplepalladio.g:1324:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSimplepalladio.g:1330:2: ( (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalSimplepalladio.g:1331:2: (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalSimplepalladio.g:1331:2: (otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalSimplepalladio.g:1332:3: otherlv_0= 'ExternalCall' otherlv_1= '{' otherlv_2= 'signature' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getExternalCallKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getSignatureKeyword_2());
            		
            // InternalSimplepalladio.g:1344:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:1345:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:1345:4: ( ruleEString )
            // InternalSimplepalladio.g:1346:5: ruleEString
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

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:1368:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalSimplepalladio.g:1368:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalSimplepalladio.g:1369:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalSimplepalladio.g:1375:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
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
            // InternalSimplepalladio.g:1381:2: ( ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSimplepalladio.g:1382:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSimplepalladio.g:1382:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSimplepalladio.g:1383:3: () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSimplepalladio.g:1383:3: ()
            // InternalSimplepalladio.g:1384:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplepalladio.g:1398:3: (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSimplepalladio.g:1399:4: otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getBehaviorElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,11,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSimplepalladio.g:1407:4: ( (lv_behaviorElements_5_0= ruleBehaviorElement ) )
                    // InternalSimplepalladio.g:1408:5: (lv_behaviorElements_5_0= ruleBehaviorElement )
                    {
                    // InternalSimplepalladio.g:1408:5: (lv_behaviorElements_5_0= ruleBehaviorElement )
                    // InternalSimplepalladio.g:1409:6: lv_behaviorElements_5_0= ruleBehaviorElement
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_behaviorElements_5_0=ruleBehaviorElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"behaviorElements",
                    							lv_behaviorElements_5_0,
                    							"org.xtext.mdsm.simplePalladio.Simplepalladio.BehaviorElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplepalladio.g:1426:4: (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:1427:5: otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_31); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSimplepalladio.g:1431:5: ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
                    	    // InternalSimplepalladio.g:1432:6: (lv_behaviorElements_7_0= ruleBehaviorElement )
                    	    {
                    	    // InternalSimplepalladio.g:1432:6: (lv_behaviorElements_7_0= ruleBehaviorElement )
                    	    // InternalSimplepalladio.g:1433:7: lv_behaviorElements_7_0= ruleBehaviorElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_behaviorElements_7_0=ruleBehaviorElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviorElements",
                    	    								lv_behaviorElements_7_0,
                    	    								"org.xtext.mdsm.simplePalladio.Simplepalladio.BehaviorElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:1464:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalSimplepalladio.g:1464:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalSimplepalladio.g:1465:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalSimplepalladio.g:1471:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBranch() throws RecognitionException {
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
            // InternalSimplepalladio.g:1477:2: ( ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSimplepalladio.g:1478:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSimplepalladio.g:1478:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSimplepalladio.g:1479:3: () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSimplepalladio.g:1479:3: ()
            // InternalSimplepalladio.g:1480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplepalladio.g:1494:3: (otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSimplepalladio.g:1495:4: otherlv_3= 'behaviorElements' otherlv_4= '{' ( (lv_behaviorElements_5_0= ruleBehaviorElement ) ) (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getBehaviorElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,11,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSimplepalladio.g:1503:4: ( (lv_behaviorElements_5_0= ruleBehaviorElement ) )
                    // InternalSimplepalladio.g:1504:5: (lv_behaviorElements_5_0= ruleBehaviorElement )
                    {
                    // InternalSimplepalladio.g:1504:5: (lv_behaviorElements_5_0= ruleBehaviorElement )
                    // InternalSimplepalladio.g:1505:6: lv_behaviorElements_5_0= ruleBehaviorElement
                    {

                    						newCompositeNode(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_behaviorElements_5_0=ruleBehaviorElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchRule());
                    						}
                    						add(
                    							current,
                    							"behaviorElements",
                    							lv_behaviorElements_5_0,
                    							"org.xtext.mdsm.simplePalladio.Simplepalladio.BehaviorElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplepalladio.g:1522:4: (otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:1523:5: otherlv_6= ',' ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_31); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSimplepalladio.g:1527:5: ( (lv_behaviorElements_7_0= ruleBehaviorElement ) )
                    	    // InternalSimplepalladio.g:1528:6: (lv_behaviorElements_7_0= ruleBehaviorElement )
                    	    {
                    	    // InternalSimplepalladio.g:1528:6: (lv_behaviorElements_7_0= ruleBehaviorElement )
                    	    // InternalSimplepalladio.g:1529:7: lv_behaviorElements_7_0= ruleBehaviorElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_behaviorElements_7_0=ruleBehaviorElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviorElements",
                    	    								lv_behaviorElements_7_0,
                    	    								"org.xtext.mdsm.simplePalladio.Simplepalladio.BehaviorElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAssemblyViewType"
    // InternalSimplepalladio.g:1560:1: entryRuleAssemblyViewType returns [EObject current=null] : iv_ruleAssemblyViewType= ruleAssemblyViewType EOF ;
    public final EObject entryRuleAssemblyViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyViewType = null;


        try {
            // InternalSimplepalladio.g:1560:57: (iv_ruleAssemblyViewType= ruleAssemblyViewType EOF )
            // InternalSimplepalladio.g:1561:2: iv_ruleAssemblyViewType= ruleAssemblyViewType EOF
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
    // InternalSimplepalladio.g:1567:1: ruleAssemblyViewType returns [EObject current=null] : (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalSimplepalladio.g:1573:2: ( (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalSimplepalladio.g:1574:2: (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalSimplepalladio.g:1574:2: (otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalSimplepalladio.g:1575:3: otherlv_0= 'AssemblyViewType' otherlv_1= '{' otherlv_2= 'systems' otherlv_3= '{' ( (lv_systems_4_0= ruleSystem ) ) (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyViewTypeAccess().getAssemblyViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyViewTypeAccess().getSystemsKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplepalladio.g:1591:3: ( (lv_systems_4_0= ruleSystem ) )
            // InternalSimplepalladio.g:1592:4: (lv_systems_4_0= ruleSystem )
            {
            // InternalSimplepalladio.g:1592:4: (lv_systems_4_0= ruleSystem )
            // InternalSimplepalladio.g:1593:5: lv_systems_4_0= ruleSystem
            {

            					newCompositeNode(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_systems_4_0=ruleSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyViewTypeRule());
            					}
            					add(
            						current,
            						"systems",
            						lv_systems_4_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.System");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:1610:3: (otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSimplepalladio.g:1611:4: otherlv_5= ',' ( (lv_systems_6_0= ruleSystem ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_34); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAssemblyViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSimplepalladio.g:1615:4: ( (lv_systems_6_0= ruleSystem ) )
            	    // InternalSimplepalladio.g:1616:5: (lv_systems_6_0= ruleSystem )
            	    {
            	    // InternalSimplepalladio.g:1616:5: (lv_systems_6_0= ruleSystem )
            	    // InternalSimplepalladio.g:1617:6: lv_systems_6_0= ruleSystem
            	    {

            	    						newCompositeNode(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_systems_6_0=ruleSystem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssemblyViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"systems",
            	    							lv_systems_6_0,
            	    							"org.xtext.mdsm.simplePalladio.Simplepalladio.System");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:1647:1: entryRuleAbstractSystemElement returns [EObject current=null] : iv_ruleAbstractSystemElement= ruleAbstractSystemElement EOF ;
    public final EObject entryRuleAbstractSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSystemElement = null;


        try {
            // InternalSimplepalladio.g:1647:62: (iv_ruleAbstractSystemElement= ruleAbstractSystemElement EOF )
            // InternalSimplepalladio.g:1648:2: iv_ruleAbstractSystemElement= ruleAbstractSystemElement EOF
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
    // InternalSimplepalladio.g:1654:1: ruleAbstractSystemElement returns [EObject current=null] : (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector ) ;
    public final EObject ruleAbstractSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_AssemblyContext_0 = null;

        EObject this_Role_1 = null;

        EObject this_DelegationConnector_2 = null;

        EObject this_AssemblyConnector_3 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:1660:2: ( (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector ) )
            // InternalSimplepalladio.g:1661:2: (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector )
            {
            // InternalSimplepalladio.g:1661:2: (this_AssemblyContext_0= ruleAssemblyContext | this_Role_1= ruleRole | this_DelegationConnector_2= ruleDelegationConnector | this_AssemblyConnector_3= ruleAssemblyConnector )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt23=1;
                }
                break;
            case 48:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            case 52:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSimplepalladio.g:1662:3: this_AssemblyContext_0= ruleAssemblyContext
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
                    // InternalSimplepalladio.g:1671:3: this_Role_1= ruleRole
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
                    // InternalSimplepalladio.g:1680:3: this_DelegationConnector_2= ruleDelegationConnector
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
                    // InternalSimplepalladio.g:1689:3: this_AssemblyConnector_3= ruleAssemblyConnector
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
    // InternalSimplepalladio.g:1701:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalSimplepalladio.g:1701:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalSimplepalladio.g:1702:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalSimplepalladio.g:1708:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'systemElements' otherlv_16= '{' ( (lv_systemElements_17_0= ruleAbstractSystemElement ) ) (otherlv_18= ',' ( (lv_systemElements_19_0= ruleAbstractSystemElement ) ) )* otherlv_20= '}' otherlv_21= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
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

        EObject lv_systemElements_17_0 = null;

        EObject lv_systemElements_19_0 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:1714:2: ( (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'systemElements' otherlv_16= '{' ( (lv_systemElements_17_0= ruleAbstractSystemElement ) ) (otherlv_18= ',' ( (lv_systemElements_19_0= ruleAbstractSystemElement ) ) )* otherlv_20= '}' otherlv_21= '}' ) )
            // InternalSimplepalladio.g:1715:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'systemElements' otherlv_16= '{' ( (lv_systemElements_17_0= ruleAbstractSystemElement ) ) (otherlv_18= ',' ( (lv_systemElements_19_0= ruleAbstractSystemElement ) ) )* otherlv_20= '}' otherlv_21= '}' )
            {
            // InternalSimplepalladio.g:1715:2: (otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'systemElements' otherlv_16= '{' ( (lv_systemElements_17_0= ruleAbstractSystemElement ) ) (otherlv_18= ',' ( (lv_systemElements_19_0= ruleAbstractSystemElement ) ) )* otherlv_20= '}' otherlv_21= '}' )
            // InternalSimplepalladio.g:1716:3: otherlv_0= 'System' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'providedInterfaces' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= 'systemElements' otherlv_16= '{' ( (lv_systemElements_17_0= ruleAbstractSystemElement ) ) (otherlv_18= ',' ( (lv_systemElements_19_0= ruleAbstractSystemElement ) ) )* otherlv_20= '}' otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalSimplepalladio.g:1720:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:1721:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:1721:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:1722:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplepalladio.g:1743:3: (otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSimplepalladio.g:1744:4: otherlv_3= 'requiredInterfaces' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getRequiredInterfacesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSimplepalladio.g:1752:4: ( ( ruleEString ) )
                    // InternalSimplepalladio.g:1753:5: ( ruleEString )
                    {
                    // InternalSimplepalladio.g:1753:5: ( ruleEString )
                    // InternalSimplepalladio.g:1754:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplepalladio.g:1768:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:1769:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSimplepalladio.g:1773:5: ( ( ruleEString ) )
                    	    // InternalSimplepalladio.g:1774:6: ( ruleEString )
                    	    {
                    	    // InternalSimplepalladio.g:1774:6: ( ruleEString )
                    	    // InternalSimplepalladio.g:1775:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSystemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_4());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_5());
            		
            // InternalSimplepalladio.g:1803:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:1804:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:1804:4: ( ruleEString )
            // InternalSimplepalladio.g:1805:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:1819:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSimplepalladio.g:1820:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSimplepalladio.g:1824:4: ( ( ruleEString ) )
            	    // InternalSimplepalladio.g:1825:5: ( ruleEString )
            	    {
            	    // InternalSimplepalladio.g:1825:5: ( ruleEString )
            	    // InternalSimplepalladio.g:1826:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_35); 

            			newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getRightParenthesisKeyword_8());
            		
            otherlv_15=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getSystemElementsKeyword_9());
            		
            otherlv_16=(Token)match(input,11,FOLLOW_36); 

            			newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSimplepalladio.g:1853:3: ( (lv_systemElements_17_0= ruleAbstractSystemElement ) )
            // InternalSimplepalladio.g:1854:4: (lv_systemElements_17_0= ruleAbstractSystemElement )
            {
            // InternalSimplepalladio.g:1854:4: (lv_systemElements_17_0= ruleAbstractSystemElement )
            // InternalSimplepalladio.g:1855:5: lv_systemElements_17_0= ruleAbstractSystemElement
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_systemElements_17_0=ruleAbstractSystemElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					add(
            						current,
            						"systemElements",
            						lv_systemElements_17_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.AbstractSystemElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:1872:3: (otherlv_18= ',' ( (lv_systemElements_19_0= ruleAbstractSystemElement ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSimplepalladio.g:1873:4: otherlv_18= ',' ( (lv_systemElements_19_0= ruleAbstractSystemElement ) )
            	    {
            	    otherlv_18=(Token)match(input,15,FOLLOW_36); 

            	    				newLeafNode(otherlv_18, grammarAccess.getSystemAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalSimplepalladio.g:1877:4: ( (lv_systemElements_19_0= ruleAbstractSystemElement ) )
            	    // InternalSimplepalladio.g:1878:5: (lv_systemElements_19_0= ruleAbstractSystemElement )
            	    {
            	    // InternalSimplepalladio.g:1878:5: (lv_systemElements_19_0= ruleAbstractSystemElement )
            	    // InternalSimplepalladio.g:1879:6: lv_systemElements_19_0= ruleAbstractSystemElement
            	    {

            	    						newCompositeNode(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_systemElements_19_0=ruleAbstractSystemElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"systemElements",
            	    							lv_systemElements_19_0,
            	    							"org.xtext.mdsm.simplePalladio.Simplepalladio.AbstractSystemElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_20=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_20, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_21=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_14());
            		

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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalSimplepalladio.g:1909:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalSimplepalladio.g:1909:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalSimplepalladio.g:1910:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalSimplepalladio.g:1916:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
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
            // InternalSimplepalladio.g:1922:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalSimplepalladio.g:1923:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalSimplepalladio.g:1923:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalSimplepalladio.g:1924:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= 'providedRoles' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalSimplepalladio.g:1928:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:1929:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:1929:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:1930:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalSimplepalladio.g:1955:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:1956:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:1956:4: ( ruleEString )
            // InternalSimplepalladio.g:1957:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentAbstractComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,46,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6());
            		
            // InternalSimplepalladio.g:1979:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:1980:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:1980:4: ( ruleEString )
            // InternalSimplepalladio.g:1981:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_7_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:1995:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSimplepalladio.g:1996:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSimplepalladio.g:2000:4: ( ( ruleEString ) )
            	    // InternalSimplepalladio.g:2001:5: ( ruleEString )
            	    {
            	    // InternalSimplepalladio.g:2001:5: ( ruleEString )
            	    // InternalSimplepalladio.g:2002:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAssemblyContextRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_39); 

            			newLeafNode(otherlv_10, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_9());
            		
            // InternalSimplepalladio.g:2021:3: (otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSimplepalladio.g:2022:4: otherlv_11= 'requiredRoles' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,47,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalSimplepalladio.g:2030:4: ( ( ruleEString ) )
                    // InternalSimplepalladio.g:2031:5: ( ruleEString )
                    {
                    // InternalSimplepalladio.g:2031:5: ( ruleEString )
                    // InternalSimplepalladio.g:2032:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplepalladio.g:2046:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:2047:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSimplepalladio.g:2051:5: ( ( ruleEString ) )
                    	    // InternalSimplepalladio.g:2052:6: ( ruleEString )
                    	    {
                    	    // InternalSimplepalladio.g:2052:6: ( ruleEString )
                    	    // InternalSimplepalladio.g:2053:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:2081:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSimplepalladio.g:2081:45: (iv_ruleRole= ruleRole EOF )
            // InternalSimplepalladio.g:2082:2: iv_ruleRole= ruleRole EOF
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
    // InternalSimplepalladio.g:2088:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:2094:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSimplepalladio.g:2095:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSimplepalladio.g:2095:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSimplepalladio.g:2096:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalSimplepalladio.g:2100:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:2101:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:2101:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:2102:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getInterfaceKeyword_3());
            		
            // InternalSimplepalladio.g:2127:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:2128:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:2128:4: ( ruleEString )
            // InternalSimplepalladio.g:2129:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSimplepalladio.g:2151:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalSimplepalladio.g:2151:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalSimplepalladio.g:2152:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
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
    // InternalSimplepalladio.g:2158:1: ruleDelegationConnector returns [EObject current=null] : (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' ( ( ruleEString ) ) otherlv_5= 'interface' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:2164:2: ( (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' ( ( ruleEString ) ) otherlv_5= 'interface' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalSimplepalladio.g:2165:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' ( ( ruleEString ) ) otherlv_5= 'interface' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalSimplepalladio.g:2165:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' ( ( ruleEString ) ) otherlv_5= 'interface' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalSimplepalladio.g:2166:3: otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' ( ( ruleEString ) ) otherlv_5= 'interface' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0());
            		
            // InternalSimplepalladio.g:2170:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:2171:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:2171:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:2172:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3());
            		
            // InternalSimplepalladio.g:2197:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:2198:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:2198:4: ( ruleEString )
            // InternalSimplepalladio.g:2199:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDelegationConnectorAccess().getInterfaceKeyword_5());
            		
            // InternalSimplepalladio.g:2217:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:2218:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:2218:4: ( ruleEString )
            // InternalSimplepalladio.g:2219:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSimplepalladio.g:2241:1: entryRuleAssemblyConnector returns [EObject current=null] : iv_ruleAssemblyConnector= ruleAssemblyConnector EOF ;
    public final EObject entryRuleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyConnector = null;


        try {
            // InternalSimplepalladio.g:2241:58: (iv_ruleAssemblyConnector= ruleAssemblyConnector EOF )
            // InternalSimplepalladio.g:2242:2: iv_ruleAssemblyConnector= ruleAssemblyConnector EOF
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
    // InternalSimplepalladio.g:2248:1: ruleAssemblyConnector returns [EObject current=null] : (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedRole' ( ( ruleEString ) ) otherlv_5= 'requiredRole' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAssemblyConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:2254:2: ( (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedRole' ( ( ruleEString ) ) otherlv_5= 'requiredRole' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalSimplepalladio.g:2255:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedRole' ( ( ruleEString ) ) otherlv_5= 'requiredRole' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalSimplepalladio.g:2255:2: (otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedRole' ( ( ruleEString ) ) otherlv_5= 'requiredRole' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalSimplepalladio.g:2256:3: otherlv_0= 'AssemblyConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'providedRole' ( ( ruleEString ) ) otherlv_5= 'requiredRole' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0());
            		
            // InternalSimplepalladio.g:2260:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:2261:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:2261:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:2262:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_3());
            		
            // InternalSimplepalladio.g:2287:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:2288:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:2288:4: ( ruleEString )
            // InternalSimplepalladio.g:2289:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_4_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_5());
            		
            // InternalSimplepalladio.g:2307:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:2308:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:2308:4: ( ruleEString )
            // InternalSimplepalladio.g:2309:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleEnvironmentViewType"
    // InternalSimplepalladio.g:2331:1: entryRuleEnvironmentViewType returns [EObject current=null] : iv_ruleEnvironmentViewType= ruleEnvironmentViewType EOF ;
    public final EObject entryRuleEnvironmentViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentViewType = null;


        try {
            // InternalSimplepalladio.g:2331:60: (iv_ruleEnvironmentViewType= ruleEnvironmentViewType EOF )
            // InternalSimplepalladio.g:2332:2: iv_ruleEnvironmentViewType= ruleEnvironmentViewType EOF
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
    // InternalSimplepalladio.g:2338:1: ruleEnvironmentViewType returns [EObject current=null] : (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalSimplepalladio.g:2344:2: ( (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalSimplepalladio.g:2345:2: (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalSimplepalladio.g:2345:2: (otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalSimplepalladio.g:2346:3: otherlv_0= 'EnvironmentViewType' otherlv_1= '{' otherlv_2= 'environmentElements' otherlv_3= '{' ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) ) (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplepalladio.g:2362:3: ( (lv_environmentElements_4_0= ruleAbstractEnvironmentElement ) )
            // InternalSimplepalladio.g:2363:4: (lv_environmentElements_4_0= ruleAbstractEnvironmentElement )
            {
            // InternalSimplepalladio.g:2363:4: (lv_environmentElements_4_0= ruleAbstractEnvironmentElement )
            // InternalSimplepalladio.g:2364:5: lv_environmentElements_4_0= ruleAbstractEnvironmentElement
            {

            					newCompositeNode(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_environmentElements_4_0=ruleAbstractEnvironmentElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentViewTypeRule());
            					}
            					add(
            						current,
            						"environmentElements",
            						lv_environmentElements_4_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.AbstractEnvironmentElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:2381:3: (otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSimplepalladio.g:2382:4: otherlv_5= ',' ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_45); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSimplepalladio.g:2386:4: ( (lv_environmentElements_6_0= ruleAbstractEnvironmentElement ) )
            	    // InternalSimplepalladio.g:2387:5: (lv_environmentElements_6_0= ruleAbstractEnvironmentElement )
            	    {
            	    // InternalSimplepalladio.g:2387:5: (lv_environmentElements_6_0= ruleAbstractEnvironmentElement )
            	    // InternalSimplepalladio.g:2388:6: lv_environmentElements_6_0= ruleAbstractEnvironmentElement
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_environmentElements_6_0=ruleAbstractEnvironmentElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environmentElements",
            	    							lv_environmentElements_6_0,
            	    							"org.xtext.mdsm.simplePalladio.Simplepalladio.AbstractEnvironmentElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:2418:1: entryRuleAbstractEnvironmentElement returns [EObject current=null] : iv_ruleAbstractEnvironmentElement= ruleAbstractEnvironmentElement EOF ;
    public final EObject entryRuleAbstractEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEnvironmentElement = null;


        try {
            // InternalSimplepalladio.g:2418:67: (iv_ruleAbstractEnvironmentElement= ruleAbstractEnvironmentElement EOF )
            // InternalSimplepalladio.g:2419:2: iv_ruleAbstractEnvironmentElement= ruleAbstractEnvironmentElement EOF
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
    // InternalSimplepalladio.g:2425:1: ruleAbstractEnvironmentElement returns [EObject current=null] : (this_Container_0= ruleContainer | this_Link_1= ruleLink ) ;
    public final EObject ruleAbstractEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Link_1 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:2431:2: ( (this_Container_0= ruleContainer | this_Link_1= ruleLink ) )
            // InternalSimplepalladio.g:2432:2: (this_Container_0= ruleContainer | this_Link_1= ruleLink )
            {
            // InternalSimplepalladio.g:2432:2: (this_Container_0= ruleContainer | this_Link_1= ruleLink )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==57) ) {
                alt32=1;
            }
            else if ( (LA32_0==58) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSimplepalladio.g:2433:3: this_Container_0= ruleContainer
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
                    // InternalSimplepalladio.g:2442:3: this_Link_1= ruleLink
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


    // $ANTLR start "entryRuleContainer"
    // InternalSimplepalladio.g:2454:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSimplepalladio.g:2454:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalSimplepalladio.g:2455:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalSimplepalladio.g:2461:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSimplepalladio.g:2467:2: ( ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSimplepalladio.g:2468:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSimplepalladio.g:2468:2: ( () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSimplepalladio.g:2469:3: () otherlv_1= 'Container' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSimplepalladio.g:2469:3: ()
            // InternalSimplepalladio.g:2470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalSimplepalladio.g:2480:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimplepalladio.g:2481:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimplepalladio.g:2481:4: (lv_name_2_0= ruleEString )
            // InternalSimplepalladio.g:2482:5: lv_name_2_0= ruleEString
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
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
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
    // InternalSimplepalladio.g:2503:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalSimplepalladio.g:2503:45: (iv_ruleLink= ruleLink EOF )
            // InternalSimplepalladio.g:2504:2: iv_ruleLink= ruleLink EOF
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
    // InternalSimplepalladio.g:2510:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalSimplepalladio.g:2516:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' ) )
            // InternalSimplepalladio.g:2517:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalSimplepalladio.g:2517:2: (otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}' )
            // InternalSimplepalladio.g:2518:3: otherlv_0= 'Link' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )+ otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalSimplepalladio.g:2522:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSimplepalladio.g:2523:4: (lv_name_1_0= ruleEString )
            {
            // InternalSimplepalladio.g:2523:4: (lv_name_1_0= ruleEString )
            // InternalSimplepalladio.g:2524:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSimplepalladio.g:2553:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:2554:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:2554:4: ( ruleEString )
            // InternalSimplepalladio.g:2555:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_47);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:2569:3: (otherlv_6= ',' ( ( ruleEString ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==15) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSimplepalladio.g:2570:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSimplepalladio.g:2574:4: ( ( ruleEString ) )
            	    // InternalSimplepalladio.g:2575:5: ( ruleEString )
            	    {
            	    // InternalSimplepalladio.g:2575:5: ( ruleEString )
            	    // InternalSimplepalladio.g:2576:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAllocationViewType"
    // InternalSimplepalladio.g:2603:1: entryRuleAllocationViewType returns [EObject current=null] : iv_ruleAllocationViewType= ruleAllocationViewType EOF ;
    public final EObject entryRuleAllocationViewType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationViewType = null;


        try {
            // InternalSimplepalladio.g:2603:59: (iv_ruleAllocationViewType= ruleAllocationViewType EOF )
            // InternalSimplepalladio.g:2604:2: iv_ruleAllocationViewType= ruleAllocationViewType EOF
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
    // InternalSimplepalladio.g:2610:1: ruleAllocationViewType returns [EObject current=null] : (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalSimplepalladio.g:2616:2: ( (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalSimplepalladio.g:2617:2: (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalSimplepalladio.g:2617:2: (otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalSimplepalladio.g:2618:3: otherlv_0= 'AllocationViewType' otherlv_1= '{' otherlv_2= 'allocationContexts' otherlv_3= '{' ( (lv_allocationContexts_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationViewTypeAccess().getAllocationViewTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,61,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationViewTypeAccess().getAllocationContextsKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimplepalladio.g:2634:3: ( (lv_allocationContexts_4_0= ruleAllocationContext ) )
            // InternalSimplepalladio.g:2635:4: (lv_allocationContexts_4_0= ruleAllocationContext )
            {
            // InternalSimplepalladio.g:2635:4: (lv_allocationContexts_4_0= ruleAllocationContext )
            // InternalSimplepalladio.g:2636:5: lv_allocationContexts_4_0= ruleAllocationContext
            {

            					newCompositeNode(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_allocationContexts_4_0=ruleAllocationContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationViewTypeRule());
            					}
            					add(
            						current,
            						"allocationContexts",
            						lv_allocationContexts_4_0,
            						"org.xtext.mdsm.simplePalladio.Simplepalladio.AllocationContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplepalladio.g:2653:3: (otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==15) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSimplepalladio.g:2654:4: otherlv_5= ',' ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_49); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAllocationViewTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSimplepalladio.g:2658:4: ( (lv_allocationContexts_6_0= ruleAllocationContext ) )
            	    // InternalSimplepalladio.g:2659:5: (lv_allocationContexts_6_0= ruleAllocationContext )
            	    {
            	    // InternalSimplepalladio.g:2659:5: (lv_allocationContexts_6_0= ruleAllocationContext )
            	    // InternalSimplepalladio.g:2660:6: lv_allocationContexts_6_0= ruleAllocationContext
            	    {

            	    						newCompositeNode(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_allocationContexts_6_0=ruleAllocationContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAllocationViewTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"allocationContexts",
            	    							lv_allocationContexts_6_0,
            	    							"org.xtext.mdsm.simplePalladio.Simplepalladio.AllocationContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_2); 

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
    // InternalSimplepalladio.g:2690:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalSimplepalladio.g:2690:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalSimplepalladio.g:2691:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalSimplepalladio.g:2697:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSimplepalladio.g:2703:2: ( (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) )
            // InternalSimplepalladio.g:2704:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            {
            // InternalSimplepalladio.g:2704:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            // InternalSimplepalladio.g:2705:3: otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assembly' ( ( ruleQualifiedName ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,63,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getContainerKeyword_2());
            		
            // InternalSimplepalladio.g:2717:3: ( ( ruleEString ) )
            // InternalSimplepalladio.g:2718:4: ( ruleEString )
            {
            // InternalSimplepalladio.g:2718:4: ( ruleEString )
            // InternalSimplepalladio.g:2719:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,64,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getAssemblyKeyword_4());
            		
            // InternalSimplepalladio.g:2737:3: ( ( ruleQualifiedName ) )
            // InternalSimplepalladio.g:2738:4: ( ruleQualifiedName )
            {
            // InternalSimplepalladio.g:2738:4: ( ruleQualifiedName )
            // InternalSimplepalladio.g:2739:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSimplepalladio.g:2761:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSimplepalladio.g:2761:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSimplepalladio.g:2762:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSimplepalladio.g:2768:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSimplepalladio.g:2774:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSimplepalladio.g:2775:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSimplepalladio.g:2775:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSimplepalladio.g:2776:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_52); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSimplepalladio.g:2783:3: (kw= '.' this_ID_2= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==65) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSimplepalladio.g:2784:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,65,FOLLOW_19); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleType"
    // InternalSimplepalladio.g:2801:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) ) ;
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
            // InternalSimplepalladio.g:2807:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) ) )
            // InternalSimplepalladio.g:2808:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) )
            {
            // InternalSimplepalladio.g:2808:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'CHAR' ) | (enumLiteral_3= 'DATE' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'LIST' ) | (enumLiteral_7= 'INT' ) | (enumLiteral_8= 'LONG' ) | (enumLiteral_9= 'MAP' ) | (enumLiteral_10= 'STRING' ) )
            int alt36=11;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt36=1;
                }
                break;
            case 67:
                {
                alt36=2;
                }
                break;
            case 68:
                {
                alt36=3;
                }
                break;
            case 69:
                {
                alt36=4;
                }
                break;
            case 70:
                {
                alt36=5;
                }
                break;
            case 71:
                {
                alt36=6;
                }
                break;
            case 72:
                {
                alt36=7;
                }
                break;
            case 73:
                {
                alt36=8;
                }
                break;
            case 74:
                {
                alt36=9;
                }
                break;
            case 75:
                {
                alt36=10;
                }
                break;
            case 76:
                {
                alt36=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSimplepalladio.g:2809:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalSimplepalladio.g:2809:3: (enumLiteral_0= 'VOID' )
                    // InternalSimplepalladio.g:2810:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:2817:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalSimplepalladio.g:2817:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalSimplepalladio.g:2818:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplepalladio.g:2825:3: (enumLiteral_2= 'CHAR' )
                    {
                    // InternalSimplepalladio.g:2825:3: (enumLiteral_2= 'CHAR' )
                    // InternalSimplepalladio.g:2826:4: enumLiteral_2= 'CHAR'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplepalladio.g:2833:3: (enumLiteral_3= 'DATE' )
                    {
                    // InternalSimplepalladio.g:2833:3: (enumLiteral_3= 'DATE' )
                    // InternalSimplepalladio.g:2834:4: enumLiteral_3= 'DATE'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimplepalladio.g:2841:3: (enumLiteral_4= 'DOUBLE' )
                    {
                    // InternalSimplepalladio.g:2841:3: (enumLiteral_4= 'DOUBLE' )
                    // InternalSimplepalladio.g:2842:4: enumLiteral_4= 'DOUBLE'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimplepalladio.g:2849:3: (enumLiteral_5= 'FLOAT' )
                    {
                    // InternalSimplepalladio.g:2849:3: (enumLiteral_5= 'FLOAT' )
                    // InternalSimplepalladio.g:2850:4: enumLiteral_5= 'FLOAT'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimplepalladio.g:2857:3: (enumLiteral_6= 'LIST' )
                    {
                    // InternalSimplepalladio.g:2857:3: (enumLiteral_6= 'LIST' )
                    // InternalSimplepalladio.g:2858:4: enumLiteral_6= 'LIST'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSimplepalladio.g:2865:3: (enumLiteral_7= 'INT' )
                    {
                    // InternalSimplepalladio.g:2865:3: (enumLiteral_7= 'INT' )
                    // InternalSimplepalladio.g:2866:4: enumLiteral_7= 'INT'
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSimplepalladio.g:2873:3: (enumLiteral_8= 'LONG' )
                    {
                    // InternalSimplepalladio.g:2873:3: (enumLiteral_8= 'LONG' )
                    // InternalSimplepalladio.g:2874:4: enumLiteral_8= 'LONG'
                    {
                    enumLiteral_8=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSimplepalladio.g:2881:3: (enumLiteral_9= 'MAP' )
                    {
                    // InternalSimplepalladio.g:2881:3: (enumLiteral_9= 'MAP' )
                    // InternalSimplepalladio.g:2882:4: enumLiteral_9= 'MAP'
                    {
                    enumLiteral_9=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSimplepalladio.g:2889:3: (enumLiteral_10= 'STRING' )
                    {
                    // InternalSimplepalladio.g:2889:3: (enumLiteral_10= 'STRING' )
                    // InternalSimplepalladio.g:2890:4: enumLiteral_10= 'STRING'
                    {
                    enumLiteral_10=(Token)match(input,76,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0080010000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000009110000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FFCL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0015100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000001000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});

}