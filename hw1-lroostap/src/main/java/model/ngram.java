

/* First created by JCasGen Sat Sep 14 22:16:37 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Sep 14 23:01:03 EDT 2013
 * XML source: /home/hannah/workspace/hw1-lroostap/src/main/resources/hw1-lroostap-typesystem.xml
 * @generated */
public class ngram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ngram.class);
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
  protected ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ngram(JCas jcas, int begin, int end) {
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
  //* Feature: elements

  /** getter for elements - gets Array of tokens
   * @generated */
  public FSList getElements() {
    if (ngram_Type.featOkTst && ((ngram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "model.ngram");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ngram_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets Array of tokens 
   * @generated */
  public void setElements(FSList v) {
    if (ngram_Type.featOkTst && ((ngram_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "model.ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((ngram_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngramOrder

  /** getter for ngramOrder - gets The ngram size 1, 2 or 3
   * @generated */
  public int getNgramOrder() {
    if (ngram_Type.featOkTst && ((ngram_Type)jcasType).casFeat_ngramOrder == null)
      jcasType.jcas.throwFeatMissing("ngramOrder", "model.ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ngram_Type)jcasType).casFeatCode_ngramOrder);}
    
  /** setter for ngramOrder - sets The ngram size 1, 2 or 3 
   * @generated */
  public void setNgramOrder(int v) {
    if (ngram_Type.featOkTst && ((ngram_Type)jcasType).casFeat_ngramOrder == null)
      jcasType.jcas.throwFeatMissing("ngramOrder", "model.ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((ngram_Type)jcasType).casFeatCode_ngramOrder, v);}    
  }

    