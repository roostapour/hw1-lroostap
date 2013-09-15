

/* First created by JCasGen Sat Sep 14 22:16:37 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** Saving the result

 * Updated by JCasGen Sat Sep 14 23:01:03 EDT 2013
 * XML source: /home/hannah/workspace/hw1-lroostap/src/main/resources/hw1-lroostap-typesystem.xml
 * @generated */
public class ranking extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ranking.class);
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
  protected ranking() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ranking(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ranking(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets 
   * @generated */
  public float getPrecision() {
    if (ranking_Type.featOkTst && ((ranking_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.ranking");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((ranking_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets  
   * @generated */
  public void setPrecision(float v) {
    if (ranking_Type.featOkTst && ((ranking_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.ranking");
    jcasType.ll_cas.ll_setFloatValue(addr, ((ranking_Type)jcasType).casFeatCode_precision, v);}    
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets 
   * @generated */
  public FSList getElements() {
    if (ranking_Type.featOkTst && ((ranking_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "model.ranking");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ranking_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets  
   * @generated */
  public void setElements(FSList v) {
    if (ranking_Type.featOkTst && ((ranking_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "model.ranking");
    jcasType.ll_cas.ll_setRefValue(addr, ((ranking_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    