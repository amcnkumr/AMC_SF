package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.WOP_MPMasterTrailerDataValidations;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class MasterTrailerDataValidations extends TxBase{
	
	
	
	WOP_MPMasterTrailerDataValidations  masterTrailerValidations  = new WOP_MPMasterTrailerDataValidations();
	
	
	
	@Features("Campaign Creation")

	@Stories("Campaign/MasterTrailer/Trailer")

	@Title("CampaignDataComparion")
	 
	@Test
	 public void MasterTrailerComparion() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		Thread.sleep(2000);
		
		
		masterTrailerValidations = PageFactory.initElements(driverWOP, WOP_MPMasterTrailerDataValidations.class);
		
		masterTrailerValidations.masterTrailer2DataSelection();
		
		masterTrailerValidations.MasterTrailerDatacomparison();
		
		
	
	}
	
	
	
	

}
