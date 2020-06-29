package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;



import org.sikuli.script.FindFailed;

import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.WOPtoMP_CampaignDataValidation;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


public class CampaignDataValidations extends TxBase {
	
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP to MP Campaign Data")

	@Title("Campaign Title Validation")
	 
	@Test(priority=1)
	
	 public void validateCampaignTitleTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException  {
			
		WOPtoMP_CampaignDataValidation DatavalidationsTitle = new WOPtoMP_CampaignDataValidation();
		
		//DatavalidationsTitle = PageFactory.initElements(driverWOP, WOPtoMP_CampaignDataValidation.class);
		
		DatavalidationsTitle.campaignFieldsComparision("CampaignTitle:");
			
	}
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP to MP Campaign Data")

	@Title("Campaign Owner Validation")
	 
	@Test(priority=2)
	
	 public void validateCampaignOwnerTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOPtoMP_CampaignDataValidation DatavalidationsOwner = new WOPtoMP_CampaignDataValidation();
		
		//DatavalidationsOwner = PageFactory.initElements(driverWOP, WOPtoMP_CampaignDataValidation.class);
		
		DatavalidationsOwner.campaignFieldsComparision("CampaignOwner:");
	
	}
	
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP to MP Campaign Data")

	@Title("OwnerNetwork Validation")
	 
	@Test(priority=3)
	
	 public void validateOwnerNetworkTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOPtoMP_CampaignDataValidation DatavalidationsNetwork = new WOPtoMP_CampaignDataValidation();
		
		//DatavalidationsNetwork = PageFactory.initElements(driverWOP, WOPtoMP_CampaignDataValidation.class);
		
		DatavalidationsNetwork.campaignFieldsComparision("OwnerNetwork:");
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
