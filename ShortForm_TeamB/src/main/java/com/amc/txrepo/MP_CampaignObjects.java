package com.amc.txrepo;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.amc.txbase.ExcelUtils;
import com.amc.txbase.TxBase;

public class MP_CampaignObjects extends TxBase {
	
	
	
    ExcelUtils excelUtils = new ExcelUtils();
	

	TxBase wop = new TxBase();

	Screen mpscreen = new Screen();
	
	public static int MPMastercount =0;
	

	// WOP Created Campaing Data Integration confirmation on MP
	
	public void projectManagement() throws FindFailed {
		
	

        String ProjectManagement = "Pictures\\WopImages\\ProjectManagement.PNG";
		
		imageFindClick(ProjectManagement,6);
		
		mpscreen.wait((double) 3.0);
		
        String Projects = "Pictures\\WopImages\\Projects.PNG";
		
		imageFindClick(Projects,6);
				
		mpscreen.wait((double) 3.0);
		
		String AdvancedSearch = "Pictures\\WopImages\\AdvancedSearch.PNG";
		
		imageFindClick(AdvancedSearch,6);	
		
        String ProjectDescription = "Pictures\\WopImages\\ProjectDescription.PNG";
		
		imageEnterText(ProjectDescription,WOP_TrailorCampaignObjects.CampaignTitle,6);
		
		//imageEnterText(ProjectDescription,"Campaign Test_11",6);
		
		mpscreen.wait((double) 5.0);
		
		//imageEnterText(ProjectDescription,"Campaign Test_XYZY",6);

		String ProjectOk = "Pictures\\WopImages\\ProjectOk.PNG";
			
		imageFindClick(ProjectOk,6);
		
	
	
	}
	
	

	
       
	
	// Selection of Campaign Fields
	
		public void campaignFieldsSelection() throws HeadlessException, FindFailed, UnsupportedFlavorException, IOException, InterruptedException {
			
			
				mpscreen.wait((double) 5.0);
			     
				try {
			    	 
				String CampaignDataOpening = "Pictures\\WopImages\\CampaignDataOpening.PNG";
			
				imageFindClick(CampaignDataOpening, 5);
				
				logStep("WOP Campaign Data is Integrated Successfully With MP:" + WOP_TrailorCampaignObjects.CampaignTitle );
				
			     } catch(Exception e) {
			    	 
			    	 System.out.println("Inegration Failed..");
			     }
			
				mpscreen.wait((double) 7.0);
				
				String mpCampaignTitle = "Pictures\\WopImages\\mpCampaignTitle.PNG";
	        
		       imagecopyText(mpCampaignTitle, 10);
		        
		       String mpCampaignTitleParam = "CampaignTitle:";
		       
		       mpCampaignFields(mpCampaignTitleParam);
		       
		       mpscreen.wait((double) 2.0);
		       
		       String mpCampaignOwner = "Pictures\\WopImages\\mpOwner.PNG";
		        
		       imagecopyText(mpCampaignOwner, 10);
		        
		       String mpCampaignOwnerParam = "CampaignOwner:";
		       
		       mpCampaignFields(mpCampaignOwnerParam);
		       
		       mpscreen.wait((double) 2.0);
		       
		       String mpOwnerNetwork = "Pictures\\WopImages\\mpCampaignnetwork.PNG";
		        
		       imagecopyText(mpOwnerNetwork, 10);
		        
		       String mpOwnerNetworkParam = "OwnerNetwork:";
		       
		       mpCampaignFields(mpOwnerNetworkParam);
			
		       
			
		}
	
	
	
}
