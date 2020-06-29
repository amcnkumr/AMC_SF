package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.WOP_MPMasterTrailerDataValidations;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class MasterTrailerDataValidations extends TxBase{
	
	
	
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Master Trailer Data ")

	@Title("MasterTrailer And Trailer Data Selection")
	 
	@Test(priority=4)
	
	 public void MasterTrailerAndTrailerDataSelectionTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPMasterTrailerDataValidations  masterTrailerValidationsSelection = new WOP_MPMasterTrailerDataValidations();
	
		//masterTrailerValidationsSelection = PageFactory.initElements(driverWOP, WOP_MPMasterTrailerDataValidations.class);
		
		masterTrailerValidationsSelection.masterTrailerAndTrailerDataSelection();
		
	
	}
	
	
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Master Trailer Data")

	@Title("Title Validation")
	 
	@Test(priority=5)
	
	 public void validateTitleTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		
		WOP_MPMasterTrailerDataValidations  masterTrailerValidationsTitle = new WOP_MPMasterTrailerDataValidations();
		
		//masterTrailerValidationsTitle = PageFactory.initElements(driverWOP, WOP_MPMasterTrailerDataValidations.class);

		masterTrailerValidationsTitle.MasterTrailerFieldscomparison("Title:");
		
	
	}
	
	
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Master Trailer Data")

	@Title("Expected FrameRate Validation")
	 
	@Test(priority=6)
	
	 public void validateExpectedFrameRateTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPMasterTrailerDataValidations  masterTrailerValidationsFrameRate = new WOP_MPMasterTrailerDataValidations();
		
		//masterTrailerValidationsFrameRate = PageFactory.initElements(driverWOP, WOP_MPMasterTrailerDataValidations.class);
		
		masterTrailerValidationsFrameRate.MasterTrailerFieldscomparison("ExpectedFrameRate:");
		
	
	}
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Master Trailer Data")

	@Title("Expected VideoCodec Validation")
	 
	@Test(priority=7)
	
	 public void validateExpectedVideoCodecTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPMasterTrailerDataValidations  masterTrailerValidationsCodec = new WOP_MPMasterTrailerDataValidations();
		
		//masterTrailerValidationsCodec = PageFactory.initElements(driverWOP, WOP_MPMasterTrailerDataValidations.class);
		
		masterTrailerValidationsCodec.MasterTrailerFieldscomparison("ExpectedVideoCodec:");
		
	
	}
	
	
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Master Trailer Data")

	@Title("Expected AspectRatio Validation")
	 
	@Test(priority=8)
	
	 public void validateExpectedAspectRatioTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPMasterTrailerDataValidations  masterTrailerValidationsAspectRatio = new WOP_MPMasterTrailerDataValidations();
		
		//masterTrailerValidationsAspectRatio = PageFactory.initElements(driverWOP, WOP_MPMasterTrailerDataValidations.class);
		
		masterTrailerValidationsAspectRatio.MasterTrailerFieldscomparison("ExpectedAspectRatio:");
		
	
	}
	
	@Features("ShortForm_Regression")

	@Stories("WOP-MP Master Trailer Data")

	@Title("Expected Format Validation")
	 
	@Test(priority=9)
	
	 public void validateExpectedFormatTest() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
			
		WOP_MPMasterTrailerDataValidations  masterTrailerValidationsExFormat = new WOP_MPMasterTrailerDataValidations();
		
		//masterTrailerValidationsExFormat = PageFactory.initElements(driverWOP, WOP_MPMasterTrailerDataValidations.class);
		
		masterTrailerValidationsExFormat.MasterTrailerFieldscomparison("ExpectedFormat:");
		
	
	}
	
	
}
