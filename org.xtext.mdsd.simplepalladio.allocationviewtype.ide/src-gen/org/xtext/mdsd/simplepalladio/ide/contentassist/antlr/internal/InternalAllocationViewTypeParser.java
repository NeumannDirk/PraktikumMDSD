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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllocationViewType'", "'{'", "'allocationContexts'", "'}'", "','", "'AllocationContext'", "'container'", "'assembly'"
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAllocationViewType.g:127:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:131:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAllocationViewType.g:132:2: ( RULE_STRING )
                    {
                    // InternalAllocationViewType.g:132:2: ( RULE_STRING )
                    // InternalAllocationViewType.g:133:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocationViewType.g:138:2: ( RULE_ID )
                    {
                    // InternalAllocationViewType.g:138:2: ( RULE_ID )
                    // InternalAllocationViewType.g:139:3: RULE_ID
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
    // InternalAllocationViewType.g:148:1: rule__AllocationViewType__Group__0 : rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1 ;
    public final void rule__AllocationViewType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:152:1: ( rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1 )
            // InternalAllocationViewType.g:153:2: rule__AllocationViewType__Group__0__Impl rule__AllocationViewType__Group__1
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
    // InternalAllocationViewType.g:160:1: rule__AllocationViewType__Group__0__Impl : ( 'AllocationViewType' ) ;
    public final void rule__AllocationViewType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:164:1: ( ( 'AllocationViewType' ) )
            // InternalAllocationViewType.g:165:1: ( 'AllocationViewType' )
            {
            // InternalAllocationViewType.g:165:1: ( 'AllocationViewType' )
            // InternalAllocationViewType.g:166:2: 'AllocationViewType'
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
    // InternalAllocationViewType.g:175:1: rule__AllocationViewType__Group__1 : rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2 ;
    public final void rule__AllocationViewType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:179:1: ( rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2 )
            // InternalAllocationViewType.g:180:2: rule__AllocationViewType__Group__1__Impl rule__AllocationViewType__Group__2
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
    // InternalAllocationViewType.g:187:1: rule__AllocationViewType__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationViewType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:191:1: ( ( '{' ) )
            // InternalAllocationViewType.g:192:1: ( '{' )
            {
            // InternalAllocationViewType.g:192:1: ( '{' )
            // InternalAllocationViewType.g:193:2: '{'
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
    // InternalAllocationViewType.g:202:1: rule__AllocationViewType__Group__2 : rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3 ;
    public final void rule__AllocationViewType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:206:1: ( rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3 )
            // InternalAllocationViewType.g:207:2: rule__AllocationViewType__Group__2__Impl rule__AllocationViewType__Group__3
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
    // InternalAllocationViewType.g:214:1: rule__AllocationViewType__Group__2__Impl : ( 'allocationContexts' ) ;
    public final void rule__AllocationViewType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:218:1: ( ( 'allocationContexts' ) )
            // InternalAllocationViewType.g:219:1: ( 'allocationContexts' )
            {
            // InternalAllocationViewType.g:219:1: ( 'allocationContexts' )
            // InternalAllocationViewType.g:220:2: 'allocationContexts'
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
    // InternalAllocationViewType.g:229:1: rule__AllocationViewType__Group__3 : rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4 ;
    public final void rule__AllocationViewType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:233:1: ( rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4 )
            // InternalAllocationViewType.g:234:2: rule__AllocationViewType__Group__3__Impl rule__AllocationViewType__Group__4
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
    // InternalAllocationViewType.g:241:1: rule__AllocationViewType__Group__3__Impl : ( '{' ) ;
    public final void rule__AllocationViewType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:245:1: ( ( '{' ) )
            // InternalAllocationViewType.g:246:1: ( '{' )
            {
            // InternalAllocationViewType.g:246:1: ( '{' )
            // InternalAllocationViewType.g:247:2: '{'
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
    // InternalAllocationViewType.g:256:1: rule__AllocationViewType__Group__4 : rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5 ;
    public final void rule__AllocationViewType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:260:1: ( rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5 )
            // InternalAllocationViewType.g:261:2: rule__AllocationViewType__Group__4__Impl rule__AllocationViewType__Group__5
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
    // InternalAllocationViewType.g:268:1: rule__AllocationViewType__Group__4__Impl : ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) ) ;
    public final void rule__AllocationViewType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:272:1: ( ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) ) )
            // InternalAllocationViewType.g:273:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) )
            {
            // InternalAllocationViewType.g:273:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_4 ) )
            // InternalAllocationViewType.g:274:2: ( rule__AllocationViewType__AllocationContextsAssignment_4 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_4()); 
            // InternalAllocationViewType.g:275:2: ( rule__AllocationViewType__AllocationContextsAssignment_4 )
            // InternalAllocationViewType.g:275:3: rule__AllocationViewType__AllocationContextsAssignment_4
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
    // InternalAllocationViewType.g:283:1: rule__AllocationViewType__Group__5 : rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6 ;
    public final void rule__AllocationViewType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:287:1: ( rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6 )
            // InternalAllocationViewType.g:288:2: rule__AllocationViewType__Group__5__Impl rule__AllocationViewType__Group__6
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
    // InternalAllocationViewType.g:295:1: rule__AllocationViewType__Group__5__Impl : ( ( rule__AllocationViewType__Group_5__0 )* ) ;
    public final void rule__AllocationViewType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:299:1: ( ( ( rule__AllocationViewType__Group_5__0 )* ) )
            // InternalAllocationViewType.g:300:1: ( ( rule__AllocationViewType__Group_5__0 )* )
            {
            // InternalAllocationViewType.g:300:1: ( ( rule__AllocationViewType__Group_5__0 )* )
            // InternalAllocationViewType.g:301:2: ( rule__AllocationViewType__Group_5__0 )*
            {
             before(grammarAccess.getAllocationViewTypeAccess().getGroup_5()); 
            // InternalAllocationViewType.g:302:2: ( rule__AllocationViewType__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAllocationViewType.g:302:3: rule__AllocationViewType__Group_5__0
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
    // InternalAllocationViewType.g:310:1: rule__AllocationViewType__Group__6 : rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7 ;
    public final void rule__AllocationViewType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:314:1: ( rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7 )
            // InternalAllocationViewType.g:315:2: rule__AllocationViewType__Group__6__Impl rule__AllocationViewType__Group__7
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
    // InternalAllocationViewType.g:322:1: rule__AllocationViewType__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationViewType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:326:1: ( ( '}' ) )
            // InternalAllocationViewType.g:327:1: ( '}' )
            {
            // InternalAllocationViewType.g:327:1: ( '}' )
            // InternalAllocationViewType.g:328:2: '}'
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
    // InternalAllocationViewType.g:337:1: rule__AllocationViewType__Group__7 : rule__AllocationViewType__Group__7__Impl ;
    public final void rule__AllocationViewType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:341:1: ( rule__AllocationViewType__Group__7__Impl )
            // InternalAllocationViewType.g:342:2: rule__AllocationViewType__Group__7__Impl
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
    // InternalAllocationViewType.g:348:1: rule__AllocationViewType__Group__7__Impl : ( '}' ) ;
    public final void rule__AllocationViewType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:352:1: ( ( '}' ) )
            // InternalAllocationViewType.g:353:1: ( '}' )
            {
            // InternalAllocationViewType.g:353:1: ( '}' )
            // InternalAllocationViewType.g:354:2: '}'
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
    // InternalAllocationViewType.g:364:1: rule__AllocationViewType__Group_5__0 : rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1 ;
    public final void rule__AllocationViewType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:368:1: ( rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1 )
            // InternalAllocationViewType.g:369:2: rule__AllocationViewType__Group_5__0__Impl rule__AllocationViewType__Group_5__1
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
    // InternalAllocationViewType.g:376:1: rule__AllocationViewType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__AllocationViewType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:380:1: ( ( ',' ) )
            // InternalAllocationViewType.g:381:1: ( ',' )
            {
            // InternalAllocationViewType.g:381:1: ( ',' )
            // InternalAllocationViewType.g:382:2: ','
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
    // InternalAllocationViewType.g:391:1: rule__AllocationViewType__Group_5__1 : rule__AllocationViewType__Group_5__1__Impl ;
    public final void rule__AllocationViewType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:395:1: ( rule__AllocationViewType__Group_5__1__Impl )
            // InternalAllocationViewType.g:396:2: rule__AllocationViewType__Group_5__1__Impl
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
    // InternalAllocationViewType.g:402:1: rule__AllocationViewType__Group_5__1__Impl : ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) ) ;
    public final void rule__AllocationViewType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:406:1: ( ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) ) )
            // InternalAllocationViewType.g:407:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) )
            {
            // InternalAllocationViewType.g:407:1: ( ( rule__AllocationViewType__AllocationContextsAssignment_5_1 ) )
            // InternalAllocationViewType.g:408:2: ( rule__AllocationViewType__AllocationContextsAssignment_5_1 )
            {
             before(grammarAccess.getAllocationViewTypeAccess().getAllocationContextsAssignment_5_1()); 
            // InternalAllocationViewType.g:409:2: ( rule__AllocationViewType__AllocationContextsAssignment_5_1 )
            // InternalAllocationViewType.g:409:3: rule__AllocationViewType__AllocationContextsAssignment_5_1
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
    // InternalAllocationViewType.g:418:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:422:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalAllocationViewType.g:423:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
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
    // InternalAllocationViewType.g:430:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:434:1: ( ( 'AllocationContext' ) )
            // InternalAllocationViewType.g:435:1: ( 'AllocationContext' )
            {
            // InternalAllocationViewType.g:435:1: ( 'AllocationContext' )
            // InternalAllocationViewType.g:436:2: 'AllocationContext'
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
    // InternalAllocationViewType.g:445:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:449:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalAllocationViewType.g:450:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
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
    // InternalAllocationViewType.g:457:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:461:1: ( ( '{' ) )
            // InternalAllocationViewType.g:462:1: ( '{' )
            {
            // InternalAllocationViewType.g:462:1: ( '{' )
            // InternalAllocationViewType.g:463:2: '{'
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
    // InternalAllocationViewType.g:472:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:476:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalAllocationViewType.g:477:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
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
    // InternalAllocationViewType.g:484:1: rule__AllocationContext__Group__2__Impl : ( 'container' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:488:1: ( ( 'container' ) )
            // InternalAllocationViewType.g:489:1: ( 'container' )
            {
            // InternalAllocationViewType.g:489:1: ( 'container' )
            // InternalAllocationViewType.g:490:2: 'container'
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
    // InternalAllocationViewType.g:499:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:503:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalAllocationViewType.g:504:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
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
    // InternalAllocationViewType.g:511:1: rule__AllocationContext__Group__3__Impl : ( ( rule__AllocationContext__ContainerAssignment_3 ) ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:515:1: ( ( ( rule__AllocationContext__ContainerAssignment_3 ) ) )
            // InternalAllocationViewType.g:516:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            {
            // InternalAllocationViewType.g:516:1: ( ( rule__AllocationContext__ContainerAssignment_3 ) )
            // InternalAllocationViewType.g:517:2: ( rule__AllocationContext__ContainerAssignment_3 )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerAssignment_3()); 
            // InternalAllocationViewType.g:518:2: ( rule__AllocationContext__ContainerAssignment_3 )
            // InternalAllocationViewType.g:518:3: rule__AllocationContext__ContainerAssignment_3
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
    // InternalAllocationViewType.g:526:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:530:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalAllocationViewType.g:531:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalAllocationViewType.g:538:1: rule__AllocationContext__Group__4__Impl : ( 'assembly' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:542:1: ( ( 'assembly' ) )
            // InternalAllocationViewType.g:543:1: ( 'assembly' )
            {
            // InternalAllocationViewType.g:543:1: ( 'assembly' )
            // InternalAllocationViewType.g:544:2: 'assembly'
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
    // InternalAllocationViewType.g:553:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:557:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalAllocationViewType.g:558:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
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
    // InternalAllocationViewType.g:565:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AssemblyAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:569:1: ( ( ( rule__AllocationContext__AssemblyAssignment_5 ) ) )
            // InternalAllocationViewType.g:570:1: ( ( rule__AllocationContext__AssemblyAssignment_5 ) )
            {
            // InternalAllocationViewType.g:570:1: ( ( rule__AllocationContext__AssemblyAssignment_5 ) )
            // InternalAllocationViewType.g:571:2: ( rule__AllocationContext__AssemblyAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssignment_5()); 
            // InternalAllocationViewType.g:572:2: ( rule__AllocationContext__AssemblyAssignment_5 )
            // InternalAllocationViewType.g:572:3: rule__AllocationContext__AssemblyAssignment_5
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
    // InternalAllocationViewType.g:580:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:584:1: ( rule__AllocationContext__Group__6__Impl )
            // InternalAllocationViewType.g:585:2: rule__AllocationContext__Group__6__Impl
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
    // InternalAllocationViewType.g:591:1: rule__AllocationContext__Group__6__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:595:1: ( ( '}' ) )
            // InternalAllocationViewType.g:596:1: ( '}' )
            {
            // InternalAllocationViewType.g:596:1: ( '}' )
            // InternalAllocationViewType.g:597:2: '}'
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


    // $ANTLR start "rule__AllocationViewType__AllocationContextsAssignment_4"
    // InternalAllocationViewType.g:607:1: rule__AllocationViewType__AllocationContextsAssignment_4 : ( ruleAllocationContext ) ;
    public final void rule__AllocationViewType__AllocationContextsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:611:1: ( ( ruleAllocationContext ) )
            // InternalAllocationViewType.g:612:2: ( ruleAllocationContext )
            {
            // InternalAllocationViewType.g:612:2: ( ruleAllocationContext )
            // InternalAllocationViewType.g:613:3: ruleAllocationContext
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
    // InternalAllocationViewType.g:622:1: rule__AllocationViewType__AllocationContextsAssignment_5_1 : ( ruleAllocationContext ) ;
    public final void rule__AllocationViewType__AllocationContextsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:626:1: ( ( ruleAllocationContext ) )
            // InternalAllocationViewType.g:627:2: ( ruleAllocationContext )
            {
            // InternalAllocationViewType.g:627:2: ( ruleAllocationContext )
            // InternalAllocationViewType.g:628:3: ruleAllocationContext
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
    // InternalAllocationViewType.g:637:1: rule__AllocationContext__ContainerAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:641:1: ( ( ( ruleEString ) ) )
            // InternalAllocationViewType.g:642:2: ( ( ruleEString ) )
            {
            // InternalAllocationViewType.g:642:2: ( ( ruleEString ) )
            // InternalAllocationViewType.g:643:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0()); 
            // InternalAllocationViewType.g:644:3: ( ruleEString )
            // InternalAllocationViewType.g:645:4: ruleEString
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
    // InternalAllocationViewType.g:656:1: rule__AllocationContext__AssemblyAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AssemblyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAllocationViewType.g:660:1: ( ( ( ruleEString ) ) )
            // InternalAllocationViewType.g:661:2: ( ( ruleEString ) )
            {
            // InternalAllocationViewType.g:661:2: ( ( ruleEString ) )
            // InternalAllocationViewType.g:662:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextCrossReference_5_0()); 
            // InternalAllocationViewType.g:663:3: ( ruleEString )
            // InternalAllocationViewType.g:664:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAssemblyAssemblyContextEStringParserRuleCall_5_0_1()); 

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

}