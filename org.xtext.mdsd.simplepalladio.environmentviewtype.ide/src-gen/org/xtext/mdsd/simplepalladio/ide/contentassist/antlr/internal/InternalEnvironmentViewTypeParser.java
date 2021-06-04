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
import org.xtext.mdsd.simplepalladio.services.EnvironmentViewTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvironmentViewTypeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EnvironmentViewType'", "'{'", "'environmentElements'", "'}'", "','", "'Container'", "'Link'", "'containers'", "'('", "')'"
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

    	public void setGrammarAccess(EnvironmentViewTypeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEnvironmentViewType"
    // InternalEnvironmentViewType.g:53:1: entryRuleEnvironmentViewType : ruleEnvironmentViewType EOF ;
    public final void entryRuleEnvironmentViewType() throws RecognitionException {
        try {
            // InternalEnvironmentViewType.g:54:1: ( ruleEnvironmentViewType EOF )
            // InternalEnvironmentViewType.g:55:1: ruleEnvironmentViewType EOF
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
    // InternalEnvironmentViewType.g:62:1: ruleEnvironmentViewType : ( ( rule__EnvironmentViewType__Group__0 ) ) ;
    public final void ruleEnvironmentViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:66:2: ( ( ( rule__EnvironmentViewType__Group__0 ) ) )
            // InternalEnvironmentViewType.g:67:2: ( ( rule__EnvironmentViewType__Group__0 ) )
            {
            // InternalEnvironmentViewType.g:67:2: ( ( rule__EnvironmentViewType__Group__0 ) )
            // InternalEnvironmentViewType.g:68:3: ( rule__EnvironmentViewType__Group__0 )
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getGroup()); 
            // InternalEnvironmentViewType.g:69:3: ( rule__EnvironmentViewType__Group__0 )
            // InternalEnvironmentViewType.g:69:4: rule__EnvironmentViewType__Group__0
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
    // InternalEnvironmentViewType.g:78:1: entryRuleAbstractEnvironmentElement : ruleAbstractEnvironmentElement EOF ;
    public final void entryRuleAbstractEnvironmentElement() throws RecognitionException {
        try {
            // InternalEnvironmentViewType.g:79:1: ( ruleAbstractEnvironmentElement EOF )
            // InternalEnvironmentViewType.g:80:1: ruleAbstractEnvironmentElement EOF
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
    // InternalEnvironmentViewType.g:87:1: ruleAbstractEnvironmentElement : ( ( rule__AbstractEnvironmentElement__Alternatives ) ) ;
    public final void ruleAbstractEnvironmentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:91:2: ( ( ( rule__AbstractEnvironmentElement__Alternatives ) ) )
            // InternalEnvironmentViewType.g:92:2: ( ( rule__AbstractEnvironmentElement__Alternatives ) )
            {
            // InternalEnvironmentViewType.g:92:2: ( ( rule__AbstractEnvironmentElement__Alternatives ) )
            // InternalEnvironmentViewType.g:93:3: ( rule__AbstractEnvironmentElement__Alternatives )
            {
             before(grammarAccess.getAbstractEnvironmentElementAccess().getAlternatives()); 
            // InternalEnvironmentViewType.g:94:3: ( rule__AbstractEnvironmentElement__Alternatives )
            // InternalEnvironmentViewType.g:94:4: rule__AbstractEnvironmentElement__Alternatives
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


    // $ANTLR start "entryRuleEString"
    // InternalEnvironmentViewType.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEnvironmentViewType.g:104:1: ( ruleEString EOF )
            // InternalEnvironmentViewType.g:105:1: ruleEString EOF
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
    // InternalEnvironmentViewType.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEnvironmentViewType.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEnvironmentViewType.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalEnvironmentViewType.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEnvironmentViewType.g:119:3: ( rule__EString__Alternatives )
            // InternalEnvironmentViewType.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleContainer"
    // InternalEnvironmentViewType.g:128:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalEnvironmentViewType.g:129:1: ( ruleContainer EOF )
            // InternalEnvironmentViewType.g:130:1: ruleContainer EOF
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
    // InternalEnvironmentViewType.g:137:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:141:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalEnvironmentViewType.g:142:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalEnvironmentViewType.g:142:2: ( ( rule__Container__Group__0 ) )
            // InternalEnvironmentViewType.g:143:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalEnvironmentViewType.g:144:3: ( rule__Container__Group__0 )
            // InternalEnvironmentViewType.g:144:4: rule__Container__Group__0
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
    // InternalEnvironmentViewType.g:153:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalEnvironmentViewType.g:154:1: ( ruleLink EOF )
            // InternalEnvironmentViewType.g:155:1: ruleLink EOF
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
    // InternalEnvironmentViewType.g:162:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:166:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalEnvironmentViewType.g:167:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalEnvironmentViewType.g:167:2: ( ( rule__Link__Group__0 ) )
            // InternalEnvironmentViewType.g:168:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalEnvironmentViewType.g:169:3: ( rule__Link__Group__0 )
            // InternalEnvironmentViewType.g:169:4: rule__Link__Group__0
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


    // $ANTLR start "rule__AbstractEnvironmentElement__Alternatives"
    // InternalEnvironmentViewType.g:177:1: rule__AbstractEnvironmentElement__Alternatives : ( ( ruleContainer ) | ( ruleLink ) );
    public final void rule__AbstractEnvironmentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:181:1: ( ( ruleContainer ) | ( ruleLink ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEnvironmentViewType.g:182:2: ( ruleContainer )
                    {
                    // InternalEnvironmentViewType.g:182:2: ( ruleContainer )
                    // InternalEnvironmentViewType.g:183:3: ruleContainer
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
                    // InternalEnvironmentViewType.g:188:2: ( ruleLink )
                    {
                    // InternalEnvironmentViewType.g:188:2: ( ruleLink )
                    // InternalEnvironmentViewType.g:189:3: ruleLink
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEnvironmentViewType.g:198:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:202:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalEnvironmentViewType.g:203:2: ( RULE_STRING )
                    {
                    // InternalEnvironmentViewType.g:203:2: ( RULE_STRING )
                    // InternalEnvironmentViewType.g:204:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEnvironmentViewType.g:209:2: ( RULE_ID )
                    {
                    // InternalEnvironmentViewType.g:209:2: ( RULE_ID )
                    // InternalEnvironmentViewType.g:210:3: RULE_ID
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


    // $ANTLR start "rule__EnvironmentViewType__Group__0"
    // InternalEnvironmentViewType.g:219:1: rule__EnvironmentViewType__Group__0 : rule__EnvironmentViewType__Group__0__Impl rule__EnvironmentViewType__Group__1 ;
    public final void rule__EnvironmentViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:223:1: ( rule__EnvironmentViewType__Group__0__Impl rule__EnvironmentViewType__Group__1 )
            // InternalEnvironmentViewType.g:224:2: rule__EnvironmentViewType__Group__0__Impl rule__EnvironmentViewType__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEnvironmentViewType.g:231:1: rule__EnvironmentViewType__Group__0__Impl : ( 'EnvironmentViewType' ) ;
    public final void rule__EnvironmentViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:235:1: ( ( 'EnvironmentViewType' ) )
            // InternalEnvironmentViewType.g:236:1: ( 'EnvironmentViewType' )
            {
            // InternalEnvironmentViewType.g:236:1: ( 'EnvironmentViewType' )
            // InternalEnvironmentViewType.g:237:2: 'EnvironmentViewType'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentViewTypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:246:1: rule__EnvironmentViewType__Group__1 : rule__EnvironmentViewType__Group__1__Impl rule__EnvironmentViewType__Group__2 ;
    public final void rule__EnvironmentViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:250:1: ( rule__EnvironmentViewType__Group__1__Impl rule__EnvironmentViewType__Group__2 )
            // InternalEnvironmentViewType.g:251:2: rule__EnvironmentViewType__Group__1__Impl rule__EnvironmentViewType__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalEnvironmentViewType.g:258:1: rule__EnvironmentViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__EnvironmentViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:262:1: ( ( '{' ) )
            // InternalEnvironmentViewType.g:263:1: ( '{' )
            {
            // InternalEnvironmentViewType.g:263:1: ( '{' )
            // InternalEnvironmentViewType.g:264:2: '{'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:273:1: rule__EnvironmentViewType__Group__2 : rule__EnvironmentViewType__Group__2__Impl rule__EnvironmentViewType__Group__3 ;
    public final void rule__EnvironmentViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:277:1: ( rule__EnvironmentViewType__Group__2__Impl rule__EnvironmentViewType__Group__3 )
            // InternalEnvironmentViewType.g:278:2: rule__EnvironmentViewType__Group__2__Impl rule__EnvironmentViewType__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalEnvironmentViewType.g:285:1: rule__EnvironmentViewType__Group__2__Impl : ( 'environmentElements' ) ;
    public final void rule__EnvironmentViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:289:1: ( ( 'environmentElements' ) )
            // InternalEnvironmentViewType.g:290:1: ( 'environmentElements' )
            {
            // InternalEnvironmentViewType.g:290:1: ( 'environmentElements' )
            // InternalEnvironmentViewType.g:291:2: 'environmentElements'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:300:1: rule__EnvironmentViewType__Group__3 : rule__EnvironmentViewType__Group__3__Impl rule__EnvironmentViewType__Group__4 ;
    public final void rule__EnvironmentViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:304:1: ( rule__EnvironmentViewType__Group__3__Impl rule__EnvironmentViewType__Group__4 )
            // InternalEnvironmentViewType.g:305:2: rule__EnvironmentViewType__Group__3__Impl rule__EnvironmentViewType__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalEnvironmentViewType.g:312:1: rule__EnvironmentViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnvironmentViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:316:1: ( ( '{' ) )
            // InternalEnvironmentViewType.g:317:1: ( '{' )
            {
            // InternalEnvironmentViewType.g:317:1: ( '{' )
            // InternalEnvironmentViewType.g:318:2: '{'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:327:1: rule__EnvironmentViewType__Group__4 : rule__EnvironmentViewType__Group__4__Impl rule__EnvironmentViewType__Group__5 ;
    public final void rule__EnvironmentViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:331:1: ( rule__EnvironmentViewType__Group__4__Impl rule__EnvironmentViewType__Group__5 )
            // InternalEnvironmentViewType.g:332:2: rule__EnvironmentViewType__Group__4__Impl rule__EnvironmentViewType__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalEnvironmentViewType.g:339:1: rule__EnvironmentViewType__Group__4__Impl : ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) ) ;
    public final void rule__EnvironmentViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:343:1: ( ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) ) )
            // InternalEnvironmentViewType.g:344:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) )
            {
            // InternalEnvironmentViewType.g:344:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 ) )
            // InternalEnvironmentViewType.g:345:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 )
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_4()); 
            // InternalEnvironmentViewType.g:346:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_4 )
            // InternalEnvironmentViewType.g:346:3: rule__EnvironmentViewType__EnvironmentElementsAssignment_4
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
    // InternalEnvironmentViewType.g:354:1: rule__EnvironmentViewType__Group__5 : rule__EnvironmentViewType__Group__5__Impl rule__EnvironmentViewType__Group__6 ;
    public final void rule__EnvironmentViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:358:1: ( rule__EnvironmentViewType__Group__5__Impl rule__EnvironmentViewType__Group__6 )
            // InternalEnvironmentViewType.g:359:2: rule__EnvironmentViewType__Group__5__Impl rule__EnvironmentViewType__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalEnvironmentViewType.g:366:1: rule__EnvironmentViewType__Group__5__Impl : ( ( rule__EnvironmentViewType__Group_5__0 )* ) ;
    public final void rule__EnvironmentViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:370:1: ( ( ( rule__EnvironmentViewType__Group_5__0 )* ) )
            // InternalEnvironmentViewType.g:371:1: ( ( rule__EnvironmentViewType__Group_5__0 )* )
            {
            // InternalEnvironmentViewType.g:371:1: ( ( rule__EnvironmentViewType__Group_5__0 )* )
            // InternalEnvironmentViewType.g:372:2: ( rule__EnvironmentViewType__Group_5__0 )*
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getGroup_5()); 
            // InternalEnvironmentViewType.g:373:2: ( rule__EnvironmentViewType__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEnvironmentViewType.g:373:3: rule__EnvironmentViewType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__EnvironmentViewType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalEnvironmentViewType.g:381:1: rule__EnvironmentViewType__Group__6 : rule__EnvironmentViewType__Group__6__Impl rule__EnvironmentViewType__Group__7 ;
    public final void rule__EnvironmentViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:385:1: ( rule__EnvironmentViewType__Group__6__Impl rule__EnvironmentViewType__Group__7 )
            // InternalEnvironmentViewType.g:386:2: rule__EnvironmentViewType__Group__6__Impl rule__EnvironmentViewType__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalEnvironmentViewType.g:393:1: rule__EnvironmentViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnvironmentViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:397:1: ( ( '}' ) )
            // InternalEnvironmentViewType.g:398:1: ( '}' )
            {
            // InternalEnvironmentViewType.g:398:1: ( '}' )
            // InternalEnvironmentViewType.g:399:2: '}'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:408:1: rule__EnvironmentViewType__Group__7 : rule__EnvironmentViewType__Group__7__Impl ;
    public final void rule__EnvironmentViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:412:1: ( rule__EnvironmentViewType__Group__7__Impl )
            // InternalEnvironmentViewType.g:413:2: rule__EnvironmentViewType__Group__7__Impl
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
    // InternalEnvironmentViewType.g:419:1: rule__EnvironmentViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__EnvironmentViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:423:1: ( ( '}' ) )
            // InternalEnvironmentViewType.g:424:1: ( '}' )
            {
            // InternalEnvironmentViewType.g:424:1: ( '}' )
            // InternalEnvironmentViewType.g:425:2: '}'
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:435:1: rule__EnvironmentViewType__Group_5__0 : rule__EnvironmentViewType__Group_5__0__Impl rule__EnvironmentViewType__Group_5__1 ;
    public final void rule__EnvironmentViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:439:1: ( rule__EnvironmentViewType__Group_5__0__Impl rule__EnvironmentViewType__Group_5__1 )
            // InternalEnvironmentViewType.g:440:2: rule__EnvironmentViewType__Group_5__0__Impl rule__EnvironmentViewType__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalEnvironmentViewType.g:447:1: rule__EnvironmentViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnvironmentViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:451:1: ( ( ',' ) )
            // InternalEnvironmentViewType.g:452:1: ( ',' )
            {
            // InternalEnvironmentViewType.g:452:1: ( ',' )
            // InternalEnvironmentViewType.g:453:2: ','
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getCommaKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:462:1: rule__EnvironmentViewType__Group_5__1 : rule__EnvironmentViewType__Group_5__1__Impl ;
    public final void rule__EnvironmentViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:466:1: ( rule__EnvironmentViewType__Group_5__1__Impl )
            // InternalEnvironmentViewType.g:467:2: rule__EnvironmentViewType__Group_5__1__Impl
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
    // InternalEnvironmentViewType.g:473:1: rule__EnvironmentViewType__Group_5__1__Impl : ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) ) ;
    public final void rule__EnvironmentViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:477:1: ( ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) ) )
            // InternalEnvironmentViewType.g:478:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) )
            {
            // InternalEnvironmentViewType.g:478:1: ( ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 ) )
            // InternalEnvironmentViewType.g:479:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 )
            {
             before(grammarAccess.getEnvironmentViewTypeAccess().getEnvironmentElementsAssignment_5_1()); 
            // InternalEnvironmentViewType.g:480:2: ( rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 )
            // InternalEnvironmentViewType.g:480:3: rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1
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
    // InternalEnvironmentViewType.g:489:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:493:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalEnvironmentViewType.g:494:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalEnvironmentViewType.g:501:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:505:1: ( ( () ) )
            // InternalEnvironmentViewType.g:506:1: ( () )
            {
            // InternalEnvironmentViewType.g:506:1: ( () )
            // InternalEnvironmentViewType.g:507:2: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // InternalEnvironmentViewType.g:508:2: ()
            // InternalEnvironmentViewType.g:508:3: 
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
    // InternalEnvironmentViewType.g:516:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:520:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalEnvironmentViewType.g:521:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalEnvironmentViewType.g:528:1: rule__Container__Group__1__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:532:1: ( ( 'Container' ) )
            // InternalEnvironmentViewType.g:533:1: ( 'Container' )
            {
            // InternalEnvironmentViewType.g:533:1: ( 'Container' )
            // InternalEnvironmentViewType.g:534:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:543:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:547:1: ( rule__Container__Group__2__Impl )
            // InternalEnvironmentViewType.g:548:2: rule__Container__Group__2__Impl
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
    // InternalEnvironmentViewType.g:554:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:558:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalEnvironmentViewType.g:559:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalEnvironmentViewType.g:559:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalEnvironmentViewType.g:560:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalEnvironmentViewType.g:561:2: ( rule__Container__NameAssignment_2 )
            // InternalEnvironmentViewType.g:561:3: rule__Container__NameAssignment_2
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
    // InternalEnvironmentViewType.g:570:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:574:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalEnvironmentViewType.g:575:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEnvironmentViewType.g:582:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:586:1: ( ( 'Link' ) )
            // InternalEnvironmentViewType.g:587:1: ( 'Link' )
            {
            // InternalEnvironmentViewType.g:587:1: ( 'Link' )
            // InternalEnvironmentViewType.g:588:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:597:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:601:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalEnvironmentViewType.g:602:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalEnvironmentViewType.g:609:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:613:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalEnvironmentViewType.g:614:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalEnvironmentViewType.g:614:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalEnvironmentViewType.g:615:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalEnvironmentViewType.g:616:2: ( rule__Link__NameAssignment_1 )
            // InternalEnvironmentViewType.g:616:3: rule__Link__NameAssignment_1
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
    // InternalEnvironmentViewType.g:624:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:628:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalEnvironmentViewType.g:629:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalEnvironmentViewType.g:636:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:640:1: ( ( '{' ) )
            // InternalEnvironmentViewType.g:641:1: ( '{' )
            {
            // InternalEnvironmentViewType.g:641:1: ( '{' )
            // InternalEnvironmentViewType.g:642:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:651:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:655:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalEnvironmentViewType.g:656:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalEnvironmentViewType.g:663:1: rule__Link__Group__3__Impl : ( 'containers' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:667:1: ( ( 'containers' ) )
            // InternalEnvironmentViewType.g:668:1: ( 'containers' )
            {
            // InternalEnvironmentViewType.g:668:1: ( 'containers' )
            // InternalEnvironmentViewType.g:669:2: 'containers'
            {
             before(grammarAccess.getLinkAccess().getContainersKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:678:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:682:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalEnvironmentViewType.g:683:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalEnvironmentViewType.g:690:1: rule__Link__Group__4__Impl : ( '(' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:694:1: ( ( '(' ) )
            // InternalEnvironmentViewType.g:695:1: ( '(' )
            {
            // InternalEnvironmentViewType.g:695:1: ( '(' )
            // InternalEnvironmentViewType.g:696:2: '('
            {
             before(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:705:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:709:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalEnvironmentViewType.g:710:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalEnvironmentViewType.g:717:1: rule__Link__Group__5__Impl : ( ( rule__Link__ContainersAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:721:1: ( ( ( rule__Link__ContainersAssignment_5 ) ) )
            // InternalEnvironmentViewType.g:722:1: ( ( rule__Link__ContainersAssignment_5 ) )
            {
            // InternalEnvironmentViewType.g:722:1: ( ( rule__Link__ContainersAssignment_5 ) )
            // InternalEnvironmentViewType.g:723:2: ( rule__Link__ContainersAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getContainersAssignment_5()); 
            // InternalEnvironmentViewType.g:724:2: ( rule__Link__ContainersAssignment_5 )
            // InternalEnvironmentViewType.g:724:3: rule__Link__ContainersAssignment_5
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
    // InternalEnvironmentViewType.g:732:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:736:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalEnvironmentViewType.g:737:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalEnvironmentViewType.g:744:1: rule__Link__Group__6__Impl : ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:748:1: ( ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) ) )
            // InternalEnvironmentViewType.g:749:1: ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) )
            {
            // InternalEnvironmentViewType.g:749:1: ( ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* ) )
            // InternalEnvironmentViewType.g:750:2: ( ( rule__Link__Group_6__0 ) ) ( ( rule__Link__Group_6__0 )* )
            {
            // InternalEnvironmentViewType.g:750:2: ( ( rule__Link__Group_6__0 ) )
            // InternalEnvironmentViewType.g:751:3: ( rule__Link__Group_6__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalEnvironmentViewType.g:752:3: ( rule__Link__Group_6__0 )
            // InternalEnvironmentViewType.g:752:4: rule__Link__Group_6__0
            {
            pushFollow(FOLLOW_7);
            rule__Link__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup_6()); 

            }

            // InternalEnvironmentViewType.g:755:2: ( ( rule__Link__Group_6__0 )* )
            // InternalEnvironmentViewType.g:756:3: ( rule__Link__Group_6__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalEnvironmentViewType.g:757:3: ( rule__Link__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEnvironmentViewType.g:757:4: rule__Link__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Link__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalEnvironmentViewType.g:766:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:770:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // InternalEnvironmentViewType.g:771:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalEnvironmentViewType.g:778:1: rule__Link__Group__7__Impl : ( ')' ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:782:1: ( ( ')' ) )
            // InternalEnvironmentViewType.g:783:1: ( ')' )
            {
            // InternalEnvironmentViewType.g:783:1: ( ')' )
            // InternalEnvironmentViewType.g:784:2: ')'
            {
             before(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:793:1: rule__Link__Group__8 : rule__Link__Group__8__Impl ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:797:1: ( rule__Link__Group__8__Impl )
            // InternalEnvironmentViewType.g:798:2: rule__Link__Group__8__Impl
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
    // InternalEnvironmentViewType.g:804:1: rule__Link__Group__8__Impl : ( '}' ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:808:1: ( ( '}' ) )
            // InternalEnvironmentViewType.g:809:1: ( '}' )
            {
            // InternalEnvironmentViewType.g:809:1: ( '}' )
            // InternalEnvironmentViewType.g:810:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:820:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:824:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalEnvironmentViewType.g:825:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEnvironmentViewType.g:832:1: rule__Link__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:836:1: ( ( ',' ) )
            // InternalEnvironmentViewType.g:837:1: ( ',' )
            {
            // InternalEnvironmentViewType.g:837:1: ( ',' )
            // InternalEnvironmentViewType.g:838:2: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEnvironmentViewType.g:847:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:851:1: ( rule__Link__Group_6__1__Impl )
            // InternalEnvironmentViewType.g:852:2: rule__Link__Group_6__1__Impl
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
    // InternalEnvironmentViewType.g:858:1: rule__Link__Group_6__1__Impl : ( ( rule__Link__ContainersAssignment_6_1 ) ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:862:1: ( ( ( rule__Link__ContainersAssignment_6_1 ) ) )
            // InternalEnvironmentViewType.g:863:1: ( ( rule__Link__ContainersAssignment_6_1 ) )
            {
            // InternalEnvironmentViewType.g:863:1: ( ( rule__Link__ContainersAssignment_6_1 ) )
            // InternalEnvironmentViewType.g:864:2: ( rule__Link__ContainersAssignment_6_1 )
            {
             before(grammarAccess.getLinkAccess().getContainersAssignment_6_1()); 
            // InternalEnvironmentViewType.g:865:2: ( rule__Link__ContainersAssignment_6_1 )
            // InternalEnvironmentViewType.g:865:3: rule__Link__ContainersAssignment_6_1
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


    // $ANTLR start "rule__EnvironmentViewType__EnvironmentElementsAssignment_4"
    // InternalEnvironmentViewType.g:874:1: rule__EnvironmentViewType__EnvironmentElementsAssignment_4 : ( ruleAbstractEnvironmentElement ) ;
    public final void rule__EnvironmentViewType__EnvironmentElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:878:1: ( ( ruleAbstractEnvironmentElement ) )
            // InternalEnvironmentViewType.g:879:2: ( ruleAbstractEnvironmentElement )
            {
            // InternalEnvironmentViewType.g:879:2: ( ruleAbstractEnvironmentElement )
            // InternalEnvironmentViewType.g:880:3: ruleAbstractEnvironmentElement
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
    // InternalEnvironmentViewType.g:889:1: rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1 : ( ruleAbstractEnvironmentElement ) ;
    public final void rule__EnvironmentViewType__EnvironmentElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:893:1: ( ( ruleAbstractEnvironmentElement ) )
            // InternalEnvironmentViewType.g:894:2: ( ruleAbstractEnvironmentElement )
            {
            // InternalEnvironmentViewType.g:894:2: ( ruleAbstractEnvironmentElement )
            // InternalEnvironmentViewType.g:895:3: ruleAbstractEnvironmentElement
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
    // InternalEnvironmentViewType.g:904:1: rule__Container__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:908:1: ( ( ruleEString ) )
            // InternalEnvironmentViewType.g:909:2: ( ruleEString )
            {
            // InternalEnvironmentViewType.g:909:2: ( ruleEString )
            // InternalEnvironmentViewType.g:910:3: ruleEString
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
    // InternalEnvironmentViewType.g:919:1: rule__Link__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:923:1: ( ( ruleEString ) )
            // InternalEnvironmentViewType.g:924:2: ( ruleEString )
            {
            // InternalEnvironmentViewType.g:924:2: ( ruleEString )
            // InternalEnvironmentViewType.g:925:3: ruleEString
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
    // InternalEnvironmentViewType.g:934:1: rule__Link__ContainersAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:938:1: ( ( ( ruleEString ) ) )
            // InternalEnvironmentViewType.g:939:2: ( ( ruleEString ) )
            {
            // InternalEnvironmentViewType.g:939:2: ( ( ruleEString ) )
            // InternalEnvironmentViewType.g:940:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainersContainerCrossReference_5_0()); 
            // InternalEnvironmentViewType.g:941:3: ( ruleEString )
            // InternalEnvironmentViewType.g:942:4: ruleEString
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
    // InternalEnvironmentViewType.g:953:1: rule__Link__ContainersAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Link__ContainersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvironmentViewType.g:957:1: ( ( ( ruleEString ) ) )
            // InternalEnvironmentViewType.g:958:2: ( ( ruleEString ) )
            {
            // InternalEnvironmentViewType.g:958:2: ( ( ruleEString ) )
            // InternalEnvironmentViewType.g:959:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getContainersContainerCrossReference_6_1_0()); 
            // InternalEnvironmentViewType.g:960:3: ( ruleEString )
            // InternalEnvironmentViewType.g:961:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}