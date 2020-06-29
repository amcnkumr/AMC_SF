package com.amc.txrepo;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.amc.txbase.TxBase;

public class WOP_MPMasterTrailerDataValidations extends TxBase {

	
	 public static String  mastertariler="flag";
	 
	 SoftAssert sa = new SoftAssert();
	 
	 //public static String wopFields ="flag";
	
   // Master Trailer 2 :
	
	public void masterTrailerAndTrailerDataSelection() throws HeadlessException, FindFailed, UnsupportedFlavorException, IOException, InterruptedException {
		
            System.out.println("Master Trailer Count =========" + WOP_TrailorCampaignObjects.MasterResult);
            
            System.out.println("Trailer Count =========" + WOP_TrailorCampaignObjects.TrailerResult);
		
		   for(int mastertrailer=0; mastertrailer<WOP_TrailorCampaignObjects.MasterResult;mastertrailer++) {
			   
		  // Pick the Master Trailers 
			   
		   screen.wait((double) 5.0);
		
		   String Activities1 = "Pictures\\WopImages\\Activities1.PNG";
	        
	       imageFindClick(Activities1, 10);
	        
	       screen.wait((double) 2.0);
	       
	       if(mastertariler.equalsIgnoreCase("MasterTrailer")){
	    	  
	    	   for(int masterdown=0; masterdown<mastertrailer; masterdown++) {
	    		   
	    		   keyDownMethod(); 
	    	   }
	    	   	   
	       
	       }else {
	    	   
	    	   System.out.println("Continue Next Steps...");
	       }
	       
	       
	       screen.wait((double) 1.0);
	       
	       String AssetsScrollBarClick = "Pictures\\WopImages\\AssetsScrollBarClick.PNG";
	        
	       imageFindClick(AssetsScrollBarClick, 10);
	       
	       screen.wait((double) 1.0);
	       
	       String AssetsArrow = "Pictures\\WopImages\\AssetsArrow.PNG";
	        
	       imageFindClick(AssetsArrow, 10);
	       
	       for(int trailer=0; trailer<WOP_TrailorCampaignObjects.TrailerResult; trailer++) {
	    	   
	    	   keyDownMethod();
	    	     
	       }
	       
	       screen.wait((double) 2.0);
	       
	       String SelectMt = "Pictures\\WopImages\\SelectMt.PNG";
	        
	       imageFindClick(SelectMt, 10);
	       
	      
	       // Selecting the Master Trailer Data and Copy into mpMaster Trailer ArrayList
	       
	       String MpMtTitle = "Pictures\\WopImages\\MpMtTitle.PNG";
	        
	       imagecopyText(MpMtTitle, 10);
	       
	       String  title= "Title:"; 
	  		
	  	   mpMasterTrailerFields(title);
	       
	  		
	  		String mpMasterTRT =  "Pictures\\WopImages\\mpMasterTRT.PNG";
			
			imagecopyText(mpMasterTRT,10);
	   		
	  		String  expectedTRT= "ExpectedTRT:"; 
	  		
	  		mpMasterTrailerFields(expectedTRT);
	  		
	  		
	       
	       	String mpFrameRate =  "Pictures\\WopImages\\mpFrameRate.PNG";
			
			imagecopyText(mpFrameRate,10);
	   		
	  		String  framerate= "ExpectedFrameRate:"; 
	  		
	  		mpMasterTrailerFields(framerate);
	   		
	   		
	  		String mpVideoCodec = "Pictures\\WopImages\\mpVideoCodec.PNG";
	  		
	  		imagecopyText(mpVideoCodec,10);
	   		
	   	    String  videocodec= "ExpectedVideoCodec:"; 
			
	   	    mpMasterTrailerFields(videocodec);
	   	    
	   	    
	   	    String mpAspectRatio = "Pictures\\WopImages\\mpAspectRatio.PNG";
			
	   	    imagecopyText(mpAspectRatio,10);
			
		    String AspectRatio= "ExpectedAspectRatio:"; 
			
		    mpMasterTrailerFields(AspectRatio);
	   		 		
	   		
		    String mpFormat = "Pictures\\WopImages\\mpFormat.PNG";
			
		    imagecopyText(mpFormat,10);
			
		    String format= "ExpectedFormat:"; 
			
		    mpMasterTrailerFields(format);
	       
		    
		    screen.wait((double) 2.0);
		    
		    String mediaAssetHeader = "Pictures\\WopImages\\mediaAssetHeader.PNG";
		    
		    imageRightClick(mediaAssetHeader, 10);
		    
		    screen.wait((double) 2.0);
		    
		    String MediaHeaderClose = "Pictures\\WopImages\\MediaHeaderClose.PNG";
	        
		    imageFindClick(MediaHeaderClose, 10);
		    
		    screen.wait((double) 2.0);
		    
		    for(int trailer=0; trailer<WOP_TrailorCampaignObjects.TrailerResult; trailer++) {
		    	
		    	// Selection of Trailer Data into mpTrailer Array List
		    	
		    	KeyUpMethod();
		    	
		    	String SelectTrailer = "Pictures\\WopImages\\SelectMt.PNG";
			        
			    imageFindClick(SelectTrailer, 10);
			    
			    screen.wait((double) 2.0);
			    
			    String TrailerTitle = "Pictures\\WopImages\\TrailerTitle.PNG";
		        
			    imagecopyText(TrailerTitle, 10);
			       
			    String  Trailertitle= "Title:"; 
			  		
			    mpTrailerFields(Trailertitle);
			    
			    
			    String mpTrailerStartDate = "Pictures\\WopImages\\mpTrailerStartDate.PNG";
		        
			    imagecopyText(mpTrailerStartDate, 10);
			       
			    String  mpStartDate= "TrailerStartDate:"; 
			  		
			    mpTrailerFields(mpStartDate);
			    
			    screen.wait((double) 2.0);
			    
			    String mpTrailerEndDate = "Pictures\\WopImages\\mpTrailerEndDate.PNG";
		        
			    imagecopyText(mpTrailerEndDate, 10);
			       
			    String  mpEndDate= "TrailerEndDate:"; 
			  		
			    mpTrailerFields(mpEndDate);
			    
			    screen.wait((double) 2.0);
			    
			    String mpTrailerOwnerNetWork = "Pictures\\WopImages\\mpTrailerOwnerNetWork.PNG";
		        
			    imagecopyText(mpTrailerOwnerNetWork, 10);
			       
			    String  mpTrailerNetWork= "OwnerNetwork:"; 
			  		
			    mpTrailerFields(mpTrailerNetWork);
			    
			    
			    String mpTrailerTRT =  "Pictures\\WopImages\\mpMasterTRT.PNG";
				
				imagecopyText(mpTrailerTRT,10);
		   		
		  		String  mpTrailerTRT1= "ExpectedTRT:"; 
		  		
		  		mpTrailerFields(mpTrailerTRT1);
		  		
		  		
		       
		       	String mpTrailerFrameRate =  "Pictures\\WopImages\\mpFrameRate.PNG";
				
				imagecopyText(mpTrailerFrameRate,10);
		   		
		  		String  mpframerate= "ExpectedFrameRate:"; 
		  		
		  		mpTrailerFields(mpframerate);
		   		
		   		
		  		String mpVideoCodecTrailer = "Pictures\\WopImages\\mpVideoCodec.PNG";
		  		
		  		imagecopyText(mpVideoCodecTrailer,10);
		   		
		   	    String  Trailervideocodec= "ExpectedVideoCodec:"; 
				
		   	    mpTrailerFields(Trailervideocodec);
		   	    
		   	    
		   	    String mpTrailerAspectRatio = "Pictures\\WopImages\\mpAspectRatio.PNG";
				
		   	    imagecopyText(mpTrailerAspectRatio,10);
				
			    String TrailerAspectRatio= "ExpectedAspectRatio:"; 
				
			    mpTrailerFields(TrailerAspectRatio);
		   		 		
		   		
			    String mpTrailerFormat = "Pictures\\WopImages\\mpFormat.PNG";
				
			    imagecopyText(mpTrailerFormat,10);
				
			    String Trailerformat= "ExpectedFormat:"; 
				
			    mpTrailerFields(Trailerformat);
		       
			    
			    screen.wait((double) 2.0);
			    
			    String mediaAssetHeaderTrailer = "Pictures\\WopImages\\mediaAssetHeader.PNG";
			    
			    imageRightClick(mediaAssetHeaderTrailer, 10);
			    
			    screen.wait((double) 2.0);
			    
			    String MediaHeaderCloseTrailer = "Pictures\\WopImages\\MediaHeaderClose.PNG";
		        
			    imageFindClick(MediaHeaderCloseTrailer, 10);
			    
			    screen.wait((double) 2.0);
			    
			    logStep("Trailer "+trailer+1+" Data is Taken Successfully for Validation ");
		    }
		 
		    screen.wait((double) 2.0);
		    
		    String SlidebarUpclick = "Pictures\\WopImages\\SlidebarUpclick.PNG";
	        
		    imageFindClick(SlidebarUpclick, 10);
		    
		    
		    screen.wait((double) 2.0);
		    
		    String LeftSlidebarclick = "Pictures\\WopImages\\LeftSlidebarclick.PNG";
	        
		    imageFindClick(LeftSlidebarclick, 10);
		    
		    screen.wait((double) 1.0);
		    
		    mastertariler = "MasterTrailer";
		    
		    logStep("Master Trailer"+mastertrailer+1+" Data is Taken Successfully for Validation ");
		   
		   }   
	       
	       
	      
	      
		
	}

	
	 
     // // Master Trailer Data Validations Method: 
	
	 public void MasterTrailerFieldscomparison(String param) {
		 
		   
		   
			 String TestCaseParam=null;
			 
			 String wopFields=null;
			 
			 String mpFields = null;
			 
			 
			 for(int i=0; i<wopMasterTrailerFields.size(); i++) {
					
					if (wopMasterTrailerFields.get(i).contains(param)) {
					
						wopFields = wopMasterTrailerFields.get(i);
						
					}
					
					TestCaseParam="Start";	
				}
			 
			 
			 
				
				for(int j=0; j<TxBase.mpMasterTrailerFields.size(); j++) {
					
					
				if(wopFields.equalsIgnoreCase(mpMasterTrailerFields.get(j))) {
					
					mpFields = mpMasterTrailerFields.get(j);
					
					
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
					
				if(TestCaseParam.equalsIgnoreCase("Fail")&&j==mpMasterTrailerFields.size()-1) {
					
					sa.fail(wopFields+" --- Not Matched with --- "+mpMasterTrailerFields.toString());
				
				}
				
			
				
				}
				
				sa.assertAll();		   
		   
		 
		 
		 
		 
	 }

	
}
