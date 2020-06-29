package com.amc.txbase;


import java.awt.Desktop;
import java.awt.HeadlessException;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.Button;

import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;

import org.sikuli.script.Pattern;

import org.sikuli.script.Screen;

import org.testng.annotations.AfterSuite;

import com.amc.txrepo.CMSObjects;


import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class TxBase {

	public static WebDriver driver;
	public static WebDriver driverWOP;
	public static WebDriver driverMP;
	public static String Exception = "NA";
	public static String ProgramEnv = null;
	public static String programType = null;
	public Screen screen = new Screen();
	public static File index;
	
	
	
	public static  ArrayList<String> wopCampaignFields= new ArrayList<>();
	
	public static  ArrayList<String> wopMasterTrailerFields= new ArrayList<>();
	
	public static ArrayList<String> wopTrailer= new ArrayList<>();
	
	
	public static ArrayList<String> mpCampaignFields = new ArrayList<>();
	
	public static ArrayList<String> mpMasterTrailerFields = new ArrayList<>();
	
	public static ArrayList<String> mptrailerFields = new ArrayList<>();
	
	
	
	
	
	
	
	public static String textvalue;
	
	// Allure Generator

	@Step("{0}")

	public static void logStep(String stepName) {

	}

	// Explicit Wait to balance between the Browser and WebElements

	public void timing(WebElement accept) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOf(accept));

	}

	
	
	
	@SuppressWarnings("unlikely-arg-type")
	
	public void wopCampaignFields(String field) {
		
		if (!wopCampaignFields.equals(field)) {
			
			wopCampaignFields.add(field);
			
			for(int i=0; i<wopCampaignFields.size(); i++) {
				
				System.out.println("WOP Campaign Field Value :"+ wopCampaignFields.get(i));
			}
			
			
		}
		
	}
	
	
       @SuppressWarnings("unlikely-arg-type")
      public void WopMasterTrailerFields(String field) {
	      
	   if (!wopMasterTrailerFields.equals(field)) {
			
		   wopMasterTrailerFields.add(field);
			
			for(int i=0; i<wopMasterTrailerFields.size(); i++) {
				
				System.out.println("WOP Master Trailer Field Value :"+ wopMasterTrailerFields.get(i));
			}
			
			
		}
	   
   }
	
	
       
       @SuppressWarnings("unlikely-arg-type")
       public void wopTrailerFields(String field) {
 	      
 	   if (!wopTrailer.equals(field)) {
 			
 		  wopTrailer.add(field);
 			
 			for(int i=0; i<wopTrailer.size(); i++) {
 				
 				System.out.println(" WOP Trailer Field Value :"+ wopTrailer.get(i));
 			}
 			
 			
 		}
 	   
    }
       
       
	@SuppressWarnings("unlikely-arg-type")
	
	public void mpCampaignFields(String field) { 
		
		if (!mpCampaignFields.equals(field + textvalue)) {
			
			mpCampaignFields.add(field+ textvalue);
			
			for(int i=0; i<mpCampaignFields.size(); i++) {
				
				System.out.println(" MP Campaign Field Value :"+ mpCampaignFields.get(i));
			}
			
		
			
		}
		
	}
       
       

	
       

//mpMasterTrailer1Fields

@SuppressWarnings("unlikely-arg-type")

public void mpMasterTrailerFields(String field) { 
	
	if (!mpMasterTrailerFields.equals(field+textvalue)) {
		
		mpMasterTrailerFields.add(field+textvalue);
		
		for(int i=0; i<mpMasterTrailerFields.size(); i++) {
			
			System.out.println(" MP Master Trailer Field Value:"+ mpMasterTrailerFields.get(i));
		}
		
	
		
	}
	
}




