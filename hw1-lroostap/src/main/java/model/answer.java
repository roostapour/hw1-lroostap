

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
public class answer extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(answer.class);
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
  protected answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public answer(JCas jcas, int begin, int end) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets 
   * @generated */
  public boolean getIsCorrect() {
    if (answer_Type.featOkTst && ((answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets  
   * @generated */
  public void setIsCorrect(boolean v) {
    if (answer_Type.featOkTst && ((answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets 
   * @generated */
  public question getQuestion() {
    if (answer_Type.featOkTst && ((answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "model.answer");
    return (question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((answer_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets  
   * @generated */
  public void setQuestion(question v) {
    if (answer_Type.featOkTst && ((answer_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "model.answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((answer_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    