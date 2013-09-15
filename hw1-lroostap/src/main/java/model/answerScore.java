

/* First created by JCasGen Sat Sep 14 22:16:37 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Sep 14 23:01:03 EDT 2013
 * XML source: /home/hannah/workspace/hw1-lroostap/src/main/resources/hw1-lroostap-typesystem.xml
 * @generated */
public class answerScore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(answerScore.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected answerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public answerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public answerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public answerScore(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets 
   * @generated */
  public float getScore() {
    if (answerScore_Type.featOkTst && ((answerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "model.answerScore");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((answerScore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated */
  public void setScore(float v) {
    if (answerScore_Type.featOkTst && ((answerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "model.answerScore");
    jcasType.ll_cas.ll_setFloatValue(addr, ((answerScore_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets 
   * @generated */
  public answer getAnswer() {
    if (answerScore_Type.featOkTst && ((answerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "model.answerScore");
    return (answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((answerScore_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets  
   * @generated */
  public void setAnswer(answer v) {
    if (answerScore_Type.featOkTst && ((answerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "model.answerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((answerScore_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    