package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ClassDiagram'", "'{'", "'}'", "'abstract'", "'Class'", "'extends'", "'attributes'", "'('", "','", "')'", "'operations'", "'Association'", "'cardinalities'", "'targetclass'", "'sourceclass'", "':'", "'Boolean'", "'Real'", "'Integer'", "'Enumeration'", "'-'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ClassDiagram";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClassDiagram"
    // InternalMyDsl.g:64:1: entryRuleClassDiagram returns [EObject current=null] : iv_ruleClassDiagram= ruleClassDiagram EOF ;
    public final EObject entryRuleClassDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagram = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleClassDiagram= ruleClassDiagram EOF )
            // InternalMyDsl.g:65:2: iv_ruleClassDiagram= ruleClassDiagram EOF
            {
             newCompositeNode(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDiagram=ruleClassDiagram();

            state._fsp--;

             current =iv_ruleClassDiagram; 
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
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalMyDsl.g:71:1: ruleClassDiagram returns [EObject current=null] : ( () otherlv_1= 'ClassDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'ClassDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'ClassDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'ClassDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'ClassDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassDiagramAccess().getClassDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDiagramAccess().getClassDiagramKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassDiagramAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDiagramRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: ( (lv_entities_4_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:114:4: (lv_entities_4_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:114:4: (lv_entities_4_0= ruleEntity )
            	    // InternalMyDsl.g:115:5: lv_entities_4_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getClassDiagramAccess().getEntitiesEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:140:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:140:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:141:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:147:1: ruleEntity returns [EObject current=null] : (this_Class_0= ruleClass | this_Association_1= ruleAssociation ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Association_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (this_Class_0= ruleClass | this_Association_1= ruleAssociation ) )
            // InternalMyDsl.g:154:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation )
            {
            // InternalMyDsl.g:154:2: (this_Class_0= ruleClass | this_Association_1= ruleAssociation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:155:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:164:3: this_Association_1= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_1=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_1;
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:176:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:176:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:177:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:183:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:189:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:190:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:190:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMyDsl.g:191:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:199:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:210:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMyDsl.g:210:46: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:211:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMyDsl.g:217:1: ruleClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_operations_15_0 = null;

        EObject lv_operations_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:223:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // InternalMyDsl.g:224:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // InternalMyDsl.g:224:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // InternalMyDsl.g:225:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // InternalMyDsl.g:225:3: ()
            // InternalMyDsl.g:226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:232:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:233:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalMyDsl.g:233:4: (lv_abstract_1_0= 'abstract' )
                    // InternalMyDsl.g:234:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalMyDsl.g:250:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:251:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:251:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:252:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:269:3: (otherlv_4= 'extends' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:270:4: otherlv_4= 'extends' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                    			
                    // InternalMyDsl.g:274:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:275:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:275:5: ( ruleEString )
                    // InternalMyDsl.g:276:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getExtendsClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:295:3: (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:296:4: otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDsl.g:304:4: ( (lv_attributes_9_0= ruleAttribute ) )
                    // InternalMyDsl.g:305:5: (lv_attributes_9_0= ruleAttribute )
                    {
                    // InternalMyDsl.g:305:5: (lv_attributes_9_0= ruleAttribute )
                    // InternalMyDsl.g:306:6: lv_attributes_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_attributes_9_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_9_0,
                    							"org.xtext.example.mydsl.MyDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:323:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:324:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:328:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalMyDsl.g:329:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalMyDsl.g:329:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalMyDsl.g:330:7: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_11_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:353:3: (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:354:4: otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getOperationsKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalMyDsl.g:362:4: ( (lv_operations_15_0= ruleOperation ) )
                    // InternalMyDsl.g:363:5: (lv_operations_15_0= ruleOperation )
                    {
                    // InternalMyDsl.g:363:5: (lv_operations_15_0= ruleOperation )
                    // InternalMyDsl.g:364:6: lv_operations_15_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operations_15_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_15_0,
                    							"org.xtext.example.mydsl.MyDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:381:4: (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:382:5: otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FOLLOW_12); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:386:5: ( (lv_operations_17_0= ruleOperation ) )
                    	    // InternalMyDsl.g:387:6: (lv_operations_17_0= ruleOperation )
                    	    {
                    	    // InternalMyDsl.g:387:6: (lv_operations_17_0= ruleOperation )
                    	    // InternalMyDsl.g:388:7: lv_operations_17_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_operations_17_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_17_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getClassAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAssociation"
    // InternalMyDsl.g:419:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalMyDsl.g:419:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalMyDsl.g:420:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalMyDsl.g:426:1: ruleAssociation returns [EObject current=null] : ( () otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'cardinalities' ( (lv_cardinalities_5_0= ruleCardinalities ) ) otherlv_6= ',' otherlv_7= 'targetclass' ( ( ruleEString ) ) otherlv_9= ',' otherlv_10= 'sourceclass' ( ( ruleEString ) ) otherlv_12= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_cardinalities_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:432:2: ( ( () otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'cardinalities' ( (lv_cardinalities_5_0= ruleCardinalities ) ) otherlv_6= ',' otherlv_7= 'targetclass' ( ( ruleEString ) ) otherlv_9= ',' otherlv_10= 'sourceclass' ( ( ruleEString ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:433:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'cardinalities' ( (lv_cardinalities_5_0= ruleCardinalities ) ) otherlv_6= ',' otherlv_7= 'targetclass' ( ( ruleEString ) ) otherlv_9= ',' otherlv_10= 'sourceclass' ( ( ruleEString ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:433:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'cardinalities' ( (lv_cardinalities_5_0= ruleCardinalities ) ) otherlv_6= ',' otherlv_7= 'targetclass' ( ( ruleEString ) ) otherlv_9= ',' otherlv_10= 'sourceclass' ( ( ruleEString ) ) otherlv_12= '}' )
            // InternalMyDsl.g:434:3: () otherlv_1= 'Association' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'cardinalities' ( (lv_cardinalities_5_0= ruleCardinalities ) ) otherlv_6= ',' otherlv_7= 'targetclass' ( ( ruleEString ) ) otherlv_9= ',' otherlv_10= 'sourceclass' ( ( ruleEString ) ) otherlv_12= '}'
            {
            // InternalMyDsl.g:434:3: ()
            // InternalMyDsl.g:435:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssociationAccess().getAssociationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalMyDsl.g:445:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:446:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:446:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:447:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getCardinalitiesKeyword_4());
            		
            // InternalMyDsl.g:472:3: ( (lv_cardinalities_5_0= ruleCardinalities ) )
            // InternalMyDsl.g:473:4: (lv_cardinalities_5_0= ruleCardinalities )
            {
            // InternalMyDsl.g:473:4: (lv_cardinalities_5_0= ruleCardinalities )
            // InternalMyDsl.g:474:5: lv_cardinalities_5_0= ruleCardinalities
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getCardinalitiesCardinalitiesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_cardinalities_5_0=ruleCardinalities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"cardinalities",
            						lv_cardinalities_5_0,
            						"org.xtext.example.mydsl.MyDsl.Cardinalities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getTargetclassKeyword_7());
            		
            // InternalMyDsl.g:499:3: ( ( ruleEString ) )
            // InternalMyDsl.g:500:4: ( ruleEString )
            {
            // InternalMyDsl.g:500:4: ( ruleEString )
            // InternalMyDsl.g:501:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getTargetclassClassCrossReference_8_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getSourceclassKeyword_10());
            		
            // InternalMyDsl.g:523:3: ( ( ruleEString ) )
            // InternalMyDsl.g:524:4: ( ruleEString )
            {
            // InternalMyDsl.g:524:4: ( ruleEString )
            // InternalMyDsl.g:525:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getSourceclassClassCrossReference_11_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:547:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:547:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:548:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:554:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:560:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalMyDsl.g:561:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalMyDsl.g:561:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalMyDsl.g:562:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalMyDsl.g:562:3: ()
            // InternalMyDsl.g:563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:569:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:570:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:570:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:571:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:592:3: ( (lv_type_3_0= ruleType ) )
            // InternalMyDsl.g:593:4: (lv_type_3_0= ruleType )
            {
            // InternalMyDsl.g:593:4: (lv_type_3_0= ruleType )
            // InternalMyDsl.g:594:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:615:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:615:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:616:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:622:1: ruleOperation returns [EObject current=null] : ( () ( (lv_typeReturn_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_typeReturn_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:628:2: ( ( () ( (lv_typeReturn_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) )
            // InternalMyDsl.g:629:2: ( () ( (lv_typeReturn_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            {
            // InternalMyDsl.g:629:2: ( () ( (lv_typeReturn_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            // InternalMyDsl.g:630:3: () ( (lv_typeReturn_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
            {
            // InternalMyDsl.g:630:3: ()
            // InternalMyDsl.g:631:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:637:3: ( (lv_typeReturn_1_0= ruleType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=27 && LA10_0<=30)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:638:4: (lv_typeReturn_1_0= ruleType )
                    {
                    // InternalMyDsl.g:638:4: (lv_typeReturn_1_0= ruleType )
                    // InternalMyDsl.g:639:5: lv_typeReturn_1_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getTypeReturnTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_typeReturn_1_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationRule());
                    					}
                    					set(
                    						current,
                    						"typeReturn",
                    						lv_typeReturn_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:656:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:657:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:657:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:658:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:679:3: ( (lv_parameters_4_0= ruleParameter ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:680:4: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalMyDsl.g:680:4: (lv_parameters_4_0= ruleParameter )
                    // InternalMyDsl.g:681:5: lv_parameters_4_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Parameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:698:3: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:699:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:703:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalMyDsl.g:704:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalMyDsl.g:704:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalMyDsl.g:705:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:731:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:731:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:732:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:738:1: ruleType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_RealType_1= ruleRealType | this_IntegerType_2= ruleIntegerType | this_Enumeration_3= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanType_0 = null;

        EObject this_RealType_1 = null;

        EObject this_IntegerType_2 = null;

        EObject this_Enumeration_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:744:2: ( (this_BooleanType_0= ruleBooleanType | this_RealType_1= ruleRealType | this_IntegerType_2= ruleIntegerType | this_Enumeration_3= ruleEnumeration ) )
            // InternalMyDsl.g:745:2: (this_BooleanType_0= ruleBooleanType | this_RealType_1= ruleRealType | this_IntegerType_2= ruleIntegerType | this_Enumeration_3= ruleEnumeration )
            {
            // InternalMyDsl.g:745:2: (this_BooleanType_0= ruleBooleanType | this_RealType_1= ruleRealType | this_IntegerType_2= ruleIntegerType | this_Enumeration_3= ruleEnumeration )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            case 30:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:746:3: this_BooleanType_0= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:755:3: this_RealType_1= ruleRealType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRealTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealType_1=ruleRealType();

                    state._fsp--;


                    			current = this_RealType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:764:3: this_IntegerType_2= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntegerTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_2=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:773:3: this_Enumeration_3= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_3=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_3;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalMyDsl.g:785:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalMyDsl.g:785:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalMyDsl.g:786:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalMyDsl.g:792:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:798:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalMyDsl.g:799:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalMyDsl.g:799:2: ( () otherlv_1= 'Boolean' )
            // InternalMyDsl.g:800:3: () otherlv_1= 'Boolean'
            {
            // InternalMyDsl.g:800:3: ()
            // InternalMyDsl.g:801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
            		

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleRealType"
    // InternalMyDsl.g:815:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // InternalMyDsl.g:815:49: (iv_ruleRealType= ruleRealType EOF )
            // InternalMyDsl.g:816:2: iv_ruleRealType= ruleRealType EOF
            {
             newCompositeNode(grammarAccess.getRealTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealType=ruleRealType();

            state._fsp--;

             current =iv_ruleRealType; 
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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // InternalMyDsl.g:822:1: ruleRealType returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:828:2: ( ( () otherlv_1= 'Real' ) )
            // InternalMyDsl.g:829:2: ( () otherlv_1= 'Real' )
            {
            // InternalMyDsl.g:829:2: ( () otherlv_1= 'Real' )
            // InternalMyDsl.g:830:3: () otherlv_1= 'Real'
            {
            // InternalMyDsl.g:830:3: ()
            // InternalMyDsl.g:831:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTypeAccess().getRealTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRealTypeAccess().getRealKeyword_1());
            		

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
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalMyDsl.g:845:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalMyDsl.g:845:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalMyDsl.g:846:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalMyDsl.g:852:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:858:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalMyDsl.g:859:2: ( () otherlv_1= 'Integer' )
            {
            // InternalMyDsl.g:859:2: ( () otherlv_1= 'Integer' )
            // InternalMyDsl.g:860:3: () otherlv_1= 'Integer'
            {
            // InternalMyDsl.g:860:3: ()
            // InternalMyDsl.g:861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
            		

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalMyDsl.g:875:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalMyDsl.g:875:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalMyDsl.g:876:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalMyDsl.g:882:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variable_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleEString ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_variable_4_0 = null;

        AntlrDatatypeRuleToken lv_variable_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:888:2: ( ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variable_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleEString ) ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:889:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variable_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleEString ) ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:889:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variable_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleEString ) ) )* otherlv_7= '}' )
            // InternalMyDsl.g:890:3: () otherlv_1= 'Enumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_variable_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleEString ) ) )* otherlv_7= '}'
            {
            // InternalMyDsl.g:890:3: ()
            // InternalMyDsl.g:891:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            // InternalMyDsl.g:901:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:902:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:902:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:903:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:924:3: ( (lv_variable_4_0= ruleEString ) )
            // InternalMyDsl.g:925:4: (lv_variable_4_0= ruleEString )
            {
            // InternalMyDsl.g:925:4: (lv_variable_4_0= ruleEString )
            // InternalMyDsl.g:926:5: lv_variable_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getVariableEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_variable_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:943:3: (otherlv_5= ',' ( (lv_variable_6_0= ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:944:4: otherlv_5= ',' ( (lv_variable_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:948:4: ( (lv_variable_6_0= ruleEString ) )
            	    // InternalMyDsl.g:949:5: (lv_variable_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:949:5: (lv_variable_6_0= ruleEString )
            	    // InternalMyDsl.g:950:6: lv_variable_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getVariableEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_variable_6_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable",
            	    							lv_variable_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleParameter"
    // InternalMyDsl.g:976:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:976:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:977:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMyDsl.g:983:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:989:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalMyDsl.g:990:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalMyDsl.g:990:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalMyDsl.g:991:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalMyDsl.g:991:3: ()
            // InternalMyDsl.g:992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:998:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:999:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:999:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1000:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:1021:3: ( (lv_type_3_0= ruleType ) )
            // InternalMyDsl.g:1022:4: (lv_type_3_0= ruleType )
            {
            // InternalMyDsl.g:1022:4: (lv_type_3_0= ruleType )
            // InternalMyDsl.g:1023:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCardinalities"
    // InternalMyDsl.g:1044:1: entryRuleCardinalities returns [EObject current=null] : iv_ruleCardinalities= ruleCardinalities EOF ;
    public final EObject entryRuleCardinalities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalities = null;


        try {
            // InternalMyDsl.g:1044:54: (iv_ruleCardinalities= ruleCardinalities EOF )
            // InternalMyDsl.g:1045:2: iv_ruleCardinalities= ruleCardinalities EOF
            {
             newCompositeNode(grammarAccess.getCardinalitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalities=ruleCardinalities();

            state._fsp--;

             current =iv_ruleCardinalities; 
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
    // $ANTLR end "entryRuleCardinalities"


    // $ANTLR start "ruleCardinalities"
    // InternalMyDsl.g:1051:1: ruleCardinalities returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_lowerbound_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_upperbound_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleCardinalities() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerbound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperbound_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1057:2: ( ( () otherlv_1= '{' ( (lv_lowerbound_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_upperbound_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1058:2: ( () otherlv_1= '{' ( (lv_lowerbound_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_upperbound_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1058:2: ( () otherlv_1= '{' ( (lv_lowerbound_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_upperbound_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1059:3: () otherlv_1= '{' ( (lv_lowerbound_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_upperbound_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:1059:3: ()
            // InternalMyDsl.g:1060:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCardinalitiesAccess().getCardinalitiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalitiesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1070:3: ( (lv_lowerbound_2_0= ruleEInt ) )
            // InternalMyDsl.g:1071:4: (lv_lowerbound_2_0= ruleEInt )
            {
            // InternalMyDsl.g:1071:4: (lv_lowerbound_2_0= ruleEInt )
            // InternalMyDsl.g:1072:5: lv_lowerbound_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalitiesAccess().getLowerboundEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_lowerbound_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalitiesRule());
            					}
            					set(
            						current,
            						"lowerbound",
            						lv_lowerbound_2_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getCardinalitiesAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:1093:3: ( (lv_upperbound_4_0= ruleEInt ) )
            // InternalMyDsl.g:1094:4: (lv_upperbound_4_0= ruleEInt )
            {
            // InternalMyDsl.g:1094:4: (lv_upperbound_4_0= ruleEInt )
            // InternalMyDsl.g:1095:5: lv_upperbound_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinalitiesAccess().getUpperboundEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_upperbound_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalitiesRule());
            					}
            					set(
            						current,
            						"upperbound",
            						lv_upperbound_4_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCardinalitiesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCardinalities"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1120:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1120:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1121:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1127:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1133:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1134:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1134:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1135:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1135:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1136:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000040E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000222000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000078000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});

}