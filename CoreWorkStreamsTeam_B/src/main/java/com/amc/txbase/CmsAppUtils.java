
package com.amc.txbase;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeSuite;

import com.amc.txrepo.CMSObjects;

public class CmsAppUtils extends TxBase {

	// NonProdPortal nonprod = new NonProdPortal();

	CMSObjects obr;

	TxBase cmsTestBase = new TxBase();

	// WebDriver driver;

	@BeforeSuite(enabled = true)

	public void pushingRecords() throws Exception {

		System.out.println("Started CMSNV Record Migration");

		nonProdPortalLaunch();

		obr = PageFactory.initElements(driver, CMSObjects.class);

		System.out.println(obr);

		obr.WelcomeAccept();

		//logStep("Accepted Welcome screen");



		obr.detectReceiver();

		//logStep("Selected detectReceiver");

		obr.openCitrixLancher();

		obr.alreadyInstalled();

		//logStep("Closed the Citrix Launcher");

		obr.amcCredentials(1, "NonProdLoginCredentials");

		logStep("Entered the AMC Credentials");

		obr.allappsbtn();

		//logStep("Selected the all apps button");

		obr.cmsTest();

		//logStep("Clicked on the CMS test application");

		obr.cmsFileOpen();

		//logStep("Selected the CMS file");

		obr.cmsCredentials();

		logStep("Entered the CMSNV credntials");

		obr.titleVersionSearch();

		//logStep("Clicked the title verion button");

		obr.serialNumberInCMS(0, "FDIDNUMBERS");

		//logStep("FDID reading from excel sheet");

		logStep("Entered FDID");

		//-----Enable in Future prospective
		/*	try {

			obr.accepted();

			//logStep("Accepted the title record");

		} catch (Exception e) {

			//System.out.println(e.getMessage());
		obr.nullTitle();

	}*/
		obr.nullTitle();

		obr.datMigrationTab();

		logStep("Navigated to data migration tab");

		//obr.pushToMigrate();

		//attachScreen(driver);

		logStep("Pushed the record");

		//obr.migrationRequest();

		//attachScreen(driver);

		//logStep("Accepted the migration request");

		try {
			//obr.migrationDate();

			//attachScreen(driver);

			//logStep("Navigated to migration date");

			//logStep("Migration Is Successfull...");

			System.out.println("");


		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			obr.mainMenu();

			//logStep("Selected the main menu in cms file maker");

			obr.quitFileMaker();

			//logStep("Quit the file maker");

			obr.acknowledgeFileMakerQuit();

			//logStep("Acknowledged the file maker ");

			obr.closingFilemaker();

			obr.FilemakerMenu();

			obr.FilemakerExit();

			//logStep("Closed the file maker");

			/*logStep("Record Migration Got Successfull....");

			logStep("Waiting For 1mt before API Response and Validation... ");

			System.out.println("Waiting For 1mt before API Response and Validation...");

			Thread.sleep(60000);*/

			System.out.println("******************************");

		}


	}






}
