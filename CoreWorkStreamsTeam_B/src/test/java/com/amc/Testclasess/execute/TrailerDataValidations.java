package com.amc.Testclasess.execute;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.WOP_MPTrailerDataValidations;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


public class TrailerDataValidations extends TxBase {
	
	
	
	//TrailerDatacomparison
	
	WOP_MPTrailerDataValidations trailervalidation= new WOP_MPTrailerDataValidations(); 
			
	 
	@Features("Campaign Creation")

	@Stories("Campaign/MasterTrailer/Trailer")

	@Title("trailerDataComparison")
	
	@Test
	public void trailerDataComparison() throws InterruptedException, HeadlessException, FindFailed, UnsupportedFlavorException, IOException {
					
       Thread.sleep(2000);
		
		trailervalidation = PageFactory.initElements(driverWOP, WOP_MPTrailerDataValidations.class);
			
		trailervalidation.trailerDataSelection();
		
		trailervalidation.TrailerDatacomparison();
	}
		
		
		
	
			
			
	
	
	
	
	

}
