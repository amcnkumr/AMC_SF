package com.amc.txrepo;



import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.amc.txbase.TxBase;

public class WOP_MPTrailerDataValidations extends TxBase {

	
	SoftAssert sa = new SoftAssert();
	
	//public static String wopFields ="flag";
	
	
	
	 public void TrailerFieldscomparison(String param) {
		
		   
		 String TestCaseParam=null;
		 
		 String wopFields=null;
		 
		 String mpFields = null;
		 
		 
		 for(int i=0; i<wopTrailer.size(); i++) {
				
				if (wopTrailer.get(i).contains(param)) {
				
					wopFields = wopTrailer.get(i);
					
				}
				
				TestCaseParam="Start";	
			}
		 
		 
		 
			
			for(int j=0; j<TxBase.mptrailerFields.size(); j++) {
				
				
			if(wopFields.equalsIgnoreCase(mptrailerFields.get(j))) {
				
				mpFields = mptrailerFields.get(j);
				
				
				if(wopFields.contains(param)) {

					Assert.assertEquals(wopFields, mpFields);	

					System.out.println("WOP Data"+" [ " + wopFields + " ]"+" Matched With"+" MP Data"+" [ " + mpFields + " ] " );	

					logStep("WOP Data"+" [ " + wopFields + " ]"+" Matched With"+" MP Data"+" [ " + mpFields + " ] " );

					TestCaseParam="Pass";
					
					break;
					
				}else {
					
					TestCaseParam="Fail";
				}
					
					
			}else {

				TestCaseParam="Fail";
			}
				
			if(TestCaseParam.equalsIgnoreCase("Fail")&&j==mptrailerFields.size()-1) {
				
				sa.fail(wopFields+" --- Not Matched with --- "+mptrailerFields.toString());
			
			}
			
		
			
			}
			
			sa.assertAll();		   
	   
		 
	 }

	
}
