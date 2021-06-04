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
import org.xtext.mdsd.simplepalladio.services.AllocationViewTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAllocationViewTypeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllocationViewType'", "'{'", "'allocationContexts'", "'}'", "','", "'AllocationContext'", "'container'", "'assembly'", "'.'"
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

    	public void setGrammarAccess(AllocationViewTypeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAllocationViewType"
    // InternalAllocationViewType.g:53:1: entryRuleAllocationViewType : ruleAllocationViewType EOF ;
    public final void entryRuleAllocationViewType() throws RecognitionException {
        try {
            // InternalAllocationViewType.g:54:1: ( ruleAllocationViewType EOF )
            // InternalAllocationViewType.g:55:1: ruleAllocationViewType EOF
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
    // InternalAllocationViewType.g:62:1: ruleAllocationViewType : ( ( rule__AllocationViewType__Group__0 ) ) ;
    public final void ruleAllocationViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:66:2: ( ( ( rule__AllocationViewType__Group__0 ) ) )
            // InternalAllocationViewType.g:67:2: ( ( rule__AllocationViewType__Group__0 ) )
            {
            // InternalAllocationViewType.g:67:2: ( ( rule__AllocationViewType__Group__0 ) )
            // InternalAllocationViewType.g:68:3: ( rule__AllocationViewType__Group__0 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getGroup()); 
            // InternalAllocationViewType.g:69:3: ( rule__AllocationViewType__Group__0 )
            // InternalAllocationViewType.g:69:4: rule__AllocationViewType__Group__0
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
    // InternalAllocationViewType.g:78:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalAllocationViewType.g:79:1: ( ruleAllocationContext EOF )
            // InternalAllocationViewType.g:80:1: ruleAllocationContext EOF
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
    // InternalAllocationViewType.g:87:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:91:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalAllocationViewType.g:92:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalAllocationViewType.g:92:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalAllocationViewType.g:93:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalAllocationViewType.g:94:3: ( rule__AllocationContext__Group__0 )
            // InternalAllocationViewType.g:94:4: rule__AllocationContext__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalAllocationViewType.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAllocationViewType.g:104:1: ( ruleEString EOF )
            // InternalAllocationViewType.g:105:1: ruleEString EOF
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
    // InternalAllocationViewType.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAllocationViewType.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAllocationViewType.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalAllocationViewType.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAllocationViewType.g:119:3: ( rule__EString__Alternatives )
            // InternalAllocationViewType.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAllocationViewType.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAllocationViewType.g:129:1: ( ruleQualifiedName EOF )
            // InternalAllocationViewType.g:130:1: ruleQualifiedName EOF
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
    // InternalAllocationViewType.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAllocationViewType.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAllocationViewType.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAllocationViewType.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAllocationViewType.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalAllocationViewType.g:144:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAllocationViewType.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAllocationViewType.g:157:2: ( RULE_STRING )
                    {
                    // InternalAllocationViewType.g:157:2: ( RULE_STRING )
                    // InternalAllocationViewType.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocationViewType.g:163:2: ( RULE_ID )
                    {
                    // InternalAllocationViewType.g:163:2: ( RULE_ID )
                    // InternalAllocationViewType.g:164:3: RULE_ID
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


    // $ANTLR start "rule__AllocationViewType__Group__0"
    // InternalAllocationViewType.g:173:1: rule__AllocationViewType__Group__0 : rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1 ;
    public final void rule__AllocationViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:177:1: ( rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1 )
            // InternalAllocationViewType.g:178:2: rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAllocationViewType.g:185:1: rule__AllocationViewType__Group__0__Impl : ( 'AllocationViewType' ) ;
    public final void rule__AllocationViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:189:1: ( ( 'AllocationViewType' ) )
            // InternalAllocationViewType.g:190:1: ( 'AllocationViewType' )
            {
            // InternalAllocationViewType.g:190:1: ( 'AllocationViewType' )
            // InternalAllocationViewType.g:191:2: 'AllocationViewType'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationViewTypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalAllocationViewType.g:200:1: rule__AllocationViewType__Group__1 : rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2 ;
    public final void rule__AllocationViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:204:1: ( rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2 )
            // InternalAllocationViewType.g:205:2: rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalAllocationViewType.g:212:1: rule__AllocationViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:216:1: ( ( '{' ) )
            // InternalAllocationViewType.g:217:1: ( '{' )
            {
            // InternalAllocationViewType.g:217:1: ( '{' )
            // InternalAllocationViewType.g:218:2: '{'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAllocationViewType.g:227:1: rule__AllocationViewType__Group__2 : rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3 ;
    public final void rule__AllocationViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:231:1: ( rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3 )
            // InternalAllocationViewType.g:232:2: rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalAllocationViewType.g:239:1: rule__AllocationViewType__Group__2__Impl : ( 'allocationContexts' ) ;
    public final void rule__AllocationViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:243:1: ( ( 'allocationContexts' ) )
            // InternalAllocationViewType.g:244:1: ( 'allocationContexts' )
            {
            // InternalAllocationViewType.g:244:1: ( 'allocationContexts' )
            // InternalAllocationViewType.g:245:2: 'allocationContexts'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalAllocationViewType.g:254:1: rule__AllocationViewType__Group__3 : rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4 ;
    public final void rule__AllocationViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:258:1: ( rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4 )
            // InternalAllocationViewType.g:259:2: rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalAllocationViewType.g:266:1: rule__AllocationViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__AllocationViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:270:1: ( ( '{' ) )
            // InternalAllocationViewType.g:271:1: ( '{' )
            {
            // InternalAllocationViewType.g:271:1: ( '{' )
            // InternalAllocationViewType.g:272:2: '{'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAllocationViewType.g:281:1: rule__AllocationViewType__Group__4 : rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5 ;
    public final void rule__AllocationViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:285:1: ( rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5 )
            // InternalAllocationViewType.g:286:2: rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalAllocationViewType.g:293:1: rule__AllocationViewType__Group__4__Impl : ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) ) ;
    public final void rule__AllocationViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:297:1: ( ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) ) )
            // InternalAllocationViewType.g:298:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) )
            {
            // InternalAllocationViewType.g:298:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) )
            // InternalAllocationViewType.g:299:2: ( rule__AllocationViewType__AllocationContextsAssignment_4 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_4()); 
            // InternalAllocationViewType.g:300:2: ( rule__AllocationViewType__AllocationContextsAssignment_4 )
            // InternalAllocationViewType.g:300:3: rule__AllocationViewType__AllocationContextsAssignment_4
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
    // InternalAllocationViewType.g:308:1: rule__AllocationViewType__Group__5 : rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6 ;
    public final void rule__AllocationViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:312:1: ( rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6 )
            // InternalAllocationViewType.g:313:2: rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalAllocationViewType.g:320:1: rule__AllocationViewType__Group__5__Impl : ( ( rule__AllocationViewType__Group_5__0 )* ) ;
    public final void rule__AllocationViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:324:1: ( ( ( rule__AllocationViewType__Group_5__0 )* ) )
            // InternalAllocationViewType.g:325:1: ( ( rule__AllocationViewType__Group_5__0 )* )
            {
            // InternalAllocationViewType.g:325:1: ( ( rule__AllocationViewType__Group_5__0 )* )
            // InternalAllocationViewType.g:326:2: ( rule__AllocationViewType__Group_5__0 )*
            {
             before(grammarAccess.getAllocationViewTypeAccess().getGroup_5()); 
            // InternalAllocationViewType.g:327:2: ( rule__AllocationViewType__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAllocationViewType.g:327:3: rule__AllocationViewType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AllocationViewType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalAllocationViewType.g:335:1: rule__AllocationViewType__Group__6 : rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7 ;
    public final void rule__AllocationViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:339:1: ( rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7 )
            // InternalAllocationViewType.g:340:2: rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalAllocationViewType.g:347:1: rule__AllocationViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:351:1: ( ( '}' ) )
            // InternalAllocationViewType.g:352:1: ( '}' )
            {
            // InternalAllocationViewType.g:352:1: ( '}' )
            // InternalAllocationViewType.g:353:2: '}'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAllocationViewType.g:362:1: rule__AllocationViewType__Group__7 : rule__AllocationViewType__Group__7__Impl ;
    public final void rule__AllocationViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:366:1: ( rule__AllocationViewType__Group__7__Impl )
            // InternalAllocationViewType.g:367:2: rule__AllocationViewType__Group__7__Impl
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
    // InternalAllocationViewType.g:373:1: rule__AllocationViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__AllocationViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:377:1: ( ( '}' ) )
            // InternalAllocationViewType.g:378:1: ( '}' )
            {
            // InternalAllocationViewType.g:378:1: ( '}' )
            // InternalAllocationViewType.g:379:2: '}'
            {
             before(grammarAccess.getAllocationViewTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAllocationViewType.g:389:1: rule__AllocationViewType__Group_5__0 : rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1 ;
    public final void rule__AllocationViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:393:1: ( rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1 )
            // InternalAllocationViewType.g:394:2: rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAllocationViewType.g:401:1: rule__AllocationViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__AllocationViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:405:1: ( ( ',' ) )
            // InternalAllocationViewType.g:406:1: ( ',' )
            {
            // InternalAllocationViewType.g:406:1: ( ',' )
            // InternalAllocationViewType.g:407:2: ','
            {
             before(grammarAccess.getAllocationViewTypeAccess().getCommaKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAllocationViewType.g:416:1: rule__AllocationViewType__Group_5__1 : rule__AllocationViewType__Group_5__1__Impl ;
    public final void rule__AllocationViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:420:1: ( rule__AllocationViewType__Group_5__1__Impl )
            // InternalAllocationViewType.g:421:2: rule__AllocationViewType__Group_5__1__Impl
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
    // InternalAllocationViewType.g:427:1: rule__AllocationViewType__Group_5__1__Impl : ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) ) ;
    public final void rule__AllocationViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:431:1: ( ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) ) )
            // InternalAllocationViewType.g:432:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) )
            {
            // InternalAllocationViewType.g:432:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) )
            // InternalAllocationViewType.g:433:2: ( rule__AllocationViewType__AllocationContextsAssignment_5_1 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_5_1()); 
            // InternalAllocationViewType.g:434:2: ( rule__AllocationViewType__AllocationContextsAssignment_5_1 )
            // InternalAllocationViewType.g:434:3: rule__AllocationViewType__AllocationContextsAssignment_5_1
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
    // InternalAllocationViewType.g:443:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:447:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalAllocationViewType.g:448:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAllocationViewType.g:455:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:459:1: ( ( 'AllocationContext' ) )
            // InternalAllocationViewType.g:460:1: ( 'AllocationContext' )
            {
            // InternalAllocationViewType.g:460:1: ( 'AllocationContext' )
            // InternalAllocationViewType.g:461:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAllocationViewType.g:470:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:474:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalAllocationViewType.g:475:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalAllocationViewType.g:482:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:486:1: ( ( '{' ) )
            // InternalAllocationViewType.g:487:1: ( '{' )
            {
            // InternalAllocationViewType.g:487:1: ( '{' )
            // InternalAllocationViewType.g:488:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAllocationViewType.g:497:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:501:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalAllocationViewType.g:502:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalAllocationViewType.g:509:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:513:1: ( ( 'container' ) )
            // InternalAllocationViewType.g:514:1: ( 'container' )
            {
            // InternalAllocationViewType.g:514:1: ( 'container' )
            // InternalAllocationViewType.g:515:2: 'container'
            {
             before(grammarAccess.getAllocationContextAccess().getContainerKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAllocationViewType.g:524:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:528:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalAllocationViewType.g:529:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalAllocationViewType.g:536:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:540:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalAllocationViewType.g:541:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalAllocationViewType.g:541:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalAllocationViewType.g:542:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalAllocationViewType.g:543:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalAllocationViewType.g:543:3: rule__AllocationContext__ContainerAssignment_3
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
    // InternalAllocationViewType.g:551:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:555:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalAllocationViewType.g:556:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalAllocationViewType.g:563:1: rule__AllocationContext__Group__4__Impl : ( 'assembly' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:567:1: ( ( 'assembly' ) )
            // InternalAllocationViewType.g:568:1: ( 'assembly' )
            {
            // InternalAllocationViewType.g:568:1: ( 'assembly' )
            // InternalAllocationViewType.g:569:2: 'assembly'
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAllocationViewType.g:578:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:582:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalAllocationViewType.g:583:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalAllocationViewType.g:590:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AssemblyAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:594:1: ( ( ( rule__AllocationContext__AssemblyAssignment_5 ) ) )
            // InternalAllocationViewType.g:595:1: ( ( rule__AllocationContext__AssemblyAssignment_5 ) )
            {
            // InternalAllocationViewType.g:595:1: ( ( rule__AllocationContext__AssemblyAssignment_5 ) )
            // InternalAllocationViewType.g:596:2: ( rule__AllocationContext__AssemblyAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssignment_5()); 
            // InternalAllocationViewType.g:597:2: ( rule__AllocationContext__AssemblyAssignment_5 )
            // InternalAllocationViewType.g:597:3: rule__AllocationContext__AssemblyAssignment_5
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
    // InternalAllocationViewType.g:605:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:609:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalAllocationViewType.g:610:2: rule__AllocationContext__Group__6__Impl
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
    // InternalAllocationViewType.g:616:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:620:1: ( ( '}' ) )
            // InternalAllocationViewType.g:621:1: ( '}' )
            {
            // InternalAllocationViewType.g:621:1: ( '}' )
            // InternalAllocationViewType.g:622:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalAllocationViewType.g:632:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:636:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAllocationViewType.g:637:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalAllocationViewType.g:644:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:648:1: ( ( RULE_ID ) )
            // InternalAllocationViewType.g:649:1: ( RULE_ID )
            {
            // InternalAllocationViewType.g:649:1: ( RULE_ID )
            // InternalAllocationViewType.g:650:2: RULE_ID
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
    // InternalAllocationViewType.g:659:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:663:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAllocationViewType.g:664:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAllocationViewType.g:670:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:674:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAllocationViewType.g:675:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAllocationViewType.g:675:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAllocationViewType.g:676:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAllocationViewType.g:677:2: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAllocationViewType.g:677:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalAllocationViewType.g:686:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:690:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAllocationViewType.g:691:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalAllocationViewType.g:698:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:702:1: ( ( '.' ) )
            // InternalAllocationViewType.g:703:1: ( '.' )
            {
            // InternalAllocationViewType.g:703:1: ( '.' )
            // InternalAllocationViewType.g:704:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAllocationViewType.g:713:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:717:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAllocationViewType.g:718:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAllocationViewType.g:724:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:728:1: ( ( RULE_ID ) )
            // InternalAllocationViewType.g:729:1: ( RULE_ID )
            {
            // InternalAllocationViewType.g:729:1: ( RULE_ID )
            // InternalAllocationViewType.g:730:2: RULE_ID
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


    // $ANTLR start "rule__AllocationViewType__AllocationContextsAssignment_4"
    // InternalAllocationViewType.g:740:1: rule__AllocationViewType__AllocationContextsAssignment_4 : ( ruleAllocationContext ) ;
    public final void rule__AllocationViewType__AllocationContextsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:744:1: ( ( ruleAllocationContext ) )
            // InternalAllocationViewType.g:745:2: ( ruleAllocationContext )
            {
            // InternalAllocationViewType.g:745:2: ( ruleAllocationContext )
            // InternalAllocationViewType.g:746:3: ruleAllocationContext
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
    // InternalAllocationViewType.g:755:1: rule__AllocationViewType__AllocationContextsAssignment_5_1 : ( ruleAllocationContext ) ;
    public final void rule__AllocationViewType__AllocationContextsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:759:1: ( ( ruleAllocationContext ) )
            // InternalAllocationViewType.g:760:2: ( ruleAllocationContext )
            {
            // InternalAllocationViewType.g:760:2: ( ruleAllocationContext )
            // InternalAllocationViewType.g:761:3: ruleAllocationContext
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
    // InternalAllocationViewType.g:770:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:774:1: ( ( ( ruleEString ) ) )
            // InternalAllocationViewType.g:775:2: ( ( ruleEString ) )
            {
            // InternalAllocationViewType.g:775:2: ( ( ruleEString ) )
            // InternalAllocationViewType.g:776:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalAllocationViewType.g:777:3: ( ruleEString )
            // InternalAllocationViewType.g:778:4: ruleEString
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
    // InternalAllocationViewType.g:789:1: rule__AllocationContext__AssemblyAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AllocationContext__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:793:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAllocationViewType.g:794:2: ( ( ruleQualifiedName ) )
            {
            // InternalAllocationViewType.g:794:2: ( ( ruleQualifiedName ) )
            // InternalAllocationViewType.g:795:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextCrossReference_5_0()); 
            // InternalAllocationViewType.g:796:3: ( ruleQualifiedName )
            // InternalAllocationViewType.g:797:4: ruleQualifiedName
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});

}