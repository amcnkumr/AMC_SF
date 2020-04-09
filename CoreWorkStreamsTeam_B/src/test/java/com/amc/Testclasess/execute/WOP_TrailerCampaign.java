package com.amc.Testclasess.execute;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.WOP_TrailorCampaignObjects;


public class WOP_TrailerCampaign extends TxBase {
	
	WOP_TrailorCampaignObjects campaign ;
	
	
	 @Test	
	 public void wopTrailerCampaignTest() throws Exception {
			
		 campaign.trailerCampaign();
		
	 }             

	  
	 @BeforeTest
		public void beforeTest() throws InterruptedException {
			
		 //Launch the browser and WOP Program
			
			Thread.sleep(2000);
			
			campaign = PageFactory.initElements(driverWOP, WOP_TrailorCampaignObjects.class);
		}
	 
	 
	 
	
		 
		 
	 
	 
	 
	 
}
