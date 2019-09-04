package TvJawwyUtil;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * below class "SampleTestingPageObject" is the selenium WebDriver functionality 
 * (like finding/locating elements on webpage, performing actions on the elements)  
 * */
 
public class SampleTestingPageObject {

		public static WebDriver driver;
		public static Properties prop;
	    //public static URL url;
	    public static DesiredCapabilities capabilities;
	   // private final int offset = 500;
	    String destDir;
	    DateFormat dateFormat;
	
		
	public SampleTestingPageObject(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/TvJawwyConfig"
						+ "/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	}
		
		//initialization method to define the web browser details in base class 
		public static  void initialization(){
			String browserName = prop.getProperty("browser");
			//SelectedLanguage param based on the language selected in Config.properties file
			//Arabic or English
			String SelectedLanguage = prop.getProperty("Selected_Language");
						
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "/Users/Basem/Downloads/chromedriver.exe");	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "/Users/Basem/Documents/SeleniumServer/geckodriver.exe");	
				driver = new FirefoxDriver(); 
			} 
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			if (SelectedLanguage.contentEquals("Arabic"))
			driver.get(prop.getProperty("url_Ar"));
			else
			driver.get(prop.getProperty("url_En"));
			
	 	}
		 
		//Wait for element Method mainly used in case page loading and waiting for specific element to shown before proceed with test scenario 
		public  void waitForElement(WebElement by) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, 30);
	            wait.until(ExpectedConditions.elementToBeClickable(by));
	        } catch (Exception e) {
	            System.out.println("the element not able load::" + e);
	        }

	    }

		//Static wait for specific sent of milliseconds
	    public  void staticWait(int milisec) {
	        try {
	            Thread.sleep(milisec);
	        } catch (Exception e) {
	            // TODO: handle exception
	        }

	    }

	    //Is ELement present? Return true or false 
	    public Boolean isElementPresent(WebElement By ) {

	           if(By.isDisplayed())
	        	   return true;
	           else
	            return false;
	        
	    }

	
	    
	    //Get current date method
	    public String getCurrentDate() {

	        LocalDate localDate = LocalDate.now();
	        String date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
	        System.out.println(date);
	        String[] dat = date.split("/");
	        String datefrmt = dat[0] + "-" + dat[1] + "-" + dat[2];
	        System.out.println("the framed date is ::" + datefrmt);
	        return datefrmt;
	    }

 
	    //In case enter a text in a web element 
	    public void enterText(WebElement ele, String data) {
	        waitForElement(ele);
	        ele.clear();
	        ele.sendKeys(data, "\n");
	    }

	   //select from dropdownlist by Value 
	    //for example to select lebnon 
	    //<option value="LIB">لبنان</option>
	    //so sent value as LIB
	    public void SelectDropdownlistByValue(WebElement ele, String Value)
	    {
	    	Select dropdown = new Select(ele);
	    	dropdown.selectByValue(Value);
 
	    }

	    //Click action method
	    public  void clickOnElement(WebElement ele) {
	        //waitForElement(ele);
	        ele.click();
	    }

	    
	    //go back method
	    public void pressBack()
	    {
	        driver.navigate().back();
	    } 
	    
	    //Close the browser method
	    public  void CloseBrowser()
	    {
	        driver.quit();;
	    }

	  
//	    //to check if displayed Payment options are multiple 
//	    
//	    public Boolean IsMultipleAvailablePaymentOptions(WebElement ele)
//	    { 
//	    	List<WebElement> eList 
//	    }
//	    
//	    
	    
	    //Screenshot method
	   public  void takeScreeenShot(WebDriver driver, String testCaseName)  {
		// Set folder name to store screenshots.
	        destDir = "C:\\Users\\Basem\\eclipse-workspace\\JawwyTestingProject\\test-outout";

	        System.out.println("driver object : "+driver);
	        // Capture screenshot.
	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        // Set date format to set It as screenshot file name.
	        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
	        // Create folder under project with name "screenshots" provided to destDir.
	        //new File(destDir);//.mkdirs();
	        // Set file name using current date time.
	        String destFile = testCaseName +"_"+ dateFormat.format(new Date()) + ".png";

	        try {
	            // Copy paste file at destination folder location
	            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
	        } catch (IOException e) {
	            e.printStackTrace();
	        } }
	    
	
	   
}