@SuppressWarnings("unlikely-arg-type")
public void mpTrailerFields(String field) { 
	
	if (!mptrailerFields.equals(field+textvalue)) {
		
		mptrailerFields.add(field+textvalue);
		
		for(int i=0; i<mptrailerFields.size(); i++) {
			
			System.out.println("MP Trailer Field Value :"+ mptrailerFields.get(i));
		}
		
	
		
	}
	
}






	// Browser Launching
	// Hits the nonprodportal.amcnetworks.com

	public WebDriver nonProdPortalLaunch() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://nonprodportal.amcnetworks.com/Citrix/AppsWeb/");

		System.out.println(driver);

		return driver;

	}

	// Browser Launching
	// Hits the WOP Program.amcnetworks.com

	public WebDriver wopProgramLaunch() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driverWOP = new ChromeDriver();

		driverWOP.manage().window().maximize();

		driverWOP.get("woprogram.amcnetworks.com/RDWeb");

		System.out.println("DriverDetails=========:" + driverWOP);

		return driverWOP;

	}

	// Reads the Sikuli pictures folder path

	public Pattern fileReaders(String filename) {

		filename = System.getProperty("user.dir") + "\\" + filename;

		Pattern pattern = new Pattern(filename);

		return pattern;
	}

	// Handling Master Trailer Inheritance window

	public void inheritaceWindow() throws FindFailed {

		String InheritanceOk = "Pictures\\WopImages\\InheritanceOk.PNG";

		Pattern patternInheritanceOk = fileReaders(InheritanceOk);

		screen.wait(patternInheritanceOk, 3);

		screen.click();

		screen.wait((Double) 3.0);
	}

	// Logout From Nonprodportal Application
	// Closes the Browser

	@AfterSuite(enabled = false)

	public void closingbrowser() throws Exception {

		CMSObjects obr = new CMSObjects(driver);

		obr.logoutNonProdPortal();

		logStep("Nonprod portal logged out successfully ");

		System.out.println("Nonprod portal logged out successfully...");

		// logger("Nonprod portal logged out successfully ");

		driverClose();

		logStep("Browser is Closed.. ");

		System.out.println("Browser Is Closed...");
	}

	// Function for take the screen shot in allure report
	@Attachment("Screenshot")
	public static byte[] attachScreen(WebDriver driver) {
		logStep("Taking screenshot");
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	public File attachScreenFile() {
		logStep("Taking screenshot");
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	}

	@Attachment("Error_Screenshot")
	public static byte[] attachScreen_TestCaseError(WebDriver driver) {
		logStep("Taking screenshot");
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	// Explicit Wait to balance between the Browser and WebElements

	public void ExplicitWait(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 22);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	
	// Image click using Sikuli
	public void imageClick(String ImagePath, int waitTime) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.click(ProdSearchView);
	}

	// Image click using Sikuli
	public void imageClickMultiple(String ImagePath, int waitTime, int iterations) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		for (int i = 0; i <= iterations; i++) {
			screen.click(ProdSearchView);
		}
	}

	// Image click using Sikuli
	@SuppressWarnings("unused")
	public void imageDragDrop(String startImagePath, String endImagePath) throws FindFailed {
		// Search For the view
		Pattern Startingpoint = fileReaders(startImagePath);
		Pattern endingpoint = fileReaders(endImagePath);
		screen.hover(startImagePath);
		screen.mouseDown(Button.LEFT);
		screen.mouseMove(endingpoint);
		screen.mouseUp(Button.LEFT);

	}

	// Image click using Sikuli
	public void imageFind(String ImagePath, int waitTime) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.find(ProdSearchView);
		screen.doubleClick(ProdSearchView);
		
		
	}

	// Image click using Sikuli
	public String imageFindandread(String ImagePath, int waitTime, String direction, int length) throws FindFailed {
		String textvalue = null;
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		if (direction.equalsIgnoreCase("right")) {
			textvalue = screen.find(ProdSearchView).right(length).text();
		} else if (direction.equalsIgnoreCase("left")) {
			textvalue = screen.find(ProdSearchView).left(length).text();
		}
		return textvalue;
	}

	public void EnterTextandTab(String ImagePath, String Value, int waitTime) throws FindFailed {
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.doubleClick(ProdSearchView);
		screen.wait((Double) 1.0);
		screen.type(Value);
		screen.type(Keys.TAB);
		
		try {

			inheritaceWindow();

		} catch (Exception e) {

			System.out.println("Inharitance window not populated");
		}

		screen.type(Keys.ESC);
		
		screen.wait((Double) 2.0);
	}

	
	// Clicking KeyBoard Enter Method
	
	public void keyEnter() {
		
		screen.type(Keys.ENTER);
		
	}
	
	
	public void keyLeft() {
		
		screen.type(Keys.LEFT);
		
	}
	
	
	// Key Up Method:
	
	public void KeyUpMethod() throws FindFailed {
		
		screen.type(Keys.UP);
		
		screen.wait((Double) 1.0);
		
	}
	
	// Key Down Method: 
	
	public void keyDownMethod() throws FindFailed {
		
		screen.type(Keys.DOWN);
		
		screen.wait((Double) 1.0);
		
	}
	
	
	// Tab and Enter
	
	public void tabAndEnter(String Data) {

		if (Data == "Campaign") {
			
			for(int i=0;i<=6;i++) {
				
				screen.type(Keys.UP);
			}
			
			screen.type(Keys.LEFT);
			
			screen.type(Keys.ENTER);
			
			screen.type(Keys.ENTER);
		}

		 	
		else if (Data == "M1_Trailer Test_1") {
			

		for (int i = 0; i <= 2-1; i++) {
							 
			screen.type(Keys.UP);
			
		}

	        
			screen.type(Keys.ENTER);

		}
		else if (Data == "M1_Trailer Test_2") {

			for (int i = 0; i <= 1-1; i++) {
				
				screen.type(Keys.DOWN);
			}

			screen.type(Keys.ENTER);

		}

		else if (Data == "Master Trailer_2") {

			for (int i = 1; i <=5-1; i++) {
				
				screen.type(Keys.DOWN);
			}

			screen.type(Keys.ENTER);
		}

		
		else if (Data == "M2_Trailer Test_1") {

			for (int i = 0; i <= 2-1; i++) {
				
				screen.type(Keys.DOWN);
			}
			

			screen.type(Keys.ENTER);

		}

		else if (Data == "M2_Trailer Test_2") {

			for (int i = 0; i <= 1-1; i++) {

				screen.type(Keys.DOWN);

			}

			screen.type(Keys.ENTER);

		} else {
			
			System.out.println("No Campaign Data Available");
			
		}

	}
	
	
	
		
	// Select and copy
	public String imagecopyText(String ImagePath, int waitTime)
			throws FindFailed, HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
		//String textvalue = null;
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.click(ProdSearchView);
		screen.type("a", KeyModifier.CTRL);
		Thread.sleep(2000);
		screen.type("c", KeyModifier.CTRL);
		Thread.sleep(2000);
		textvalue = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println("The Value is : " + textvalue);
		return textvalue;
	}

	// Double click and Copy
	public String imagedoubleclickcopyText(String ImagePath, int waitTime)
			throws FindFailed, HeadlessException, UnsupportedFlavorException, IOException {
		String textvalue = null;
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.doubleClick(ProdSearchView);
		screen.type("a", KeyModifier.CTRL);
		screen.wait((double) 2.0);
		textvalue = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		screen.wait((double) 2.0);
		System.out.println("The Value is : " + textvalue);
		return textvalue;
	}

	// Image FindAndclick using Sikuli
	public void imageFindClick(String ImagePath, int waitTime) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.find(ProdSearchView);
		screen.click(ProdSearchView);
	}

	// Image grow and Click
	
	public void imagegrow(String ImagePath, int waitTime) throws FindFailed {
		
		Pattern ProdSearchView = fileReaders(ImagePath);	
		
		screen.wait(ProdSearchView,waitTime).offset(0, 40).grow(15,0).click();
	}
	
	// Image Doubleclick using Sikuli
	public void imageDoubleClick(String ImagePath, int waitTime) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.doubleClick(ProdSearchView);
	}

	// Image Rightclick using Sikuli
	public void imageRightClick(String ImagePath, int waitTime) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.rightClick(ProdSearchView);
	}

	// Type Text in Sikuli
	public void imageEnterText(String ImagePath, String Text, int waitTime) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.click(ProdSearchView);
		screen.type("a", KeyModifier.CTRL);
		screen.type(Keys.BACKSPACE); // delete selection
		screen.type(Text);
	}

	// Type Text in Sikuli
	public void imagedoubleClickEnterText(String ImagePath, String Text, int waitTime) throws FindFailed {
		// Search For the view
		Pattern ProdSearchView = fileReaders(ImagePath);
		screen.wait(ProdSearchView, waitTime);
		screen.doubleClick(ProdSearchView);
		screen.type("a", KeyModifier.CTRL);
		screen.type(Keys.BACKSPACE); // delete selection
		screen.type(Text);
	}

	
	
	//  public void closing campaign browsers
	
	public void closingCampaignBrowsers() throws FindFailed {
		
         String CampaignNavigatorFile = "Pictures\\WopImages\\MediaAssetFile.PNG";
		 
		 String CampaignNavigatorClose = "Pictures\\WopImages\\MediaAssetClose.PNG";
		  
		 imageFindClick(CampaignNavigatorFile,4);
		 
		 imageFindClick(CampaignNavigatorClose,3);
		 
		 screen.wait((double) 2.0);
		 	 	 
		
	}
	
	
	// Disoconnect the WOP Program
	
	public void disconnectWop() throws FindFailed {
		
         String Disconnect = "Pictures\\WopImages\\Disconnect.PNG";
		 
		 String LoggOff = "Pictures\\WopImages\\LoggOff.PNG";
		 
		 String WoRightClick = "Pictures\\WopImages\\WoRightClick.PNG";
		 
		 String CloseRight = "Pictures\\\\WopImages\\\\CloseRight.PNG";
		 
         imageFindClick(Disconnect,4);
		 
		 imageFindClick(LoggOff,4);
		 
		 screen.wait((double) 1.0 );
		 
		 imageRightClick(WoRightClick,3);
		 
		 imageFindClick(CloseRight,3);
		 
		 imageFindClick(LoggOff,4);
		 
		 screen.wait((double) 2.0 );
		
	}
	
	
	
	
	// Clear Download folder

	public void cleanFolder(String programName) {

		index = new File(System.getProperty("user.dir") + "\\Downloads\\" + programName);
		if (index.exists()) {
			System.out.println(programName + "Folder exist and need to clear the files in that ");
		} else {
			try {
				index.mkdir();
				System.out.println("Folder Created SUccessFully");
			} catch (SecurityException se) {
				
				System.out.println(se.getMessage());
			}
		}
		String[] entries = index.list();
		try {
			for (String s : entries) {
				File currentFile = new File(index.getPath(), s);
				currentFile.delete();
			}
		} catch (Exception e) {
			System.out.println("No files are there to delete from " + index.toString());
		}
	}

	// Browser Launching

	// Hits the portal URL
	@SuppressWarnings("deprecation")
	public WebDriver launchProgram(String programName, String Env) throws Exception {

		ProgramEnv = Env;
		programType = programName;
		ExcelUtils excelUtils = new ExcelUtils();

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		cleanFolder(programName);
		String downloadFilepath = index.toString();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driverWOP = new ChromeDriver(cap);
		

		driverWOP.manage().window().maximize();
		driverWOP.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logStep("Browser Launched Successfully..");

		System.out.println("Browser Launched Successfully..");

		excelUtils.readingexcelFiles("Urls");
		for (int i = 1; i <= excelUtils.lastRow; i++) {
			if (excelUtils.excelData[i][1].toString().equalsIgnoreCase(programName)
					&& excelUtils.excelData[i][2].toString().equalsIgnoreCase(Env)) {
				driverWOP.get(excelUtils.excelData[i][0]);
			} else {
				if (i == excelUtils.lastRow) {
					System.out.println("Program URL is not avilable to test");
				}
			}
		}

		

		return driverWOP;

	}

	
	// Linking New Media Asset to Master Trailer
	
	public void linkingMediaAsset(String prototype) throws Exception {
		
		String TrailerMenu = "Pictures\\WopImages\\TrailersLink.PNG";
		
		String NewMediaAsset = "Pictures\\WopImages\\NewMediaAsset.PNG";
		 
		 String WhatsOn = "Pictures\\WopImages\\WhatsOn.PNG";
		  
		 String MediaPrototypeSearch = "Pictures\\WopImages\\MediaPrototypeSearch.PNG";
		 
		 String PrototypeCreate = "Pictures\\WopImages\\PrototypeCreate.PNG";
		 
		 String MediaAssetSave = "Pictures\\WopImages\\MediaAssetSave.PNG";
		 
		 String MediaAssetFile = "Pictures\\WopImages\\MediaAssetFile.PNG";
		 
		 String MediaAssetClose = "Pictures\\WopImages\\MediaAssetClose.PNG";
		 
		 String WhatsOnClose = "Pictures\\WopImages\\WhatsOnClose.PNG";

		 imageFindClick(TrailerMenu, 3);
		 
		 imageFindClick(NewMediaAsset,3);
		 
		 try {
			 
			 imageFindClick(WhatsOn,3);
			 
		 }catch(Exception e) {
			 
			 System.out.println("WhatsOn Winow Not Displayed");
			 
		 }
		  
		 try {
			 
			 imageFindClick(WhatsOnClose,3);
		 }
		 catch(Exception e) {
			 
			 System.out.println("WhatsOn close Winow Not Displayed");
			 
		 }
		
		  
		 imagedoubleClickEnterText(MediaPrototypeSearch, prototype , 3);
		 
		 imageFindClick(PrototypeCreate,3);
		 
		 imageFindClick(MediaAssetSave, 3);
		 
		 imageFindClick(MediaAssetFile, 4);
		 
		 imageFindClick(MediaAssetClose, 3);
		 
		 screen.wait((double) 3.0);
	}
	
	
	public void openRemoteDesktopFile(String File) throws IOException {
		
		
		

		File file = new File("C:\\Users\\chaitanya\\Desktop\\Test_Automation\\RemoteFiles\\"+File+"");

		// first check if Desktop is supported by Platform or not

		if (!Desktop.isDesktopSupported()) {
			
			System.out.println("Desktop is not supported");
			
			return;
		}

		Desktop desktop = Desktop.getDesktop();
		if (file.exists())
			desktop.open(file);

	}

	// Closes the Driver

	public void driverClose() {

		driver.quit();
	}

}
