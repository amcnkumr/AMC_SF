package com.amc.Testclasess.execute;

import org.testng.annotations.Test;

import com.amc.txbase.ExcelUtils;
import com.amc.txbase.TxBase;
import com.amc.txbase.WOPprogrameUtils;
import com.amc.txrepo.WOPObjets;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WOP_launchAndLogin extends TxBase{
	
	WOPprogrameUtils WopUtils = new WOPprogrameUtils();
	
	WOPObjets WopObj ;
	
	ExcelUtils excelUtils = new ExcelUtils();
	
	
	
	@Test
	public void launch() throws Exception {
		
		WopObj.Login("Naresh");
		WopObj.reenterPassword();		
	}
	
	@BeforeTest
	public void beforeTest() throws Exception {
		//Launch the browser and WOP Program
		WopUtils.launchProgram("WOP","Test");
		//Thread.sleep(2000);
		WopObj = PageFactory.initElements(driverWOP, WOPObjets.class);
	}

	@AfterTest
	public void afterTest() {
				
	}

}
