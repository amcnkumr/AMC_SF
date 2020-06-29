
package com.amc.txrepo;




import org.sikuli.script.Screen;

import com.amc.txbase.ExcelUtils;
import com.amc.txbase.TxBase;

public class WOP_TrailorCampaignObjects extends TxBase {

	ExcelUtils excelUtilsCampaignData = new ExcelUtils();
	
	ExcelUtils wopBrowser = new ExcelUtils();
	
	ExcelUtils MasterAndTrailerCreationData = new ExcelUtils();

	TxBase wop = new TxBase();

	Screen WopScreen = new Screen();
	

	
	public static String CampaignTitle;
	
	public static int MasterResult;
	
	public static int TrailerResult;
	

	public void trailerCampaign() throws Exception {

		//WopScreen.wait((double) 12.0);
		
		wopBrowser.readingexcelFiles("WOPBrowser");

		String TrailerCampaignBrowserFind = "Pictures\\WopImages\\TrailerCampaignBrowserFind.PNG";
		
		imageEnterText(TrailerCampaignBrowserFind,wopBrowser.excelData[1][0],10);
		
		WopScreen.wait((double) 1.0);
		
		keyEnter();
		
		WopScreen.wait((double) 2.0);

		String TrailorCampaignNavigator = "Pictures\\WopImages\\TrailorCampaignNavigator.PNG";

		imageFindClick(TrailorCampaignNavigator,4);

	
		WopScreen.wait((double) 3.0);

		excelUtilsCampaignData.readingexcelFiles("TrailerCampaignData");

		
		// Giving Title Field

		String title = "Pictures\\WopImages\\CampaignTitle.PNG";
		
		EnterTextandTab(title,excelUtilsCampaignData.excelData[0][0],2);
		
		 CampaignTitle = excelUtilsCampaignData.excelData[0][0];
		
		 String CampaignTitleParam = "CampaignTitle:";
		 
		 wopCampaignFields(CampaignTitleParam+CampaignTitle);
		
		
		// Taking Campaign Owner Field:
		
		WopScreen.wait((double) 2.0);
		
		String CampaignOwner = "Pictures\\WopImages\\CampaignOwner.PNG";
		
		imagecopyText(CampaignOwner,10);
		
		String WOPCampainOwner = "CampaignOwner:";
		
		wopCampaignFields(WOPCampainOwner+TxBase.textvalue);
		
		
		// Giving Owner Network Field

		String OwnerNetwork = "Pictures\\WopImages\\Intention.PNG";
		
		imageEnterText(OwnerNetwork,excelUtilsCampaignData.excelData[0][1],2);
		
		keyEnter();
		
		keyEnter();	
		
		String CampaignOwnerNetwork = excelUtilsCampaignData.excelData[0][1];
		
		String OcampaignFieldName = "OwnerNetwork:";
		
		wopCampaignFields(OcampaignFieldName+CampaignOwnerNetwork);
 
		
		// Giving Gener Field

		String Gener = "Pictures\\WopImages\\ProgramCategory.PNG";
		
		EnterTextandTab(Gener,excelUtilsCampaignData.excelData[0][4],2);
		

		// Giving Status Field

		String Status = "Pictures\\WopImages\\Status.PNG";
		
		EnterTextandTab(Status,excelUtilsCampaignData.excelData[0][3],2);
		
		
		// Adding BroadcastWindow For Campaign Level
		
		WopScreen.wait((double) 2.0);
		
		String WindowsTab = "Pictures\\WopImages\\WindowsTab.PNG";

		imageFindClick(WindowsTab,10);
		
		WopScreen.wait((double) 2.0);
		
		String RightClickImage = "Pictures\\WopImages\\RightClickImage.PNG";
		
		imageRightClick(RightClickImage,10);
		
		try {
		WopScreen.wait((double) 2.0);
		
		String AddWindow = "Pictures\\WopImages\\AddWindow.PNG";
		
		imageFindClick(AddWindow,10);
		
		}catch(Exception e){
			
			keyEnter();
		}
		
		WopScreen.wait((double) 2.0);
		
		String Channels = "Pictures\\WopImages\\Channels.PNG";
		
		imageEnterText(Channels,excelUtilsCampaignData.excelData[0][5],10);

		
		WopScreen.wait((double) 2.0);

		String NotBefore = "Pictures\\WopImages\\NotBefore.PNG";
		
		imageEnterText(NotBefore,excelUtilsCampaignData.excelData[0][6],10);
		
		String CampaignStartDate = "TrailerStartDate:";
		
		String startdate = excelUtilsCampaignData.excelData[0][6];
		
		String Startdatenew= startdate.replace("/", "-");
		
		wopTrailerFields(CampaignStartDate+Startdatenew);
		
		
		WopScreen.wait((double) 2.0);
		
		String NotAfter = "Pictures\\WopImages\\NotAfter.PNG";
		
		imageEnterText(NotAfter,excelUtilsCampaignData.excelData[0][7],10);
		
		String CampaignEndDate = "TrailerEndDate:";
		
		String enddate = excelUtilsCampaignData.excelData[0][7];
		
		String enddatenew= enddate.replace("/", "-");
		
		wopTrailerFields(CampaignEndDate+enddatenew);
		
		
		
		WopScreen.wait((double) 2.0);

		String WindowOk = "Pictures\\WopImages\\WindowOk.PNG";
		
		imageFindClick(WindowOk,10);
		
		WopScreen.wait((double) 2.0);
		
		keyLeft();
		
		/*String GeneralTab = "Pictures\\WopImages\\GeneralTab.PNG";
		
		imageFindClick(GeneralTab,10);*/
		
				
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

		WopScreen.wait((double) 2.0);

		
		// Selecting New Master Trailer Icon

		String NewMasterTrailer = "Pictures\\WopImages\\NewMasterTrailer.PNG";
		
		imageFindClick(NewMasterTrailer,3);

		WopScreen.wait((double) 5.0);

		
		// Giving Master Trailer Title

		String NewMasterTrailerTitle = "Pictures\\WopImages\\NewMasterTrailerTitle.PNG";
		
		EnterTextandTab(NewMasterTrailerTitle,excelUtilsCampaignData.excelData[1][0] + "_" + MasterTrailer,3);
		
		String MasterTitle = excelUtilsCampaignData.excelData[1][0] + "_" + MasterTrailer;
		
		 String  mastertitle= "Title:"; 
		
		WopMasterTrailerFields(mastertitle+MasterTitle);

		WopScreen.wait((double) 2.0);
		
		
		String MasterLevelIntention = "Pictures\\WopImages\\MasterLevelIntention.PNG";
		
		imageEnterText(MasterLevelIntention,excelUtilsCampaignData.excelData[0][1],2);
		
		WopScreen.wait((double) 1.0);
		
		keyEnter();
		
		WopScreen.wait((double) 1.0);
		
		keyEnter();	
		
		WopScreen.wait((double) 2.0);
		
		keyEnter();
		
		String MasterOwnerNetwork = excelUtilsCampaignData.excelData[0][1];
		
		String OMasterFieldName = "OwnerNetwork:";
		
		WopMasterTrailerFields(OMasterFieldName+MasterOwnerNetwork);
		
		
		WopScreen.wait((double) 2.0);
		
		// Giving Category Field

		String Category = "Pictures\\WopImages\\Category.PNG";

		EnterTextandTab(Category, excelUtilsCampaignData.excelData[1][1], 2);
		
		
		
		// Giving OffAirType Field

		String OffAirType = "Pictures\\WopImages\\OffAirType.PNG";

		EnterTextandTab(OffAirType, excelUtilsCampaignData.excelData[1][2], 2);
		
       
        
        
        // Giving Theatrical TRT
		 
		 String TRT = "Pictures\\WopImages\\TheatricalTRT.PNG";

		 EnterTextandTab(TRT, excelUtilsCampaignData.excelData[1][5], 2);
		 
		 String MasterTRT = excelUtilsCampaignData.excelData[1][5];
		 
		 String MTRT = "ExpectedTRT:";
			
		 WopMasterTrailerFields(MTRT+MasterTRT);
        
        

		// Giving Tag Field

		String Tag = "Pictures\\WopImages\\Tag.PNG";

		EnterTextandTab(Tag, excelUtilsCampaignData.excelData[1][3], 2);
			
		
		WopScreen.wait((double) 2.0);
		

		/*// Giving Description Field

		 String DescriptionFill = "Pictures\\WopImages\\Description.PNG";

		 EnterTextandTab(DescriptionFill, excelUtilsCampaignData.excelData[1][4], 2);*/
		 
		  
		 // Giving Planning Type
		 
		 String PlanningType = "Pictures\\WopImages\\PlanningType.PNG";

		 EnterTextandTab(PlanningType, excelUtilsCampaignData.excelData[1][6], 3);
		 

		
		 
		
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
		
		String trailerTitle= "Title:";
		
		wopTrailerFields(trailerTitle+TrailerTitle);
		
		
		// Giving Trailer Tag Field
		
		 String TrailerTag = "Pictures\\WopImages\\TrailerTag.PNG";

		 EnterTextandTab(TrailerTag, excelUtilsCampaignData.excelData[2][1], 2);
		
		
		// Linking New Media Asset Trailer
		 
	    linkingMediaAsset(excelUtilsCampaignData.excelData[3][1]);
			
		System.out.println("===============================");
	    
		}  
				
		
		String BlackClick = "Pictures\\WopImages\\BlackClick.PNG";

