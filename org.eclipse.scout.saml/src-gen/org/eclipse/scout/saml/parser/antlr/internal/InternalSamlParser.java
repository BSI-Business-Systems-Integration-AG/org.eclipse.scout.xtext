package org.eclipse.scout.saml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.scout.saml.services.SamlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSamlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "'code'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalSamlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSamlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSamlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g"; }



     	private SamlGrammarAccess grammarAccess;
     	
        public InternalSamlParser(TokenStream input, SamlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SamlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleJavaElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleJavaElement ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleJavaElement ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleJavaElement ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleJavaElement ) )*
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:98:3: ( (lv_elements_1_0= ruleJavaElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:99:1: (lv_elements_1_0= ruleJavaElement )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:99:1: (lv_elements_1_0= ruleJavaElement )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:100:3: lv_elements_1_0= ruleJavaElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getElementsJavaElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJavaElement_in_ruleModel153);
            	    lv_elements_1_0=ruleJavaElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"JavaElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:167:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:168:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:169:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard295);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:176:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard353);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:191:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:192:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleJavaElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:211:1: entryRuleJavaElement returns [EObject current=null] : iv_ruleJavaElement= ruleJavaElement EOF ;
    public final EObject entryRuleJavaElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:212:2: (iv_ruleJavaElement= ruleJavaElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:213:2: iv_ruleJavaElement= ruleJavaElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJavaElementRule()); 
            }
            pushFollow(FOLLOW_ruleJavaElement_in_entryRuleJavaElement427);
            iv_ruleJavaElement=ruleJavaElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJavaElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaElement437); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJavaElement"


    // $ANTLR start "ruleJavaElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:220:1: ruleJavaElement returns [EObject current=null] : (otherlv_0= 'code' ( (lv_name_1_0= RULE_ID ) ) ( (lv_source_2_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleJavaElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_source_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:223:28: ( (otherlv_0= 'code' ( (lv_name_1_0= RULE_ID ) ) ( (lv_source_2_0= ruleXBlockExpression ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:224:1: (otherlv_0= 'code' ( (lv_name_1_0= RULE_ID ) ) ( (lv_source_2_0= ruleXBlockExpression ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:224:1: (otherlv_0= 'code' ( (lv_name_1_0= RULE_ID ) ) ( (lv_source_2_0= ruleXBlockExpression ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:224:3: otherlv_0= 'code' ( (lv_name_1_0= RULE_ID ) ) ( (lv_source_2_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleJavaElement474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJavaElementAccess().getCodeKeyword_0());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:228:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:229:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:229:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:230:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaElement491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJavaElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:246:2: ( (lv_source_2_0= ruleXBlockExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:247:1: (lv_source_2_0= ruleXBlockExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:247:1: (lv_source_2_0= ruleXBlockExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:248:3: lv_source_2_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJavaElementAccess().getSourceXBlockExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleJavaElement517);
            lv_source_2_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJavaElementRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_2_0, 
                      		"XBlockExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJavaElement"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:272:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:273:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:274:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression553);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression563); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:281:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:284:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:286:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression609);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:302:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:303:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:304:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment643);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:311:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:314:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:315:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:315:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1>=RULE_ID && LA5_1<=RULE_DECIMAL)||(LA5_1>=14 && LA5_1<=15)||(LA5_1>=18 && LA5_1<=46)||(LA5_1>=48 && LA5_1<=74)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_DECIMAL)||LA5_0==27||(LA5_0>=34 && LA5_0<=35)||LA5_0==39||LA5_0==44||LA5_0==46||LA5_0==50||LA5_0==52||LA5_0==54||(LA5_0>=58 && LA5_0<=60)||LA5_0==63||(LA5_0>=65 && LA5_0<=72)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:315:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:315:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:315:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:315:3: ()
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:316:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:321:2: ( ( ruleValidID ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:322:1: ( ruleValidID )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:322:1: ( ruleValidID )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:323:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment711);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment727);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:344:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:345:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:345:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:346:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment747);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:363:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:363:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:364:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment777);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred1_InternalSaml()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:377:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:377:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:377:7: ()
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:378:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:383:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:384:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:384:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:385:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment830);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:398:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:399:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:399:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:400:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment853);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:424:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:425:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:426:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign893);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign904); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:433:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:436:28: (kw= '=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:438:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:451:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:452:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:453:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign981);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign992); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:460:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:463:28: (kw= '+=' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:465:2: kw= '+='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMultiAssign1029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:478:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:479:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:480:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1068);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1078); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:487:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:490:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:491:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:491:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:492:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1125);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred2_InternalSaml()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:505:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:505:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:505:7: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:506:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:511:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:512:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:512:1: ( ruleOpOr )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:513:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1178);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:526:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:527:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:527:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:528:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1201);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:552:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:553:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:554:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1240);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1251); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:561:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:564:28: (kw= '||' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:566:2: kw= '||'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpOr1288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:579:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:580:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:581:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1327);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1337); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:588:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:591:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:592:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:592:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:593:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1384);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalSaml()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:606:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:606:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:606:7: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:607:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:612:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:613:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:613:1: ( ruleOpAnd )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:614:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1437);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:627:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:628:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:628:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:629:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1460);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:653:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:654:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:655:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1499);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1510); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:662:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:665:28: (kw= '&&' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:667:2: kw= '&&'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpAnd1547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:680:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:681:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:682:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1586);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1596); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:689:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:692:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:693:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:693:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:694:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1643);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalSaml()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==22) ) {
                    int LA8_3 = input.LA(2);

                    if ( (synpred4_InternalSaml()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:707:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:707:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:707:7: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:708:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:713:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:714:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:714:1: ( ruleOpEquality )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:715:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1696);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:728:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:729:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:729:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:730:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1719);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:754:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:755:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:756:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1758);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1769); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:763:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:766:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:767:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:767:1: (kw= '==' | kw= '!=' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:768:2: kw= '=='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:775:2: kw= '!='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:788:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:789:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:790:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1866);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1876); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:797:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:800:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:801:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:801:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:802:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1923);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred6_InternalSaml()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_InternalSaml()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred5_InternalSaml()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_InternalSaml()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred6_InternalSaml()) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:812:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:812:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:812:6: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:813:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXRelationalExpression1959); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:822:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:823:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:823:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:824:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1982);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:846:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:846:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:846:7: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:847:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:852:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:853:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:853:1: ( ruleOpCompare )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:854:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2043);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:867:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:868:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:868:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:869:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2066);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:893:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:894:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:895:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2106);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2117); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:902:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:905:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:906:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:906:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:907:2: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:914:2: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:921:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:928:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:941:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:942:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:943:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2252);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2262); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:950:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:953:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:954:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:954:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:955:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2309);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:968:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:968:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:968:7: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:969:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:974:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:975:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:975:1: ( ruleOpOther )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:976:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2362);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:989:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:990:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:990:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:991:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2385);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1015:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1016:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1017:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2424);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2435); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1024:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1027:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1028:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1028:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 26:
                {
                alt15=4;
                }
                break;
            case 27:
                {
                alt15=5;
                }
                break;
            case 31:
                {
                alt15=6;
                }
                break;
            case 32:
                {
                alt15=7;
                }
                break;
            case 33:
                {
                alt15=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1029:2: kw= '->'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1036:2: kw= '..'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1043:2: kw= '=>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1049:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1049:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1050:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1055:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==26) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==26) && (synpred8_InternalSaml())) {
                            alt13=1;
                        }
                        else if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_DECIMAL)||LA13_1==27||(LA13_1>=34 && LA13_1<=35)||LA13_1==39||LA13_1==44||LA13_1==46||LA13_1==50||LA13_1==52||LA13_1==54||(LA13_1>=58 && LA13_1<=60)||LA13_1==63||(LA13_1>=65 && LA13_1<=72)) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1055:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1055:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1055:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1059:5: (kw= '>' kw= '>' )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1060:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2562); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2575); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1073:2: kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2596); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1079:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1079:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1080:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1085:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred9_InternalSaml()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1085:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1085:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1085:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1089:5: (kw= '<' kw= '<' )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1090:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2649); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2662); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1103:2: kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2683); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1110:2: kw= '<>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1117:2: kw= '?:'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1124:2: kw= '<=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1137:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1138:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1139:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2782);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2792); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1146:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1149:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1150:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1150:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1151:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2839);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred10_InternalSaml()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==35) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred10_InternalSaml()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1164:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1164:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1164:7: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1165:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1170:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1171:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1171:1: ( ruleOpAdd )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1172:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2892);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1185:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1186:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1186:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1187:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2915);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1211:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1212:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1213:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2954);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2965); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1220:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1223:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1224:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1224:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1225:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd3003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1232:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1245:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1246:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1247:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3062);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3072); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1254:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1257:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1258:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1258:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1259:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3119);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred11_InternalSaml()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred11_InternalSaml()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred11_InternalSaml()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred11_InternalSaml()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1272:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1272:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1272:7: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1273:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1278:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1279:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1279:1: ( ruleOpMulti )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1280:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3172);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1293:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1294:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1294:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1295:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3195);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1319:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1320:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1321:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3234);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3245); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1328:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1331:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1332:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1332:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            case 38:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1333:2: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMulti3283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1340:2: kw= '**'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1347:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1354:2: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1367:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1368:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1369:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3380);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3390); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1376:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1379:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1380:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1380:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=34 && LA20_0<=35)||LA20_0==39) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_DECIMAL)||LA20_0==27||LA20_0==44||LA20_0==46||LA20_0==50||LA20_0==52||LA20_0==54||(LA20_0>=58 && LA20_0<=60)||LA20_0==63||(LA20_0>=65 && LA20_0<=72)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1380:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1380:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1380:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1380:3: ()
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1381:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1386:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1387:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1387:1: ( ruleOpUnary )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1388:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3448);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1401:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1402:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1402:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1403:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3469);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1421:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3498);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1437:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1438:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1439:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3534);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3545); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1446:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1449:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1450:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1450:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 34:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1451:2: kw= '!'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary3583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1458:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1465:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1478:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1479:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1480:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3661);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3671); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1487:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1490:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1491:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1491:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1492:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3718);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred12_InternalSaml()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1502:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1502:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1502:6: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1503:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXCastedExpression3753); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1512:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1513:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1513:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1514:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3776);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1538:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1539:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1540:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3814);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3824); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1547:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1550:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1551:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1551:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1552:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3871);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred13_InternalSaml()) ) {
                        alt30=1;
                    }
                    else if ( (synpred14_InternalSaml()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred14_InternalSaml()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred14_InternalSaml()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1566:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1566:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1566:26: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1567:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall3920); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1576:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1577:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1577:1: ( ruleValidID )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1578:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3943);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3959);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1599:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1600:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1600:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1601:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3981);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1634:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1634:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1634:8: ()
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1635:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1640:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 14:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1640:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4067); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1645:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1645:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1646:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1646:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1647:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4091); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1661:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1661:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1662:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1662:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1663:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4128); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1676:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==27) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1676:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4157); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1680:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1681:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1681:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1682:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4178);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1698:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==43) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1698:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4191); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1702:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1703:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1703:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1704:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4212);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4226); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1724:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1725:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1725:1: ( ruleValidID )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1726:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4251);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1739:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1739:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1739:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1739:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1746:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1747:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4285); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1777:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1778:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4370);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1795:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1795:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1795:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1795:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1796:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1796:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1797:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4398);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1813:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==43) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1813:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4411); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1817:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1818:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1818:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1819:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4432);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4449); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1839:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1839:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1842:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1843:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4484);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1867:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1868:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1869:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4524);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1876:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1879:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1880:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1880:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt31=13;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1881:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4581);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1891:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4608);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1901:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4635);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1911:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4662);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1921:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4689);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1931:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4716);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1941:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4743);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1951:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4770);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1961:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4797);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1971:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4824);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1981:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4851);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1991:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4878);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2001:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4905);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2017:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2018:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2019:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4940);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4950); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2026:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2029:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) && (synpred18_InternalSaml())) {
                alt32=1;
            }
            else if ( ((LA32_0>=66 && LA32_0<=67)) ) {
                alt32=2;
            }
            else if ( ((LA32_0>=RULE_HEX && LA32_0<=RULE_DECIMAL)) ) {
                alt32=3;
            }
            else if ( (LA32_0==68) ) {
                alt32=4;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=5;
            }
            else if ( (LA32_0==69) ) {
                alt32=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5010);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2043:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5038);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2053:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5065);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2063:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5092);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2073:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5119);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2083:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5146);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2099:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2100:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2101:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5181);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5191); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2108:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2111:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2112:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2112:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2112:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2112:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2112:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2114:5: ( () otherlv_1= '[' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2114:6: () otherlv_1= '['
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2114:6: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2115:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2139:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2139:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2139:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==30||LA34_0==44) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2139:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2139:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2140:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2140:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2141:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5324);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2157:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==43) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2157:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5337); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2161:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2162:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2162:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2163:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5358);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2179:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2180:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2180:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2181:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2194:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2195:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2195:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2196:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5417);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2224:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2225:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2226:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5465);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5475); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2233:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2236:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2237:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2237:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2237:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2237:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2238:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2243:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_DECIMAL)||LA37_0==27||(LA37_0>=34 && LA37_0<=35)||LA37_0==39||LA37_0==44||LA37_0==46||LA37_0==50||LA37_0==52||LA37_0==54||(LA37_0>=58 && LA37_0<=63)||(LA37_0>=65 && LA37_0<=72)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2243:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2243:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2244:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2244:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2245:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5531);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2261:2: (otherlv_2= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==49) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2261:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXExpressionInClosure5544); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2273:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2274:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2275:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5584);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5594); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2282:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2285:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2286:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2286:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2286:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2286:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2286:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2302:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2302:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2302:7: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2303:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2308:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==30||LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2308:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2308:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2309:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2309:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2310:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5702);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2326:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==43) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2326:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5715); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2330:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2331:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2331:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2332:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5736);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2348:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2349:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2349:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2350:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure5758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2363:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2364:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2364:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2365:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5794);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2389:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2390:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2391:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5830);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5840); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2398:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2401:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2402:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2402:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2402:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5899);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression5910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2427:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2428:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2429:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5946);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5956); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2436:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2439:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2440:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2440:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2440:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2440:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2441:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression6014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2454:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2455:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2455:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2456:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6035);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression6047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2476:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2477:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2477:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2478:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6068);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2494:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred22_InternalSaml()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2494:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2494:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2494:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2499:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2500:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2500:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2501:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6111);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2525:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2526:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2527:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6149);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6159); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2534:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2537:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2538:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2538:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2538:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2538:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2539:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_DECIMAL)||LA42_0==27||(LA42_0>=34 && LA42_0<=35)||LA42_0==39||LA42_0==46||LA42_0==50||LA42_0==52||LA42_0==54||(LA42_0>=58 && LA42_0<=60)||LA42_0==63||(LA42_0>=65 && LA42_0<=72)) ) {
                alt42=1;
            }
            else if ( (LA42_0==44) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==RULE_ID) ) {
                    int LA42_3 = input.LA(3);

                    if ( ((LA42_3>=14 && LA42_3<=15)||(LA42_3>=17 && LA42_3<=38)||(LA42_3>=40 && LA42_3<=42)||(LA42_3>=44 && LA42_3<=46)||LA42_3==64) ) {
                        alt42=1;
                    }
                    else if ( (LA42_3==53) && (synpred24_InternalSaml())) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA42_2>=RULE_STRING && LA42_2<=RULE_DECIMAL)||LA42_2==27||(LA42_2>=34 && LA42_2<=35)||LA42_2==39||LA42_2==44||LA42_2==46||LA42_2==50||LA42_2==52||LA42_2==54||(LA42_2>=58 && LA42_2<=60)||LA42_2==63||(LA42_2>=65 && LA42_2<=72)) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==53) && (synpred23_InternalSaml())) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2553:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2553:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2553:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2554:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2554:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2555:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6248);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6260); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2575:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2576:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2576:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2577:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6284);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2600:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2600:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXSwitchExpression6328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2604:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2605:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2605:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2606:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6349);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2626:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2627:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2627:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2628:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6384);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression6396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2652:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==30||LA43_0==44||LA43_0==53||LA43_0==57) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2653:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2653:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2654:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6431);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2670:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2670:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2678:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2679:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2679:1: (lv_default_14_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2680:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6478);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2708:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2709:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2710:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6528);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6538); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2717:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2720:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2721:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2721:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2721:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2721:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==30||LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2722:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2722:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2723:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6584);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2739:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2739:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart6598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2743:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2744:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2744:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2745:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6619);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart6633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2765:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2766:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2766:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2767:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6654);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2791:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2792:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2793:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6690);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6700); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2800:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2803:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2804:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2804:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2804:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2804:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2805:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXForLoopExpression6746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression6758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2818:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2819:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2819:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2820:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6779);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2840:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2841:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2841:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2842:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6812);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression6824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2862:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2863:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2863:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2864:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6845);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2888:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2889:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2890:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6881);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6891); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2897:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2900:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2901:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2901:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2901:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2901:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2902:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXWhileExpression6937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression6949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2915:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2916:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2916:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2917:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6970);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression6982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2937:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2938:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2938:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2939:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7003);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2963:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2964:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2965:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7039);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7049); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2972:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2975:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2976:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2976:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2976:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2976:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2977:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2986:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2987:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2987:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2988:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7116);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression7128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression7140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3012:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3013:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3013:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3014:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7161);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression7173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3042:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3043:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3044:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7209);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7219); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3051:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3054:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3055:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3055:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3055:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3055:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3056:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3065:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==27||(LA48_0>=34 && LA48_0<=35)||LA48_0==39||LA48_0==44||LA48_0==46||LA48_0==50||LA48_0==52||LA48_0==54||(LA48_0>=58 && LA48_0<=63)||(LA48_0>=65 && LA48_0<=72)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3065:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3065:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3066:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3066:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3067:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7287);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3083:2: (otherlv_3= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==49) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3083:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression7300); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression7316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3099:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3100:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3101:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7352);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7362); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3108:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3111:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3112:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3112:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=61 && LA49_0<=62)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_DECIMAL)||LA49_0==27||(LA49_0>=34 && LA49_0<=35)||LA49_0==39||LA49_0==44||LA49_0==46||LA49_0==50||LA49_0==52||LA49_0==54||(LA49_0>=58 && LA49_0<=60)||LA49_0==63||(LA49_0>=65 && LA49_0<=72)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3113:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7409);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3123:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7436);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3139:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3140:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3141:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7471);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7481); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3148:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3151:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3152:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3152:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3152:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3152:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3153:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3158:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            else if ( (LA50_0==62) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3158:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3158:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3159:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3159:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3160:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3174:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred25_InternalSaml()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==44) && (synpred25_InternalSaml())) {
                alt51=1;
            }
            else if ( (LA51_0==30) && (synpred25_InternalSaml())) {
                alt51=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3186:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3186:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3186:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3187:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3187:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3188:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7613);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3204:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3205:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3205:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3206:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7634);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3223:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3223:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3224:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3224:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3225:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7663);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3241:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==17) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3241:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration7677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3245:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3246:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3246:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3247:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7698);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3271:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3272:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3273:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7736);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3280:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3283:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3284:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3284:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3284:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3284:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ID||LA53_1==14||LA53_1==27||LA53_1==46) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==30||LA53_0==44) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3285:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3285:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3286:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7792);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3302:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3303:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3303:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3304:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7814);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3328:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3329:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3330:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7850);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7860); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3337:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3340:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3341:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3341:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3341:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3341:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3342:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3342:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3343:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7906);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3359:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3360:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3360:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3361:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7927);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3385:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3386:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3387:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7963);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7973); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3394:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3397:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3398:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3398:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3398:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3398:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3399:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3404:2: ( ( ruleStaticQualifier ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==64) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3405:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3405:1: ( ruleStaticQualifier )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3406:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8030);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3419:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==27) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3419:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3423:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3424:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3424:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3425:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8065);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3441:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==43) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3441:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8078); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3445:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3446:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3446:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3447:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8099);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3467:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3468:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3468:1: ( ruleIdOrSuper )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3469:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8138);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3482:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3482:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3482:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3482:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3489:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3490:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt58=3;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3520:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3521:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8257);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3538:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3538:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3538:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3538:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3539:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3539:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3540:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8285);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3556:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==43) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3556:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8298); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3560:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3561:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3561:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3562:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8319);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop57;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3582:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3582:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3585:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3586:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8371);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3610:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3611:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3612:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8409);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8420); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3619:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3622:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3623:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3623:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==63) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3624:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8467);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3636:2: kw= 'super'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleIdOrSuper8491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3649:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3650:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3651:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8532);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8543); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3658:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3661:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3662:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3662:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==64) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3663:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8590);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleStaticQualifier8608); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3687:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3688:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3689:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8649);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8659); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3696:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3699:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3700:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3700:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3700:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3700:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3701:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXConstructorCall8705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3710:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3711:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3711:1: ( ruleQualifiedName )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3712:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8728);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3725:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3725:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3725:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3725:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3730:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3731:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3731:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3732:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8771);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3748:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==43) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3748:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8784); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3752:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3753:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3753:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3754:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8805);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3774:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3774:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3774:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3774:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3796:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3797:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8915);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3814:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3814:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3814:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3814:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3815:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3815:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3816:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8943);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3832:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==43) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3832:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8956); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3836:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3837:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3837:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3838:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8977);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop65;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3858:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3858:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3861:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3862:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9029);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3886:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3887:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3888:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9066);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9076); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3895:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3898:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3899:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3899:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3899:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3899:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3900:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3905:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==66) ) {
                alt69=1;
            }
            else if ( (LA69_0==67) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3905:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral9123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3910:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3910:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3911:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3911:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3912:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3933:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3934:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3935:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9197);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9207); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3942:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3945:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3946:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3946:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3946:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3946:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3947:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXNullLiteral9253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3964:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3965:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3966:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9289);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9299); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3973:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3976:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3977:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3977:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3977:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3977:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3978:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3983:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3984:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3984:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3985:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9354);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4009:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4010:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4011:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9390);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9400); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4018:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4021:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4022:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4022:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4022:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4022:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4023:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4028:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4029:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4029:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4030:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4054:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4055:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4056:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9492);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9502); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4063:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4066:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4067:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4067:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4067:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4067:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4068:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXTypeLiteral9548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4081:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4082:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4082:1: ( ruleQualifiedName )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4083:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9583);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral9595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4108:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4109:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4110:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9631);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9641); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4117:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4120:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4121:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4121:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4121:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4121:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4122:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXThrowExpression9687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4131:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4132:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4132:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4133:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9708);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4157:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4158:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4159:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9744);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9754); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4166:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4169:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4170:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4170:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4170:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4170:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4171:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXReturnExpression9800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4180:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4180:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4185:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4186:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9831);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4210:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4211:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4212:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9868);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9878); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4219:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4222:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4223:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4223:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4223:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4223:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4224:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4233:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4234:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4234:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4235:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9945);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==74) ) {
                alt73=1;
            }
            else if ( (LA73_0==73) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==74) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred34_InternalSaml()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4253:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4254:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9975);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4270:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==73) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred35_InternalSaml()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4270:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4270:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4270:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9997); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4275:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4276:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4276:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4277:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10019);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4294:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4294:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4294:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression10041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4298:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4299:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4299:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4300:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10062);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4324:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4325:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4326:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10100);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10110); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4333:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4336:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4337:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4337:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4337:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4337:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4337:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleXCatchClause10155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause10168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4346:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4347:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4347:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4348:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10189);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause10201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4368:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4369:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4369:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4370:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10222);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4394:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4395:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4396:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10259);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10270); if (state.failed) return current;

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
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4403:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4406:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4407:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4407:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4408:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10317);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4418:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==14) ) {
                    int LA74_1 = input.LA(2);

                    if ( (LA74_1==RULE_ID) ) {
                        int LA74_3 = input.LA(3);

                        if ( (synpred37_InternalSaml()) ) {
                            alt74=1;
                        }


                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4418:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4418:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4418:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName10345); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10368);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4445:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4449:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4450:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10422);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10433); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4460:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4464:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4465:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4465:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_HEX) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=RULE_INT && LA78_0<=RULE_DECIMAL)) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4465:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4473:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4473:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4473:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4473:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_INT) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==RULE_DECIMAL) ) {
                        alt75=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4473:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10505); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4481:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10531); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4488:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==14) ) {
                        int LA77_1 = input.LA(2);

                        if ( ((LA77_1>=RULE_INT && LA77_1<=RULE_DECIMAL)) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4489:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,14,FOLLOW_14_in_ruleNumber10551); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4494:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==RULE_INT) ) {
                                alt76=1;
                            }
                            else if ( (LA76_0==RULE_DECIMAL) ) {
                                alt76=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 76, 0, input);

                                throw nvae;
                            }
                            switch (alt76) {
                                case 1 :
                                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4494:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10567); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4502:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10593); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4520:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4521:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4522:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10646);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10656); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4529:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4532:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4533:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4533:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==30||LA80_0==44) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4533:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4533:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4534:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10704);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4542:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==46) ) {
                            int LA79_2 = input.LA(2);

                            if ( (LA79_2==48) ) {
                                int LA79_3 = input.LA(3);

                                if ( (synpred38_InternalSaml()) ) {
                                    alt79=1;
                                }


                            }


                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4542:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4545:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4545:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4545:6: ()
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4546:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10742); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10754); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4561:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10786);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4577:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4578:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4579:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10821);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10831); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4586:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4589:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4590:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4590:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4590:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4590:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==44) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4590:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4594:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_ID||LA82_0==30||LA82_0==44) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4594:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4594:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4595:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4595:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4596:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10891);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4612:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==43) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4612:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10904); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4616:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4617:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4617:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4618:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10925);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop81;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef10955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4642:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4643:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4643:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4644:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10976);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4668:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4669:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4670:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11012);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11022); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4677:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4680:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4681:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4681:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4681:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4681:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4682:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4682:1: ( ruleQualifiedName )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4683:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11070);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4696:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4696:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4696:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4696:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4701:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4702:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4702:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4703:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11113);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4719:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==43) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4719:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference11126); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4723:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4724:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4724:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4725:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11147);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4753:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4754:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4755:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11199);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11209); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4762:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4765:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4766:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4766:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==30||LA86_0==44) ) {
                alt86=1;
            }
            else if ( (LA86_0==75) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4767:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11256);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4777:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11283);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4793:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4794:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4795:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11318);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4802:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4805:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4806:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4806:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4806:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4806:2: ()
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleJvmWildcardTypeReference11374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4816:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==76) ) {
                alt87=1;
            }
            else if ( (LA87_0==63) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4816:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4816:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4817:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4817:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4818:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11396);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4835:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4835:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4836:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4836:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4837:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11423);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4861:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4862:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4863:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11461);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11471); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4870:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4873:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4874:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4874:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4874:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBound11508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4878:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4879:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4879:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4880:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11529);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4904:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4905:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4906:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11565);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11575); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4913:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4916:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4917:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4917:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4917:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBoundAnded11612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4921:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4922:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4922:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4923:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11633);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4947:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4948:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4949:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11669);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11679); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4956:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4959:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4960:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4960:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4960:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleJvmLowerBound11716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4964:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4965:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4965:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4966:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11737);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4992:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4993:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4994:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11776);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11787); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:5001:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:5004:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:5005:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalSaml
    public final void synpred1_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:372:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:373:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:373:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:374:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:374:1: ( ruleOpMultiAssign )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:375:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSaml798);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalSaml

    // $ANTLR start synpred2_InternalSaml
    public final void synpred2_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:500:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:501:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:501:2: ( ( ruleOpOr ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:502:1: ( ruleOpOr )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:502:1: ( ruleOpOr )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:503:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalSaml1146);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSaml

    // $ANTLR start synpred3_InternalSaml
    public final void synpred3_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:601:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:602:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:602:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:603:1: ( ruleOpAnd )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:603:1: ( ruleOpAnd )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:604:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalSaml1405);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSaml

    // $ANTLR start synpred4_InternalSaml
    public final void synpred4_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:702:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:703:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:703:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:704:1: ( ruleOpEquality )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:704:1: ( ruleOpEquality )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:705:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalSaml1664);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSaml

    // $ANTLR start synpred5_InternalSaml
    public final void synpred5_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:5: ( () 'instanceof' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:5: ( () 'instanceof' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:6: () 'instanceof'
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:810:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:811:1: 
        {
        }

        match(input,23,FOLLOW_23_in_synpred5_InternalSaml1940); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSaml

    // $ANTLR start synpred6_InternalSaml
    public final void synpred6_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:841:10: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:842:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:842:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:843:1: ( ruleOpCompare )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:843:1: ( ruleOpCompare )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:844:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalSaml2011);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalSaml

    // $ANTLR start synpred7_InternalSaml
    public final void synpred7_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:964:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:964:2: ( ( ruleOpOther ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:965:1: ( ruleOpOther )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:965:1: ( ruleOpOther )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:966:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalSaml2330);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSaml

    // $ANTLR start synpred8_InternalSaml
    public final void synpred8_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1055:3: ( ( '>' '>' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1055:4: ( '>' '>' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1055:4: ( '>' '>' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1056:2: '>' '>'
        {
        match(input,26,FOLLOW_26_in_synpred8_InternalSaml2546); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred8_InternalSaml2551); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalSaml

    // $ANTLR start synpred9_InternalSaml
    public final void synpred9_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1085:3: ( ( '<' '<' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1085:4: ( '<' '<' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1085:4: ( '<' '<' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1086:2: '<' '<'
        {
        match(input,27,FOLLOW_27_in_synpred9_InternalSaml2633); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred9_InternalSaml2638); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSaml

    // $ANTLR start synpred10_InternalSaml
    public final void synpred10_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1159:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1160:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1160:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1161:1: ( ruleOpAdd )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1161:1: ( ruleOpAdd )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1162:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalSaml2860);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalSaml

    // $ANTLR start synpred11_InternalSaml
    public final void synpred11_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1267:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1268:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1268:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1269:1: ( ruleOpMulti )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1269:1: ( ruleOpMulti )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1270:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalSaml3140);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSaml

    // $ANTLR start synpred12_InternalSaml
    public final void synpred12_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:3: ( ( () 'as' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:4: ( () 'as' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:4: ( () 'as' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:5: () 'as'
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1500:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1501:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred12_InternalSaml3734); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSaml

    // $ANTLR start synpred13_InternalSaml
    public final void synpred13_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1560:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1561:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred13_InternalSaml3888); if (state.failed) return ;
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1562:1: ( ( ruleValidID ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1563:1: ( ruleValidID )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1563:1: ( ruleValidID )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1564:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalSaml3897);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalSaml3903);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSaml

    // $ANTLR start synpred14_InternalSaml
    public final void synpred14_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1618:10: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1619:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1619:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt88=3;
        switch ( input.LA(1) ) {
        case 14:
            {
            alt88=1;
            }
            break;
        case 41:
            {
            alt88=2;
            }
            break;
        case 42:
            {
            alt88=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 88, 0, input);

            throw nvae;
        }

        switch (alt88) {
            case 1 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1619:4: '.'
                {
                match(input,14,FOLLOW_14_in_synpred14_InternalSaml4006); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1621:6: ( ( '?.' ) )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1621:6: ( ( '?.' ) )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1622:1: ( '?.' )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1622:1: ( '?.' )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1623:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred14_InternalSaml4020); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1628:6: ( ( '*.' ) )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1628:6: ( ( '*.' ) )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1629:1: ( '*.' )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1629:1: ( '*.' )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1630:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalSaml4040); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSaml

    // $ANTLR start synpred15_InternalSaml
    public final void synpred15_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1739:4: ( ( '(' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1740:1: ( '(' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1740:1: ( '(' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1741:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred15_InternalSaml4267); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSaml

    // $ANTLR start synpred16_InternalSaml
    public final void synpred16_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1760:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1761:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1761:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==30||LA90_0==44) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1761:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1761:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1762:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1762:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1763:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSaml4319);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1765:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==43) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1765:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred16_InternalSaml4326); if (state.failed) return ;
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1766:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1767:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1767:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1768:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSaml4333);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1770:6: ( ( '|' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1771:1: ( '|' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1771:1: ( '|' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1772:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalSaml4347); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSaml

    // $ANTLR start synpred17_InternalSaml
    public final void synpred17_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1839:4: ( ( () '[' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1839:5: ( () '[' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1839:5: ( () '[' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1839:6: () '['
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1839:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1840:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred17_InternalSaml4467); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalSaml

    // $ANTLR start synpred18_InternalSaml
    public final void synpred18_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:3: ( ( () '[' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:4: ( () '[' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:4: ( () '[' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:5: () '['
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2030:5: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2031:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred18_InternalSaml4991); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSaml

    // $ANTLR start synpred20_InternalSaml
    public final void synpred20_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==30||LA92_0==44) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2124:7: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2125:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2125:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2126:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSaml5270);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2128:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==43) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2128:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred20_InternalSaml5277); if (state.failed) return ;
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2129:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2130:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2130:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2131:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSaml5284);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2133:6: ( ( '|' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2134:1: ( '|' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2134:1: ( '|' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2135:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred20_InternalSaml5298); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSaml

    // $ANTLR start synpred22_InternalSaml
    public final void synpred22_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2494:4: ( 'else' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2494:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred22_InternalSaml6081); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalSaml

    // $ANTLR start synpred23_InternalSaml
    public final void synpred23_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2548:6: ( ( ruleValidID ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2549:1: ( ruleValidID )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2549:1: ( ruleValidID )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2550:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalSaml6223);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred23_InternalSaml6229); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSaml

    // $ANTLR start synpred24_InternalSaml
    public final void synpred24_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2594:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,44,FOLLOW_44_in_synpred24_InternalSaml6305); if (state.failed) return ;
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2595:1: ( ( ruleValidID ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2596:1: ( ruleValidID )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2596:1: ( ruleValidID )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2597:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalSaml6312);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred24_InternalSaml6318); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalSaml

    // $ANTLR start synpred25_InternalSaml
    public final void synpred25_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3178:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3179:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3179:1: ( ruleJvmTypeReference )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3180:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalSaml7583);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3182:2: ( ( ruleValidID ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3183:1: ( ruleValidID )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3183:1: ( ruleValidID )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3184:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalSaml7592);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalSaml

    // $ANTLR start synpred26_InternalSaml
    public final void synpred26_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3482:4: ( ( '(' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3483:1: ( '(' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3483:1: ( '(' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3484:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred26_InternalSaml8154); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSaml

    // $ANTLR start synpred27_InternalSaml
    public final void synpred27_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3503:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3504:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3504:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==30||LA96_0==44) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3504:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3504:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3505:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3505:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3506:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSaml8206);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3508:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==43) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3508:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred27_InternalSaml8213); if (state.failed) return ;
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3509:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3510:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3510:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3511:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSaml8220);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3513:6: ( ( '|' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3514:1: ( '|' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3514:1: ( '|' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3515:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred27_InternalSaml8234); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalSaml

    // $ANTLR start synpred28_InternalSaml
    public final void synpred28_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3582:4: ( ( () '[' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3582:5: ( () '[' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3582:5: ( () '[' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3582:6: () '['
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3582:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3583:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred28_InternalSaml8354); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalSaml

    // $ANTLR start synpred29_InternalSaml
    public final void synpred29_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3725:4: ( '<' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3725:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred29_InternalSaml8741); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalSaml

    // $ANTLR start synpred30_InternalSaml
    public final void synpred30_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3774:5: ( '(' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3774:7: '('
        {
        match(input,44,FOLLOW_44_in_synpred30_InternalSaml8834); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSaml

    // $ANTLR start synpred31_InternalSaml
    public final void synpred31_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3779:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3780:1: 
        {
        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3780:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==30||LA98_0==44) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3780:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3780:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3781:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3781:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3782:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSaml8864);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3784:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==43) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3784:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred31_InternalSaml8871); if (state.failed) return ;
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3785:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3786:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3786:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3787:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSaml8878);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3789:6: ( ( '|' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3790:1: ( '|' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3790:1: ( '|' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3791:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred31_InternalSaml8892); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalSaml

    // $ANTLR start synpred32_InternalSaml
    public final void synpred32_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3858:4: ( ( () '[' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3858:5: ( () '[' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3858:5: ( () '[' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3858:6: () '['
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3858:6: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:3859:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred32_InternalSaml9012); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalSaml

    // $ANTLR start synpred33_InternalSaml
    public final void synpred33_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4180:2: ( ( ruleXExpression ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4181:1: ( ruleXExpression )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4181:1: ( ruleXExpression )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4182:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalSaml9814);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalSaml

    // $ANTLR start synpred34_InternalSaml
    public final void synpred34_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:5: ( 'catch' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4251:7: 'catch'
        {
        match(input,74,FOLLOW_74_in_synpred34_InternalSaml9959); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalSaml

    // $ANTLR start synpred35_InternalSaml
    public final void synpred35_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4270:5: ( 'finally' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4270:7: 'finally'
        {
        match(input,73,FOLLOW_73_in_synpred35_InternalSaml9989); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalSaml

    // $ANTLR start synpred37_InternalSaml
    public final void synpred37_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4418:3: ( '.' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4419:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred37_InternalSaml10336); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalSaml

    // $ANTLR start synpred38_InternalSaml
    public final void synpred38_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4542:2: ( ( () '[' ']' ) )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4542:3: ( () '[' ']' )
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4542:3: ( () '[' ']' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4542:4: () '[' ']'
        {
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4542:4: ()
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4543:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred38_InternalSaml10719); if (state.failed) return ;
        match(input,48,FOLLOW_48_in_synpred38_InternalSaml10723); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalSaml

    // $ANTLR start synpred39_InternalSaml
    public final void synpred39_InternalSaml_fragment() throws RecognitionException {   
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4696:4: ( '<' )
        // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:4696:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred39_InternalSaml11083); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalSaml

    // Delegated rules

    public final boolean synpred14_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\1\1\12\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA12_maxS =
        "\1\112\1\uffff\10\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA12_specialS =
        "\2\uffff\1\1\1\4\1\3\1\6\1\0\1\5\1\7\1\2\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\5\1\5\uffff\2\1\2\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\15\1\1\uffff\20\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 963:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSaml()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\101\uffff";
    static final String DFA28_eofS =
        "\1\2\100\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA28_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\32\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1739:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\36\uffff";
    static final String DFA27_eofS =
        "\36\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA27_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\4\5\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1760:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==44) ) {s = 2;}

                        else if ( (LA27_0==30) && (synpred16_InternalSaml())) {s = 3;}

                        else if ( (LA27_0==47) && (synpred16_InternalSaml())) {s = 4;}

                        else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_DECIMAL)||LA27_0==27||(LA27_0>=34 && LA27_0<=35)||LA27_0==39||LA27_0==46||LA27_0==50||LA27_0==52||LA27_0==54||(LA27_0>=58 && LA27_0<=60)||LA27_0==63||(LA27_0>=65 && LA27_0<=72)) ) {s = 5;}

                        else if ( (LA27_0==45) ) {s = 29;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\101\uffff";
    static final String DFA29_eofS =
        "\1\2\100\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA29_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\34\2\1\1\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1839:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\16\uffff";
    static final String DFA31_eofS =
        "\16\uffff";
    static final String DFA31_minS =
        "\1\4\15\uffff";
    static final String DFA31_maxS =
        "\1\110\15\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA31_specialS =
        "\16\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\4\4\5\22\uffff\1\4\20\uffff\1\15\1\uffff\1\5\3\uffff\1\6"+
            "\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1880:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA35_eotS =
        "\40\uffff";
    static final String DFA35_eofS =
        "\40\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA35_maxS =
        "\1\110\2\0\35\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\4\5\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2124:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==44) ) {s = 2;}

                        else if ( (LA35_0==30) && (synpred20_InternalSaml())) {s = 3;}

                        else if ( (LA35_0==47) && (synpred20_InternalSaml())) {s = 4;}

                        else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_DECIMAL)||LA35_0==27||(LA35_0>=34 && LA35_0<=35)||LA35_0==39||LA35_0==46||LA35_0==48||LA35_0==50||LA35_0==52||LA35_0==54||(LA35_0>=58 && LA35_0<=63)||(LA35_0>=65 && LA35_0<=72)) ) {s = 5;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\101\uffff";
    static final String DFA59_eofS =
        "\1\2\100\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA59_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\32\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3482:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\36\uffff";
    static final String DFA58_eofS =
        "\36\uffff";
    static final String DFA58_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA58_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA58_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\4\5\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3503:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==RULE_ID) ) {s = 1;}

                        else if ( (LA58_0==44) ) {s = 2;}

                        else if ( (LA58_0==30) && (synpred27_InternalSaml())) {s = 3;}

                        else if ( (LA58_0==47) && (synpred27_InternalSaml())) {s = 4;}

                        else if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_DECIMAL)||LA58_0==27||(LA58_0>=34 && LA58_0<=35)||LA58_0==39||LA58_0==46||LA58_0==50||LA58_0==52||LA58_0==54||(LA58_0>=58 && LA58_0<=60)||LA58_0==63||(LA58_0>=65 && LA58_0<=72)) ) {s = 5;}

                        else if ( (LA58_0==45) ) {s = 29;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\101\uffff";
    static final String DFA60_eofS =
        "\1\2\100\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA60_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\34\2\1\1\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3582:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\101\uffff";
    static final String DFA64_eofS =
        "\1\2\100\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA64_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA64_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\11\2\1\1\23\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3725:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\32\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3774:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\36\uffff";
    static final String DFA66_eofS =
        "\36\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA66_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\4\5\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3779:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==RULE_ID) ) {s = 1;}

                        else if ( (LA66_0==44) ) {s = 2;}

                        else if ( (LA66_0==30) && (synpred31_InternalSaml())) {s = 3;}

                        else if ( (LA66_0==47) && (synpred31_InternalSaml())) {s = 4;}

                        else if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_DECIMAL)||LA66_0==27||(LA66_0>=34 && LA66_0<=35)||LA66_0==39||LA66_0==46||LA66_0==50||LA66_0==52||LA66_0==54||(LA66_0>=58 && LA66_0<=60)||LA66_0==63||(LA66_0>=65 && LA66_0<=72)) ) {s = 5;}

                        else if ( (LA66_0==45) ) {s = 29;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSaml()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\101\uffff";
    static final String DFA68_eofS =
        "\1\2\100\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA68_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\34\2\1\1\1\uffff\20\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3858:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\101\uffff";
    static final String DFA70_eofS =
        "\1\33\100\uffff";
    static final String DFA70_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA70_maxS =
        "\1\112\32\0\46\uffff";
    static final String DFA70_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\46\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\5\uffff\2\33\2\uffff\11\33\1\10\6"+
            "\33\1\4\1\3\3\33\1\2\4\33\1\32\1\33\1\12\1\uffff\2\33\1\23\1"+
            "\33\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1"+
            "\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4180:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA70_25 = input.LA(1);

                         
                        int index70_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA70_26 = input.LA(1);

                         
                        int index70_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\101\uffff";
    static final String DFA85_eofS =
        "\1\2\100\uffff";
    static final String DFA85_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA85_maxS =
        "\1\112\1\0\77\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA85_transitionS = {
            "\5\2\5\uffff\2\2\2\uffff\11\2\1\1\23\2\1\uffff\20\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "4696:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalSaml()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_ruleModel153 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard353 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard372 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_entryRuleJavaElement427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaElement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleJavaElement474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaElement491 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleJavaElement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment711 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment727 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment777 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment830 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMultiAssign1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1125 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1178 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1201 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpOr1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1384 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1437 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1460 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpAnd1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1643 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1696 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1719 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1923 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_23_in_ruleXRelationalExpression1959 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1982 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2043 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2066 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2309 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2362 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2385 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2531 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2562 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2618 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2649 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2839 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2892 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2915 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3119 = new BitSet(new long[]{0x0000007000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3172 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3195 = new BitSet(new long[]{0x0000007000008002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMulti3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3448 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3718 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXCastedExpression3753 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3776 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3871 = new BitSet(new long[]{0x0000060000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall3920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3943 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3959 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3981 = new BitSet(new long[]{0x0000060000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4067 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4091 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4128 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4157 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4178 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4191 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4212 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4251 = new BitSet(new long[]{0x0000560000004002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4285 = new BitSet(new long[]{0x9C54F08C480001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4370 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4398 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4411 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4432 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4449 = new BitSet(new long[]{0x0000460000004002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4484 = new BitSet(new long[]{0x0000060000004002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5251 = new BitSet(new long[]{0xFC55D08C480001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5324 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5337 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5358 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5380 = new BitSet(new long[]{0xFC55508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5417 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5531 = new BitSet(new long[]{0xFC56508C080001F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_49_in_ruleXExpressionInClosure5544 = new BitSet(new long[]{0xFC54508C080001F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5702 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5715 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5736 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure5758 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5877 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5899 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6002 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression6014 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6035 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression6047 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6068 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6089 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6205 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6248 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6260 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6284 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44_in_ruleXSwitchExpression6328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6349 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6361 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6384 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression6396 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6410 = new BitSet(new long[]{0x0220100040000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6431 = new BitSet(new long[]{0x03A0100040000010L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6445 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6457 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6478 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6584 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart6598 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6619 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart6633 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXForLoopExpression6746 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression6758 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6779 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6791 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6812 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression6824 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXWhileExpression6937 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression6949 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6970 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression6982 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7095 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7116 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression7128 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression7140 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7161 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7265 = new BitSet(new long[]{0xFD54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7287 = new BitSet(new long[]{0xFD56508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression7300 = new BitSet(new long[]{0xFD54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7534 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7565 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7634 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7663 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration7677 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8030 = new BitSet(new long[]{0x8000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8044 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8065 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8078 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8099 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8113 = new BitSet(new long[]{0x8000000008000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8138 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8172 = new BitSet(new long[]{0x9C54F08C480001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8257 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8285 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8298 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8319 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8336 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleIdOrSuper8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleStaticQualifier8608 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXConstructorCall8705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8728 = new BitSet(new long[]{0x0000500008000002L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8749 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8771 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8784 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8805 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8819 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8842 = new BitSet(new long[]{0x9C54F08C480001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8915 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8943 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8956 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8977 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8994 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXNullLiteral9253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTypeLiteral9548 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9583 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXThrowExpression9687 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXReturnExpression9800 = new BitSet(new long[]{0x9C54508C080001F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9924 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9975 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9997 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression10041 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXCatchClause10155 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause10168 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10189 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause10201 = new BitSet(new long[]{0x9C54508C080001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10317 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName10345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10368 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10505 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10531 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleNumber10551 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10704 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10742 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10754 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10869 = new BitSet(new long[]{0x0000300040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10891 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10904 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10925 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10941 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef10955 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11070 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11091 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11113 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference11126 = new BitSet(new long[]{0x0000100040000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11147 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmWildcardTypeReference11374 = new BitSet(new long[]{0x8000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBound11508 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBoundAnded11612 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleJvmLowerBound11716 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSaml798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalSaml1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalSaml1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalSaml1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalSaml1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalSaml2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalSaml2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalSaml2546 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalSaml2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalSaml2633 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalSaml2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalSaml2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalSaml3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalSaml3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred13_InternalSaml3888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalSaml3897 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalSaml3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred14_InternalSaml4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalSaml4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalSaml4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred15_InternalSaml4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSaml4319 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalSaml4326 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSaml4333 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalSaml4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred17_InternalSaml4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred18_InternalSaml4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSaml5270 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalSaml5277 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSaml5284 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalSaml5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred22_InternalSaml6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalSaml6223 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred23_InternalSaml6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred24_InternalSaml6305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalSaml6312 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred24_InternalSaml6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalSaml7583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalSaml7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred26_InternalSaml8154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSaml8206 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred27_InternalSaml8213 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSaml8220 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred27_InternalSaml8234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred28_InternalSaml8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred29_InternalSaml8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred30_InternalSaml8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSaml8864 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred31_InternalSaml8871 = new BitSet(new long[]{0x0000100040000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSaml8878 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalSaml8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred32_InternalSaml9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalSaml9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred34_InternalSaml9959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred35_InternalSaml9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred37_InternalSaml10336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred38_InternalSaml10719 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred38_InternalSaml10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred39_InternalSaml11083 = new BitSet(new long[]{0x0000000000000002L});

}