package com.amc.txrepo;




import org.sikuli.script.Screen;

import com.amc.txbase.ExcelUtils;
import com.amc.txbase.TxBase;

public class WOP_TrailorCampaignObjects extends TxBase {

	ExcelUtils excelUtilsCampaignData = new ExcelUtils();
	
	ExcelUtils MasterAndTrailerCreationData = new ExcelUtils();

	TxBase wop = new TxBase();

	Screen WopScreen = new Screen();
	

	
	public static String CampaignTitle;
	
	public static int MasterResult;
	
	public static int TrailerResult;
	

	public void trailerCampaign() throws Exception {

		WopScreen.wait((double) 12.0);

		String TrailerIcon = "Pictures\\WopImages\\TrailerIcon.PNG";
		
		imageFindClick(TrailerIcon,4);
		
		WopScreen.wait((double) 2.0);

		

		
		String TrailerCampaignBrowserItem = "Pictures\\WopImages\\TrailerCampaignBrowserItem.PNG";
	
	    imageFindClick(TrailerCampaignBrowserItem,3);
	    
		WopScreen.wait((double) 5.0);

		

		String TrailorCampaignNavigator = "Pictures\\WopImages\\TrailorCampaignNavigator.PNG";

		imageFindClick(TrailorCampaignNavigator,4);

	
		WopScreen.wait((double) 4.0);

		excelUtilsCampaignData.readingexcelFiles("TrailerCampaignData");

		
		// Giving Title Field

		String title = "Pictures\\WopImages\\CampaignTitle.PNG";
		
		EnterTextandTab(title,excelUtilsCampaignData.excelData[0][0],2);
		
		 CampaignTitle = excelUtilsCampaignData.excelData[0][0];
		
		AddingwopCampaignHierarchy(CampaignTitle);
		

		// Giving Owner Network Field

		String OwnerNetwork = "Pictures\\WopImages\\OwnerNetwork.PNG";
		
		EnterTextandTab(OwnerNetwork,excelUtilsCampaignData.excelData[0][1],2);
		
		screen.wait((double) 2.0);
		
		String CampaignOwnerNetwork = excelUtilsCampaignData.excelData[0][1];
		
		String OcampaignFieldName = "OwnerNetwork:";
		
		AddingwopCampaignFields(OcampaignFieldName+CampaignOwnerNetwork);
 
		
		// Giving Gener Field

		String Gener = "Pictures\\WopImages\\Gener.PNG";
		
		EnterTextandTab(Gener,excelUtilsCampaignData.excelData[0][4],2);
		
		String CampaignGener = excelUtilsCampaignData.excelData[0][4];
		
		String GcampaignFieldName = "Gener:";
		
		AddingwopCampaignFields(GcampaignFieldName+CampaignGener);
		
		


		// Giving Status Field

		String Status = "Pictures\\WopImages\\Status.PNG";
		
		EnterTextandTab(Status,excelUtilsCampaignData.excelData[0][3],2);
		
		String CampaignStatus = excelUtilsCampaignData.excelData[0][3];
		
		String ScampaignFieldName = "Status:";
		
		AddingwopCampaignFields(ScampaignFieldName+CampaignStatus);
		
      //******************************************************************
	  //******************************************************************	
		
		logStep("Campaingn Test Is Created with Mandatory Fields Successfully....");

		logStep("=================================================================");

		System.out.println("Campaingn Test Is Created with Mandatory Fields Successfully....");

		System.out.println("=================================================================");

		
		 // Convertng String to Int		 
		
		 MasterAndTrailerCreationData.readingexcelFiles("NumberOfMasterTrailerAndTrailer");
				 
		 String  MasterTrailerNumber = MasterAndTrailerCreationData.excelData[1][0];
		 
		 MasterResult = Integer.parseInt(MasterTrailerNumber);	
		 
		 System.out.println("Number Of Master Trailers ======>" + MasterResult);
		 
		
          for (int MasterTrailer=1; MasterTrailer<=MasterResult ; MasterTrailer++) { 
        	          	
        	  
		//  Click on Trailers Image on Left side

		String TrailerMenu = "Pictures\\WopImages\\TrailersLink.PNG";
		
		imageFindClick(TrailerMenu, 3);

		WopScreen.wait((double) 3.0);

		
		// Selecting New Master Trailer Icon

		String NewMasterTrailer = "Pictures\\WopImages\\NewMasterTrailer.PNG";
		
		imageFindClick(NewMasterTrailer,3);

		WopScreen.wait((double) 5.0);

		
		// Giving Master Trailer Title

		String NewMasterTrailerTitle = "Pictures\\WopImages\\NewMasterTrailerTitle.PNG";
		
		EnterTextandTab(NewMasterTrailerTitle,excelUtilsCampaignData.excelData[1][0] + "_" + MasterTrailer,3);
		
		String MasterTitle = excelUtilsCampaignData.excelData[1][0] + "_" + MasterTrailer;
		
		AddingwopCampaignHierarchy(MasterTitle);

		WopScreen.wait((double) 4.0);

		// Giving Category Field

		String Category = "Pictures\\WopImages\\Category.PNG";

		EnterTextandTab(Category, excelUtilsCampaignData.excelData[1][1], 2);
		
		String MasterCategory = excelUtilsCampaignData.excelData[1][1];
		
		String MCategory = "Category:";
		
		AddingWopMasterTrailerFields(MCategory+MasterCategory);

		
		// Giving OffAirType Field

		String OffAirType = "Pictures\\WopImages\\OffAirType.PNG";

		EnterTextandTab(OffAirType, excelUtilsCampaignData.excelData[1][2], 2);
		
        String MasterOffAirType = excelUtilsCampaignData.excelData[1][2];
        
        String MOffAirType = "OffAirType:";
		
        AddingWopMasterTrailerFields(MOffAirType+MasterOffAirType);
        
        
        // Giving Theatrical TRT
		 
		 String TRT = "Pictures\\WopImages\\TheatricalTRT.PNG";

		 EnterTextandTab(TRT, excelUtilsCampaignData.excelData[1][5], 2);
		 
		 String MasterTRT = excelUtilsCampaignData.excelData[1][5];
		 
		 String MTRT = "TheatricalTRT:";
			
		 AddingWopMasterTrailerFields(MTRT+MasterTRT);
        
       
        

		// Giving Tag Field

		String Tag = "Pictures\\WopImages\\Tag.PNG";

		EnterTextandTab(Tag, excelUtilsCampaignData.excelData[1][3], 2);
			
		 String MasterTag = excelUtilsCampaignData.excelData[1][3];
		 
			String MTag = "Tag:";
			
		   AddingWopMasterTrailerFields(MTag + MasterTag);

		// Giving Description Field

		 String DescriptionFill = "Pictures\\WopImages\\Description.PNG";

		 EnterTextandTab(DescriptionFill, excelUtilsCampaignData.excelData[1][4], 2);
		 
		 String MasterDescriptionFill = excelUtilsCampaignData.excelData[1][4];
		 
		 String MDescription = "Description:";
			
		 AddingWopMasterTrailerFields(MDescription+MasterDescriptionFill);
		 
		/* // Giving Theatrical TRT
		 
		 String TRT = "Pictures\\WopImages\\TheatricalTRT.PNG";

		 EnterTextandTab(TRT, excelUtilsCampaignData.excelData[1][5], 2);
		 
		 String MasterTRT = excelUtilsCampaignData.excelData[1][5];
		 
		 String MTRT = "TheatricalTRT:";
			
		 AddingWopMasterTrailerFields(MTRT+MasterTRT);*/
		 
		 // Giving Planning Type
		 
		 String PlanningType = "Pictures\\WopImages\\PlanningType.PNG";

		 EnterTextandTab(PlanningType, excelUtilsCampaignData.excelData[1][6], 3);
		 
		 String MasterPlanningType = excelUtilsCampaignData.excelData[1][6];
			
		 String MPlanningType = "PlanningType:";
			
		 AddingWopMasterTrailerFields(MPlanningType+MasterPlanningType);
		 
		
		 
		 
		 // Linking New Media Asset to Master Trailer
		 
		 linkingMediaAsset(excelUtilsCampaignData.excelData[3][1]);
		 
		
		 //******************************************************************
		  //******************************************************************	
		 

		 // Convertng String to Int
		 
		 String  TrailerNumber = MasterAndTrailerCreationData.excelData[1][1];
		 
		  TrailerResult = Integer.parseInt(TrailerNumber);	
		 
		
		 System.out.println("Number Of Trailers ======>" + TrailerResult);
		
	
		for(int Trailer=1;Trailer<=TrailerResult; Trailer++) {
		
		
			String TrailerMenuRepeat = "Pictures\\WopImages\\TrailersLink.PNG";
			
			imageFindClick(TrailerMenuRepeat, 3);

		
		// Selecting New Trailer Item From Master Trailer Link

		String NewTrailerImage = "Pictures\\WopImages\\NewTrailerImage.PNG";

		imageFindClick(NewTrailerImage, 2);

		
		// Giving Trailer Title

		String TrailerTest = "Pictures\\WopImages\\TrailerTest_1.PNG";

		EnterTextandTab(TrailerTest, "M"+MasterTrailer+ "_" +excelUtilsCampaignData.excelData[2][0] + "_" + Trailer, 2);
		
		String TrailerTitle = "M"+MasterTrailer+ "_" +excelUtilsCampaignData.excelData[2][0] + "_" + Trailer;
		
		AddingwopCampaignHierarchy(TrailerTitle);
		
		
		// Giving Trailer Tag Field
		
		 String TrailerTag = "Pictures\\WopImages\\TrailerTag.PNG";

		 EnterTextandTab(TrailerTag, excelUtilsCampaignData.excelData[2][1], 2);
		
		 String TrailerTag1 = excelUtilsCampaignData.excelData[2][1];
			
		 String TTrailerTag = "TrailerTag:";
		 
		 AddingwopTrailer(TTrailerTag+TrailerTag1);
		
		// Linking New Media Asset Trailer
		 
	    linkingMediaAsset(excelUtilsCampaignData.excelData[3][1]);
			
		System.out.println("===============================");
	    
		}  
				
		   		
          }
		
			
		logStep("Master Trailer Test Is Created with Mandatory Fields Successfully....");

		logStep("=================================================================");

		System.out.println("Master Trailer Test Is Created with Mandatory Fields Successfully....");

		System.out.println("=================================================================");

		
		// Giving Public Status Field
		
		 screen.wait((Double) 2.0);
		
		 String CampaignImage = "Pictures\\WopImages\\CampaignImage.PNG";
		 
		 imageFindClick(CampaignImage,3);
		 
		 screen.wait((Double) 2.0);
		
		 String publicStatus = "Pictures\\WopImages\\PublicStatus.PNG";
						
		 EnterTextandTab(publicStatus,excelUtilsCampaignData.excelData[0][2],2);
		
		 
		 // Saving Campaign Trailer, Master Trailer & Trailer 
		 
		 String SaveTrailer = "Pictures\\WopImages\\SaveTrailer.PNG";
		 
		 imageFindClick(SaveTrailer,2);
		 
		 String WhatsOnClose = "Pictures\\WopImages\\WhatsOnClose.PNG";
		  
		 imageFindClick(WhatsOnClose,3);
		
		 screen.wait((Double) 3.0);		 
        
		 closingCampaignBrowsers();
		 
		 closingCampaignBrowsers();
		 
		 disconnectWop();
		
		
		
	}

	                 
	
}