		imageFindClick(BlackClick, 10);
		
		WopScreen.wait((double) 1.0);
		
		 // Linking New Media Asset to Master Trailer
		
		  for(int media=0; media<TrailerResult; media++)
		
		  {
			  KeyUpMethod();
			  
		  }
		
		  linkingMediaAsset(excelUtilsCampaignData.excelData[3][1]);
		 
		 
          }
		
			
		//logStep("Master Trailer Test Is Created with Mandatory Fields Successfully....");

		//logStep("=================================================================");

		System.out.println("Master Trailer Test Is Created with Mandatory Fields Successfully....");

		System.out.println("=================================================================");

		
		// Giving Public Status Field
		
		 screen.wait((Double) 2.0);
		
		 String CampaignImage = "Pictures\\WopImages\\CampaignImage.PNG";
		 
		 imageFindClick(CampaignImage,3);
		 
		 screen.wait((Double) 2.0);
		
		 String publicStatus = "Pictures\\WopImages\\PublicStatus.PNG";
						
		 EnterTextandTab(publicStatus,excelUtilsCampaignData.excelData[0][2],2);
		
		 screen.wait((Double) 2.0);
		 
		 // Saving Campaign Trailer, Master Trailer & Trailer 
		 
		 String SaveTrailer = "Pictures\\WopImages\\SaveTrailer.PNG";
		 
		 imageFindClick(SaveTrailer,2);
		 
		 screen.wait((Double) 2.0);
		 
		 try {
		 
		 String WhatsOnClose = "Pictures\\WopImages\\WhatsOnClose.PNG";
		  
		 imageFindClick(WhatsOnClose,3); }
		 
		 catch(Exception e) {
			 
			 System.out.println("No pop up shown After Save..");
			 
		 }
		
			
		 /*closingCampaignBrowsers();
		 
		 closingCampaignBrowsers();
		 
		 disconnectWop();
		*/
		

		
		// Adding Video Components Data For Master Trailer Level
		
		
			String Eframerate = excelUtilsCampaignData.excelData[4][1];
			
			 String  framerate= "ExpectedFrameRate:"; 
			
			 WopMasterTrailerFields(framerate+Eframerate);
			 
			 
			
		    String EvideoCodec = excelUtilsCampaignData.excelData[4][2];
			
		    String  videocodec= "ExpectedVideoCodec:"; 
		
		    WopMasterTrailerFields(videocodec+EvideoCodec);
		    
		    
		    String EaspectRatio = excelUtilsCampaignData.excelData[4][3];
			
		    String  aspectratio= "ExpectedAspectRatio:"; 

		    WopMasterTrailerFields(aspectratio+EaspectRatio);
		    
		 
		    String Eformat = excelUtilsCampaignData.excelData[4][4];
			
		    String  format= "ExpectedFormat:"; 

		    WopMasterTrailerFields(format+Eformat);
		
		
		// Adding Video Components Data For Trailer Level
		    
		    
		    
		    String MasterOwnerNetwork = excelUtilsCampaignData.excelData[0][1];
			
			String OMasterFieldName = "OwnerNetwork:";
			
			wopTrailerFields(OMasterFieldName+MasterOwnerNetwork);
			
			
			String MasterTRT = "00:"+excelUtilsCampaignData.excelData[1][5];
			 
			 String MTRT = "ExpectedTRT:";
				
			 wopTrailerFields(MTRT+MasterTRT);
		    
		  
		    String TrailerEframerate = excelUtilsCampaignData.excelData[4][1];
			
			 String  Trailerframerate= "ExpectedFrameRate:"; 
			
			 wopTrailerFields(Trailerframerate+TrailerEframerate);
			 
			
		    
		    String TrailerEvideoCodec = excelUtilsCampaignData.excelData[4][2];
			
		    String  Trailervideocodec= "ExpectedVideoCodec:"; 
		
		    wopTrailerFields(Trailervideocodec+TrailerEvideoCodec);
		    
		    
		    String TrailerEaspectRatio = excelUtilsCampaignData.excelData[4][3];
			
		    String  Traileraspectratio= "ExpectedAspectRatio:"; 

		    wopTrailerFields(Traileraspectratio+TrailerEaspectRatio);
		    
		 
		    String TrailerEformat = excelUtilsCampaignData.excelData[4][4];
			
		    String  Trailerformat= "ExpectedFormat:"; 

		    wopTrailerFields(Trailerformat+TrailerEformat);
		    
		    
		    screen.wait((Double) 65.0);
	                 
		
	}

	
	  
	
}
