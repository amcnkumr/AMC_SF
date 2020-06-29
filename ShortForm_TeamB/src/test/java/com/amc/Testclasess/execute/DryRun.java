package com.amc.Testclasess.execute;










import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amc.txbase.TxBase;
import com.amc.txrepo.DryTest;

public class DryRun extends TxBase {
	
	
	
	@Test(priority=1)
	public void dryRun() throws java.lang.Exception {
		DryTest dd = new DryTest();
		
		dd = PageFactory.initElements(driverWOP, DryTest.class);
		
		dd.test1();
		
		
		
	}
	
	
	
		
	@Test(priority=2)
	public void dryRun2() throws java.lang.Exception {
		DryTest dd2 = new DryTest();
		dd2 = PageFactory.initElements(driverWOP, DryTest.class);
		dd2.test2();
		
	}


	
	@Test(priority=3)
	public void dryRun3() throws java.lang.Exception {
		DryTest dd3 = new DryTest();
		dd3 = PageFactory.initElements(driverWOP, DryTest.class);
		dd3.test3();
		
	}
}	
	
	

