package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.WOPtoMP_CampaignDataValidation;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


public class CampaignDataValidations extends TxBase {
	
	
	WOPtoMP_CampaignDataValidation Datavalidations = new WOPtoMP_CampaignDataValidation();
	
	
	@Features("Campaign Creation")

	@Stories("Campaign/MasterTrailer/Trailer")

	@Title("CampaignDataComparion")
	 
	@Test
	 public void CampaignDataComparion() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		Thread.sleep(2000);
		
		Datavalidations = PageFactory.initElements(driverWOP, WOPtoMP_CampaignDataValidation.class);
		
		Datavalidations.campaignDataSelection(); 
		
		Datavalidations.campaignDatacomparison();
	
	}
	
	

}
