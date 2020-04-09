package com.amc.txrepo;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.sikuli.script.FindFailed;

import com.amc.txbase.TxBase;

public class WOP_MPMasterTrailerDataValidations extends TxBase {

	
   // Master Trailer 2 :
	
	public void masterTrailer2DataSelection() throws HeadlessException, FindFailed, UnsupportedFlavorException, IOException, InterruptedException {
		
		
		  screen.wait((double) 5.0);
		
		  tabAndEnter("Master Trailer_2");
		
		   String M1Trailer1CategoryD = "Pictures\\WopImages\\M1Trailer1CategoryD.PNG";
	        
	       imagecopyText(M1Trailer1CategoryD, 5);
	        
	       String Ocategory = "Category:";
	       
	       AddingmpMasterTrailer2Fields(Ocategory);
	       
	       
	       String M1Trailer1OffAirTypeD = "Pictures\\WopImages\\M1Trailer1OffAirTypeD.PNG";
	       
	       imagecopyText(M1Trailer1OffAirTypeD, 5);
	        
	       String OffAirType = "OffAirType:";
	       
	       AddingmpMasterTrailer2Fields(OffAirType);
	       
	       
	       String M1Trailer1LengthD = "Pictures\\WopImages\\M1Trailer1LengthD.PNG";
	       
	       imagecopyText(M1Trailer1LengthD, 5);
	        
	       String Length = "TheatricalTRT:";
	       
	       AddingmpMasterTrailer2Fields(Length);
		
	       
	       String MasterTrailer2RightClick = "Pictures\\WopImages\\MasterTrailer2RightClick.PNG";
           
           imageRightClick(MasterTrailer2RightClick, 5);   
          
           String MasterTrailer2winowclose = "Pictures\\WopImages\\CampaignDataWindowCose.PNG";
          
           imageFindClick(MasterTrailer2winowclose, 5);
		
	}

	
	 
	
	
	
	
	 public void MasterTrailerDatacomparison() {	   
		   
			
			for(int i=0; i<TxBase.wopMasterTrailerFields.size(); i++) {
				
				
			if(TxBase.wopMasterTrailerFields.get(i).equals(TxBase.mpMasterTrailer1Fields.get(i))) {
					
					
			logStep("WOP Master Trailer Field "+"(" + TxBase.wopMasterTrailerFields.get(i) + ")" +" MP Master Trailer_1 Field " + "(" +TxBase.mpMasterTrailer1Fields.get(i) + ")" + " Matched " );
					
					
			System.out.println("WOP Master Trailer Field "+"(" + TxBase.wopMasterTrailerFields.get(i) + ")" + " MP Master Trailer_1 Field " + "(" +TxBase.mpMasterTrailer1Fields.get(i) + ")" + " Matched " );
								
		}
			
			if(TxBase.wopMasterTrailerFields.get(i).equals(TxBase.wopTrailer.get(i))) {
				
				
			logStep("WOP Master Trailer Field "+"(" + TxBase.wopMasterTrailerFields.get(i) + ")" +" MP Master Trailer_2 Field " + "(" +TxBase.mpMasterTrailer2Fields.get(i) + ")" + " Matched " );
						
						
			System.out.println("WOP Master Trailer Field "+"(" + TxBase.wopMasterTrailerFields.get(i) + ")" + " MP Master Trailer_2 Field " + "(" +TxBase.mpMasterTrailer2Fields.get(i) + ")" + " Matched " );
												
	          }
					
			}

					   
	   }

	
}
