package org.xtext.mdsm.simplePalladio.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplepalladioLexer extends Lexer {
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

    public InternalSimplepalladioLexer() {;} 
    public InternalSimplepalladioLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSimplepalladioLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSimplepalladio.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:11:7: ( 'VOID' )
            // InternalSimplepalladio.g:11:9: 'VOID'
            {
            match("VOID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:12:7: ( 'BOOLEAN' )
            // InternalSimplepalladio.g:12:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:13:7: ( 'CHAR' )
            // InternalSimplepalladio.g:13:9: 'CHAR'
            {
            match("CHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:14:7: ( 'DATE' )
            // InternalSimplepalladio.g:14:9: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:15:7: ( 'DOUBLE' )
            // InternalSimplepalladio.g:15:9: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:16:7: ( 'FLOAT' )
            // InternalSimplepalladio.g:16:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:17:7: ( 'LIST' )
            // InternalSimplepalladio.g:17:9: 'LIST'
            {
            match("LIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:18:7: ( 'INT' )
            // InternalSimplepalladio.g:18:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:19:7: ( 'LONG' )
            // InternalSimplepalladio.g:19:9: 'LONG'
            {
            match("LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:20:7: ( 'MAP' )
            // InternalSimplepalladio.g:20:9: 'MAP'
            {
            match("MAP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:21:7: ( 'STRING' )
            // InternalSimplepalladio.g:21:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:22:7: ( '{' )
            // InternalSimplepalladio.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:23:7: ( '}' )
            // InternalSimplepalladio.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:24:7: ( 'RepositoryViewType' )
            // InternalSimplepalladio.g:24:9: 'RepositoryViewType'
            {
            match("RepositoryViewType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:25:7: ( 'repositoryElements' )
            // InternalSimplepalladio.g:25:9: 'repositoryElements'
            {
            match("repositoryElements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:26:7: ( ',' )
            // InternalSimplepalladio.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:27:7: ( 'Interface' )
            // InternalSimplepalladio.g:27:9: 'Interface'
            {
            match("Interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:28:7: ( 'signatures' )
            // InternalSimplepalladio.g:28:9: 'signatures'
            {
            match("signatures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:29:7: ( '(' )
            // InternalSimplepalladio.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:30:7: ( ')' )
            // InternalSimplepalladio.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:31:7: ( 'CompositeComponent' )
            // InternalSimplepalladio.g:31:9: 'CompositeComponent'
            {
            match("CompositeComponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:32:7: ( 'providedInterfaces' )
            // InternalSimplepalladio.g:32:9: 'providedInterfaces'
            {
            match("providedInterfaces"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:33:7: ( 'system' )
            // InternalSimplepalladio.g:33:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:34:7: ( 'requiredInterfaces' )
            // InternalSimplepalladio.g:34:9: 'requiredInterfaces'
            {
            match("requiredInterfaces"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:35:7: ( 'Signature' )
            // InternalSimplepalladio.g:35:9: 'Signature'
            {
            match("Signature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:36:7: ( 'returnValue' )
            // InternalSimplepalladio.g:36:9: 'returnValue'
            {
            match("returnValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:37:7: ( 'parameters' )
            // InternalSimplepalladio.g:37:9: 'parameters'
            {
            match("parameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:38:7: ( 'Component' )
            // InternalSimplepalladio.g:38:9: 'Component'
            {
            match("Component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:39:7: ( 'services' )
            // InternalSimplepalladio.g:39:9: 'services'
            {
            match("services"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:40:7: ( 'Parameter' )
            // InternalSimplepalladio.g:40:9: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:41:7: ( 'type' )
            // InternalSimplepalladio.g:41:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:42:7: ( 'Service' )
            // InternalSimplepalladio.g:42:9: 'Service'
            {
            match("Service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:43:7: ( 'signature' )
            // InternalSimplepalladio.g:43:9: 'signature'
            {
            match("signature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:44:7: ( 'behaviourDescription' )
            // InternalSimplepalladio.g:44:9: 'behaviourDescription'
            {
            match("behaviourDescription"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:45:7: ( 'BehaviourDescription' )
            // InternalSimplepalladio.g:45:9: 'BehaviourDescription'
            {
            match("BehaviourDescription"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:46:7: ( 'behaviorElements' )
            // InternalSimplepalladio.g:46:9: 'behaviorElements'
            {
            match("behaviorElements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:47:7: ( 'InternalAction' )
            // InternalSimplepalladio.g:47:9: 'InternalAction'
            {
            match("InternalAction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:48:7: ( 'ExternalCall' )
            // InternalSimplepalladio.g:48:9: 'ExternalCall'
            {
            match("ExternalCall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:49:7: ( 'Loop' )
            // InternalSimplepalladio.g:49:9: 'Loop'
            {
            match("Loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:50:7: ( 'Branch' )
            // InternalSimplepalladio.g:50:9: 'Branch'
            {
            match("Branch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:51:7: ( 'AssemblyViewType' )
            // InternalSimplepalladio.g:51:9: 'AssemblyViewType'
            {
            match("AssemblyViewType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:52:7: ( 'systems' )
            // InternalSimplepalladio.g:52:9: 'systems'
            {
            match("systems"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:53:7: ( 'System' )
            // InternalSimplepalladio.g:53:9: 'System'
            {
            match("System"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:54:7: ( 'systemElements' )
            // InternalSimplepalladio.g:54:9: 'systemElements'
            {
            match("systemElements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:55:7: ( 'AssemblyContext' )
            // InternalSimplepalladio.g:55:9: 'AssemblyContext'
            {
            match("AssemblyContext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:56:7: ( 'component' )
            // InternalSimplepalladio.g:56:9: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:57:7: ( 'providedRoles' )
            // InternalSimplepalladio.g:57:9: 'providedRoles'
            {
            match("providedRoles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:58:7: ( 'requiredRoles' )
            // InternalSimplepalladio.g:58:9: 'requiredRoles'
            {
            match("requiredRoles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:59:7: ( 'Role' )
            // InternalSimplepalladio.g:59:9: 'Role'
            {
            match("Role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:60:7: ( 'interface' )
            // InternalSimplepalladio.g:60:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:61:7: ( 'DelegationConnector' )
            // InternalSimplepalladio.g:61:9: 'DelegationConnector'
            {
            match("DelegationConnector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:62:7: ( 'role' )
            // InternalSimplepalladio.g:62:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:63:7: ( 'AssemblyConnector' )
            // InternalSimplepalladio.g:63:9: 'AssemblyConnector'
            {
            match("AssemblyConnector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:64:7: ( 'providedRole' )
            // InternalSimplepalladio.g:64:9: 'providedRole'
            {
            match("providedRole"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:65:7: ( 'requiredRole' )
            // InternalSimplepalladio.g:65:9: 'requiredRole'
            {
            match("requiredRole"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:66:7: ( 'EnvironmentViewType' )
            // InternalSimplepalladio.g:66:9: 'EnvironmentViewType'
            {
            match("EnvironmentViewType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:67:7: ( 'environmentElements' )
            // InternalSimplepalladio.g:67:9: 'environmentElements'
            {
            match("environmentElements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:68:7: ( 'Container' )
            // InternalSimplepalladio.g:68:9: 'Container'
            {
            match("Container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:69:7: ( 'Link' )
            // InternalSimplepalladio.g:69:9: 'Link'
            {
            match("Link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:70:7: ( 'containers' )
            // InternalSimplepalladio.g:70:9: 'containers'
            {
            match("containers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:71:7: ( 'AllocationViewType' )
            // InternalSimplepalladio.g:71:9: 'AllocationViewType'
            {
            match("AllocationViewType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:72:7: ( 'allocationContexts' )
            // InternalSimplepalladio.g:72:9: 'allocationContexts'
            {
            match("allocationContexts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:73:7: ( 'AllocationContext' )
            // InternalSimplepalladio.g:73:9: 'AllocationContext'
            {
            match("AllocationContext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:74:7: ( 'container' )
            // InternalSimplepalladio.g:74:9: 'container'
            {
            match("container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:75:7: ( 'assembly' )
            // InternalSimplepalladio.g:75:9: 'assembly'
            {
            match("assembly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:76:7: ( '.' )
            // InternalSimplepalladio.g:76:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:9508:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSimplepalladio.g:9508:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSimplepalladio.g:9508:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimplepalladio.g:9508:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSimplepalladio.g:9508:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimplepalladio.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:9510:10: ( ( '0' .. '9' )+ )
            // InternalSimplepalladio.g:9510:12: ( '0' .. '9' )+
            {
            // InternalSimplepalladio.g:9510:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimplepalladio.g:9510:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:9512:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSimplepalladio.g:9512:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSimplepalladio.g:9512:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimplepalladio.g:9512:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSimplepalladio.g:9512:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:9512:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimplepalladio.g:9512:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSimplepalladio.g:9512:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSimplepalladio.g:9512:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimplepalladio.g:9512:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSimplepalladio.g:9512:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:9514:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSimplepalladio.g:9514:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSimplepalladio.g:9514:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimplepalladio.g:9514:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:9516:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSimplepalladio.g:9516:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSimplepalladio.g:9516:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimplepalladio.g:9516:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSimplepalladio.g:9516:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimplepalladio.g:9516:41: ( '\\r' )? '\\n'
                    {
                    // InternalSimplepalladio.g:9516:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSimplepalladio.g:9516:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:9518:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSimplepalladio.g:9518:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSimplepalladio.g:9518:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSimplepalladio.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimplepalladio.g:9520:16: ( . )
            // InternalSimplepalladio.g:9520:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSimplepalladio.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=73;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSimplepalladio.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalSimplepalladio.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalSimplepalladio.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalSimplepalladio.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalSimplepalladio.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalSimplepalladio.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalSimplepalladio.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalSimplepalladio.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalSimplepalladio.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalSimplepalladio.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalSimplepalladio.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalSimplepalladio.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalSimplepalladio.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalSimplepalladio.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalSimplepalladio.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalSimplepalladio.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalSimplepalladio.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalSimplepalladio.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalSimplepalladio.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalSimplepalladio.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalSimplepalladio.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalSimplepalladio.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalSimplepalladio.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalSimplepalladio.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalSimplepalladio.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalSimplepalladio.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalSimplepalladio.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalSimplepalladio.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalSimplepalladio.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalSimplepalladio.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalSimplepalladio.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalSimplepalladio.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalSimplepalladio.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalSimplepalladio.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalSimplepalladio.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalSimplepalladio.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalSimplepalladio.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalSimplepalladio.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalSimplepalladio.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalSimplepalladio.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalSimplepalladio.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalSimplepalladio.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalSimplepalladio.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalSimplepalladio.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalSimplepalladio.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalSimplepalladio.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalSimplepalladio.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalSimplepalladio.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalSimplepalladio.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalSimplepalladio.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalSimplepalladio.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalSimplepalladio.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalSimplepalladio.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalSimplepalladio.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalSimplepalladio.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalSimplepalladio.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalSimplepalladio.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalSimplepalladio.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalSimplepalladio.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalSimplepalladio.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalSimplepalladio.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalSimplepalladio.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalSimplepalladio.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalSimplepalladio.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalSimplepalladio.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalSimplepalladio.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalSimplepalladio.g:1:406: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // InternalSimplepalladio.g:1:414: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // InternalSimplepalladio.g:1:423: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalSimplepalladio.g:1:435: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalSimplepalladio.g:1:451: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalSimplepalladio.g:1:467: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalSimplepalladio.g:1:475: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\46\2\uffff\2\46\1\uffff\1\46\2\uffff\12\46\1\uffff\1\44\2\uffff\3\44\2\uffff\1\46\1\uffff\24\46\2\uffff\4\46\1\uffff\3\46\2\uffff\16\46\6\uffff\17\46\1\u0098\1\46\1\u009a\34\46\1\u00b7\3\46\1\u00bb\2\46\1\u00be\3\46\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\uffff\1\46\1\uffff\5\46\1\u00cc\3\46\1\u00d0\6\46\1\u00d7\13\46\1\uffff\3\46\1\uffff\2\46\1\uffff\2\46\1\u00eb\4\uffff\6\46\1\uffff\3\46\1\uffff\6\46\1\uffff\15\46\1\u0109\3\46\1\u010d\1\46\1\uffff\2\46\1\u0111\2\46\1\u0114\5\46\1\u011c\17\46\1\u012c\1\46\1\uffff\3\46\1\uffff\3\46\1\uffff\1\46\1\u0135\1\uffff\5\46\1\u013b\1\46\1\uffff\17\46\1\uffff\10\46\1\uffff\5\46\1\uffff\1\46\1\u015c\16\46\1\u016d\2\46\1\u0170\1\u0171\1\46\1\u0173\1\46\1\u0175\5\46\1\u017c\1\46\1\uffff\3\46\1\u0181\7\46\1\u0189\1\u018b\1\u018c\2\46\1\uffff\2\46\2\uffff\1\46\1\uffff\1\46\1\uffff\5\46\1\u0198\1\uffff\3\46\1\u019c\1\uffff\7\46\1\uffff\1\u01a5\2\uffff\12\46\1\u01b0\1\uffff\3\46\1\uffff\10\46\1\uffff\11\46\1\u01c7\1\uffff\2\46\1\u01cb\2\46\1\u01ce\17\46\1\u01de\1\uffff\2\46\1\u01e1\1\uffff\2\46\1\uffff\13\46\1\u01ef\3\46\1\uffff\1\u01f3\1\46\1\uffff\15\46\1\uffff\3\46\1\uffff\5\46\1\u020a\15\46\1\u0218\1\46\1\u021a\1\uffff\15\46\1\uffff\1\46\1\uffff\1\u0229\1\46\1\u022b\3\46\1\u022f\1\46\1\u0231\1\u0232\1\u0233\1\u0234\2\46\1\uffff\1\u0237\1\uffff\1\46\1\u0239\1\46\1\uffff\1\u023b\4\uffff\1\46\1\u023d\1\uffff\1\u023e\1\uffff\1\u023f\1\uffff\1\u0240\4\uffff";
    static final String DFA12_eofS =
        "\u0241\uffff";
    static final String DFA12_minS =
        "\1\0\2\117\1\110\1\101\1\114\1\111\1\116\1\101\1\124\2\uffff\2\145\1\uffff\1\145\2\uffff\2\141\1\171\1\145\1\156\1\154\1\157\2\156\1\154\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\111\1\uffff\1\117\1\150\1\141\1\101\1\155\1\124\1\125\1\154\1\117\1\123\1\116\1\157\1\156\1\124\1\164\1\120\1\122\1\147\1\162\1\163\2\uffff\1\160\1\154\1\160\1\154\1\uffff\1\147\1\163\1\162\2\uffff\1\157\2\162\1\160\1\150\1\164\1\166\1\163\1\154\1\155\1\164\1\166\1\154\1\163\6\uffff\1\104\1\114\1\141\1\156\1\122\1\160\1\164\1\105\1\102\1\145\1\101\1\124\1\107\1\160\1\153\1\60\1\145\1\60\1\111\1\156\1\166\1\164\1\157\1\145\1\157\2\165\1\145\1\156\1\164\2\166\2\141\1\145\1\141\1\145\1\151\1\145\1\157\1\160\1\164\1\145\1\151\1\157\1\145\1\60\1\105\1\166\1\143\1\60\1\157\1\141\1\60\1\114\1\147\1\124\4\60\1\uffff\1\162\1\uffff\1\116\1\141\1\151\1\145\1\163\1\60\1\163\1\151\1\162\1\60\1\141\1\145\2\151\2\155\1\60\1\166\2\162\1\155\1\143\1\157\1\141\2\162\1\143\1\155\1\uffff\1\101\1\151\1\150\1\uffff\1\156\1\151\1\uffff\1\105\1\141\1\60\4\uffff\1\146\1\107\1\164\1\143\1\155\1\151\1\uffff\1\151\1\162\1\156\1\uffff\1\164\1\155\1\143\1\144\2\145\1\uffff\1\151\1\156\1\157\1\142\1\141\1\156\1\151\1\146\1\157\1\141\1\142\1\116\1\157\1\60\1\151\1\145\1\156\1\60\1\164\1\uffff\2\141\1\60\1\165\1\145\1\60\2\164\1\145\1\126\1\165\1\60\2\145\2\164\1\157\1\141\1\156\1\154\1\164\1\145\1\156\1\141\1\156\1\164\1\154\1\60\1\165\1\uffff\1\164\1\156\1\145\1\uffff\1\151\1\143\1\154\1\uffff\1\162\1\60\1\uffff\2\157\1\144\1\141\1\162\1\60\1\154\1\uffff\1\163\1\144\2\145\1\162\1\154\1\155\1\171\1\151\1\156\1\145\1\143\1\155\1\151\1\171\1\uffff\1\162\1\145\1\164\1\162\1\157\1\145\1\101\1\145\1\uffff\2\162\1\111\1\154\1\145\1\uffff\1\145\1\60\1\111\3\162\1\105\1\103\1\145\1\103\1\157\1\164\1\162\2\145\1\157\1\60\1\104\1\103\2\60\1\156\1\60\1\143\1\60\2\171\1\156\1\157\1\165\1\60\1\155\1\uffff\1\156\1\157\1\163\1\60\1\104\1\154\1\141\1\156\1\151\1\157\1\156\3\60\2\156\1\uffff\1\145\1\157\2\uffff\1\103\1\uffff\1\164\1\uffff\1\126\1\105\1\164\1\154\1\145\1\60\1\uffff\1\145\1\164\1\154\1\60\1\uffff\2\145\1\154\1\164\1\145\1\156\1\103\1\uffff\1\60\2\uffff\1\164\1\103\1\163\1\155\1\157\2\151\1\154\2\145\1\60\1\uffff\1\156\2\145\1\uffff\1\163\1\155\1\154\1\126\1\167\1\156\1\151\1\157\1\uffff\1\105\1\157\1\143\1\160\1\156\1\157\2\145\1\162\1\60\1\uffff\1\164\1\162\1\60\1\143\1\145\1\60\1\151\1\124\3\145\1\156\1\154\1\156\1\162\1\157\2\156\1\167\1\155\1\146\1\60\1\uffff\1\163\1\146\1\60\1\uffff\1\162\1\156\1\uffff\1\145\1\171\1\170\1\143\1\167\1\164\1\145\1\164\1\151\1\156\1\145\1\60\1\124\1\145\1\141\1\uffff\1\60\1\141\1\uffff\1\151\1\164\1\167\1\160\2\164\1\124\1\145\1\155\1\145\1\160\1\145\1\143\1\uffff\1\171\1\156\1\143\1\uffff\1\143\1\160\1\163\1\124\1\145\1\60\1\157\1\171\1\170\1\145\1\170\1\164\1\156\1\164\1\160\1\164\2\145\1\164\1\60\1\171\1\60\1\uffff\1\162\1\160\1\164\1\156\1\164\1\151\1\164\1\157\1\145\3\163\1\151\1\uffff\1\160\1\uffff\1\60\1\145\1\60\1\164\1\163\1\157\1\60\1\162\4\60\1\157\1\145\1\uffff\1\60\1\uffff\1\163\1\60\1\156\1\uffff\1\60\4\uffff\1\156\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\117\1\162\1\157\1\145\1\114\1\157\1\156\1\101\1\171\2\uffff\2\157\1\uffff\1\171\2\uffff\1\162\1\141\1\171\1\145\1\170\1\163\1\157\2\156\1\163\1\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\111\1\uffff\1\117\1\150\1\141\1\101\1\156\1\124\1\125\1\154\1\117\1\123\1\116\1\157\1\156\1\124\1\164\1\120\1\122\1\147\1\162\1\163\2\uffff\1\160\1\154\1\164\1\154\1\uffff\1\147\1\163\1\162\2\uffff\1\157\2\162\1\160\1\150\1\164\1\166\1\163\1\154\1\156\1\164\1\166\1\154\1\163\6\uffff\1\104\1\114\1\141\1\156\1\122\1\160\1\164\1\105\1\102\1\145\1\101\1\124\1\107\1\160\1\153\1\172\1\145\1\172\1\111\1\156\1\166\1\164\1\157\1\145\1\157\2\165\1\145\1\156\1\164\2\166\2\141\1\145\1\141\1\145\1\151\1\145\1\157\1\160\1\164\1\145\1\151\1\157\1\145\1\172\1\105\1\166\1\143\1\172\1\157\1\141\1\172\1\114\1\147\1\124\4\172\1\uffff\1\162\1\uffff\1\116\1\141\1\151\1\145\1\163\1\172\1\163\1\151\1\162\1\172\1\141\1\145\2\151\2\155\1\172\1\166\2\162\1\155\1\143\1\157\1\141\2\162\1\143\1\155\1\uffff\1\101\1\151\1\150\1\uffff\1\163\1\151\1\uffff\1\105\1\141\1\172\4\uffff\1\156\1\107\1\164\1\143\1\155\1\151\1\uffff\1\151\1\162\1\156\1\uffff\1\164\1\155\1\143\1\144\2\145\1\uffff\1\151\1\156\1\157\1\142\1\141\1\156\1\151\1\146\1\157\1\141\1\142\1\116\1\157\1\172\1\151\1\145\1\156\1\172\1\164\1\uffff\2\141\1\172\1\165\1\145\1\172\2\164\1\145\1\126\1\165\1\172\2\145\2\164\1\157\1\141\1\156\1\154\1\164\1\145\1\156\1\141\1\156\1\164\1\154\1\172\1\165\1\uffff\1\164\1\156\1\145\1\uffff\1\151\1\143\1\154\1\uffff\1\162\1\172\1\uffff\2\157\1\144\1\141\1\162\1\172\1\154\1\uffff\1\163\1\144\2\145\1\165\1\154\1\155\1\171\1\151\1\156\1\145\1\143\1\155\1\151\1\171\1\uffff\1\162\1\145\1\164\1\162\1\157\1\145\1\101\1\145\1\uffff\2\162\1\122\1\154\1\145\1\uffff\1\145\1\172\1\122\3\162\1\105\1\103\1\145\1\126\1\157\1\164\1\162\2\145\1\157\1\172\1\104\1\103\2\172\1\156\1\172\1\143\1\172\2\171\1\156\1\157\1\165\1\172\1\155\1\uffff\1\156\1\157\1\163\1\172\1\104\1\154\1\141\1\156\1\151\1\157\1\156\3\172\2\156\1\uffff\1\145\1\157\2\uffff\1\103\1\uffff\1\164\1\uffff\1\126\1\105\1\164\1\154\1\145\1\172\1\uffff\1\145\1\164\1\154\1\172\1\uffff\2\145\1\154\1\164\1\145\1\156\1\126\1\uffff\1\172\2\uffff\1\164\1\103\1\163\1\155\1\157\2\151\1\154\2\145\1\172\1\uffff\1\156\2\145\1\uffff\1\163\1\155\1\154\1\126\1\167\1\164\1\151\1\157\1\uffff\1\105\1\157\1\143\1\160\1\156\1\157\2\145\1\162\1\172\1\uffff\1\164\1\162\1\172\1\143\1\145\1\172\1\151\1\124\3\145\1\156\1\154\1\156\1\162\1\157\2\156\1\167\1\155\1\146\1\172\1\uffff\1\163\1\146\1\172\1\uffff\1\162\1\156\1\uffff\1\145\1\171\1\170\1\143\1\167\1\164\1\145\1\164\1\151\1\156\1\145\1\172\1\124\1\145\1\141\1\uffff\1\172\1\141\1\uffff\1\151\1\164\1\167\1\160\2\164\1\124\1\145\1\155\1\145\1\160\1\145\1\143\1\uffff\1\171\1\156\1\143\1\uffff\1\143\1\160\1\163\1\124\1\145\1\172\1\157\1\171\1\170\1\145\1\170\1\164\1\156\1\164\1\160\1\164\2\145\1\164\1\172\1\171\1\172\1\uffff\1\162\1\160\1\164\1\156\1\164\1\151\1\164\1\157\1\145\3\163\1\151\1\uffff\1\160\1\uffff\1\172\1\145\1\172\1\164\1\163\1\157\1\172\1\162\4\172\1\157\1\145\1\uffff\1\172\1\uffff\1\163\1\172\1\156\1\uffff\1\172\4\uffff\1\156\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\14\1\15\2\uffff\1\20\1\uffff\1\23\1\24\12\uffff\1\102\1\uffff\1\103\1\104\3\uffff\1\110\1\111\1\uffff\1\103\24\uffff\1\14\1\15\4\uffff\1\20\3\uffff\1\23\1\24\16\uffff\1\102\1\104\1\105\1\106\1\107\1\110\75\uffff\1\10\1\uffff\1\12\34\uffff\1\1\3\uffff\1\3\2\uffff\1\4\3\uffff\1\7\1\11\1\47\1\73\6\uffff\1\61\3\uffff\1\64\6\uffff\1\37\23\uffff\1\6\35\uffff\1\50\3\uffff\1\5\3\uffff\1\13\2\uffff\1\53\7\uffff\1\27\17\uffff\1\2\10\uffff\1\40\5\uffff\1\52\40\uffff\1\35\20\uffff\1\101\2\uffff\1\34\1\72\1\uffff\1\21\1\uffff\1\31\6\uffff\1\41\4\uffff\1\36\7\uffff\1\56\1\uffff\1\100\1\62\13\uffff\1\22\3\uffff\1\33\10\uffff\1\74\12\uffff\1\32\26\uffff\1\67\3\uffff\1\66\2\uffff\1\46\17\uffff\1\60\2\uffff\1\57\15\uffff\1\45\3\uffff\1\54\26\uffff\1\55\15\uffff\1\44\1\uffff\1\51\16\uffff\1\65\1\uffff\1\77\3\uffff\1\25\1\uffff\1\16\1\17\1\30\1\26\2\uffff\1\75\1\uffff\1\76\1\uffff\1\63\1\uffff\1\70\1\71\1\43\1\42";
    static final String DFA12_specialS =
        "\1\1\37\uffff\1\2\1\0\u021f\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\1\20\1\21\2\44\1\16\1\44\1\34\1\42\12\37\7\44\1\27\1\2\1\3\1\4\1\26\1\5\2\36\1\7\2\36\1\6\1\10\2\36\1\23\1\36\1\14\1\11\2\36\1\1\4\36\3\44\1\35\1\36\1\44\1\33\1\25\1\30\1\36\1\32\3\36\1\31\6\36\1\22\1\36\1\15\1\17\1\24\6\36\1\12\1\44\1\13\uff82\44",
            "\1\45",
            "\1\47\25\uffff\1\50\14\uffff\1\51",
            "\1\52\46\uffff\1\53",
            "\1\54\15\uffff\1\55\25\uffff\1\56",
            "\1\57",
            "\1\60\5\uffff\1\61\31\uffff\1\63\5\uffff\1\62",
            "\1\64\37\uffff\1\65",
            "\1\66",
            "\1\67\20\uffff\1\71\3\uffff\1\70\17\uffff\1\72",
            "",
            "",
            "\1\75\11\uffff\1\76",
            "\1\77\11\uffff\1\100",
            "",
            "\1\104\3\uffff\1\102\17\uffff\1\103",
            "",
            "",
            "\1\110\20\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\11\uffff\1\114",
            "\1\117\6\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\6\uffff\1\124",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\127",
            "\0\127",
            "\1\130\4\uffff\1\131",
            "",
            "",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163\1\164\2\uffff\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0099",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bc",
            "\1\u00bd",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e7\4\uffff\1\u00e6",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\1\u00ec\7\uffff\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0112",
            "\1\u0113",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\46\7\uffff\4\46\1\u011b\25\46\4\uffff\1\46\1\uffff\22\46\1\u011a\7\46",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0142\2\uffff\1\u0141",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157\10\uffff\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "\1\u015b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u015d\10\uffff\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0166\22\uffff\1\u0165",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u016e",
            "\1\u016f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0172",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0174",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u017b\7\46",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u018a\7\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u018d",
            "\1\u018e",
            "",
            "\1\u018f",
            "\1\u0190",
            "",
            "",
            "\1\u0191",
            "",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a4\22\uffff\1\u01a3",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01ba\5\uffff\1\u01b9",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u01c6\7\46",
            "",
            "\1\u01c8",
            "\1\u01c9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u01ca\7\46",
            "\1\u01cc",
            "\1\u01cd",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u01df",
            "\1\u01e0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01f4",
            "",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0219",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "",
            "\1\u0228",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u022a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0230",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0235",
            "\1\u0236",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0238",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u023a",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\1\u023c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFF')) ) {s = 87;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='V') ) {s = 1;}

                        else if ( (LA12_0=='B') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='D') ) {s = 4;}

                        else if ( (LA12_0=='F') ) {s = 5;}

                        else if ( (LA12_0=='L') ) {s = 6;}

                        else if ( (LA12_0=='I') ) {s = 7;}

                        else if ( (LA12_0=='M') ) {s = 8;}

                        else if ( (LA12_0=='S') ) {s = 9;}

                        else if ( (LA12_0=='{') ) {s = 10;}

                        else if ( (LA12_0=='}') ) {s = 11;}

                        else if ( (LA12_0=='R') ) {s = 12;}

                        else if ( (LA12_0=='r') ) {s = 13;}

                        else if ( (LA12_0==',') ) {s = 14;}

                        else if ( (LA12_0=='s') ) {s = 15;}

                        else if ( (LA12_0=='(') ) {s = 16;}

                        else if ( (LA12_0==')') ) {s = 17;}

                        else if ( (LA12_0=='p') ) {s = 18;}

                        else if ( (LA12_0=='P') ) {s = 19;}

                        else if ( (LA12_0=='t') ) {s = 20;}

                        else if ( (LA12_0=='b') ) {s = 21;}

                        else if ( (LA12_0=='E') ) {s = 22;}

                        else if ( (LA12_0=='A') ) {s = 23;}

                        else if ( (LA12_0=='c') ) {s = 24;}

                        else if ( (LA12_0=='i') ) {s = 25;}

                        else if ( (LA12_0=='e') ) {s = 26;}

                        else if ( (LA12_0=='a') ) {s = 27;}

                        else if ( (LA12_0=='.') ) {s = 28;}

                        else if ( (LA12_0=='^') ) {s = 29;}

                        else if ( ((LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='N' && LA12_0<='O')||LA12_0=='Q'||(LA12_0>='T' && LA12_0<='U')||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='d'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {s = 30;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 31;}

                        else if ( (LA12_0=='\"') ) {s = 32;}

                        else if ( (LA12_0=='\'') ) {s = 33;}

                        else if ( (LA12_0=='/') ) {s = 34;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 35;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 87;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}