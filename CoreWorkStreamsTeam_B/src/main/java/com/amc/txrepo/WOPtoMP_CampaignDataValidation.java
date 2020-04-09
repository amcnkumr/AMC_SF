package com.amc.txrepo;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.script.FindFailed;

import com.amc.txbase.TxBase;

public class WOPtoMP_CampaignDataValidation extends TxBase {
	
	
	// Adding Campaign Data to mpCampaignFields ArryList:
	
		public void campaignDataSelection() throws HeadlessException, FindFailed, UnsupportedFlavorException, IOException, InterruptedException {
			
			screen.wait((double)17.0);
			
			tabAndEnter("Campaign");
			
			screen.wait((double)2.0);
					
			String CampaignDataNetwork = "Pictures\\WopImages\\CampaignDataNetwork.PNG";
			
			imagecopyText(CampaignDataNetwork, 5);
			
			 String OcampaignFieldName = "OwnerNetwork:";
			
			 AddingmpCampaignFields(OcampaignFieldName);
			 
			 System.out.println("HI");
			 
			 String CampaignRightSelection = "Pictures\\WopImages\\CampaignRightSelection.PNG";
			 
			 imageRightClick(CampaignRightSelection, 5);
			 
			 String CampaignDataWindowCose = "Pictures\\WopImages\\CampaignDataWindowCose.PNG";
			 
			 imageFindClick(CampaignDataWindowCose, 5);
			 
				 
				
		}
	
	
	
	
	
	 public void campaignDatacomparison() {	   
		   
			
			for(int i=0; i<TxBase.wopCampaignFields.size(); i++) {
				
				
			if(TxBase.wopCampaignFields.get(i).equals(TxBase.mpCampaignFields.get(i))) {
					
					
			logStep("WOP Campaign Fields "+"(" + TxBase.wopCampaignFields.get(i) + ")" +" MP Campaign Fields " + "(" +TxBase.mpCampaignFields.get(i) + ")" + " Matched " );
					
					
			System.out.println("WOP Campaign Fields "+"(" + TxBase.wopCampaignFields.get(i) + ")" + " MP Campaign Fields " + "(" +TxBase.mpCampaignFields.get(i) + ")" + " Matched " );
					
					
				}
			
			}
			
					   
	   }
	   
	
	
	
	

}
