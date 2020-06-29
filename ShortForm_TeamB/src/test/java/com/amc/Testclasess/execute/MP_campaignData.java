package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.MP_CampaignObjects;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


public class MP_campaignData extends TxBase{
	
	
	MP_CampaignObjects mpcampaign = new MP_CampaignObjects();
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP to MP Integration")

	@Title("Integration From WOP to MP")
	 
	@Test
		public void CampaginIntigrationFromWOPtoMP() throws InterruptedException, FindFailed, HeadlessException, UnsupportedFlavorException, IOException {
			
		 //Launch the browser and WOP Program
			
			Thread.sleep(3000);
			
			mpcampaign = PageFactory.initElements(driverWOP, MP_CampaignObjects.class);
			
			mpcampaign.projectManagement();
			
			mpcampaign.campaignFieldsSelection();
			
			
			
			
			
			
		}
	
	 
	 
	 
	 
	 
	 
}
