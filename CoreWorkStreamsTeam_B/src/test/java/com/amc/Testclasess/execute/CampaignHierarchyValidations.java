package com.amc.Testclasess.execute;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.WOPtoMP_CampaignHierarchyValidation;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class CampaignHierarchyValidations extends TxBase {
	
	
	WOPtoMP_CampaignHierarchyValidation  validations = new WOPtoMP_CampaignHierarchyValidation();
	
	
	
	@Features("Campaign Creation")

	@Stories("Campaign/MasterTrailer/Trailer")

	@Title("campaignHierarchycomparison")	
	 
	@Test
   
	public void campaignHierarchycomparison() throws InterruptedException {
			
		Thread.sleep(2000);
		
		validations = PageFactory.initElements(driverWOP, WOPtoMP_CampaignHierarchyValidation.class);
		
		validations.campaignHierarchycomparison();
	}
	

}
