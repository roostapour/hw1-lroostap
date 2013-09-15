
/* First created by JCasGen Sat Sep 14 22:16:37 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Sat Sep 14 23:01:03 EDT 2013
 * @generated */
public class ngram_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ngram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ngram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ngram(addr, ngram_Type.this);
  			   ngram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ngram(addr, ngram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ngram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.ngram");
 
  /** @generated */
  final Feature casFeat_elements;
  /** @generated */
  final int     casFeatCode_elements;
  /** @generated */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "model.ngram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "model.ngram");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngramOrder;
  /** @generated */
  final int     casFeatCode_ngramOrder;
  /** @generated */ 
  public int getNgramOrder(int addr) {
        if (featOkTst && casFeat_ngramOrder == null)
      jcas.throwFeatMissing("ngramOrder", "model.ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_ngramOrder);
  }
  /** @generated */    
  public void setNgramOrder(int addr, int v) {
        if (featOkTst && casFeat_ngramOrder == null)
      jcas.throwFeatMissing("ngramOrder", "model.ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_ngramOrder, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ngram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSList", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

 
    casFeat_ngramOrder = jcas.getRequiredFeatureDE(casType, "ngramOrder", "uima.cas.Integer", featOkTst);
    casFeatCode_ngramOrder  = (null == casFeat_ngramOrder) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngramOrder).getCode();

  }
}



    