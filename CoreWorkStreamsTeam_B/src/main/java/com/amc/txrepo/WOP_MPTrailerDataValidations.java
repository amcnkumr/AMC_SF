package com.amc.txrepo;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.script.FindFailed;

import com.amc.txbase.TxBase;

public class WOP_MPTrailerDataValidations extends TxBase {

	
	
	
	public void trailerDataSelection() throws HeadlessException, FindFailed, UnsupportedFlavorException, IOException, InterruptedException {
		
		
		screen.wait((double) 5.0);
		
		 tabAndEnter("M1_Trailer Test_1");
		
		 String TrailerTypeD = "Pictures\\WopImages\\TrailerTypeD.PNG";
		 
		 imagecopyText(TrailerTypeD, 5);
		 
		 String TTrailerTag = "TrailerTag:"; 
		 
		 AddingmpM1trailer1FieldsFields(TTrailerTag);
		 
		 String M1Trailer1Righclick = "Pictures\\WopImages\\M1Trailer1Righclick.PNG";
		 
		 imageRightClick(M1Trailer1Righclick, 5);
		 
		 String M1Trailer1WindowClose = "Pictures\\WopImages\\CampaignDataWindowCose.PNG";
		 
		 imageFindClick(M1Trailer1WindowClose, 5);
		 
		 screen.wait((double) 2.0);
 
		 screen.wait((double) 5.0);
			
		 tabAndEnter("M1_Trailer Test_2");
		 
         String TrailerTypeD1 = "Pictures\\WopImages\\TrailerTypeD.PNG";
		 
		 imagecopyText(TrailerTypeD1, 5);
		 
		 String TTrailerTag1 = "TrailerTag:"; 
		 
		 AddingmpmpM1Trailer2Fields(TTrailerTag1);
		 
		 String M1Trailer2RightClick = "Pictures\\WopImages\\M1Trailer2RightClick.PNG";
		 
		 imageRightClick(M1Trailer2RightClick, 5);
		 
		 String M1Trailer1WindowClose1 = "Pictures\\WopImages\\CampaignDataWindowCose.PNG";
		 
		 imageFindClick(M1Trailer1WindowClose1, 5);
		 
		 
		screen.wait((double) 5.0);
			
		 tabAndEnter("M2_Trailer Test_1");
		 
		 String TrailerTypeD2 = "Pictures\\WopImages\\TrailerTypeD.PNG";
		 
		 imagecopyText(TrailerTypeD2, 5);
		 
		 String TTrailerTag2 = "TrailerTag:"; 
		 
		 AddingmpM2trailer1Fields(TTrailerTag2);
		 
		 String M2Trailer1RightClick = "Pictures\\WopImages\\M2Trailer1RightClick.PNG";
		 
		 imageRightClick(M2Trailer1RightClick, 5);	
		 
         String M2Trailer1winowclose = "Pictures\\WopImages\\CampaignDataWindowCose.PNG";
		 
		 imageFindClick(M2Trailer1winowclose, 5);
		 
		 screen.wait((double) 10.0);
			
		 tabAndEnter("M2_Trailer Test_2");
		 
         String TrailerTypeD3 = "Pictures\\WopImages\\TrailerTypeD.PNG";
		 
		 imagecopyText(TrailerTypeD3, 5);
		 
		 String TTrailerTag3 = "TrailerTag:"; 
		 
		 AddingmpM2trailer2Fields(TTrailerTag3);
		 
		 String M2Trailer2RightClick = "Pictures\\WopImages\\M2Trailer2RightClick.PNG";
		 
		 imageRightClick(M2Trailer2RightClick, 5);
		 
         String M2TrailerWindowClose = "Pictures\\WopImages\\CampaignDataWindowCose.PNG";
		 
		 imageFindClick(M2TrailerWindowClose, 5);
		 
	
		
		
	}
	
	
	
	
	
	 public void TrailerDatacomparison() {	   
		   
			
			for(int i=0; i<TxBase.wopTrailer.size(); i++) {
				
				
			if(TxBase.wopTrailer.get(i).equals(TxBase.mpM1trailer1Fields.get(i))) {
					
					
			logStep("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" +" MP M1_Trailer_1 Field " + "(" +TxBase.mpM1trailer1Fields.get(i) + ")" + " Matched " );
					
					
			System.out.println("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" + " MP M1_Trailer_1 Field " + "(" +TxBase.mpM1trailer1Fields.get(i) + ")" + " Matched " );
						
			
				}
			
			if(TxBase.wopTrailer.get(i).equals(TxBase.mpM1Trailer2Fields.get(i))) {
				
				
			logStep("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" +" MP M2_Trailer_2 Field " + "(" +TxBase.mpM1Trailer2Fields.get(i) + ")" + " Matched " );
						
						
			System.out.println("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" + " MP M1_Trailer_2 Field " + "(" +TxBase.mpM1Trailer2Fields.get(i) + ")" + " Matched " );
												
	          }
				
			if(TxBase.wopTrailer.get(i).equals(TxBase.mpM2trailer1Fields.get(i))) {
				
				
				logStep("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" +" MP M2_Trailer_1 Field " + "(" +TxBase.mpM2trailer1Fields.get(i) + ")" + " Matched " );
							
							
				System.out.println("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" + " MP M2_Trailer_1 Field " + "(" +TxBase.mpM2trailer1Fields.get(i) + ")" + " Matched " );
													
		          }
			
			
			if(TxBase.wopTrailer.get(i).equals(TxBase.mpM2Trailer2Fields.get(i))) {
				
				
				logStep("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" +" MP M2_Trailer_2 Field " + "(" +TxBase.mpM2Trailer2Fields.get(i) + ")" + " Matched " );
							
							
				System.out.println("WOP Trailer Field "+"(" + TxBase.wopTrailer.get(i) + ")" + " MP M2_Trailer_2 Field " + "(" +TxBase.mpM2Trailer2Fields.get(i) + ")" + " Matched " );
													
		          }
			
			}

					   
	   }

	
}
