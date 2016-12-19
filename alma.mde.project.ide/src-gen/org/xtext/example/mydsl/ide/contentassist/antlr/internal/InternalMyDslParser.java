package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ClassDiagram'", "'{'", "'}'", "'Class'", "'extends'", "'attributes'", "'('", "')'", "','", "'operations'", "'Association'", "'cardinalities'", "'targetclass'", "'sourceclass'", "':'", "'Boolean'", "'Real'", "'Integer'", "'Enumeration'", "'-'", "'abstract'"
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleClassDiagram"
    // InternalMyDsl.g:53:1: entryRuleClassDiagram : ruleClassDiagram EOF ;
    public final void entryRuleClassDiagram() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleClassDiagram EOF )
            // InternalMyDsl.g:55:1: ruleClassDiagram EOF
            {
             before(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDiagram();

            state._fsp--;

             after(grammarAccess.getClassDiagramRule()); 
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
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalMyDsl.g:62:1: ruleClassDiagram : ( ( rule__ClassDiagram__Group__0 ) ) ;
    public final void ruleClassDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ClassDiagram__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ClassDiagram__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ClassDiagram__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ClassDiagram__Group__0 )
            {
             before(grammarAccess.getClassDiagramAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ClassDiagram__Group__0 )
            // InternalMyDsl.g:69:4: rule__ClassDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntity EOF )
            // InternalMyDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:87:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Entity__Alternatives )
            // InternalMyDsl.g:94:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
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
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:128:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleClass EOF )
            // InternalMyDsl.g:130:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMyDsl.g:137:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Class__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Class__Group__0 )
            // InternalMyDsl.g:144:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAssociation"
    // InternalMyDsl.g:153:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAssociation EOF )
            // InternalMyDsl.g:155:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalMyDsl.g:162:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Association__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Association__Group__0 )
            // InternalMyDsl.g:169:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:203:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleOperation EOF )
            // InternalMyDsl.g:205:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:212:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Operation__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Operation__Group__0 )
            // InternalMyDsl.g:219:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleType EOF )
            // InternalMyDsl.g:230:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:237:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:244:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleBooleanType"
    // InternalMyDsl.g:253:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleBooleanType EOF )
            // InternalMyDsl.g:255:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalMyDsl.g:262:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__BooleanType__Group__0 )
            // InternalMyDsl.g:269:4: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleRealType"
    // InternalMyDsl.g:278:1: entryRuleRealType : ruleRealType EOF ;
    public final void entryRuleRealType() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleRealType EOF )
            // InternalMyDsl.g:280:1: ruleRealType EOF
            {
             before(grammarAccess.getRealTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRealType();

            state._fsp--;

             after(grammarAccess.getRealTypeRule()); 
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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // InternalMyDsl.g:287:1: ruleRealType : ( ( rule__RealType__Group__0 ) ) ;
    public final void ruleRealType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__RealType__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__RealType__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__RealType__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__RealType__Group__0 )
            {
             before(grammarAccess.getRealTypeAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__RealType__Group__0 )
            // InternalMyDsl.g:294:4: rule__RealType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RealType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalMyDsl.g:303:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleIntegerType EOF )
            // InternalMyDsl.g:305:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalMyDsl.g:312:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__IntegerType__Group__0 )
            // InternalMyDsl.g:319:4: rule__IntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalMyDsl.g:328:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEnumeration EOF )
            // InternalMyDsl.g:330:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalMyDsl.g:337:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Enumeration__Group__0 )
            // InternalMyDsl.g:344:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleParameter"
    // InternalMyDsl.g:353:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleParameter EOF )
            // InternalMyDsl.g:355:1: ruleParameter EOF
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
    // InternalMyDsl.g:362:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Parameter__Group__0 )
            // InternalMyDsl.g:369:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleCardinalities"
    // InternalMyDsl.g:378:1: entryRuleCardinalities : ruleCardinalities EOF ;
    public final void entryRuleCardinalities() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleCardinalities EOF )
            // InternalMyDsl.g:380:1: ruleCardinalities EOF
            {
             before(grammarAccess.getCardinalitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinalities();

            state._fsp--;

             after(grammarAccess.getCardinalitiesRule()); 
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
    // $ANTLR end "entryRuleCardinalities"


    // $ANTLR start "ruleCardinalities"
    // InternalMyDsl.g:387:1: ruleCardinalities : ( ( rule__Cardinalities__Group__0 ) ) ;
    public final void ruleCardinalities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Cardinalities__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Cardinalities__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Cardinalities__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Cardinalities__Group__0 )
            {
             before(grammarAccess.getCardinalitiesAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Cardinalities__Group__0 )
            // InternalMyDsl.g:394:4: rule__Cardinalities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalities"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:403:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleEInt EOF )
            // InternalMyDsl.g:405:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:412:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:419:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalMyDsl.g:427:1: rule__Entity__Alternatives : ( ( ruleClass ) | ( ruleAssociation ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( ruleClass ) | ( ruleAssociation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:432:2: ( ruleClass )
                    {
                    // InternalMyDsl.g:432:2: ( ruleClass )
                    // InternalMyDsl.g:433:3: ruleClass
                    {
                     before(grammarAccess.getEntityAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:438:2: ( ruleAssociation )
                    {
                    // InternalMyDsl.g:438:2: ( ruleAssociation )
                    // InternalMyDsl.g:439:3: ruleAssociation
                    {
                     before(grammarAccess.getEntityAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getAssociationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:448:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:453:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:453:2: ( RULE_STRING )
                    // InternalMyDsl.g:454:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:459:2: ( RULE_ID )
                    // InternalMyDsl.g:460:3: RULE_ID
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:469:1: rule__Type__Alternatives : ( ( ruleBooleanType ) | ( ruleRealType ) | ( ruleIntegerType ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ruleBooleanType ) | ( ruleRealType ) | ( ruleIntegerType ) | ( ruleEnumeration ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:474:2: ( ruleBooleanType )
                    {
                    // InternalMyDsl.g:474:2: ( ruleBooleanType )
                    // InternalMyDsl.g:475:3: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:480:2: ( ruleRealType )
                    {
                    // InternalMyDsl.g:480:2: ( ruleRealType )
                    // InternalMyDsl.g:481:3: ruleRealType
                    {
                     before(grammarAccess.getTypeAccess().getRealTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRealTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:486:2: ( ruleIntegerType )
                    {
                    // InternalMyDsl.g:486:2: ( ruleIntegerType )
                    // InternalMyDsl.g:487:3: ruleIntegerType
                    {
                     before(grammarAccess.getTypeAccess().getIntegerTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:492:2: ( ruleEnumeration )
                    {
                    // InternalMyDsl.g:492:2: ( ruleEnumeration )
                    // InternalMyDsl.g:493:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_3()); 

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


    // $ANTLR start "rule__ClassDiagram__Group__0"
    // InternalMyDsl.g:502:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalMyDsl.g:507:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__0"


    // $ANTLR start "rule__ClassDiagram__Group__0__Impl"
    // InternalMyDsl.g:514:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( ( () ) )
            // InternalMyDsl.g:519:1: ( () )
            {
            // InternalMyDsl.g:519:1: ( () )
            // InternalMyDsl.g:520:2: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalMyDsl.g:521:2: ()
            // InternalMyDsl.g:521:3: 
            {
            }

             after(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__0__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__1"
    // InternalMyDsl.g:529:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalMyDsl.g:534:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ClassDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__1"


    // $ANTLR start "rule__ClassDiagram__Group__1__Impl"
    // InternalMyDsl.g:541:1: rule__ClassDiagram__Group__1__Impl : ( 'ClassDiagram' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( 'ClassDiagram' ) )
            // InternalMyDsl.g:546:1: ( 'ClassDiagram' )
            {
            // InternalMyDsl.g:546:1: ( 'ClassDiagram' )
            // InternalMyDsl.g:547:2: 'ClassDiagram'
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getClassDiagramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__2"
    // InternalMyDsl.g:556:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:560:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalMyDsl.g:561:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ClassDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__2"


    // $ANTLR start "rule__ClassDiagram__Group__2__Impl"
    // InternalMyDsl.g:568:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__NameAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( ( ( rule__ClassDiagram__NameAssignment_2 ) ) )
            // InternalMyDsl.g:573:1: ( ( rule__ClassDiagram__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:573:1: ( ( rule__ClassDiagram__NameAssignment_2 ) )
            // InternalMyDsl.g:574:2: ( rule__ClassDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:575:2: ( rule__ClassDiagram__NameAssignment_2 )
            // InternalMyDsl.g:575:3: rule__ClassDiagram__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__3"
    // InternalMyDsl.g:583:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalMyDsl.g:588:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ClassDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__3"


    // $ANTLR start "rule__ClassDiagram__Group__3__Impl"
    // InternalMyDsl.g:595:1: rule__ClassDiagram__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( ( '{' ) )
            // InternalMyDsl.g:600:1: ( '{' )
            {
            // InternalMyDsl.g:600:1: ( '{' )
            // InternalMyDsl.g:601:2: '{'
            {
             before(grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__3__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__4"
    // InternalMyDsl.g:610:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5 ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5 )
            // InternalMyDsl.g:615:2: rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ClassDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__4"


    // $ANTLR start "rule__ClassDiagram__Group__4__Impl"
    // InternalMyDsl.g:622:1: rule__ClassDiagram__Group__4__Impl : ( ( rule__ClassDiagram__EntitiesAssignment_4 )* ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( ( ( rule__ClassDiagram__EntitiesAssignment_4 )* ) )
            // InternalMyDsl.g:627:1: ( ( rule__ClassDiagram__EntitiesAssignment_4 )* )
            {
            // InternalMyDsl.g:627:1: ( ( rule__ClassDiagram__EntitiesAssignment_4 )* )
            // InternalMyDsl.g:628:2: ( rule__ClassDiagram__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getClassDiagramAccess().getEntitiesAssignment_4()); 
            // InternalMyDsl.g:629:2: ( rule__ClassDiagram__EntitiesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==21||LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:629:3: rule__ClassDiagram__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ClassDiagram__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__4__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__5"
    // InternalMyDsl.g:637:1: rule__ClassDiagram__Group__5 : rule__ClassDiagram__Group__5__Impl ;
    public final void rule__ClassDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:1: ( rule__ClassDiagram__Group__5__Impl )
            // InternalMyDsl.g:642:2: rule__ClassDiagram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__5"


    // $ANTLR start "rule__ClassDiagram__Group__5__Impl"
    // InternalMyDsl.g:648:1: rule__ClassDiagram__Group__5__Impl : ( '}' ) ;
    public final void rule__ClassDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( ( '}' ) )
            // InternalMyDsl.g:653:1: ( '}' )
            {
            // InternalMyDsl.g:653:1: ( '}' )
            // InternalMyDsl.g:654:2: '}'
            {
             before(grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalMyDsl.g:664:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:668:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMyDsl.g:669:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalMyDsl.g:676:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( ( () ) )
            // InternalMyDsl.g:681:1: ( () )
            {
            // InternalMyDsl.g:681:1: ( () )
            // InternalMyDsl.g:682:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalMyDsl.g:683:2: ()
            // InternalMyDsl.g:683:3: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalMyDsl.g:691:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:695:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMyDsl.g:696:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalMyDsl.g:703:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalMyDsl.g:708:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalMyDsl.g:708:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalMyDsl.g:709:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalMyDsl.g:710:2: ( rule__Class__AbstractAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:710:3: rule__Class__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalMyDsl.g:718:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMyDsl.g:723:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalMyDsl.g:730:1: rule__Class__Group__2__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( ( 'Class' ) )
            // InternalMyDsl.g:735:1: ( 'Class' )
            {
            // InternalMyDsl.g:735:1: ( 'Class' )
            // InternalMyDsl.g:736:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalMyDsl.g:745:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:749:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMyDsl.g:750:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalMyDsl.g:757:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalMyDsl.g:762:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:762:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalMyDsl.g:763:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:764:2: ( rule__Class__NameAssignment_3 )
            // InternalMyDsl.g:764:3: rule__Class__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalMyDsl.g:772:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMyDsl.g:777:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalMyDsl.g:784:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalMyDsl.g:789:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalMyDsl.g:789:1: ( ( rule__Class__Group_4__0 )? )
            // InternalMyDsl.g:790:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalMyDsl.g:791:2: ( rule__Class__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:791:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalMyDsl.g:799:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMyDsl.g:804:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalMyDsl.g:811:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( ( '{' ) )
            // InternalMyDsl.g:816:1: ( '{' )
            {
            // InternalMyDsl.g:816:1: ( '{' )
            // InternalMyDsl.g:817:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalMyDsl.g:826:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalMyDsl.g:831:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalMyDsl.g:838:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalMyDsl.g:843:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalMyDsl.g:843:1: ( ( rule__Class__Group_6__0 )? )
            // InternalMyDsl.g:844:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalMyDsl.g:845:2: ( rule__Class__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:845:3: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalMyDsl.g:853:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalMyDsl.g:858:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalMyDsl.g:865:1: rule__Class__Group__7__Impl : ( ( rule__Class__Group_7__0 )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( ( ( rule__Class__Group_7__0 )? ) )
            // InternalMyDsl.g:870:1: ( ( rule__Class__Group_7__0 )? )
            {
            // InternalMyDsl.g:870:1: ( ( rule__Class__Group_7__0 )? )
            // InternalMyDsl.g:871:2: ( rule__Class__Group_7__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_7()); 
            // InternalMyDsl.g:872:2: ( rule__Class__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:872:3: rule__Class__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalMyDsl.g:880:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( rule__Class__Group__8__Impl )
            // InternalMyDsl.g:885:2: rule__Class__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // InternalMyDsl.g:891:1: rule__Class__Group__8__Impl : ( '}' ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( ( '}' ) )
            // InternalMyDsl.g:896:1: ( '}' )
            {
            // InternalMyDsl.g:896:1: ( '}' )
            // InternalMyDsl.g:897:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalMyDsl.g:907:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:911:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalMyDsl.g:912:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalMyDsl.g:919:1: rule__Class__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( ( 'extends' ) )
            // InternalMyDsl.g:924:1: ( 'extends' )
            {
            // InternalMyDsl.g:924:1: ( 'extends' )
            // InternalMyDsl.g:925:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalMyDsl.g:934:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:938:1: ( rule__Class__Group_4__1__Impl )
            // InternalMyDsl.g:939:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalMyDsl.g:945:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ExtendsAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( ( ( rule__Class__ExtendsAssignment_4_1 ) ) )
            // InternalMyDsl.g:950:1: ( ( rule__Class__ExtendsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:950:1: ( ( rule__Class__ExtendsAssignment_4_1 ) )
            // InternalMyDsl.g:951:2: ( rule__Class__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getExtendsAssignment_4_1()); 
            // InternalMyDsl.g:952:2: ( rule__Class__ExtendsAssignment_4_1 )
            // InternalMyDsl.g:952:3: rule__Class__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getExtendsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // InternalMyDsl.g:961:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalMyDsl.g:966:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // InternalMyDsl.g:973:1: rule__Class__Group_6__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( ( 'attributes' ) )
            // InternalMyDsl.g:978:1: ( 'attributes' )
            {
            // InternalMyDsl.g:978:1: ( 'attributes' )
            // InternalMyDsl.g:979:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // InternalMyDsl.g:988:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalMyDsl.g:993:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // InternalMyDsl.g:1000:1: rule__Class__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( ( '(' ) )
            // InternalMyDsl.g:1005:1: ( '(' )
            {
            // InternalMyDsl.g:1005:1: ( '(' )
            // InternalMyDsl.g:1006:2: '('
            {
             before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_6__2"
    // InternalMyDsl.g:1015:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalMyDsl.g:1020:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2"


    // $ANTLR start "rule__Class__Group_6__2__Impl"
    // InternalMyDsl.g:1027:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__AttributesAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( ( ( rule__Class__AttributesAssignment_6_2 ) ) )
            // InternalMyDsl.g:1032:1: ( ( rule__Class__AttributesAssignment_6_2 ) )
            {
            // InternalMyDsl.g:1032:1: ( ( rule__Class__AttributesAssignment_6_2 ) )
            // InternalMyDsl.g:1033:2: ( rule__Class__AttributesAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_6_2()); 
            // InternalMyDsl.g:1034:2: ( rule__Class__AttributesAssignment_6_2 )
            // InternalMyDsl.g:1034:3: rule__Class__AttributesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2__Impl"


    // $ANTLR start "rule__Class__Group_6__3"
    // InternalMyDsl.g:1042:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalMyDsl.g:1047:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3"


    // $ANTLR start "rule__Class__Group_6__3__Impl"
    // InternalMyDsl.g:1054:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__Group_6_3__0 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( ( ( rule__Class__Group_6_3__0 )* ) )
            // InternalMyDsl.g:1059:1: ( ( rule__Class__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:1059:1: ( ( rule__Class__Group_6_3__0 )* )
            // InternalMyDsl.g:1060:2: ( rule__Class__Group_6_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_6_3()); 
            // InternalMyDsl.g:1061:2: ( rule__Class__Group_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1061:3: rule__Class__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3__Impl"


    // $ANTLR start "rule__Class__Group_6__4"
    // InternalMyDsl.g:1069:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( rule__Class__Group_6__4__Impl )
            // InternalMyDsl.g:1074:2: rule__Class__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4"


    // $ANTLR start "rule__Class__Group_6__4__Impl"
    // InternalMyDsl.g:1080:1: rule__Class__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( ( ')' ) )
            // InternalMyDsl.g:1085:1: ( ')' )
            {
            // InternalMyDsl.g:1085:1: ( ')' )
            // InternalMyDsl.g:1086:2: ')'
            {
             before(grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4__Impl"


    // $ANTLR start "rule__Class__Group_6_3__0"
    // InternalMyDsl.g:1096:1: rule__Class__Group_6_3__0 : rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 ;
    public final void rule__Class__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 )
            // InternalMyDsl.g:1101:2: rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0"


    // $ANTLR start "rule__Class__Group_6_3__0__Impl"
    // InternalMyDsl.g:1108:1: rule__Class__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( ( ',' ) )
            // InternalMyDsl.g:1113:1: ( ',' )
            {
            // InternalMyDsl.g:1113:1: ( ',' )
            // InternalMyDsl.g:1114:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0__Impl"


    // $ANTLR start "rule__Class__Group_6_3__1"
    // InternalMyDsl.g:1123:1: rule__Class__Group_6_3__1 : rule__Class__Group_6_3__1__Impl ;
    public final void rule__Class__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1127:1: ( rule__Class__Group_6_3__1__Impl )
            // InternalMyDsl.g:1128:2: rule__Class__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1"


    // $ANTLR start "rule__Class__Group_6_3__1__Impl"
    // InternalMyDsl.g:1134:1: rule__Class__Group_6_3__1__Impl : ( ( rule__Class__AttributesAssignment_6_3_1 ) ) ;
    public final void rule__Class__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( ( rule__Class__AttributesAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:1139:1: ( ( rule__Class__AttributesAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:1139:1: ( ( rule__Class__AttributesAssignment_6_3_1 ) )
            // InternalMyDsl.g:1140:2: ( rule__Class__AttributesAssignment_6_3_1 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_6_3_1()); 
            // InternalMyDsl.g:1141:2: ( rule__Class__AttributesAssignment_6_3_1 )
            // InternalMyDsl.g:1141:3: rule__Class__AttributesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1__Impl"


    // $ANTLR start "rule__Class__Group_7__0"
    // InternalMyDsl.g:1150:1: rule__Class__Group_7__0 : rule__Class__Group_7__0__Impl rule__Class__Group_7__1 ;
    public final void rule__Class__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( rule__Class__Group_7__0__Impl rule__Class__Group_7__1 )
            // InternalMyDsl.g:1155:2: rule__Class__Group_7__0__Impl rule__Class__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0"


    // $ANTLR start "rule__Class__Group_7__0__Impl"
    // InternalMyDsl.g:1162:1: rule__Class__Group_7__0__Impl : ( 'operations' ) ;
    public final void rule__Class__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( ( 'operations' ) )
            // InternalMyDsl.g:1167:1: ( 'operations' )
            {
            // InternalMyDsl.g:1167:1: ( 'operations' )
            // InternalMyDsl.g:1168:2: 'operations'
            {
             before(grammarAccess.getClassAccess().getOperationsKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getOperationsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0__Impl"


    // $ANTLR start "rule__Class__Group_7__1"
    // InternalMyDsl.g:1177:1: rule__Class__Group_7__1 : rule__Class__Group_7__1__Impl rule__Class__Group_7__2 ;
    public final void rule__Class__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( rule__Class__Group_7__1__Impl rule__Class__Group_7__2 )
            // InternalMyDsl.g:1182:2: rule__Class__Group_7__1__Impl rule__Class__Group_7__2
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1"


    // $ANTLR start "rule__Class__Group_7__1__Impl"
    // InternalMyDsl.g:1189:1: rule__Class__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Class__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( ( '(' ) )
            // InternalMyDsl.g:1194:1: ( '(' )
            {
            // InternalMyDsl.g:1194:1: ( '(' )
            // InternalMyDsl.g:1195:2: '('
            {
             before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1__Impl"


    // $ANTLR start "rule__Class__Group_7__2"
    // InternalMyDsl.g:1204:1: rule__Class__Group_7__2 : rule__Class__Group_7__2__Impl rule__Class__Group_7__3 ;
    public final void rule__Class__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( rule__Class__Group_7__2__Impl rule__Class__Group_7__3 )
            // InternalMyDsl.g:1209:2: rule__Class__Group_7__2__Impl rule__Class__Group_7__3
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2"


    // $ANTLR start "rule__Class__Group_7__2__Impl"
    // InternalMyDsl.g:1216:1: rule__Class__Group_7__2__Impl : ( ( rule__Class__OperationsAssignment_7_2 ) ) ;
    public final void rule__Class__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( ( ( rule__Class__OperationsAssignment_7_2 ) ) )
            // InternalMyDsl.g:1221:1: ( ( rule__Class__OperationsAssignment_7_2 ) )
            {
            // InternalMyDsl.g:1221:1: ( ( rule__Class__OperationsAssignment_7_2 ) )
            // InternalMyDsl.g:1222:2: ( rule__Class__OperationsAssignment_7_2 )
            {
             before(grammarAccess.getClassAccess().getOperationsAssignment_7_2()); 
            // InternalMyDsl.g:1223:2: ( rule__Class__OperationsAssignment_7_2 )
            // InternalMyDsl.g:1223:3: rule__Class__OperationsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__OperationsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getOperationsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2__Impl"


    // $ANTLR start "rule__Class__Group_7__3"
    // InternalMyDsl.g:1231:1: rule__Class__Group_7__3 : rule__Class__Group_7__3__Impl rule__Class__Group_7__4 ;
    public final void rule__Class__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1235:1: ( rule__Class__Group_7__3__Impl rule__Class__Group_7__4 )
            // InternalMyDsl.g:1236:2: rule__Class__Group_7__3__Impl rule__Class__Group_7__4
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__3"


    // $ANTLR start "rule__Class__Group_7__3__Impl"
    // InternalMyDsl.g:1243:1: rule__Class__Group_7__3__Impl : ( ( rule__Class__Group_7_3__0 )* ) ;
    public final void rule__Class__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( ( ( rule__Class__Group_7_3__0 )* ) )
            // InternalMyDsl.g:1248:1: ( ( rule__Class__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:1248:1: ( ( rule__Class__Group_7_3__0 )* )
            // InternalMyDsl.g:1249:2: ( rule__Class__Group_7_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_7_3()); 
            // InternalMyDsl.g:1250:2: ( rule__Class__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1250:3: rule__Class__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__3__Impl"


    // $ANTLR start "rule__Class__Group_7__4"
    // InternalMyDsl.g:1258:1: rule__Class__Group_7__4 : rule__Class__Group_7__4__Impl ;
    public final void rule__Class__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( rule__Class__Group_7__4__Impl )
            // InternalMyDsl.g:1263:2: rule__Class__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__4"


    // $ANTLR start "rule__Class__Group_7__4__Impl"
    // InternalMyDsl.g:1269:1: rule__Class__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Class__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( ')' ) )
            // InternalMyDsl.g:1274:1: ( ')' )
            {
            // InternalMyDsl.g:1274:1: ( ')' )
            // InternalMyDsl.g:1275:2: ')'
            {
             before(grammarAccess.getClassAccess().getRightParenthesisKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__4__Impl"


    // $ANTLR start "rule__Class__Group_7_3__0"
    // InternalMyDsl.g:1285:1: rule__Class__Group_7_3__0 : rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 ;
    public final void rule__Class__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1289:1: ( rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 )
            // InternalMyDsl.g:1290:2: rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__0"


    // $ANTLR start "rule__Class__Group_7_3__0__Impl"
    // InternalMyDsl.g:1297:1: rule__Class__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( ( ',' ) )
            // InternalMyDsl.g:1302:1: ( ',' )
            {
            // InternalMyDsl.g:1302:1: ( ',' )
            // InternalMyDsl.g:1303:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__0__Impl"


    // $ANTLR start "rule__Class__Group_7_3__1"
    // InternalMyDsl.g:1312:1: rule__Class__Group_7_3__1 : rule__Class__Group_7_3__1__Impl ;
    public final void rule__Class__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( rule__Class__Group_7_3__1__Impl )
            // InternalMyDsl.g:1317:2: rule__Class__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__1"


    // $ANTLR start "rule__Class__Group_7_3__1__Impl"
    // InternalMyDsl.g:1323:1: rule__Class__Group_7_3__1__Impl : ( ( rule__Class__OperationsAssignment_7_3_1 ) ) ;
    public final void rule__Class__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( ( rule__Class__OperationsAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:1328:1: ( ( rule__Class__OperationsAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:1328:1: ( ( rule__Class__OperationsAssignment_7_3_1 ) )
            // InternalMyDsl.g:1329:2: ( rule__Class__OperationsAssignment_7_3_1 )
            {
             before(grammarAccess.getClassAccess().getOperationsAssignment_7_3_1()); 
            // InternalMyDsl.g:1330:2: ( rule__Class__OperationsAssignment_7_3_1 )
            // InternalMyDsl.g:1330:3: rule__Class__OperationsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__OperationsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getOperationsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__1__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalMyDsl.g:1339:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1343:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalMyDsl.g:1344:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalMyDsl.g:1351:1: rule__Association__Group__0__Impl : ( () ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( ( () ) )
            // InternalMyDsl.g:1356:1: ( () )
            {
            // InternalMyDsl.g:1356:1: ( () )
            // InternalMyDsl.g:1357:2: ()
            {
             before(grammarAccess.getAssociationAccess().getAssociationAction_0()); 
            // InternalMyDsl.g:1358:2: ()
            // InternalMyDsl.g:1358:3: 
            {
            }

             after(grammarAccess.getAssociationAccess().getAssociationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalMyDsl.g:1366:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalMyDsl.g:1371:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalMyDsl.g:1378:1: rule__Association__Group__1__Impl : ( 'Association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( ( 'Association' ) )
            // InternalMyDsl.g:1383:1: ( 'Association' )
            {
            // InternalMyDsl.g:1383:1: ( 'Association' )
            // InternalMyDsl.g:1384:2: 'Association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalMyDsl.g:1393:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalMyDsl.g:1398:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalMyDsl.g:1405:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1410:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1410:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalMyDsl.g:1411:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1412:2: ( rule__Association__NameAssignment_2 )
            // InternalMyDsl.g:1412:3: rule__Association__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalMyDsl.g:1420:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalMyDsl.g:1425:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalMyDsl.g:1432:1: rule__Association__Group__3__Impl : ( '{' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( ( '{' ) )
            // InternalMyDsl.g:1437:1: ( '{' )
            {
            // InternalMyDsl.g:1437:1: ( '{' )
            // InternalMyDsl.g:1438:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalMyDsl.g:1447:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalMyDsl.g:1452:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalMyDsl.g:1459:1: rule__Association__Group__4__Impl : ( 'cardinalities' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( 'cardinalities' ) )
            // InternalMyDsl.g:1464:1: ( 'cardinalities' )
            {
            // InternalMyDsl.g:1464:1: ( 'cardinalities' )
            // InternalMyDsl.g:1465:2: 'cardinalities'
            {
             before(grammarAccess.getAssociationAccess().getCardinalitiesKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getCardinalitiesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalMyDsl.g:1474:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalMyDsl.g:1479:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalMyDsl.g:1486:1: rule__Association__Group__5__Impl : ( ( rule__Association__CardinalitiesAssignment_5 ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( ( ( rule__Association__CardinalitiesAssignment_5 ) ) )
            // InternalMyDsl.g:1491:1: ( ( rule__Association__CardinalitiesAssignment_5 ) )
            {
            // InternalMyDsl.g:1491:1: ( ( rule__Association__CardinalitiesAssignment_5 ) )
            // InternalMyDsl.g:1492:2: ( rule__Association__CardinalitiesAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getCardinalitiesAssignment_5()); 
            // InternalMyDsl.g:1493:2: ( rule__Association__CardinalitiesAssignment_5 )
            // InternalMyDsl.g:1493:3: rule__Association__CardinalitiesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Association__CardinalitiesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getCardinalitiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalMyDsl.g:1501:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalMyDsl.g:1506:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Association__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalMyDsl.g:1513:1: rule__Association__Group__6__Impl : ( ',' ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( ( ',' ) )
            // InternalMyDsl.g:1518:1: ( ',' )
            {
            // InternalMyDsl.g:1518:1: ( ',' )
            // InternalMyDsl.g:1519:2: ','
            {
             before(grammarAccess.getAssociationAccess().getCommaKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group__7"
    // InternalMyDsl.g:1528:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1532:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalMyDsl.g:1533:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7"


    // $ANTLR start "rule__Association__Group__7__Impl"
    // InternalMyDsl.g:1540:1: rule__Association__Group__7__Impl : ( 'targetclass' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( ( 'targetclass' ) )
            // InternalMyDsl.g:1545:1: ( 'targetclass' )
            {
            // InternalMyDsl.g:1545:1: ( 'targetclass' )
            // InternalMyDsl.g:1546:2: 'targetclass'
            {
             before(grammarAccess.getAssociationAccess().getTargetclassKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getTargetclassKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__8"
    // InternalMyDsl.g:1555:1: rule__Association__Group__8 : rule__Association__Group__8__Impl rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( rule__Association__Group__8__Impl rule__Association__Group__9 )
            // InternalMyDsl.g:1560:2: rule__Association__Group__8__Impl rule__Association__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Association__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__8"


    // $ANTLR start "rule__Association__Group__8__Impl"
    // InternalMyDsl.g:1567:1: rule__Association__Group__8__Impl : ( ( rule__Association__TargetclassAssignment_8 ) ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( ( ( rule__Association__TargetclassAssignment_8 ) ) )
            // InternalMyDsl.g:1572:1: ( ( rule__Association__TargetclassAssignment_8 ) )
            {
            // InternalMyDsl.g:1572:1: ( ( rule__Association__TargetclassAssignment_8 ) )
            // InternalMyDsl.g:1573:2: ( rule__Association__TargetclassAssignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getTargetclassAssignment_8()); 
            // InternalMyDsl.g:1574:2: ( rule__Association__TargetclassAssignment_8 )
            // InternalMyDsl.g:1574:3: rule__Association__TargetclassAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Association__TargetclassAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetclassAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__8__Impl"


    // $ANTLR start "rule__Association__Group__9"
    // InternalMyDsl.g:1582:1: rule__Association__Group__9 : rule__Association__Group__9__Impl rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1586:1: ( rule__Association__Group__9__Impl rule__Association__Group__10 )
            // InternalMyDsl.g:1587:2: rule__Association__Group__9__Impl rule__Association__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Association__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__9"


    // $ANTLR start "rule__Association__Group__9__Impl"
    // InternalMyDsl.g:1594:1: rule__Association__Group__9__Impl : ( ',' ) ;
    public final void rule__Association__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( ( ',' ) )
            // InternalMyDsl.g:1599:1: ( ',' )
            {
            // InternalMyDsl.g:1599:1: ( ',' )
            // InternalMyDsl.g:1600:2: ','
            {
             before(grammarAccess.getAssociationAccess().getCommaKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__9__Impl"


    // $ANTLR start "rule__Association__Group__10"
    // InternalMyDsl.g:1609:1: rule__Association__Group__10 : rule__Association__Group__10__Impl rule__Association__Group__11 ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( rule__Association__Group__10__Impl rule__Association__Group__11 )
            // InternalMyDsl.g:1614:2: rule__Association__Group__10__Impl rule__Association__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__10"


    // $ANTLR start "rule__Association__Group__10__Impl"
    // InternalMyDsl.g:1621:1: rule__Association__Group__10__Impl : ( 'sourceclass' ) ;
    public final void rule__Association__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( ( 'sourceclass' ) )
            // InternalMyDsl.g:1626:1: ( 'sourceclass' )
            {
            // InternalMyDsl.g:1626:1: ( 'sourceclass' )
            // InternalMyDsl.g:1627:2: 'sourceclass'
            {
             before(grammarAccess.getAssociationAccess().getSourceclassKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getSourceclassKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__10__Impl"


    // $ANTLR start "rule__Association__Group__11"
    // InternalMyDsl.g:1636:1: rule__Association__Group__11 : rule__Association__Group__11__Impl rule__Association__Group__12 ;
    public final void rule__Association__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1640:1: ( rule__Association__Group__11__Impl rule__Association__Group__12 )
            // InternalMyDsl.g:1641:2: rule__Association__Group__11__Impl rule__Association__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Association__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__11"


    // $ANTLR start "rule__Association__Group__11__Impl"
    // InternalMyDsl.g:1648:1: rule__Association__Group__11__Impl : ( ( rule__Association__SourceclassAssignment_11 ) ) ;
    public final void rule__Association__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( ( ( rule__Association__SourceclassAssignment_11 ) ) )
            // InternalMyDsl.g:1653:1: ( ( rule__Association__SourceclassAssignment_11 ) )
            {
            // InternalMyDsl.g:1653:1: ( ( rule__Association__SourceclassAssignment_11 ) )
            // InternalMyDsl.g:1654:2: ( rule__Association__SourceclassAssignment_11 )
            {
             before(grammarAccess.getAssociationAccess().getSourceclassAssignment_11()); 
            // InternalMyDsl.g:1655:2: ( rule__Association__SourceclassAssignment_11 )
            // InternalMyDsl.g:1655:3: rule__Association__SourceclassAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Association__SourceclassAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceclassAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__11__Impl"


    // $ANTLR start "rule__Association__Group__12"
    // InternalMyDsl.g:1663:1: rule__Association__Group__12 : rule__Association__Group__12__Impl ;
    public final void rule__Association__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( rule__Association__Group__12__Impl )
            // InternalMyDsl.g:1668:2: rule__Association__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__12"


    // $ANTLR start "rule__Association__Group__12__Impl"
    // InternalMyDsl.g:1674:1: rule__Association__Group__12__Impl : ( '}' ) ;
    public final void rule__Association__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( ( '}' ) )
            // InternalMyDsl.g:1679:1: ( '}' )
            {
            // InternalMyDsl.g:1679:1: ( '}' )
            // InternalMyDsl.g:1680:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__12__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:1690:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1694:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:1695:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:1702:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( ( () ) )
            // InternalMyDsl.g:1707:1: ( () )
            {
            // InternalMyDsl.g:1707:1: ( () )
            // InternalMyDsl.g:1708:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalMyDsl.g:1709:2: ()
            // InternalMyDsl.g:1709:3: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:1717:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1721:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:1722:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:1729:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1734:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1734:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:1735:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1736:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:1736:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:1744:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1748:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:1749:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:1756:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( ( ':' ) )
            // InternalMyDsl.g:1761:1: ( ':' )
            {
            // InternalMyDsl.g:1761:1: ( ':' )
            // InternalMyDsl.g:1762:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:1771:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1775:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:1776:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:1782:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:1787:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:1787:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalMyDsl.g:1788:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:1789:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalMyDsl.g:1789:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalMyDsl.g:1798:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1802:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalMyDsl.g:1803:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalMyDsl.g:1810:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( ( () ) )
            // InternalMyDsl.g:1815:1: ( () )
            {
            // InternalMyDsl.g:1815:1: ( () )
            // InternalMyDsl.g:1816:2: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // InternalMyDsl.g:1817:2: ()
            // InternalMyDsl.g:1817:3: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalMyDsl.g:1825:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1829:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalMyDsl.g:1830:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalMyDsl.g:1837:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__TypeReturnAssignment_1 )? ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( ( ( rule__Operation__TypeReturnAssignment_1 )? ) )
            // InternalMyDsl.g:1842:1: ( ( rule__Operation__TypeReturnAssignment_1 )? )
            {
            // InternalMyDsl.g:1842:1: ( ( rule__Operation__TypeReturnAssignment_1 )? )
            // InternalMyDsl.g:1843:2: ( rule__Operation__TypeReturnAssignment_1 )?
            {
             before(grammarAccess.getOperationAccess().getTypeReturnAssignment_1()); 
            // InternalMyDsl.g:1844:2: ( rule__Operation__TypeReturnAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=26 && LA11_0<=29)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1844:3: rule__Operation__TypeReturnAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__TypeReturnAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getTypeReturnAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalMyDsl.g:1852:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1856:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalMyDsl.g:1857:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalMyDsl.g:1864:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1869:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1869:1: ( ( rule__Operation__NameAssignment_2 ) )
            // InternalMyDsl.g:1870:2: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1871:2: ( rule__Operation__NameAssignment_2 )
            // InternalMyDsl.g:1871:3: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalMyDsl.g:1879:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalMyDsl.g:1884:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalMyDsl.g:1891:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( ( '(' ) )
            // InternalMyDsl.g:1896:1: ( '(' )
            {
            // InternalMyDsl.g:1896:1: ( '(' )
            // InternalMyDsl.g:1897:2: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalMyDsl.g:1906:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1910:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalMyDsl.g:1911:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalMyDsl.g:1918:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__ParametersAssignment_4 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( ( ( rule__Operation__ParametersAssignment_4 )? ) )
            // InternalMyDsl.g:1923:1: ( ( rule__Operation__ParametersAssignment_4 )? )
            {
            // InternalMyDsl.g:1923:1: ( ( rule__Operation__ParametersAssignment_4 )? )
            // InternalMyDsl.g:1924:2: ( rule__Operation__ParametersAssignment_4 )?
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_4()); 
            // InternalMyDsl.g:1925:2: ( rule__Operation__ParametersAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1925:3: rule__Operation__ParametersAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__ParametersAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalMyDsl.g:1933:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1937:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalMyDsl.g:1938:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalMyDsl.g:1945:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )* ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( ( ( rule__Operation__Group_5__0 )* ) )
            // InternalMyDsl.g:1950:1: ( ( rule__Operation__Group_5__0 )* )
            {
            // InternalMyDsl.g:1950:1: ( ( rule__Operation__Group_5__0 )* )
            // InternalMyDsl.g:1951:2: ( rule__Operation__Group_5__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // InternalMyDsl.g:1952:2: ( rule__Operation__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1952:3: rule__Operation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Operation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalMyDsl.g:1960:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1964:1: ( rule__Operation__Group__6__Impl )
            // InternalMyDsl.g:1965:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalMyDsl.g:1971:1: rule__Operation__Group__6__Impl : ( ')' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( ( ')' ) )
            // InternalMyDsl.g:1976:1: ( ')' )
            {
            // InternalMyDsl.g:1976:1: ( ')' )
            // InternalMyDsl.g:1977:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // InternalMyDsl.g:1987:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1991:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // InternalMyDsl.g:1992:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // InternalMyDsl.g:1999:1: rule__Operation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( ',' ) )
            // InternalMyDsl.g:2004:1: ( ',' )
            {
            // InternalMyDsl.g:2004:1: ( ',' )
            // InternalMyDsl.g:2005:2: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // InternalMyDsl.g:2014:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2018:1: ( rule__Operation__Group_5__1__Impl )
            // InternalMyDsl.g:2019:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // InternalMyDsl.g:2025:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ParametersAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( ( ( rule__Operation__ParametersAssignment_5_1 ) ) )
            // InternalMyDsl.g:2030:1: ( ( rule__Operation__ParametersAssignment_5_1 ) )
            {
            // InternalMyDsl.g:2030:1: ( ( rule__Operation__ParametersAssignment_5_1 ) )
            // InternalMyDsl.g:2031:2: ( rule__Operation__ParametersAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_5_1()); 
            // InternalMyDsl.g:2032:2: ( rule__Operation__ParametersAssignment_5_1 )
            // InternalMyDsl.g:2032:3: rule__Operation__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParametersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // InternalMyDsl.g:2041:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2045:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalMyDsl.g:2046:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // InternalMyDsl.g:2053:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( ( () ) )
            // InternalMyDsl.g:2058:1: ( () )
            {
            // InternalMyDsl.g:2058:1: ( () )
            // InternalMyDsl.g:2059:2: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // InternalMyDsl.g:2060:2: ()
            // InternalMyDsl.g:2060:3: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // InternalMyDsl.g:2068:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2072:1: ( rule__BooleanType__Group__1__Impl )
            // InternalMyDsl.g:2073:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // InternalMyDsl.g:2079:1: rule__BooleanType__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( ( 'Boolean' ) )
            // InternalMyDsl.g:2084:1: ( 'Boolean' )
            {
            // InternalMyDsl.g:2084:1: ( 'Boolean' )
            // InternalMyDsl.g:2085:2: 'Boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__RealType__Group__0"
    // InternalMyDsl.g:2095:1: rule__RealType__Group__0 : rule__RealType__Group__0__Impl rule__RealType__Group__1 ;
    public final void rule__RealType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( rule__RealType__Group__0__Impl rule__RealType__Group__1 )
            // InternalMyDsl.g:2100:2: rule__RealType__Group__0__Impl rule__RealType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__RealType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealType__Group__0"


    // $ANTLR start "rule__RealType__Group__0__Impl"
    // InternalMyDsl.g:2107:1: rule__RealType__Group__0__Impl : ( () ) ;
    public final void rule__RealType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( ( () ) )
            // InternalMyDsl.g:2112:1: ( () )
            {
            // InternalMyDsl.g:2112:1: ( () )
            // InternalMyDsl.g:2113:2: ()
            {
             before(grammarAccess.getRealTypeAccess().getRealTypeAction_0()); 
            // InternalMyDsl.g:2114:2: ()
            // InternalMyDsl.g:2114:3: 
            {
            }

             after(grammarAccess.getRealTypeAccess().getRealTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealType__Group__0__Impl"


    // $ANTLR start "rule__RealType__Group__1"
    // InternalMyDsl.g:2122:1: rule__RealType__Group__1 : rule__RealType__Group__1__Impl ;
    public final void rule__RealType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2126:1: ( rule__RealType__Group__1__Impl )
            // InternalMyDsl.g:2127:2: rule__RealType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealType__Group__1"


    // $ANTLR start "rule__RealType__Group__1__Impl"
    // InternalMyDsl.g:2133:1: rule__RealType__Group__1__Impl : ( 'Real' ) ;
    public final void rule__RealType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( ( 'Real' ) )
            // InternalMyDsl.g:2138:1: ( 'Real' )
            {
            // InternalMyDsl.g:2138:1: ( 'Real' )
            // InternalMyDsl.g:2139:2: 'Real'
            {
             before(grammarAccess.getRealTypeAccess().getRealKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRealTypeAccess().getRealKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealType__Group__1__Impl"


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalMyDsl.g:2149:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2153:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalMyDsl.g:2154:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__IntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0"


    // $ANTLR start "rule__IntegerType__Group__0__Impl"
    // InternalMyDsl.g:2161:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( ( () ) )
            // InternalMyDsl.g:2166:1: ( () )
            {
            // InternalMyDsl.g:2166:1: ( () )
            // InternalMyDsl.g:2167:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalMyDsl.g:2168:2: ()
            // InternalMyDsl.g:2168:3: 
            {
            }

             after(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0__Impl"


    // $ANTLR start "rule__IntegerType__Group__1"
    // InternalMyDsl.g:2176:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2180:1: ( rule__IntegerType__Group__1__Impl )
            // InternalMyDsl.g:2181:2: rule__IntegerType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__1"


    // $ANTLR start "rule__IntegerType__Group__1__Impl"
    // InternalMyDsl.g:2187:1: rule__IntegerType__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( ( 'Integer' ) )
            // InternalMyDsl.g:2192:1: ( 'Integer' )
            {
            // InternalMyDsl.g:2192:1: ( 'Integer' )
            // InternalMyDsl.g:2193:2: 'Integer'
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalMyDsl.g:2203:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2207:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalMyDsl.g:2208:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalMyDsl.g:2215:1: rule__Enumeration__Group__0__Impl : ( () ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( ( () ) )
            // InternalMyDsl.g:2220:1: ( () )
            {
            // InternalMyDsl.g:2220:1: ( () )
            // InternalMyDsl.g:2221:2: ()
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 
            // InternalMyDsl.g:2222:2: ()
            // InternalMyDsl.g:2222:3: 
            {
            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalMyDsl.g:2230:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2234:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalMyDsl.g:2235:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalMyDsl.g:2242:1: rule__Enumeration__Group__1__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( ( 'Enumeration' ) )
            // InternalMyDsl.g:2247:1: ( 'Enumeration' )
            {
            // InternalMyDsl.g:2247:1: ( 'Enumeration' )
            // InternalMyDsl.g:2248:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalMyDsl.g:2257:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2261:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalMyDsl.g:2262:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalMyDsl.g:2269:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2274:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2274:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // InternalMyDsl.g:2275:2: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2276:2: ( rule__Enumeration__NameAssignment_2 )
            // InternalMyDsl.g:2276:3: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalMyDsl.g:2284:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2288:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalMyDsl.g:2289:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalMyDsl.g:2296:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( ( '{' ) )
            // InternalMyDsl.g:2301:1: ( '{' )
            {
            // InternalMyDsl.g:2301:1: ( '{' )
            // InternalMyDsl.g:2302:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalMyDsl.g:2311:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2315:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalMyDsl.g:2316:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalMyDsl.g:2323:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__VariableAssignment_4 ) ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( ( ( rule__Enumeration__VariableAssignment_4 ) ) )
            // InternalMyDsl.g:2328:1: ( ( rule__Enumeration__VariableAssignment_4 ) )
            {
            // InternalMyDsl.g:2328:1: ( ( rule__Enumeration__VariableAssignment_4 ) )
            // InternalMyDsl.g:2329:2: ( rule__Enumeration__VariableAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getVariableAssignment_4()); 
            // InternalMyDsl.g:2330:2: ( rule__Enumeration__VariableAssignment_4 )
            // InternalMyDsl.g:2330:3: rule__Enumeration__VariableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__VariableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getVariableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalMyDsl.g:2338:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2342:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalMyDsl.g:2343:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalMyDsl.g:2350:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__Group_5__0 )* ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( ( ( rule__Enumeration__Group_5__0 )* ) )
            // InternalMyDsl.g:2355:1: ( ( rule__Enumeration__Group_5__0 )* )
            {
            // InternalMyDsl.g:2355:1: ( ( rule__Enumeration__Group_5__0 )* )
            // InternalMyDsl.g:2356:2: ( rule__Enumeration__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_5()); 
            // InternalMyDsl.g:2357:2: ( rule__Enumeration__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2357:3: rule__Enumeration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Enumeration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__6"
    // InternalMyDsl.g:2365:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2369:1: ( rule__Enumeration__Group__6__Impl )
            // InternalMyDsl.g:2370:2: rule__Enumeration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6"


    // $ANTLR start "rule__Enumeration__Group__6__Impl"
    // InternalMyDsl.g:2376:1: rule__Enumeration__Group__6__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( ( '}' ) )
            // InternalMyDsl.g:2381:1: ( '}' )
            {
            // InternalMyDsl.g:2381:1: ( '}' )
            // InternalMyDsl.g:2382:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__0"
    // InternalMyDsl.g:2392:1: rule__Enumeration__Group_5__0 : rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 ;
    public final void rule__Enumeration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2396:1: ( rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 )
            // InternalMyDsl.g:2397:2: rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__0"


    // $ANTLR start "rule__Enumeration__Group_5__0__Impl"
    // InternalMyDsl.g:2404:1: rule__Enumeration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( ( ',' ) )
            // InternalMyDsl.g:2409:1: ( ',' )
            {
            // InternalMyDsl.g:2409:1: ( ',' )
            // InternalMyDsl.g:2410:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__1"
    // InternalMyDsl.g:2419:1: rule__Enumeration__Group_5__1 : rule__Enumeration__Group_5__1__Impl ;
    public final void rule__Enumeration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2423:1: ( rule__Enumeration__Group_5__1__Impl )
            // InternalMyDsl.g:2424:2: rule__Enumeration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__1"


    // $ANTLR start "rule__Enumeration__Group_5__1__Impl"
    // InternalMyDsl.g:2430:1: rule__Enumeration__Group_5__1__Impl : ( ( rule__Enumeration__VariableAssignment_5_1 ) ) ;
    public final void rule__Enumeration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( ( ( rule__Enumeration__VariableAssignment_5_1 ) ) )
            // InternalMyDsl.g:2435:1: ( ( rule__Enumeration__VariableAssignment_5_1 ) )
            {
            // InternalMyDsl.g:2435:1: ( ( rule__Enumeration__VariableAssignment_5_1 ) )
            // InternalMyDsl.g:2436:2: ( rule__Enumeration__VariableAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationAccess().getVariableAssignment_5_1()); 
            // InternalMyDsl.g:2437:2: ( rule__Enumeration__VariableAssignment_5_1 )
            // InternalMyDsl.g:2437:3: rule__Enumeration__VariableAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__VariableAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getVariableAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMyDsl.g:2446:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2450:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMyDsl.g:2451:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2458:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( ( () ) )
            // InternalMyDsl.g:2463:1: ( () )
            {
            // InternalMyDsl.g:2463:1: ( () )
            // InternalMyDsl.g:2464:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalMyDsl.g:2465:2: ()
            // InternalMyDsl.g:2465:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMyDsl.g:2473:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2477:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMyDsl.g:2478:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2485:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2490:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2490:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMyDsl.g:2491:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2492:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMyDsl.g:2492:3: rule__Parameter__NameAssignment_1
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
    // InternalMyDsl.g:2500:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2504:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalMyDsl.g:2505:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2512:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( ( ':' ) )
            // InternalMyDsl.g:2517:1: ( ':' )
            {
            // InternalMyDsl.g:2517:1: ( ':' )
            // InternalMyDsl.g:2518:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:2527:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2531:1: ( rule__Parameter__Group__3__Impl )
            // InternalMyDsl.g:2532:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2538:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__TypeAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( ( ( rule__Parameter__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:2543:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:2543:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            // InternalMyDsl.g:2544:2: ( rule__Parameter__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:2545:2: ( rule__Parameter__TypeAssignment_3 )
            // InternalMyDsl.g:2545:3: rule__Parameter__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Cardinalities__Group__0"
    // InternalMyDsl.g:2554:1: rule__Cardinalities__Group__0 : rule__Cardinalities__Group__0__Impl rule__Cardinalities__Group__1 ;
    public final void rule__Cardinalities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2558:1: ( rule__Cardinalities__Group__0__Impl rule__Cardinalities__Group__1 )
            // InternalMyDsl.g:2559:2: rule__Cardinalities__Group__0__Impl rule__Cardinalities__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Cardinalities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalities__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__0"


    // $ANTLR start "rule__Cardinalities__Group__0__Impl"
    // InternalMyDsl.g:2566:1: rule__Cardinalities__Group__0__Impl : ( () ) ;
    public final void rule__Cardinalities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( ( () ) )
            // InternalMyDsl.g:2571:1: ( () )
            {
            // InternalMyDsl.g:2571:1: ( () )
            // InternalMyDsl.g:2572:2: ()
            {
             before(grammarAccess.getCardinalitiesAccess().getCardinalitiesAction_0()); 
            // InternalMyDsl.g:2573:2: ()
            // InternalMyDsl.g:2573:3: 
            {
            }

             after(grammarAccess.getCardinalitiesAccess().getCardinalitiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__0__Impl"


    // $ANTLR start "rule__Cardinalities__Group__1"
    // InternalMyDsl.g:2581:1: rule__Cardinalities__Group__1 : rule__Cardinalities__Group__1__Impl rule__Cardinalities__Group__2 ;
    public final void rule__Cardinalities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2585:1: ( rule__Cardinalities__Group__1__Impl rule__Cardinalities__Group__2 )
            // InternalMyDsl.g:2586:2: rule__Cardinalities__Group__1__Impl rule__Cardinalities__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Cardinalities__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalities__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__1"


    // $ANTLR start "rule__Cardinalities__Group__1__Impl"
    // InternalMyDsl.g:2593:1: rule__Cardinalities__Group__1__Impl : ( '{' ) ;
    public final void rule__Cardinalities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( ( '{' ) )
            // InternalMyDsl.g:2598:1: ( '{' )
            {
            // InternalMyDsl.g:2598:1: ( '{' )
            // InternalMyDsl.g:2599:2: '{'
            {
             before(grammarAccess.getCardinalitiesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCardinalitiesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__1__Impl"


    // $ANTLR start "rule__Cardinalities__Group__2"
    // InternalMyDsl.g:2608:1: rule__Cardinalities__Group__2 : rule__Cardinalities__Group__2__Impl rule__Cardinalities__Group__3 ;
    public final void rule__Cardinalities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2612:1: ( rule__Cardinalities__Group__2__Impl rule__Cardinalities__Group__3 )
            // InternalMyDsl.g:2613:2: rule__Cardinalities__Group__2__Impl rule__Cardinalities__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Cardinalities__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalities__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__2"


    // $ANTLR start "rule__Cardinalities__Group__2__Impl"
    // InternalMyDsl.g:2620:1: rule__Cardinalities__Group__2__Impl : ( ( rule__Cardinalities__LowerboundAssignment_2 ) ) ;
    public final void rule__Cardinalities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( ( ( rule__Cardinalities__LowerboundAssignment_2 ) ) )
            // InternalMyDsl.g:2625:1: ( ( rule__Cardinalities__LowerboundAssignment_2 ) )
            {
            // InternalMyDsl.g:2625:1: ( ( rule__Cardinalities__LowerboundAssignment_2 ) )
            // InternalMyDsl.g:2626:2: ( rule__Cardinalities__LowerboundAssignment_2 )
            {
             before(grammarAccess.getCardinalitiesAccess().getLowerboundAssignment_2()); 
            // InternalMyDsl.g:2627:2: ( rule__Cardinalities__LowerboundAssignment_2 )
            // InternalMyDsl.g:2627:3: rule__Cardinalities__LowerboundAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalities__LowerboundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCardinalitiesAccess().getLowerboundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__2__Impl"


    // $ANTLR start "rule__Cardinalities__Group__3"
    // InternalMyDsl.g:2635:1: rule__Cardinalities__Group__3 : rule__Cardinalities__Group__3__Impl rule__Cardinalities__Group__4 ;
    public final void rule__Cardinalities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2639:1: ( rule__Cardinalities__Group__3__Impl rule__Cardinalities__Group__4 )
            // InternalMyDsl.g:2640:2: rule__Cardinalities__Group__3__Impl rule__Cardinalities__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Cardinalities__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalities__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__3"


    // $ANTLR start "rule__Cardinalities__Group__3__Impl"
    // InternalMyDsl.g:2647:1: rule__Cardinalities__Group__3__Impl : ( ',' ) ;
    public final void rule__Cardinalities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( ( ',' ) )
            // InternalMyDsl.g:2652:1: ( ',' )
            {
            // InternalMyDsl.g:2652:1: ( ',' )
            // InternalMyDsl.g:2653:2: ','
            {
             before(grammarAccess.getCardinalitiesAccess().getCommaKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCardinalitiesAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__3__Impl"


    // $ANTLR start "rule__Cardinalities__Group__4"
    // InternalMyDsl.g:2662:1: rule__Cardinalities__Group__4 : rule__Cardinalities__Group__4__Impl rule__Cardinalities__Group__5 ;
    public final void rule__Cardinalities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2666:1: ( rule__Cardinalities__Group__4__Impl rule__Cardinalities__Group__5 )
            // InternalMyDsl.g:2667:2: rule__Cardinalities__Group__4__Impl rule__Cardinalities__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Cardinalities__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalities__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__4"


    // $ANTLR start "rule__Cardinalities__Group__4__Impl"
    // InternalMyDsl.g:2674:1: rule__Cardinalities__Group__4__Impl : ( ( rule__Cardinalities__UpperboundAssignment_4 ) ) ;
    public final void rule__Cardinalities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( ( ( rule__Cardinalities__UpperboundAssignment_4 ) ) )
            // InternalMyDsl.g:2679:1: ( ( rule__Cardinalities__UpperboundAssignment_4 ) )
            {
            // InternalMyDsl.g:2679:1: ( ( rule__Cardinalities__UpperboundAssignment_4 ) )
            // InternalMyDsl.g:2680:2: ( rule__Cardinalities__UpperboundAssignment_4 )
            {
             before(grammarAccess.getCardinalitiesAccess().getUpperboundAssignment_4()); 
            // InternalMyDsl.g:2681:2: ( rule__Cardinalities__UpperboundAssignment_4 )
            // InternalMyDsl.g:2681:3: rule__Cardinalities__UpperboundAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalities__UpperboundAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCardinalitiesAccess().getUpperboundAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__4__Impl"


    // $ANTLR start "rule__Cardinalities__Group__5"
    // InternalMyDsl.g:2689:1: rule__Cardinalities__Group__5 : rule__Cardinalities__Group__5__Impl ;
    public final void rule__Cardinalities__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2693:1: ( rule__Cardinalities__Group__5__Impl )
            // InternalMyDsl.g:2694:2: rule__Cardinalities__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalities__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__5"


    // $ANTLR start "rule__Cardinalities__Group__5__Impl"
    // InternalMyDsl.g:2700:1: rule__Cardinalities__Group__5__Impl : ( '}' ) ;
    public final void rule__Cardinalities__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( ( '}' ) )
            // InternalMyDsl.g:2705:1: ( '}' )
            {
            // InternalMyDsl.g:2705:1: ( '}' )
            // InternalMyDsl.g:2706:2: '}'
            {
             before(grammarAccess.getCardinalitiesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCardinalitiesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__Group__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:2716:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2720:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:2721:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:2728:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2732:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2733:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2733:1: ( ( '-' )? )
            // InternalMyDsl.g:2734:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2735:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2735:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:2743:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2747:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:2748:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:2754:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2759:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2759:1: ( RULE_INT )
            // InternalMyDsl.g:2760:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagram__NameAssignment_2"
    // InternalMyDsl.g:2770:1: rule__ClassDiagram__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ClassDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2774:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2775:2: ( ruleEString )
            {
            // InternalMyDsl.g:2775:2: ( ruleEString )
            // InternalMyDsl.g:2776:3: ruleEString
            {
             before(grammarAccess.getClassDiagramAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__NameAssignment_2"


    // $ANTLR start "rule__ClassDiagram__EntitiesAssignment_4"
    // InternalMyDsl.g:2785:1: rule__ClassDiagram__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__ClassDiagram__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:2790:2: ( ruleEntity )
            {
            // InternalMyDsl.g:2790:2: ( ruleEntity )
            // InternalMyDsl.g:2791:3: ruleEntity
            {
             before(grammarAccess.getClassDiagramAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__EntitiesAssignment_4"


    // $ANTLR start "rule__Class__AbstractAssignment_1"
    // InternalMyDsl.g:2800:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( ( ( 'abstract' ) ) )
            // InternalMyDsl.g:2805:2: ( ( 'abstract' ) )
            {
            // InternalMyDsl.g:2805:2: ( ( 'abstract' ) )
            // InternalMyDsl.g:2806:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalMyDsl.g:2807:3: ( 'abstract' )
            // InternalMyDsl.g:2808:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_3"
    // InternalMyDsl.g:2819:1: rule__Class__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2823:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2824:2: ( ruleEString )
            {
            // InternalMyDsl.g:2824:2: ( ruleEString )
            // InternalMyDsl.g:2825:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3"


    // $ANTLR start "rule__Class__ExtendsAssignment_4_1"
    // InternalMyDsl.g:2834:1: rule__Class__ExtendsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2838:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2839:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2839:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2840:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getExtendsClassCrossReference_4_1_0()); 
            // InternalMyDsl.g:2841:3: ( ruleEString )
            // InternalMyDsl.g:2842:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getExtendsClassEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getExtendsClassEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getExtendsClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ExtendsAssignment_4_1"


    // $ANTLR start "rule__Class__AttributesAssignment_6_2"
    // InternalMyDsl.g:2853:1: rule__Class__AttributesAssignment_6_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:2858:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:2858:2: ( ruleAttribute )
            // InternalMyDsl.g:2859:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_6_2"


    // $ANTLR start "rule__Class__AttributesAssignment_6_3_1"
    // InternalMyDsl.g:2868:1: rule__Class__AttributesAssignment_6_3_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:2873:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:2873:2: ( ruleAttribute )
            // InternalMyDsl.g:2874:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_6_3_1"


    // $ANTLR start "rule__Class__OperationsAssignment_7_2"
    // InternalMyDsl.g:2883:1: rule__Class__OperationsAssignment_7_2 : ( ruleOperation ) ;
    public final void rule__Class__OperationsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2888:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2888:2: ( ruleOperation )
            // InternalMyDsl.g:2889:3: ruleOperation
            {
             before(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OperationsAssignment_7_2"


    // $ANTLR start "rule__Class__OperationsAssignment_7_3_1"
    // InternalMyDsl.g:2898:1: rule__Class__OperationsAssignment_7_3_1 : ( ruleOperation ) ;
    public final void rule__Class__OperationsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2902:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2903:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2903:2: ( ruleOperation )
            // InternalMyDsl.g:2904:3: ruleOperation
            {
             before(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OperationsAssignment_7_3_1"


    // $ANTLR start "rule__Association__NameAssignment_2"
    // InternalMyDsl.g:2913:1: rule__Association__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2917:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2918:2: ( ruleEString )
            {
            // InternalMyDsl.g:2918:2: ( ruleEString )
            // InternalMyDsl.g:2919:3: ruleEString
            {
             before(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_2"


    // $ANTLR start "rule__Association__CardinalitiesAssignment_5"
    // InternalMyDsl.g:2928:1: rule__Association__CardinalitiesAssignment_5 : ( ruleCardinalities ) ;
    public final void rule__Association__CardinalitiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( ( ruleCardinalities ) )
            // InternalMyDsl.g:2933:2: ( ruleCardinalities )
            {
            // InternalMyDsl.g:2933:2: ( ruleCardinalities )
            // InternalMyDsl.g:2934:3: ruleCardinalities
            {
             before(grammarAccess.getAssociationAccess().getCardinalitiesCardinalitiesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalities();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCardinalitiesCardinalitiesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__CardinalitiesAssignment_5"


    // $ANTLR start "rule__Association__TargetclassAssignment_8"
    // InternalMyDsl.g:2943:1: rule__Association__TargetclassAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Association__TargetclassAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2947:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2948:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2948:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2949:3: ( ruleEString )
            {
             before(grammarAccess.getAssociationAccess().getTargetclassClassCrossReference_8_0()); 
            // InternalMyDsl.g:2950:3: ( ruleEString )
            // InternalMyDsl.g:2951:4: ruleEString
            {
             before(grammarAccess.getAssociationAccess().getTargetclassClassEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getTargetclassClassEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetclassClassCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__TargetclassAssignment_8"


    // $ANTLR start "rule__Association__SourceclassAssignment_11"
    // InternalMyDsl.g:2962:1: rule__Association__SourceclassAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__Association__SourceclassAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2967:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2967:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2968:3: ( ruleEString )
            {
             before(grammarAccess.getAssociationAccess().getSourceclassClassCrossReference_11_0()); 
            // InternalMyDsl.g:2969:3: ( ruleEString )
            // InternalMyDsl.g:2970:4: ruleEString
            {
             before(grammarAccess.getAssociationAccess().getSourceclassClassEStringParserRuleCall_11_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getSourceclassClassEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getSourceclassClassCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__SourceclassAssignment_11"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:2981:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2985:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2986:2: ( ruleEString )
            {
            // InternalMyDsl.g:2986:2: ( ruleEString )
            // InternalMyDsl.g:2987:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalMyDsl.g:2996:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3000:1: ( ( ruleType ) )
            // InternalMyDsl.g:3001:2: ( ruleType )
            {
            // InternalMyDsl.g:3001:2: ( ruleType )
            // InternalMyDsl.g:3002:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Operation__TypeReturnAssignment_1"
    // InternalMyDsl.g:3011:1: rule__Operation__TypeReturnAssignment_1 : ( ruleType ) ;
    public final void rule__Operation__TypeReturnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3015:1: ( ( ruleType ) )
            // InternalMyDsl.g:3016:2: ( ruleType )
            {
            // InternalMyDsl.g:3016:2: ( ruleType )
            // InternalMyDsl.g:3017:3: ruleType
            {
             before(grammarAccess.getOperationAccess().getTypeReturnTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getTypeReturnTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeReturnAssignment_1"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // InternalMyDsl.g:3026:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3030:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3031:2: ( ruleEString )
            {
            // InternalMyDsl.g:3031:2: ( ruleEString )
            // InternalMyDsl.g:3032:3: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ParametersAssignment_4"
    // InternalMyDsl.g:3041:1: rule__Operation__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( ( ruleParameter ) )
            // InternalMyDsl.g:3046:2: ( ruleParameter )
            {
            // InternalMyDsl.g:3046:2: ( ruleParameter )
            // InternalMyDsl.g:3047:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_4"


    // $ANTLR start "rule__Operation__ParametersAssignment_5_1"
    // InternalMyDsl.g:3056:1: rule__Operation__ParametersAssignment_5_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3060:1: ( ( ruleParameter ) )
            // InternalMyDsl.g:3061:2: ( ruleParameter )
            {
            // InternalMyDsl.g:3061:2: ( ruleParameter )
            // InternalMyDsl.g:3062:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_5_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // InternalMyDsl.g:3071:1: rule__Enumeration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3076:2: ( ruleEString )
            {
            // InternalMyDsl.g:3076:2: ( ruleEString )
            // InternalMyDsl.g:3077:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__VariableAssignment_4"
    // InternalMyDsl.g:3086:1: rule__Enumeration__VariableAssignment_4 : ( ruleEString ) ;
    public final void rule__Enumeration__VariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3090:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3091:2: ( ruleEString )
            {
            // InternalMyDsl.g:3091:2: ( ruleEString )
            // InternalMyDsl.g:3092:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getVariableEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getVariableEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__VariableAssignment_4"


    // $ANTLR start "rule__Enumeration__VariableAssignment_5_1"
    // InternalMyDsl.g:3101:1: rule__Enumeration__VariableAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Enumeration__VariableAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3106:2: ( ruleEString )
            {
            // InternalMyDsl.g:3106:2: ( ruleEString )
            // InternalMyDsl.g:3107:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getVariableEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getVariableEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__VariableAssignment_5_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMyDsl.g:3116:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3120:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3121:2: ( ruleEString )
            {
            // InternalMyDsl.g:3121:2: ( ruleEString )
            // InternalMyDsl.g:3122:3: ruleEString
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


    // $ANTLR start "rule__Parameter__TypeAssignment_3"
    // InternalMyDsl.g:3131:1: rule__Parameter__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3135:1: ( ( ruleType ) )
            // InternalMyDsl.g:3136:2: ( ruleType )
            {
            // InternalMyDsl.g:3136:2: ( ruleType )
            // InternalMyDsl.g:3137:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_3"


    // $ANTLR start "rule__Cardinalities__LowerboundAssignment_2"
    // InternalMyDsl.g:3146:1: rule__Cardinalities__LowerboundAssignment_2 : ( ruleEInt ) ;
    public final void rule__Cardinalities__LowerboundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3150:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3151:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3151:2: ( ruleEInt )
            // InternalMyDsl.g:3152:3: ruleEInt
            {
             before(grammarAccess.getCardinalitiesAccess().getLowerboundEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinalitiesAccess().getLowerboundEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__LowerboundAssignment_2"


    // $ANTLR start "rule__Cardinalities__UpperboundAssignment_4"
    // InternalMyDsl.g:3161:1: rule__Cardinalities__UpperboundAssignment_4 : ( ruleEInt ) ;
    public final void rule__Cardinalities__UpperboundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3165:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3166:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3166:2: ( ruleEInt )
            // InternalMyDsl.g:3167:3: ruleEInt
            {
             before(grammarAccess.getCardinalitiesAccess().getUpperboundEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinalitiesAccess().getUpperboundEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalities__UpperboundAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080206000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080204002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000112000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003C000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000C0030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000040L});

}