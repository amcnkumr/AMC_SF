package com.amc.Testclasess.execute;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txbase.WOPprogrameUtils;
import com.amc.txrepo.MPObjects;
import com.amc.txrepo.WOPObjets;

public class MP_launchAndLogin extends TxBase {
	
	WOPprogrameUtils WopUtils = new WOPprogrameUtils();
	
	WOPObjets WopObj ;
	
	MPObjects MpObj;
	
	
	
	@Test
	public void mpLaunchAndLoginTest() throws Exception {
		
		//Launch the browser and MP Program
			
		Thread.sleep(20000);
		
		WopUtils.launchProgram("MP","Test");
		
		MpObj=  PageFactory.initElements(driverWOP, MPObjects.class);
		
		System.out.println("Test================");
		
		MpObj.NonProdLogin("NonProd");
		
		MpObj.selectProgrameType("MediaPulse-TEST");
		
	}

}
