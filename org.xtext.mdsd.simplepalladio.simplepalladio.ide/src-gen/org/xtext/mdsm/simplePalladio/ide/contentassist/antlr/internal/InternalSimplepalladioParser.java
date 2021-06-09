package org.xtext.mdsm.simplePalladio.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.mdsm.simplePalladio.services.SimplepalladioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplepalladioParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VOID'", "'BOOLEAN'", "'CHAR'", "'DATE'", "'DOUBLE'", "'FLOAT'", "'LIST'", "'INT'", "'LONG'", "'MAP'", "'STRING'", "'{'", "'}'", "'RepositoryViewType'", "'repositoryElements'", "','", "'Interface'", "'signatures'", "'('", "')'", "'CompositeComponent'", "'providedInterfaces'", "'system'", "'requiredInterfaces'", "'Signature'", "'returnValue'", "'parameters'", "'Component'", "'services'", "'Parameter'", "'type'", "'Service'", "'signature'", "'behaviourDescription'", "'BehaviourDescription'", "'behaviorElements'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'AssemblyViewType'", "'systems'", "'System'", "'systemElements'", "'AssemblyContext'", "'component'", "'providedRoles'", "'requiredRoles'", "'Role'", "'interface'", "'DelegationConnector'", "'role'", "'AssemblyConnector'", "'providedRole'", "'requiredRole'", "'EnvironmentViewType'", "'environmentElements'", "'Container'", "'Link'", "'containers'", "'AllocationViewType'", "'allocationContexts'", "'AllocationContext'", "'container'", "'assembly'", "'.'"
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

    	public void setGrammarAccess(SimplepalladioGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSimplepalladio.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:54:1: ( ruleModel EOF )
            // InternalSimplepalladio.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimplepalladio.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSimplepalladio.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSimplepalladio.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSimplepalladio.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSimplepalladio.g:69:3: ( rule__Model__Group__0 )
            // InternalSimplepalladio.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRepositoryViewType"
    // InternalSimplepalladio.g:78:1: entryRuleRepositoryViewType : ruleRepositoryViewType EOF ;
    public final void entryRuleRepositoryViewType() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:79:1: ( ruleRepositoryViewType EOF )
            // InternalSimplepalladio.g:80:1: ruleRepositoryViewType EOF
            {
             before(grammarAccess.getRepositoryViewTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRepositoryViewType();

            state._fsp--;

             after(grammarAccess.getRepositoryViewTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepositoryViewType"


    // $ANTLR start "ruleRepositoryViewType"
    // InternalSimplepalladio.g:87:1: ruleRepositoryViewType : ( ( rule__RepositoryViewType__Group__0 ) ) ;
    public final void ruleRepositoryViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:91:2: ( ( ( rule__RepositoryViewType__Group__0 ) ) )
            // InternalSimplepalladio.g:92:2: ( ( rule__RepositoryViewType__Group__0 ) )
            {
            // InternalSimplepalladio.g:92:2: ( ( rule__RepositoryViewType__Group__0 ) )
            // InternalSimplepalladio.g:93:3: ( rule__RepositoryViewType__Group__0 )
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getGroup()); 
            // InternalSimplepalladio.g:94:3: ( rule__RepositoryViewType__Group__0 )
            // InternalSimplepalladio.g:94:4: rule__RepositoryViewType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryViewTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepositoryViewType"


    // $ANTLR start "entryRuleAbstractRepositoryElement"
    // InternalSimplepalladio.g:103:1: entryRuleAbstractRepositoryElement : ruleAbstractRepositoryElement EOF ;
    public final void entryRuleAbstractRepositoryElement() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:104:1: ( ruleAbstractRepositoryElement EOF )
            // InternalSimplepalladio.g:105:1: ruleAbstractRepositoryElement EOF
            {
             before(grammarAccess.getAbstractRepositoryElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractRepositoryElement();

            state._fsp--;

             after(grammarAccess.getAbstractRepositoryElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractRepositoryElement"


    // $ANTLR start "ruleAbstractRepositoryElement"
    // InternalSimplepalladio.g:112:1: ruleAbstractRepositoryElement : ( ( rule__AbstractRepositoryElement__Alternatives ) ) ;
    public final void ruleAbstractRepositoryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:116:2: ( ( ( rule__AbstractRepositoryElement__Alternatives ) ) )
            // InternalSimplepalladio.g:117:2: ( ( rule__AbstractRepositoryElement__Alternatives ) )
            {
            // InternalSimplepalladio.g:117:2: ( ( rule__AbstractRepositoryElement__Alternatives ) )
            // InternalSimplepalladio.g:118:3: ( rule__AbstractRepositoryElement__Alternatives )
            {
             before(grammarAccess.getAbstractRepositoryElementAccess().getAlternatives()); 
            // InternalSimplepalladio.g:119:3: ( rule__AbstractRepositoryElement__Alternatives )
            // InternalSimplepalladio.g:119:4: rule__AbstractRepositoryElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRepositoryElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractRepositoryElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractRepositoryElement"


    // $ANTLR start "entryRuleBehaviorElement"
    // InternalSimplepalladio.g:128:1: entryRuleBehaviorElement : ruleBehaviorElement EOF ;
    public final void entryRuleBehaviorElement() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:129:1: ( ruleBehaviorElement EOF )
            // InternalSimplepalladio.g:130:1: ruleBehaviorElement EOF
            {
             before(grammarAccess.getBehaviorElementRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviorElement();

            state._fsp--;

             after(grammarAccess.getBehaviorElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviorElement"


    // $ANTLR start "ruleBehaviorElement"
    // InternalSimplepalladio.g:137:1: ruleBehaviorElement : ( ( rule__BehaviorElement__Alternatives ) ) ;
    public final void ruleBehaviorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:141:2: ( ( ( rule__BehaviorElement__Alternatives ) ) )
            // InternalSimplepalladio.g:142:2: ( ( rule__BehaviorElement__Alternatives ) )
            {
            // InternalSimplepalladio.g:142:2: ( ( rule__BehaviorElement__Alternatives ) )
            // InternalSimplepalladio.g:143:3: ( rule__BehaviorElement__Alternatives )
            {
             before(grammarAccess.getBehaviorElementAccess().getAlternatives()); 
            // InternalSimplepalladio.g:144:3: ( rule__BehaviorElement__Alternatives )
            // InternalSimplepalladio.g:144:4: rule__BehaviorElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorElement"


    // $ANTLR start "entryRuleEString"
    // InternalSimplepalladio.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:154:1: ( ruleEString EOF )
            // InternalSimplepalladio.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimplepalladio.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSimplepalladio.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSimplepalladio.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalSimplepalladio.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSimplepalladio.g:169:3: ( rule__EString__Alternatives )
            // InternalSimplepalladio.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInterface"
    // InternalSimplepalladio.g:178:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:179:1: ( ruleInterface EOF )
            // InternalSimplepalladio.g:180:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalSimplepalladio.g:187:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:191:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalSimplepalladio.g:192:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalSimplepalladio.g:192:2: ( ( rule__Interface__Group__0 ) )
            // InternalSimplepalladio.g:193:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalSimplepalladio.g:194:3: ( rule__Interface__Group__0 )
            // InternalSimplepalladio.g:194:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalSimplepalladio.g:203:1: entryRuleCompositeComponent : ruleCompositeComponent EOF ;
    public final void entryRuleCompositeComponent() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:204:1: ( ruleCompositeComponent EOF )
            // InternalSimplepalladio.g:205:1: ruleCompositeComponent EOF
            {
             before(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeComponent();

            state._fsp--;

             after(grammarAccess.getCompositeComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalSimplepalladio.g:212:1: ruleCompositeComponent : ( ( rule__CompositeComponent__Group__0 ) ) ;
    public final void ruleCompositeComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:216:2: ( ( ( rule__CompositeComponent__Group__0 ) ) )
            // InternalSimplepalladio.g:217:2: ( ( rule__CompositeComponent__Group__0 ) )
            {
            // InternalSimplepalladio.g:217:2: ( ( rule__CompositeComponent__Group__0 ) )
            // InternalSimplepalladio.g:218:3: ( rule__CompositeComponent__Group__0 )
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup()); 
            // InternalSimplepalladio.g:219:3: ( rule__CompositeComponent__Group__0 )
            // InternalSimplepalladio.g:219:4: rule__CompositeComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleSignature"
    // InternalSimplepalladio.g:228:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:229:1: ( ruleSignature EOF )
            // InternalSimplepalladio.g:230:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalSimplepalladio.g:237:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:241:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalSimplepalladio.g:242:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalSimplepalladio.g:242:2: ( ( rule__Signature__Group__0 ) )
            // InternalSimplepalladio.g:243:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalSimplepalladio.g:244:3: ( rule__Signature__Group__0 )
            // InternalSimplepalladio.g:244:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleComponent"
    // InternalSimplepalladio.g:253:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:254:1: ( ruleComponent EOF )
            // InternalSimplepalladio.g:255:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSimplepalladio.g:262:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:266:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalSimplepalladio.g:267:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalSimplepalladio.g:267:2: ( ( rule__Component__Group__0 ) )
            // InternalSimplepalladio.g:268:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalSimplepalladio.g:269:3: ( rule__Component__Group__0 )
            // InternalSimplepalladio.g:269:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleParameter"
    // InternalSimplepalladio.g:278:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:279:1: ( ruleParameter EOF )
            // InternalSimplepalladio.g:280:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSimplepalladio.g:287:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:291:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSimplepalladio.g:292:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSimplepalladio.g:292:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSimplepalladio.g:293:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSimplepalladio.g:294:3: ( rule__Parameter__Group__0 )
            // InternalSimplepalladio.g:294:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleService"
    // InternalSimplepalladio.g:303:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:304:1: ( ruleService EOF )
            // InternalSimplepalladio.g:305:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalSimplepalladio.g:312:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:316:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalSimplepalladio.g:317:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalSimplepalladio.g:317:2: ( ( rule__Service__Group__0 ) )
            // InternalSimplepalladio.g:318:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalSimplepalladio.g:319:3: ( rule__Service__Group__0 )
            // InternalSimplepalladio.g:319:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalSimplepalladio.g:328:1: entryRuleBehaviourDescription : ruleBehaviourDescription EOF ;
    public final void entryRuleBehaviourDescription() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:329:1: ( ruleBehaviourDescription EOF )
            // InternalSimplepalladio.g:330:1: ruleBehaviourDescription EOF
            {
             before(grammarAccess.getBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getBehaviourDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviourDescription"


    // $ANTLR start "ruleBehaviourDescription"
    // InternalSimplepalladio.g:337:1: ruleBehaviourDescription : ( ( rule__BehaviourDescription__Group__0 ) ) ;
    public final void ruleBehaviourDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:341:2: ( ( ( rule__BehaviourDescription__Group__0 ) ) )
            // InternalSimplepalladio.g:342:2: ( ( rule__BehaviourDescription__Group__0 ) )
            {
            // InternalSimplepalladio.g:342:2: ( ( rule__BehaviourDescription__Group__0 ) )
            // InternalSimplepalladio.g:343:3: ( rule__BehaviourDescription__Group__0 )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getGroup()); 
            // InternalSimplepalladio.g:344:3: ( rule__BehaviourDescription__Group__0 )
            // InternalSimplepalladio.g:344:4: rule__BehaviourDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleInternalAction"
    // InternalSimplepalladio.g:353:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:354:1: ( ruleInternalAction EOF )
            // InternalSimplepalladio.g:355:1: ruleInternalAction EOF
            {
             before(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalAction();

            state._fsp--;

             after(grammarAccess.getInternalActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalSimplepalladio.g:362:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:366:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalSimplepalladio.g:367:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalSimplepalladio.g:367:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalSimplepalladio.g:368:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalSimplepalladio.g:369:3: ( rule__InternalAction__Group__0 )
            // InternalSimplepalladio.g:369:4: rule__InternalAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalSimplepalladio.g:378:1: entryRuleExternalCall : ruleExternalCall EOF ;
    public final void entryRuleExternalCall() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:379:1: ( ruleExternalCall EOF )
            // InternalSimplepalladio.g:380:1: ruleExternalCall EOF
            {
             before(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalCall();

            state._fsp--;

             after(grammarAccess.getExternalCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalSimplepalladio.g:387:1: ruleExternalCall : ( ( rule__ExternalCall__Group__0 ) ) ;
    public final void ruleExternalCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:391:2: ( ( ( rule__ExternalCall__Group__0 ) ) )
            // InternalSimplepalladio.g:392:2: ( ( rule__ExternalCall__Group__0 ) )
            {
            // InternalSimplepalladio.g:392:2: ( ( rule__ExternalCall__Group__0 ) )
            // InternalSimplepalladio.g:393:3: ( rule__ExternalCall__Group__0 )
            {
             before(grammarAccess.getExternalCallAccess().getGroup()); 
            // InternalSimplepalladio.g:394:3: ( rule__ExternalCall__Group__0 )
            // InternalSimplepalladio.g:394:4: rule__ExternalCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalSimplepalladio.g:403:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:404:1: ( ruleLoop EOF )
            // InternalSimplepalladio.g:405:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalSimplepalladio.g:412:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:416:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalSimplepalladio.g:417:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalSimplepalladio.g:417:2: ( ( rule__Loop__Group__0 ) )
            // InternalSimplepalladio.g:418:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalSimplepalladio.g:419:3: ( rule__Loop__Group__0 )
            // InternalSimplepalladio.g:419:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalSimplepalladio.g:428:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:429:1: ( ruleBranch EOF )
            // InternalSimplepalladio.g:430:1: ruleBranch EOF
            {
             before(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalSimplepalladio.g:437:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:441:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalSimplepalladio.g:442:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalSimplepalladio.g:442:2: ( ( rule__Branch__Group__0 ) )
            // InternalSimplepalladio.g:443:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalSimplepalladio.g:444:3: ( rule__Branch__Group__0 )
            // InternalSimplepalladio.g:444:4: rule__Branch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleAssemblyViewType"
    // InternalSimplepalladio.g:453:1: entryRuleAssemblyViewType : ruleAssemblyViewType EOF ;
    public final void entryRuleAssemblyViewType() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:454:1: ( ruleAssemblyViewType EOF )
            // InternalSimplepalladio.g:455:1: ruleAssemblyViewType EOF
            {
             before(grammarAccess.getAssemblyViewTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyViewType();

            state._fsp--;

             after(grammarAccess.getAssemblyViewTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssemblyViewType"


    // $ANTLR start "ruleAssemblyViewType"
    // InternalSimplepalladio.g:462:1: ruleAssemblyViewType : ( ( rule__AssemblyViewType__Group__0 ) ) ;
    public final void ruleAssemblyViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:466:2: ( ( ( rule__AssemblyViewType__Group__0 ) ) )
            // InternalSimplepalladio.g:467:2: ( ( rule__AssemblyViewType__Group__0 ) )
            {
            // InternalSimplepalladio.g:467:2: ( ( rule__AssemblyViewType__Group__0 ) )
            // InternalSimplepalladio.g:468:3: ( rule__AssemblyViewType__Group__0 )
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getGroup()); 
            // InternalSimplepalladio.g:469:3: ( rule__AssemblyViewType__Group__0 )
            // InternalSimplepalladio.g:469:4: rule__AssemblyViewType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyViewTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyViewType"


    // $ANTLR start "entryRuleAbstractSystemElement"
    // InternalSimplepalladio.g:478:1: entryRuleAbstractSystemElement : ruleAbstractSystemElement EOF ;
    public final void entryRuleAbstractSystemElement() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:479:1: ( ruleAbstractSystemElement EOF )
            // InternalSimplepalladio.g:480:1: ruleAbstractSystemElement EOF
            {
             before(grammarAccess.getAbstractSystemElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractSystemElement();

            state._fsp--;

             after(grammarAccess.getAbstractSystemElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractSystemElement"


    // $ANTLR start "ruleAbstractSystemElement"
    // InternalSimplepalladio.g:487:1: ruleAbstractSystemElement : ( ( rule__AbstractSystemElement__Alternatives ) ) ;
    public final void ruleAbstractSystemElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:491:2: ( ( ( rule__AbstractSystemElement__Alternatives ) ) )
            // InternalSimplepalladio.g:492:2: ( ( rule__AbstractSystemElement__Alternatives ) )
            {
            // InternalSimplepalladio.g:492:2: ( ( rule__AbstractSystemElement__Alternatives ) )
            // InternalSimplepalladio.g:493:3: ( rule__AbstractSystemElement__Alternatives )
            {
             before(grammarAccess.getAbstractSystemElementAccess().getAlternatives()); 
            // InternalSimplepalladio.g:494:3: ( rule__AbstractSystemElement__Alternatives )
            // InternalSimplepalladio.g:494:4: rule__AbstractSystemElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSystemElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractSystemElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractSystemElement"


    // $ANTLR start "entryRuleSystem"
    // InternalSimplepalladio.g:503:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:504:1: ( ruleSystem EOF )
            // InternalSimplepalladio.g:505:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalSimplepalladio.g:512:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:516:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalSimplepalladio.g:517:2: ( ( rule__System__Group__0 ) )
            {
            // InternalSimplepalladio.g:517:2: ( ( rule__System__Group__0 ) )
            // InternalSimplepalladio.g:518:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalSimplepalladio.g:519:3: ( rule__System__Group__0 )
            // InternalSimplepalladio.g:519:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalSimplepalladio.g:528:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:529:1: ( ruleAssemblyContext EOF )
            // InternalSimplepalladio.g:530:1: ruleAssemblyContext EOF
            {
             before(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getAssemblyContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalSimplepalladio.g:537:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:541:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalSimplepalladio.g:542:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalSimplepalladio.g:542:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalSimplepalladio.g:543:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalSimplepalladio.g:544:3: ( rule__AssemblyContext__Group__0 )
            // InternalSimplepalladio.g:544:4: rule__AssemblyContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleRole"
    // InternalSimplepalladio.g:553:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:554:1: ( ruleRole EOF )
            // InternalSimplepalladio.g:555:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSimplepalladio.g:562:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:566:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSimplepalladio.g:567:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSimplepalladio.g:567:2: ( ( rule__Role__Group__0 ) )
            // InternalSimplepalladio.g:568:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSimplepalladio.g:569:3: ( rule__Role__Group__0 )
            // InternalSimplepalladio.g:569:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalSimplepalladio.g:578:1: entryRuleDelegationConnector : ruleDelegationConnector EOF ;
    public final void entryRuleDelegationConnector() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:579:1: ( ruleDelegationConnector EOF )
            // InternalSimplepalladio.g:580:1: ruleDelegationConnector EOF
            {
             before(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDelegationConnector();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalSimplepalladio.g:587:1: ruleDelegationConnector : ( ( rule__DelegationConnector__Group__0 ) ) ;
    public final void ruleDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:591:2: ( ( ( rule__DelegationConnector__Group__0 ) ) )
            // InternalSimplepalladio.g:592:2: ( ( rule__DelegationConnector__Group__0 ) )
            {
            // InternalSimplepalladio.g:592:2: ( ( rule__DelegationConnector__Group__0 ) )
            // InternalSimplepalladio.g:593:3: ( rule__DelegationConnector__Group__0 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup()); 
            // InternalSimplepalladio.g:594:3: ( rule__DelegationConnector__Group__0 )
            // InternalSimplepalladio.g:594:4: rule__DelegationConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleAssemblyConnector"
    // InternalSimplepalladio.g:603:1: entryRuleAssemblyConnector : ruleAssemblyConnector EOF ;
    public final void entryRuleAssemblyConnector() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:604:1: ( ruleAssemblyConnector EOF )
            // InternalSimplepalladio.g:605:1: ruleAssemblyConnector EOF
            {
             before(grammarAccess.getAssemblyConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyConnector();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssemblyConnector"


    // $ANTLR start "ruleAssemblyConnector"
    // InternalSimplepalladio.g:612:1: ruleAssemblyConnector : ( ( rule__AssemblyConnector__Group__0 ) ) ;
    public final void ruleAssemblyConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:616:2: ( ( ( rule__AssemblyConnector__Group__0 ) ) )
            // InternalSimplepalladio.g:617:2: ( ( rule__AssemblyConnector__Group__0 ) )
            {
            // InternalSimplepalladio.g:617:2: ( ( rule__AssemblyConnector__Group__0 ) )
            // InternalSimplepalladio.g:618:3: ( rule__AssemblyConnector__Group__0 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getGroup()); 
            // InternalSimplepalladio.g:619:3: ( rule__AssemblyConnector__Group__0 )
            // InternalSimplepalladio.g:619:4: rule__AssemblyConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyConnector"


    // $ANTLR start "entryRuleEnvironmentViewType"
    // InternalSimplepalladio.g:628:1: entryRuleEnvironmentViewType : ruleEnvironmentViewType EOF ;
    public final void entryRuleEnvironmentViewType() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:629:1: ( ruleEnvironmentViewType EOF )
            // InternalSimplepalladio.g:630:1: ruleEnvironmentViewType EOF
            {
             before(grammarAccess.getEnvironmentViewTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentViewType();

            state._fsp--;

             after(grammarAccess.getEnvironmentViewTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnvironmentViewType"


    // $ANTLR start "ruleEnvironmentViewType"
    // InternalSimplepalladio.g:637:1: ruleEnvironmentViewType : ( ( rule__EnvironmentViewType__Group__0 ) ) ;
    public final void ruleEnvironmentViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:641:2: ( ( ( rule__EnvironmentViewType__Group__0 ) ) )
            // InternalSimplepalladio.g:642:2: ( ( rule__EnvironmentViewType__Group__0 ) )
            {
            // InternalSimplepalladio.g:642:2: ( ( rule__EnvironmentViewType__Group__0 ) )
            // InternalSimplepalladio.g:643:3: ( rule__EnvironmentViewType__Group__0 )
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getGroup()); 
            // InternalSimplepalladio.g:644:3: ( rule__EnvironmentViewType__Group__0 )
            // InternalSimplepalladio.g:644:4: rule__EnvironmentViewType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentViewTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironmentViewType"


    // $ANTLR start "entryRuleAbstractEnvironmentElement"
    // InternalSimplepalladio.g:653:1: entryRuleAbstractEnvironmentElement : ruleAbstractEnvironmentElement EOF ;
    public final void entryRuleAbstractEnvironmentElement() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:654:1: ( ruleAbstractEnvironmentElement EOF )
            // InternalSimplepalladio.g:655:1: ruleAbstractEnvironmentElement EOF
            {
             before(grammarAccess.getAbstractEnvironmentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractEnvironmentElement();

            state._fsp--;

             after(grammarAccess.getAbstractEnvironmentElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractEnvironmentElement"


    // $ANTLR start "ruleAbstractEnvironmentElement"
    // InternalSimplepalladio.g:662:1: ruleAbstractEnvironmentElement : ( ( rule__AbstractEnvironmentElement__Alternatives ) ) ;
    public final void ruleAbstractEnvironmentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:666:2: ( ( ( rule__AbstractEnvironmentElement__Alternatives ) ) )
            // InternalSimplepalladio.g:667:2: ( ( rule__AbstractEnvironmentElement__Alternatives ) )
            {
            // InternalSimplepalladio.g:667:2: ( ( rule__AbstractEnvironmentElement__Alternatives ) )
            // InternalSimplepalladio.g:668:3: ( rule__AbstractEnvironmentElement__Alternatives )
            {
             before(grammarAccess.getAbstractEnvironmentElementAccess().getAlternatives()); 
            // InternalSimplepalladio.g:669:3: ( rule__AbstractEnvironmentElement__Alternatives )
            // InternalSimplepalladio.g:669:4: rule__AbstractEnvironmentElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractEnvironmentElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractEnvironmentElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractEnvironmentElement"


    // $ANTLR start "entryRuleContainer"
    // InternalSimplepalladio.g:678:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:679:1: ( ruleContainer EOF )
            // InternalSimplepalladio.g:680:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSimplepalladio.g:687:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:691:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalSimplepalladio.g:692:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalSimplepalladio.g:692:2: ( ( rule__Container__Group__0 ) )
            // InternalSimplepalladio.g:693:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalSimplepalladio.g:694:3: ( rule__Container__Group__0 )
            // InternalSimplepalladio.g:694:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLink"
    // InternalSimplepalladio.g:703:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:704:1: ( ruleLink EOF )
            // InternalSimplepalladio.g:705:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalSimplepalladio.g:712:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:716:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalSimplepalladio.g:717:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalSimplepalladio.g:717:2: ( ( rule__Link__Group__0 ) )
            // InternalSimplepalladio.g:718:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalSimplepalladio.g:719:3: ( rule__Link__Group__0 )
            // InternalSimplepalladio.g:719:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleAllocationViewType"
    // InternalSimplepalladio.g:728:1: entryRuleAllocationViewType : ruleAllocationViewType EOF ;
    public final void entryRuleAllocationViewType() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:729:1: ( ruleAllocationViewType EOF )
            // InternalSimplepalladio.g:730:1: ruleAllocationViewType EOF
            {
             before(grammarAccess.getAllocationViewTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocationViewType();

            state._fsp--;

             after(grammarAccess.getAllocationViewTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllocationViewType"


    // $ANTLR start "ruleAllocationViewType"
    // InternalSimplepalladio.g:737:1: ruleAllocationViewType : ( ( rule__AllocationViewType__Group__0 ) ) ;
    public final void ruleAllocationViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:741:2: ( ( ( rule__AllocationViewType__Group__0 ) ) )
            // InternalSimplepalladio.g:742:2: ( ( rule__AllocationViewType__Group__0 ) )
            {
            // InternalSimplepalladio.g:742:2: ( ( rule__AllocationViewType__Group__0 ) )
            // InternalSimplepalladio.g:743:3: ( rule__AllocationViewType__Group__0 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getGroup()); 
            // InternalSimplepalladio.g:744:3: ( rule__AllocationViewType__Group__0 )
            // InternalSimplepalladio.g:744:4: rule__AllocationViewType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationViewTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocationViewType"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalSimplepalladio.g:753:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:754:1: ( ruleAllocationContext EOF )
            // InternalSimplepalladio.g:755:1: ruleAllocationContext EOF
            {
             before(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalSimplepalladio.g:762:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:766:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalSimplepalladio.g:767:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalSimplepalladio.g:767:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalSimplepalladio.g:768:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalSimplepalladio.g:769:3: ( rule__AllocationContext__Group__0 )
            // InternalSimplepalladio.g:769:4: rule__AllocationContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSimplepalladio.g:778:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSimplepalladio.g:779:1: ( ruleQualifiedName EOF )
            // InternalSimplepalladio.g:780:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSimplepalladio.g:787:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:791:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSimplepalladio.g:792:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSimplepalladio.g:792:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSimplepalladio.g:793:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSimplepalladio.g:794:3: ( rule__QualifiedName__Group__0 )
            // InternalSimplepalladio.g:794:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleType"
    // InternalSimplepalladio.g:803:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:807:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSimplepalladio.g:808:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSimplepalladio.g:808:2: ( ( rule__Type__Alternatives ) )
            // InternalSimplepalladio.g:809:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSimplepalladio.g:810:3: ( rule__Type__Alternatives )
            // InternalSimplepalladio.g:810:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__AbstractRepositoryElement__Alternatives"
    // InternalSimplepalladio.g:818:1: rule__AbstractRepositoryElement__Alternatives : ( ( ruleInterface ) | ( ruleCompositeComponent ) | ( ruleSignature ) | ( ruleComponent ) );
    public final void rule__AbstractRepositoryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:822:1: ( ( ruleInterface ) | ( ruleCompositeComponent ) | ( ruleSignature ) | ( ruleComponent ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSimplepalladio.g:823:2: ( ruleInterface )
                    {
                    // InternalSimplepalladio.g:823:2: ( ruleInterface )
                    // InternalSimplepalladio.g:824:3: ruleInterface
                    {
                     before(grammarAccess.getAbstractRepositoryElementAccess().getInterfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getAbstractRepositoryElementAccess().getInterfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:829:2: ( ruleCompositeComponent )
                    {
                    // InternalSimplepalladio.g:829:2: ( ruleCompositeComponent )
                    // InternalSimplepalladio.g:830:3: ruleCompositeComponent
                    {
                     before(grammarAccess.getAbstractRepositoryElementAccess().getCompositeComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeComponent();

                    state._fsp--;

                     after(grammarAccess.getAbstractRepositoryElementAccess().getCompositeComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplepalladio.g:835:2: ( ruleSignature )
                    {
                    // InternalSimplepalladio.g:835:2: ( ruleSignature )
                    // InternalSimplepalladio.g:836:3: ruleSignature
                    {
                     before(grammarAccess.getAbstractRepositoryElementAccess().getSignatureParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSignature();

                    state._fsp--;

                     after(grammarAccess.getAbstractRepositoryElementAccess().getSignatureParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplepalladio.g:841:2: ( ruleComponent )
                    {
                    // InternalSimplepalladio.g:841:2: ( ruleComponent )
                    // InternalSimplepalladio.g:842:3: ruleComponent
                    {
                     before(grammarAccess.getAbstractRepositoryElementAccess().getComponentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getAbstractRepositoryElementAccess().getComponentParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRepositoryElement__Alternatives"


    // $ANTLR start "rule__BehaviorElement__Alternatives"
    // InternalSimplepalladio.g:851:1: rule__BehaviorElement__Alternatives : ( ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) );
    public final void rule__BehaviorElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:855:1: ( ( ruleInternalAction ) | ( ruleExternalCall ) | ( ruleLoop ) | ( ruleBranch ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt2=1;
                }
                break;
            case 48:
                {
                alt2=2;
                }
                break;
            case 49:
                {
                alt2=3;
                }
                break;
            case 50:
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
                    // InternalSimplepalladio.g:856:2: ( ruleInternalAction )
                    {
                    // InternalSimplepalladio.g:856:2: ( ruleInternalAction )
                    // InternalSimplepalladio.g:857:3: ruleInternalAction
                    {
                     before(grammarAccess.getBehaviorElementAccess().getInternalActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInternalAction();

                    state._fsp--;

                     after(grammarAccess.getBehaviorElementAccess().getInternalActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:862:2: ( ruleExternalCall )
                    {
                    // InternalSimplepalladio.g:862:2: ( ruleExternalCall )
                    // InternalSimplepalladio.g:863:3: ruleExternalCall
                    {
                     before(grammarAccess.getBehaviorElementAccess().getExternalCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalCall();

                    state._fsp--;

                     after(grammarAccess.getBehaviorElementAccess().getExternalCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplepalladio.g:868:2: ( ruleLoop )
                    {
                    // InternalSimplepalladio.g:868:2: ( ruleLoop )
                    // InternalSimplepalladio.g:869:3: ruleLoop
                    {
                     before(grammarAccess.getBehaviorElementAccess().getLoopParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getBehaviorElementAccess().getLoopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplepalladio.g:874:2: ( ruleBranch )
                    {
                    // InternalSimplepalladio.g:874:2: ( ruleBranch )
                    // InternalSimplepalladio.g:875:3: ruleBranch
                    {
                     before(grammarAccess.getBehaviorElementAccess().getBranchParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBranch();

                    state._fsp--;

                     after(grammarAccess.getBehaviorElementAccess().getBranchParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSimplepalladio.g:884:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:888:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSimplepalladio.g:889:2: ( RULE_STRING )
                    {
                    // InternalSimplepalladio.g:889:2: ( RULE_STRING )
                    // InternalSimplepalladio.g:890:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:895:2: ( RULE_ID )
                    {
                    // InternalSimplepalladio.g:895:2: ( RULE_ID )
                    // InternalSimplepalladio.g:896:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__AbstractSystemElement__Alternatives"
    // InternalSimplepalladio.g:905:1: rule__AbstractSystemElement__Alternatives : ( ( ruleAssemblyContext ) | ( ruleRole ) | ( ruleDelegationConnector ) | ( ruleAssemblyConnector ) );
    public final void rule__AbstractSystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:909:1: ( ( ruleAssemblyContext ) | ( ruleRole ) | ( ruleDelegationConnector ) | ( ruleAssemblyConnector ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt4=1;
                }
                break;
            case 59:
                {
                alt4=2;
                }
                break;
            case 61:
                {
                alt4=3;
                }
                break;
            case 63:
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
                    // InternalSimplepalladio.g:910:2: ( ruleAssemblyContext )
                    {
                    // InternalSimplepalladio.g:910:2: ( ruleAssemblyContext )
                    // InternalSimplepalladio.g:911:3: ruleAssemblyContext
                    {
                     before(grammarAccess.getAbstractSystemElementAccess().getAssemblyContextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssemblyContext();

                    state._fsp--;

                     after(grammarAccess.getAbstractSystemElementAccess().getAssemblyContextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:916:2: ( ruleRole )
                    {
                    // InternalSimplepalladio.g:916:2: ( ruleRole )
                    // InternalSimplepalladio.g:917:3: ruleRole
                    {
                     before(grammarAccess.getAbstractSystemElementAccess().getRoleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getAbstractSystemElementAccess().getRoleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplepalladio.g:922:2: ( ruleDelegationConnector )
                    {
                    // InternalSimplepalladio.g:922:2: ( ruleDelegationConnector )
                    // InternalSimplepalladio.g:923:3: ruleDelegationConnector
                    {
                     before(grammarAccess.getAbstractSystemElementAccess().getDelegationConnectorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDelegationConnector();

                    state._fsp--;

                     after(grammarAccess.getAbstractSystemElementAccess().getDelegationConnectorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplepalladio.g:928:2: ( ruleAssemblyConnector )
                    {
                    // InternalSimplepalladio.g:928:2: ( ruleAssemblyConnector )
                    // InternalSimplepalladio.g:929:3: ruleAssemblyConnector
                    {
                     before(grammarAccess.getAbstractSystemElementAccess().getAssemblyConnectorParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAssemblyConnector();

                    state._fsp--;

                     after(grammarAccess.getAbstractSystemElementAccess().getAssemblyConnectorParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSystemElement__Alternatives"


    // $ANTLR start "rule__AbstractEnvironmentElement__Alternatives"
    // InternalSimplepalladio.g:938:1: rule__AbstractEnvironmentElement__Alternatives : ( ( ruleContainer ) | ( ruleLink ) );
    public final void rule__AbstractEnvironmentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:942:1: ( ( ruleContainer ) | ( ruleLink ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==68) ) {
                alt5=1;
            }
            else if ( (LA5_0==69) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimplepalladio.g:943:2: ( ruleContainer )
                    {
                    // InternalSimplepalladio.g:943:2: ( ruleContainer )
                    // InternalSimplepalladio.g:944:3: ruleContainer
                    {
                     before(grammarAccess.getAbstractEnvironmentElementAccess().getContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getAbstractEnvironmentElementAccess().getContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:949:2: ( ruleLink )
                    {
                    // InternalSimplepalladio.g:949:2: ( ruleLink )
                    // InternalSimplepalladio.g:950:3: ruleLink
                    {
                     before(grammarAccess.getAbstractEnvironmentElementAccess().getLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getAbstractEnvironmentElementAccess().getLinkParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractEnvironmentElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSimplepalladio.g:959:1: rule__Type__Alternatives : ( ( ( 'VOID' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'CHAR' ) ) | ( ( 'DATE' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'FLOAT' ) ) | ( ( 'LIST' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'MAP' ) ) | ( ( 'STRING' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:963:1: ( ( ( 'VOID' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'CHAR' ) ) | ( ( 'DATE' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'FLOAT' ) ) | ( ( 'LIST' ) ) | ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'MAP' ) ) | ( ( 'STRING' ) ) )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            case 20:
                {
                alt6=10;
                }
                break;
            case 21:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSimplepalladio.g:964:2: ( ( 'VOID' ) )
                    {
                    // InternalSimplepalladio.g:964:2: ( ( 'VOID' ) )
                    // InternalSimplepalladio.g:965:3: ( 'VOID' )
                    {
                     before(grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0()); 
                    // InternalSimplepalladio.g:966:3: ( 'VOID' )
                    // InternalSimplepalladio.g:966:4: 'VOID'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getVOIDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:970:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSimplepalladio.g:970:2: ( ( 'BOOLEAN' ) )
                    // InternalSimplepalladio.g:971:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSimplepalladio.g:972:3: ( 'BOOLEAN' )
                    // InternalSimplepalladio.g:972:4: 'BOOLEAN'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplepalladio.g:976:2: ( ( 'CHAR' ) )
                    {
                    // InternalSimplepalladio.g:976:2: ( ( 'CHAR' ) )
                    // InternalSimplepalladio.g:977:3: ( 'CHAR' )
                    {
                     before(grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2()); 
                    // InternalSimplepalladio.g:978:3: ( 'CHAR' )
                    // InternalSimplepalladio.g:978:4: 'CHAR'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getCHAREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplepalladio.g:982:2: ( ( 'DATE' ) )
                    {
                    // InternalSimplepalladio.g:982:2: ( ( 'DATE' ) )
                    // InternalSimplepalladio.g:983:3: ( 'DATE' )
                    {
                     before(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3()); 
                    // InternalSimplepalladio.g:984:3: ( 'DATE' )
                    // InternalSimplepalladio.g:984:4: 'DATE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimplepalladio.g:988:2: ( ( 'DOUBLE' ) )
                    {
                    // InternalSimplepalladio.g:988:2: ( ( 'DOUBLE' ) )
                    // InternalSimplepalladio.g:989:3: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4()); 
                    // InternalSimplepalladio.g:990:3: ( 'DOUBLE' )
                    // InternalSimplepalladio.g:990:4: 'DOUBLE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimplepalladio.g:994:2: ( ( 'FLOAT' ) )
                    {
                    // InternalSimplepalladio.g:994:2: ( ( 'FLOAT' ) )
                    // InternalSimplepalladio.g:995:3: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    // InternalSimplepalladio.g:996:3: ( 'FLOAT' )
                    // InternalSimplepalladio.g:996:4: 'FLOAT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimplepalladio.g:1000:2: ( ( 'LIST' ) )
                    {
                    // InternalSimplepalladio.g:1000:2: ( ( 'LIST' ) )
                    // InternalSimplepalladio.g:1001:3: ( 'LIST' )
                    {
                     before(grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6()); 
                    // InternalSimplepalladio.g:1002:3: ( 'LIST' )
                    // InternalSimplepalladio.g:1002:4: 'LIST'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLISTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSimplepalladio.g:1006:2: ( ( 'INT' ) )
                    {
                    // InternalSimplepalladio.g:1006:2: ( ( 'INT' ) )
                    // InternalSimplepalladio.g:1007:3: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7()); 
                    // InternalSimplepalladio.g:1008:3: ( 'INT' )
                    // InternalSimplepalladio.g:1008:4: 'INT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSimplepalladio.g:1012:2: ( ( 'LONG' ) )
                    {
                    // InternalSimplepalladio.g:1012:2: ( ( 'LONG' ) )
                    // InternalSimplepalladio.g:1013:3: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8()); 
                    // InternalSimplepalladio.g:1014:3: ( 'LONG' )
                    // InternalSimplepalladio.g:1014:4: 'LONG'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSimplepalladio.g:1018:2: ( ( 'MAP' ) )
                    {
                    // InternalSimplepalladio.g:1018:2: ( ( 'MAP' ) )
                    // InternalSimplepalladio.g:1019:3: ( 'MAP' )
                    {
                     before(grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9()); 
                    // InternalSimplepalladio.g:1020:3: ( 'MAP' )
                    // InternalSimplepalladio.g:1020:4: 'MAP'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getMAPEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSimplepalladio.g:1024:2: ( ( 'STRING' ) )
                    {
                    // InternalSimplepalladio.g:1024:2: ( ( 'STRING' ) )
                    // InternalSimplepalladio.g:1025:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_10()); 
                    // InternalSimplepalladio.g:1026:3: ( 'STRING' )
                    // InternalSimplepalladio.g:1026:4: 'STRING'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSimplepalladio.g:1034:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1038:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSimplepalladio.g:1039:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSimplepalladio.g:1046:1: rule__Model__Group__0__Impl : ( '{' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1050:1: ( ( '{' ) )
            // InternalSimplepalladio.g:1051:1: ( '{' )
            {
            // InternalSimplepalladio.g:1051:1: ( '{' )
            // InternalSimplepalladio.g:1052:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSimplepalladio.g:1061:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1065:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSimplepalladio.g:1066:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSimplepalladio.g:1073:1: rule__Model__Group__1__Impl : ( ( rule__Model__RepositoryViewTypeAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1077:1: ( ( ( rule__Model__RepositoryViewTypeAssignment_1 ) ) )
            // InternalSimplepalladio.g:1078:1: ( ( rule__Model__RepositoryViewTypeAssignment_1 ) )
            {
            // InternalSimplepalladio.g:1078:1: ( ( rule__Model__RepositoryViewTypeAssignment_1 ) )
            // InternalSimplepalladio.g:1079:2: ( rule__Model__RepositoryViewTypeAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getRepositoryViewTypeAssignment_1()); 
            // InternalSimplepalladio.g:1080:2: ( rule__Model__RepositoryViewTypeAssignment_1 )
            // InternalSimplepalladio.g:1080:3: rule__Model__RepositoryViewTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__RepositoryViewTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRepositoryViewTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalSimplepalladio.g:1088:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1092:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSimplepalladio.g:1093:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalSimplepalladio.g:1100:1: rule__Model__Group__2__Impl : ( ( rule__Model__AssemblyViewTypeAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1104:1: ( ( ( rule__Model__AssemblyViewTypeAssignment_2 ) ) )
            // InternalSimplepalladio.g:1105:1: ( ( rule__Model__AssemblyViewTypeAssignment_2 ) )
            {
            // InternalSimplepalladio.g:1105:1: ( ( rule__Model__AssemblyViewTypeAssignment_2 ) )
            // InternalSimplepalladio.g:1106:2: ( rule__Model__AssemblyViewTypeAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getAssemblyViewTypeAssignment_2()); 
            // InternalSimplepalladio.g:1107:2: ( rule__Model__AssemblyViewTypeAssignment_2 )
            // InternalSimplepalladio.g:1107:3: rule__Model__AssemblyViewTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__AssemblyViewTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAssemblyViewTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalSimplepalladio.g:1115:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1119:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalSimplepalladio.g:1120:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalSimplepalladio.g:1127:1: rule__Model__Group__3__Impl : ( ( rule__Model__RepositoryViewType2Assignment_3 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1131:1: ( ( ( rule__Model__RepositoryViewType2Assignment_3 )? ) )
            // InternalSimplepalladio.g:1132:1: ( ( rule__Model__RepositoryViewType2Assignment_3 )? )
            {
            // InternalSimplepalladio.g:1132:1: ( ( rule__Model__RepositoryViewType2Assignment_3 )? )
            // InternalSimplepalladio.g:1133:2: ( rule__Model__RepositoryViewType2Assignment_3 )?
            {
             before(grammarAccess.getModelAccess().getRepositoryViewType2Assignment_3()); 
            // InternalSimplepalladio.g:1134:2: ( rule__Model__RepositoryViewType2Assignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimplepalladio.g:1134:3: rule__Model__RepositoryViewType2Assignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__RepositoryViewType2Assignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getRepositoryViewType2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalSimplepalladio.g:1142:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1146:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalSimplepalladio.g:1147:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalSimplepalladio.g:1154:1: rule__Model__Group__4__Impl : ( ( rule__Model__AssemblyViewType2Assignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1158:1: ( ( ( rule__Model__AssemblyViewType2Assignment_4 )? ) )
            // InternalSimplepalladio.g:1159:1: ( ( rule__Model__AssemblyViewType2Assignment_4 )? )
            {
            // InternalSimplepalladio.g:1159:1: ( ( rule__Model__AssemblyViewType2Assignment_4 )? )
            // InternalSimplepalladio.g:1160:2: ( rule__Model__AssemblyViewType2Assignment_4 )?
            {
             before(grammarAccess.getModelAccess().getAssemblyViewType2Assignment_4()); 
            // InternalSimplepalladio.g:1161:2: ( rule__Model__AssemblyViewType2Assignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimplepalladio.g:1161:3: rule__Model__AssemblyViewType2Assignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__AssemblyViewType2Assignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getAssemblyViewType2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalSimplepalladio.g:1169:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1173:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalSimplepalladio.g:1174:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalSimplepalladio.g:1181:1: rule__Model__Group__5__Impl : ( ( rule__Model__EnvironmentViewTypeAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1185:1: ( ( ( rule__Model__EnvironmentViewTypeAssignment_5 ) ) )
            // InternalSimplepalladio.g:1186:1: ( ( rule__Model__EnvironmentViewTypeAssignment_5 ) )
            {
            // InternalSimplepalladio.g:1186:1: ( ( rule__Model__EnvironmentViewTypeAssignment_5 ) )
            // InternalSimplepalladio.g:1187:2: ( rule__Model__EnvironmentViewTypeAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getEnvironmentViewTypeAssignment_5()); 
            // InternalSimplepalladio.g:1188:2: ( rule__Model__EnvironmentViewTypeAssignment_5 )
            // InternalSimplepalladio.g:1188:3: rule__Model__EnvironmentViewTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__EnvironmentViewTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEnvironmentViewTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalSimplepalladio.g:1196:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1200:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalSimplepalladio.g:1201:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalSimplepalladio.g:1208:1: rule__Model__Group__6__Impl : ( ( rule__Model__AllocationViewTypeAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1212:1: ( ( ( rule__Model__AllocationViewTypeAssignment_6 ) ) )
            // InternalSimplepalladio.g:1213:1: ( ( rule__Model__AllocationViewTypeAssignment_6 ) )
            {
            // InternalSimplepalladio.g:1213:1: ( ( rule__Model__AllocationViewTypeAssignment_6 ) )
            // InternalSimplepalladio.g:1214:2: ( rule__Model__AllocationViewTypeAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getAllocationViewTypeAssignment_6()); 
            // InternalSimplepalladio.g:1215:2: ( rule__Model__AllocationViewTypeAssignment_6 )
            // InternalSimplepalladio.g:1215:3: rule__Model__AllocationViewTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Model__AllocationViewTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAllocationViewTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalSimplepalladio.g:1223:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1227:1: ( rule__Model__Group__7__Impl )
            // InternalSimplepalladio.g:1228:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalSimplepalladio.g:1234:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1238:1: ( ( '}' ) )
            // InternalSimplepalladio.g:1239:1: ( '}' )
            {
            // InternalSimplepalladio.g:1239:1: ( '}' )
            // InternalSimplepalladio.g:1240:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__0"
    // InternalSimplepalladio.g:1250:1: rule__RepositoryViewType__Group__0 : rule__RepositoryViewType__Group__0__Impl rule__RepositoryViewType__Group__1 ;
    public final void rule__RepositoryViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1254:1: ( rule__RepositoryViewType__Group__0__Impl rule__RepositoryViewType__Group__1 )
            // InternalSimplepalladio.g:1255:2: rule__RepositoryViewType__Group__0__Impl rule__RepositoryViewType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RepositoryViewType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__0"


    // $ANTLR start "rule__RepositoryViewType__Group__0__Impl"
    // InternalSimplepalladio.g:1262:1: rule__RepositoryViewType__Group__0__Impl : ( 'RepositoryViewType' ) ;
    public final void rule__RepositoryViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1266:1: ( ( 'RepositoryViewType' ) )
            // InternalSimplepalladio.g:1267:1: ( 'RepositoryViewType' )
            {
            // InternalSimplepalladio.g:1267:1: ( 'RepositoryViewType' )
            // InternalSimplepalladio.g:1268:2: 'RepositoryViewType'
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRepositoryViewTypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRepositoryViewTypeAccess().getRepositoryViewTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__0__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__1"
    // InternalSimplepalladio.g:1277:1: rule__RepositoryViewType__Group__1 : rule__RepositoryViewType__Group__1__Impl rule__RepositoryViewType__Group__2 ;
    public final void rule__RepositoryViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1281:1: ( rule__RepositoryViewType__Group__1__Impl rule__RepositoryViewType__Group__2 )
            // InternalSimplepalladio.g:1282:2: rule__RepositoryViewType__Group__1__Impl rule__RepositoryViewType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RepositoryViewType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__1"


    // $ANTLR start "rule__RepositoryViewType__Group__1__Impl"
    // InternalSimplepalladio.g:1289:1: rule__RepositoryViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__RepositoryViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1293:1: ( ( '{' ) )
            // InternalSimplepalladio.g:1294:1: ( '{' )
            {
            // InternalSimplepalladio.g:1294:1: ( '{' )
            // InternalSimplepalladio.g:1295:2: '{'
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__1__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__2"
    // InternalSimplepalladio.g:1304:1: rule__RepositoryViewType__Group__2 : rule__RepositoryViewType__Group__2__Impl rule__RepositoryViewType__Group__3 ;
    public final void rule__RepositoryViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1308:1: ( rule__RepositoryViewType__Group__2__Impl rule__RepositoryViewType__Group__3 )
            // InternalSimplepalladio.g:1309:2: rule__RepositoryViewType__Group__2__Impl rule__RepositoryViewType__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RepositoryViewType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__2"


    // $ANTLR start "rule__RepositoryViewType__Group__2__Impl"
    // InternalSimplepalladio.g:1316:1: rule__RepositoryViewType__Group__2__Impl : ( 'repositoryElements' ) ;
    public final void rule__RepositoryViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1320:1: ( ( 'repositoryElements' ) )
            // InternalSimplepalladio.g:1321:1: ( 'repositoryElements' )
            {
            // InternalSimplepalladio.g:1321:1: ( 'repositoryElements' )
            // InternalSimplepalladio.g:1322:2: 'repositoryElements'
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__2__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__3"
    // InternalSimplepalladio.g:1331:1: rule__RepositoryViewType__Group__3 : rule__RepositoryViewType__Group__3__Impl rule__RepositoryViewType__Group__4 ;
    public final void rule__RepositoryViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1335:1: ( rule__RepositoryViewType__Group__3__Impl rule__RepositoryViewType__Group__4 )
            // InternalSimplepalladio.g:1336:2: rule__RepositoryViewType__Group__3__Impl rule__RepositoryViewType__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RepositoryViewType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__3"


    // $ANTLR start "rule__RepositoryViewType__Group__3__Impl"
    // InternalSimplepalladio.g:1343:1: rule__RepositoryViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__RepositoryViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1347:1: ( ( '{' ) )
            // InternalSimplepalladio.g:1348:1: ( '{' )
            {
            // InternalSimplepalladio.g:1348:1: ( '{' )
            // InternalSimplepalladio.g:1349:2: '{'
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRepositoryViewTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__3__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__4"
    // InternalSimplepalladio.g:1358:1: rule__RepositoryViewType__Group__4 : rule__RepositoryViewType__Group__4__Impl rule__RepositoryViewType__Group__5 ;
    public final void rule__RepositoryViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1362:1: ( rule__RepositoryViewType__Group__4__Impl rule__RepositoryViewType__Group__5 )
            // InternalSimplepalladio.g:1363:2: rule__RepositoryViewType__Group__4__Impl rule__RepositoryViewType__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RepositoryViewType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__4"


    // $ANTLR start "rule__RepositoryViewType__Group__4__Impl"
    // InternalSimplepalladio.g:1370:1: rule__RepositoryViewType__Group__4__Impl : ( ( rule__RepositoryViewType__RepositoryElementsAssignment_4 ) ) ;
    public final void rule__RepositoryViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1374:1: ( ( ( rule__RepositoryViewType__RepositoryElementsAssignment_4 ) ) )
            // InternalSimplepalladio.g:1375:1: ( ( rule__RepositoryViewType__RepositoryElementsAssignment_4 ) )
            {
            // InternalSimplepalladio.g:1375:1: ( ( rule__RepositoryViewType__RepositoryElementsAssignment_4 ) )
            // InternalSimplepalladio.g:1376:2: ( rule__RepositoryViewType__RepositoryElementsAssignment_4 )
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAssignment_4()); 
            // InternalSimplepalladio.g:1377:2: ( rule__RepositoryViewType__RepositoryElementsAssignment_4 )
            // InternalSimplepalladio.g:1377:3: rule__RepositoryViewType__RepositoryElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__RepositoryElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__4__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__5"
    // InternalSimplepalladio.g:1385:1: rule__RepositoryViewType__Group__5 : rule__RepositoryViewType__Group__5__Impl rule__RepositoryViewType__Group__6 ;
    public final void rule__RepositoryViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1389:1: ( rule__RepositoryViewType__Group__5__Impl rule__RepositoryViewType__Group__6 )
            // InternalSimplepalladio.g:1390:2: rule__RepositoryViewType__Group__5__Impl rule__RepositoryViewType__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__RepositoryViewType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__5"


    // $ANTLR start "rule__RepositoryViewType__Group__5__Impl"
    // InternalSimplepalladio.g:1397:1: rule__RepositoryViewType__Group__5__Impl : ( ( rule__RepositoryViewType__Group_5__0 )* ) ;
    public final void rule__RepositoryViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1401:1: ( ( ( rule__RepositoryViewType__Group_5__0 )* ) )
            // InternalSimplepalladio.g:1402:1: ( ( rule__RepositoryViewType__Group_5__0 )* )
            {
            // InternalSimplepalladio.g:1402:1: ( ( rule__RepositoryViewType__Group_5__0 )* )
            // InternalSimplepalladio.g:1403:2: ( rule__RepositoryViewType__Group_5__0 )*
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getGroup_5()); 
            // InternalSimplepalladio.g:1404:2: ( rule__RepositoryViewType__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimplepalladio.g:1404:3: rule__RepositoryViewType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RepositoryViewType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRepositoryViewTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__5__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__6"
    // InternalSimplepalladio.g:1412:1: rule__RepositoryViewType__Group__6 : rule__RepositoryViewType__Group__6__Impl rule__RepositoryViewType__Group__7 ;
    public final void rule__RepositoryViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1416:1: ( rule__RepositoryViewType__Group__6__Impl rule__RepositoryViewType__Group__7 )
            // InternalSimplepalladio.g:1417:2: rule__RepositoryViewType__Group__6__Impl rule__RepositoryViewType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__RepositoryViewType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__6"


    // $ANTLR start "rule__RepositoryViewType__Group__6__Impl"
    // InternalSimplepalladio.g:1424:1: rule__RepositoryViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__RepositoryViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1428:1: ( ( '}' ) )
            // InternalSimplepalladio.g:1429:1: ( '}' )
            {
            // InternalSimplepalladio.g:1429:1: ( '}' )
            // InternalSimplepalladio.g:1430:2: '}'
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__6__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group__7"
    // InternalSimplepalladio.g:1439:1: rule__RepositoryViewType__Group__7 : rule__RepositoryViewType__Group__7__Impl ;
    public final void rule__RepositoryViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1443:1: ( rule__RepositoryViewType__Group__7__Impl )
            // InternalSimplepalladio.g:1444:2: rule__RepositoryViewType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__7"


    // $ANTLR start "rule__RepositoryViewType__Group__7__Impl"
    // InternalSimplepalladio.g:1450:1: rule__RepositoryViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__RepositoryViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1454:1: ( ( '}' ) )
            // InternalSimplepalladio.g:1455:1: ( '}' )
            {
            // InternalSimplepalladio.g:1455:1: ( '}' )
            // InternalSimplepalladio.g:1456:2: '}'
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRepositoryViewTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group__7__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group_5__0"
    // InternalSimplepalladio.g:1466:1: rule__RepositoryViewType__Group_5__0 : rule__RepositoryViewType__Group_5__0__Impl rule__RepositoryViewType__Group_5__1 ;
    public final void rule__RepositoryViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1470:1: ( rule__RepositoryViewType__Group_5__0__Impl rule__RepositoryViewType__Group_5__1 )
            // InternalSimplepalladio.g:1471:2: rule__RepositoryViewType__Group_5__0__Impl rule__RepositoryViewType__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__RepositoryViewType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group_5__0"


    // $ANTLR start "rule__RepositoryViewType__Group_5__0__Impl"
    // InternalSimplepalladio.g:1478:1: rule__RepositoryViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RepositoryViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1482:1: ( ( ',' ) )
            // InternalSimplepalladio.g:1483:1: ( ',' )
            {
            // InternalSimplepalladio.g:1483:1: ( ',' )
            // InternalSimplepalladio.g:1484:2: ','
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRepositoryViewTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group_5__0__Impl"


    // $ANTLR start "rule__RepositoryViewType__Group_5__1"
    // InternalSimplepalladio.g:1493:1: rule__RepositoryViewType__Group_5__1 : rule__RepositoryViewType__Group_5__1__Impl ;
    public final void rule__RepositoryViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1497:1: ( rule__RepositoryViewType__Group_5__1__Impl )
            // InternalSimplepalladio.g:1498:2: rule__RepositoryViewType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group_5__1"


    // $ANTLR start "rule__RepositoryViewType__Group_5__1__Impl"
    // InternalSimplepalladio.g:1504:1: rule__RepositoryViewType__Group_5__1__Impl : ( ( rule__RepositoryViewType__RepositoryElementsAssignment_5_1 ) ) ;
    public final void rule__RepositoryViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1508:1: ( ( ( rule__RepositoryViewType__RepositoryElementsAssignment_5_1 ) ) )
            // InternalSimplepalladio.g:1509:1: ( ( rule__RepositoryViewType__RepositoryElementsAssignment_5_1 ) )
            {
            // InternalSimplepalladio.g:1509:1: ( ( rule__RepositoryViewType__RepositoryElementsAssignment_5_1 ) )
            // InternalSimplepalladio.g:1510:2: ( rule__RepositoryViewType__RepositoryElementsAssignment_5_1 )
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAssignment_5_1()); 
            // InternalSimplepalladio.g:1511:2: ( rule__RepositoryViewType__RepositoryElementsAssignment_5_1 )
            // InternalSimplepalladio.g:1511:3: rule__RepositoryViewType__RepositoryElementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryViewType__RepositoryElementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__Group_5__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalSimplepalladio.g:1520:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1524:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalSimplepalladio.g:1525:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalSimplepalladio.g:1532:1: rule__Interface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1536:1: ( ( 'Interface' ) )
            // InternalSimplepalladio.g:1537:1: ( 'Interface' )
            {
            // InternalSimplepalladio.g:1537:1: ( 'Interface' )
            // InternalSimplepalladio.g:1538:2: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalSimplepalladio.g:1547:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1551:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalSimplepalladio.g:1552:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalSimplepalladio.g:1559:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1563:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:1564:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:1564:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalSimplepalladio.g:1565:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:1566:2: ( rule__Interface__NameAssignment_1 )
            // InternalSimplepalladio.g:1566:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalSimplepalladio.g:1574:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1578:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalSimplepalladio.g:1579:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalSimplepalladio.g:1586:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1590:1: ( ( '{' ) )
            // InternalSimplepalladio.g:1591:1: ( '{' )
            {
            // InternalSimplepalladio.g:1591:1: ( '{' )
            // InternalSimplepalladio.g:1592:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalSimplepalladio.g:1601:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1605:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalSimplepalladio.g:1606:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalSimplepalladio.g:1613:1: rule__Interface__Group__3__Impl : ( 'signatures' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1617:1: ( ( 'signatures' ) )
            // InternalSimplepalladio.g:1618:1: ( 'signatures' )
            {
            // InternalSimplepalladio.g:1618:1: ( 'signatures' )
            // InternalSimplepalladio.g:1619:2: 'signatures'
            {
             before(grammarAccess.getInterfaceAccess().getSignaturesKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getSignaturesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalSimplepalladio.g:1628:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1632:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalSimplepalladio.g:1633:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalSimplepalladio.g:1640:1: rule__Interface__Group__4__Impl : ( '(' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1644:1: ( ( '(' ) )
            // InternalSimplepalladio.g:1645:1: ( '(' )
            {
            // InternalSimplepalladio.g:1645:1: ( '(' )
            // InternalSimplepalladio.g:1646:2: '('
            {
             before(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // InternalSimplepalladio.g:1655:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1659:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalSimplepalladio.g:1660:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalSimplepalladio.g:1667:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__SignaturesAssignment_5 ) ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1671:1: ( ( ( rule__Interface__SignaturesAssignment_5 ) ) )
            // InternalSimplepalladio.g:1672:1: ( ( rule__Interface__SignaturesAssignment_5 ) )
            {
            // InternalSimplepalladio.g:1672:1: ( ( rule__Interface__SignaturesAssignment_5 ) )
            // InternalSimplepalladio.g:1673:2: ( rule__Interface__SignaturesAssignment_5 )
            {
             before(grammarAccess.getInterfaceAccess().getSignaturesAssignment_5()); 
            // InternalSimplepalladio.g:1674:2: ( rule__Interface__SignaturesAssignment_5 )
            // InternalSimplepalladio.g:1674:3: rule__Interface__SignaturesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Interface__SignaturesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSignaturesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // InternalSimplepalladio.g:1682:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1686:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // InternalSimplepalladio.g:1687:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // InternalSimplepalladio.g:1694:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__Group_6__0 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1698:1: ( ( ( rule__Interface__Group_6__0 )* ) )
            // InternalSimplepalladio.g:1699:1: ( ( rule__Interface__Group_6__0 )* )
            {
            // InternalSimplepalladio.g:1699:1: ( ( rule__Interface__Group_6__0 )* )
            // InternalSimplepalladio.g:1700:2: ( rule__Interface__Group_6__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_6()); 
            // InternalSimplepalladio.g:1701:2: ( rule__Interface__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimplepalladio.g:1701:3: rule__Interface__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Interface__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__7"
    // InternalSimplepalladio.g:1709:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl rule__Interface__Group__8 ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1713:1: ( rule__Interface__Group__7__Impl rule__Interface__Group__8 )
            // InternalSimplepalladio.g:1714:2: rule__Interface__Group__7__Impl rule__Interface__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Interface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7"


    // $ANTLR start "rule__Interface__Group__7__Impl"
    // InternalSimplepalladio.g:1721:1: rule__Interface__Group__7__Impl : ( ')' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1725:1: ( ( ')' ) )
            // InternalSimplepalladio.g:1726:1: ( ')' )
            {
            // InternalSimplepalladio.g:1726:1: ( ')' )
            // InternalSimplepalladio.g:1727:2: ')'
            {
             before(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7__Impl"


    // $ANTLR start "rule__Interface__Group__8"
    // InternalSimplepalladio.g:1736:1: rule__Interface__Group__8 : rule__Interface__Group__8__Impl ;
    public final void rule__Interface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1740:1: ( rule__Interface__Group__8__Impl )
            // InternalSimplepalladio.g:1741:2: rule__Interface__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__8"


    // $ANTLR start "rule__Interface__Group__8__Impl"
    // InternalSimplepalladio.g:1747:1: rule__Interface__Group__8__Impl : ( '}' ) ;
    public final void rule__Interface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1751:1: ( ( '}' ) )
            // InternalSimplepalladio.g:1752:1: ( '}' )
            {
            // InternalSimplepalladio.g:1752:1: ( '}' )
            // InternalSimplepalladio.g:1753:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__8__Impl"


    // $ANTLR start "rule__Interface__Group_6__0"
    // InternalSimplepalladio.g:1763:1: rule__Interface__Group_6__0 : rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 ;
    public final void rule__Interface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1767:1: ( rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 )
            // InternalSimplepalladio.g:1768:2: rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__0"


    // $ANTLR start "rule__Interface__Group_6__0__Impl"
    // InternalSimplepalladio.g:1775:1: rule__Interface__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1779:1: ( ( ',' ) )
            // InternalSimplepalladio.g:1780:1: ( ',' )
            {
            // InternalSimplepalladio.g:1780:1: ( ',' )
            // InternalSimplepalladio.g:1781:2: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__0__Impl"


    // $ANTLR start "rule__Interface__Group_6__1"
    // InternalSimplepalladio.g:1790:1: rule__Interface__Group_6__1 : rule__Interface__Group_6__1__Impl ;
    public final void rule__Interface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1794:1: ( rule__Interface__Group_6__1__Impl )
            // InternalSimplepalladio.g:1795:2: rule__Interface__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__1"


    // $ANTLR start "rule__Interface__Group_6__1__Impl"
    // InternalSimplepalladio.g:1801:1: rule__Interface__Group_6__1__Impl : ( ( rule__Interface__SignaturesAssignment_6_1 ) ) ;
    public final void rule__Interface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1805:1: ( ( ( rule__Interface__SignaturesAssignment_6_1 ) ) )
            // InternalSimplepalladio.g:1806:1: ( ( rule__Interface__SignaturesAssignment_6_1 ) )
            {
            // InternalSimplepalladio.g:1806:1: ( ( rule__Interface__SignaturesAssignment_6_1 ) )
            // InternalSimplepalladio.g:1807:2: ( rule__Interface__SignaturesAssignment_6_1 )
            {
             before(grammarAccess.getInterfaceAccess().getSignaturesAssignment_6_1()); 
            // InternalSimplepalladio.g:1808:2: ( rule__Interface__SignaturesAssignment_6_1 )
            // InternalSimplepalladio.g:1808:3: rule__Interface__SignaturesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__SignaturesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSignaturesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__0"
    // InternalSimplepalladio.g:1817:1: rule__CompositeComponent__Group__0 : rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 ;
    public final void rule__CompositeComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1821:1: ( rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 )
            // InternalSimplepalladio.g:1822:2: rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0"


    // $ANTLR start "rule__CompositeComponent__Group__0__Impl"
    // InternalSimplepalladio.g:1829:1: rule__CompositeComponent__Group__0__Impl : ( 'CompositeComponent' ) ;
    public final void rule__CompositeComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1833:1: ( ( 'CompositeComponent' ) )
            // InternalSimplepalladio.g:1834:1: ( 'CompositeComponent' )
            {
            // InternalSimplepalladio.g:1834:1: ( 'CompositeComponent' )
            // InternalSimplepalladio.g:1835:2: 'CompositeComponent'
            {
             before(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__1"
    // InternalSimplepalladio.g:1844:1: rule__CompositeComponent__Group__1 : rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 ;
    public final void rule__CompositeComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1848:1: ( rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 )
            // InternalSimplepalladio.g:1849:2: rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CompositeComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1"


    // $ANTLR start "rule__CompositeComponent__Group__1__Impl"
    // InternalSimplepalladio.g:1856:1: rule__CompositeComponent__Group__1__Impl : ( ( rule__CompositeComponent__NameAssignment_1 ) ) ;
    public final void rule__CompositeComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1860:1: ( ( ( rule__CompositeComponent__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:1861:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:1861:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            // InternalSimplepalladio.g:1862:2: ( rule__CompositeComponent__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:1863:2: ( rule__CompositeComponent__NameAssignment_1 )
            // InternalSimplepalladio.g:1863:3: rule__CompositeComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__2"
    // InternalSimplepalladio.g:1871:1: rule__CompositeComponent__Group__2 : rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 ;
    public final void rule__CompositeComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1875:1: ( rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 )
            // InternalSimplepalladio.g:1876:2: rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__CompositeComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2"


    // $ANTLR start "rule__CompositeComponent__Group__2__Impl"
    // InternalSimplepalladio.g:1883:1: rule__CompositeComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1887:1: ( ( '{' ) )
            // InternalSimplepalladio.g:1888:1: ( '{' )
            {
            // InternalSimplepalladio.g:1888:1: ( '{' )
            // InternalSimplepalladio.g:1889:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__3"
    // InternalSimplepalladio.g:1898:1: rule__CompositeComponent__Group__3 : rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 ;
    public final void rule__CompositeComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1902:1: ( rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 )
            // InternalSimplepalladio.g:1903:2: rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CompositeComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3"


    // $ANTLR start "rule__CompositeComponent__Group__3__Impl"
    // InternalSimplepalladio.g:1910:1: rule__CompositeComponent__Group__3__Impl : ( ( rule__CompositeComponent__Group_3__0 )? ) ;
    public final void rule__CompositeComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1914:1: ( ( ( rule__CompositeComponent__Group_3__0 )? ) )
            // InternalSimplepalladio.g:1915:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            {
            // InternalSimplepalladio.g:1915:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            // InternalSimplepalladio.g:1916:2: ( rule__CompositeComponent__Group_3__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3()); 
            // InternalSimplepalladio.g:1917:2: ( rule__CompositeComponent__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimplepalladio.g:1917:3: rule__CompositeComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__4"
    // InternalSimplepalladio.g:1925:1: rule__CompositeComponent__Group__4 : rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 ;
    public final void rule__CompositeComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1929:1: ( rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 )
            // InternalSimplepalladio.g:1930:2: rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__CompositeComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4"


    // $ANTLR start "rule__CompositeComponent__Group__4__Impl"
    // InternalSimplepalladio.g:1937:1: rule__CompositeComponent__Group__4__Impl : ( 'providedInterfaces' ) ;
    public final void rule__CompositeComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1941:1: ( ( 'providedInterfaces' ) )
            // InternalSimplepalladio.g:1942:1: ( 'providedInterfaces' )
            {
            // InternalSimplepalladio.g:1942:1: ( 'providedInterfaces' )
            // InternalSimplepalladio.g:1943:2: 'providedInterfaces'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__5"
    // InternalSimplepalladio.g:1952:1: rule__CompositeComponent__Group__5 : rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 ;
    public final void rule__CompositeComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1956:1: ( rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 )
            // InternalSimplepalladio.g:1957:2: rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5"


    // $ANTLR start "rule__CompositeComponent__Group__5__Impl"
    // InternalSimplepalladio.g:1964:1: rule__CompositeComponent__Group__5__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1968:1: ( ( '(' ) )
            // InternalSimplepalladio.g:1969:1: ( '(' )
            {
            // InternalSimplepalladio.g:1969:1: ( '(' )
            // InternalSimplepalladio.g:1970:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__6"
    // InternalSimplepalladio.g:1979:1: rule__CompositeComponent__Group__6 : rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 ;
    public final void rule__CompositeComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1983:1: ( rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 )
            // InternalSimplepalladio.g:1984:2: rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__CompositeComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6"


    // $ANTLR start "rule__CompositeComponent__Group__6__Impl"
    // InternalSimplepalladio.g:1991:1: rule__CompositeComponent__Group__6__Impl : ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_6 ) ) ;
    public final void rule__CompositeComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:1995:1: ( ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_6 ) ) )
            // InternalSimplepalladio.g:1996:1: ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_6 ) )
            {
            // InternalSimplepalladio.g:1996:1: ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_6 ) )
            // InternalSimplepalladio.g:1997:2: ( rule__CompositeComponent__ProvidedInterfacesAssignment_6 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesAssignment_6()); 
            // InternalSimplepalladio.g:1998:2: ( rule__CompositeComponent__ProvidedInterfacesAssignment_6 )
            // InternalSimplepalladio.g:1998:3: rule__CompositeComponent__ProvidedInterfacesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedInterfacesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__7"
    // InternalSimplepalladio.g:2006:1: rule__CompositeComponent__Group__7 : rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 ;
    public final void rule__CompositeComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2010:1: ( rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 )
            // InternalSimplepalladio.g:2011:2: rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__CompositeComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7"


    // $ANTLR start "rule__CompositeComponent__Group__7__Impl"
    // InternalSimplepalladio.g:2018:1: rule__CompositeComponent__Group__7__Impl : ( ( rule__CompositeComponent__Group_7__0 )* ) ;
    public final void rule__CompositeComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2022:1: ( ( ( rule__CompositeComponent__Group_7__0 )* ) )
            // InternalSimplepalladio.g:2023:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            {
            // InternalSimplepalladio.g:2023:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            // InternalSimplepalladio.g:2024:2: ( rule__CompositeComponent__Group_7__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_7()); 
            // InternalSimplepalladio.g:2025:2: ( rule__CompositeComponent__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSimplepalladio.g:2025:3: rule__CompositeComponent__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CompositeComponent__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__8"
    // InternalSimplepalladio.g:2033:1: rule__CompositeComponent__Group__8 : rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 ;
    public final void rule__CompositeComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2037:1: ( rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 )
            // InternalSimplepalladio.g:2038:2: rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__CompositeComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8"


    // $ANTLR start "rule__CompositeComponent__Group__8__Impl"
    // InternalSimplepalladio.g:2045:1: rule__CompositeComponent__Group__8__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2049:1: ( ( ')' ) )
            // InternalSimplepalladio.g:2050:1: ( ')' )
            {
            // InternalSimplepalladio.g:2050:1: ( ')' )
            // InternalSimplepalladio.g:2051:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__9"
    // InternalSimplepalladio.g:2060:1: rule__CompositeComponent__Group__9 : rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 ;
    public final void rule__CompositeComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2064:1: ( rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 )
            // InternalSimplepalladio.g:2065:2: rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__CompositeComponent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9"


    // $ANTLR start "rule__CompositeComponent__Group__9__Impl"
    // InternalSimplepalladio.g:2072:1: rule__CompositeComponent__Group__9__Impl : ( 'system' ) ;
    public final void rule__CompositeComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2076:1: ( ( 'system' ) )
            // InternalSimplepalladio.g:2077:1: ( 'system' )
            {
            // InternalSimplepalladio.g:2077:1: ( 'system' )
            // InternalSimplepalladio.g:2078:2: 'system'
            {
             before(grammarAccess.getCompositeComponentAccess().getSystemKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getSystemKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__10"
    // InternalSimplepalladio.g:2087:1: rule__CompositeComponent__Group__10 : rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 ;
    public final void rule__CompositeComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2091:1: ( rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 )
            // InternalSimplepalladio.g:2092:2: rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__CompositeComponent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10"


    // $ANTLR start "rule__CompositeComponent__Group__10__Impl"
    // InternalSimplepalladio.g:2099:1: rule__CompositeComponent__Group__10__Impl : ( ( rule__CompositeComponent__SystemAssignment_10 ) ) ;
    public final void rule__CompositeComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2103:1: ( ( ( rule__CompositeComponent__SystemAssignment_10 ) ) )
            // InternalSimplepalladio.g:2104:1: ( ( rule__CompositeComponent__SystemAssignment_10 ) )
            {
            // InternalSimplepalladio.g:2104:1: ( ( rule__CompositeComponent__SystemAssignment_10 ) )
            // InternalSimplepalladio.g:2105:2: ( rule__CompositeComponent__SystemAssignment_10 )
            {
             before(grammarAccess.getCompositeComponentAccess().getSystemAssignment_10()); 
            // InternalSimplepalladio.g:2106:2: ( rule__CompositeComponent__SystemAssignment_10 )
            // InternalSimplepalladio.g:2106:3: rule__CompositeComponent__SystemAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__SystemAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getSystemAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__11"
    // InternalSimplepalladio.g:2114:1: rule__CompositeComponent__Group__11 : rule__CompositeComponent__Group__11__Impl ;
    public final void rule__CompositeComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2118:1: ( rule__CompositeComponent__Group__11__Impl )
            // InternalSimplepalladio.g:2119:2: rule__CompositeComponent__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11"


    // $ANTLR start "rule__CompositeComponent__Group__11__Impl"
    // InternalSimplepalladio.g:2125:1: rule__CompositeComponent__Group__11__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2129:1: ( ( '}' ) )
            // InternalSimplepalladio.g:2130:1: ( '}' )
            {
            // InternalSimplepalladio.g:2130:1: ( '}' )
            // InternalSimplepalladio.g:2131:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__0"
    // InternalSimplepalladio.g:2141:1: rule__CompositeComponent__Group_3__0 : rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 ;
    public final void rule__CompositeComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2145:1: ( rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 )
            // InternalSimplepalladio.g:2146:2: rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__CompositeComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3__0__Impl"
    // InternalSimplepalladio.g:2153:1: rule__CompositeComponent__Group_3__0__Impl : ( 'requiredInterfaces' ) ;
    public final void rule__CompositeComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2157:1: ( ( 'requiredInterfaces' ) )
            // InternalSimplepalladio.g:2158:1: ( 'requiredInterfaces' )
            {
            // InternalSimplepalladio.g:2158:1: ( 'requiredInterfaces' )
            // InternalSimplepalladio.g:2159:2: 'requiredInterfaces'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__1"
    // InternalSimplepalladio.g:2168:1: rule__CompositeComponent__Group_3__1 : rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 ;
    public final void rule__CompositeComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2172:1: ( rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 )
            // InternalSimplepalladio.g:2173:2: rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3__1__Impl"
    // InternalSimplepalladio.g:2180:1: rule__CompositeComponent__Group_3__1__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2184:1: ( ( '(' ) )
            // InternalSimplepalladio.g:2185:1: ( '(' )
            {
            // InternalSimplepalladio.g:2185:1: ( '(' )
            // InternalSimplepalladio.g:2186:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__2"
    // InternalSimplepalladio.g:2195:1: rule__CompositeComponent__Group_3__2 : rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 ;
    public final void rule__CompositeComponent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2199:1: ( rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 )
            // InternalSimplepalladio.g:2200:2: rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__CompositeComponent__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2"


    // $ANTLR start "rule__CompositeComponent__Group_3__2__Impl"
    // InternalSimplepalladio.g:2207:1: rule__CompositeComponent__Group_3__2__Impl : ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_2 ) ) ;
    public final void rule__CompositeComponent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2211:1: ( ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_2 ) ) )
            // InternalSimplepalladio.g:2212:1: ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_2 ) )
            {
            // InternalSimplepalladio.g:2212:1: ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_2 ) )
            // InternalSimplepalladio.g:2213:2: ( rule__CompositeComponent__RequiredInterfacesAssignment_3_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesAssignment_3_2()); 
            // InternalSimplepalladio.g:2214:2: ( rule__CompositeComponent__RequiredInterfacesAssignment_3_2 )
            // InternalSimplepalladio.g:2214:3: rule__CompositeComponent__RequiredInterfacesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredInterfacesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__3"
    // InternalSimplepalladio.g:2222:1: rule__CompositeComponent__Group_3__3 : rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 ;
    public final void rule__CompositeComponent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2226:1: ( rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 )
            // InternalSimplepalladio.g:2227:2: rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__CompositeComponent__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3"


    // $ANTLR start "rule__CompositeComponent__Group_3__3__Impl"
    // InternalSimplepalladio.g:2234:1: rule__CompositeComponent__Group_3__3__Impl : ( ( rule__CompositeComponent__Group_3_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2238:1: ( ( ( rule__CompositeComponent__Group_3_3__0 )* ) )
            // InternalSimplepalladio.g:2239:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            {
            // InternalSimplepalladio.g:2239:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            // InternalSimplepalladio.g:2240:2: ( rule__CompositeComponent__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 
            // InternalSimplepalladio.g:2241:2: ( rule__CompositeComponent__Group_3_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSimplepalladio.g:2241:3: rule__CompositeComponent__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CompositeComponent__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__4"
    // InternalSimplepalladio.g:2249:1: rule__CompositeComponent__Group_3__4 : rule__CompositeComponent__Group_3__4__Impl ;
    public final void rule__CompositeComponent__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2253:1: ( rule__CompositeComponent__Group_3__4__Impl )
            // InternalSimplepalladio.g:2254:2: rule__CompositeComponent__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4"


    // $ANTLR start "rule__CompositeComponent__Group_3__4__Impl"
    // InternalSimplepalladio.g:2260:1: rule__CompositeComponent__Group_3__4__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2264:1: ( ( ')' ) )
            // InternalSimplepalladio.g:2265:1: ( ')' )
            {
            // InternalSimplepalladio.g:2265:1: ( ')' )
            // InternalSimplepalladio.g:2266:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0"
    // InternalSimplepalladio.g:2276:1: rule__CompositeComponent__Group_3_3__0 : rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 ;
    public final void rule__CompositeComponent__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2280:1: ( rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 )
            // InternalSimplepalladio.g:2281:2: rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0__Impl"
    // InternalSimplepalladio.g:2288:1: rule__CompositeComponent__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2292:1: ( ( ',' ) )
            // InternalSimplepalladio.g:2293:1: ( ',' )
            {
            // InternalSimplepalladio.g:2293:1: ( ',' )
            // InternalSimplepalladio.g:2294:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1"
    // InternalSimplepalladio.g:2303:1: rule__CompositeComponent__Group_3_3__1 : rule__CompositeComponent__Group_3_3__1__Impl ;
    public final void rule__CompositeComponent__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2307:1: ( rule__CompositeComponent__Group_3_3__1__Impl )
            // InternalSimplepalladio.g:2308:2: rule__CompositeComponent__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1__Impl"
    // InternalSimplepalladio.g:2314:1: rule__CompositeComponent__Group_3_3__1__Impl : ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2318:1: ( ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1 ) ) )
            // InternalSimplepalladio.g:2319:1: ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1 ) )
            {
            // InternalSimplepalladio.g:2319:1: ( ( rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1 ) )
            // InternalSimplepalladio.g:2320:2: ( rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesAssignment_3_3_1()); 
            // InternalSimplepalladio.g:2321:2: ( rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1 )
            // InternalSimplepalladio.g:2321:3: rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__0"
    // InternalSimplepalladio.g:2330:1: rule__CompositeComponent__Group_7__0 : rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 ;
    public final void rule__CompositeComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2334:1: ( rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 )
            // InternalSimplepalladio.g:2335:2: rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0"


    // $ANTLR start "rule__CompositeComponent__Group_7__0__Impl"
    // InternalSimplepalladio.g:2342:1: rule__CompositeComponent__Group_7__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2346:1: ( ( ',' ) )
            // InternalSimplepalladio.g:2347:1: ( ',' )
            {
            // InternalSimplepalladio.g:2347:1: ( ',' )
            // InternalSimplepalladio.g:2348:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__1"
    // InternalSimplepalladio.g:2357:1: rule__CompositeComponent__Group_7__1 : rule__CompositeComponent__Group_7__1__Impl ;
    public final void rule__CompositeComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2361:1: ( rule__CompositeComponent__Group_7__1__Impl )
            // InternalSimplepalladio.g:2362:2: rule__CompositeComponent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1"


    // $ANTLR start "rule__CompositeComponent__Group_7__1__Impl"
    // InternalSimplepalladio.g:2368:1: rule__CompositeComponent__Group_7__1__Impl : ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_7_1 ) ) ;
    public final void rule__CompositeComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2372:1: ( ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_7_1 ) ) )
            // InternalSimplepalladio.g:2373:1: ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_7_1 ) )
            {
            // InternalSimplepalladio.g:2373:1: ( ( rule__CompositeComponent__ProvidedInterfacesAssignment_7_1 ) )
            // InternalSimplepalladio.g:2374:2: ( rule__CompositeComponent__ProvidedInterfacesAssignment_7_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesAssignment_7_1()); 
            // InternalSimplepalladio.g:2375:2: ( rule__CompositeComponent__ProvidedInterfacesAssignment_7_1 )
            // InternalSimplepalladio.g:2375:3: rule__CompositeComponent__ProvidedInterfacesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedInterfacesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalSimplepalladio.g:2384:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2388:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalSimplepalladio.g:2389:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalSimplepalladio.g:2396:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2400:1: ( ( 'Signature' ) )
            // InternalSimplepalladio.g:2401:1: ( 'Signature' )
            {
            // InternalSimplepalladio.g:2401:1: ( 'Signature' )
            // InternalSimplepalladio.g:2402:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalSimplepalladio.g:2411:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2415:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalSimplepalladio.g:2416:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Signature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalSimplepalladio.g:2423:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2427:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:2428:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:2428:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalSimplepalladio.g:2429:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:2430:2: ( rule__Signature__NameAssignment_1 )
            // InternalSimplepalladio.g:2430:3: rule__Signature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalSimplepalladio.g:2438:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2442:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalSimplepalladio.g:2443:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Signature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalSimplepalladio.g:2450:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2454:1: ( ( '{' ) )
            // InternalSimplepalladio.g:2455:1: ( '{' )
            {
            // InternalSimplepalladio.g:2455:1: ( '{' )
            // InternalSimplepalladio.g:2456:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // InternalSimplepalladio.g:2465:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2469:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalSimplepalladio.g:2470:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Signature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // InternalSimplepalladio.g:2477:1: rule__Signature__Group__3__Impl : ( 'returnValue' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2481:1: ( ( 'returnValue' ) )
            // InternalSimplepalladio.g:2482:1: ( 'returnValue' )
            {
            // InternalSimplepalladio.g:2482:1: ( 'returnValue' )
            // InternalSimplepalladio.g:2483:2: 'returnValue'
            {
             before(grammarAccess.getSignatureAccess().getReturnValueKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getReturnValueKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group__4"
    // InternalSimplepalladio.g:2492:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2496:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalSimplepalladio.g:2497:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Signature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4"


    // $ANTLR start "rule__Signature__Group__4__Impl"
    // InternalSimplepalladio.g:2504:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__ReturnValueAssignment_4 ) ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2508:1: ( ( ( rule__Signature__ReturnValueAssignment_4 ) ) )
            // InternalSimplepalladio.g:2509:1: ( ( rule__Signature__ReturnValueAssignment_4 ) )
            {
            // InternalSimplepalladio.g:2509:1: ( ( rule__Signature__ReturnValueAssignment_4 ) )
            // InternalSimplepalladio.g:2510:2: ( rule__Signature__ReturnValueAssignment_4 )
            {
             before(grammarAccess.getSignatureAccess().getReturnValueAssignment_4()); 
            // InternalSimplepalladio.g:2511:2: ( rule__Signature__ReturnValueAssignment_4 )
            // InternalSimplepalladio.g:2511:3: rule__Signature__ReturnValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ReturnValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getReturnValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4__Impl"


    // $ANTLR start "rule__Signature__Group__5"
    // InternalSimplepalladio.g:2519:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl rule__Signature__Group__6 ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2523:1: ( rule__Signature__Group__5__Impl rule__Signature__Group__6 )
            // InternalSimplepalladio.g:2524:2: rule__Signature__Group__5__Impl rule__Signature__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Signature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5"


    // $ANTLR start "rule__Signature__Group__5__Impl"
    // InternalSimplepalladio.g:2531:1: rule__Signature__Group__5__Impl : ( ( rule__Signature__Group_5__0 )? ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2535:1: ( ( ( rule__Signature__Group_5__0 )? ) )
            // InternalSimplepalladio.g:2536:1: ( ( rule__Signature__Group_5__0 )? )
            {
            // InternalSimplepalladio.g:2536:1: ( ( rule__Signature__Group_5__0 )? )
            // InternalSimplepalladio.g:2537:2: ( rule__Signature__Group_5__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_5()); 
            // InternalSimplepalladio.g:2538:2: ( rule__Signature__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimplepalladio.g:2538:3: rule__Signature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5__Impl"


    // $ANTLR start "rule__Signature__Group__6"
    // InternalSimplepalladio.g:2546:1: rule__Signature__Group__6 : rule__Signature__Group__6__Impl ;
    public final void rule__Signature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2550:1: ( rule__Signature__Group__6__Impl )
            // InternalSimplepalladio.g:2551:2: rule__Signature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6"


    // $ANTLR start "rule__Signature__Group__6__Impl"
    // InternalSimplepalladio.g:2557:1: rule__Signature__Group__6__Impl : ( '}' ) ;
    public final void rule__Signature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2561:1: ( ( '}' ) )
            // InternalSimplepalladio.g:2562:1: ( '}' )
            {
            // InternalSimplepalladio.g:2562:1: ( '}' )
            // InternalSimplepalladio.g:2563:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group_5__0"
    // InternalSimplepalladio.g:2573:1: rule__Signature__Group_5__0 : rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 ;
    public final void rule__Signature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2577:1: ( rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 )
            // InternalSimplepalladio.g:2578:2: rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Signature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0"


    // $ANTLR start "rule__Signature__Group_5__0__Impl"
    // InternalSimplepalladio.g:2585:1: rule__Signature__Group_5__0__Impl : ( 'parameters' ) ;
    public final void rule__Signature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2589:1: ( ( 'parameters' ) )
            // InternalSimplepalladio.g:2590:1: ( 'parameters' )
            {
            // InternalSimplepalladio.g:2590:1: ( 'parameters' )
            // InternalSimplepalladio.g:2591:2: 'parameters'
            {
             before(grammarAccess.getSignatureAccess().getParametersKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getParametersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0__Impl"


    // $ANTLR start "rule__Signature__Group_5__1"
    // InternalSimplepalladio.g:2600:1: rule__Signature__Group_5__1 : rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 ;
    public final void rule__Signature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2604:1: ( rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 )
            // InternalSimplepalladio.g:2605:2: rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2
            {
            pushFollow(FOLLOW_23);
            rule__Signature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1"


    // $ANTLR start "rule__Signature__Group_5__1__Impl"
    // InternalSimplepalladio.g:2612:1: rule__Signature__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Signature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2616:1: ( ( '{' ) )
            // InternalSimplepalladio.g:2617:1: ( '{' )
            {
            // InternalSimplepalladio.g:2617:1: ( '{' )
            // InternalSimplepalladio.g:2618:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1__Impl"


    // $ANTLR start "rule__Signature__Group_5__2"
    // InternalSimplepalladio.g:2627:1: rule__Signature__Group_5__2 : rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 ;
    public final void rule__Signature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2631:1: ( rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 )
            // InternalSimplepalladio.g:2632:2: rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Signature__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2"


    // $ANTLR start "rule__Signature__Group_5__2__Impl"
    // InternalSimplepalladio.g:2639:1: rule__Signature__Group_5__2__Impl : ( ( rule__Signature__ParametersAssignment_5_2 ) ) ;
    public final void rule__Signature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2643:1: ( ( ( rule__Signature__ParametersAssignment_5_2 ) ) )
            // InternalSimplepalladio.g:2644:1: ( ( rule__Signature__ParametersAssignment_5_2 ) )
            {
            // InternalSimplepalladio.g:2644:1: ( ( rule__Signature__ParametersAssignment_5_2 ) )
            // InternalSimplepalladio.g:2645:2: ( rule__Signature__ParametersAssignment_5_2 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_5_2()); 
            // InternalSimplepalladio.g:2646:2: ( rule__Signature__ParametersAssignment_5_2 )
            // InternalSimplepalladio.g:2646:3: rule__Signature__ParametersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2__Impl"


    // $ANTLR start "rule__Signature__Group_5__3"
    // InternalSimplepalladio.g:2654:1: rule__Signature__Group_5__3 : rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 ;
    public final void rule__Signature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2658:1: ( rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 )
            // InternalSimplepalladio.g:2659:2: rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4
            {
            pushFollow(FOLLOW_11);
            rule__Signature__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3"


    // $ANTLR start "rule__Signature__Group_5__3__Impl"
    // InternalSimplepalladio.g:2666:1: rule__Signature__Group_5__3__Impl : ( ( rule__Signature__Group_5_3__0 )* ) ;
    public final void rule__Signature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2670:1: ( ( ( rule__Signature__Group_5_3__0 )* ) )
            // InternalSimplepalladio.g:2671:1: ( ( rule__Signature__Group_5_3__0 )* )
            {
            // InternalSimplepalladio.g:2671:1: ( ( rule__Signature__Group_5_3__0 )* )
            // InternalSimplepalladio.g:2672:2: ( rule__Signature__Group_5_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_5_3()); 
            // InternalSimplepalladio.g:2673:2: ( rule__Signature__Group_5_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSimplepalladio.g:2673:3: rule__Signature__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Signature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3__Impl"


    // $ANTLR start "rule__Signature__Group_5__4"
    // InternalSimplepalladio.g:2681:1: rule__Signature__Group_5__4 : rule__Signature__Group_5__4__Impl ;
    public final void rule__Signature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2685:1: ( rule__Signature__Group_5__4__Impl )
            // InternalSimplepalladio.g:2686:2: rule__Signature__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4"


    // $ANTLR start "rule__Signature__Group_5__4__Impl"
    // InternalSimplepalladio.g:2692:1: rule__Signature__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Signature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2696:1: ( ( '}' ) )
            // InternalSimplepalladio.g:2697:1: ( '}' )
            {
            // InternalSimplepalladio.g:2697:1: ( '}' )
            // InternalSimplepalladio.g:2698:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__0"
    // InternalSimplepalladio.g:2708:1: rule__Signature__Group_5_3__0 : rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 ;
    public final void rule__Signature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2712:1: ( rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 )
            // InternalSimplepalladio.g:2713:2: rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Signature__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0"


    // $ANTLR start "rule__Signature__Group_5_3__0__Impl"
    // InternalSimplepalladio.g:2720:1: rule__Signature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2724:1: ( ( ',' ) )
            // InternalSimplepalladio.g:2725:1: ( ',' )
            {
            // InternalSimplepalladio.g:2725:1: ( ',' )
            // InternalSimplepalladio.g:2726:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__1"
    // InternalSimplepalladio.g:2735:1: rule__Signature__Group_5_3__1 : rule__Signature__Group_5_3__1__Impl ;
    public final void rule__Signature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2739:1: ( rule__Signature__Group_5_3__1__Impl )
            // InternalSimplepalladio.g:2740:2: rule__Signature__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1"


    // $ANTLR start "rule__Signature__Group_5_3__1__Impl"
    // InternalSimplepalladio.g:2746:1: rule__Signature__Group_5_3__1__Impl : ( ( rule__Signature__ParametersAssignment_5_3_1 ) ) ;
    public final void rule__Signature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2750:1: ( ( ( rule__Signature__ParametersAssignment_5_3_1 ) ) )
            // InternalSimplepalladio.g:2751:1: ( ( rule__Signature__ParametersAssignment_5_3_1 ) )
            {
            // InternalSimplepalladio.g:2751:1: ( ( rule__Signature__ParametersAssignment_5_3_1 ) )
            // InternalSimplepalladio.g:2752:2: ( rule__Signature__ParametersAssignment_5_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_5_3_1()); 
            // InternalSimplepalladio.g:2753:2: ( rule__Signature__ParametersAssignment_5_3_1 )
            // InternalSimplepalladio.g:2753:3: rule__Signature__ParametersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParametersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalSimplepalladio.g:2762:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2766:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalSimplepalladio.g:2767:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalSimplepalladio.g:2774:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2778:1: ( ( 'Component' ) )
            // InternalSimplepalladio.g:2779:1: ( 'Component' )
            {
            // InternalSimplepalladio.g:2779:1: ( 'Component' )
            // InternalSimplepalladio.g:2780:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalSimplepalladio.g:2789:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2793:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalSimplepalladio.g:2794:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalSimplepalladio.g:2801:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2805:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:2806:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:2806:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalSimplepalladio.g:2807:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:2808:2: ( rule__Component__NameAssignment_1 )
            // InternalSimplepalladio.g:2808:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalSimplepalladio.g:2816:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2820:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalSimplepalladio.g:2821:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalSimplepalladio.g:2828:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2832:1: ( ( '{' ) )
            // InternalSimplepalladio.g:2833:1: ( '{' )
            {
            // InternalSimplepalladio.g:2833:1: ( '{' )
            // InternalSimplepalladio.g:2834:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalSimplepalladio.g:2843:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2847:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalSimplepalladio.g:2848:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalSimplepalladio.g:2855:1: rule__Component__Group__3__Impl : ( ( rule__Component__Group_3__0 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2859:1: ( ( ( rule__Component__Group_3__0 )? ) )
            // InternalSimplepalladio.g:2860:1: ( ( rule__Component__Group_3__0 )? )
            {
            // InternalSimplepalladio.g:2860:1: ( ( rule__Component__Group_3__0 )? )
            // InternalSimplepalladio.g:2861:2: ( rule__Component__Group_3__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_3()); 
            // InternalSimplepalladio.g:2862:2: ( rule__Component__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSimplepalladio.g:2862:3: rule__Component__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalSimplepalladio.g:2870:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2874:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalSimplepalladio.g:2875:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalSimplepalladio.g:2882:1: rule__Component__Group__4__Impl : ( 'providedInterfaces' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2886:1: ( ( 'providedInterfaces' ) )
            // InternalSimplepalladio.g:2887:1: ( 'providedInterfaces' )
            {
            // InternalSimplepalladio.g:2887:1: ( 'providedInterfaces' )
            // InternalSimplepalladio.g:2888:2: 'providedInterfaces'
            {
             before(grammarAccess.getComponentAccess().getProvidedInterfacesKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getProvidedInterfacesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalSimplepalladio.g:2897:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2901:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalSimplepalladio.g:2902:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalSimplepalladio.g:2909:1: rule__Component__Group__5__Impl : ( '(' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2913:1: ( ( '(' ) )
            // InternalSimplepalladio.g:2914:1: ( '(' )
            {
            // InternalSimplepalladio.g:2914:1: ( '(' )
            // InternalSimplepalladio.g:2915:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalSimplepalladio.g:2924:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2928:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalSimplepalladio.g:2929:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalSimplepalladio.g:2936:1: rule__Component__Group__6__Impl : ( ( rule__Component__ProvidedInterfacesAssignment_6 ) ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2940:1: ( ( ( rule__Component__ProvidedInterfacesAssignment_6 ) ) )
            // InternalSimplepalladio.g:2941:1: ( ( rule__Component__ProvidedInterfacesAssignment_6 ) )
            {
            // InternalSimplepalladio.g:2941:1: ( ( rule__Component__ProvidedInterfacesAssignment_6 ) )
            // InternalSimplepalladio.g:2942:2: ( rule__Component__ProvidedInterfacesAssignment_6 )
            {
             before(grammarAccess.getComponentAccess().getProvidedInterfacesAssignment_6()); 
            // InternalSimplepalladio.g:2943:2: ( rule__Component__ProvidedInterfacesAssignment_6 )
            // InternalSimplepalladio.g:2943:3: rule__Component__ProvidedInterfacesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Component__ProvidedInterfacesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getProvidedInterfacesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalSimplepalladio.g:2951:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2955:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalSimplepalladio.g:2956:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalSimplepalladio.g:2963:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2967:1: ( ( ( rule__Component__Group_7__0 )* ) )
            // InternalSimplepalladio.g:2968:1: ( ( rule__Component__Group_7__0 )* )
            {
            // InternalSimplepalladio.g:2968:1: ( ( rule__Component__Group_7__0 )* )
            // InternalSimplepalladio.g:2969:2: ( rule__Component__Group_7__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_7()); 
            // InternalSimplepalladio.g:2970:2: ( rule__Component__Group_7__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSimplepalladio.g:2970:3: rule__Component__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // InternalSimplepalladio.g:2978:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2982:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalSimplepalladio.g:2983:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Component__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // InternalSimplepalladio.g:2990:1: rule__Component__Group__8__Impl : ( ')' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:2994:1: ( ( ')' ) )
            // InternalSimplepalladio.g:2995:1: ( ')' )
            {
            // InternalSimplepalladio.g:2995:1: ( ')' )
            // InternalSimplepalladio.g:2996:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // InternalSimplepalladio.g:3005:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3009:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalSimplepalladio.g:3010:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9"


    // $ANTLR start "rule__Component__Group__9__Impl"
    // InternalSimplepalladio.g:3017:1: rule__Component__Group__9__Impl : ( 'services' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3021:1: ( ( 'services' ) )
            // InternalSimplepalladio.g:3022:1: ( 'services' )
            {
            // InternalSimplepalladio.g:3022:1: ( 'services' )
            // InternalSimplepalladio.g:3023:2: 'services'
            {
             before(grammarAccess.getComponentAccess().getServicesKeyword_9()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getServicesKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group__10"
    // InternalSimplepalladio.g:3032:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3036:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalSimplepalladio.g:3037:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__Component__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10"


    // $ANTLR start "rule__Component__Group__10__Impl"
    // InternalSimplepalladio.g:3044:1: rule__Component__Group__10__Impl : ( '{' ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3048:1: ( ( '{' ) )
            // InternalSimplepalladio.g:3049:1: ( '{' )
            {
            // InternalSimplepalladio.g:3049:1: ( '{' )
            // InternalSimplepalladio.g:3050:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10__Impl"


    // $ANTLR start "rule__Component__Group__11"
    // InternalSimplepalladio.g:3059:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3063:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalSimplepalladio.g:3064:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11"


    // $ANTLR start "rule__Component__Group__11__Impl"
    // InternalSimplepalladio.g:3071:1: rule__Component__Group__11__Impl : ( ( rule__Component__ServicesAssignment_11 ) ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3075:1: ( ( ( rule__Component__ServicesAssignment_11 ) ) )
            // InternalSimplepalladio.g:3076:1: ( ( rule__Component__ServicesAssignment_11 ) )
            {
            // InternalSimplepalladio.g:3076:1: ( ( rule__Component__ServicesAssignment_11 ) )
            // InternalSimplepalladio.g:3077:2: ( rule__Component__ServicesAssignment_11 )
            {
             before(grammarAccess.getComponentAccess().getServicesAssignment_11()); 
            // InternalSimplepalladio.g:3078:2: ( rule__Component__ServicesAssignment_11 )
            // InternalSimplepalladio.g:3078:3: rule__Component__ServicesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Component__ServicesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getServicesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11__Impl"


    // $ANTLR start "rule__Component__Group__12"
    // InternalSimplepalladio.g:3086:1: rule__Component__Group__12 : rule__Component__Group__12__Impl rule__Component__Group__13 ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3090:1: ( rule__Component__Group__12__Impl rule__Component__Group__13 )
            // InternalSimplepalladio.g:3091:2: rule__Component__Group__12__Impl rule__Component__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12"


    // $ANTLR start "rule__Component__Group__12__Impl"
    // InternalSimplepalladio.g:3098:1: rule__Component__Group__12__Impl : ( ( rule__Component__Group_12__0 )* ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3102:1: ( ( ( rule__Component__Group_12__0 )* ) )
            // InternalSimplepalladio.g:3103:1: ( ( rule__Component__Group_12__0 )* )
            {
            // InternalSimplepalladio.g:3103:1: ( ( rule__Component__Group_12__0 )* )
            // InternalSimplepalladio.g:3104:2: ( rule__Component__Group_12__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_12()); 
            // InternalSimplepalladio.g:3105:2: ( rule__Component__Group_12__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSimplepalladio.g:3105:3: rule__Component__Group_12__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12__Impl"


    // $ANTLR start "rule__Component__Group__13"
    // InternalSimplepalladio.g:3113:1: rule__Component__Group__13 : rule__Component__Group__13__Impl rule__Component__Group__14 ;
    public final void rule__Component__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3117:1: ( rule__Component__Group__13__Impl rule__Component__Group__14 )
            // InternalSimplepalladio.g:3118:2: rule__Component__Group__13__Impl rule__Component__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__13"


    // $ANTLR start "rule__Component__Group__13__Impl"
    // InternalSimplepalladio.g:3125:1: rule__Component__Group__13__Impl : ( '}' ) ;
    public final void rule__Component__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3129:1: ( ( '}' ) )
            // InternalSimplepalladio.g:3130:1: ( '}' )
            {
            // InternalSimplepalladio.g:3130:1: ( '}' )
            // InternalSimplepalladio.g:3131:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__13__Impl"


    // $ANTLR start "rule__Component__Group__14"
    // InternalSimplepalladio.g:3140:1: rule__Component__Group__14 : rule__Component__Group__14__Impl ;
    public final void rule__Component__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3144:1: ( rule__Component__Group__14__Impl )
            // InternalSimplepalladio.g:3145:2: rule__Component__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__14"


    // $ANTLR start "rule__Component__Group__14__Impl"
    // InternalSimplepalladio.g:3151:1: rule__Component__Group__14__Impl : ( '}' ) ;
    public final void rule__Component__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3155:1: ( ( '}' ) )
            // InternalSimplepalladio.g:3156:1: ( '}' )
            {
            // InternalSimplepalladio.g:3156:1: ( '}' )
            // InternalSimplepalladio.g:3157:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__14__Impl"


    // $ANTLR start "rule__Component__Group_3__0"
    // InternalSimplepalladio.g:3167:1: rule__Component__Group_3__0 : rule__Component__Group_3__0__Impl rule__Component__Group_3__1 ;
    public final void rule__Component__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3171:1: ( rule__Component__Group_3__0__Impl rule__Component__Group_3__1 )
            // InternalSimplepalladio.g:3172:2: rule__Component__Group_3__0__Impl rule__Component__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0"


    // $ANTLR start "rule__Component__Group_3__0__Impl"
    // InternalSimplepalladio.g:3179:1: rule__Component__Group_3__0__Impl : ( 'requiredInterfaces' ) ;
    public final void rule__Component__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3183:1: ( ( 'requiredInterfaces' ) )
            // InternalSimplepalladio.g:3184:1: ( 'requiredInterfaces' )
            {
            // InternalSimplepalladio.g:3184:1: ( 'requiredInterfaces' )
            // InternalSimplepalladio.g:3185:2: 'requiredInterfaces'
            {
             before(grammarAccess.getComponentAccess().getRequiredInterfacesKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRequiredInterfacesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0__Impl"


    // $ANTLR start "rule__Component__Group_3__1"
    // InternalSimplepalladio.g:3194:1: rule__Component__Group_3__1 : rule__Component__Group_3__1__Impl rule__Component__Group_3__2 ;
    public final void rule__Component__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3198:1: ( rule__Component__Group_3__1__Impl rule__Component__Group_3__2 )
            // InternalSimplepalladio.g:3199:2: rule__Component__Group_3__1__Impl rule__Component__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1"


    // $ANTLR start "rule__Component__Group_3__1__Impl"
    // InternalSimplepalladio.g:3206:1: rule__Component__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3210:1: ( ( '(' ) )
            // InternalSimplepalladio.g:3211:1: ( '(' )
            {
            // InternalSimplepalladio.g:3211:1: ( '(' )
            // InternalSimplepalladio.g:3212:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1__Impl"


    // $ANTLR start "rule__Component__Group_3__2"
    // InternalSimplepalladio.g:3221:1: rule__Component__Group_3__2 : rule__Component__Group_3__2__Impl rule__Component__Group_3__3 ;
    public final void rule__Component__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3225:1: ( rule__Component__Group_3__2__Impl rule__Component__Group_3__3 )
            // InternalSimplepalladio.g:3226:2: rule__Component__Group_3__2__Impl rule__Component__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__2"


    // $ANTLR start "rule__Component__Group_3__2__Impl"
    // InternalSimplepalladio.g:3233:1: rule__Component__Group_3__2__Impl : ( ( rule__Component__RequiredInterfacesAssignment_3_2 ) ) ;
    public final void rule__Component__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3237:1: ( ( ( rule__Component__RequiredInterfacesAssignment_3_2 ) ) )
            // InternalSimplepalladio.g:3238:1: ( ( rule__Component__RequiredInterfacesAssignment_3_2 ) )
            {
            // InternalSimplepalladio.g:3238:1: ( ( rule__Component__RequiredInterfacesAssignment_3_2 ) )
            // InternalSimplepalladio.g:3239:2: ( rule__Component__RequiredInterfacesAssignment_3_2 )
            {
             before(grammarAccess.getComponentAccess().getRequiredInterfacesAssignment_3_2()); 
            // InternalSimplepalladio.g:3240:2: ( rule__Component__RequiredInterfacesAssignment_3_2 )
            // InternalSimplepalladio.g:3240:3: rule__Component__RequiredInterfacesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__RequiredInterfacesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRequiredInterfacesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__2__Impl"


    // $ANTLR start "rule__Component__Group_3__3"
    // InternalSimplepalladio.g:3248:1: rule__Component__Group_3__3 : rule__Component__Group_3__3__Impl rule__Component__Group_3__4 ;
    public final void rule__Component__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3252:1: ( rule__Component__Group_3__3__Impl rule__Component__Group_3__4 )
            // InternalSimplepalladio.g:3253:2: rule__Component__Group_3__3__Impl rule__Component__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__3"


    // $ANTLR start "rule__Component__Group_3__3__Impl"
    // InternalSimplepalladio.g:3260:1: rule__Component__Group_3__3__Impl : ( ( rule__Component__Group_3_3__0 )* ) ;
    public final void rule__Component__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3264:1: ( ( ( rule__Component__Group_3_3__0 )* ) )
            // InternalSimplepalladio.g:3265:1: ( ( rule__Component__Group_3_3__0 )* )
            {
            // InternalSimplepalladio.g:3265:1: ( ( rule__Component__Group_3_3__0 )* )
            // InternalSimplepalladio.g:3266:2: ( rule__Component__Group_3_3__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_3_3()); 
            // InternalSimplepalladio.g:3267:2: ( rule__Component__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSimplepalladio.g:3267:3: rule__Component__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__3__Impl"


    // $ANTLR start "rule__Component__Group_3__4"
    // InternalSimplepalladio.g:3275:1: rule__Component__Group_3__4 : rule__Component__Group_3__4__Impl ;
    public final void rule__Component__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3279:1: ( rule__Component__Group_3__4__Impl )
            // InternalSimplepalladio.g:3280:2: rule__Component__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__4"


    // $ANTLR start "rule__Component__Group_3__4__Impl"
    // InternalSimplepalladio.g:3286:1: rule__Component__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Component__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3290:1: ( ( ')' ) )
            // InternalSimplepalladio.g:3291:1: ( ')' )
            {
            // InternalSimplepalladio.g:3291:1: ( ')' )
            // InternalSimplepalladio.g:3292:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__4__Impl"


    // $ANTLR start "rule__Component__Group_3_3__0"
    // InternalSimplepalladio.g:3302:1: rule__Component__Group_3_3__0 : rule__Component__Group_3_3__0__Impl rule__Component__Group_3_3__1 ;
    public final void rule__Component__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3306:1: ( rule__Component__Group_3_3__0__Impl rule__Component__Group_3_3__1 )
            // InternalSimplepalladio.g:3307:2: rule__Component__Group_3_3__0__Impl rule__Component__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_3__0"


    // $ANTLR start "rule__Component__Group_3_3__0__Impl"
    // InternalSimplepalladio.g:3314:1: rule__Component__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3318:1: ( ( ',' ) )
            // InternalSimplepalladio.g:3319:1: ( ',' )
            {
            // InternalSimplepalladio.g:3319:1: ( ',' )
            // InternalSimplepalladio.g:3320:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_3__0__Impl"


    // $ANTLR start "rule__Component__Group_3_3__1"
    // InternalSimplepalladio.g:3329:1: rule__Component__Group_3_3__1 : rule__Component__Group_3_3__1__Impl ;
    public final void rule__Component__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3333:1: ( rule__Component__Group_3_3__1__Impl )
            // InternalSimplepalladio.g:3334:2: rule__Component__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_3__1"


    // $ANTLR start "rule__Component__Group_3_3__1__Impl"
    // InternalSimplepalladio.g:3340:1: rule__Component__Group_3_3__1__Impl : ( ( rule__Component__RequiredInterfacesAssignment_3_3_1 ) ) ;
    public final void rule__Component__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3344:1: ( ( ( rule__Component__RequiredInterfacesAssignment_3_3_1 ) ) )
            // InternalSimplepalladio.g:3345:1: ( ( rule__Component__RequiredInterfacesAssignment_3_3_1 ) )
            {
            // InternalSimplepalladio.g:3345:1: ( ( rule__Component__RequiredInterfacesAssignment_3_3_1 ) )
            // InternalSimplepalladio.g:3346:2: ( rule__Component__RequiredInterfacesAssignment_3_3_1 )
            {
             before(grammarAccess.getComponentAccess().getRequiredInterfacesAssignment_3_3_1()); 
            // InternalSimplepalladio.g:3347:2: ( rule__Component__RequiredInterfacesAssignment_3_3_1 )
            // InternalSimplepalladio.g:3347:3: rule__Component__RequiredInterfacesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__RequiredInterfacesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRequiredInterfacesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3_3__1__Impl"


    // $ANTLR start "rule__Component__Group_7__0"
    // InternalSimplepalladio.g:3356:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl rule__Component__Group_7__1 ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3360:1: ( rule__Component__Group_7__0__Impl rule__Component__Group_7__1 )
            // InternalSimplepalladio.g:3361:2: rule__Component__Group_7__0__Impl rule__Component__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__0"


    // $ANTLR start "rule__Component__Group_7__0__Impl"
    // InternalSimplepalladio.g:3368:1: rule__Component__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3372:1: ( ( ',' ) )
            // InternalSimplepalladio.g:3373:1: ( ',' )
            {
            // InternalSimplepalladio.g:3373:1: ( ',' )
            // InternalSimplepalladio.g:3374:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__0__Impl"


    // $ANTLR start "rule__Component__Group_7__1"
    // InternalSimplepalladio.g:3383:1: rule__Component__Group_7__1 : rule__Component__Group_7__1__Impl ;
    public final void rule__Component__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3387:1: ( rule__Component__Group_7__1__Impl )
            // InternalSimplepalladio.g:3388:2: rule__Component__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__1"


    // $ANTLR start "rule__Component__Group_7__1__Impl"
    // InternalSimplepalladio.g:3394:1: rule__Component__Group_7__1__Impl : ( ( rule__Component__ProvidedInterfacesAssignment_7_1 ) ) ;
    public final void rule__Component__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3398:1: ( ( ( rule__Component__ProvidedInterfacesAssignment_7_1 ) ) )
            // InternalSimplepalladio.g:3399:1: ( ( rule__Component__ProvidedInterfacesAssignment_7_1 ) )
            {
            // InternalSimplepalladio.g:3399:1: ( ( rule__Component__ProvidedInterfacesAssignment_7_1 ) )
            // InternalSimplepalladio.g:3400:2: ( rule__Component__ProvidedInterfacesAssignment_7_1 )
            {
             before(grammarAccess.getComponentAccess().getProvidedInterfacesAssignment_7_1()); 
            // InternalSimplepalladio.g:3401:2: ( rule__Component__ProvidedInterfacesAssignment_7_1 )
            // InternalSimplepalladio.g:3401:3: rule__Component__ProvidedInterfacesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ProvidedInterfacesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getProvidedInterfacesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__1__Impl"


    // $ANTLR start "rule__Component__Group_12__0"
    // InternalSimplepalladio.g:3410:1: rule__Component__Group_12__0 : rule__Component__Group_12__0__Impl rule__Component__Group_12__1 ;
    public final void rule__Component__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3414:1: ( rule__Component__Group_12__0__Impl rule__Component__Group_12__1 )
            // InternalSimplepalladio.g:3415:2: rule__Component__Group_12__0__Impl rule__Component__Group_12__1
            {
            pushFollow(FOLLOW_25);
            rule__Component__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__0"


    // $ANTLR start "rule__Component__Group_12__0__Impl"
    // InternalSimplepalladio.g:3422:1: rule__Component__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3426:1: ( ( ',' ) )
            // InternalSimplepalladio.g:3427:1: ( ',' )
            {
            // InternalSimplepalladio.g:3427:1: ( ',' )
            // InternalSimplepalladio.g:3428:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_12_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__0__Impl"


    // $ANTLR start "rule__Component__Group_12__1"
    // InternalSimplepalladio.g:3437:1: rule__Component__Group_12__1 : rule__Component__Group_12__1__Impl ;
    public final void rule__Component__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3441:1: ( rule__Component__Group_12__1__Impl )
            // InternalSimplepalladio.g:3442:2: rule__Component__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__1"


    // $ANTLR start "rule__Component__Group_12__1__Impl"
    // InternalSimplepalladio.g:3448:1: rule__Component__Group_12__1__Impl : ( ( rule__Component__ServicesAssignment_12_1 ) ) ;
    public final void rule__Component__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3452:1: ( ( ( rule__Component__ServicesAssignment_12_1 ) ) )
            // InternalSimplepalladio.g:3453:1: ( ( rule__Component__ServicesAssignment_12_1 ) )
            {
            // InternalSimplepalladio.g:3453:1: ( ( rule__Component__ServicesAssignment_12_1 ) )
            // InternalSimplepalladio.g:3454:2: ( rule__Component__ServicesAssignment_12_1 )
            {
             before(grammarAccess.getComponentAccess().getServicesAssignment_12_1()); 
            // InternalSimplepalladio.g:3455:2: ( rule__Component__ServicesAssignment_12_1 )
            // InternalSimplepalladio.g:3455:3: rule__Component__ServicesAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ServicesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getServicesAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSimplepalladio.g:3464:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3468:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSimplepalladio.g:3469:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSimplepalladio.g:3476:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3480:1: ( ( 'Parameter' ) )
            // InternalSimplepalladio.g:3481:1: ( 'Parameter' )
            {
            // InternalSimplepalladio.g:3481:1: ( 'Parameter' )
            // InternalSimplepalladio.g:3482:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSimplepalladio.g:3491:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3495:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSimplepalladio.g:3496:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSimplepalladio.g:3503:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3507:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:3508:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:3508:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalSimplepalladio.g:3509:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:3510:2: ( rule__Parameter__NameAssignment_1 )
            // InternalSimplepalladio.g:3510:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalSimplepalladio.g:3518:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3522:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalSimplepalladio.g:3523:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalSimplepalladio.g:3530:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3534:1: ( ( '{' ) )
            // InternalSimplepalladio.g:3535:1: ( '{' )
            {
            // InternalSimplepalladio.g:3535:1: ( '{' )
            // InternalSimplepalladio.g:3536:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalSimplepalladio.g:3545:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3549:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalSimplepalladio.g:3550:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalSimplepalladio.g:3557:1: rule__Parameter__Group__3__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3561:1: ( ( 'type' ) )
            // InternalSimplepalladio.g:3562:1: ( 'type' )
            {
            // InternalSimplepalladio.g:3562:1: ( 'type' )
            // InternalSimplepalladio.g:3563:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalSimplepalladio.g:3572:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3576:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalSimplepalladio.g:3577:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalSimplepalladio.g:3584:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3588:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalSimplepalladio.g:3589:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalSimplepalladio.g:3589:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalSimplepalladio.g:3590:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalSimplepalladio.g:3591:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalSimplepalladio.g:3591:3: rule__Parameter__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalSimplepalladio.g:3599:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3603:1: ( rule__Parameter__Group__5__Impl )
            // InternalSimplepalladio.g:3604:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalSimplepalladio.g:3610:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3614:1: ( ( '}' ) )
            // InternalSimplepalladio.g:3615:1: ( '}' )
            {
            // InternalSimplepalladio.g:3615:1: ( '}' )
            // InternalSimplepalladio.g:3616:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalSimplepalladio.g:3626:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3630:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalSimplepalladio.g:3631:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalSimplepalladio.g:3638:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3642:1: ( ( 'Service' ) )
            // InternalSimplepalladio.g:3643:1: ( 'Service' )
            {
            // InternalSimplepalladio.g:3643:1: ( 'Service' )
            // InternalSimplepalladio.g:3644:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalSimplepalladio.g:3653:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3657:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalSimplepalladio.g:3658:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalSimplepalladio.g:3665:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3669:1: ( ( '{' ) )
            // InternalSimplepalladio.g:3670:1: ( '{' )
            {
            // InternalSimplepalladio.g:3670:1: ( '{' )
            // InternalSimplepalladio.g:3671:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalSimplepalladio.g:3680:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3684:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalSimplepalladio.g:3685:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalSimplepalladio.g:3692:1: rule__Service__Group__2__Impl : ( 'signature' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3696:1: ( ( 'signature' ) )
            // InternalSimplepalladio.g:3697:1: ( 'signature' )
            {
            // InternalSimplepalladio.g:3697:1: ( 'signature' )
            // InternalSimplepalladio.g:3698:2: 'signature'
            {
             before(grammarAccess.getServiceAccess().getSignatureKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getSignatureKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalSimplepalladio.g:3707:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3711:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalSimplepalladio.g:3712:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalSimplepalladio.g:3719:1: rule__Service__Group__3__Impl : ( ( rule__Service__SignatureAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3723:1: ( ( ( rule__Service__SignatureAssignment_3 ) ) )
            // InternalSimplepalladio.g:3724:1: ( ( rule__Service__SignatureAssignment_3 ) )
            {
            // InternalSimplepalladio.g:3724:1: ( ( rule__Service__SignatureAssignment_3 ) )
            // InternalSimplepalladio.g:3725:2: ( rule__Service__SignatureAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getSignatureAssignment_3()); 
            // InternalSimplepalladio.g:3726:2: ( rule__Service__SignatureAssignment_3 )
            // InternalSimplepalladio.g:3726:3: rule__Service__SignatureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__SignatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getSignatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalSimplepalladio.g:3734:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3738:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalSimplepalladio.g:3739:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalSimplepalladio.g:3746:1: rule__Service__Group__4__Impl : ( 'behaviourDescription' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3750:1: ( ( 'behaviourDescription' ) )
            // InternalSimplepalladio.g:3751:1: ( 'behaviourDescription' )
            {
            // InternalSimplepalladio.g:3751:1: ( 'behaviourDescription' )
            // InternalSimplepalladio.g:3752:2: 'behaviourDescription'
            {
             before(grammarAccess.getServiceAccess().getBehaviourDescriptionKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getBehaviourDescriptionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalSimplepalladio.g:3761:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3765:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalSimplepalladio.g:3766:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalSimplepalladio.g:3773:1: rule__Service__Group__5__Impl : ( ( rule__Service__BehaviourDescriptionAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3777:1: ( ( ( rule__Service__BehaviourDescriptionAssignment_5 ) ) )
            // InternalSimplepalladio.g:3778:1: ( ( rule__Service__BehaviourDescriptionAssignment_5 ) )
            {
            // InternalSimplepalladio.g:3778:1: ( ( rule__Service__BehaviourDescriptionAssignment_5 ) )
            // InternalSimplepalladio.g:3779:2: ( rule__Service__BehaviourDescriptionAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getBehaviourDescriptionAssignment_5()); 
            // InternalSimplepalladio.g:3780:2: ( rule__Service__BehaviourDescriptionAssignment_5 )
            // InternalSimplepalladio.g:3780:3: rule__Service__BehaviourDescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__BehaviourDescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getBehaviourDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalSimplepalladio.g:3788:1: rule__Service__Group__6 : rule__Service__Group__6__Impl ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3792:1: ( rule__Service__Group__6__Impl )
            // InternalSimplepalladio.g:3793:2: rule__Service__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalSimplepalladio.g:3799:1: rule__Service__Group__6__Impl : ( '}' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3803:1: ( ( '}' ) )
            // InternalSimplepalladio.g:3804:1: ( '}' )
            {
            // InternalSimplepalladio.g:3804:1: ( '}' )
            // InternalSimplepalladio.g:3805:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__0"
    // InternalSimplepalladio.g:3815:1: rule__BehaviourDescription__Group__0 : rule__BehaviourDescription__Group__0__Impl rule__BehaviourDescription__Group__1 ;
    public final void rule__BehaviourDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3819:1: ( rule__BehaviourDescription__Group__0__Impl rule__BehaviourDescription__Group__1 )
            // InternalSimplepalladio.g:3820:2: rule__BehaviourDescription__Group__0__Impl rule__BehaviourDescription__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__BehaviourDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__0"


    // $ANTLR start "rule__BehaviourDescription__Group__0__Impl"
    // InternalSimplepalladio.g:3827:1: rule__BehaviourDescription__Group__0__Impl : ( () ) ;
    public final void rule__BehaviourDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3831:1: ( ( () ) )
            // InternalSimplepalladio.g:3832:1: ( () )
            {
            // InternalSimplepalladio.g:3832:1: ( () )
            // InternalSimplepalladio.g:3833:2: ()
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0()); 
            // InternalSimplepalladio.g:3834:2: ()
            // InternalSimplepalladio.g:3834:3: 
            {
            }

             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__0__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__1"
    // InternalSimplepalladio.g:3842:1: rule__BehaviourDescription__Group__1 : rule__BehaviourDescription__Group__1__Impl rule__BehaviourDescription__Group__2 ;
    public final void rule__BehaviourDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3846:1: ( rule__BehaviourDescription__Group__1__Impl rule__BehaviourDescription__Group__2 )
            // InternalSimplepalladio.g:3847:2: rule__BehaviourDescription__Group__1__Impl rule__BehaviourDescription__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__BehaviourDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__1"


    // $ANTLR start "rule__BehaviourDescription__Group__1__Impl"
    // InternalSimplepalladio.g:3854:1: rule__BehaviourDescription__Group__1__Impl : ( 'BehaviourDescription' ) ;
    public final void rule__BehaviourDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3858:1: ( ( 'BehaviourDescription' ) )
            // InternalSimplepalladio.g:3859:1: ( 'BehaviourDescription' )
            {
            // InternalSimplepalladio.g:3859:1: ( 'BehaviourDescription' )
            // InternalSimplepalladio.g:3860:2: 'BehaviourDescription'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__1__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__2"
    // InternalSimplepalladio.g:3869:1: rule__BehaviourDescription__Group__2 : rule__BehaviourDescription__Group__2__Impl rule__BehaviourDescription__Group__3 ;
    public final void rule__BehaviourDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3873:1: ( rule__BehaviourDescription__Group__2__Impl rule__BehaviourDescription__Group__3 )
            // InternalSimplepalladio.g:3874:2: rule__BehaviourDescription__Group__2__Impl rule__BehaviourDescription__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__BehaviourDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__2"


    // $ANTLR start "rule__BehaviourDescription__Group__2__Impl"
    // InternalSimplepalladio.g:3881:1: rule__BehaviourDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__BehaviourDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3885:1: ( ( '{' ) )
            // InternalSimplepalladio.g:3886:1: ( '{' )
            {
            // InternalSimplepalladio.g:3886:1: ( '{' )
            // InternalSimplepalladio.g:3887:2: '{'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__2__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__3"
    // InternalSimplepalladio.g:3896:1: rule__BehaviourDescription__Group__3 : rule__BehaviourDescription__Group__3__Impl rule__BehaviourDescription__Group__4 ;
    public final void rule__BehaviourDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3900:1: ( rule__BehaviourDescription__Group__3__Impl rule__BehaviourDescription__Group__4 )
            // InternalSimplepalladio.g:3901:2: rule__BehaviourDescription__Group__3__Impl rule__BehaviourDescription__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__BehaviourDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__3"


    // $ANTLR start "rule__BehaviourDescription__Group__3__Impl"
    // InternalSimplepalladio.g:3908:1: rule__BehaviourDescription__Group__3__Impl : ( 'behaviorElements' ) ;
    public final void rule__BehaviourDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3912:1: ( ( 'behaviorElements' ) )
            // InternalSimplepalladio.g:3913:1: ( 'behaviorElements' )
            {
            // InternalSimplepalladio.g:3913:1: ( 'behaviorElements' )
            // InternalSimplepalladio.g:3914:2: 'behaviorElements'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__3__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__4"
    // InternalSimplepalladio.g:3923:1: rule__BehaviourDescription__Group__4 : rule__BehaviourDescription__Group__4__Impl rule__BehaviourDescription__Group__5 ;
    public final void rule__BehaviourDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3927:1: ( rule__BehaviourDescription__Group__4__Impl rule__BehaviourDescription__Group__5 )
            // InternalSimplepalladio.g:3928:2: rule__BehaviourDescription__Group__4__Impl rule__BehaviourDescription__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__BehaviourDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__4"


    // $ANTLR start "rule__BehaviourDescription__Group__4__Impl"
    // InternalSimplepalladio.g:3935:1: rule__BehaviourDescription__Group__4__Impl : ( '{' ) ;
    public final void rule__BehaviourDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3939:1: ( ( '{' ) )
            // InternalSimplepalladio.g:3940:1: ( '{' )
            {
            // InternalSimplepalladio.g:3940:1: ( '{' )
            // InternalSimplepalladio.g:3941:2: '{'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__4__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__5"
    // InternalSimplepalladio.g:3950:1: rule__BehaviourDescription__Group__5 : rule__BehaviourDescription__Group__5__Impl rule__BehaviourDescription__Group__6 ;
    public final void rule__BehaviourDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3954:1: ( rule__BehaviourDescription__Group__5__Impl rule__BehaviourDescription__Group__6 )
            // InternalSimplepalladio.g:3955:2: rule__BehaviourDescription__Group__5__Impl rule__BehaviourDescription__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__BehaviourDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__5"


    // $ANTLR start "rule__BehaviourDescription__Group__5__Impl"
    // InternalSimplepalladio.g:3962:1: rule__BehaviourDescription__Group__5__Impl : ( ( rule__BehaviourDescription__BehaviorElementsAssignment_5 ) ) ;
    public final void rule__BehaviourDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3966:1: ( ( ( rule__BehaviourDescription__BehaviorElementsAssignment_5 ) ) )
            // InternalSimplepalladio.g:3967:1: ( ( rule__BehaviourDescription__BehaviorElementsAssignment_5 ) )
            {
            // InternalSimplepalladio.g:3967:1: ( ( rule__BehaviourDescription__BehaviorElementsAssignment_5 ) )
            // InternalSimplepalladio.g:3968:2: ( rule__BehaviourDescription__BehaviorElementsAssignment_5 )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsAssignment_5()); 
            // InternalSimplepalladio.g:3969:2: ( rule__BehaviourDescription__BehaviorElementsAssignment_5 )
            // InternalSimplepalladio.g:3969:3: rule__BehaviourDescription__BehaviorElementsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__BehaviorElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__5__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__6"
    // InternalSimplepalladio.g:3977:1: rule__BehaviourDescription__Group__6 : rule__BehaviourDescription__Group__6__Impl rule__BehaviourDescription__Group__7 ;
    public final void rule__BehaviourDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3981:1: ( rule__BehaviourDescription__Group__6__Impl rule__BehaviourDescription__Group__7 )
            // InternalSimplepalladio.g:3982:2: rule__BehaviourDescription__Group__6__Impl rule__BehaviourDescription__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__BehaviourDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__6"


    // $ANTLR start "rule__BehaviourDescription__Group__6__Impl"
    // InternalSimplepalladio.g:3989:1: rule__BehaviourDescription__Group__6__Impl : ( ( rule__BehaviourDescription__Group_6__0 )* ) ;
    public final void rule__BehaviourDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:3993:1: ( ( ( rule__BehaviourDescription__Group_6__0 )* ) )
            // InternalSimplepalladio.g:3994:1: ( ( rule__BehaviourDescription__Group_6__0 )* )
            {
            // InternalSimplepalladio.g:3994:1: ( ( rule__BehaviourDescription__Group_6__0 )* )
            // InternalSimplepalladio.g:3995:2: ( rule__BehaviourDescription__Group_6__0 )*
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getGroup_6()); 
            // InternalSimplepalladio.g:3996:2: ( rule__BehaviourDescription__Group_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSimplepalladio.g:3996:3: rule__BehaviourDescription__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__BehaviourDescription__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBehaviourDescriptionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__6__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__7"
    // InternalSimplepalladio.g:4004:1: rule__BehaviourDescription__Group__7 : rule__BehaviourDescription__Group__7__Impl rule__BehaviourDescription__Group__8 ;
    public final void rule__BehaviourDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4008:1: ( rule__BehaviourDescription__Group__7__Impl rule__BehaviourDescription__Group__8 )
            // InternalSimplepalladio.g:4009:2: rule__BehaviourDescription__Group__7__Impl rule__BehaviourDescription__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__BehaviourDescription__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__7"


    // $ANTLR start "rule__BehaviourDescription__Group__7__Impl"
    // InternalSimplepalladio.g:4016:1: rule__BehaviourDescription__Group__7__Impl : ( '}' ) ;
    public final void rule__BehaviourDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4020:1: ( ( '}' ) )
            // InternalSimplepalladio.g:4021:1: ( '}' )
            {
            // InternalSimplepalladio.g:4021:1: ( '}' )
            // InternalSimplepalladio.g:4022:2: '}'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__7__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group__8"
    // InternalSimplepalladio.g:4031:1: rule__BehaviourDescription__Group__8 : rule__BehaviourDescription__Group__8__Impl ;
    public final void rule__BehaviourDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4035:1: ( rule__BehaviourDescription__Group__8__Impl )
            // InternalSimplepalladio.g:4036:2: rule__BehaviourDescription__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__8"


    // $ANTLR start "rule__BehaviourDescription__Group__8__Impl"
    // InternalSimplepalladio.g:4042:1: rule__BehaviourDescription__Group__8__Impl : ( '}' ) ;
    public final void rule__BehaviourDescription__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4046:1: ( ( '}' ) )
            // InternalSimplepalladio.g:4047:1: ( '}' )
            {
            // InternalSimplepalladio.g:4047:1: ( '}' )
            // InternalSimplepalladio.g:4048:2: '}'
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group__8__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_6__0"
    // InternalSimplepalladio.g:4058:1: rule__BehaviourDescription__Group_6__0 : rule__BehaviourDescription__Group_6__0__Impl rule__BehaviourDescription__Group_6__1 ;
    public final void rule__BehaviourDescription__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4062:1: ( rule__BehaviourDescription__Group_6__0__Impl rule__BehaviourDescription__Group_6__1 )
            // InternalSimplepalladio.g:4063:2: rule__BehaviourDescription__Group_6__0__Impl rule__BehaviourDescription__Group_6__1
            {
            pushFollow(FOLLOW_31);
            rule__BehaviourDescription__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_6__0"


    // $ANTLR start "rule__BehaviourDescription__Group_6__0__Impl"
    // InternalSimplepalladio.g:4070:1: rule__BehaviourDescription__Group_6__0__Impl : ( ',' ) ;
    public final void rule__BehaviourDescription__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4074:1: ( ( ',' ) )
            // InternalSimplepalladio.g:4075:1: ( ',' )
            {
            // InternalSimplepalladio.g:4075:1: ( ',' )
            // InternalSimplepalladio.g:4076:2: ','
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_6__0__Impl"


    // $ANTLR start "rule__BehaviourDescription__Group_6__1"
    // InternalSimplepalladio.g:4085:1: rule__BehaviourDescription__Group_6__1 : rule__BehaviourDescription__Group_6__1__Impl ;
    public final void rule__BehaviourDescription__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4089:1: ( rule__BehaviourDescription__Group_6__1__Impl )
            // InternalSimplepalladio.g:4090:2: rule__BehaviourDescription__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_6__1"


    // $ANTLR start "rule__BehaviourDescription__Group_6__1__Impl"
    // InternalSimplepalladio.g:4096:1: rule__BehaviourDescription__Group_6__1__Impl : ( ( rule__BehaviourDescription__BehaviorElementsAssignment_6_1 ) ) ;
    public final void rule__BehaviourDescription__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4100:1: ( ( ( rule__BehaviourDescription__BehaviorElementsAssignment_6_1 ) ) )
            // InternalSimplepalladio.g:4101:1: ( ( rule__BehaviourDescription__BehaviorElementsAssignment_6_1 ) )
            {
            // InternalSimplepalladio.g:4101:1: ( ( rule__BehaviourDescription__BehaviorElementsAssignment_6_1 ) )
            // InternalSimplepalladio.g:4102:2: ( rule__BehaviourDescription__BehaviorElementsAssignment_6_1 )
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsAssignment_6_1()); 
            // InternalSimplepalladio.g:4103:2: ( rule__BehaviourDescription__BehaviorElementsAssignment_6_1 )
            // InternalSimplepalladio.g:4103:3: rule__BehaviourDescription__BehaviorElementsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviourDescription__BehaviorElementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__Group_6__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalSimplepalladio.g:4112:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4116:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalSimplepalladio.g:4117:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__InternalAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0"


    // $ANTLR start "rule__InternalAction__Group__0__Impl"
    // InternalSimplepalladio.g:4124:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4128:1: ( ( () ) )
            // InternalSimplepalladio.g:4129:1: ( () )
            {
            // InternalSimplepalladio.g:4129:1: ( () )
            // InternalSimplepalladio.g:4130:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalSimplepalladio.g:4131:2: ()
            // InternalSimplepalladio.g:4131:3: 
            {
            }

             after(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0__Impl"


    // $ANTLR start "rule__InternalAction__Group__1"
    // InternalSimplepalladio.g:4139:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4143:1: ( rule__InternalAction__Group__1__Impl )
            // InternalSimplepalladio.g:4144:2: rule__InternalAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1"


    // $ANTLR start "rule__InternalAction__Group__1__Impl"
    // InternalSimplepalladio.g:4150:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4154:1: ( ( 'InternalAction' ) )
            // InternalSimplepalladio.g:4155:1: ( 'InternalAction' )
            {
            // InternalSimplepalladio.g:4155:1: ( 'InternalAction' )
            // InternalSimplepalladio.g:4156:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1__Impl"


    // $ANTLR start "rule__ExternalCall__Group__0"
    // InternalSimplepalladio.g:4166:1: rule__ExternalCall__Group__0 : rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 ;
    public final void rule__ExternalCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4170:1: ( rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1 )
            // InternalSimplepalladio.g:4171:2: rule__ExternalCall__Group__0__Impl rule__ExternalCall__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExternalCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__0"


    // $ANTLR start "rule__ExternalCall__Group__0__Impl"
    // InternalSimplepalladio.g:4178:1: rule__ExternalCall__Group__0__Impl : ( 'ExternalCall' ) ;
    public final void rule__ExternalCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4182:1: ( ( 'ExternalCall' ) )
            // InternalSimplepalladio.g:4183:1: ( 'ExternalCall' )
            {
            // InternalSimplepalladio.g:4183:1: ( 'ExternalCall' )
            // InternalSimplepalladio.g:4184:2: 'ExternalCall'
            {
             before(grammarAccess.getExternalCallAccess().getExternalCallKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getExternalCallAccess().getExternalCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__0__Impl"


    // $ANTLR start "rule__ExternalCall__Group__1"
    // InternalSimplepalladio.g:4193:1: rule__ExternalCall__Group__1 : rule__ExternalCall__Group__1__Impl rule__ExternalCall__Group__2 ;
    public final void rule__ExternalCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4197:1: ( rule__ExternalCall__Group__1__Impl rule__ExternalCall__Group__2 )
            // InternalSimplepalladio.g:4198:2: rule__ExternalCall__Group__1__Impl rule__ExternalCall__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ExternalCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__1"


    // $ANTLR start "rule__ExternalCall__Group__1__Impl"
    // InternalSimplepalladio.g:4205:1: rule__ExternalCall__Group__1__Impl : ( '{' ) ;
    public final void rule__ExternalCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4209:1: ( ( '{' ) )
            // InternalSimplepalladio.g:4210:1: ( '{' )
            {
            // InternalSimplepalladio.g:4210:1: ( '{' )
            // InternalSimplepalladio.g:4211:2: '{'
            {
             before(grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExternalCallAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__1__Impl"


    // $ANTLR start "rule__ExternalCall__Group__2"
    // InternalSimplepalladio.g:4220:1: rule__ExternalCall__Group__2 : rule__ExternalCall__Group__2__Impl rule__ExternalCall__Group__3 ;
    public final void rule__ExternalCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4224:1: ( rule__ExternalCall__Group__2__Impl rule__ExternalCall__Group__3 )
            // InternalSimplepalladio.g:4225:2: rule__ExternalCall__Group__2__Impl rule__ExternalCall__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ExternalCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__2"


    // $ANTLR start "rule__ExternalCall__Group__2__Impl"
    // InternalSimplepalladio.g:4232:1: rule__ExternalCall__Group__2__Impl : ( 'signature' ) ;
    public final void rule__ExternalCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4236:1: ( ( 'signature' ) )
            // InternalSimplepalladio.g:4237:1: ( 'signature' )
            {
            // InternalSimplepalladio.g:4237:1: ( 'signature' )
            // InternalSimplepalladio.g:4238:2: 'signature'
            {
             before(grammarAccess.getExternalCallAccess().getSignatureKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getExternalCallAccess().getSignatureKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__2__Impl"


    // $ANTLR start "rule__ExternalCall__Group__3"
    // InternalSimplepalladio.g:4247:1: rule__ExternalCall__Group__3 : rule__ExternalCall__Group__3__Impl rule__ExternalCall__Group__4 ;
    public final void rule__ExternalCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4251:1: ( rule__ExternalCall__Group__3__Impl rule__ExternalCall__Group__4 )
            // InternalSimplepalladio.g:4252:2: rule__ExternalCall__Group__3__Impl rule__ExternalCall__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ExternalCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__3"


    // $ANTLR start "rule__ExternalCall__Group__3__Impl"
    // InternalSimplepalladio.g:4259:1: rule__ExternalCall__Group__3__Impl : ( ( rule__ExternalCall__SignatureAssignment_3 ) ) ;
    public final void rule__ExternalCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4263:1: ( ( ( rule__ExternalCall__SignatureAssignment_3 ) ) )
            // InternalSimplepalladio.g:4264:1: ( ( rule__ExternalCall__SignatureAssignment_3 ) )
            {
            // InternalSimplepalladio.g:4264:1: ( ( rule__ExternalCall__SignatureAssignment_3 ) )
            // InternalSimplepalladio.g:4265:2: ( rule__ExternalCall__SignatureAssignment_3 )
            {
             before(grammarAccess.getExternalCallAccess().getSignatureAssignment_3()); 
            // InternalSimplepalladio.g:4266:2: ( rule__ExternalCall__SignatureAssignment_3 )
            // InternalSimplepalladio.g:4266:3: rule__ExternalCall__SignatureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCall__SignatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalCallAccess().getSignatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__3__Impl"


    // $ANTLR start "rule__ExternalCall__Group__4"
    // InternalSimplepalladio.g:4274:1: rule__ExternalCall__Group__4 : rule__ExternalCall__Group__4__Impl ;
    public final void rule__ExternalCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4278:1: ( rule__ExternalCall__Group__4__Impl )
            // InternalSimplepalladio.g:4279:2: rule__ExternalCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__4"


    // $ANTLR start "rule__ExternalCall__Group__4__Impl"
    // InternalSimplepalladio.g:4285:1: rule__ExternalCall__Group__4__Impl : ( '}' ) ;
    public final void rule__ExternalCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4289:1: ( ( '}' ) )
            // InternalSimplepalladio.g:4290:1: ( '}' )
            {
            // InternalSimplepalladio.g:4290:1: ( '}' )
            // InternalSimplepalladio.g:4291:2: '}'
            {
             before(grammarAccess.getExternalCallAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExternalCallAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalSimplepalladio.g:4301:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4305:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalSimplepalladio.g:4306:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalSimplepalladio.g:4313:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4317:1: ( ( () ) )
            // InternalSimplepalladio.g:4318:1: ( () )
            {
            // InternalSimplepalladio.g:4318:1: ( () )
            // InternalSimplepalladio.g:4319:2: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // InternalSimplepalladio.g:4320:2: ()
            // InternalSimplepalladio.g:4320:3: 
            {
            }

             after(grammarAccess.getLoopAccess().getLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalSimplepalladio.g:4328:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4332:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalSimplepalladio.g:4333:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalSimplepalladio.g:4340:1: rule__Loop__Group__1__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4344:1: ( ( 'Loop' ) )
            // InternalSimplepalladio.g:4345:1: ( 'Loop' )
            {
            // InternalSimplepalladio.g:4345:1: ( 'Loop' )
            // InternalSimplepalladio.g:4346:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalSimplepalladio.g:4355:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4359:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalSimplepalladio.g:4360:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalSimplepalladio.g:4367:1: rule__Loop__Group__2__Impl : ( '{' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4371:1: ( ( '{' ) )
            // InternalSimplepalladio.g:4372:1: ( '{' )
            {
            // InternalSimplepalladio.g:4372:1: ( '{' )
            // InternalSimplepalladio.g:4373:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalSimplepalladio.g:4382:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4386:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalSimplepalladio.g:4387:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalSimplepalladio.g:4394:1: rule__Loop__Group__3__Impl : ( ( rule__Loop__Group_3__0 )? ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4398:1: ( ( ( rule__Loop__Group_3__0 )? ) )
            // InternalSimplepalladio.g:4399:1: ( ( rule__Loop__Group_3__0 )? )
            {
            // InternalSimplepalladio.g:4399:1: ( ( rule__Loop__Group_3__0 )? )
            // InternalSimplepalladio.g:4400:2: ( rule__Loop__Group_3__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_3()); 
            // InternalSimplepalladio.g:4401:2: ( rule__Loop__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSimplepalladio.g:4401:3: rule__Loop__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalSimplepalladio.g:4409:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4413:1: ( rule__Loop__Group__4__Impl )
            // InternalSimplepalladio.g:4414:2: rule__Loop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalSimplepalladio.g:4420:1: rule__Loop__Group__4__Impl : ( '}' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4424:1: ( ( '}' ) )
            // InternalSimplepalladio.g:4425:1: ( '}' )
            {
            // InternalSimplepalladio.g:4425:1: ( '}' )
            // InternalSimplepalladio.g:4426:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group_3__0"
    // InternalSimplepalladio.g:4436:1: rule__Loop__Group_3__0 : rule__Loop__Group_3__0__Impl rule__Loop__Group_3__1 ;
    public final void rule__Loop__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4440:1: ( rule__Loop__Group_3__0__Impl rule__Loop__Group_3__1 )
            // InternalSimplepalladio.g:4441:2: rule__Loop__Group_3__0__Impl rule__Loop__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Loop__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__0"


    // $ANTLR start "rule__Loop__Group_3__0__Impl"
    // InternalSimplepalladio.g:4448:1: rule__Loop__Group_3__0__Impl : ( 'behaviorElements' ) ;
    public final void rule__Loop__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4452:1: ( ( 'behaviorElements' ) )
            // InternalSimplepalladio.g:4453:1: ( 'behaviorElements' )
            {
            // InternalSimplepalladio.g:4453:1: ( 'behaviorElements' )
            // InternalSimplepalladio.g:4454:2: 'behaviorElements'
            {
             before(grammarAccess.getLoopAccess().getBehaviorElementsKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getBehaviorElementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_3__1"
    // InternalSimplepalladio.g:4463:1: rule__Loop__Group_3__1 : rule__Loop__Group_3__1__Impl rule__Loop__Group_3__2 ;
    public final void rule__Loop__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4467:1: ( rule__Loop__Group_3__1__Impl rule__Loop__Group_3__2 )
            // InternalSimplepalladio.g:4468:2: rule__Loop__Group_3__1__Impl rule__Loop__Group_3__2
            {
            pushFollow(FOLLOW_31);
            rule__Loop__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__1"


    // $ANTLR start "rule__Loop__Group_3__1__Impl"
    // InternalSimplepalladio.g:4475:1: rule__Loop__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Loop__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4479:1: ( ( '{' ) )
            // InternalSimplepalladio.g:4480:1: ( '{' )
            {
            // InternalSimplepalladio.g:4480:1: ( '{' )
            // InternalSimplepalladio.g:4481:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_3__2"
    // InternalSimplepalladio.g:4490:1: rule__Loop__Group_3__2 : rule__Loop__Group_3__2__Impl rule__Loop__Group_3__3 ;
    public final void rule__Loop__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4494:1: ( rule__Loop__Group_3__2__Impl rule__Loop__Group_3__3 )
            // InternalSimplepalladio.g:4495:2: rule__Loop__Group_3__2__Impl rule__Loop__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Loop__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__2"


    // $ANTLR start "rule__Loop__Group_3__2__Impl"
    // InternalSimplepalladio.g:4502:1: rule__Loop__Group_3__2__Impl : ( ( rule__Loop__BehaviorElementsAssignment_3_2 ) ) ;
    public final void rule__Loop__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4506:1: ( ( ( rule__Loop__BehaviorElementsAssignment_3_2 ) ) )
            // InternalSimplepalladio.g:4507:1: ( ( rule__Loop__BehaviorElementsAssignment_3_2 ) )
            {
            // InternalSimplepalladio.g:4507:1: ( ( rule__Loop__BehaviorElementsAssignment_3_2 ) )
            // InternalSimplepalladio.g:4508:2: ( rule__Loop__BehaviorElementsAssignment_3_2 )
            {
             before(grammarAccess.getLoopAccess().getBehaviorElementsAssignment_3_2()); 
            // InternalSimplepalladio.g:4509:2: ( rule__Loop__BehaviorElementsAssignment_3_2 )
            // InternalSimplepalladio.g:4509:3: rule__Loop__BehaviorElementsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__BehaviorElementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getBehaviorElementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__2__Impl"


    // $ANTLR start "rule__Loop__Group_3__3"
    // InternalSimplepalladio.g:4517:1: rule__Loop__Group_3__3 : rule__Loop__Group_3__3__Impl rule__Loop__Group_3__4 ;
    public final void rule__Loop__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4521:1: ( rule__Loop__Group_3__3__Impl rule__Loop__Group_3__4 )
            // InternalSimplepalladio.g:4522:2: rule__Loop__Group_3__3__Impl rule__Loop__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__Loop__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__3"


    // $ANTLR start "rule__Loop__Group_3__3__Impl"
    // InternalSimplepalladio.g:4529:1: rule__Loop__Group_3__3__Impl : ( ( rule__Loop__Group_3_3__0 )* ) ;
    public final void rule__Loop__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4533:1: ( ( ( rule__Loop__Group_3_3__0 )* ) )
            // InternalSimplepalladio.g:4534:1: ( ( rule__Loop__Group_3_3__0 )* )
            {
            // InternalSimplepalladio.g:4534:1: ( ( rule__Loop__Group_3_3__0 )* )
            // InternalSimplepalladio.g:4535:2: ( rule__Loop__Group_3_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_3_3()); 
            // InternalSimplepalladio.g:4536:2: ( rule__Loop__Group_3_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSimplepalladio.g:4536:3: rule__Loop__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Loop__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__3__Impl"


    // $ANTLR start "rule__Loop__Group_3__4"
    // InternalSimplepalladio.g:4544:1: rule__Loop__Group_3__4 : rule__Loop__Group_3__4__Impl ;
    public final void rule__Loop__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4548:1: ( rule__Loop__Group_3__4__Impl )
            // InternalSimplepalladio.g:4549:2: rule__Loop__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__4"


    // $ANTLR start "rule__Loop__Group_3__4__Impl"
    // InternalSimplepalladio.g:4555:1: rule__Loop__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Loop__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4559:1: ( ( '}' ) )
            // InternalSimplepalladio.g:4560:1: ( '}' )
            {
            // InternalSimplepalladio.g:4560:1: ( '}' )
            // InternalSimplepalladio.g:4561:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3__4__Impl"


    // $ANTLR start "rule__Loop__Group_3_3__0"
    // InternalSimplepalladio.g:4571:1: rule__Loop__Group_3_3__0 : rule__Loop__Group_3_3__0__Impl rule__Loop__Group_3_3__1 ;
    public final void rule__Loop__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4575:1: ( rule__Loop__Group_3_3__0__Impl rule__Loop__Group_3_3__1 )
            // InternalSimplepalladio.g:4576:2: rule__Loop__Group_3_3__0__Impl rule__Loop__Group_3_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Loop__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3_3__0"


    // $ANTLR start "rule__Loop__Group_3_3__0__Impl"
    // InternalSimplepalladio.g:4583:1: rule__Loop__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4587:1: ( ( ',' ) )
            // InternalSimplepalladio.g:4588:1: ( ',' )
            {
            // InternalSimplepalladio.g:4588:1: ( ',' )
            // InternalSimplepalladio.g:4589:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_3_3__1"
    // InternalSimplepalladio.g:4598:1: rule__Loop__Group_3_3__1 : rule__Loop__Group_3_3__1__Impl ;
    public final void rule__Loop__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4602:1: ( rule__Loop__Group_3_3__1__Impl )
            // InternalSimplepalladio.g:4603:2: rule__Loop__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3_3__1"


    // $ANTLR start "rule__Loop__Group_3_3__1__Impl"
    // InternalSimplepalladio.g:4609:1: rule__Loop__Group_3_3__1__Impl : ( ( rule__Loop__BehaviorElementsAssignment_3_3_1 ) ) ;
    public final void rule__Loop__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4613:1: ( ( ( rule__Loop__BehaviorElementsAssignment_3_3_1 ) ) )
            // InternalSimplepalladio.g:4614:1: ( ( rule__Loop__BehaviorElementsAssignment_3_3_1 ) )
            {
            // InternalSimplepalladio.g:4614:1: ( ( rule__Loop__BehaviorElementsAssignment_3_3_1 ) )
            // InternalSimplepalladio.g:4615:2: ( rule__Loop__BehaviorElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getLoopAccess().getBehaviorElementsAssignment_3_3_1()); 
            // InternalSimplepalladio.g:4616:2: ( rule__Loop__BehaviorElementsAssignment_3_3_1 )
            // InternalSimplepalladio.g:4616:3: rule__Loop__BehaviorElementsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__BehaviorElementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getBehaviorElementsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group_3_3__1__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalSimplepalladio.g:4625:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4629:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalSimplepalladio.g:4630:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Branch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0"


    // $ANTLR start "rule__Branch__Group__0__Impl"
    // InternalSimplepalladio.g:4637:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4641:1: ( ( () ) )
            // InternalSimplepalladio.g:4642:1: ( () )
            {
            // InternalSimplepalladio.g:4642:1: ( () )
            // InternalSimplepalladio.g:4643:2: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // InternalSimplepalladio.g:4644:2: ()
            // InternalSimplepalladio.g:4644:3: 
            {
            }

             after(grammarAccess.getBranchAccess().getBranchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0__Impl"


    // $ANTLR start "rule__Branch__Group__1"
    // InternalSimplepalladio.g:4652:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl rule__Branch__Group__2 ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4656:1: ( rule__Branch__Group__1__Impl rule__Branch__Group__2 )
            // InternalSimplepalladio.g:4657:2: rule__Branch__Group__1__Impl rule__Branch__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Branch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1"


    // $ANTLR start "rule__Branch__Group__1__Impl"
    // InternalSimplepalladio.g:4664:1: rule__Branch__Group__1__Impl : ( 'Branch' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4668:1: ( ( 'Branch' ) )
            // InternalSimplepalladio.g:4669:1: ( 'Branch' )
            {
            // InternalSimplepalladio.g:4669:1: ( 'Branch' )
            // InternalSimplepalladio.g:4670:2: 'Branch'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getBranchKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1__Impl"


    // $ANTLR start "rule__Branch__Group__2"
    // InternalSimplepalladio.g:4679:1: rule__Branch__Group__2 : rule__Branch__Group__2__Impl rule__Branch__Group__3 ;
    public final void rule__Branch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4683:1: ( rule__Branch__Group__2__Impl rule__Branch__Group__3 )
            // InternalSimplepalladio.g:4684:2: rule__Branch__Group__2__Impl rule__Branch__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Branch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__2"


    // $ANTLR start "rule__Branch__Group__2__Impl"
    // InternalSimplepalladio.g:4691:1: rule__Branch__Group__2__Impl : ( '{' ) ;
    public final void rule__Branch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4695:1: ( ( '{' ) )
            // InternalSimplepalladio.g:4696:1: ( '{' )
            {
            // InternalSimplepalladio.g:4696:1: ( '{' )
            // InternalSimplepalladio.g:4697:2: '{'
            {
             before(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__2__Impl"


    // $ANTLR start "rule__Branch__Group__3"
    // InternalSimplepalladio.g:4706:1: rule__Branch__Group__3 : rule__Branch__Group__3__Impl rule__Branch__Group__4 ;
    public final void rule__Branch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4710:1: ( rule__Branch__Group__3__Impl rule__Branch__Group__4 )
            // InternalSimplepalladio.g:4711:2: rule__Branch__Group__3__Impl rule__Branch__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Branch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__3"


    // $ANTLR start "rule__Branch__Group__3__Impl"
    // InternalSimplepalladio.g:4718:1: rule__Branch__Group__3__Impl : ( ( rule__Branch__Group_3__0 )? ) ;
    public final void rule__Branch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4722:1: ( ( ( rule__Branch__Group_3__0 )? ) )
            // InternalSimplepalladio.g:4723:1: ( ( rule__Branch__Group_3__0 )? )
            {
            // InternalSimplepalladio.g:4723:1: ( ( rule__Branch__Group_3__0 )? )
            // InternalSimplepalladio.g:4724:2: ( rule__Branch__Group_3__0 )?
            {
             before(grammarAccess.getBranchAccess().getGroup_3()); 
            // InternalSimplepalladio.g:4725:2: ( rule__Branch__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSimplepalladio.g:4725:3: rule__Branch__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Branch__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__3__Impl"


    // $ANTLR start "rule__Branch__Group__4"
    // InternalSimplepalladio.g:4733:1: rule__Branch__Group__4 : rule__Branch__Group__4__Impl ;
    public final void rule__Branch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4737:1: ( rule__Branch__Group__4__Impl )
            // InternalSimplepalladio.g:4738:2: rule__Branch__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__4"


    // $ANTLR start "rule__Branch__Group__4__Impl"
    // InternalSimplepalladio.g:4744:1: rule__Branch__Group__4__Impl : ( '}' ) ;
    public final void rule__Branch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4748:1: ( ( '}' ) )
            // InternalSimplepalladio.g:4749:1: ( '}' )
            {
            // InternalSimplepalladio.g:4749:1: ( '}' )
            // InternalSimplepalladio.g:4750:2: '}'
            {
             before(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__4__Impl"


    // $ANTLR start "rule__Branch__Group_3__0"
    // InternalSimplepalladio.g:4760:1: rule__Branch__Group_3__0 : rule__Branch__Group_3__0__Impl rule__Branch__Group_3__1 ;
    public final void rule__Branch__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4764:1: ( rule__Branch__Group_3__0__Impl rule__Branch__Group_3__1 )
            // InternalSimplepalladio.g:4765:2: rule__Branch__Group_3__0__Impl rule__Branch__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Branch__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__0"


    // $ANTLR start "rule__Branch__Group_3__0__Impl"
    // InternalSimplepalladio.g:4772:1: rule__Branch__Group_3__0__Impl : ( 'behaviorElements' ) ;
    public final void rule__Branch__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4776:1: ( ( 'behaviorElements' ) )
            // InternalSimplepalladio.g:4777:1: ( 'behaviorElements' )
            {
            // InternalSimplepalladio.g:4777:1: ( 'behaviorElements' )
            // InternalSimplepalladio.g:4778:2: 'behaviorElements'
            {
             before(grammarAccess.getBranchAccess().getBehaviorElementsKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getBehaviorElementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__0__Impl"


    // $ANTLR start "rule__Branch__Group_3__1"
    // InternalSimplepalladio.g:4787:1: rule__Branch__Group_3__1 : rule__Branch__Group_3__1__Impl rule__Branch__Group_3__2 ;
    public final void rule__Branch__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4791:1: ( rule__Branch__Group_3__1__Impl rule__Branch__Group_3__2 )
            // InternalSimplepalladio.g:4792:2: rule__Branch__Group_3__1__Impl rule__Branch__Group_3__2
            {
            pushFollow(FOLLOW_31);
            rule__Branch__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__1"


    // $ANTLR start "rule__Branch__Group_3__1__Impl"
    // InternalSimplepalladio.g:4799:1: rule__Branch__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Branch__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4803:1: ( ( '{' ) )
            // InternalSimplepalladio.g:4804:1: ( '{' )
            {
            // InternalSimplepalladio.g:4804:1: ( '{' )
            // InternalSimplepalladio.g:4805:2: '{'
            {
             before(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__1__Impl"


    // $ANTLR start "rule__Branch__Group_3__2"
    // InternalSimplepalladio.g:4814:1: rule__Branch__Group_3__2 : rule__Branch__Group_3__2__Impl rule__Branch__Group_3__3 ;
    public final void rule__Branch__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4818:1: ( rule__Branch__Group_3__2__Impl rule__Branch__Group_3__3 )
            // InternalSimplepalladio.g:4819:2: rule__Branch__Group_3__2__Impl rule__Branch__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Branch__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__2"


    // $ANTLR start "rule__Branch__Group_3__2__Impl"
    // InternalSimplepalladio.g:4826:1: rule__Branch__Group_3__2__Impl : ( ( rule__Branch__BehaviorElementsAssignment_3_2 ) ) ;
    public final void rule__Branch__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4830:1: ( ( ( rule__Branch__BehaviorElementsAssignment_3_2 ) ) )
            // InternalSimplepalladio.g:4831:1: ( ( rule__Branch__BehaviorElementsAssignment_3_2 ) )
            {
            // InternalSimplepalladio.g:4831:1: ( ( rule__Branch__BehaviorElementsAssignment_3_2 ) )
            // InternalSimplepalladio.g:4832:2: ( rule__Branch__BehaviorElementsAssignment_3_2 )
            {
             before(grammarAccess.getBranchAccess().getBehaviorElementsAssignment_3_2()); 
            // InternalSimplepalladio.g:4833:2: ( rule__Branch__BehaviorElementsAssignment_3_2 )
            // InternalSimplepalladio.g:4833:3: rule__Branch__BehaviorElementsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Branch__BehaviorElementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getBehaviorElementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__2__Impl"


    // $ANTLR start "rule__Branch__Group_3__3"
    // InternalSimplepalladio.g:4841:1: rule__Branch__Group_3__3 : rule__Branch__Group_3__3__Impl rule__Branch__Group_3__4 ;
    public final void rule__Branch__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4845:1: ( rule__Branch__Group_3__3__Impl rule__Branch__Group_3__4 )
            // InternalSimplepalladio.g:4846:2: rule__Branch__Group_3__3__Impl rule__Branch__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__Branch__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__3"


    // $ANTLR start "rule__Branch__Group_3__3__Impl"
    // InternalSimplepalladio.g:4853:1: rule__Branch__Group_3__3__Impl : ( ( rule__Branch__Group_3_3__0 )* ) ;
    public final void rule__Branch__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4857:1: ( ( ( rule__Branch__Group_3_3__0 )* ) )
            // InternalSimplepalladio.g:4858:1: ( ( rule__Branch__Group_3_3__0 )* )
            {
            // InternalSimplepalladio.g:4858:1: ( ( rule__Branch__Group_3_3__0 )* )
            // InternalSimplepalladio.g:4859:2: ( rule__Branch__Group_3_3__0 )*
            {
             before(grammarAccess.getBranchAccess().getGroup_3_3()); 
            // InternalSimplepalladio.g:4860:2: ( rule__Branch__Group_3_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSimplepalladio.g:4860:3: rule__Branch__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Branch__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBranchAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__3__Impl"


    // $ANTLR start "rule__Branch__Group_3__4"
    // InternalSimplepalladio.g:4868:1: rule__Branch__Group_3__4 : rule__Branch__Group_3__4__Impl ;
    public final void rule__Branch__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4872:1: ( rule__Branch__Group_3__4__Impl )
            // InternalSimplepalladio.g:4873:2: rule__Branch__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__4"


    // $ANTLR start "rule__Branch__Group_3__4__Impl"
    // InternalSimplepalladio.g:4879:1: rule__Branch__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Branch__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4883:1: ( ( '}' ) )
            // InternalSimplepalladio.g:4884:1: ( '}' )
            {
            // InternalSimplepalladio.g:4884:1: ( '}' )
            // InternalSimplepalladio.g:4885:2: '}'
            {
             before(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3__4__Impl"


    // $ANTLR start "rule__Branch__Group_3_3__0"
    // InternalSimplepalladio.g:4895:1: rule__Branch__Group_3_3__0 : rule__Branch__Group_3_3__0__Impl rule__Branch__Group_3_3__1 ;
    public final void rule__Branch__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4899:1: ( rule__Branch__Group_3_3__0__Impl rule__Branch__Group_3_3__1 )
            // InternalSimplepalladio.g:4900:2: rule__Branch__Group_3_3__0__Impl rule__Branch__Group_3_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Branch__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3_3__0"


    // $ANTLR start "rule__Branch__Group_3_3__0__Impl"
    // InternalSimplepalladio.g:4907:1: rule__Branch__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Branch__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4911:1: ( ( ',' ) )
            // InternalSimplepalladio.g:4912:1: ( ',' )
            {
            // InternalSimplepalladio.g:4912:1: ( ',' )
            // InternalSimplepalladio.g:4913:2: ','
            {
             before(grammarAccess.getBranchAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3_3__0__Impl"


    // $ANTLR start "rule__Branch__Group_3_3__1"
    // InternalSimplepalladio.g:4922:1: rule__Branch__Group_3_3__1 : rule__Branch__Group_3_3__1__Impl ;
    public final void rule__Branch__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4926:1: ( rule__Branch__Group_3_3__1__Impl )
            // InternalSimplepalladio.g:4927:2: rule__Branch__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3_3__1"


    // $ANTLR start "rule__Branch__Group_3_3__1__Impl"
    // InternalSimplepalladio.g:4933:1: rule__Branch__Group_3_3__1__Impl : ( ( rule__Branch__BehaviorElementsAssignment_3_3_1 ) ) ;
    public final void rule__Branch__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4937:1: ( ( ( rule__Branch__BehaviorElementsAssignment_3_3_1 ) ) )
            // InternalSimplepalladio.g:4938:1: ( ( rule__Branch__BehaviorElementsAssignment_3_3_1 ) )
            {
            // InternalSimplepalladio.g:4938:1: ( ( rule__Branch__BehaviorElementsAssignment_3_3_1 ) )
            // InternalSimplepalladio.g:4939:2: ( rule__Branch__BehaviorElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getBranchAccess().getBehaviorElementsAssignment_3_3_1()); 
            // InternalSimplepalladio.g:4940:2: ( rule__Branch__BehaviorElementsAssignment_3_3_1 )
            // InternalSimplepalladio.g:4940:3: rule__Branch__BehaviorElementsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Branch__BehaviorElementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getBehaviorElementsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group_3_3__1__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__0"
    // InternalSimplepalladio.g:4949:1: rule__AssemblyViewType__Group__0 : rule__AssemblyViewType__Group__0__Impl rule__AssemblyViewType__Group__1 ;
    public final void rule__AssemblyViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4953:1: ( rule__AssemblyViewType__Group__0__Impl rule__AssemblyViewType__Group__1 )
            // InternalSimplepalladio.g:4954:2: rule__AssemblyViewType__Group__0__Impl rule__AssemblyViewType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AssemblyViewType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__0"


    // $ANTLR start "rule__AssemblyViewType__Group__0__Impl"
    // InternalSimplepalladio.g:4961:1: rule__AssemblyViewType__Group__0__Impl : ( 'AssemblyViewType' ) ;
    public final void rule__AssemblyViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4965:1: ( ( 'AssemblyViewType' ) )
            // InternalSimplepalladio.g:4966:1: ( 'AssemblyViewType' )
            {
            // InternalSimplepalladio.g:4966:1: ( 'AssemblyViewType' )
            // InternalSimplepalladio.g:4967:2: 'AssemblyViewType'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getAssemblyViewTypeKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAssemblyViewTypeAccess().getAssemblyViewTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__0__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__1"
    // InternalSimplepalladio.g:4976:1: rule__AssemblyViewType__Group__1 : rule__AssemblyViewType__Group__1__Impl rule__AssemblyViewType__Group__2 ;
    public final void rule__AssemblyViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4980:1: ( rule__AssemblyViewType__Group__1__Impl rule__AssemblyViewType__Group__2 )
            // InternalSimplepalladio.g:4981:2: rule__AssemblyViewType__Group__1__Impl rule__AssemblyViewType__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__AssemblyViewType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__1"


    // $ANTLR start "rule__AssemblyViewType__Group__1__Impl"
    // InternalSimplepalladio.g:4988:1: rule__AssemblyViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__AssemblyViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:4992:1: ( ( '{' ) )
            // InternalSimplepalladio.g:4993:1: ( '{' )
            {
            // InternalSimplepalladio.g:4993:1: ( '{' )
            // InternalSimplepalladio.g:4994:2: '{'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__1__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__2"
    // InternalSimplepalladio.g:5003:1: rule__AssemblyViewType__Group__2 : rule__AssemblyViewType__Group__2__Impl rule__AssemblyViewType__Group__3 ;
    public final void rule__AssemblyViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5007:1: ( rule__AssemblyViewType__Group__2__Impl rule__AssemblyViewType__Group__3 )
            // InternalSimplepalladio.g:5008:2: rule__AssemblyViewType__Group__2__Impl rule__AssemblyViewType__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AssemblyViewType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__2"


    // $ANTLR start "rule__AssemblyViewType__Group__2__Impl"
    // InternalSimplepalladio.g:5015:1: rule__AssemblyViewType__Group__2__Impl : ( 'systems' ) ;
    public final void rule__AssemblyViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5019:1: ( ( 'systems' ) )
            // InternalSimplepalladio.g:5020:1: ( 'systems' )
            {
            // InternalSimplepalladio.g:5020:1: ( 'systems' )
            // InternalSimplepalladio.g:5021:2: 'systems'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAssemblyViewTypeAccess().getSystemsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__2__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__3"
    // InternalSimplepalladio.g:5030:1: rule__AssemblyViewType__Group__3 : rule__AssemblyViewType__Group__3__Impl rule__AssemblyViewType__Group__4 ;
    public final void rule__AssemblyViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5034:1: ( rule__AssemblyViewType__Group__3__Impl rule__AssemblyViewType__Group__4 )
            // InternalSimplepalladio.g:5035:2: rule__AssemblyViewType__Group__3__Impl rule__AssemblyViewType__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__AssemblyViewType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__3"


    // $ANTLR start "rule__AssemblyViewType__Group__3__Impl"
    // InternalSimplepalladio.g:5042:1: rule__AssemblyViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__AssemblyViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5046:1: ( ( '{' ) )
            // InternalSimplepalladio.g:5047:1: ( '{' )
            {
            // InternalSimplepalladio.g:5047:1: ( '{' )
            // InternalSimplepalladio.g:5048:2: '{'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__3__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__4"
    // InternalSimplepalladio.g:5057:1: rule__AssemblyViewType__Group__4 : rule__AssemblyViewType__Group__4__Impl rule__AssemblyViewType__Group__5 ;
    public final void rule__AssemblyViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5061:1: ( rule__AssemblyViewType__Group__4__Impl rule__AssemblyViewType__Group__5 )
            // InternalSimplepalladio.g:5062:2: rule__AssemblyViewType__Group__4__Impl rule__AssemblyViewType__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__AssemblyViewType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__4"


    // $ANTLR start "rule__AssemblyViewType__Group__4__Impl"
    // InternalSimplepalladio.g:5069:1: rule__AssemblyViewType__Group__4__Impl : ( ( rule__AssemblyViewType__SystemsAssignment_4 ) ) ;
    public final void rule__AssemblyViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5073:1: ( ( ( rule__AssemblyViewType__SystemsAssignment_4 ) ) )
            // InternalSimplepalladio.g:5074:1: ( ( rule__AssemblyViewType__SystemsAssignment_4 ) )
            {
            // InternalSimplepalladio.g:5074:1: ( ( rule__AssemblyViewType__SystemsAssignment_4 ) )
            // InternalSimplepalladio.g:5075:2: ( rule__AssemblyViewType__SystemsAssignment_4 )
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_4()); 
            // InternalSimplepalladio.g:5076:2: ( rule__AssemblyViewType__SystemsAssignment_4 )
            // InternalSimplepalladio.g:5076:3: rule__AssemblyViewType__SystemsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__SystemsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__4__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__5"
    // InternalSimplepalladio.g:5084:1: rule__AssemblyViewType__Group__5 : rule__AssemblyViewType__Group__5__Impl rule__AssemblyViewType__Group__6 ;
    public final void rule__AssemblyViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5088:1: ( rule__AssemblyViewType__Group__5__Impl rule__AssemblyViewType__Group__6 )
            // InternalSimplepalladio.g:5089:2: rule__AssemblyViewType__Group__5__Impl rule__AssemblyViewType__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__AssemblyViewType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__5"


    // $ANTLR start "rule__AssemblyViewType__Group__5__Impl"
    // InternalSimplepalladio.g:5096:1: rule__AssemblyViewType__Group__5__Impl : ( ( rule__AssemblyViewType__Group_5__0 )* ) ;
    public final void rule__AssemblyViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5100:1: ( ( ( rule__AssemblyViewType__Group_5__0 )* ) )
            // InternalSimplepalladio.g:5101:1: ( ( rule__AssemblyViewType__Group_5__0 )* )
            {
            // InternalSimplepalladio.g:5101:1: ( ( rule__AssemblyViewType__Group_5__0 )* )
            // InternalSimplepalladio.g:5102:2: ( rule__AssemblyViewType__Group_5__0 )*
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getGroup_5()); 
            // InternalSimplepalladio.g:5103:2: ( rule__AssemblyViewType__Group_5__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==26) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSimplepalladio.g:5103:3: rule__AssemblyViewType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AssemblyViewType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAssemblyViewTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__5__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__6"
    // InternalSimplepalladio.g:5111:1: rule__AssemblyViewType__Group__6 : rule__AssemblyViewType__Group__6__Impl rule__AssemblyViewType__Group__7 ;
    public final void rule__AssemblyViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5115:1: ( rule__AssemblyViewType__Group__6__Impl rule__AssemblyViewType__Group__7 )
            // InternalSimplepalladio.g:5116:2: rule__AssemblyViewType__Group__6__Impl rule__AssemblyViewType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AssemblyViewType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__6"


    // $ANTLR start "rule__AssemblyViewType__Group__6__Impl"
    // InternalSimplepalladio.g:5123:1: rule__AssemblyViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__AssemblyViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5127:1: ( ( '}' ) )
            // InternalSimplepalladio.g:5128:1: ( '}' )
            {
            // InternalSimplepalladio.g:5128:1: ( '}' )
            // InternalSimplepalladio.g:5129:2: '}'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__6__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group__7"
    // InternalSimplepalladio.g:5138:1: rule__AssemblyViewType__Group__7 : rule__AssemblyViewType__Group__7__Impl ;
    public final void rule__AssemblyViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5142:1: ( rule__AssemblyViewType__Group__7__Impl )
            // InternalSimplepalladio.g:5143:2: rule__AssemblyViewType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__7"


    // $ANTLR start "rule__AssemblyViewType__Group__7__Impl"
    // InternalSimplepalladio.g:5149:1: rule__AssemblyViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5153:1: ( ( '}' ) )
            // InternalSimplepalladio.g:5154:1: ( '}' )
            {
            // InternalSimplepalladio.g:5154:1: ( '}' )
            // InternalSimplepalladio.g:5155:2: '}'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group__7__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group_5__0"
    // InternalSimplepalladio.g:5165:1: rule__AssemblyViewType__Group_5__0 : rule__AssemblyViewType__Group_5__0__Impl rule__AssemblyViewType__Group_5__1 ;
    public final void rule__AssemblyViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5169:1: ( rule__AssemblyViewType__Group_5__0__Impl rule__AssemblyViewType__Group_5__1 )
            // InternalSimplepalladio.g:5170:2: rule__AssemblyViewType__Group_5__0__Impl rule__AssemblyViewType__Group_5__1
            {
            pushFollow(FOLLOW_36);
            rule__AssemblyViewType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group_5__0"


    // $ANTLR start "rule__AssemblyViewType__Group_5__0__Impl"
    // InternalSimplepalladio.g:5177:1: rule__AssemblyViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__AssemblyViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5181:1: ( ( ',' ) )
            // InternalSimplepalladio.g:5182:1: ( ',' )
            {
            // InternalSimplepalladio.g:5182:1: ( ',' )
            // InternalSimplepalladio.g:5183:2: ','
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAssemblyViewTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group_5__0__Impl"


    // $ANTLR start "rule__AssemblyViewType__Group_5__1"
    // InternalSimplepalladio.g:5192:1: rule__AssemblyViewType__Group_5__1 : rule__AssemblyViewType__Group_5__1__Impl ;
    public final void rule__AssemblyViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5196:1: ( rule__AssemblyViewType__Group_5__1__Impl )
            // InternalSimplepalladio.g:5197:2: rule__AssemblyViewType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group_5__1"


    // $ANTLR start "rule__AssemblyViewType__Group_5__1__Impl"
    // InternalSimplepalladio.g:5203:1: rule__AssemblyViewType__Group_5__1__Impl : ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) ) ;
    public final void rule__AssemblyViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5207:1: ( ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) ) )
            // InternalSimplepalladio.g:5208:1: ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) )
            {
            // InternalSimplepalladio.g:5208:1: ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) )
            // InternalSimplepalladio.g:5209:2: ( rule__AssemblyViewType__SystemsAssignment_5_1 )
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_5_1()); 
            // InternalSimplepalladio.g:5210:2: ( rule__AssemblyViewType__SystemsAssignment_5_1 )
            // InternalSimplepalladio.g:5210:3: rule__AssemblyViewType__SystemsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyViewType__SystemsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__Group_5__1__Impl"


    // $ANTLR start "rule__System__Group__0"
    // InternalSimplepalladio.g:5219:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5223:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalSimplepalladio.g:5224:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalSimplepalladio.g:5231:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5235:1: ( ( 'System' ) )
            // InternalSimplepalladio.g:5236:1: ( 'System' )
            {
            // InternalSimplepalladio.g:5236:1: ( 'System' )
            // InternalSimplepalladio.g:5237:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalSimplepalladio.g:5246:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5250:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalSimplepalladio.g:5251:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalSimplepalladio.g:5258:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5262:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:5263:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:5263:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalSimplepalladio.g:5264:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:5265:2: ( rule__System__NameAssignment_1 )
            // InternalSimplepalladio.g:5265:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalSimplepalladio.g:5273:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5277:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalSimplepalladio.g:5278:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalSimplepalladio.g:5285:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5289:1: ( ( '{' ) )
            // InternalSimplepalladio.g:5290:1: ( '{' )
            {
            // InternalSimplepalladio.g:5290:1: ( '{' )
            // InternalSimplepalladio.g:5291:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalSimplepalladio.g:5300:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5304:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalSimplepalladio.g:5305:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalSimplepalladio.g:5312:1: rule__System__Group__3__Impl : ( ( rule__System__Group_3__0 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5316:1: ( ( ( rule__System__Group_3__0 )? ) )
            // InternalSimplepalladio.g:5317:1: ( ( rule__System__Group_3__0 )? )
            {
            // InternalSimplepalladio.g:5317:1: ( ( rule__System__Group_3__0 )? )
            // InternalSimplepalladio.g:5318:2: ( rule__System__Group_3__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_3()); 
            // InternalSimplepalladio.g:5319:2: ( rule__System__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSimplepalladio.g:5319:3: rule__System__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalSimplepalladio.g:5327:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5331:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalSimplepalladio.g:5332:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalSimplepalladio.g:5339:1: rule__System__Group__4__Impl : ( 'providedInterfaces' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5343:1: ( ( 'providedInterfaces' ) )
            // InternalSimplepalladio.g:5344:1: ( 'providedInterfaces' )
            {
            // InternalSimplepalladio.g:5344:1: ( 'providedInterfaces' )
            // InternalSimplepalladio.g:5345:2: 'providedInterfaces'
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalSimplepalladio.g:5354:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5358:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalSimplepalladio.g:5359:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalSimplepalladio.g:5366:1: rule__System__Group__5__Impl : ( '(' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5370:1: ( ( '(' ) )
            // InternalSimplepalladio.g:5371:1: ( '(' )
            {
            // InternalSimplepalladio.g:5371:1: ( '(' )
            // InternalSimplepalladio.g:5372:2: '('
            {
             before(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // InternalSimplepalladio.g:5381:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5385:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalSimplepalladio.g:5386:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__System__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // InternalSimplepalladio.g:5393:1: rule__System__Group__6__Impl : ( ( rule__System__ProvidedInterfacesAssignment_6 ) ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5397:1: ( ( ( rule__System__ProvidedInterfacesAssignment_6 ) ) )
            // InternalSimplepalladio.g:5398:1: ( ( rule__System__ProvidedInterfacesAssignment_6 ) )
            {
            // InternalSimplepalladio.g:5398:1: ( ( rule__System__ProvidedInterfacesAssignment_6 ) )
            // InternalSimplepalladio.g:5399:2: ( rule__System__ProvidedInterfacesAssignment_6 )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_6()); 
            // InternalSimplepalladio.g:5400:2: ( rule__System__ProvidedInterfacesAssignment_6 )
            // InternalSimplepalladio.g:5400:3: rule__System__ProvidedInterfacesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedInterfacesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group__7"
    // InternalSimplepalladio.g:5408:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5412:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalSimplepalladio.g:5413:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__System__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7"


    // $ANTLR start "rule__System__Group__7__Impl"
    // InternalSimplepalladio.g:5420:1: rule__System__Group__7__Impl : ( ( rule__System__Group_7__0 )* ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5424:1: ( ( ( rule__System__Group_7__0 )* ) )
            // InternalSimplepalladio.g:5425:1: ( ( rule__System__Group_7__0 )* )
            {
            // InternalSimplepalladio.g:5425:1: ( ( rule__System__Group_7__0 )* )
            // InternalSimplepalladio.g:5426:2: ( rule__System__Group_7__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_7()); 
            // InternalSimplepalladio.g:5427:2: ( rule__System__Group_7__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSimplepalladio.g:5427:3: rule__System__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__System__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7__Impl"


    // $ANTLR start "rule__System__Group__8"
    // InternalSimplepalladio.g:5435:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5439:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalSimplepalladio.g:5440:2: rule__System__Group__8__Impl rule__System__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__System__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8"


    // $ANTLR start "rule__System__Group__8__Impl"
    // InternalSimplepalladio.g:5447:1: rule__System__Group__8__Impl : ( ')' ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5451:1: ( ( ')' ) )
            // InternalSimplepalladio.g:5452:1: ( ')' )
            {
            // InternalSimplepalladio.g:5452:1: ( ')' )
            // InternalSimplepalladio.g:5453:2: ')'
            {
             before(grammarAccess.getSystemAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8__Impl"


    // $ANTLR start "rule__System__Group__9"
    // InternalSimplepalladio.g:5462:1: rule__System__Group__9 : rule__System__Group__9__Impl rule__System__Group__10 ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5466:1: ( rule__System__Group__9__Impl rule__System__Group__10 )
            // InternalSimplepalladio.g:5467:2: rule__System__Group__9__Impl rule__System__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__System__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9"


    // $ANTLR start "rule__System__Group__9__Impl"
    // InternalSimplepalladio.g:5474:1: rule__System__Group__9__Impl : ( 'systemElements' ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5478:1: ( ( 'systemElements' ) )
            // InternalSimplepalladio.g:5479:1: ( 'systemElements' )
            {
            // InternalSimplepalladio.g:5479:1: ( 'systemElements' )
            // InternalSimplepalladio.g:5480:2: 'systemElements'
            {
             before(grammarAccess.getSystemAccess().getSystemElementsKeyword_9()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemElementsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9__Impl"


    // $ANTLR start "rule__System__Group__10"
    // InternalSimplepalladio.g:5489:1: rule__System__Group__10 : rule__System__Group__10__Impl rule__System__Group__11 ;
    public final void rule__System__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5493:1: ( rule__System__Group__10__Impl rule__System__Group__11 )
            // InternalSimplepalladio.g:5494:2: rule__System__Group__10__Impl rule__System__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__System__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10"


    // $ANTLR start "rule__System__Group__10__Impl"
    // InternalSimplepalladio.g:5501:1: rule__System__Group__10__Impl : ( '{' ) ;
    public final void rule__System__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5505:1: ( ( '{' ) )
            // InternalSimplepalladio.g:5506:1: ( '{' )
            {
            // InternalSimplepalladio.g:5506:1: ( '{' )
            // InternalSimplepalladio.g:5507:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10__Impl"


    // $ANTLR start "rule__System__Group__11"
    // InternalSimplepalladio.g:5516:1: rule__System__Group__11 : rule__System__Group__11__Impl rule__System__Group__12 ;
    public final void rule__System__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5520:1: ( rule__System__Group__11__Impl rule__System__Group__12 )
            // InternalSimplepalladio.g:5521:2: rule__System__Group__11__Impl rule__System__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__System__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11"


    // $ANTLR start "rule__System__Group__11__Impl"
    // InternalSimplepalladio.g:5528:1: rule__System__Group__11__Impl : ( ( rule__System__SystemElementsAssignment_11 ) ) ;
    public final void rule__System__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5532:1: ( ( ( rule__System__SystemElementsAssignment_11 ) ) )
            // InternalSimplepalladio.g:5533:1: ( ( rule__System__SystemElementsAssignment_11 ) )
            {
            // InternalSimplepalladio.g:5533:1: ( ( rule__System__SystemElementsAssignment_11 ) )
            // InternalSimplepalladio.g:5534:2: ( rule__System__SystemElementsAssignment_11 )
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAssignment_11()); 
            // InternalSimplepalladio.g:5535:2: ( rule__System__SystemElementsAssignment_11 )
            // InternalSimplepalladio.g:5535:3: rule__System__SystemElementsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__System__SystemElementsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemElementsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11__Impl"


    // $ANTLR start "rule__System__Group__12"
    // InternalSimplepalladio.g:5543:1: rule__System__Group__12 : rule__System__Group__12__Impl rule__System__Group__13 ;
    public final void rule__System__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5547:1: ( rule__System__Group__12__Impl rule__System__Group__13 )
            // InternalSimplepalladio.g:5548:2: rule__System__Group__12__Impl rule__System__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__System__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__12"


    // $ANTLR start "rule__System__Group__12__Impl"
    // InternalSimplepalladio.g:5555:1: rule__System__Group__12__Impl : ( ( rule__System__Group_12__0 )* ) ;
    public final void rule__System__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5559:1: ( ( ( rule__System__Group_12__0 )* ) )
            // InternalSimplepalladio.g:5560:1: ( ( rule__System__Group_12__0 )* )
            {
            // InternalSimplepalladio.g:5560:1: ( ( rule__System__Group_12__0 )* )
            // InternalSimplepalladio.g:5561:2: ( rule__System__Group_12__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_12()); 
            // InternalSimplepalladio.g:5562:2: ( rule__System__Group_12__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSimplepalladio.g:5562:3: rule__System__Group_12__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__System__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__12__Impl"


    // $ANTLR start "rule__System__Group__13"
    // InternalSimplepalladio.g:5570:1: rule__System__Group__13 : rule__System__Group__13__Impl rule__System__Group__14 ;
    public final void rule__System__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5574:1: ( rule__System__Group__13__Impl rule__System__Group__14 )
            // InternalSimplepalladio.g:5575:2: rule__System__Group__13__Impl rule__System__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__System__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__13"


    // $ANTLR start "rule__System__Group__13__Impl"
    // InternalSimplepalladio.g:5582:1: rule__System__Group__13__Impl : ( '}' ) ;
    public final void rule__System__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5586:1: ( ( '}' ) )
            // InternalSimplepalladio.g:5587:1: ( '}' )
            {
            // InternalSimplepalladio.g:5587:1: ( '}' )
            // InternalSimplepalladio.g:5588:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_13()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__13__Impl"


    // $ANTLR start "rule__System__Group__14"
    // InternalSimplepalladio.g:5597:1: rule__System__Group__14 : rule__System__Group__14__Impl ;
    public final void rule__System__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5601:1: ( rule__System__Group__14__Impl )
            // InternalSimplepalladio.g:5602:2: rule__System__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__14"


    // $ANTLR start "rule__System__Group__14__Impl"
    // InternalSimplepalladio.g:5608:1: rule__System__Group__14__Impl : ( '}' ) ;
    public final void rule__System__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5612:1: ( ( '}' ) )
            // InternalSimplepalladio.g:5613:1: ( '}' )
            {
            // InternalSimplepalladio.g:5613:1: ( '}' )
            // InternalSimplepalladio.g:5614:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__14__Impl"


    // $ANTLR start "rule__System__Group_3__0"
    // InternalSimplepalladio.g:5624:1: rule__System__Group_3__0 : rule__System__Group_3__0__Impl rule__System__Group_3__1 ;
    public final void rule__System__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5628:1: ( rule__System__Group_3__0__Impl rule__System__Group_3__1 )
            // InternalSimplepalladio.g:5629:2: rule__System__Group_3__0__Impl rule__System__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__System__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__0"


    // $ANTLR start "rule__System__Group_3__0__Impl"
    // InternalSimplepalladio.g:5636:1: rule__System__Group_3__0__Impl : ( 'requiredInterfaces' ) ;
    public final void rule__System__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5640:1: ( ( 'requiredInterfaces' ) )
            // InternalSimplepalladio.g:5641:1: ( 'requiredInterfaces' )
            {
            // InternalSimplepalladio.g:5641:1: ( 'requiredInterfaces' )
            // InternalSimplepalladio.g:5642:2: 'requiredInterfaces'
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRequiredInterfacesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__0__Impl"


    // $ANTLR start "rule__System__Group_3__1"
    // InternalSimplepalladio.g:5651:1: rule__System__Group_3__1 : rule__System__Group_3__1__Impl rule__System__Group_3__2 ;
    public final void rule__System__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5655:1: ( rule__System__Group_3__1__Impl rule__System__Group_3__2 )
            // InternalSimplepalladio.g:5656:2: rule__System__Group_3__1__Impl rule__System__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__1"


    // $ANTLR start "rule__System__Group_3__1__Impl"
    // InternalSimplepalladio.g:5663:1: rule__System__Group_3__1__Impl : ( '(' ) ;
    public final void rule__System__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5667:1: ( ( '(' ) )
            // InternalSimplepalladio.g:5668:1: ( '(' )
            {
            // InternalSimplepalladio.g:5668:1: ( '(' )
            // InternalSimplepalladio.g:5669:2: '('
            {
             before(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__1__Impl"


    // $ANTLR start "rule__System__Group_3__2"
    // InternalSimplepalladio.g:5678:1: rule__System__Group_3__2 : rule__System__Group_3__2__Impl rule__System__Group_3__3 ;
    public final void rule__System__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5682:1: ( rule__System__Group_3__2__Impl rule__System__Group_3__3 )
            // InternalSimplepalladio.g:5683:2: rule__System__Group_3__2__Impl rule__System__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__System__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__2"


    // $ANTLR start "rule__System__Group_3__2__Impl"
    // InternalSimplepalladio.g:5690:1: rule__System__Group_3__2__Impl : ( ( rule__System__RequiredInterfacesAssignment_3_2 ) ) ;
    public final void rule__System__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5694:1: ( ( ( rule__System__RequiredInterfacesAssignment_3_2 ) ) )
            // InternalSimplepalladio.g:5695:1: ( ( rule__System__RequiredInterfacesAssignment_3_2 ) )
            {
            // InternalSimplepalladio.g:5695:1: ( ( rule__System__RequiredInterfacesAssignment_3_2 ) )
            // InternalSimplepalladio.g:5696:2: ( rule__System__RequiredInterfacesAssignment_3_2 )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_3_2()); 
            // InternalSimplepalladio.g:5697:2: ( rule__System__RequiredInterfacesAssignment_3_2 )
            // InternalSimplepalladio.g:5697:3: rule__System__RequiredInterfacesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__System__RequiredInterfacesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__2__Impl"


    // $ANTLR start "rule__System__Group_3__3"
    // InternalSimplepalladio.g:5705:1: rule__System__Group_3__3 : rule__System__Group_3__3__Impl rule__System__Group_3__4 ;
    public final void rule__System__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5709:1: ( rule__System__Group_3__3__Impl rule__System__Group_3__4 )
            // InternalSimplepalladio.g:5710:2: rule__System__Group_3__3__Impl rule__System__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__System__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__3"


    // $ANTLR start "rule__System__Group_3__3__Impl"
    // InternalSimplepalladio.g:5717:1: rule__System__Group_3__3__Impl : ( ( rule__System__Group_3_3__0 )* ) ;
    public final void rule__System__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5721:1: ( ( ( rule__System__Group_3_3__0 )* ) )
            // InternalSimplepalladio.g:5722:1: ( ( rule__System__Group_3_3__0 )* )
            {
            // InternalSimplepalladio.g:5722:1: ( ( rule__System__Group_3_3__0 )* )
            // InternalSimplepalladio.g:5723:2: ( rule__System__Group_3_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_3_3()); 
            // InternalSimplepalladio.g:5724:2: ( rule__System__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSimplepalladio.g:5724:3: rule__System__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__System__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__3__Impl"


    // $ANTLR start "rule__System__Group_3__4"
    // InternalSimplepalladio.g:5732:1: rule__System__Group_3__4 : rule__System__Group_3__4__Impl ;
    public final void rule__System__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5736:1: ( rule__System__Group_3__4__Impl )
            // InternalSimplepalladio.g:5737:2: rule__System__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__4"


    // $ANTLR start "rule__System__Group_3__4__Impl"
    // InternalSimplepalladio.g:5743:1: rule__System__Group_3__4__Impl : ( ')' ) ;
    public final void rule__System__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5747:1: ( ( ')' ) )
            // InternalSimplepalladio.g:5748:1: ( ')' )
            {
            // InternalSimplepalladio.g:5748:1: ( ')' )
            // InternalSimplepalladio.g:5749:2: ')'
            {
             before(grammarAccess.getSystemAccess().getRightParenthesisKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3__4__Impl"


    // $ANTLR start "rule__System__Group_3_3__0"
    // InternalSimplepalladio.g:5759:1: rule__System__Group_3_3__0 : rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 ;
    public final void rule__System__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5763:1: ( rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 )
            // InternalSimplepalladio.g:5764:2: rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3_3__0"


    // $ANTLR start "rule__System__Group_3_3__0__Impl"
    // InternalSimplepalladio.g:5771:1: rule__System__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5775:1: ( ( ',' ) )
            // InternalSimplepalladio.g:5776:1: ( ',' )
            {
            // InternalSimplepalladio.g:5776:1: ( ',' )
            // InternalSimplepalladio.g:5777:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3_3__0__Impl"


    // $ANTLR start "rule__System__Group_3_3__1"
    // InternalSimplepalladio.g:5786:1: rule__System__Group_3_3__1 : rule__System__Group_3_3__1__Impl ;
    public final void rule__System__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5790:1: ( rule__System__Group_3_3__1__Impl )
            // InternalSimplepalladio.g:5791:2: rule__System__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3_3__1"


    // $ANTLR start "rule__System__Group_3_3__1__Impl"
    // InternalSimplepalladio.g:5797:1: rule__System__Group_3_3__1__Impl : ( ( rule__System__RequiredInterfacesAssignment_3_3_1 ) ) ;
    public final void rule__System__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5801:1: ( ( ( rule__System__RequiredInterfacesAssignment_3_3_1 ) ) )
            // InternalSimplepalladio.g:5802:1: ( ( rule__System__RequiredInterfacesAssignment_3_3_1 ) )
            {
            // InternalSimplepalladio.g:5802:1: ( ( rule__System__RequiredInterfacesAssignment_3_3_1 ) )
            // InternalSimplepalladio.g:5803:2: ( rule__System__RequiredInterfacesAssignment_3_3_1 )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_3_3_1()); 
            // InternalSimplepalladio.g:5804:2: ( rule__System__RequiredInterfacesAssignment_3_3_1 )
            // InternalSimplepalladio.g:5804:3: rule__System__RequiredInterfacesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__RequiredInterfacesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_3_3__1__Impl"


    // $ANTLR start "rule__System__Group_7__0"
    // InternalSimplepalladio.g:5813:1: rule__System__Group_7__0 : rule__System__Group_7__0__Impl rule__System__Group_7__1 ;
    public final void rule__System__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5817:1: ( rule__System__Group_7__0__Impl rule__System__Group_7__1 )
            // InternalSimplepalladio.g:5818:2: rule__System__Group_7__0__Impl rule__System__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__System__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__0"


    // $ANTLR start "rule__System__Group_7__0__Impl"
    // InternalSimplepalladio.g:5825:1: rule__System__Group_7__0__Impl : ( ',' ) ;
    public final void rule__System__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5829:1: ( ( ',' ) )
            // InternalSimplepalladio.g:5830:1: ( ',' )
            {
            // InternalSimplepalladio.g:5830:1: ( ',' )
            // InternalSimplepalladio.g:5831:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__0__Impl"


    // $ANTLR start "rule__System__Group_7__1"
    // InternalSimplepalladio.g:5840:1: rule__System__Group_7__1 : rule__System__Group_7__1__Impl ;
    public final void rule__System__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5844:1: ( rule__System__Group_7__1__Impl )
            // InternalSimplepalladio.g:5845:2: rule__System__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__1"


    // $ANTLR start "rule__System__Group_7__1__Impl"
    // InternalSimplepalladio.g:5851:1: rule__System__Group_7__1__Impl : ( ( rule__System__ProvidedInterfacesAssignment_7_1 ) ) ;
    public final void rule__System__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5855:1: ( ( ( rule__System__ProvidedInterfacesAssignment_7_1 ) ) )
            // InternalSimplepalladio.g:5856:1: ( ( rule__System__ProvidedInterfacesAssignment_7_1 ) )
            {
            // InternalSimplepalladio.g:5856:1: ( ( rule__System__ProvidedInterfacesAssignment_7_1 ) )
            // InternalSimplepalladio.g:5857:2: ( rule__System__ProvidedInterfacesAssignment_7_1 )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_7_1()); 
            // InternalSimplepalladio.g:5858:2: ( rule__System__ProvidedInterfacesAssignment_7_1 )
            // InternalSimplepalladio.g:5858:3: rule__System__ProvidedInterfacesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedInterfacesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__1__Impl"


    // $ANTLR start "rule__System__Group_12__0"
    // InternalSimplepalladio.g:5867:1: rule__System__Group_12__0 : rule__System__Group_12__0__Impl rule__System__Group_12__1 ;
    public final void rule__System__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5871:1: ( rule__System__Group_12__0__Impl rule__System__Group_12__1 )
            // InternalSimplepalladio.g:5872:2: rule__System__Group_12__0__Impl rule__System__Group_12__1
            {
            pushFollow(FOLLOW_38);
            rule__System__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_12__0"


    // $ANTLR start "rule__System__Group_12__0__Impl"
    // InternalSimplepalladio.g:5879:1: rule__System__Group_12__0__Impl : ( ',' ) ;
    public final void rule__System__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5883:1: ( ( ',' ) )
            // InternalSimplepalladio.g:5884:1: ( ',' )
            {
            // InternalSimplepalladio.g:5884:1: ( ',' )
            // InternalSimplepalladio.g:5885:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_12_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_12__0__Impl"


    // $ANTLR start "rule__System__Group_12__1"
    // InternalSimplepalladio.g:5894:1: rule__System__Group_12__1 : rule__System__Group_12__1__Impl ;
    public final void rule__System__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5898:1: ( rule__System__Group_12__1__Impl )
            // InternalSimplepalladio.g:5899:2: rule__System__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_12__1"


    // $ANTLR start "rule__System__Group_12__1__Impl"
    // InternalSimplepalladio.g:5905:1: rule__System__Group_12__1__Impl : ( ( rule__System__SystemElementsAssignment_12_1 ) ) ;
    public final void rule__System__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5909:1: ( ( ( rule__System__SystemElementsAssignment_12_1 ) ) )
            // InternalSimplepalladio.g:5910:1: ( ( rule__System__SystemElementsAssignment_12_1 ) )
            {
            // InternalSimplepalladio.g:5910:1: ( ( rule__System__SystemElementsAssignment_12_1 ) )
            // InternalSimplepalladio.g:5911:2: ( rule__System__SystemElementsAssignment_12_1 )
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAssignment_12_1()); 
            // InternalSimplepalladio.g:5912:2: ( rule__System__SystemElementsAssignment_12_1 )
            // InternalSimplepalladio.g:5912:3: rule__System__SystemElementsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__System__SystemElementsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemElementsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_12__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalSimplepalladio.g:5921:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5925:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalSimplepalladio.g:5926:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0"


    // $ANTLR start "rule__AssemblyContext__Group__0__Impl"
    // InternalSimplepalladio.g:5933:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5937:1: ( ( 'AssemblyContext' ) )
            // InternalSimplepalladio.g:5938:1: ( 'AssemblyContext' )
            {
            // InternalSimplepalladio.g:5938:1: ( 'AssemblyContext' )
            // InternalSimplepalladio.g:5939:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__1"
    // InternalSimplepalladio.g:5948:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5952:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalSimplepalladio.g:5953:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AssemblyContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1"


    // $ANTLR start "rule__AssemblyContext__Group__1__Impl"
    // InternalSimplepalladio.g:5960:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5964:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:5965:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:5965:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalSimplepalladio.g:5966:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:5967:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalSimplepalladio.g:5967:3: rule__AssemblyContext__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__2"
    // InternalSimplepalladio.g:5975:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5979:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalSimplepalladio.g:5980:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__AssemblyContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2"


    // $ANTLR start "rule__AssemblyContext__Group__2__Impl"
    // InternalSimplepalladio.g:5987:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:5991:1: ( ( '{' ) )
            // InternalSimplepalladio.g:5992:1: ( '{' )
            {
            // InternalSimplepalladio.g:5992:1: ( '{' )
            // InternalSimplepalladio.g:5993:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__3"
    // InternalSimplepalladio.g:6002:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6006:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalSimplepalladio.g:6007:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3"


    // $ANTLR start "rule__AssemblyContext__Group__3__Impl"
    // InternalSimplepalladio.g:6014:1: rule__AssemblyContext__Group__3__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6018:1: ( ( 'component' ) )
            // InternalSimplepalladio.g:6019:1: ( 'component' )
            {
            // InternalSimplepalladio.g:6019:1: ( 'component' )
            // InternalSimplepalladio.g:6020:2: 'component'
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__4"
    // InternalSimplepalladio.g:6029:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6033:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalSimplepalladio.g:6034:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__AssemblyContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4"


    // $ANTLR start "rule__AssemblyContext__Group__4__Impl"
    // InternalSimplepalladio.g:6041:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6045:1: ( ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) )
            // InternalSimplepalladio.g:6046:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            {
            // InternalSimplepalladio.g:6046:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            // InternalSimplepalladio.g:6047:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 
            // InternalSimplepalladio.g:6048:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            // InternalSimplepalladio.g:6048:3: rule__AssemblyContext__ComponentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ComponentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__5"
    // InternalSimplepalladio.g:6056:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6060:1: ( rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 )
            // InternalSimplepalladio.g:6061:2: rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5"


    // $ANTLR start "rule__AssemblyContext__Group__5__Impl"
    // InternalSimplepalladio.g:6068:1: rule__AssemblyContext__Group__5__Impl : ( 'providedRoles' ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6072:1: ( ( 'providedRoles' ) )
            // InternalSimplepalladio.g:6073:1: ( 'providedRoles' )
            {
            // InternalSimplepalladio.g:6073:1: ( 'providedRoles' )
            // InternalSimplepalladio.g:6074:2: 'providedRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__6"
    // InternalSimplepalladio.g:6083:1: rule__AssemblyContext__Group__6 : rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 ;
    public final void rule__AssemblyContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6087:1: ( rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 )
            // InternalSimplepalladio.g:6088:2: rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__6"


    // $ANTLR start "rule__AssemblyContext__Group__6__Impl"
    // InternalSimplepalladio.g:6095:1: rule__AssemblyContext__Group__6__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6099:1: ( ( '(' ) )
            // InternalSimplepalladio.g:6100:1: ( '(' )
            {
            // InternalSimplepalladio.g:6100:1: ( '(' )
            // InternalSimplepalladio.g:6101:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__6__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__7"
    // InternalSimplepalladio.g:6110:1: rule__AssemblyContext__Group__7 : rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8 ;
    public final void rule__AssemblyContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6114:1: ( rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8 )
            // InternalSimplepalladio.g:6115:2: rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__7"


    // $ANTLR start "rule__AssemblyContext__Group__7__Impl"
    // InternalSimplepalladio.g:6122:1: rule__AssemblyContext__Group__7__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) ) ;
    public final void rule__AssemblyContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6126:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) ) )
            // InternalSimplepalladio.g:6127:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) )
            {
            // InternalSimplepalladio.g:6127:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) )
            // InternalSimplepalladio.g:6128:2: ( rule__AssemblyContext__ProvidedRolesAssignment_7 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_7()); 
            // InternalSimplepalladio.g:6129:2: ( rule__AssemblyContext__ProvidedRolesAssignment_7 )
            // InternalSimplepalladio.g:6129:3: rule__AssemblyContext__ProvidedRolesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRolesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__7__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__8"
    // InternalSimplepalladio.g:6137:1: rule__AssemblyContext__Group__8 : rule__AssemblyContext__Group__8__Impl rule__AssemblyContext__Group__9 ;
    public final void rule__AssemblyContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6141:1: ( rule__AssemblyContext__Group__8__Impl rule__AssemblyContext__Group__9 )
            // InternalSimplepalladio.g:6142:2: rule__AssemblyContext__Group__8__Impl rule__AssemblyContext__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__8"


    // $ANTLR start "rule__AssemblyContext__Group__8__Impl"
    // InternalSimplepalladio.g:6149:1: rule__AssemblyContext__Group__8__Impl : ( ( rule__AssemblyContext__Group_8__0 )* ) ;
    public final void rule__AssemblyContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6153:1: ( ( ( rule__AssemblyContext__Group_8__0 )* ) )
            // InternalSimplepalladio.g:6154:1: ( ( rule__AssemblyContext__Group_8__0 )* )
            {
            // InternalSimplepalladio.g:6154:1: ( ( rule__AssemblyContext__Group_8__0 )* )
            // InternalSimplepalladio.g:6155:2: ( rule__AssemblyContext__Group_8__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_8()); 
            // InternalSimplepalladio.g:6156:2: ( rule__AssemblyContext__Group_8__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSimplepalladio.g:6156:3: rule__AssemblyContext__Group_8__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AssemblyContext__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__8__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__9"
    // InternalSimplepalladio.g:6164:1: rule__AssemblyContext__Group__9 : rule__AssemblyContext__Group__9__Impl rule__AssemblyContext__Group__10 ;
    public final void rule__AssemblyContext__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6168:1: ( rule__AssemblyContext__Group__9__Impl rule__AssemblyContext__Group__10 )
            // InternalSimplepalladio.g:6169:2: rule__AssemblyContext__Group__9__Impl rule__AssemblyContext__Group__10
            {
            pushFollow(FOLLOW_41);
            rule__AssemblyContext__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__9"


    // $ANTLR start "rule__AssemblyContext__Group__9__Impl"
    // InternalSimplepalladio.g:6176:1: rule__AssemblyContext__Group__9__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6180:1: ( ( ')' ) )
            // InternalSimplepalladio.g:6181:1: ( ')' )
            {
            // InternalSimplepalladio.g:6181:1: ( ')' )
            // InternalSimplepalladio.g:6182:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__9__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__10"
    // InternalSimplepalladio.g:6191:1: rule__AssemblyContext__Group__10 : rule__AssemblyContext__Group__10__Impl rule__AssemblyContext__Group__11 ;
    public final void rule__AssemblyContext__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6195:1: ( rule__AssemblyContext__Group__10__Impl rule__AssemblyContext__Group__11 )
            // InternalSimplepalladio.g:6196:2: rule__AssemblyContext__Group__10__Impl rule__AssemblyContext__Group__11
            {
            pushFollow(FOLLOW_41);
            rule__AssemblyContext__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__10"


    // $ANTLR start "rule__AssemblyContext__Group__10__Impl"
    // InternalSimplepalladio.g:6203:1: rule__AssemblyContext__Group__10__Impl : ( ( rule__AssemblyContext__Group_10__0 )? ) ;
    public final void rule__AssemblyContext__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6207:1: ( ( ( rule__AssemblyContext__Group_10__0 )? ) )
            // InternalSimplepalladio.g:6208:1: ( ( rule__AssemblyContext__Group_10__0 )? )
            {
            // InternalSimplepalladio.g:6208:1: ( ( rule__AssemblyContext__Group_10__0 )? )
            // InternalSimplepalladio.g:6209:2: ( rule__AssemblyContext__Group_10__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_10()); 
            // InternalSimplepalladio.g:6210:2: ( rule__AssemblyContext__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSimplepalladio.g:6210:3: rule__AssemblyContext__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__10__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__11"
    // InternalSimplepalladio.g:6218:1: rule__AssemblyContext__Group__11 : rule__AssemblyContext__Group__11__Impl ;
    public final void rule__AssemblyContext__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6222:1: ( rule__AssemblyContext__Group__11__Impl )
            // InternalSimplepalladio.g:6223:2: rule__AssemblyContext__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__11"


    // $ANTLR start "rule__AssemblyContext__Group__11__Impl"
    // InternalSimplepalladio.g:6229:1: rule__AssemblyContext__Group__11__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6233:1: ( ( '}' ) )
            // InternalSimplepalladio.g:6234:1: ( '}' )
            {
            // InternalSimplepalladio.g:6234:1: ( '}' )
            // InternalSimplepalladio.g:6235:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__11__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_8__0"
    // InternalSimplepalladio.g:6245:1: rule__AssemblyContext__Group_8__0 : rule__AssemblyContext__Group_8__0__Impl rule__AssemblyContext__Group_8__1 ;
    public final void rule__AssemblyContext__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6249:1: ( rule__AssemblyContext__Group_8__0__Impl rule__AssemblyContext__Group_8__1 )
            // InternalSimplepalladio.g:6250:2: rule__AssemblyContext__Group_8__0__Impl rule__AssemblyContext__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyContext__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_8__0"


    // $ANTLR start "rule__AssemblyContext__Group_8__0__Impl"
    // InternalSimplepalladio.g:6257:1: rule__AssemblyContext__Group_8__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6261:1: ( ( ',' ) )
            // InternalSimplepalladio.g:6262:1: ( ',' )
            {
            // InternalSimplepalladio.g:6262:1: ( ',' )
            // InternalSimplepalladio.g:6263:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_8__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_8__1"
    // InternalSimplepalladio.g:6272:1: rule__AssemblyContext__Group_8__1 : rule__AssemblyContext__Group_8__1__Impl ;
    public final void rule__AssemblyContext__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6276:1: ( rule__AssemblyContext__Group_8__1__Impl )
            // InternalSimplepalladio.g:6277:2: rule__AssemblyContext__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_8__1"


    // $ANTLR start "rule__AssemblyContext__Group_8__1__Impl"
    // InternalSimplepalladio.g:6283:1: rule__AssemblyContext__Group_8__1__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) ) ;
    public final void rule__AssemblyContext__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6287:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) ) )
            // InternalSimplepalladio.g:6288:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) )
            {
            // InternalSimplepalladio.g:6288:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) )
            // InternalSimplepalladio.g:6289:2: ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_8_1()); 
            // InternalSimplepalladio.g:6290:2: ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 )
            // InternalSimplepalladio.g:6290:3: rule__AssemblyContext__ProvidedRolesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRolesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_8__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_10__0"
    // InternalSimplepalladio.g:6299:1: rule__AssemblyContext__Group_10__0 : rule__AssemblyContext__Group_10__0__Impl rule__AssemblyContext__Group_10__1 ;
    public final void rule__AssemblyContext__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6303:1: ( rule__AssemblyContext__Group_10__0__Impl rule__AssemblyContext__Group_10__1 )
            // InternalSimplepalladio.g:6304:2: rule__AssemblyContext__Group_10__0__Impl rule__AssemblyContext__Group_10__1
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__0"


    // $ANTLR start "rule__AssemblyContext__Group_10__0__Impl"
    // InternalSimplepalladio.g:6311:1: rule__AssemblyContext__Group_10__0__Impl : ( 'requiredRoles' ) ;
    public final void rule__AssemblyContext__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6315:1: ( ( 'requiredRoles' ) )
            // InternalSimplepalladio.g:6316:1: ( 'requiredRoles' )
            {
            // InternalSimplepalladio.g:6316:1: ( 'requiredRoles' )
            // InternalSimplepalladio.g:6317:2: 'requiredRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_10_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_10__1"
    // InternalSimplepalladio.g:6326:1: rule__AssemblyContext__Group_10__1 : rule__AssemblyContext__Group_10__1__Impl rule__AssemblyContext__Group_10__2 ;
    public final void rule__AssemblyContext__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6330:1: ( rule__AssemblyContext__Group_10__1__Impl rule__AssemblyContext__Group_10__2 )
            // InternalSimplepalladio.g:6331:2: rule__AssemblyContext__Group_10__1__Impl rule__AssemblyContext__Group_10__2
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyContext__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__1"


    // $ANTLR start "rule__AssemblyContext__Group_10__1__Impl"
    // InternalSimplepalladio.g:6338:1: rule__AssemblyContext__Group_10__1__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6342:1: ( ( '(' ) )
            // InternalSimplepalladio.g:6343:1: ( '(' )
            {
            // InternalSimplepalladio.g:6343:1: ( '(' )
            // InternalSimplepalladio.g:6344:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_10__2"
    // InternalSimplepalladio.g:6353:1: rule__AssemblyContext__Group_10__2 : rule__AssemblyContext__Group_10__2__Impl rule__AssemblyContext__Group_10__3 ;
    public final void rule__AssemblyContext__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6357:1: ( rule__AssemblyContext__Group_10__2__Impl rule__AssemblyContext__Group_10__3 )
            // InternalSimplepalladio.g:6358:2: rule__AssemblyContext__Group_10__2__Impl rule__AssemblyContext__Group_10__3
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__2"


    // $ANTLR start "rule__AssemblyContext__Group_10__2__Impl"
    // InternalSimplepalladio.g:6365:1: rule__AssemblyContext__Group_10__2__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) ) ;
    public final void rule__AssemblyContext__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6369:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) ) )
            // InternalSimplepalladio.g:6370:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) )
            {
            // InternalSimplepalladio.g:6370:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) )
            // InternalSimplepalladio.g:6371:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_2()); 
            // InternalSimplepalladio.g:6372:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_2 )
            // InternalSimplepalladio.g:6372:3: rule__AssemblyContext__RequiredRolesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__RequiredRolesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_10__3"
    // InternalSimplepalladio.g:6380:1: rule__AssemblyContext__Group_10__3 : rule__AssemblyContext__Group_10__3__Impl rule__AssemblyContext__Group_10__4 ;
    public final void rule__AssemblyContext__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6384:1: ( rule__AssemblyContext__Group_10__3__Impl rule__AssemblyContext__Group_10__4 )
            // InternalSimplepalladio.g:6385:2: rule__AssemblyContext__Group_10__3__Impl rule__AssemblyContext__Group_10__4
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__3"


    // $ANTLR start "rule__AssemblyContext__Group_10__3__Impl"
    // InternalSimplepalladio.g:6392:1: rule__AssemblyContext__Group_10__3__Impl : ( ( rule__AssemblyContext__Group_10_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6396:1: ( ( ( rule__AssemblyContext__Group_10_3__0 )* ) )
            // InternalSimplepalladio.g:6397:1: ( ( rule__AssemblyContext__Group_10_3__0 )* )
            {
            // InternalSimplepalladio.g:6397:1: ( ( rule__AssemblyContext__Group_10_3__0 )* )
            // InternalSimplepalladio.g:6398:2: ( rule__AssemblyContext__Group_10_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_10_3()); 
            // InternalSimplepalladio.g:6399:2: ( rule__AssemblyContext__Group_10_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSimplepalladio.g:6399:3: rule__AssemblyContext__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AssemblyContext__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_10__4"
    // InternalSimplepalladio.g:6407:1: rule__AssemblyContext__Group_10__4 : rule__AssemblyContext__Group_10__4__Impl ;
    public final void rule__AssemblyContext__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6411:1: ( rule__AssemblyContext__Group_10__4__Impl )
            // InternalSimplepalladio.g:6412:2: rule__AssemblyContext__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__4"


    // $ANTLR start "rule__AssemblyContext__Group_10__4__Impl"
    // InternalSimplepalladio.g:6418:1: rule__AssemblyContext__Group_10__4__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6422:1: ( ( ')' ) )
            // InternalSimplepalladio.g:6423:1: ( ')' )
            {
            // InternalSimplepalladio.g:6423:1: ( ')' )
            // InternalSimplepalladio.g:6424:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_10_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_10_3__0"
    // InternalSimplepalladio.g:6434:1: rule__AssemblyContext__Group_10_3__0 : rule__AssemblyContext__Group_10_3__0__Impl rule__AssemblyContext__Group_10_3__1 ;
    public final void rule__AssemblyContext__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6438:1: ( rule__AssemblyContext__Group_10_3__0__Impl rule__AssemblyContext__Group_10_3__1 )
            // InternalSimplepalladio.g:6439:2: rule__AssemblyContext__Group_10_3__0__Impl rule__AssemblyContext__Group_10_3__1
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyContext__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_10_3__0__Impl"
    // InternalSimplepalladio.g:6446:1: rule__AssemblyContext__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6450:1: ( ( ',' ) )
            // InternalSimplepalladio.g:6451:1: ( ',' )
            {
            // InternalSimplepalladio.g:6451:1: ( ',' )
            // InternalSimplepalladio.g:6452:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_10_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_10_3__1"
    // InternalSimplepalladio.g:6461:1: rule__AssemblyContext__Group_10_3__1 : rule__AssemblyContext__Group_10_3__1__Impl ;
    public final void rule__AssemblyContext__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6465:1: ( rule__AssemblyContext__Group_10_3__1__Impl )
            // InternalSimplepalladio.g:6466:2: rule__AssemblyContext__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_10_3__1__Impl"
    // InternalSimplepalladio.g:6472:1: rule__AssemblyContext__Group_10_3__1__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6476:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) ) )
            // InternalSimplepalladio.g:6477:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) )
            {
            // InternalSimplepalladio.g:6477:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) )
            // InternalSimplepalladio.g:6478:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_3_1()); 
            // InternalSimplepalladio.g:6479:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 )
            // InternalSimplepalladio.g:6479:3: rule__AssemblyContext__RequiredRolesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__RequiredRolesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_10_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSimplepalladio.g:6488:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6492:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSimplepalladio.g:6493:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalSimplepalladio.g:6500:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6504:1: ( ( 'Role' ) )
            // InternalSimplepalladio.g:6505:1: ( 'Role' )
            {
            // InternalSimplepalladio.g:6505:1: ( 'Role' )
            // InternalSimplepalladio.g:6506:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalSimplepalladio.g:6515:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6519:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSimplepalladio.g:6520:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalSimplepalladio.g:6527:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6531:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:6532:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:6532:1: ( ( rule__Role__NameAssignment_1 ) )
            // InternalSimplepalladio.g:6533:2: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:6534:2: ( rule__Role__NameAssignment_1 )
            // InternalSimplepalladio.g:6534:3: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalSimplepalladio.g:6542:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6546:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSimplepalladio.g:6547:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalSimplepalladio.g:6554:1: rule__Role__Group__2__Impl : ( '{' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6558:1: ( ( '{' ) )
            // InternalSimplepalladio.g:6559:1: ( '{' )
            {
            // InternalSimplepalladio.g:6559:1: ( '{' )
            // InternalSimplepalladio.g:6560:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalSimplepalladio.g:6569:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6573:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSimplepalladio.g:6574:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalSimplepalladio.g:6581:1: rule__Role__Group__3__Impl : ( 'interface' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6585:1: ( ( 'interface' ) )
            // InternalSimplepalladio.g:6586:1: ( 'interface' )
            {
            // InternalSimplepalladio.g:6586:1: ( 'interface' )
            // InternalSimplepalladio.g:6587:2: 'interface'
            {
             before(grammarAccess.getRoleAccess().getInterfaceKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getInterfaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalSimplepalladio.g:6596:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6600:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSimplepalladio.g:6601:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalSimplepalladio.g:6608:1: rule__Role__Group__4__Impl : ( ( rule__Role__InterfaceAssignment_4 ) ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6612:1: ( ( ( rule__Role__InterfaceAssignment_4 ) ) )
            // InternalSimplepalladio.g:6613:1: ( ( rule__Role__InterfaceAssignment_4 ) )
            {
            // InternalSimplepalladio.g:6613:1: ( ( rule__Role__InterfaceAssignment_4 ) )
            // InternalSimplepalladio.g:6614:2: ( rule__Role__InterfaceAssignment_4 )
            {
             before(grammarAccess.getRoleAccess().getInterfaceAssignment_4()); 
            // InternalSimplepalladio.g:6615:2: ( rule__Role__InterfaceAssignment_4 )
            // InternalSimplepalladio.g:6615:3: rule__Role__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Role__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // InternalSimplepalladio.g:6623:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6627:1: ( rule__Role__Group__5__Impl )
            // InternalSimplepalladio.g:6628:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalSimplepalladio.g:6634:1: rule__Role__Group__5__Impl : ( '}' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6638:1: ( ( '}' ) )
            // InternalSimplepalladio.g:6639:1: ( '}' )
            {
            // InternalSimplepalladio.g:6639:1: ( '}' )
            // InternalSimplepalladio.g:6640:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__0"
    // InternalSimplepalladio.g:6650:1: rule__DelegationConnector__Group__0 : rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 ;
    public final void rule__DelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6654:1: ( rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 )
            // InternalSimplepalladio.g:6655:2: rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DelegationConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__0"


    // $ANTLR start "rule__DelegationConnector__Group__0__Impl"
    // InternalSimplepalladio.g:6662:1: rule__DelegationConnector__Group__0__Impl : ( 'DelegationConnector' ) ;
    public final void rule__DelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6666:1: ( ( 'DelegationConnector' ) )
            // InternalSimplepalladio.g:6667:1: ( 'DelegationConnector' )
            {
            // InternalSimplepalladio.g:6667:1: ( 'DelegationConnector' )
            // InternalSimplepalladio.g:6668:2: 'DelegationConnector'
            {
             before(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__0__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__1"
    // InternalSimplepalladio.g:6677:1: rule__DelegationConnector__Group__1 : rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 ;
    public final void rule__DelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6681:1: ( rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 )
            // InternalSimplepalladio.g:6682:2: rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DelegationConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__1"


    // $ANTLR start "rule__DelegationConnector__Group__1__Impl"
    // InternalSimplepalladio.g:6689:1: rule__DelegationConnector__Group__1__Impl : ( ( rule__DelegationConnector__NameAssignment_1 ) ) ;
    public final void rule__DelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6693:1: ( ( ( rule__DelegationConnector__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:6694:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:6694:1: ( ( rule__DelegationConnector__NameAssignment_1 ) )
            // InternalSimplepalladio.g:6695:2: ( rule__DelegationConnector__NameAssignment_1 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:6696:2: ( rule__DelegationConnector__NameAssignment_1 )
            // InternalSimplepalladio.g:6696:3: rule__DelegationConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__1__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__2"
    // InternalSimplepalladio.g:6704:1: rule__DelegationConnector__Group__2 : rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 ;
    public final void rule__DelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6708:1: ( rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 )
            // InternalSimplepalladio.g:6709:2: rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__DelegationConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__2"


    // $ANTLR start "rule__DelegationConnector__Group__2__Impl"
    // InternalSimplepalladio.g:6716:1: rule__DelegationConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__DelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6720:1: ( ( '{' ) )
            // InternalSimplepalladio.g:6721:1: ( '{' )
            {
            // InternalSimplepalladio.g:6721:1: ( '{' )
            // InternalSimplepalladio.g:6722:2: '{'
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__2__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__3"
    // InternalSimplepalladio.g:6731:1: rule__DelegationConnector__Group__3 : rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 ;
    public final void rule__DelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6735:1: ( rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 )
            // InternalSimplepalladio.g:6736:2: rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__DelegationConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__3"


    // $ANTLR start "rule__DelegationConnector__Group__3__Impl"
    // InternalSimplepalladio.g:6743:1: rule__DelegationConnector__Group__3__Impl : ( 'role' ) ;
    public final void rule__DelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6747:1: ( ( 'role' ) )
            // InternalSimplepalladio.g:6748:1: ( 'role' )
            {
            // InternalSimplepalladio.g:6748:1: ( 'role' )
            // InternalSimplepalladio.g:6749:2: 'role'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__3__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__4"
    // InternalSimplepalladio.g:6758:1: rule__DelegationConnector__Group__4 : rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 ;
    public final void rule__DelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6762:1: ( rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 )
            // InternalSimplepalladio.g:6763:2: rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__DelegationConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__4"


    // $ANTLR start "rule__DelegationConnector__Group__4__Impl"
    // InternalSimplepalladio.g:6770:1: rule__DelegationConnector__Group__4__Impl : ( ( rule__DelegationConnector__RoleAssignment_4 ) ) ;
    public final void rule__DelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6774:1: ( ( ( rule__DelegationConnector__RoleAssignment_4 ) ) )
            // InternalSimplepalladio.g:6775:1: ( ( rule__DelegationConnector__RoleAssignment_4 ) )
            {
            // InternalSimplepalladio.g:6775:1: ( ( rule__DelegationConnector__RoleAssignment_4 ) )
            // InternalSimplepalladio.g:6776:2: ( rule__DelegationConnector__RoleAssignment_4 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_4()); 
            // InternalSimplepalladio.g:6777:2: ( rule__DelegationConnector__RoleAssignment_4 )
            // InternalSimplepalladio.g:6777:3: rule__DelegationConnector__RoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__RoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__4__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__5"
    // InternalSimplepalladio.g:6785:1: rule__DelegationConnector__Group__5 : rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 ;
    public final void rule__DelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6789:1: ( rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 )
            // InternalSimplepalladio.g:6790:2: rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__DelegationConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__5"


    // $ANTLR start "rule__DelegationConnector__Group__5__Impl"
    // InternalSimplepalladio.g:6797:1: rule__DelegationConnector__Group__5__Impl : ( 'interface' ) ;
    public final void rule__DelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6801:1: ( ( 'interface' ) )
            // InternalSimplepalladio.g:6802:1: ( 'interface' )
            {
            // InternalSimplepalladio.g:6802:1: ( 'interface' )
            // InternalSimplepalladio.g:6803:2: 'interface'
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getInterfaceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__5__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__6"
    // InternalSimplepalladio.g:6812:1: rule__DelegationConnector__Group__6 : rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 ;
    public final void rule__DelegationConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6816:1: ( rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7 )
            // InternalSimplepalladio.g:6817:2: rule__DelegationConnector__Group__6__Impl rule__DelegationConnector__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__DelegationConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__6"


    // $ANTLR start "rule__DelegationConnector__Group__6__Impl"
    // InternalSimplepalladio.g:6824:1: rule__DelegationConnector__Group__6__Impl : ( ( rule__DelegationConnector__InterfaceAssignment_6 ) ) ;
    public final void rule__DelegationConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6828:1: ( ( ( rule__DelegationConnector__InterfaceAssignment_6 ) ) )
            // InternalSimplepalladio.g:6829:1: ( ( rule__DelegationConnector__InterfaceAssignment_6 ) )
            {
            // InternalSimplepalladio.g:6829:1: ( ( rule__DelegationConnector__InterfaceAssignment_6 ) )
            // InternalSimplepalladio.g:6830:2: ( rule__DelegationConnector__InterfaceAssignment_6 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceAssignment_6()); 
            // InternalSimplepalladio.g:6831:2: ( rule__DelegationConnector__InterfaceAssignment_6 )
            // InternalSimplepalladio.g:6831:3: rule__DelegationConnector__InterfaceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__InterfaceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getInterfaceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__6__Impl"


    // $ANTLR start "rule__DelegationConnector__Group__7"
    // InternalSimplepalladio.g:6839:1: rule__DelegationConnector__Group__7 : rule__DelegationConnector__Group__7__Impl ;
    public final void rule__DelegationConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6843:1: ( rule__DelegationConnector__Group__7__Impl )
            // InternalSimplepalladio.g:6844:2: rule__DelegationConnector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__7"


    // $ANTLR start "rule__DelegationConnector__Group__7__Impl"
    // InternalSimplepalladio.g:6850:1: rule__DelegationConnector__Group__7__Impl : ( '}' ) ;
    public final void rule__DelegationConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6854:1: ( ( '}' ) )
            // InternalSimplepalladio.g:6855:1: ( '}' )
            {
            // InternalSimplepalladio.g:6855:1: ( '}' )
            // InternalSimplepalladio.g:6856:2: '}'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__Group__7__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__0"
    // InternalSimplepalladio.g:6866:1: rule__AssemblyConnector__Group__0 : rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 ;
    public final void rule__AssemblyConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6870:1: ( rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 )
            // InternalSimplepalladio.g:6871:2: rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__0"


    // $ANTLR start "rule__AssemblyConnector__Group__0__Impl"
    // InternalSimplepalladio.g:6878:1: rule__AssemblyConnector__Group__0__Impl : ( 'AssemblyConnector' ) ;
    public final void rule__AssemblyConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6882:1: ( ( 'AssemblyConnector' ) )
            // InternalSimplepalladio.g:6883:1: ( 'AssemblyConnector' )
            {
            // InternalSimplepalladio.g:6883:1: ( 'AssemblyConnector' )
            // InternalSimplepalladio.g:6884:2: 'AssemblyConnector'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__0__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__1"
    // InternalSimplepalladio.g:6893:1: rule__AssemblyConnector__Group__1 : rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 ;
    public final void rule__AssemblyConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6897:1: ( rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 )
            // InternalSimplepalladio.g:6898:2: rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AssemblyConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__1"


    // $ANTLR start "rule__AssemblyConnector__Group__1__Impl"
    // InternalSimplepalladio.g:6905:1: rule__AssemblyConnector__Group__1__Impl : ( ( rule__AssemblyConnector__NameAssignment_1 ) ) ;
    public final void rule__AssemblyConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6909:1: ( ( ( rule__AssemblyConnector__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:6910:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:6910:1: ( ( rule__AssemblyConnector__NameAssignment_1 ) )
            // InternalSimplepalladio.g:6911:2: ( rule__AssemblyConnector__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:6912:2: ( rule__AssemblyConnector__NameAssignment_1 )
            // InternalSimplepalladio.g:6912:3: rule__AssemblyConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__1__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__2"
    // InternalSimplepalladio.g:6920:1: rule__AssemblyConnector__Group__2 : rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 ;
    public final void rule__AssemblyConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6924:1: ( rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 )
            // InternalSimplepalladio.g:6925:2: rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__AssemblyConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__2"


    // $ANTLR start "rule__AssemblyConnector__Group__2__Impl"
    // InternalSimplepalladio.g:6932:1: rule__AssemblyConnector__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6936:1: ( ( '{' ) )
            // InternalSimplepalladio.g:6937:1: ( '{' )
            {
            // InternalSimplepalladio.g:6937:1: ( '{' )
            // InternalSimplepalladio.g:6938:2: '{'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__2__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__3"
    // InternalSimplepalladio.g:6947:1: rule__AssemblyConnector__Group__3 : rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 ;
    public final void rule__AssemblyConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6951:1: ( rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 )
            // InternalSimplepalladio.g:6952:2: rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__3"


    // $ANTLR start "rule__AssemblyConnector__Group__3__Impl"
    // InternalSimplepalladio.g:6959:1: rule__AssemblyConnector__Group__3__Impl : ( 'providedRole' ) ;
    public final void rule__AssemblyConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6963:1: ( ( 'providedRole' ) )
            // InternalSimplepalladio.g:6964:1: ( 'providedRole' )
            {
            // InternalSimplepalladio.g:6964:1: ( 'providedRole' )
            // InternalSimplepalladio.g:6965:2: 'providedRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__3__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__4"
    // InternalSimplepalladio.g:6974:1: rule__AssemblyConnector__Group__4 : rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 ;
    public final void rule__AssemblyConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6978:1: ( rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 )
            // InternalSimplepalladio.g:6979:2: rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__AssemblyConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__4"


    // $ANTLR start "rule__AssemblyConnector__Group__4__Impl"
    // InternalSimplepalladio.g:6986:1: rule__AssemblyConnector__Group__4__Impl : ( ( rule__AssemblyConnector__ProvidedRoleAssignment_4 ) ) ;
    public final void rule__AssemblyConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:6990:1: ( ( ( rule__AssemblyConnector__ProvidedRoleAssignment_4 ) ) )
            // InternalSimplepalladio.g:6991:1: ( ( rule__AssemblyConnector__ProvidedRoleAssignment_4 ) )
            {
            // InternalSimplepalladio.g:6991:1: ( ( rule__AssemblyConnector__ProvidedRoleAssignment_4 ) )
            // InternalSimplepalladio.g:6992:2: ( rule__AssemblyConnector__ProvidedRoleAssignment_4 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleAssignment_4()); 
            // InternalSimplepalladio.g:6993:2: ( rule__AssemblyConnector__ProvidedRoleAssignment_4 )
            // InternalSimplepalladio.g:6993:3: rule__AssemblyConnector__ProvidedRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__ProvidedRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__4__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__5"
    // InternalSimplepalladio.g:7001:1: rule__AssemblyConnector__Group__5 : rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 ;
    public final void rule__AssemblyConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7005:1: ( rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 )
            // InternalSimplepalladio.g:7006:2: rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__AssemblyConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__5"


    // $ANTLR start "rule__AssemblyConnector__Group__5__Impl"
    // InternalSimplepalladio.g:7013:1: rule__AssemblyConnector__Group__5__Impl : ( 'requiredRole' ) ;
    public final void rule__AssemblyConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7017:1: ( ( 'requiredRole' ) )
            // InternalSimplepalladio.g:7018:1: ( 'requiredRole' )
            {
            // InternalSimplepalladio.g:7018:1: ( 'requiredRole' )
            // InternalSimplepalladio.g:7019:2: 'requiredRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_5()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__5__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__6"
    // InternalSimplepalladio.g:7028:1: rule__AssemblyConnector__Group__6 : rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 ;
    public final void rule__AssemblyConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7032:1: ( rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7 )
            // InternalSimplepalladio.g:7033:2: rule__AssemblyConnector__Group__6__Impl rule__AssemblyConnector__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AssemblyConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__6"


    // $ANTLR start "rule__AssemblyConnector__Group__6__Impl"
    // InternalSimplepalladio.g:7040:1: rule__AssemblyConnector__Group__6__Impl : ( ( rule__AssemblyConnector__RequiredRoleAssignment_6 ) ) ;
    public final void rule__AssemblyConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7044:1: ( ( ( rule__AssemblyConnector__RequiredRoleAssignment_6 ) ) )
            // InternalSimplepalladio.g:7045:1: ( ( rule__AssemblyConnector__RequiredRoleAssignment_6 ) )
            {
            // InternalSimplepalladio.g:7045:1: ( ( rule__AssemblyConnector__RequiredRoleAssignment_6 ) )
            // InternalSimplepalladio.g:7046:2: ( rule__AssemblyConnector__RequiredRoleAssignment_6 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleAssignment_6()); 
            // InternalSimplepalladio.g:7047:2: ( rule__AssemblyConnector__RequiredRoleAssignment_6 )
            // InternalSimplepalladio.g:7047:3: rule__AssemblyConnector__RequiredRoleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__RequiredRoleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__6__Impl"


    // $ANTLR start "rule__AssemblyConnector__Group__7"
    // InternalSimplepalladio.g:7055:1: rule__AssemblyConnector__Group__7 : rule__AssemblyConnector__Group__7__Impl ;
    public final void rule__AssemblyConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7059:1: ( rule__AssemblyConnector__Group__7__Impl )
            // InternalSimplepalladio.g:7060:2: rule__AssemblyConnector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__7"


    // $ANTLR start "rule__AssemblyConnector__Group__7__Impl"
    // InternalSimplepalladio.g:7066:1: rule__AssemblyConnector__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7070:1: ( ( '}' ) )
            // InternalSimplepalladio.g:7071:1: ( '}' )
            {
            // InternalSimplepalladio.g:7071:1: ( '}' )
            // InternalSimplepalladio.g:7072:2: '}'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__Group__7__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__0"
    // InternalSimplepalladio.g:7082:1: rule__EnvironmentViewType__Group__0 : rule__EnvironmentViewType__Group__0__Impl rule__EnvironmentViewType__Group__1 ;
    public final void rule__EnvironmentViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7086:1: ( rule__EnvironmentViewType__Group__0__Impl rule__EnvironmentViewType__Group__1 )
            // InternalSimplepalladio.g:7087:2: rule__EnvironmentViewType__Group__0__Impl rule__EnvironmentViewType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EnvironmentViewType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__0"


    // $ANTLR start "rule__EnvironmentViewType__Group__0__Impl"
    // InternalSimplepalladio.g:7094:1: rule__EnvironmentViewType__Group__0__Impl : ( 'EnvironmentViewType' ) ;
    public final void rule__EnvironmentViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7098:1: ( ( 'EnvironmentViewType' ) )
            // InternalSimplepalladio.g:7099:1: ( 'EnvironmentViewType' )
            {
            // InternalSimplepalladio.g:7099:1: ( 'EnvironmentViewType' )
            // InternalSimplepalladio.g:7100:2: 'EnvironmentViewType'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentViewTypeKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentViewTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__1"
    // InternalSimplepalladio.g:7109:1: rule__EnvironmentViewType__Group__1 : rule__EnvironmentViewType__Group__1__Impl rule__EnvironmentViewType__Group__2 ;
    public final void rule__EnvironmentViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7113:1: ( rule__EnvironmentViewType__Group__1__Impl rule__EnvironmentViewType__Group__2 )
            // InternalSimplepalladio.g:7114:2: rule__EnvironmentViewType__Group__1__Impl rule__EnvironmentViewType__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__EnvironmentViewType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__1"


    // $ANTLR start "rule__EnvironmentViewType__Group__1__Impl"
    // InternalSimplepalladio.g:7121:1: rule__EnvironmentViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__EnvironmentViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7125:1: ( ( '{' ) )
            // InternalSimplepalladio.g:7126:1: ( '{' )
            {
            // InternalSimplepalladio.g:7126:1: ( '{' )
            // InternalSimplepalladio.g:7127:2: '{'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__2"
    // InternalSimplepalladio.g:7136:1: rule__EnvironmentViewType__Group__2 : rule__EnvironmentViewType__Group__2__Impl rule__EnvironmentViewType__Group__3 ;
    public final void rule__EnvironmentViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7140:1: ( rule__EnvironmentViewType__Group__2__Impl rule__EnvironmentViewType__Group__3 )
            // InternalSimplepalladio.g:7141:2: rule__EnvironmentViewType__Group__2__Impl rule__EnvironmentViewType__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__EnvironmentViewType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__2"


    // $ANTLR start "rule__EnvironmentViewType__Group__2__Impl"
    // InternalSimplepalladio.g:7148:1: rule__EnvironmentViewType__Group__2__Impl : ( 'environmentElements' ) ;
    public final void rule__EnvironmentViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7152:1: ( ( 'environmentElements' ) )
            // InternalSimplepalladio.g:7153:1: ( 'environmentElements' )
            {
            // InternalSimplepalladio.g:7153:1: ( 'environmentElements' )
            // InternalSimplepalladio.g:7154:2: 'environmentElements'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__3"
    // InternalSimplepalladio.g:7163:1: rule__EnvironmentViewType__Group__3 : rule__EnvironmentViewType__Group__3__Impl rule__EnvironmentViewType__Group__4 ;
    public final void rule__EnvironmentViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7167:1: ( rule__EnvironmentViewType__Group__3__Impl rule__EnvironmentViewType__Group__4 )
            // InternalSimplepalladio.g:7168:2: rule__EnvironmentViewType__Group__3__Impl rule__EnvironmentViewType__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__EnvironmentViewType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__3"


    // $ANTLR start "rule__EnvironmentViewType__Group__3__Impl"
    // InternalSimplepalladio.g:7175:1: rule__EnvironmentViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnvironmentViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7179:1: ( ( '{' ) )
            // InternalSimplepalladio.g:7180:1: ( '{' )
            {
            // InternalSimplepalladio.g:7180:1: ( '{' )
            // InternalSimplepalladio.g:7181:2: '{'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__4"
    // InternalSimplepalladio.g:7190:1: rule__EnvironmentViewType__Group__4 : rule__EnvironmentViewType__Group__4__Impl rule__EnvironmentViewType__Group__5 ;
    public final void rule__EnvironmentViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7194:1: ( rule__EnvironmentViewType__Group__4__Impl rule__EnvironmentViewType__Group__5 )
            // InternalSimplepalladio.g:7195:2: rule__EnvironmentViewType__Group__4__Impl rule__EnvironmentViewType__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__EnvironmentViewType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__4"


    // $ANTLR start "rule__EnvironmentViewType__Group__4__Impl"
    // InternalSimplepalladio.g:7202:1: rule__EnvironmentViewType__Group__4__Impl : ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) ) ;
    public final void rule__EnvironmentViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7206:1: ( ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) ) )
            // InternalSimplepalladio.g:7207:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) )
            {
            // InternalSimplepalladio.g:7207:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) )
            // InternalSimplepalladio.g:7208:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 )
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_4()); 
            // InternalSimplepalladio.g:7209:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 )
            // InternalSimplepalladio.g:7209:3: rule__EnvironmentViewType__EnvironmentElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__EnvironmentElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__4__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__5"
    // InternalSimplepalladio.g:7217:1: rule__EnvironmentViewType__Group__5 : rule__EnvironmentViewType__Group__5__Impl rule__EnvironmentViewType__Group__6 ;
    public final void rule__EnvironmentViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7221:1: ( rule__EnvironmentViewType__Group__5__Impl rule__EnvironmentViewType__Group__6 )
            // InternalSimplepalladio.g:7222:2: rule__EnvironmentViewType__Group__5__Impl rule__EnvironmentViewType__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__EnvironmentViewType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__5"


    // $ANTLR start "rule__EnvironmentViewType__Group__5__Impl"
    // InternalSimplepalladio.g:7229:1: rule__EnvironmentViewType__Group__5__Impl : ( ( rule__EnvironmentViewType__Group_5__0 )* ) ;
    public final void rule__EnvironmentViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7233:1: ( ( ( rule__EnvironmentViewType__Group_5__0 )* ) )
            // InternalSimplepalladio.g:7234:1: ( ( rule__EnvironmentViewType__Group_5__0 )* )
            {
            // InternalSimplepalladio.g:7234:1: ( ( rule__EnvironmentViewType__Group_5__0 )* )
            // InternalSimplepalladio.g:7235:2: ( rule__EnvironmentViewType__Group_5__0 )*
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getGroup_5()); 
            // InternalSimplepalladio.g:7236:2: ( rule__EnvironmentViewType__Group_5__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSimplepalladio.g:7236:3: rule__EnvironmentViewType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EnvironmentViewType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEnvironmentViewTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__5__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__6"
    // InternalSimplepalladio.g:7244:1: rule__EnvironmentViewType__Group__6 : rule__EnvironmentViewType__Group__6__Impl rule__EnvironmentViewType__Group__7 ;
    public final void rule__EnvironmentViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7248:1: ( rule__EnvironmentViewType__Group__6__Impl rule__EnvironmentViewType__Group__7 )
            // InternalSimplepalladio.g:7249:2: rule__EnvironmentViewType__Group__6__Impl rule__EnvironmentViewType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__EnvironmentViewType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__6"


    // $ANTLR start "rule__EnvironmentViewType__Group__6__Impl"
    // InternalSimplepalladio.g:7256:1: rule__EnvironmentViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnvironmentViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7260:1: ( ( '}' ) )
            // InternalSimplepalladio.g:7261:1: ( '}' )
            {
            // InternalSimplepalladio.g:7261:1: ( '}' )
            // InternalSimplepalladio.g:7262:2: '}'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__6__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group__7"
    // InternalSimplepalladio.g:7271:1: rule__EnvironmentViewType__Group__7 : rule__EnvironmentViewType__Group__7__Impl ;
    public final void rule__EnvironmentViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7275:1: ( rule__EnvironmentViewType__Group__7__Impl )
            // InternalSimplepalladio.g:7276:2: rule__EnvironmentViewType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__7"


    // $ANTLR start "rule__EnvironmentViewType__Group__7__Impl"
    // InternalSimplepalladio.g:7282:1: rule__EnvironmentViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__EnvironmentViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7286:1: ( ( '}' ) )
            // InternalSimplepalladio.g:7287:1: ( '}' )
            {
            // InternalSimplepalladio.g:7287:1: ( '}' )
            // InternalSimplepalladio.g:7288:2: '}'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group__7__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group_5__0"
    // InternalSimplepalladio.g:7298:1: rule__EnvironmentViewType__Group_5__0 : rule__EnvironmentViewType__Group_5__0__Impl rule__EnvironmentViewType__Group_5__1 ;
    public final void rule__EnvironmentViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7302:1: ( rule__EnvironmentViewType__Group_5__0__Impl rule__EnvironmentViewType__Group_5__1 )
            // InternalSimplepalladio.g:7303:2: rule__EnvironmentViewType__Group_5__0__Impl rule__EnvironmentViewType__Group_5__1
            {
            pushFollow(FOLLOW_47);
            rule__EnvironmentViewType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group_5__0"


    // $ANTLR start "rule__EnvironmentViewType__Group_5__0__Impl"
    // InternalSimplepalladio.g:7310:1: rule__EnvironmentViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnvironmentViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7314:1: ( ( ',' ) )
            // InternalSimplepalladio.g:7315:1: ( ',' )
            {
            // InternalSimplepalladio.g:7315:1: ( ',' )
            // InternalSimplepalladio.g:7316:2: ','
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnvironmentViewTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group_5__0__Impl"


    // $ANTLR start "rule__EnvironmentViewType__Group_5__1"
    // InternalSimplepalladio.g:7325:1: rule__EnvironmentViewType__Group_5__1 : rule__EnvironmentViewType__Group_5__1__Impl ;
    public final void rule__EnvironmentViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7329:1: ( rule__EnvironmentViewType__Group_5__1__Impl )
            // InternalSimplepalladio.g:7330:2: rule__EnvironmentViewType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group_5__1"


    // $ANTLR start "rule__EnvironmentViewType__Group_5__1__Impl"
    // InternalSimplepalladio.g:7336:1: rule__EnvironmentViewType__Group_5__1__Impl : ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) ) ;
    public final void rule__EnvironmentViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7340:1: ( ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) ) )
            // InternalSimplepalladio.g:7341:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) )
            {
            // InternalSimplepalladio.g:7341:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) )
            // InternalSimplepalladio.g:7342:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 )
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_5_1()); 
            // InternalSimplepalladio.g:7343:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 )
            // InternalSimplepalladio.g:7343:3: rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__Group_5__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalSimplepalladio.g:7352:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7356:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalSimplepalladio.g:7357:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalSimplepalladio.g:7364:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7368:1: ( ( () ) )
            // InternalSimplepalladio.g:7369:1: ( () )
            {
            // InternalSimplepalladio.g:7369:1: ( () )
            // InternalSimplepalladio.g:7370:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalSimplepalladio.g:7371:2: ()
            // InternalSimplepalladio.g:7371:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalSimplepalladio.g:7379:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7383:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalSimplepalladio.g:7384:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalSimplepalladio.g:7391:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7395:1: ( ( 'Container' ) )
            // InternalSimplepalladio.g:7396:1: ( 'Container' )
            {
            // InternalSimplepalladio.g:7396:1: ( 'Container' )
            // InternalSimplepalladio.g:7397:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalSimplepalladio.g:7406:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7410:1: ( rule__Container__Group__2__Impl )
            // InternalSimplepalladio.g:7411:2: rule__Container__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalSimplepalladio.g:7417:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7421:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalSimplepalladio.g:7422:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalSimplepalladio.g:7422:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalSimplepalladio.g:7423:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalSimplepalladio.g:7424:2: ( rule__Container__NameAssignment_2 )
            // InternalSimplepalladio.g:7424:3: rule__Container__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalSimplepalladio.g:7433:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7437:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalSimplepalladio.g:7438:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalSimplepalladio.g:7445:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7449:1: ( ( 'Link' ) )
            // InternalSimplepalladio.g:7450:1: ( 'Link' )
            {
            // InternalSimplepalladio.g:7450:1: ( 'Link' )
            // InternalSimplepalladio.g:7451:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalSimplepalladio.g:7460:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7464:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalSimplepalladio.g:7465:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalSimplepalladio.g:7472:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7476:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalSimplepalladio.g:7477:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalSimplepalladio.g:7477:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalSimplepalladio.g:7478:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalSimplepalladio.g:7479:2: ( rule__Link__NameAssignment_1 )
            // InternalSimplepalladio.g:7479:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalSimplepalladio.g:7487:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7491:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalSimplepalladio.g:7492:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalSimplepalladio.g:7499:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7503:1: ( ( '{' ) )
            // InternalSimplepalladio.g:7504:1: ( '{' )
            {
            // InternalSimplepalladio.g:7504:1: ( '{' )
            // InternalSimplepalladio.g:7505:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalSimplepalladio.g:7514:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7518:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalSimplepalladio.g:7519:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalSimplepalladio.g:7526:1: rule__Link__Group__3__Impl : ( 'containers' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7530:1: ( ( 'containers' ) )
            // InternalSimplepalladio.g:7531:1: ( 'containers' )
            {
            // InternalSimplepalladio.g:7531:1: ( 'containers' )
            // InternalSimplepalladio.g:7532:2: 'containers'
            {
             before(grammarAccess.getLinkAccess().getContainersKeyword_3()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getContainersKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalSimplepalladio.g:7541:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7545:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalSimplepalladio.g:7546:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalSimplepalladio.g:7553:1: rule__Link__Group__4__Impl : ( '(' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7557:1: ( ( '(' ) )
            // InternalSimplepalladio.g:7558:1: ( '(' )
            {
            // InternalSimplepalladio.g:7558:1: ( '(' )
            // InternalSimplepalladio.g:7559:2: '('
            {
             before(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalSimplepalladio.g:7568:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7572:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalSimplepalladio.g:7573:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalSimplepalladio.g:7580:1: rule__Link__Group__5__Impl : ( ( rule__Link__ContainersAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7584:1: ( ( ( rule__Link__ContainersAssignment_5 ) ) )
            // InternalSimplepalladio.g:7585:1: ( ( rule__Link__ContainersAssignment_5 ) )
            {
            // InternalSimplepalladio.g:7585:1: ( ( rule__Link__ContainersAssignment_5 ) )
            // InternalSimplepalladio.g:7586:2: ( rule__Link__ContainersAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getContainersAssignment_5()); 
            // InternalSimplepalladio.g:7587:2: ( rule__Link__ContainersAssignment_5 )
            // InternalSimplepalladio.g:7587:3: rule__Link__ContainersAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Link__ContainersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getContainersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalSimplepalladio.g:7595:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7599:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalSimplepalladio.g:7600:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_51);
            rule__Link__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalSimplepalladio.g:7607:1: rule__Link__Group__6__Impl : ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7611:1: ( ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) ) )
            // InternalSimplepalladio.g:7612:1: ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) )
            {
            // InternalSimplepalladio.g:7612:1: ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) )
            // InternalSimplepalladio.g:7613:2: ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* )
            {
            // InternalSimplepalladio.g:7613:2: ( ( rule__Link__Group_6__0 ) )
            // InternalSimplepalladio.g:7614:3: ( rule__Link__Group_6__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalSimplepalladio.g:7615:3: ( rule__Link__Group_6__0 )
            // InternalSimplepalladio.g:7615:4: rule__Link__Group_6__0
            {
            pushFollow(FOLLOW_12);
            rule__Link__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup_6()); 

            }

            // InternalSimplepalladio.g:7618:2: ( ( rule__Link__Group_6__0 )* )
            // InternalSimplepalladio.g:7619:3: ( rule__Link__Group_6__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalSimplepalladio.g:7620:3: ( rule__Link__Group_6__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSimplepalladio.g:7620:4: rule__Link__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Link__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Link__Group__7"
    // InternalSimplepalladio.g:7629:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7633:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // InternalSimplepalladio.g:7634:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Link__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7"


    // $ANTLR start "rule__Link__Group__7__Impl"
    // InternalSimplepalladio.g:7641:1: rule__Link__Group__7__Impl : ( ')' ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7645:1: ( ( ')' ) )
            // InternalSimplepalladio.g:7646:1: ( ')' )
            {
            // InternalSimplepalladio.g:7646:1: ( ')' )
            // InternalSimplepalladio.g:7647:2: ')'
            {
             before(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7__Impl"


    // $ANTLR start "rule__Link__Group__8"
    // InternalSimplepalladio.g:7656:1: rule__Link__Group__8 : rule__Link__Group__8__Impl ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7660:1: ( rule__Link__Group__8__Impl )
            // InternalSimplepalladio.g:7661:2: rule__Link__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8"


    // $ANTLR start "rule__Link__Group__8__Impl"
    // InternalSimplepalladio.g:7667:1: rule__Link__Group__8__Impl : ( '}' ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7671:1: ( ( '}' ) )
            // InternalSimplepalladio.g:7672:1: ( '}' )
            {
            // InternalSimplepalladio.g:7672:1: ( '}' )
            // InternalSimplepalladio.g:7673:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8__Impl"


    // $ANTLR start "rule__Link__Group_6__0"
    // InternalSimplepalladio.g:7683:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7687:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalSimplepalladio.g:7688:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0"


    // $ANTLR start "rule__Link__Group_6__0__Impl"
    // InternalSimplepalladio.g:7695:1: rule__Link__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7699:1: ( ( ',' ) )
            // InternalSimplepalladio.g:7700:1: ( ',' )
            {
            // InternalSimplepalladio.g:7700:1: ( ',' )
            // InternalSimplepalladio.g:7701:2: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0__Impl"


    // $ANTLR start "rule__Link__Group_6__1"
    // InternalSimplepalladio.g:7710:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7714:1: ( rule__Link__Group_6__1__Impl )
            // InternalSimplepalladio.g:7715:2: rule__Link__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1"


    // $ANTLR start "rule__Link__Group_6__1__Impl"
    // InternalSimplepalladio.g:7721:1: rule__Link__Group_6__1__Impl : ( ( rule__Link__ContainersAssignment_6_1 ) ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7725:1: ( ( ( rule__Link__ContainersAssignment_6_1 ) ) )
            // InternalSimplepalladio.g:7726:1: ( ( rule__Link__ContainersAssignment_6_1 ) )
            {
            // InternalSimplepalladio.g:7726:1: ( ( rule__Link__ContainersAssignment_6_1 ) )
            // InternalSimplepalladio.g:7727:2: ( rule__Link__ContainersAssignment_6_1 )
            {
             before(grammarAccess.getLinkAccess().getContainersAssignment_6_1()); 
            // InternalSimplepalladio.g:7728:2: ( rule__Link__ContainersAssignment_6_1 )
            // InternalSimplepalladio.g:7728:3: rule__Link__ContainersAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__ContainersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getContainersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__0"
    // InternalSimplepalladio.g:7737:1: rule__AllocationViewType__Group__0 : rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1 ;
    public final void rule__AllocationViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7741:1: ( rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1 )
            // InternalSimplepalladio.g:7742:2: rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AllocationViewType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__0"


    // $ANTLR start "rule__AllocationViewType__Group__0__Impl"
    // InternalSimplepalladio.g:7749:1: rule__AllocationViewType__Group__0__Impl : ( 'AllocationViewType' ) ;
    public final void rule__AllocationViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7753:1: ( ( 'AllocationViewType' ) )
            // InternalSimplepalladio.g:7754:1: ( 'AllocationViewType' )
            {
            // InternalSimplepalladio.g:7754:1: ( 'AllocationViewType' )
            // InternalSimplepalladio.g:7755:2: 'AllocationViewType'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationViewTypeKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getAllocationViewTypeAccess().getAllocationViewTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__0__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__1"
    // InternalSimplepalladio.g:7764:1: rule__AllocationViewType__Group__1 : rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2 ;
    public final void rule__AllocationViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7768:1: ( rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2 )
            // InternalSimplepalladio.g:7769:2: rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__AllocationViewType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__1"


    // $ANTLR start "rule__AllocationViewType__Group__1__Impl"
    // InternalSimplepalladio.g:7776:1: rule__AllocationViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7780:1: ( ( '{' ) )
            // InternalSimplepalladio.g:7781:1: ( '{' )
            {
            // InternalSimplepalladio.g:7781:1: ( '{' )
            // InternalSimplepalladio.g:7782:2: '{'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__1__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__2"
    // InternalSimplepalladio.g:7791:1: rule__AllocationViewType__Group__2 : rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3 ;
    public final void rule__AllocationViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7795:1: ( rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3 )
            // InternalSimplepalladio.g:7796:2: rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AllocationViewType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__2"


    // $ANTLR start "rule__AllocationViewType__Group__2__Impl"
    // InternalSimplepalladio.g:7803:1: rule__AllocationViewType__Group__2__Impl : ( 'allocationContexts' ) ;
    public final void rule__AllocationViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7807:1: ( ( 'allocationContexts' ) )
            // InternalSimplepalladio.g:7808:1: ( 'allocationContexts' )
            {
            // InternalSimplepalladio.g:7808:1: ( 'allocationContexts' )
            // InternalSimplepalladio.g:7809:2: 'allocationContexts'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__2__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__3"
    // InternalSimplepalladio.g:7818:1: rule__AllocationViewType__Group__3 : rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4 ;
    public final void rule__AllocationViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7822:1: ( rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4 )
            // InternalSimplepalladio.g:7823:2: rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4
            {
            pushFollow(FOLLOW_53);
            rule__AllocationViewType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__3"


    // $ANTLR start "rule__AllocationViewType__Group__3__Impl"
    // InternalSimplepalladio.g:7830:1: rule__AllocationViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__AllocationViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7834:1: ( ( '{' ) )
            // InternalSimplepalladio.g:7835:1: ( '{' )
            {
            // InternalSimplepalladio.g:7835:1: ( '{' )
            // InternalSimplepalladio.g:7836:2: '{'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__3__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__4"
    // InternalSimplepalladio.g:7845:1: rule__AllocationViewType__Group__4 : rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5 ;
    public final void rule__AllocationViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7849:1: ( rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5 )
            // InternalSimplepalladio.g:7850:2: rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__AllocationViewType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__4"


    // $ANTLR start "rule__AllocationViewType__Group__4__Impl"
    // InternalSimplepalladio.g:7857:1: rule__AllocationViewType__Group__4__Impl : ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) ) ;
    public final void rule__AllocationViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7861:1: ( ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) ) )
            // InternalSimplepalladio.g:7862:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) )
            {
            // InternalSimplepalladio.g:7862:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) )
            // InternalSimplepalladio.g:7863:2: ( rule__AllocationViewType__AllocationContextsAssignment_4 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_4()); 
            // InternalSimplepalladio.g:7864:2: ( rule__AllocationViewType__AllocationContextsAssignment_4 )
            // InternalSimplepalladio.g:7864:3: rule__AllocationViewType__AllocationContextsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AllocationViewType__AllocationContextsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__4__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__5"
    // InternalSimplepalladio.g:7872:1: rule__AllocationViewType__Group__5 : rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6 ;
    public final void rule__AllocationViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7876:1: ( rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6 )
            // InternalSimplepalladio.g:7877:2: rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__AllocationViewType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__5"


    // $ANTLR start "rule__AllocationViewType__Group__5__Impl"
    // InternalSimplepalladio.g:7884:1: rule__AllocationViewType__Group__5__Impl : ( ( rule__AllocationViewType__Group_5__0 )* ) ;
    public final void rule__AllocationViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7888:1: ( ( ( rule__AllocationViewType__Group_5__0 )* ) )
            // InternalSimplepalladio.g:7889:1: ( ( rule__AllocationViewType__Group_5__0 )* )
            {
            // InternalSimplepalladio.g:7889:1: ( ( rule__AllocationViewType__Group_5__0 )* )
            // InternalSimplepalladio.g:7890:2: ( rule__AllocationViewType__Group_5__0 )*
            {
             before(grammarAccess.getAllocationViewTypeAccess().getGroup_5()); 
            // InternalSimplepalladio.g:7891:2: ( rule__AllocationViewType__Group_5__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSimplepalladio.g:7891:3: rule__AllocationViewType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AllocationViewType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getAllocationViewTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__5__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__6"
    // InternalSimplepalladio.g:7899:1: rule__AllocationViewType__Group__6 : rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7 ;
    public final void rule__AllocationViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7903:1: ( rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7 )
            // InternalSimplepalladio.g:7904:2: rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AllocationViewType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__6"


    // $ANTLR start "rule__AllocationViewType__Group__6__Impl"
    // InternalSimplepalladio.g:7911:1: rule__AllocationViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7915:1: ( ( '}' ) )
            // InternalSimplepalladio.g:7916:1: ( '}' )
            {
            // InternalSimplepalladio.g:7916:1: ( '}' )
            // InternalSimplepalladio.g:7917:2: '}'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__6__Impl"


    // $ANTLR start "rule__AllocationViewType__Group__7"
    // InternalSimplepalladio.g:7926:1: rule__AllocationViewType__Group__7 : rule__AllocationViewType__Group__7__Impl ;
    public final void rule__AllocationViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7930:1: ( rule__AllocationViewType__Group__7__Impl )
            // InternalSimplepalladio.g:7931:2: rule__AllocationViewType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__7"


    // $ANTLR start "rule__AllocationViewType__Group__7__Impl"
    // InternalSimplepalladio.g:7937:1: rule__AllocationViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__AllocationViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7941:1: ( ( '}' ) )
            // InternalSimplepalladio.g:7942:1: ( '}' )
            {
            // InternalSimplepalladio.g:7942:1: ( '}' )
            // InternalSimplepalladio.g:7943:2: '}'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group__7__Impl"


    // $ANTLR start "rule__AllocationViewType__Group_5__0"
    // InternalSimplepalladio.g:7953:1: rule__AllocationViewType__Group_5__0 : rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1 ;
    public final void rule__AllocationViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7957:1: ( rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1 )
            // InternalSimplepalladio.g:7958:2: rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1
            {
            pushFollow(FOLLOW_53);
            rule__AllocationViewType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group_5__0"


    // $ANTLR start "rule__AllocationViewType__Group_5__0__Impl"
    // InternalSimplepalladio.g:7965:1: rule__AllocationViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__AllocationViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7969:1: ( ( ',' ) )
            // InternalSimplepalladio.g:7970:1: ( ',' )
            {
            // InternalSimplepalladio.g:7970:1: ( ',' )
            // InternalSimplepalladio.g:7971:2: ','
            {
             before(grammarAccess.getAllocationViewTypeAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAllocationViewTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group_5__0__Impl"


    // $ANTLR start "rule__AllocationViewType__Group_5__1"
    // InternalSimplepalladio.g:7980:1: rule__AllocationViewType__Group_5__1 : rule__AllocationViewType__Group_5__1__Impl ;
    public final void rule__AllocationViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7984:1: ( rule__AllocationViewType__Group_5__1__Impl )
            // InternalSimplepalladio.g:7985:2: rule__AllocationViewType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationViewType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group_5__1"


    // $ANTLR start "rule__AllocationViewType__Group_5__1__Impl"
    // InternalSimplepalladio.g:7991:1: rule__AllocationViewType__Group_5__1__Impl : ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) ) ;
    public final void rule__AllocationViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:7995:1: ( ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) ) )
            // InternalSimplepalladio.g:7996:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) )
            {
            // InternalSimplepalladio.g:7996:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) )
            // InternalSimplepalladio.g:7997:2: ( rule__AllocationViewType__AllocationContextsAssignment_5_1 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_5_1()); 
            // InternalSimplepalladio.g:7998:2: ( rule__AllocationViewType__AllocationContextsAssignment_5_1 )
            // InternalSimplepalladio.g:7998:3: rule__AllocationViewType__AllocationContextsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocationViewType__AllocationContextsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__Group_5__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__0"
    // InternalSimplepalladio.g:8007:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8011:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalSimplepalladio.g:8012:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AllocationContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0"


    // $ANTLR start "rule__AllocationContext__Group__0__Impl"
    // InternalSimplepalladio.g:8019:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8023:1: ( ( 'AllocationContext' ) )
            // InternalSimplepalladio.g:8024:1: ( 'AllocationContext' )
            {
            // InternalSimplepalladio.g:8024:1: ( 'AllocationContext' )
            // InternalSimplepalladio.g:8025:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group__1"
    // InternalSimplepalladio.g:8034:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8038:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalSimplepalladio.g:8039:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__AllocationContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1"


    // $ANTLR start "rule__AllocationContext__Group__1__Impl"
    // InternalSimplepalladio.g:8046:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8050:1: ( ( '{' ) )
            // InternalSimplepalladio.g:8051:1: ( '{' )
            {
            // InternalSimplepalladio.g:8051:1: ( '{' )
            // InternalSimplepalladio.g:8052:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__2"
    // InternalSimplepalladio.g:8061:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8065:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalSimplepalladio.g:8066:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__AllocationContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2"


    // $ANTLR start "rule__AllocationContext__Group__2__Impl"
    // InternalSimplepalladio.g:8073:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8077:1: ( ( 'container' ) )
            // InternalSimplepalladio.g:8078:1: ( 'container' )
            {
            // InternalSimplepalladio.g:8078:1: ( 'container' )
            // InternalSimplepalladio.g:8079:2: 'container'
            {
             before(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group__3"
    // InternalSimplepalladio.g:8088:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8092:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalSimplepalladio.g:8093:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_55);
            rule__AllocationContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3"


    // $ANTLR start "rule__AllocationContext__Group__3__Impl"
    // InternalSimplepalladio.g:8100:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8104:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalSimplepalladio.g:8105:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalSimplepalladio.g:8105:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalSimplepalladio.g:8106:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalSimplepalladio.g:8107:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalSimplepalladio.g:8107:3: rule__AllocationContext__ContainerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__ContainerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3__Impl"


    // $ANTLR start "rule__AllocationContext__Group__4"
    // InternalSimplepalladio.g:8115:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8119:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalSimplepalladio.g:8120:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__AllocationContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4"


    // $ANTLR start "rule__AllocationContext__Group__4__Impl"
    // InternalSimplepalladio.g:8127:1: rule__AllocationContext__Group__4__Impl : ( 'assembly' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8131:1: ( ( 'assembly' ) )
            // InternalSimplepalladio.g:8132:1: ( 'assembly' )
            {
            // InternalSimplepalladio.g:8132:1: ( 'assembly' )
            // InternalSimplepalladio.g:8133:2: 'assembly'
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyKeyword_4()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAssemblyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4__Impl"


    // $ANTLR start "rule__AllocationContext__Group__5"
    // InternalSimplepalladio.g:8142:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8146:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalSimplepalladio.g:8147:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__AllocationContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5"


    // $ANTLR start "rule__AllocationContext__Group__5__Impl"
    // InternalSimplepalladio.g:8154:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AssemblyAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8158:1: ( ( ( rule__AllocationContext__AssemblyAssignment_5 ) ) )
            // InternalSimplepalladio.g:8159:1: ( ( rule__AllocationContext__AssemblyAssignment_5 ) )
            {
            // InternalSimplepalladio.g:8159:1: ( ( rule__AllocationContext__AssemblyAssignment_5 ) )
            // InternalSimplepalladio.g:8160:2: ( rule__AllocationContext__AssemblyAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssignment_5()); 
            // InternalSimplepalladio.g:8161:2: ( rule__AllocationContext__AssemblyAssignment_5 )
            // InternalSimplepalladio.g:8161:3: rule__AllocationContext__AssemblyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AssemblyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAssemblyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5__Impl"


    // $ANTLR start "rule__AllocationContext__Group__6"
    // InternalSimplepalladio.g:8169:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8173:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalSimplepalladio.g:8174:2: rule__AllocationContext__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6"


    // $ANTLR start "rule__AllocationContext__Group__6__Impl"
    // InternalSimplepalladio.g:8180:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8184:1: ( ( '}' ) )
            // InternalSimplepalladio.g:8185:1: ( '}' )
            {
            // InternalSimplepalladio.g:8185:1: ( '}' )
            // InternalSimplepalladio.g:8186:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSimplepalladio.g:8196:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8200:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSimplepalladio.g:8201:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSimplepalladio.g:8208:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8212:1: ( ( RULE_ID ) )
            // InternalSimplepalladio.g:8213:1: ( RULE_ID )
            {
            // InternalSimplepalladio.g:8213:1: ( RULE_ID )
            // InternalSimplepalladio.g:8214:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSimplepalladio.g:8223:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8227:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSimplepalladio.g:8228:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSimplepalladio.g:8234:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8238:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSimplepalladio.g:8239:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSimplepalladio.g:8239:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSimplepalladio.g:8240:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSimplepalladio.g:8241:2: ( rule__QualifiedName__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==76) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSimplepalladio.g:8241:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSimplepalladio.g:8250:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8254:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSimplepalladio.g:8255:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSimplepalladio.g:8262:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8266:1: ( ( '.' ) )
            // InternalSimplepalladio.g:8267:1: ( '.' )
            {
            // InternalSimplepalladio.g:8267:1: ( '.' )
            // InternalSimplepalladio.g:8268:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSimplepalladio.g:8277:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8281:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSimplepalladio.g:8282:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSimplepalladio.g:8288:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8292:1: ( ( RULE_ID ) )
            // InternalSimplepalladio.g:8293:1: ( RULE_ID )
            {
            // InternalSimplepalladio.g:8293:1: ( RULE_ID )
            // InternalSimplepalladio.g:8294:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__RepositoryViewTypeAssignment_1"
    // InternalSimplepalladio.g:8304:1: rule__Model__RepositoryViewTypeAssignment_1 : ( ruleRepositoryViewType ) ;
    public final void rule__Model__RepositoryViewTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8308:1: ( ( ruleRepositoryViewType ) )
            // InternalSimplepalladio.g:8309:2: ( ruleRepositoryViewType )
            {
            // InternalSimplepalladio.g:8309:2: ( ruleRepositoryViewType )
            // InternalSimplepalladio.g:8310:3: ruleRepositoryViewType
            {
             before(grammarAccess.getModelAccess().getRepositoryViewTypeRepositoryViewTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRepositoryViewType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRepositoryViewTypeRepositoryViewTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RepositoryViewTypeAssignment_1"


    // $ANTLR start "rule__Model__AssemblyViewTypeAssignment_2"
    // InternalSimplepalladio.g:8319:1: rule__Model__AssemblyViewTypeAssignment_2 : ( ruleAssemblyViewType ) ;
    public final void rule__Model__AssemblyViewTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8323:1: ( ( ruleAssemblyViewType ) )
            // InternalSimplepalladio.g:8324:2: ( ruleAssemblyViewType )
            {
            // InternalSimplepalladio.g:8324:2: ( ruleAssemblyViewType )
            // InternalSimplepalladio.g:8325:3: ruleAssemblyViewType
            {
             before(grammarAccess.getModelAccess().getAssemblyViewTypeAssemblyViewTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyViewType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAssemblyViewTypeAssemblyViewTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AssemblyViewTypeAssignment_2"


    // $ANTLR start "rule__Model__RepositoryViewType2Assignment_3"
    // InternalSimplepalladio.g:8334:1: rule__Model__RepositoryViewType2Assignment_3 : ( ruleRepositoryViewType ) ;
    public final void rule__Model__RepositoryViewType2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8338:1: ( ( ruleRepositoryViewType ) )
            // InternalSimplepalladio.g:8339:2: ( ruleRepositoryViewType )
            {
            // InternalSimplepalladio.g:8339:2: ( ruleRepositoryViewType )
            // InternalSimplepalladio.g:8340:3: ruleRepositoryViewType
            {
             before(grammarAccess.getModelAccess().getRepositoryViewType2RepositoryViewTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRepositoryViewType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRepositoryViewType2RepositoryViewTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RepositoryViewType2Assignment_3"


    // $ANTLR start "rule__Model__AssemblyViewType2Assignment_4"
    // InternalSimplepalladio.g:8349:1: rule__Model__AssemblyViewType2Assignment_4 : ( ruleAssemblyViewType ) ;
    public final void rule__Model__AssemblyViewType2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8353:1: ( ( ruleAssemblyViewType ) )
            // InternalSimplepalladio.g:8354:2: ( ruleAssemblyViewType )
            {
            // InternalSimplepalladio.g:8354:2: ( ruleAssemblyViewType )
            // InternalSimplepalladio.g:8355:3: ruleAssemblyViewType
            {
             before(grammarAccess.getModelAccess().getAssemblyViewType2AssemblyViewTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyViewType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAssemblyViewType2AssemblyViewTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AssemblyViewType2Assignment_4"


    // $ANTLR start "rule__Model__EnvironmentViewTypeAssignment_5"
    // InternalSimplepalladio.g:8364:1: rule__Model__EnvironmentViewTypeAssignment_5 : ( ruleEnvironmentViewType ) ;
    public final void rule__Model__EnvironmentViewTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8368:1: ( ( ruleEnvironmentViewType ) )
            // InternalSimplepalladio.g:8369:2: ( ruleEnvironmentViewType )
            {
            // InternalSimplepalladio.g:8369:2: ( ruleEnvironmentViewType )
            // InternalSimplepalladio.g:8370:3: ruleEnvironmentViewType
            {
             before(grammarAccess.getModelAccess().getEnvironmentViewTypeEnvironmentViewTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentViewType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEnvironmentViewTypeEnvironmentViewTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EnvironmentViewTypeAssignment_5"


    // $ANTLR start "rule__Model__AllocationViewTypeAssignment_6"
    // InternalSimplepalladio.g:8379:1: rule__Model__AllocationViewTypeAssignment_6 : ( ruleAllocationViewType ) ;
    public final void rule__Model__AllocationViewTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8383:1: ( ( ruleAllocationViewType ) )
            // InternalSimplepalladio.g:8384:2: ( ruleAllocationViewType )
            {
            // InternalSimplepalladio.g:8384:2: ( ruleAllocationViewType )
            // InternalSimplepalladio.g:8385:3: ruleAllocationViewType
            {
             before(grammarAccess.getModelAccess().getAllocationViewTypeAllocationViewTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocationViewType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAllocationViewTypeAllocationViewTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AllocationViewTypeAssignment_6"


    // $ANTLR start "rule__RepositoryViewType__RepositoryElementsAssignment_4"
    // InternalSimplepalladio.g:8394:1: rule__RepositoryViewType__RepositoryElementsAssignment_4 : ( ruleAbstractRepositoryElement ) ;
    public final void rule__RepositoryViewType__RepositoryElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8398:1: ( ( ruleAbstractRepositoryElement ) )
            // InternalSimplepalladio.g:8399:2: ( ruleAbstractRepositoryElement )
            {
            // InternalSimplepalladio.g:8399:2: ( ruleAbstractRepositoryElement )
            // InternalSimplepalladio.g:8400:3: ruleAbstractRepositoryElement
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRepositoryElement();

            state._fsp--;

             after(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__RepositoryElementsAssignment_4"


    // $ANTLR start "rule__RepositoryViewType__RepositoryElementsAssignment_5_1"
    // InternalSimplepalladio.g:8409:1: rule__RepositoryViewType__RepositoryElementsAssignment_5_1 : ( ruleAbstractRepositoryElement ) ;
    public final void rule__RepositoryViewType__RepositoryElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8413:1: ( ( ruleAbstractRepositoryElement ) )
            // InternalSimplepalladio.g:8414:2: ( ruleAbstractRepositoryElement )
            {
            // InternalSimplepalladio.g:8414:2: ( ruleAbstractRepositoryElement )
            // InternalSimplepalladio.g:8415:3: ruleAbstractRepositoryElement
            {
             before(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRepositoryElement();

            state._fsp--;

             after(grammarAccess.getRepositoryViewTypeAccess().getRepositoryElementsAbstractRepositoryElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryViewType__RepositoryElementsAssignment_5_1"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalSimplepalladio.g:8424:1: rule__Interface__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8428:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8429:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:8429:2: ( ruleEString )
            // InternalSimplepalladio.g:8430:3: ruleEString
            {
             before(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__SignaturesAssignment_5"
    // InternalSimplepalladio.g:8439:1: rule__Interface__SignaturesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Interface__SignaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8443:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8444:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8444:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8445:3: ( ruleEString )
            {
             before(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_5_0()); 
            // InternalSimplepalladio.g:8446:3: ( ruleEString )
            // InternalSimplepalladio.g:8447:4: ruleEString
            {
             before(grammarAccess.getInterfaceAccess().getSignaturesSignatureEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignaturesSignatureEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SignaturesAssignment_5"


    // $ANTLR start "rule__Interface__SignaturesAssignment_6_1"
    // InternalSimplepalladio.g:8458:1: rule__Interface__SignaturesAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Interface__SignaturesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8462:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8463:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8463:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8464:3: ( ruleEString )
            {
             before(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_6_1_0()); 
            // InternalSimplepalladio.g:8465:3: ( ruleEString )
            // InternalSimplepalladio.g:8466:4: ruleEString
            {
             before(grammarAccess.getInterfaceAccess().getSignaturesSignatureEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignaturesSignatureEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getSignaturesSignatureCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SignaturesAssignment_6_1"


    // $ANTLR start "rule__CompositeComponent__NameAssignment_1"
    // InternalSimplepalladio.g:8477:1: rule__CompositeComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8481:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8482:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:8482:2: ( ruleEString )
            // InternalSimplepalladio.g:8483:3: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__NameAssignment_1"


    // $ANTLR start "rule__CompositeComponent__RequiredInterfacesAssignment_3_2"
    // InternalSimplepalladio.g:8492:1: rule__CompositeComponent__RequiredInterfacesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredInterfacesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8496:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8497:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8497:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8498:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0()); 
            // InternalSimplepalladio.g:8499:3: ( ruleEString )
            // InternalSimplepalladio.g:8500:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredInterfacesAssignment_3_2"


    // $ANTLR start "rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1"
    // InternalSimplepalladio.g:8511:1: rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8515:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8516:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8516:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8517:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0()); 
            // InternalSimplepalladio.g:8518:3: ( ruleEString )
            // InternalSimplepalladio.g:8519:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredInterfacesAssignment_3_3_1"


    // $ANTLR start "rule__CompositeComponent__ProvidedInterfacesAssignment_6"
    // InternalSimplepalladio.g:8530:1: rule__CompositeComponent__ProvidedInterfacesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__ProvidedInterfacesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8534:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8535:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8535:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8536:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0()); 
            // InternalSimplepalladio.g:8537:3: ( ruleEString )
            // InternalSimplepalladio.g:8538:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedInterfacesAssignment_6"


    // $ANTLR start "rule__CompositeComponent__ProvidedInterfacesAssignment_7_1"
    // InternalSimplepalladio.g:8549:1: rule__CompositeComponent__ProvidedInterfacesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__ProvidedInterfacesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8553:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8554:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8554:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8555:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0()); 
            // InternalSimplepalladio.g:8556:3: ( ruleEString )
            // InternalSimplepalladio.g:8557:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedInterfacesAssignment_7_1"


    // $ANTLR start "rule__CompositeComponent__SystemAssignment_10"
    // InternalSimplepalladio.g:8568:1: rule__CompositeComponent__SystemAssignment_10 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeComponent__SystemAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8572:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSimplepalladio.g:8573:2: ( ( ruleQualifiedName ) )
            {
            // InternalSimplepalladio.g:8573:2: ( ( ruleQualifiedName ) )
            // InternalSimplepalladio.g:8574:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeComponentAccess().getSystemSystemCrossReference_10_0()); 
            // InternalSimplepalladio.g:8575:3: ( ruleQualifiedName )
            // InternalSimplepalladio.g:8576:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositeComponentAccess().getSystemSystemQualifiedNameParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getSystemSystemQualifiedNameParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getSystemSystemCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__SystemAssignment_10"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalSimplepalladio.g:8587:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8591:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8592:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:8592:2: ( ruleEString )
            // InternalSimplepalladio.g:8593:3: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__NameAssignment_1"


    // $ANTLR start "rule__Signature__ReturnValueAssignment_4"
    // InternalSimplepalladio.g:8602:1: rule__Signature__ReturnValueAssignment_4 : ( ruleType ) ;
    public final void rule__Signature__ReturnValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8606:1: ( ( ruleType ) )
            // InternalSimplepalladio.g:8607:2: ( ruleType )
            {
            // InternalSimplepalladio.g:8607:2: ( ruleType )
            // InternalSimplepalladio.g:8608:3: ruleType
            {
             before(grammarAccess.getSignatureAccess().getReturnValueTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getReturnValueTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ReturnValueAssignment_4"


    // $ANTLR start "rule__Signature__ParametersAssignment_5_2"
    // InternalSimplepalladio.g:8617:1: rule__Signature__ParametersAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Signature__ParametersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8621:1: ( ( ruleParameter ) )
            // InternalSimplepalladio.g:8622:2: ( ruleParameter )
            {
            // InternalSimplepalladio.g:8622:2: ( ruleParameter )
            // InternalSimplepalladio.g:8623:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParametersAssignment_5_2"


    // $ANTLR start "rule__Signature__ParametersAssignment_5_3_1"
    // InternalSimplepalladio.g:8632:1: rule__Signature__ParametersAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__Signature__ParametersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8636:1: ( ( ruleParameter ) )
            // InternalSimplepalladio.g:8637:2: ( ruleParameter )
            {
            // InternalSimplepalladio.g:8637:2: ( ruleParameter )
            // InternalSimplepalladio.g:8638:3: ruleParameter
            {
             before(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParametersAssignment_5_3_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalSimplepalladio.g:8647:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8651:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8652:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:8652:2: ( ruleEString )
            // InternalSimplepalladio.g:8653:3: ruleEString
            {
             before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__RequiredInterfacesAssignment_3_2"
    // InternalSimplepalladio.g:8662:1: rule__Component__RequiredInterfacesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Component__RequiredInterfacesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8666:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8667:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8667:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8668:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0()); 
            // InternalSimplepalladio.g:8669:3: ( ruleEString )
            // InternalSimplepalladio.g:8670:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__RequiredInterfacesAssignment_3_2"


    // $ANTLR start "rule__Component__RequiredInterfacesAssignment_3_3_1"
    // InternalSimplepalladio.g:8681:1: rule__Component__RequiredInterfacesAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Component__RequiredInterfacesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8685:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8686:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8686:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8687:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0()); 
            // InternalSimplepalladio.g:8688:3: ( ruleEString )
            // InternalSimplepalladio.g:8689:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__RequiredInterfacesAssignment_3_3_1"


    // $ANTLR start "rule__Component__ProvidedInterfacesAssignment_6"
    // InternalSimplepalladio.g:8700:1: rule__Component__ProvidedInterfacesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Component__ProvidedInterfacesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8704:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8705:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8705:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8706:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0()); 
            // InternalSimplepalladio.g:8707:3: ( ruleEString )
            // InternalSimplepalladio.g:8708:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ProvidedInterfacesAssignment_6"


    // $ANTLR start "rule__Component__ProvidedInterfacesAssignment_7_1"
    // InternalSimplepalladio.g:8719:1: rule__Component__ProvidedInterfacesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Component__ProvidedInterfacesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8723:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8724:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8724:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8725:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0()); 
            // InternalSimplepalladio.g:8726:3: ( ruleEString )
            // InternalSimplepalladio.g:8727:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ProvidedInterfacesAssignment_7_1"


    // $ANTLR start "rule__Component__ServicesAssignment_11"
    // InternalSimplepalladio.g:8738:1: rule__Component__ServicesAssignment_11 : ( ruleService ) ;
    public final void rule__Component__ServicesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8742:1: ( ( ruleService ) )
            // InternalSimplepalladio.g:8743:2: ( ruleService )
            {
            // InternalSimplepalladio.g:8743:2: ( ruleService )
            // InternalSimplepalladio.g:8744:3: ruleService
            {
             before(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ServicesAssignment_11"


    // $ANTLR start "rule__Component__ServicesAssignment_12_1"
    // InternalSimplepalladio.g:8753:1: rule__Component__ServicesAssignment_12_1 : ( ruleService ) ;
    public final void rule__Component__ServicesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8757:1: ( ( ruleService ) )
            // InternalSimplepalladio.g:8758:2: ( ruleService )
            {
            // InternalSimplepalladio.g:8758:2: ( ruleService )
            // InternalSimplepalladio.g:8759:3: ruleService
            {
             before(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ServicesAssignment_12_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalSimplepalladio.g:8768:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8772:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8773:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:8773:2: ( ruleEString )
            // InternalSimplepalladio.g:8774:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_4"
    // InternalSimplepalladio.g:8783:1: rule__Parameter__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8787:1: ( ( ruleType ) )
            // InternalSimplepalladio.g:8788:2: ( ruleType )
            {
            // InternalSimplepalladio.g:8788:2: ( ruleType )
            // InternalSimplepalladio.g:8789:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_4"


    // $ANTLR start "rule__Service__SignatureAssignment_3"
    // InternalSimplepalladio.g:8798:1: rule__Service__SignatureAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Service__SignatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8802:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8803:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8803:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8804:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getSignatureSignatureCrossReference_3_0()); 
            // InternalSimplepalladio.g:8805:3: ( ruleEString )
            // InternalSimplepalladio.g:8806:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getSignatureSignatureEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getSignatureSignatureEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getSignatureSignatureCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__SignatureAssignment_3"


    // $ANTLR start "rule__Service__BehaviourDescriptionAssignment_5"
    // InternalSimplepalladio.g:8817:1: rule__Service__BehaviourDescriptionAssignment_5 : ( ruleBehaviourDescription ) ;
    public final void rule__Service__BehaviourDescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8821:1: ( ( ruleBehaviourDescription ) )
            // InternalSimplepalladio.g:8822:2: ( ruleBehaviourDescription )
            {
            // InternalSimplepalladio.g:8822:2: ( ruleBehaviourDescription )
            // InternalSimplepalladio.g:8823:3: ruleBehaviourDescription
            {
             before(grammarAccess.getServiceAccess().getBehaviourDescriptionBehaviourDescriptionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviourDescription();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getBehaviourDescriptionBehaviourDescriptionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__BehaviourDescriptionAssignment_5"


    // $ANTLR start "rule__BehaviourDescription__BehaviorElementsAssignment_5"
    // InternalSimplepalladio.g:8832:1: rule__BehaviourDescription__BehaviorElementsAssignment_5 : ( ruleBehaviorElement ) ;
    public final void rule__BehaviourDescription__BehaviorElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8836:1: ( ( ruleBehaviorElement ) )
            // InternalSimplepalladio.g:8837:2: ( ruleBehaviorElement )
            {
            // InternalSimplepalladio.g:8837:2: ( ruleBehaviorElement )
            // InternalSimplepalladio.g:8838:3: ruleBehaviorElement
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorElement();

            state._fsp--;

             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__BehaviorElementsAssignment_5"


    // $ANTLR start "rule__BehaviourDescription__BehaviorElementsAssignment_6_1"
    // InternalSimplepalladio.g:8847:1: rule__BehaviourDescription__BehaviorElementsAssignment_6_1 : ( ruleBehaviorElement ) ;
    public final void rule__BehaviourDescription__BehaviorElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8851:1: ( ( ruleBehaviorElement ) )
            // InternalSimplepalladio.g:8852:2: ( ruleBehaviorElement )
            {
            // InternalSimplepalladio.g:8852:2: ( ruleBehaviorElement )
            // InternalSimplepalladio.g:8853:3: ruleBehaviorElement
            {
             before(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorElement();

            state._fsp--;

             after(grammarAccess.getBehaviourDescriptionAccess().getBehaviorElementsBehaviorElementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourDescription__BehaviorElementsAssignment_6_1"


    // $ANTLR start "rule__ExternalCall__SignatureAssignment_3"
    // InternalSimplepalladio.g:8862:1: rule__ExternalCall__SignatureAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExternalCall__SignatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8866:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8867:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8867:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8868:3: ( ruleEString )
            {
             before(grammarAccess.getExternalCallAccess().getSignatureSignatureCrossReference_3_0()); 
            // InternalSimplepalladio.g:8869:3: ( ruleEString )
            // InternalSimplepalladio.g:8870:4: ruleEString
            {
             before(grammarAccess.getExternalCallAccess().getSignatureSignatureEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalCallAccess().getSignatureSignatureEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExternalCallAccess().getSignatureSignatureCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalCall__SignatureAssignment_3"


    // $ANTLR start "rule__Loop__BehaviorElementsAssignment_3_2"
    // InternalSimplepalladio.g:8881:1: rule__Loop__BehaviorElementsAssignment_3_2 : ( ruleBehaviorElement ) ;
    public final void rule__Loop__BehaviorElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8885:1: ( ( ruleBehaviorElement ) )
            // InternalSimplepalladio.g:8886:2: ( ruleBehaviorElement )
            {
            // InternalSimplepalladio.g:8886:2: ( ruleBehaviorElement )
            // InternalSimplepalladio.g:8887:3: ruleBehaviorElement
            {
             before(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorElement();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__BehaviorElementsAssignment_3_2"


    // $ANTLR start "rule__Loop__BehaviorElementsAssignment_3_3_1"
    // InternalSimplepalladio.g:8896:1: rule__Loop__BehaviorElementsAssignment_3_3_1 : ( ruleBehaviorElement ) ;
    public final void rule__Loop__BehaviorElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8900:1: ( ( ruleBehaviorElement ) )
            // InternalSimplepalladio.g:8901:2: ( ruleBehaviorElement )
            {
            // InternalSimplepalladio.g:8901:2: ( ruleBehaviorElement )
            // InternalSimplepalladio.g:8902:3: ruleBehaviorElement
            {
             before(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorElement();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__BehaviorElementsAssignment_3_3_1"


    // $ANTLR start "rule__Branch__BehaviorElementsAssignment_3_2"
    // InternalSimplepalladio.g:8911:1: rule__Branch__BehaviorElementsAssignment_3_2 : ( ruleBehaviorElement ) ;
    public final void rule__Branch__BehaviorElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8915:1: ( ( ruleBehaviorElement ) )
            // InternalSimplepalladio.g:8916:2: ( ruleBehaviorElement )
            {
            // InternalSimplepalladio.g:8916:2: ( ruleBehaviorElement )
            // InternalSimplepalladio.g:8917:3: ruleBehaviorElement
            {
             before(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorElement();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__BehaviorElementsAssignment_3_2"


    // $ANTLR start "rule__Branch__BehaviorElementsAssignment_3_3_1"
    // InternalSimplepalladio.g:8926:1: rule__Branch__BehaviorElementsAssignment_3_3_1 : ( ruleBehaviorElement ) ;
    public final void rule__Branch__BehaviorElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8930:1: ( ( ruleBehaviorElement ) )
            // InternalSimplepalladio.g:8931:2: ( ruleBehaviorElement )
            {
            // InternalSimplepalladio.g:8931:2: ( ruleBehaviorElement )
            // InternalSimplepalladio.g:8932:3: ruleBehaviorElement
            {
             before(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorElement();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getBehaviorElementsBehaviorElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__BehaviorElementsAssignment_3_3_1"


    // $ANTLR start "rule__AssemblyViewType__SystemsAssignment_4"
    // InternalSimplepalladio.g:8941:1: rule__AssemblyViewType__SystemsAssignment_4 : ( ruleSystem ) ;
    public final void rule__AssemblyViewType__SystemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8945:1: ( ( ruleSystem ) )
            // InternalSimplepalladio.g:8946:2: ( ruleSystem )
            {
            // InternalSimplepalladio.g:8946:2: ( ruleSystem )
            // InternalSimplepalladio.g:8947:3: ruleSystem
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__SystemsAssignment_4"


    // $ANTLR start "rule__AssemblyViewType__SystemsAssignment_5_1"
    // InternalSimplepalladio.g:8956:1: rule__AssemblyViewType__SystemsAssignment_5_1 : ( ruleSystem ) ;
    public final void rule__AssemblyViewType__SystemsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8960:1: ( ( ruleSystem ) )
            // InternalSimplepalladio.g:8961:2: ( ruleSystem )
            {
            // InternalSimplepalladio.g:8961:2: ( ruleSystem )
            // InternalSimplepalladio.g:8962:3: ruleSystem
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getAssemblyViewTypeAccess().getSystemsSystemParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyViewType__SystemsAssignment_5_1"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalSimplepalladio.g:8971:1: rule__System__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8975:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8976:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:8976:2: ( ruleEString )
            // InternalSimplepalladio.g:8977:3: ruleEString
            {
             before(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__RequiredInterfacesAssignment_3_2"
    // InternalSimplepalladio.g:8986:1: rule__System__RequiredInterfacesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__System__RequiredInterfacesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:8990:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:8991:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:8991:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:8992:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0()); 
            // InternalSimplepalladio.g:8993:3: ( ruleEString )
            // InternalSimplepalladio.g:8994:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__RequiredInterfacesAssignment_3_2"


    // $ANTLR start "rule__System__RequiredInterfacesAssignment_3_3_1"
    // InternalSimplepalladio.g:9005:1: rule__System__RequiredInterfacesAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__System__RequiredInterfacesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9009:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9010:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9010:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9011:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0()); 
            // InternalSimplepalladio.g:9012:3: ( ruleEString )
            // InternalSimplepalladio.g:9013:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__RequiredInterfacesAssignment_3_3_1"


    // $ANTLR start "rule__System__ProvidedInterfacesAssignment_6"
    // InternalSimplepalladio.g:9024:1: rule__System__ProvidedInterfacesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__System__ProvidedInterfacesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9028:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9029:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9029:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9030:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_6_0()); 
            // InternalSimplepalladio.g:9031:3: ( ruleEString )
            // InternalSimplepalladio.g:9032:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProvidedInterfacesAssignment_6"


    // $ANTLR start "rule__System__ProvidedInterfacesAssignment_7_1"
    // InternalSimplepalladio.g:9043:1: rule__System__ProvidedInterfacesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__System__ProvidedInterfacesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9047:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9048:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9048:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9049:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0()); 
            // InternalSimplepalladio.g:9050:3: ( ruleEString )
            // InternalSimplepalladio.g:9051:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProvidedInterfacesAssignment_7_1"


    // $ANTLR start "rule__System__SystemElementsAssignment_11"
    // InternalSimplepalladio.g:9062:1: rule__System__SystemElementsAssignment_11 : ( ruleAbstractSystemElement ) ;
    public final void rule__System__SystemElementsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9066:1: ( ( ruleAbstractSystemElement ) )
            // InternalSimplepalladio.g:9067:2: ( ruleAbstractSystemElement )
            {
            // InternalSimplepalladio.g:9067:2: ( ruleAbstractSystemElement )
            // InternalSimplepalladio.g:9068:3: ruleAbstractSystemElement
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSystemElement();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemElementsAssignment_11"


    // $ANTLR start "rule__System__SystemElementsAssignment_12_1"
    // InternalSimplepalladio.g:9077:1: rule__System__SystemElementsAssignment_12_1 : ( ruleAbstractSystemElement ) ;
    public final void rule__System__SystemElementsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9081:1: ( ( ruleAbstractSystemElement ) )
            // InternalSimplepalladio.g:9082:2: ( ruleAbstractSystemElement )
            {
            // InternalSimplepalladio.g:9082:2: ( ruleAbstractSystemElement )
            // InternalSimplepalladio.g:9083:3: ruleAbstractSystemElement
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSystemElement();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemElementsAssignment_12_1"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalSimplepalladio.g:9092:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9096:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9097:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:9097:2: ( ruleEString )
            // InternalSimplepalladio.g:9098:3: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__NameAssignment_1"


    // $ANTLR start "rule__AssemblyContext__ComponentAssignment_4"
    // InternalSimplepalladio.g:9107:1: rule__AssemblyContext__ComponentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9111:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9112:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9112:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9113:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAbstractComponentCrossReference_4_0()); 
            // InternalSimplepalladio.g:9114:3: ( ruleEString )
            // InternalSimplepalladio.g:9115:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAbstractComponentEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getComponentAbstractComponentEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAbstractComponentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ComponentAssignment_4"


    // $ANTLR start "rule__AssemblyContext__ProvidedRolesAssignment_7"
    // InternalSimplepalladio.g:9126:1: rule__AssemblyContext__ProvidedRolesAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9130:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9131:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9131:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9132:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_7_0()); 
            // InternalSimplepalladio.g:9133:3: ( ruleEString )
            // InternalSimplepalladio.g:9134:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ProvidedRolesAssignment_7"


    // $ANTLR start "rule__AssemblyContext__ProvidedRolesAssignment_8_1"
    // InternalSimplepalladio.g:9145:1: rule__AssemblyContext__ProvidedRolesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9149:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9150:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9150:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9151:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_8_1_0()); 
            // InternalSimplepalladio.g:9152:3: ( ruleEString )
            // InternalSimplepalladio.g:9153:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ProvidedRolesAssignment_8_1"


    // $ANTLR start "rule__AssemblyContext__RequiredRolesAssignment_10_2"
    // InternalSimplepalladio.g:9164:1: rule__AssemblyContext__RequiredRolesAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9168:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9169:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9169:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9170:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_2_0()); 
            // InternalSimplepalladio.g:9171:3: ( ruleEString )
            // InternalSimplepalladio.g:9172:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__RequiredRolesAssignment_10_2"


    // $ANTLR start "rule__AssemblyContext__RequiredRolesAssignment_10_3_1"
    // InternalSimplepalladio.g:9183:1: rule__AssemblyContext__RequiredRolesAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9187:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9188:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9188:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9189:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_3_1_0()); 
            // InternalSimplepalladio.g:9190:3: ( ruleEString )
            // InternalSimplepalladio.g:9191:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__RequiredRolesAssignment_10_3_1"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // InternalSimplepalladio.g:9202:1: rule__Role__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9206:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9207:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:9207:2: ( ruleEString )
            // InternalSimplepalladio.g:9208:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__InterfaceAssignment_4"
    // InternalSimplepalladio.g:9217:1: rule__Role__InterfaceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Role__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9221:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9222:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9222:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9223:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 
            // InternalSimplepalladio.g:9224:3: ( ruleEString )
            // InternalSimplepalladio.g:9225:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getInterfaceInterfaceEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__InterfaceAssignment_4"


    // $ANTLR start "rule__DelegationConnector__NameAssignment_1"
    // InternalSimplepalladio.g:9236:1: rule__DelegationConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DelegationConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9240:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9241:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:9241:2: ( ruleEString )
            // InternalSimplepalladio.g:9242:3: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__NameAssignment_1"


    // $ANTLR start "rule__DelegationConnector__RoleAssignment_4"
    // InternalSimplepalladio.g:9251:1: rule__DelegationConnector__RoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9255:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9256:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9256:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9257:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_4_0()); 
            // InternalSimplepalladio.g:9258:3: ( ruleEString )
            // InternalSimplepalladio.g:9259:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__RoleAssignment_4"


    // $ANTLR start "rule__DelegationConnector__InterfaceAssignment_6"
    // InternalSimplepalladio.g:9270:1: rule__DelegationConnector__InterfaceAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__InterfaceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9274:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9275:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9275:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9276:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceCrossReference_6_0()); 
            // InternalSimplepalladio.g:9277:3: ( ruleEString )
            // InternalSimplepalladio.g:9278:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__InterfaceAssignment_6"


    // $ANTLR start "rule__AssemblyConnector__NameAssignment_1"
    // InternalSimplepalladio.g:9289:1: rule__AssemblyConnector__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9293:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9294:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:9294:2: ( ruleEString )
            // InternalSimplepalladio.g:9295:3: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__NameAssignment_1"


    // $ANTLR start "rule__AssemblyConnector__ProvidedRoleAssignment_4"
    // InternalSimplepalladio.g:9304:1: rule__AssemblyConnector__ProvidedRoleAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__ProvidedRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9308:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9309:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9309:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9310:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_4_0()); 
            // InternalSimplepalladio.g:9311:3: ( ruleEString )
            // InternalSimplepalladio.g:9312:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__ProvidedRoleAssignment_4"


    // $ANTLR start "rule__AssemblyConnector__RequiredRoleAssignment_6"
    // InternalSimplepalladio.g:9323:1: rule__AssemblyConnector__RequiredRoleAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__RequiredRoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9327:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9328:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9328:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9329:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_6_0()); 
            // InternalSimplepalladio.g:9330:3: ( ruleEString )
            // InternalSimplepalladio.g:9331:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__RequiredRoleAssignment_6"


    // $ANTLR start "rule__EnvironmentViewType__EnvironmentElementsAssignment_4"
    // InternalSimplepalladio.g:9342:1: rule__EnvironmentViewType__EnvironmentElementsAssignment_4 : ( ruleAbstractEnvironmentElement ) ;
    public final void rule__EnvironmentViewType__EnvironmentElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9346:1: ( ( ruleAbstractEnvironmentElement ) )
            // InternalSimplepalladio.g:9347:2: ( ruleAbstractEnvironmentElement )
            {
            // InternalSimplepalladio.g:9347:2: ( ruleAbstractEnvironmentElement )
            // InternalSimplepalladio.g:9348:3: ruleAbstractEnvironmentElement
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractEnvironmentElement();

            state._fsp--;

             after(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__EnvironmentElementsAssignment_4"


    // $ANTLR start "rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1"
    // InternalSimplepalladio.g:9357:1: rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 : ( ruleAbstractEnvironmentElement ) ;
    public final void rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9361:1: ( ( ruleAbstractEnvironmentElement ) )
            // InternalSimplepalladio.g:9362:2: ( ruleAbstractEnvironmentElement )
            {
            // InternalSimplepalladio.g:9362:2: ( ruleAbstractEnvironmentElement )
            // InternalSimplepalladio.g:9363:3: ruleAbstractEnvironmentElement
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractEnvironmentElement();

            state._fsp--;

             after(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAbstractEnvironmentElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1"


    // $ANTLR start "rule__Container__NameAssignment_2"
    // InternalSimplepalladio.g:9372:1: rule__Container__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9376:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9377:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:9377:2: ( ruleEString )
            // InternalSimplepalladio.g:9378:3: ruleEString
            {
             before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__NameAssignment_2"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalSimplepalladio.g:9387:1: rule__Link__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9391:1: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9392:2: ( ruleEString )
            {
            // InternalSimplepalladio.g:9392:2: ( ruleEString )
            // InternalSimplepalladio.g:9393:3: ruleEString
            {
             before(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__ContainersAssignment_5"
    // InternalSimplepalladio.g:9402:1: rule__Link__ContainersAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9406:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9407:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9407:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9408:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainersContainerCrossReference_5_0()); 
            // InternalSimplepalladio.g:9409:3: ( ruleEString )
            // InternalSimplepalladio.g:9410:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getContainersContainerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getContainersContainerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getContainersContainerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ContainersAssignment_5"


    // $ANTLR start "rule__Link__ContainersAssignment_6_1"
    // InternalSimplepalladio.g:9421:1: rule__Link__ContainersAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9425:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9426:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9426:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9427:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainersContainerCrossReference_6_1_0()); 
            // InternalSimplepalladio.g:9428:3: ( ruleEString )
            // InternalSimplepalladio.g:9429:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getContainersContainerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getContainersContainerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getContainersContainerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ContainersAssignment_6_1"


    // $ANTLR start "rule__AllocationViewType__AllocationContextsAssignment_4"
    // InternalSimplepalladio.g:9440:1: rule__AllocationViewType__AllocationContextsAssignment_4 : ( ruleAllocationContext ) ;
    public final void rule__AllocationViewType__AllocationContextsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9444:1: ( ( ruleAllocationContext ) )
            // InternalSimplepalladio.g:9445:2: ( ruleAllocationContext )
            {
            // InternalSimplepalladio.g:9445:2: ( ruleAllocationContext )
            // InternalSimplepalladio.g:9446:3: ruleAllocationContext
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__AllocationContextsAssignment_4"


    // $ANTLR start "rule__AllocationViewType__AllocationContextsAssignment_5_1"
    // InternalSimplepalladio.g:9455:1: rule__AllocationViewType__AllocationContextsAssignment_5_1 : ( ruleAllocationContext ) ;
    public final void rule__AllocationViewType__AllocationContextsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9459:1: ( ( ruleAllocationContext ) )
            // InternalSimplepalladio.g:9460:2: ( ruleAllocationContext )
            {
            // InternalSimplepalladio.g:9460:2: ( ruleAllocationContext )
            // InternalSimplepalladio.g:9461:3: ruleAllocationContext
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAllocationContextParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationViewType__AllocationContextsAssignment_5_1"


    // $ANTLR start "rule__AllocationContext__ContainerAssignment_3"
    // InternalSimplepalladio.g:9470:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9474:1: ( ( ( ruleEString ) ) )
            // InternalSimplepalladio.g:9475:2: ( ( ruleEString ) )
            {
            // InternalSimplepalladio.g:9475:2: ( ( ruleEString ) )
            // InternalSimplepalladio.g:9476:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalSimplepalladio.g:9477:3: ( ruleEString )
            // InternalSimplepalladio.g:9478:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getContainerContainerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__ContainerAssignment_3"


    // $ANTLR start "rule__AllocationContext__AssemblyAssignment_5"
    // InternalSimplepalladio.g:9489:1: rule__AllocationContext__AssemblyAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AllocationContext__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplepalladio.g:9493:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSimplepalladio.g:9494:2: ( ( ruleQualifiedName ) )
            {
            // InternalSimplepalladio.g:9494:2: ( ( ruleQualifiedName ) )
            // InternalSimplepalladio.g:9495:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextCrossReference_5_0()); 
            // InternalSimplepalladio.g:9496:3: ( ruleQualifiedName )
            // InternalSimplepalladio.g:9497:4: ruleQualifiedName
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__AssemblyAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000001000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004888000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000003FF800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xA880000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});

}