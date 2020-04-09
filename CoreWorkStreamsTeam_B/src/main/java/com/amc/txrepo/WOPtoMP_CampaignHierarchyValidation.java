package com.amc.txrepo;


import com.amc.txbase.TxBase;

public class WOPtoMP_CampaignHierarchyValidation extends TxBase {
	    
	
	
	
	   public void campaignHierarchycomparison() {	   
		   
		
				for(int i=0; i<TxBase.wopCampaignHierarchy.size(); i++) {
					
					
				if(TxBase.wopCampaignHierarchy.get(i).equals(TxBase.mpCampaignHierarchy.get(i))) {
						
						
				logStep("WOP Campaign Hierachy "+"(" + TxBase.wopCampaignHierarchy.get(i) + ")" +" MP Campaign Hierachy " + "(" +TxBase.mpCampaignHierarchy.get(i) + ")" + " Matched " );
						
						
				System.out.println("WOP Campaign Hierachy "+"(" + TxBase.wopCampaignHierarchy.get(i) + ")" + " MP Campaign Hierachy " + "(" +TxBase.mpCampaignHierarchy.get(i) + ")" + " Matched " );
						
						
					}
				
				}
				
						   
		   }
		   
		   
	
	
	

}
