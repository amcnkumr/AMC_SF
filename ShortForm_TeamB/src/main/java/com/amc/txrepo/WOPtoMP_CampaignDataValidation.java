package com.amc.txrepo;




import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.amc.txbase.TxBase;

public class WOPtoMP_CampaignDataValidation extends TxBase {
	
	SoftAssert sa = new SoftAssert();
	
	//public static String wopFields ="flag";
	
	
	
	// Campaign Data Validations Method: 
	
	 public void campaignFieldsComparision(String param) {	   
		   
		 String TestCaseParam=null;
		 
		 String wopFields=null;
		 
		 String mpFields = null;
		 
		 
		 for(int i=0; i<wopCampaignFields.size(); i++) {
				
				if (wopCampaignFields.get(i).contains(param)) {
				
					wopFields = wopCampaignFields.get(i);
					
				}
				
				TestCaseParam="Start";	
			}
		 
		 
		 
			
			for(int j=0; j<TxBase.mpCampaignFields.size(); j++) {
				
				
			if(wopFields.equalsIgnoreCase(mpCampaignFields.get(j))) {
				
				mpFields = mpCampaignFields.get(j);
				
				
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
				
			if(TestCaseParam.equalsIgnoreCase("Fail")&&j==mpCampaignFields.size()-1) {
				
				sa.fail(wopFields+" --- Not Matched with --- "+mpCampaignFields.toString());
			
			}
			
		
			
			}
			
			sa.assertAll();		   
	   }
	   

}
