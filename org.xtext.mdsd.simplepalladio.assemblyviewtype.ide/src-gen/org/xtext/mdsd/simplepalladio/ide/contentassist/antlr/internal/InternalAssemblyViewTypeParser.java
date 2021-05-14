package org.xtext.mdsd.simplepalladio.ide.contentassist.antlr.internal;

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
import org.xtext.mdsd.simplepalladio.services.AssemblyViewTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssemblyViewTypeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AssemblyViewType'", "'{'", "'systems'", "'}'", "','", "'System'", "'providedInterfaces'", "'('", "')'", "'systemElements'", "'requiredInterfaces'", "'AssemblyContext'", "'component'", "'providedRoles'", "'requiredRoles'", "'Role'", "'interface'", "'DelegationConnector'", "'role'", "'AssemblyConnector'", "'providedRole'", "'requiredRole'"
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

    	public void setGrammarAccess(AssemblyViewTypeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAssemblyViewType"
    // InternalAssemblyViewType.g:53:1: entryRuleAssemblyViewType : ruleAssemblyViewType EOF ;
    public final void entryRuleAssemblyViewType() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:54:1: ( ruleAssemblyViewType EOF )
            // InternalAssemblyViewType.g:55:1: ruleAssemblyViewType EOF
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
    // InternalAssemblyViewType.g:62:1: ruleAssemblyViewType : ( ( rule__AssemblyViewType__Group__0 ) ) ;
    public final void ruleAssemblyViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:66:2: ( ( ( rule__AssemblyViewType__Group__0 ) ) )
            // InternalAssemblyViewType.g:67:2: ( ( rule__AssemblyViewType__Group__0 ) )
            {
            // InternalAssemblyViewType.g:67:2: ( ( rule__AssemblyViewType__Group__0 ) )
            // InternalAssemblyViewType.g:68:3: ( rule__AssemblyViewType__Group__0 )
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getGroup()); 
            // InternalAssemblyViewType.g:69:3: ( rule__AssemblyViewType__Group__0 )
            // InternalAssemblyViewType.g:69:4: rule__AssemblyViewType__Group__0
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
    // InternalAssemblyViewType.g:78:1: entryRuleAbstractSystemElement : ruleAbstractSystemElement EOF ;
    public final void entryRuleAbstractSystemElement() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:79:1: ( ruleAbstractSystemElement EOF )
            // InternalAssemblyViewType.g:80:1: ruleAbstractSystemElement EOF
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
    // InternalAssemblyViewType.g:87:1: ruleAbstractSystemElement : ( ( rule__AbstractSystemElement__Alternatives ) ) ;
    public final void ruleAbstractSystemElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:91:2: ( ( ( rule__AbstractSystemElement__Alternatives ) ) )
            // InternalAssemblyViewType.g:92:2: ( ( rule__AbstractSystemElement__Alternatives ) )
            {
            // InternalAssemblyViewType.g:92:2: ( ( rule__AbstractSystemElement__Alternatives ) )
            // InternalAssemblyViewType.g:93:3: ( rule__AbstractSystemElement__Alternatives )
            {
             before(grammarAccess.getAbstractSystemElementAccess().getAlternatives()); 
            // InternalAssemblyViewType.g:94:3: ( rule__AbstractSystemElement__Alternatives )
            // InternalAssemblyViewType.g:94:4: rule__AbstractSystemElement__Alternatives
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
    // InternalAssemblyViewType.g:103:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:104:1: ( ruleSystem EOF )
            // InternalAssemblyViewType.g:105:1: ruleSystem EOF
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
    // InternalAssemblyViewType.g:112:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:116:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalAssemblyViewType.g:117:2: ( ( rule__System__Group__0 ) )
            {
            // InternalAssemblyViewType.g:117:2: ( ( rule__System__Group__0 ) )
            // InternalAssemblyViewType.g:118:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalAssemblyViewType.g:119:3: ( rule__System__Group__0 )
            // InternalAssemblyViewType.g:119:4: rule__System__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalAssemblyViewType.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:129:1: ( ruleEString EOF )
            // InternalAssemblyViewType.g:130:1: ruleEString EOF
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
    // InternalAssemblyViewType.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAssemblyViewType.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAssemblyViewType.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalAssemblyViewType.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAssemblyViewType.g:144:3: ( rule__EString__Alternatives )
            // InternalAssemblyViewType.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalAssemblyViewType.g:153:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:154:1: ( ruleAssemblyContext EOF )
            // InternalAssemblyViewType.g:155:1: ruleAssemblyContext EOF
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
    // InternalAssemblyViewType.g:162:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:166:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalAssemblyViewType.g:167:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalAssemblyViewType.g:167:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalAssemblyViewType.g:168:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalAssemblyViewType.g:169:3: ( rule__AssemblyContext__Group__0 )
            // InternalAssemblyViewType.g:169:4: rule__AssemblyContext__Group__0
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
    // InternalAssemblyViewType.g:178:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:179:1: ( ruleRole EOF )
            // InternalAssemblyViewType.g:180:1: ruleRole EOF
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
    // InternalAssemblyViewType.g:187:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:191:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalAssemblyViewType.g:192:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalAssemblyViewType.g:192:2: ( ( rule__Role__Group__0 ) )
            // InternalAssemblyViewType.g:193:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalAssemblyViewType.g:194:3: ( rule__Role__Group__0 )
            // InternalAssemblyViewType.g:194:4: rule__Role__Group__0
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
    // InternalAssemblyViewType.g:203:1: entryRuleDelegationConnector : ruleDelegationConnector EOF ;
    public final void entryRuleDelegationConnector() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:204:1: ( ruleDelegationConnector EOF )
            // InternalAssemblyViewType.g:205:1: ruleDelegationConnector EOF
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
    // InternalAssemblyViewType.g:212:1: ruleDelegationConnector : ( ( rule__DelegationConnector__Group__0 ) ) ;
    public final void ruleDelegationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:216:2: ( ( ( rule__DelegationConnector__Group__0 ) ) )
            // InternalAssemblyViewType.g:217:2: ( ( rule__DelegationConnector__Group__0 ) )
            {
            // InternalAssemblyViewType.g:217:2: ( ( rule__DelegationConnector__Group__0 ) )
            // InternalAssemblyViewType.g:218:3: ( rule__DelegationConnector__Group__0 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getGroup()); 
            // InternalAssemblyViewType.g:219:3: ( rule__DelegationConnector__Group__0 )
            // InternalAssemblyViewType.g:219:4: rule__DelegationConnector__Group__0
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
    // InternalAssemblyViewType.g:228:1: entryRuleAssemblyConnector : ruleAssemblyConnector EOF ;
    public final void entryRuleAssemblyConnector() throws RecognitionException {
        try {
            // InternalAssemblyViewType.g:229:1: ( ruleAssemblyConnector EOF )
            // InternalAssemblyViewType.g:230:1: ruleAssemblyConnector EOF
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
    // InternalAssemblyViewType.g:237:1: ruleAssemblyConnector : ( ( rule__AssemblyConnector__Group__0 ) ) ;
    public final void ruleAssemblyConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:241:2: ( ( ( rule__AssemblyConnector__Group__0 ) ) )
            // InternalAssemblyViewType.g:242:2: ( ( rule__AssemblyConnector__Group__0 ) )
            {
            // InternalAssemblyViewType.g:242:2: ( ( rule__AssemblyConnector__Group__0 ) )
            // InternalAssemblyViewType.g:243:3: ( rule__AssemblyConnector__Group__0 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getGroup()); 
            // InternalAssemblyViewType.g:244:3: ( rule__AssemblyConnector__Group__0 )
            // InternalAssemblyViewType.g:244:4: rule__AssemblyConnector__Group__0
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


    // $ANTLR start "rule__AbstractSystemElement__Alternatives"
    // InternalAssemblyViewType.g:252:1: rule__AbstractSystemElement__Alternatives : ( ( ruleAssemblyContext ) | ( ruleRole ) | ( ruleDelegationConnector ) | ( ruleAssemblyConnector ) );
    public final void rule__AbstractSystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:256:1: ( ( ruleAssemblyContext ) | ( ruleRole ) | ( ruleDelegationConnector ) | ( ruleAssemblyConnector ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 30:
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
                    // InternalAssemblyViewType.g:257:2: ( ruleAssemblyContext )
                    {
                    // InternalAssemblyViewType.g:257:2: ( ruleAssemblyContext )
                    // InternalAssemblyViewType.g:258:3: ruleAssemblyContext
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
                    // InternalAssemblyViewType.g:263:2: ( ruleRole )
                    {
                    // InternalAssemblyViewType.g:263:2: ( ruleRole )
                    // InternalAssemblyViewType.g:264:3: ruleRole
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
                    // InternalAssemblyViewType.g:269:2: ( ruleDelegationConnector )
                    {
                    // InternalAssemblyViewType.g:269:2: ( ruleDelegationConnector )
                    // InternalAssemblyViewType.g:270:3: ruleDelegationConnector
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
                    // InternalAssemblyViewType.g:275:2: ( ruleAssemblyConnector )
                    {
                    // InternalAssemblyViewType.g:275:2: ( ruleAssemblyConnector )
                    // InternalAssemblyViewType.g:276:3: ruleAssemblyConnector
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAssemblyViewType.g:285:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:289:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAssemblyViewType.g:290:2: ( RULE_STRING )
                    {
                    // InternalAssemblyViewType.g:290:2: ( RULE_STRING )
                    // InternalAssemblyViewType.g:291:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssemblyViewType.g:296:2: ( RULE_ID )
                    {
                    // InternalAssemblyViewType.g:296:2: ( RULE_ID )
                    // InternalAssemblyViewType.g:297:3: RULE_ID
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


    // $ANTLR start "rule__AssemblyViewType__Group__0"
    // InternalAssemblyViewType.g:306:1: rule__AssemblyViewType__Group__0 : rule__AssemblyViewType__Group__0__Impl rule__AssemblyViewType__Group__1 ;
    public final void rule__AssemblyViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:310:1: ( rule__AssemblyViewType__Group__0__Impl rule__AssemblyViewType__Group__1 )
            // InternalAssemblyViewType.g:311:2: rule__AssemblyViewType__Group__0__Impl rule__AssemblyViewType__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:318:1: rule__AssemblyViewType__Group__0__Impl : ( 'AssemblyViewType' ) ;
    public final void rule__AssemblyViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:322:1: ( ( 'AssemblyViewType' ) )
            // InternalAssemblyViewType.g:323:1: ( 'AssemblyViewType' )
            {
            // InternalAssemblyViewType.g:323:1: ( 'AssemblyViewType' )
            // InternalAssemblyViewType.g:324:2: 'AssemblyViewType'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getAssemblyViewTypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:333:1: rule__AssemblyViewType__Group__1 : rule__AssemblyViewType__Group__1__Impl rule__AssemblyViewType__Group__2 ;
    public final void rule__AssemblyViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:337:1: ( rule__AssemblyViewType__Group__1__Impl rule__AssemblyViewType__Group__2 )
            // InternalAssemblyViewType.g:338:2: rule__AssemblyViewType__Group__1__Impl rule__AssemblyViewType__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssemblyViewType.g:345:1: rule__AssemblyViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__AssemblyViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:349:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:350:1: ( '{' )
            {
            // InternalAssemblyViewType.g:350:1: ( '{' )
            // InternalAssemblyViewType.g:351:2: '{'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:360:1: rule__AssemblyViewType__Group__2 : rule__AssemblyViewType__Group__2__Impl rule__AssemblyViewType__Group__3 ;
    public final void rule__AssemblyViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:364:1: ( rule__AssemblyViewType__Group__2__Impl rule__AssemblyViewType__Group__3 )
            // InternalAssemblyViewType.g:365:2: rule__AssemblyViewType__Group__2__Impl rule__AssemblyViewType__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:372:1: rule__AssemblyViewType__Group__2__Impl : ( 'systems' ) ;
    public final void rule__AssemblyViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:376:1: ( ( 'systems' ) )
            // InternalAssemblyViewType.g:377:1: ( 'systems' )
            {
            // InternalAssemblyViewType.g:377:1: ( 'systems' )
            // InternalAssemblyViewType.g:378:2: 'systems'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:387:1: rule__AssemblyViewType__Group__3 : rule__AssemblyViewType__Group__3__Impl rule__AssemblyViewType__Group__4 ;
    public final void rule__AssemblyViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:391:1: ( rule__AssemblyViewType__Group__3__Impl rule__AssemblyViewType__Group__4 )
            // InternalAssemblyViewType.g:392:2: rule__AssemblyViewType__Group__3__Impl rule__AssemblyViewType__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalAssemblyViewType.g:399:1: rule__AssemblyViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__AssemblyViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:403:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:404:1: ( '{' )
            {
            // InternalAssemblyViewType.g:404:1: ( '{' )
            // InternalAssemblyViewType.g:405:2: '{'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:414:1: rule__AssemblyViewType__Group__4 : rule__AssemblyViewType__Group__4__Impl rule__AssemblyViewType__Group__5 ;
    public final void rule__AssemblyViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:418:1: ( rule__AssemblyViewType__Group__4__Impl rule__AssemblyViewType__Group__5 )
            // InternalAssemblyViewType.g:419:2: rule__AssemblyViewType__Group__4__Impl rule__AssemblyViewType__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalAssemblyViewType.g:426:1: rule__AssemblyViewType__Group__4__Impl : ( ( rule__AssemblyViewType__SystemsAssignment_4 ) ) ;
    public final void rule__AssemblyViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:430:1: ( ( ( rule__AssemblyViewType__SystemsAssignment_4 ) ) )
            // InternalAssemblyViewType.g:431:1: ( ( rule__AssemblyViewType__SystemsAssignment_4 ) )
            {
            // InternalAssemblyViewType.g:431:1: ( ( rule__AssemblyViewType__SystemsAssignment_4 ) )
            // InternalAssemblyViewType.g:432:2: ( rule__AssemblyViewType__SystemsAssignment_4 )
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_4()); 
            // InternalAssemblyViewType.g:433:2: ( rule__AssemblyViewType__SystemsAssignment_4 )
            // InternalAssemblyViewType.g:433:3: rule__AssemblyViewType__SystemsAssignment_4
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
    // InternalAssemblyViewType.g:441:1: rule__AssemblyViewType__Group__5 : rule__AssemblyViewType__Group__5__Impl rule__AssemblyViewType__Group__6 ;
    public final void rule__AssemblyViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:445:1: ( rule__AssemblyViewType__Group__5__Impl rule__AssemblyViewType__Group__6 )
            // InternalAssemblyViewType.g:446:2: rule__AssemblyViewType__Group__5__Impl rule__AssemblyViewType__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalAssemblyViewType.g:453:1: rule__AssemblyViewType__Group__5__Impl : ( ( rule__AssemblyViewType__Group_5__0 )* ) ;
    public final void rule__AssemblyViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:457:1: ( ( ( rule__AssemblyViewType__Group_5__0 )* ) )
            // InternalAssemblyViewType.g:458:1: ( ( rule__AssemblyViewType__Group_5__0 )* )
            {
            // InternalAssemblyViewType.g:458:1: ( ( rule__AssemblyViewType__Group_5__0 )* )
            // InternalAssemblyViewType.g:459:2: ( rule__AssemblyViewType__Group_5__0 )*
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getGroup_5()); 
            // InternalAssemblyViewType.g:460:2: ( rule__AssemblyViewType__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAssemblyViewType.g:460:3: rule__AssemblyViewType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AssemblyViewType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalAssemblyViewType.g:468:1: rule__AssemblyViewType__Group__6 : rule__AssemblyViewType__Group__6__Impl rule__AssemblyViewType__Group__7 ;
    public final void rule__AssemblyViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:472:1: ( rule__AssemblyViewType__Group__6__Impl rule__AssemblyViewType__Group__7 )
            // InternalAssemblyViewType.g:473:2: rule__AssemblyViewType__Group__6__Impl rule__AssemblyViewType__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalAssemblyViewType.g:480:1: rule__AssemblyViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__AssemblyViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:484:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:485:1: ( '}' )
            {
            // InternalAssemblyViewType.g:485:1: ( '}' )
            // InternalAssemblyViewType.g:486:2: '}'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:495:1: rule__AssemblyViewType__Group__7 : rule__AssemblyViewType__Group__7__Impl ;
    public final void rule__AssemblyViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:499:1: ( rule__AssemblyViewType__Group__7__Impl )
            // InternalAssemblyViewType.g:500:2: rule__AssemblyViewType__Group__7__Impl
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
    // InternalAssemblyViewType.g:506:1: rule__AssemblyViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:510:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:511:1: ( '}' )
            {
            // InternalAssemblyViewType.g:511:1: ( '}' )
            // InternalAssemblyViewType.g:512:2: '}'
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:522:1: rule__AssemblyViewType__Group_5__0 : rule__AssemblyViewType__Group_5__0__Impl rule__AssemblyViewType__Group_5__1 ;
    public final void rule__AssemblyViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:526:1: ( rule__AssemblyViewType__Group_5__0__Impl rule__AssemblyViewType__Group_5__1 )
            // InternalAssemblyViewType.g:527:2: rule__AssemblyViewType__Group_5__0__Impl rule__AssemblyViewType__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAssemblyViewType.g:534:1: rule__AssemblyViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__AssemblyViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:538:1: ( ( ',' ) )
            // InternalAssemblyViewType.g:539:1: ( ',' )
            {
            // InternalAssemblyViewType.g:539:1: ( ',' )
            // InternalAssemblyViewType.g:540:2: ','
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getCommaKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:549:1: rule__AssemblyViewType__Group_5__1 : rule__AssemblyViewType__Group_5__1__Impl ;
    public final void rule__AssemblyViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:553:1: ( rule__AssemblyViewType__Group_5__1__Impl )
            // InternalAssemblyViewType.g:554:2: rule__AssemblyViewType__Group_5__1__Impl
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
    // InternalAssemblyViewType.g:560:1: rule__AssemblyViewType__Group_5__1__Impl : ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) ) ;
    public final void rule__AssemblyViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:564:1: ( ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) ) )
            // InternalAssemblyViewType.g:565:1: ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) )
            {
            // InternalAssemblyViewType.g:565:1: ( ( rule__AssemblyViewType__SystemsAssignment_5_1 ) )
            // InternalAssemblyViewType.g:566:2: ( rule__AssemblyViewType__SystemsAssignment_5_1 )
            {
             before(grammarAccess.getAssemblyViewTypeAccess().getSystemsAssignment_5_1()); 
            // InternalAssemblyViewType.g:567:2: ( rule__AssemblyViewType__SystemsAssignment_5_1 )
            // InternalAssemblyViewType.g:567:3: rule__AssemblyViewType__SystemsAssignment_5_1
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
    // InternalAssemblyViewType.g:576:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:580:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalAssemblyViewType.g:581:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:588:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:592:1: ( ( 'System' ) )
            // InternalAssemblyViewType.g:593:1: ( 'System' )
            {
            // InternalAssemblyViewType.g:593:1: ( 'System' )
            // InternalAssemblyViewType.g:594:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:603:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:607:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalAssemblyViewType.g:608:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalAssemblyViewType.g:615:1: rule__System__Group__1__Impl : ( '{' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:619:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:620:1: ( '{' )
            {
            // InternalAssemblyViewType.g:620:1: ( '{' )
            // InternalAssemblyViewType.g:621:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:630:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:634:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalAssemblyViewType.g:635:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAssemblyViewType.g:642:1: rule__System__Group__2__Impl : ( ( rule__System__Group_2__0 )? ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:646:1: ( ( ( rule__System__Group_2__0 )? ) )
            // InternalAssemblyViewType.g:647:1: ( ( rule__System__Group_2__0 )? )
            {
            // InternalAssemblyViewType.g:647:1: ( ( rule__System__Group_2__0 )? )
            // InternalAssemblyViewType.g:648:2: ( rule__System__Group_2__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_2()); 
            // InternalAssemblyViewType.g:649:2: ( rule__System__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAssemblyViewType.g:649:3: rule__System__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:657:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:661:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalAssemblyViewType.g:662:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalAssemblyViewType.g:669:1: rule__System__Group__3__Impl : ( 'providedInterfaces' ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:673:1: ( ( 'providedInterfaces' ) )
            // InternalAssemblyViewType.g:674:1: ( 'providedInterfaces' )
            {
            // InternalAssemblyViewType.g:674:1: ( 'providedInterfaces' )
            // InternalAssemblyViewType.g:675:2: 'providedInterfaces'
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_3()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:684:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:688:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalAssemblyViewType.g:689:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:696:1: rule__System__Group__4__Impl : ( '(' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:700:1: ( ( '(' ) )
            // InternalAssemblyViewType.g:701:1: ( '(' )
            {
            // InternalAssemblyViewType.g:701:1: ( '(' )
            // InternalAssemblyViewType.g:702:2: '('
            {
             before(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:711:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:715:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalAssemblyViewType.g:716:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAssemblyViewType.g:723:1: rule__System__Group__5__Impl : ( ( rule__System__ProvidedInterfacesAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:727:1: ( ( ( rule__System__ProvidedInterfacesAssignment_5 ) ) )
            // InternalAssemblyViewType.g:728:1: ( ( rule__System__ProvidedInterfacesAssignment_5 ) )
            {
            // InternalAssemblyViewType.g:728:1: ( ( rule__System__ProvidedInterfacesAssignment_5 ) )
            // InternalAssemblyViewType.g:729:2: ( rule__System__ProvidedInterfacesAssignment_5 )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_5()); 
            // InternalAssemblyViewType.g:730:2: ( rule__System__ProvidedInterfacesAssignment_5 )
            // InternalAssemblyViewType.g:730:3: rule__System__ProvidedInterfacesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedInterfacesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_5()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:738:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:742:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalAssemblyViewType.g:743:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalAssemblyViewType.g:750:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )* ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:754:1: ( ( ( rule__System__Group_6__0 )* ) )
            // InternalAssemblyViewType.g:755:1: ( ( rule__System__Group_6__0 )* )
            {
            // InternalAssemblyViewType.g:755:1: ( ( rule__System__Group_6__0 )* )
            // InternalAssemblyViewType.g:756:2: ( rule__System__Group_6__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_6()); 
            // InternalAssemblyViewType.g:757:2: ( rule__System__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAssemblyViewType.g:757:3: rule__System__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__System__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:765:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:769:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalAssemblyViewType.g:770:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalAssemblyViewType.g:777:1: rule__System__Group__7__Impl : ( ')' ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:781:1: ( ( ')' ) )
            // InternalAssemblyViewType.g:782:1: ( ')' )
            {
            // InternalAssemblyViewType.g:782:1: ( ')' )
            // InternalAssemblyViewType.g:783:2: ')'
            {
             before(grammarAccess.getSystemAccess().getRightParenthesisKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:792:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:796:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalAssemblyViewType.g:797:2: rule__System__Group__8__Impl rule__System__Group__9
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:804:1: rule__System__Group__8__Impl : ( 'systemElements' ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:808:1: ( ( 'systemElements' ) )
            // InternalAssemblyViewType.g:809:1: ( 'systemElements' )
            {
            // InternalAssemblyViewType.g:809:1: ( 'systemElements' )
            // InternalAssemblyViewType.g:810:2: 'systemElements'
            {
             before(grammarAccess.getSystemAccess().getSystemElementsKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemElementsKeyword_8()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:819:1: rule__System__Group__9 : rule__System__Group__9__Impl rule__System__Group__10 ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:823:1: ( rule__System__Group__9__Impl rule__System__Group__10 )
            // InternalAssemblyViewType.g:824:2: rule__System__Group__9__Impl rule__System__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalAssemblyViewType.g:831:1: rule__System__Group__9__Impl : ( '{' ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:835:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:836:1: ( '{' )
            {
            // InternalAssemblyViewType.g:836:1: ( '{' )
            // InternalAssemblyViewType.g:837:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:846:1: rule__System__Group__10 : rule__System__Group__10__Impl rule__System__Group__11 ;
    public final void rule__System__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:850:1: ( rule__System__Group__10__Impl rule__System__Group__11 )
            // InternalAssemblyViewType.g:851:2: rule__System__Group__10__Impl rule__System__Group__11
            {
            pushFollow(FOLLOW_6);
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
    // InternalAssemblyViewType.g:858:1: rule__System__Group__10__Impl : ( ( rule__System__SystemElementsAssignment_10 ) ) ;
    public final void rule__System__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:862:1: ( ( ( rule__System__SystemElementsAssignment_10 ) ) )
            // InternalAssemblyViewType.g:863:1: ( ( rule__System__SystemElementsAssignment_10 ) )
            {
            // InternalAssemblyViewType.g:863:1: ( ( rule__System__SystemElementsAssignment_10 ) )
            // InternalAssemblyViewType.g:864:2: ( rule__System__SystemElementsAssignment_10 )
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAssignment_10()); 
            // InternalAssemblyViewType.g:865:2: ( rule__System__SystemElementsAssignment_10 )
            // InternalAssemblyViewType.g:865:3: rule__System__SystemElementsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__System__SystemElementsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemElementsAssignment_10()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:873:1: rule__System__Group__11 : rule__System__Group__11__Impl rule__System__Group__12 ;
    public final void rule__System__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:877:1: ( rule__System__Group__11__Impl rule__System__Group__12 )
            // InternalAssemblyViewType.g:878:2: rule__System__Group__11__Impl rule__System__Group__12
            {
            pushFollow(FOLLOW_6);
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
    // InternalAssemblyViewType.g:885:1: rule__System__Group__11__Impl : ( ( rule__System__Group_11__0 )* ) ;
    public final void rule__System__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:889:1: ( ( ( rule__System__Group_11__0 )* ) )
            // InternalAssemblyViewType.g:890:1: ( ( rule__System__Group_11__0 )* )
            {
            // InternalAssemblyViewType.g:890:1: ( ( rule__System__Group_11__0 )* )
            // InternalAssemblyViewType.g:891:2: ( rule__System__Group_11__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_11()); 
            // InternalAssemblyViewType.g:892:2: ( rule__System__Group_11__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAssemblyViewType.g:892:3: rule__System__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__System__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_11()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:900:1: rule__System__Group__12 : rule__System__Group__12__Impl rule__System__Group__13 ;
    public final void rule__System__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:904:1: ( rule__System__Group__12__Impl rule__System__Group__13 )
            // InternalAssemblyViewType.g:905:2: rule__System__Group__12__Impl rule__System__Group__13
            {
            pushFollow(FOLLOW_8);
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
    // InternalAssemblyViewType.g:912:1: rule__System__Group__12__Impl : ( '}' ) ;
    public final void rule__System__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:916:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:917:1: ( '}' )
            {
            // InternalAssemblyViewType.g:917:1: ( '}' )
            // InternalAssemblyViewType.g:918:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:927:1: rule__System__Group__13 : rule__System__Group__13__Impl ;
    public final void rule__System__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:931:1: ( rule__System__Group__13__Impl )
            // InternalAssemblyViewType.g:932:2: rule__System__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__13__Impl();

            state._fsp--;


            }

        }
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
    // InternalAssemblyViewType.g:938:1: rule__System__Group__13__Impl : ( '}' ) ;
    public final void rule__System__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:942:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:943:1: ( '}' )
            {
            // InternalAssemblyViewType.g:943:1: ( '}' )
            // InternalAssemblyViewType.g:944:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_13()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__System__Group_2__0"
    // InternalAssemblyViewType.g:954:1: rule__System__Group_2__0 : rule__System__Group_2__0__Impl rule__System__Group_2__1 ;
    public final void rule__System__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:958:1: ( rule__System__Group_2__0__Impl rule__System__Group_2__1 )
            // InternalAssemblyViewType.g:959:2: rule__System__Group_2__0__Impl rule__System__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__System__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__0"


    // $ANTLR start "rule__System__Group_2__0__Impl"
    // InternalAssemblyViewType.g:966:1: rule__System__Group_2__0__Impl : ( 'requiredInterfaces' ) ;
    public final void rule__System__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:970:1: ( ( 'requiredInterfaces' ) )
            // InternalAssemblyViewType.g:971:1: ( 'requiredInterfaces' )
            {
            // InternalAssemblyViewType.g:971:1: ( 'requiredInterfaces' )
            // InternalAssemblyViewType.g:972:2: 'requiredInterfaces'
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRequiredInterfacesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__0__Impl"


    // $ANTLR start "rule__System__Group_2__1"
    // InternalAssemblyViewType.g:981:1: rule__System__Group_2__1 : rule__System__Group_2__1__Impl rule__System__Group_2__2 ;
    public final void rule__System__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:985:1: ( rule__System__Group_2__1__Impl rule__System__Group_2__2 )
            // InternalAssemblyViewType.g:986:2: rule__System__Group_2__1__Impl rule__System__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__System__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__1"


    // $ANTLR start "rule__System__Group_2__1__Impl"
    // InternalAssemblyViewType.g:993:1: rule__System__Group_2__1__Impl : ( '(' ) ;
    public final void rule__System__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:997:1: ( ( '(' ) )
            // InternalAssemblyViewType.g:998:1: ( '(' )
            {
            // InternalAssemblyViewType.g:998:1: ( '(' )
            // InternalAssemblyViewType.g:999:2: '('
            {
             before(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__1__Impl"


    // $ANTLR start "rule__System__Group_2__2"
    // InternalAssemblyViewType.g:1008:1: rule__System__Group_2__2 : rule__System__Group_2__2__Impl rule__System__Group_2__3 ;
    public final void rule__System__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1012:1: ( rule__System__Group_2__2__Impl rule__System__Group_2__3 )
            // InternalAssemblyViewType.g:1013:2: rule__System__Group_2__2__Impl rule__System__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__System__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__2"


    // $ANTLR start "rule__System__Group_2__2__Impl"
    // InternalAssemblyViewType.g:1020:1: rule__System__Group_2__2__Impl : ( ( rule__System__RequiredInterfacesAssignment_2_2 ) ) ;
    public final void rule__System__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1024:1: ( ( ( rule__System__RequiredInterfacesAssignment_2_2 ) ) )
            // InternalAssemblyViewType.g:1025:1: ( ( rule__System__RequiredInterfacesAssignment_2_2 ) )
            {
            // InternalAssemblyViewType.g:1025:1: ( ( rule__System__RequiredInterfacesAssignment_2_2 ) )
            // InternalAssemblyViewType.g:1026:2: ( rule__System__RequiredInterfacesAssignment_2_2 )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_2_2()); 
            // InternalAssemblyViewType.g:1027:2: ( rule__System__RequiredInterfacesAssignment_2_2 )
            // InternalAssemblyViewType.g:1027:3: rule__System__RequiredInterfacesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__System__RequiredInterfacesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__2__Impl"


    // $ANTLR start "rule__System__Group_2__3"
    // InternalAssemblyViewType.g:1035:1: rule__System__Group_2__3 : rule__System__Group_2__3__Impl rule__System__Group_2__4 ;
    public final void rule__System__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1039:1: ( rule__System__Group_2__3__Impl rule__System__Group_2__4 )
            // InternalAssemblyViewType.g:1040:2: rule__System__Group_2__3__Impl rule__System__Group_2__4
            {
            pushFollow(FOLLOW_12);
            rule__System__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__3"


    // $ANTLR start "rule__System__Group_2__3__Impl"
    // InternalAssemblyViewType.g:1047:1: rule__System__Group_2__3__Impl : ( ( rule__System__Group_2_3__0 )* ) ;
    public final void rule__System__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1051:1: ( ( ( rule__System__Group_2_3__0 )* ) )
            // InternalAssemblyViewType.g:1052:1: ( ( rule__System__Group_2_3__0 )* )
            {
            // InternalAssemblyViewType.g:1052:1: ( ( rule__System__Group_2_3__0 )* )
            // InternalAssemblyViewType.g:1053:2: ( rule__System__Group_2_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_2_3()); 
            // InternalAssemblyViewType.g:1054:2: ( rule__System__Group_2_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAssemblyViewType.g:1054:3: rule__System__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__System__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__3__Impl"


    // $ANTLR start "rule__System__Group_2__4"
    // InternalAssemblyViewType.g:1062:1: rule__System__Group_2__4 : rule__System__Group_2__4__Impl ;
    public final void rule__System__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1066:1: ( rule__System__Group_2__4__Impl )
            // InternalAssemblyViewType.g:1067:2: rule__System__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__4"


    // $ANTLR start "rule__System__Group_2__4__Impl"
    // InternalAssemblyViewType.g:1073:1: rule__System__Group_2__4__Impl : ( ')' ) ;
    public final void rule__System__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1077:1: ( ( ')' ) )
            // InternalAssemblyViewType.g:1078:1: ( ')' )
            {
            // InternalAssemblyViewType.g:1078:1: ( ')' )
            // InternalAssemblyViewType.g:1079:2: ')'
            {
             before(grammarAccess.getSystemAccess().getRightParenthesisKeyword_2_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2__4__Impl"


    // $ANTLR start "rule__System__Group_2_3__0"
    // InternalAssemblyViewType.g:1089:1: rule__System__Group_2_3__0 : rule__System__Group_2_3__0__Impl rule__System__Group_2_3__1 ;
    public final void rule__System__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1093:1: ( rule__System__Group_2_3__0__Impl rule__System__Group_2_3__1 )
            // InternalAssemblyViewType.g:1094:2: rule__System__Group_2_3__0__Impl rule__System__Group_2_3__1
            {
            pushFollow(FOLLOW_11);
            rule__System__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2_3__0"


    // $ANTLR start "rule__System__Group_2_3__0__Impl"
    // InternalAssemblyViewType.g:1101:1: rule__System__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1105:1: ( ( ',' ) )
            // InternalAssemblyViewType.g:1106:1: ( ',' )
            {
            // InternalAssemblyViewType.g:1106:1: ( ',' )
            // InternalAssemblyViewType.g:1107:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_2_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2_3__0__Impl"


    // $ANTLR start "rule__System__Group_2_3__1"
    // InternalAssemblyViewType.g:1116:1: rule__System__Group_2_3__1 : rule__System__Group_2_3__1__Impl ;
    public final void rule__System__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1120:1: ( rule__System__Group_2_3__1__Impl )
            // InternalAssemblyViewType.g:1121:2: rule__System__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2_3__1"


    // $ANTLR start "rule__System__Group_2_3__1__Impl"
    // InternalAssemblyViewType.g:1127:1: rule__System__Group_2_3__1__Impl : ( ( rule__System__RequiredInterfacesAssignment_2_3_1 ) ) ;
    public final void rule__System__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1131:1: ( ( ( rule__System__RequiredInterfacesAssignment_2_3_1 ) ) )
            // InternalAssemblyViewType.g:1132:1: ( ( rule__System__RequiredInterfacesAssignment_2_3_1 ) )
            {
            // InternalAssemblyViewType.g:1132:1: ( ( rule__System__RequiredInterfacesAssignment_2_3_1 ) )
            // InternalAssemblyViewType.g:1133:2: ( rule__System__RequiredInterfacesAssignment_2_3_1 )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_2_3_1()); 
            // InternalAssemblyViewType.g:1134:2: ( rule__System__RequiredInterfacesAssignment_2_3_1 )
            // InternalAssemblyViewType.g:1134:3: rule__System__RequiredInterfacesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__RequiredInterfacesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_2_3__1__Impl"


    // $ANTLR start "rule__System__Group_6__0"
    // InternalAssemblyViewType.g:1143:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1147:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalAssemblyViewType.g:1148:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__System__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0"


    // $ANTLR start "rule__System__Group_6__0__Impl"
    // InternalAssemblyViewType.g:1155:1: rule__System__Group_6__0__Impl : ( ',' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1159:1: ( ( ',' ) )
            // InternalAssemblyViewType.g:1160:1: ( ',' )
            {
            // InternalAssemblyViewType.g:1160:1: ( ',' )
            // InternalAssemblyViewType.g:1161:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_6_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0__Impl"


    // $ANTLR start "rule__System__Group_6__1"
    // InternalAssemblyViewType.g:1170:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1174:1: ( rule__System__Group_6__1__Impl )
            // InternalAssemblyViewType.g:1175:2: rule__System__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1"


    // $ANTLR start "rule__System__Group_6__1__Impl"
    // InternalAssemblyViewType.g:1181:1: rule__System__Group_6__1__Impl : ( ( rule__System__ProvidedInterfacesAssignment_6_1 ) ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1185:1: ( ( ( rule__System__ProvidedInterfacesAssignment_6_1 ) ) )
            // InternalAssemblyViewType.g:1186:1: ( ( rule__System__ProvidedInterfacesAssignment_6_1 ) )
            {
            // InternalAssemblyViewType.g:1186:1: ( ( rule__System__ProvidedInterfacesAssignment_6_1 ) )
            // InternalAssemblyViewType.g:1187:2: ( rule__System__ProvidedInterfacesAssignment_6_1 )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_6_1()); 
            // InternalAssemblyViewType.g:1188:2: ( rule__System__ProvidedInterfacesAssignment_6_1 )
            // InternalAssemblyViewType.g:1188:3: rule__System__ProvidedInterfacesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedInterfacesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1__Impl"


    // $ANTLR start "rule__System__Group_11__0"
    // InternalAssemblyViewType.g:1197:1: rule__System__Group_11__0 : rule__System__Group_11__0__Impl rule__System__Group_11__1 ;
    public final void rule__System__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1201:1: ( rule__System__Group_11__0__Impl rule__System__Group_11__1 )
            // InternalAssemblyViewType.g:1202:2: rule__System__Group_11__0__Impl rule__System__Group_11__1
            {
            pushFollow(FOLLOW_14);
            rule__System__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_11__0"


    // $ANTLR start "rule__System__Group_11__0__Impl"
    // InternalAssemblyViewType.g:1209:1: rule__System__Group_11__0__Impl : ( ',' ) ;
    public final void rule__System__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1213:1: ( ( ',' ) )
            // InternalAssemblyViewType.g:1214:1: ( ',' )
            {
            // InternalAssemblyViewType.g:1214:1: ( ',' )
            // InternalAssemblyViewType.g:1215:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_11_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_11__0__Impl"


    // $ANTLR start "rule__System__Group_11__1"
    // InternalAssemblyViewType.g:1224:1: rule__System__Group_11__1 : rule__System__Group_11__1__Impl ;
    public final void rule__System__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1228:1: ( rule__System__Group_11__1__Impl )
            // InternalAssemblyViewType.g:1229:2: rule__System__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_11__1"


    // $ANTLR start "rule__System__Group_11__1__Impl"
    // InternalAssemblyViewType.g:1235:1: rule__System__Group_11__1__Impl : ( ( rule__System__SystemElementsAssignment_11_1 ) ) ;
    public final void rule__System__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1239:1: ( ( ( rule__System__SystemElementsAssignment_11_1 ) ) )
            // InternalAssemblyViewType.g:1240:1: ( ( rule__System__SystemElementsAssignment_11_1 ) )
            {
            // InternalAssemblyViewType.g:1240:1: ( ( rule__System__SystemElementsAssignment_11_1 ) )
            // InternalAssemblyViewType.g:1241:2: ( rule__System__SystemElementsAssignment_11_1 )
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAssignment_11_1()); 
            // InternalAssemblyViewType.g:1242:2: ( rule__System__SystemElementsAssignment_11_1 )
            // InternalAssemblyViewType.g:1242:3: rule__System__SystemElementsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__System__SystemElementsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemElementsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_11__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalAssemblyViewType.g:1251:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1255:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalAssemblyViewType.g:1256:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:1263:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1267:1: ( ( 'AssemblyContext' ) )
            // InternalAssemblyViewType.g:1268:1: ( 'AssemblyContext' )
            {
            // InternalAssemblyViewType.g:1268:1: ( 'AssemblyContext' )
            // InternalAssemblyViewType.g:1269:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1278:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1282:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalAssemblyViewType.g:1283:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:1290:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1294:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalAssemblyViewType.g:1295:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalAssemblyViewType.g:1295:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalAssemblyViewType.g:1296:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalAssemblyViewType.g:1297:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalAssemblyViewType.g:1297:3: rule__AssemblyContext__NameAssignment_1
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
    // InternalAssemblyViewType.g:1305:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1309:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalAssemblyViewType.g:1310:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalAssemblyViewType.g:1317:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1321:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:1322:1: ( '{' )
            {
            // InternalAssemblyViewType.g:1322:1: ( '{' )
            // InternalAssemblyViewType.g:1323:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1332:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1336:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalAssemblyViewType.g:1337:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:1344:1: rule__AssemblyContext__Group__3__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1348:1: ( ( 'component' ) )
            // InternalAssemblyViewType.g:1349:1: ( 'component' )
            {
            // InternalAssemblyViewType.g:1349:1: ( 'component' )
            // InternalAssemblyViewType.g:1350:2: 'component'
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1359:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1363:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalAssemblyViewType.g:1364:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalAssemblyViewType.g:1371:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1375:1: ( ( ( rule__AssemblyContext__ComponentAssignment_4 ) ) )
            // InternalAssemblyViewType.g:1376:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            {
            // InternalAssemblyViewType.g:1376:1: ( ( rule__AssemblyContext__ComponentAssignment_4 ) )
            // InternalAssemblyViewType.g:1377:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_4()); 
            // InternalAssemblyViewType.g:1378:2: ( rule__AssemblyContext__ComponentAssignment_4 )
            // InternalAssemblyViewType.g:1378:3: rule__AssemblyContext__ComponentAssignment_4
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
    // InternalAssemblyViewType.g:1386:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1390:1: ( rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 )
            // InternalAssemblyViewType.g:1391:2: rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalAssemblyViewType.g:1398:1: rule__AssemblyContext__Group__5__Impl : ( 'providedRoles' ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1402:1: ( ( 'providedRoles' ) )
            // InternalAssemblyViewType.g:1403:1: ( 'providedRoles' )
            {
            // InternalAssemblyViewType.g:1403:1: ( 'providedRoles' )
            // InternalAssemblyViewType.g:1404:2: 'providedRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1413:1: rule__AssemblyContext__Group__6 : rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 ;
    public final void rule__AssemblyContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1417:1: ( rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 )
            // InternalAssemblyViewType.g:1418:2: rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:1425:1: rule__AssemblyContext__Group__6__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1429:1: ( ( '(' ) )
            // InternalAssemblyViewType.g:1430:1: ( '(' )
            {
            // InternalAssemblyViewType.g:1430:1: ( '(' )
            // InternalAssemblyViewType.g:1431:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1440:1: rule__AssemblyContext__Group__7 : rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8 ;
    public final void rule__AssemblyContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1444:1: ( rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8 )
            // InternalAssemblyViewType.g:1445:2: rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalAssemblyViewType.g:1452:1: rule__AssemblyContext__Group__7__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) ) ;
    public final void rule__AssemblyContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1456:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) ) )
            // InternalAssemblyViewType.g:1457:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) )
            {
            // InternalAssemblyViewType.g:1457:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_7 ) )
            // InternalAssemblyViewType.g:1458:2: ( rule__AssemblyContext__ProvidedRolesAssignment_7 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_7()); 
            // InternalAssemblyViewType.g:1459:2: ( rule__AssemblyContext__ProvidedRolesAssignment_7 )
            // InternalAssemblyViewType.g:1459:3: rule__AssemblyContext__ProvidedRolesAssignment_7
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
    // InternalAssemblyViewType.g:1467:1: rule__AssemblyContext__Group__8 : rule__AssemblyContext__Group__8__Impl rule__AssemblyContext__Group__9 ;
    public final void rule__AssemblyContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1471:1: ( rule__AssemblyContext__Group__8__Impl rule__AssemblyContext__Group__9 )
            // InternalAssemblyViewType.g:1472:2: rule__AssemblyContext__Group__8__Impl rule__AssemblyContext__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalAssemblyViewType.g:1479:1: rule__AssemblyContext__Group__8__Impl : ( ( rule__AssemblyContext__Group_8__0 )* ) ;
    public final void rule__AssemblyContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1483:1: ( ( ( rule__AssemblyContext__Group_8__0 )* ) )
            // InternalAssemblyViewType.g:1484:1: ( ( rule__AssemblyContext__Group_8__0 )* )
            {
            // InternalAssemblyViewType.g:1484:1: ( ( rule__AssemblyContext__Group_8__0 )* )
            // InternalAssemblyViewType.g:1485:2: ( rule__AssemblyContext__Group_8__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_8()); 
            // InternalAssemblyViewType.g:1486:2: ( rule__AssemblyContext__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAssemblyViewType.g:1486:3: rule__AssemblyContext__Group_8__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AssemblyContext__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAssemblyViewType.g:1494:1: rule__AssemblyContext__Group__9 : rule__AssemblyContext__Group__9__Impl rule__AssemblyContext__Group__10 ;
    public final void rule__AssemblyContext__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1498:1: ( rule__AssemblyContext__Group__9__Impl rule__AssemblyContext__Group__10 )
            // InternalAssemblyViewType.g:1499:2: rule__AssemblyContext__Group__9__Impl rule__AssemblyContext__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalAssemblyViewType.g:1506:1: rule__AssemblyContext__Group__9__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1510:1: ( ( ')' ) )
            // InternalAssemblyViewType.g:1511:1: ( ')' )
            {
            // InternalAssemblyViewType.g:1511:1: ( ')' )
            // InternalAssemblyViewType.g:1512:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_9()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1521:1: rule__AssemblyContext__Group__10 : rule__AssemblyContext__Group__10__Impl rule__AssemblyContext__Group__11 ;
    public final void rule__AssemblyContext__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1525:1: ( rule__AssemblyContext__Group__10__Impl rule__AssemblyContext__Group__11 )
            // InternalAssemblyViewType.g:1526:2: rule__AssemblyContext__Group__10__Impl rule__AssemblyContext__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalAssemblyViewType.g:1533:1: rule__AssemblyContext__Group__10__Impl : ( ( rule__AssemblyContext__Group_10__0 )? ) ;
    public final void rule__AssemblyContext__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1537:1: ( ( ( rule__AssemblyContext__Group_10__0 )? ) )
            // InternalAssemblyViewType.g:1538:1: ( ( rule__AssemblyContext__Group_10__0 )? )
            {
            // InternalAssemblyViewType.g:1538:1: ( ( rule__AssemblyContext__Group_10__0 )? )
            // InternalAssemblyViewType.g:1539:2: ( rule__AssemblyContext__Group_10__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_10()); 
            // InternalAssemblyViewType.g:1540:2: ( rule__AssemblyContext__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAssemblyViewType.g:1540:3: rule__AssemblyContext__Group_10__0
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
    // InternalAssemblyViewType.g:1548:1: rule__AssemblyContext__Group__11 : rule__AssemblyContext__Group__11__Impl ;
    public final void rule__AssemblyContext__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1552:1: ( rule__AssemblyContext__Group__11__Impl )
            // InternalAssemblyViewType.g:1553:2: rule__AssemblyContext__Group__11__Impl
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
    // InternalAssemblyViewType.g:1559:1: rule__AssemblyContext__Group__11__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1563:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:1564:1: ( '}' )
            {
            // InternalAssemblyViewType.g:1564:1: ( '}' )
            // InternalAssemblyViewType.g:1565:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1575:1: rule__AssemblyContext__Group_8__0 : rule__AssemblyContext__Group_8__0__Impl rule__AssemblyContext__Group_8__1 ;
    public final void rule__AssemblyContext__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1579:1: ( rule__AssemblyContext__Group_8__0__Impl rule__AssemblyContext__Group_8__1 )
            // InternalAssemblyViewType.g:1580:2: rule__AssemblyContext__Group_8__0__Impl rule__AssemblyContext__Group_8__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:1587:1: rule__AssemblyContext__Group_8__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1591:1: ( ( ',' ) )
            // InternalAssemblyViewType.g:1592:1: ( ',' )
            {
            // InternalAssemblyViewType.g:1592:1: ( ',' )
            // InternalAssemblyViewType.g:1593:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_8_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1602:1: rule__AssemblyContext__Group_8__1 : rule__AssemblyContext__Group_8__1__Impl ;
    public final void rule__AssemblyContext__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1606:1: ( rule__AssemblyContext__Group_8__1__Impl )
            // InternalAssemblyViewType.g:1607:2: rule__AssemblyContext__Group_8__1__Impl
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
    // InternalAssemblyViewType.g:1613:1: rule__AssemblyContext__Group_8__1__Impl : ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) ) ;
    public final void rule__AssemblyContext__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1617:1: ( ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) ) )
            // InternalAssemblyViewType.g:1618:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) )
            {
            // InternalAssemblyViewType.g:1618:1: ( ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 ) )
            // InternalAssemblyViewType.g:1619:2: ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesAssignment_8_1()); 
            // InternalAssemblyViewType.g:1620:2: ( rule__AssemblyContext__ProvidedRolesAssignment_8_1 )
            // InternalAssemblyViewType.g:1620:3: rule__AssemblyContext__ProvidedRolesAssignment_8_1
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
    // InternalAssemblyViewType.g:1629:1: rule__AssemblyContext__Group_10__0 : rule__AssemblyContext__Group_10__0__Impl rule__AssemblyContext__Group_10__1 ;
    public final void rule__AssemblyContext__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1633:1: ( rule__AssemblyContext__Group_10__0__Impl rule__AssemblyContext__Group_10__1 )
            // InternalAssemblyViewType.g:1634:2: rule__AssemblyContext__Group_10__0__Impl rule__AssemblyContext__Group_10__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAssemblyViewType.g:1641:1: rule__AssemblyContext__Group_10__0__Impl : ( 'requiredRoles' ) ;
    public final void rule__AssemblyContext__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1645:1: ( ( 'requiredRoles' ) )
            // InternalAssemblyViewType.g:1646:1: ( 'requiredRoles' )
            {
            // InternalAssemblyViewType.g:1646:1: ( 'requiredRoles' )
            // InternalAssemblyViewType.g:1647:2: 'requiredRoles'
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesKeyword_10_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1656:1: rule__AssemblyContext__Group_10__1 : rule__AssemblyContext__Group_10__1__Impl rule__AssemblyContext__Group_10__2 ;
    public final void rule__AssemblyContext__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1660:1: ( rule__AssemblyContext__Group_10__1__Impl rule__AssemblyContext__Group_10__2 )
            // InternalAssemblyViewType.g:1661:2: rule__AssemblyContext__Group_10__1__Impl rule__AssemblyContext__Group_10__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:1668:1: rule__AssemblyContext__Group_10__1__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1672:1: ( ( '(' ) )
            // InternalAssemblyViewType.g:1673:1: ( '(' )
            {
            // InternalAssemblyViewType.g:1673:1: ( '(' )
            // InternalAssemblyViewType.g:1674:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1683:1: rule__AssemblyContext__Group_10__2 : rule__AssemblyContext__Group_10__2__Impl rule__AssemblyContext__Group_10__3 ;
    public final void rule__AssemblyContext__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1687:1: ( rule__AssemblyContext__Group_10__2__Impl rule__AssemblyContext__Group_10__3 )
            // InternalAssemblyViewType.g:1688:2: rule__AssemblyContext__Group_10__2__Impl rule__AssemblyContext__Group_10__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalAssemblyViewType.g:1695:1: rule__AssemblyContext__Group_10__2__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) ) ;
    public final void rule__AssemblyContext__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1699:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) ) )
            // InternalAssemblyViewType.g:1700:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) )
            {
            // InternalAssemblyViewType.g:1700:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_2 ) )
            // InternalAssemblyViewType.g:1701:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_2()); 
            // InternalAssemblyViewType.g:1702:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_2 )
            // InternalAssemblyViewType.g:1702:3: rule__AssemblyContext__RequiredRolesAssignment_10_2
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
    // InternalAssemblyViewType.g:1710:1: rule__AssemblyContext__Group_10__3 : rule__AssemblyContext__Group_10__3__Impl rule__AssemblyContext__Group_10__4 ;
    public final void rule__AssemblyContext__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1714:1: ( rule__AssemblyContext__Group_10__3__Impl rule__AssemblyContext__Group_10__4 )
            // InternalAssemblyViewType.g:1715:2: rule__AssemblyContext__Group_10__3__Impl rule__AssemblyContext__Group_10__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAssemblyViewType.g:1722:1: rule__AssemblyContext__Group_10__3__Impl : ( ( rule__AssemblyContext__Group_10_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1726:1: ( ( ( rule__AssemblyContext__Group_10_3__0 )* ) )
            // InternalAssemblyViewType.g:1727:1: ( ( rule__AssemblyContext__Group_10_3__0 )* )
            {
            // InternalAssemblyViewType.g:1727:1: ( ( rule__AssemblyContext__Group_10_3__0 )* )
            // InternalAssemblyViewType.g:1728:2: ( rule__AssemblyContext__Group_10_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_10_3()); 
            // InternalAssemblyViewType.g:1729:2: ( rule__AssemblyContext__Group_10_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAssemblyViewType.g:1729:3: rule__AssemblyContext__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AssemblyContext__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalAssemblyViewType.g:1737:1: rule__AssemblyContext__Group_10__4 : rule__AssemblyContext__Group_10__4__Impl ;
    public final void rule__AssemblyContext__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1741:1: ( rule__AssemblyContext__Group_10__4__Impl )
            // InternalAssemblyViewType.g:1742:2: rule__AssemblyContext__Group_10__4__Impl
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
    // InternalAssemblyViewType.g:1748:1: rule__AssemblyContext__Group_10__4__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1752:1: ( ( ')' ) )
            // InternalAssemblyViewType.g:1753:1: ( ')' )
            {
            // InternalAssemblyViewType.g:1753:1: ( ')' )
            // InternalAssemblyViewType.g:1754:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_10_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1764:1: rule__AssemblyContext__Group_10_3__0 : rule__AssemblyContext__Group_10_3__0__Impl rule__AssemblyContext__Group_10_3__1 ;
    public final void rule__AssemblyContext__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1768:1: ( rule__AssemblyContext__Group_10_3__0__Impl rule__AssemblyContext__Group_10_3__1 )
            // InternalAssemblyViewType.g:1769:2: rule__AssemblyContext__Group_10_3__0__Impl rule__AssemblyContext__Group_10_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:1776:1: rule__AssemblyContext__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1780:1: ( ( ',' ) )
            // InternalAssemblyViewType.g:1781:1: ( ',' )
            {
            // InternalAssemblyViewType.g:1781:1: ( ',' )
            // InternalAssemblyViewType.g:1782:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_10_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1791:1: rule__AssemblyContext__Group_10_3__1 : rule__AssemblyContext__Group_10_3__1__Impl ;
    public final void rule__AssemblyContext__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1795:1: ( rule__AssemblyContext__Group_10_3__1__Impl )
            // InternalAssemblyViewType.g:1796:2: rule__AssemblyContext__Group_10_3__1__Impl
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
    // InternalAssemblyViewType.g:1802:1: rule__AssemblyContext__Group_10_3__1__Impl : ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1806:1: ( ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) ) )
            // InternalAssemblyViewType.g:1807:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) )
            {
            // InternalAssemblyViewType.g:1807:1: ( ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 ) )
            // InternalAssemblyViewType.g:1808:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesAssignment_10_3_1()); 
            // InternalAssemblyViewType.g:1809:2: ( rule__AssemblyContext__RequiredRolesAssignment_10_3_1 )
            // InternalAssemblyViewType.g:1809:3: rule__AssemblyContext__RequiredRolesAssignment_10_3_1
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
    // InternalAssemblyViewType.g:1818:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1822:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalAssemblyViewType.g:1823:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:1830:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1834:1: ( ( 'Role' ) )
            // InternalAssemblyViewType.g:1835:1: ( 'Role' )
            {
            // InternalAssemblyViewType.g:1835:1: ( 'Role' )
            // InternalAssemblyViewType.g:1836:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1845:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1849:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalAssemblyViewType.g:1850:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAssemblyViewType.g:1857:1: rule__Role__Group__1__Impl : ( '{' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1861:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:1862:1: ( '{' )
            {
            // InternalAssemblyViewType.g:1862:1: ( '{' )
            // InternalAssemblyViewType.g:1863:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:1872:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1876:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalAssemblyViewType.g:1877:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:1884:1: rule__Role__Group__2__Impl : ( 'interface' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1888:1: ( ( 'interface' ) )
            // InternalAssemblyViewType.g:1889:1: ( 'interface' )
            {
            // InternalAssemblyViewType.g:1889:1: ( 'interface' )
            // InternalAssemblyViewType.g:1890:2: 'interface'
            {
             before(grammarAccess.getRoleAccess().getInterfaceKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getInterfaceKeyword_2()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:1899:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1903:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalAssemblyViewType.g:1904:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalAssemblyViewType.g:1911:1: rule__Role__Group__3__Impl : ( ( rule__Role__InterfaceAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1915:1: ( ( ( rule__Role__InterfaceAssignment_3 ) ) )
            // InternalAssemblyViewType.g:1916:1: ( ( rule__Role__InterfaceAssignment_3 ) )
            {
            // InternalAssemblyViewType.g:1916:1: ( ( rule__Role__InterfaceAssignment_3 ) )
            // InternalAssemblyViewType.g:1917:2: ( rule__Role__InterfaceAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getInterfaceAssignment_3()); 
            // InternalAssemblyViewType.g:1918:2: ( rule__Role__InterfaceAssignment_3 )
            // InternalAssemblyViewType.g:1918:3: rule__Role__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Role__InterfaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getInterfaceAssignment_3()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:1926:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1930:1: ( rule__Role__Group__4__Impl )
            // InternalAssemblyViewType.g:1931:2: rule__Role__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAssemblyViewType.g:1937:1: rule__Role__Group__4__Impl : ( '}' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1941:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:1942:1: ( '}' )
            {
            // InternalAssemblyViewType.g:1942:1: ( '}' )
            // InternalAssemblyViewType.g:1943:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__DelegationConnector__Group__0"
    // InternalAssemblyViewType.g:1953:1: rule__DelegationConnector__Group__0 : rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 ;
    public final void rule__DelegationConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1957:1: ( rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1 )
            // InternalAssemblyViewType.g:1958:2: rule__DelegationConnector__Group__0__Impl rule__DelegationConnector__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:1965:1: rule__DelegationConnector__Group__0__Impl : ( 'DelegationConnector' ) ;
    public final void rule__DelegationConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1969:1: ( ( 'DelegationConnector' ) )
            // InternalAssemblyViewType.g:1970:1: ( 'DelegationConnector' )
            {
            // InternalAssemblyViewType.g:1970:1: ( 'DelegationConnector' )
            // InternalAssemblyViewType.g:1971:2: 'DelegationConnector'
            {
             before(grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:1980:1: rule__DelegationConnector__Group__1 : rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 ;
    public final void rule__DelegationConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1984:1: ( rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2 )
            // InternalAssemblyViewType.g:1985:2: rule__DelegationConnector__Group__1__Impl rule__DelegationConnector__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalAssemblyViewType.g:1992:1: rule__DelegationConnector__Group__1__Impl : ( '{' ) ;
    public final void rule__DelegationConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:1996:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:1997:1: ( '{' )
            {
            // InternalAssemblyViewType.g:1997:1: ( '{' )
            // InternalAssemblyViewType.g:1998:2: '{'
            {
             before(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2007:1: rule__DelegationConnector__Group__2 : rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 ;
    public final void rule__DelegationConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2011:1: ( rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3 )
            // InternalAssemblyViewType.g:2012:2: rule__DelegationConnector__Group__2__Impl rule__DelegationConnector__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:2019:1: rule__DelegationConnector__Group__2__Impl : ( 'role' ) ;
    public final void rule__DelegationConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2023:1: ( ( 'role' ) )
            // InternalAssemblyViewType.g:2024:1: ( 'role' )
            {
            // InternalAssemblyViewType.g:2024:1: ( 'role' )
            // InternalAssemblyViewType.g:2025:2: 'role'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRoleKeyword_2()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2034:1: rule__DelegationConnector__Group__3 : rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 ;
    public final void rule__DelegationConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2038:1: ( rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4 )
            // InternalAssemblyViewType.g:2039:2: rule__DelegationConnector__Group__3__Impl rule__DelegationConnector__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalAssemblyViewType.g:2046:1: rule__DelegationConnector__Group__3__Impl : ( ( rule__DelegationConnector__RoleAssignment_3 ) ) ;
    public final void rule__DelegationConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2050:1: ( ( ( rule__DelegationConnector__RoleAssignment_3 ) ) )
            // InternalAssemblyViewType.g:2051:1: ( ( rule__DelegationConnector__RoleAssignment_3 ) )
            {
            // InternalAssemblyViewType.g:2051:1: ( ( rule__DelegationConnector__RoleAssignment_3 ) )
            // InternalAssemblyViewType.g:2052:2: ( rule__DelegationConnector__RoleAssignment_3 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_3()); 
            // InternalAssemblyViewType.g:2053:2: ( rule__DelegationConnector__RoleAssignment_3 )
            // InternalAssemblyViewType.g:2053:3: rule__DelegationConnector__RoleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__RoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleAssignment_3()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2061:1: rule__DelegationConnector__Group__4 : rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 ;
    public final void rule__DelegationConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2065:1: ( rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5 )
            // InternalAssemblyViewType.g:2066:2: rule__DelegationConnector__Group__4__Impl rule__DelegationConnector__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:2073:1: rule__DelegationConnector__Group__4__Impl : ( 'interface' ) ;
    public final void rule__DelegationConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2077:1: ( ( 'interface' ) )
            // InternalAssemblyViewType.g:2078:1: ( 'interface' )
            {
            // InternalAssemblyViewType.g:2078:1: ( 'interface' )
            // InternalAssemblyViewType.g:2079:2: 'interface'
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getInterfaceKeyword_4()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2088:1: rule__DelegationConnector__Group__5 : rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 ;
    public final void rule__DelegationConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2092:1: ( rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6 )
            // InternalAssemblyViewType.g:2093:2: rule__DelegationConnector__Group__5__Impl rule__DelegationConnector__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalAssemblyViewType.g:2100:1: rule__DelegationConnector__Group__5__Impl : ( ( rule__DelegationConnector__InterfaceAssignment_5 ) ) ;
    public final void rule__DelegationConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2104:1: ( ( ( rule__DelegationConnector__InterfaceAssignment_5 ) ) )
            // InternalAssemblyViewType.g:2105:1: ( ( rule__DelegationConnector__InterfaceAssignment_5 ) )
            {
            // InternalAssemblyViewType.g:2105:1: ( ( rule__DelegationConnector__InterfaceAssignment_5 ) )
            // InternalAssemblyViewType.g:2106:2: ( rule__DelegationConnector__InterfaceAssignment_5 )
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceAssignment_5()); 
            // InternalAssemblyViewType.g:2107:2: ( rule__DelegationConnector__InterfaceAssignment_5 )
            // InternalAssemblyViewType.g:2107:3: rule__DelegationConnector__InterfaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__InterfaceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDelegationConnectorAccess().getInterfaceAssignment_5()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2115:1: rule__DelegationConnector__Group__6 : rule__DelegationConnector__Group__6__Impl ;
    public final void rule__DelegationConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2119:1: ( rule__DelegationConnector__Group__6__Impl )
            // InternalAssemblyViewType.g:2120:2: rule__DelegationConnector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelegationConnector__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalAssemblyViewType.g:2126:1: rule__DelegationConnector__Group__6__Impl : ( '}' ) ;
    public final void rule__DelegationConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2130:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:2131:1: ( '}' )
            {
            // InternalAssemblyViewType.g:2131:1: ( '}' )
            // InternalAssemblyViewType.g:2132:2: '}'
            {
             before(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssemblyConnector__Group__0"
    // InternalAssemblyViewType.g:2142:1: rule__AssemblyConnector__Group__0 : rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 ;
    public final void rule__AssemblyConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2146:1: ( rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1 )
            // InternalAssemblyViewType.g:2147:2: rule__AssemblyConnector__Group__0__Impl rule__AssemblyConnector__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssemblyViewType.g:2154:1: rule__AssemblyConnector__Group__0__Impl : ( 'AssemblyConnector' ) ;
    public final void rule__AssemblyConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2158:1: ( ( 'AssemblyConnector' ) )
            // InternalAssemblyViewType.g:2159:1: ( 'AssemblyConnector' )
            {
            // InternalAssemblyViewType.g:2159:1: ( 'AssemblyConnector' )
            // InternalAssemblyViewType.g:2160:2: 'AssemblyConnector'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getAssemblyConnectorKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAssemblyViewType.g:2169:1: rule__AssemblyConnector__Group__1 : rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 ;
    public final void rule__AssemblyConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2173:1: ( rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2 )
            // InternalAssemblyViewType.g:2174:2: rule__AssemblyConnector__Group__1__Impl rule__AssemblyConnector__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAssemblyViewType.g:2181:1: rule__AssemblyConnector__Group__1__Impl : ( '{' ) ;
    public final void rule__AssemblyConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2185:1: ( ( '{' ) )
            // InternalAssemblyViewType.g:2186:1: ( '{' )
            {
            // InternalAssemblyViewType.g:2186:1: ( '{' )
            // InternalAssemblyViewType.g:2187:2: '{'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2196:1: rule__AssemblyConnector__Group__2 : rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 ;
    public final void rule__AssemblyConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2200:1: ( rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3 )
            // InternalAssemblyViewType.g:2201:2: rule__AssemblyConnector__Group__2__Impl rule__AssemblyConnector__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:2208:1: rule__AssemblyConnector__Group__2__Impl : ( 'providedRole' ) ;
    public final void rule__AssemblyConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2212:1: ( ( 'providedRole' ) )
            // InternalAssemblyViewType.g:2213:1: ( 'providedRole' )
            {
            // InternalAssemblyViewType.g:2213:1: ( 'providedRole' )
            // InternalAssemblyViewType.g:2214:2: 'providedRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleKeyword_2()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2223:1: rule__AssemblyConnector__Group__3 : rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 ;
    public final void rule__AssemblyConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2227:1: ( rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4 )
            // InternalAssemblyViewType.g:2228:2: rule__AssemblyConnector__Group__3__Impl rule__AssemblyConnector__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalAssemblyViewType.g:2235:1: rule__AssemblyConnector__Group__3__Impl : ( ( rule__AssemblyConnector__ProvidedRoleAssignment_3 ) ) ;
    public final void rule__AssemblyConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2239:1: ( ( ( rule__AssemblyConnector__ProvidedRoleAssignment_3 ) ) )
            // InternalAssemblyViewType.g:2240:1: ( ( rule__AssemblyConnector__ProvidedRoleAssignment_3 ) )
            {
            // InternalAssemblyViewType.g:2240:1: ( ( rule__AssemblyConnector__ProvidedRoleAssignment_3 ) )
            // InternalAssemblyViewType.g:2241:2: ( rule__AssemblyConnector__ProvidedRoleAssignment_3 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleAssignment_3()); 
            // InternalAssemblyViewType.g:2242:2: ( rule__AssemblyConnector__ProvidedRoleAssignment_3 )
            // InternalAssemblyViewType.g:2242:3: rule__AssemblyConnector__ProvidedRoleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__ProvidedRoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleAssignment_3()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2250:1: rule__AssemblyConnector__Group__4 : rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 ;
    public final void rule__AssemblyConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2254:1: ( rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5 )
            // InternalAssemblyViewType.g:2255:2: rule__AssemblyConnector__Group__4__Impl rule__AssemblyConnector__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalAssemblyViewType.g:2262:1: rule__AssemblyConnector__Group__4__Impl : ( 'requiredRole' ) ;
    public final void rule__AssemblyConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2266:1: ( ( 'requiredRole' ) )
            // InternalAssemblyViewType.g:2267:1: ( 'requiredRole' )
            {
            // InternalAssemblyViewType.g:2267:1: ( 'requiredRole' )
            // InternalAssemblyViewType.g:2268:2: 'requiredRole'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleKeyword_4()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2277:1: rule__AssemblyConnector__Group__5 : rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 ;
    public final void rule__AssemblyConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2281:1: ( rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6 )
            // InternalAssemblyViewType.g:2282:2: rule__AssemblyConnector__Group__5__Impl rule__AssemblyConnector__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalAssemblyViewType.g:2289:1: rule__AssemblyConnector__Group__5__Impl : ( ( rule__AssemblyConnector__RequiredRoleAssignment_5 ) ) ;
    public final void rule__AssemblyConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2293:1: ( ( ( rule__AssemblyConnector__RequiredRoleAssignment_5 ) ) )
            // InternalAssemblyViewType.g:2294:1: ( ( rule__AssemblyConnector__RequiredRoleAssignment_5 ) )
            {
            // InternalAssemblyViewType.g:2294:1: ( ( rule__AssemblyConnector__RequiredRoleAssignment_5 ) )
            // InternalAssemblyViewType.g:2295:2: ( rule__AssemblyConnector__RequiredRoleAssignment_5 )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleAssignment_5()); 
            // InternalAssemblyViewType.g:2296:2: ( rule__AssemblyConnector__RequiredRoleAssignment_5 )
            // InternalAssemblyViewType.g:2296:3: rule__AssemblyConnector__RequiredRoleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__RequiredRoleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleAssignment_5()); 

            }


            }

        }
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
    // InternalAssemblyViewType.g:2304:1: rule__AssemblyConnector__Group__6 : rule__AssemblyConnector__Group__6__Impl ;
    public final void rule__AssemblyConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2308:1: ( rule__AssemblyConnector__Group__6__Impl )
            // InternalAssemblyViewType.g:2309:2: rule__AssemblyConnector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyConnector__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalAssemblyViewType.g:2315:1: rule__AssemblyConnector__Group__6__Impl : ( '}' ) ;
    public final void rule__AssemblyConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2319:1: ( ( '}' ) )
            // InternalAssemblyViewType.g:2320:1: ( '}' )
            {
            // InternalAssemblyViewType.g:2320:1: ( '}' )
            // InternalAssemblyViewType.g:2321:2: '}'
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssemblyConnectorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssemblyViewType__SystemsAssignment_4"
    // InternalAssemblyViewType.g:2331:1: rule__AssemblyViewType__SystemsAssignment_4 : ( ruleSystem ) ;
    public final void rule__AssemblyViewType__SystemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2335:1: ( ( ruleSystem ) )
            // InternalAssemblyViewType.g:2336:2: ( ruleSystem )
            {
            // InternalAssemblyViewType.g:2336:2: ( ruleSystem )
            // InternalAssemblyViewType.g:2337:3: ruleSystem
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
    // InternalAssemblyViewType.g:2346:1: rule__AssemblyViewType__SystemsAssignment_5_1 : ( ruleSystem ) ;
    public final void rule__AssemblyViewType__SystemsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2350:1: ( ( ruleSystem ) )
            // InternalAssemblyViewType.g:2351:2: ( ruleSystem )
            {
            // InternalAssemblyViewType.g:2351:2: ( ruleSystem )
            // InternalAssemblyViewType.g:2352:3: ruleSystem
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


    // $ANTLR start "rule__System__RequiredInterfacesAssignment_2_2"
    // InternalAssemblyViewType.g:2361:1: rule__System__RequiredInterfacesAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__System__RequiredInterfacesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2365:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2366:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2366:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2367:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_2_2_0()); 
            // InternalAssemblyViewType.g:2368:3: ( ruleEString )
            // InternalAssemblyViewType.g:2369:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__RequiredInterfacesAssignment_2_2"


    // $ANTLR start "rule__System__RequiredInterfacesAssignment_2_3_1"
    // InternalAssemblyViewType.g:2380:1: rule__System__RequiredInterfacesAssignment_2_3_1 : ( ( ruleEString ) ) ;
    public final void rule__System__RequiredInterfacesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2384:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2385:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2385:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2386:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_2_3_1_0()); 
            // InternalAssemblyViewType.g:2387:3: ( ruleEString )
            // InternalAssemblyViewType.g:2388:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceEStringParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getRequiredInterfacesInterfaceCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__RequiredInterfacesAssignment_2_3_1"


    // $ANTLR start "rule__System__ProvidedInterfacesAssignment_5"
    // InternalAssemblyViewType.g:2399:1: rule__System__ProvidedInterfacesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__System__ProvidedInterfacesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2403:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2404:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2404:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2405:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_5_0()); 
            // InternalAssemblyViewType.g:2406:3: ( ruleEString )
            // InternalAssemblyViewType.g:2407:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProvidedInterfacesAssignment_5"


    // $ANTLR start "rule__System__ProvidedInterfacesAssignment_6_1"
    // InternalAssemblyViewType.g:2418:1: rule__System__ProvidedInterfacesAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__System__ProvidedInterfacesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2422:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2423:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2423:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2424:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_6_1_0()); 
            // InternalAssemblyViewType.g:2425:3: ( ruleEString )
            // InternalAssemblyViewType.g:2426:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProvidedInterfacesAssignment_6_1"


    // $ANTLR start "rule__System__SystemElementsAssignment_10"
    // InternalAssemblyViewType.g:2437:1: rule__System__SystemElementsAssignment_10 : ( ruleAbstractSystemElement ) ;
    public final void rule__System__SystemElementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2441:1: ( ( ruleAbstractSystemElement ) )
            // InternalAssemblyViewType.g:2442:2: ( ruleAbstractSystemElement )
            {
            // InternalAssemblyViewType.g:2442:2: ( ruleAbstractSystemElement )
            // InternalAssemblyViewType.g:2443:3: ruleAbstractSystemElement
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSystemElement();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemElementsAssignment_10"


    // $ANTLR start "rule__System__SystemElementsAssignment_11_1"
    // InternalAssemblyViewType.g:2452:1: rule__System__SystemElementsAssignment_11_1 : ( ruleAbstractSystemElement ) ;
    public final void rule__System__SystemElementsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2456:1: ( ( ruleAbstractSystemElement ) )
            // InternalAssemblyViewType.g:2457:2: ( ruleAbstractSystemElement )
            {
            // InternalAssemblyViewType.g:2457:2: ( ruleAbstractSystemElement )
            // InternalAssemblyViewType.g:2458:3: ruleAbstractSystemElement
            {
             before(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSystemElement();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSystemElementsAbstractSystemElementParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemElementsAssignment_11_1"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalAssemblyViewType.g:2467:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2471:1: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2472:2: ( ruleEString )
            {
            // InternalAssemblyViewType.g:2472:2: ( ruleEString )
            // InternalAssemblyViewType.g:2473:3: ruleEString
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
    // InternalAssemblyViewType.g:2482:1: rule__AssemblyContext__ComponentAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2486:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2487:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2487:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2488:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAbstractComponentCrossReference_4_0()); 
            // InternalAssemblyViewType.g:2489:3: ( ruleEString )
            // InternalAssemblyViewType.g:2490:4: ruleEString
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
    // InternalAssemblyViewType.g:2501:1: rule__AssemblyContext__ProvidedRolesAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2505:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2506:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2506:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2507:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_7_0()); 
            // InternalAssemblyViewType.g:2508:3: ( ruleEString )
            // InternalAssemblyViewType.g:2509:4: ruleEString
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
    // InternalAssemblyViewType.g:2520:1: rule__AssemblyContext__ProvidedRolesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ProvidedRolesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2524:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2525:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2525:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2526:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRolesRoleCrossReference_8_1_0()); 
            // InternalAssemblyViewType.g:2527:3: ( ruleEString )
            // InternalAssemblyViewType.g:2528:4: ruleEString
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
    // InternalAssemblyViewType.g:2539:1: rule__AssemblyContext__RequiredRolesAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2543:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2544:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2544:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2545:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_2_0()); 
            // InternalAssemblyViewType.g:2546:3: ( ruleEString )
            // InternalAssemblyViewType.g:2547:4: ruleEString
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
    // InternalAssemblyViewType.g:2558:1: rule__AssemblyContext__RequiredRolesAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRolesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2562:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2563:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2563:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2564:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRolesRoleCrossReference_10_3_1_0()); 
            // InternalAssemblyViewType.g:2565:3: ( ruleEString )
            // InternalAssemblyViewType.g:2566:4: ruleEString
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


    // $ANTLR start "rule__Role__InterfaceAssignment_3"
    // InternalAssemblyViewType.g:2577:1: rule__Role__InterfaceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Role__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2581:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2582:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2582:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2583:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_3_0()); 
            // InternalAssemblyViewType.g:2584:3: ( ruleEString )
            // InternalAssemblyViewType.g:2585:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getInterfaceInterfaceEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getInterfaceInterfaceEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getInterfaceInterfaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__InterfaceAssignment_3"


    // $ANTLR start "rule__DelegationConnector__RoleAssignment_3"
    // InternalAssemblyViewType.g:2596:1: rule__DelegationConnector__RoleAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2600:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2601:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2601:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2602:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_3_0()); 
            // InternalAssemblyViewType.g:2603:3: ( ruleEString )
            // InternalAssemblyViewType.g:2604:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__RoleAssignment_3"


    // $ANTLR start "rule__DelegationConnector__InterfaceAssignment_5"
    // InternalAssemblyViewType.g:2615:1: rule__DelegationConnector__InterfaceAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DelegationConnector__InterfaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2619:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2620:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2620:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2621:3: ( ruleEString )
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceCrossReference_5_0()); 
            // InternalAssemblyViewType.g:2622:3: ( ruleEString )
            // InternalAssemblyViewType.g:2623:4: ruleEString
            {
             before(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDelegationConnectorAccess().getInterfaceInterfaceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelegationConnector__InterfaceAssignment_5"


    // $ANTLR start "rule__AssemblyConnector__ProvidedRoleAssignment_3"
    // InternalAssemblyViewType.g:2634:1: rule__AssemblyConnector__ProvidedRoleAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__ProvidedRoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2638:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2639:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2639:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2640:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_3_0()); 
            // InternalAssemblyViewType.g:2641:3: ( ruleEString )
            // InternalAssemblyViewType.g:2642:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getProvidedRoleRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__ProvidedRoleAssignment_3"


    // $ANTLR start "rule__AssemblyConnector__RequiredRoleAssignment_5"
    // InternalAssemblyViewType.g:2653:1: rule__AssemblyConnector__RequiredRoleAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyConnector__RequiredRoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssemblyViewType.g:2657:1: ( ( ( ruleEString ) ) )
            // InternalAssemblyViewType.g:2658:2: ( ( ruleEString ) )
            {
            // InternalAssemblyViewType.g:2658:2: ( ( ruleEString ) )
            // InternalAssemblyViewType.g:2659:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_5_0()); 
            // InternalAssemblyViewType.g:2660:3: ( ruleEString )
            // InternalAssemblyViewType.g:2661:4: ruleEString
            {
             before(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAssemblyConnectorAccess().getRequiredRoleRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyConnector__RequiredRoleAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000054400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});

}