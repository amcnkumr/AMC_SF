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
		
		//imageEnterText(ProjectDescription,"Campaign Test_XYZY",6);
		
		mpscreen.wait((double) 5.0);
		
		//imageEnterText(ProjectDescription,"Campaign Test_XYZY",6);

		String ProjectOk = "Pictures\\WopImages\\ProjectOk.PNG";
			
		imageFindClick(ProjectOk,6);
		
		logStep("WOP Campaign Data is Integrated Successfully With MP:" + WOP_TrailorCampaignObjects.CampaignTitle );
		
		//System.out.println("WOP Campaign Data is Integrated Successfully With MP:" + WOP_TrailorCampaignObjects.CampaignTitle );
		
	}
	
	
	public void campaignProjectSelection() throws FindFailed, HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
		
		mpscreen.wait((double) 5.0);
				
		String CampaignDataOpening = "Pictures\\WopImages\\CampaignDataOpening.PNG";
		
		imageFindClick(CampaignDataOpening, 5);
		
		mpscreen.wait((double) 3.0);
			
		String TitleClick = "Pictures\\WopImages\\TitleClick.PNG";
		
		imageFindClick(TitleClick, 5);
		
		String Titles = "Pictures\\WopImages\\Titles.PNG";
		
		imageRightClick(Titles, 5);
		
		String CloseTitles = "Pictures\\WopImages\\CloseTitles.PNG";
		
		imageFindClick(CloseTitles, 5);
		
		mpscreen.wait((double) 2.0);
		
        String TrailerDoubleClick = "Pictures\\WopImages\\TrailerDoubleClick1.PNG";
        
        imageDoubleClick(TrailerDoubleClick, 5);
               
        String MasterTrailer1Maximize = "Pictures\\WopImages\\MasterTrailer1Maximize.PNG";
        
        imageDoubleClick(MasterTrailer1Maximize, 5);
        
      
        String M1Trailer1CategoryD = "Pictures\\WopImages\\M1Trailer1CategoryD.PNG";
        
       imagecopyText(M1Trailer1CategoryD, 5);
        
       String Ocategory = "Category:";
       
       AddingmpMasterTrailer1Fields(Ocategory);
       
       
       String M1Trailer1OffAirTypeD = "Pictures\\WopImages\\M1Trailer1OffAirTypeD.PNG";
       
       imagecopyText(M1Trailer1OffAirTypeD, 5);
        
       String OffAirType = "OffAirType:";
       
       AddingmpMasterTrailer1Fields(OffAirType);
       
       
       String M1Trailer1LengthD = "Pictures\\WopImages\\M1Trailer1LengthD.PNG";
       
       imagecopyText(M1Trailer1LengthD, 5);
        
       String Length = "TheatricalTRT:";
       
       AddingmpMasterTrailer1Fields(Length);
        
         
        String TitleHierarchy = "Pictures\\WopImages\\TitleHierarchy.PNG";
        
        imageFindClick(TitleHierarchy, 5);
        
        mpscreen.wait((double) 2.0);
       
        
        
	}  
       
	
	// Adding Campaign Structer to mpCampaignHierarchy ArryList:
	
	public void CampaignHierarchySelection() throws HeadlessException, FindFailed, UnsupportedFlavorException, IOException, InterruptedException {
		
		
       String CampaignTestCopy = "Pictures\\WopImages\\CampaignTestCopy.PNG";
        
       imagecopyText(CampaignTestCopy, 5);
       
       AddingmpCampaignHierarchy();
       
       
        
       // Master Trailer 1:
       String MasterTrailer1Copy = "Pictures\\WopImages\\MasterTrailer1Copy.PNG";
       
       MPMastercount= MPMastercount+1;
       
       if(MPMastercount<=WOP_TrailorCampaignObjects.MasterResult)  { 		      
      
    	   imagecopyText(MasterTrailer1Copy, 5);
       
           AddingmpCampaignHierarchy();
        
       
      
    	  // Trailers:
       
       int MPTrailercount=0;
      
       String M1TrailerTest1Copy = "Pictures\\WopImages\\M1TrailerTest1Copy.PNG";
       
       MPTrailercount = MPTrailercount+1;	
       
       if(MPTrailercount<=WOP_TrailorCampaignObjects.TrailerResult) {
         
       imagecopyText(M1TrailerTest1Copy, 5);
       
       AddingmpCampaignHierarchy();
       
       }
        
       String M1TrailerTest2Copy = "Pictures\\WopImages\\M1TrailerTest2Copy.PNG";
       
       MPTrailercount = MPTrailercount+1;
       
       if(MPTrailercount<=WOP_TrailorCampaignObjects.TrailerResult) {
       
       imagecopyText(M1TrailerTest2Copy, 5);
       
       AddingmpCampaignHierarchy();
       
       
       
       }
      
}     
       // Master Trailer 2:
          
       String MasterTrailer2Copy = "Pictures\\WopImages\\MasterTrailer2Copy.PNG";
       
       MPMastercount= MPMastercount+1;
       
       if(MPMastercount<=WOP_TrailorCampaignObjects.MasterResult) {
       
       imagecopyText(MasterTrailer2Copy, 5);
       
       AddingmpCampaignHierarchy();
       
      
       
       
       // Trailers:
       
         int MPTrailercount=0;     
         
        String M2TrailerTest1Copy = "Pictures\\WopImages\\M2TrailerTest1Copy.PNG";
       
       MPTrailercount = MPTrailercount+1;
       
       if(MPTrailercount<=WOP_TrailorCampaignObjects.TrailerResult) {
       
       imagecopyText(M2TrailerTest1Copy, 5);
       
       AddingmpCampaignHierarchy();
       
      
       
       String M2TrailerTest2Copy = "Pictures\\WopImages\\M2TrailerTest2Copy.PNG";
       
        MPTrailercount = MPTrailercount+1;
       
       if(MPTrailercount<=WOP_TrailorCampaignObjects.TrailerResult) {
       
       imagecopyText(M2TrailerTest2Copy, 5);
       
       AddingmpCampaignHierarchy();
      
       
       }
       
      }      
       
       
       
       }  
	
				
	
	
	}
	    
	
	
	
}
