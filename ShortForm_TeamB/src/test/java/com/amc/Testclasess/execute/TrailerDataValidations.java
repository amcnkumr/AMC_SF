package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;

import com.amc.txrepo.WOP_MPTrailerDataValidations;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


public class TrailerDataValidations extends TxBase {
	
	
	
			
	 
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("Title Field Validation")
	 
	@Test(priority=10)
	
	public void validateTitleTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
					
		WOP_MPTrailerDataValidations trailervalidationTitle = new WOP_MPTrailerDataValidations();
		
		//trailervalidationTitle = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationTitle.TrailerFieldscomparison("Title:");

	}
		
		
		
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("Start Date Field Validation")
	 
	@Test(priority=11)
	
	 public void validateStartDateTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPTrailerDataValidations trailervalidationStart = new WOP_MPTrailerDataValidations();
		
		//trailervalidationStart = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationStart.TrailerFieldscomparison("TrailerStartDate:");
		
	
	}
			
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("End Date Field Validation")
	 
	@Test(priority=12)
	
	 public void validateEndDateTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPTrailerDataValidations trailervalidationEnd = new WOP_MPTrailerDataValidations();
		
		//trailervalidationEnd = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationEnd.TrailerFieldscomparison("TrailerEndDate:");
		
	
	}
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("OwnerNetwork Field Validation")
	 
	@Test(priority=13)
	
	 public void validateOwnerNetworkTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPTrailerDataValidations trailervalidationNet = new WOP_MPTrailerDataValidations();
		
		//trailervalidationNet = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationNet.TrailerFieldscomparison("OwnerNetwork:");
		
	
	}
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("Expected FrameRate Field Validation")
	 
	@Test(priority=14)
	
	 public void validateExpectedFrameRateTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPTrailerDataValidations trailervalidationRate = new WOP_MPTrailerDataValidations();
		
		//trailervalidationRate = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationRate.TrailerFieldscomparison("ExpectedFrameRate:");
		
	
	}
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("Expected VideoCodec Field Validation")
	 
	@Test(priority=15)
	
	 public void validateExpectedVideoCodecTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPTrailerDataValidations trailervalidationVideoCodec = new WOP_MPTrailerDataValidations();
		
		//trailervalidationVideoCodec = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationVideoCodec.TrailerFieldscomparison("ExpectedVideoCodec:");
		
	
	}
	
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("Expected AspectRatio Field Validation")
	 
	@Test(priority=16)
	
	 public void validateExpectedAspectRatioTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPTrailerDataValidations trailervalidationRatio = new WOP_MPTrailerDataValidations();
		
		//trailervalidationRatio = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationRatio.TrailerFieldscomparison("ExpectedAspectRatio:");
		
	
	}
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Trailer Data")

	@Title("Expected Format Field Validation")
	 
	@Test(priority=17)
	
	 public void validateExpectedFormatTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPTrailerDataValidations trailervalidationFormat = new WOP_MPTrailerDataValidations();
		
		//trailervalidationFormat = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
		
		trailervalidationFormat.TrailerFieldscomparison("ExpectedFormat:");
		
	
	}
	
	
	
	
	

}
