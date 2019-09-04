package TvJawwyStepDefinition;

import org.openqa.selenium.support.PageFactory;

import TvJawwyPages.Homepage;
import TvJawwyPages.JawwyAllObjects;
import TvJawwyUtil.SampleTestingPageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class HomepageStep extends SampleTestingPageObject {

	public Homepage HomepageObject;
	public JawwyAllObjects JawwyAllObjectsObj; 
	//setup and teardown code logic to handle the test execution
	//This will run before the Scenario
	   @Before
	   public void beforeScenario(){

	       System.out.println("Jawwy homepage open sucessfully");
	       //Initialization for webdriver
	       SampleTestingPageObject.initialization();	
		   //identify the Homepage and JawwyallObject objects 
			 HomepageObject = new Homepage(); // PageFactory.initElements(driver, Homepage.class);
			 JawwyAllObjectsObj = PageFactory.initElements(driver, JawwyAllObjects.class);
			
	   }	
		
	   //This will run after the Scenario
		@After
	   public void afterScenario(){
	       System.out.println("This will run after the Scenario");
	       CloseBrowser();
	   }

		//////////////// First scenario Scenario
		@Given("^Jawwy homepage open successfully$")
		public void Validate_HomepageTitle() throws Throwable {
			  System.out.println("Jawwy homepage open successfully");
			   
			//String actualText = HomepageObject.validateHomePageTitle(driver).toString();
		    //Assert.assertTrue(actualText.toLowerCase().contains("TV".toLowerCase()));
		    	//In case of arabic title: title "جوّي TV – شاهد أفلام ومسلسلات أونلاين وبث تلفزيوني مباشر | 7 أيام مجاناً"
		    	//In case of English title "Jawwy TV - Watch Online movies, series & live TV | 7 days free"
		    	// SO both of them have "TV" keyword which i will do my validation based on it
		 
		    //Click at 7 days trail button
		    clickOnElement(JawwyAllObjectsObj.SubscribeButton);
		    //Click on register button in subscription page 
		    if (prop.getProperty("Selected_Language").equals("Arabic"))
				clickOnElement(JawwyAllObjectsObj.RegisterButtonAr);
			else 
				clickOnElement(JawwyAllObjectsObj.RegisterButtonEn);
	}		


		//Enter username and password and there is two different ways to get them 
		 //Regular expression which can be used instead of enter username and password hard coded
		 //1. \"([^\"]*)\"
		 //2. \"(.*)\"
	
		 @And("^user enters \"(.*)\"$")
		 public void user_enters_username_and_password(String username){
			
			 System.out.println("user clicks username and password");
			 //get username and password from properties file
			 username= prop.getProperty("username");
			
			 //enter the email id in username field 
			 //JawwyAllObjectsObj.jawwy_user_email_TextBox.sendKeys(username);
			 enterText(JawwyAllObjectsObj.jawwy_user_email_TextBox,username);
			 // Waiting 1000 ms till button being enabled 
			 staticWait(2000);
			 //Click on Next button to proceed with later steps
			 clickOnElement(JawwyAllObjectsObj.signup_fromEmail_Button);
			 //Enter the password in password field
		
		 }
		
		 //2nd way: 
		 //Another sample to get username and password from config.properties
		 //@Then("^user enters \"(.*)\" and \"(.*)\"$")
		 //public void user_enters_username_and_password(String username, String password){
		 //driver.findElement(prop.getProperty("username")).sendKeys(username);
		 //driver.findElement(prop.getProperty("password")).sendKeys(password);
		 //}
		
		@And("^user enters \"(.*)\" also clicks on continue button$")
		public void Click_at_Continue_button(String password) throws Throwable {
			 password= prop.getProperty("password");
			 enterText(JawwyAllObjectsObj.jawwy_user_Password_TextBox, password);
				// Waiting 1000 ms till button being enabled 
				 staticWait(1000);
				
			System.out.println("user clicks on continue button");
			 //clickOnElement(JawwyAllObjectsObj.jsignup_Email_Pass_Submit_Button);
		
			 staticWait(1000);}
		
		@Then("^user should see back button displayed on payment screen$")
		public void Validate_Back_Button() throws Throwable{			
			System.out.println("user should see back button displayed on payment screen");
			// Waiting 1000 ms till payment screen loading
			 staticWait(1000);
			//// Verifying if back button is visible or not		
			 
			Assert.assertTrue(isElementPresent(JawwyAllObjectsObj.jsignup_Back_Button));
			takeScreeenShot(driver, "Scenario number 1 Back button");
			 staticWait(1000);
				
		}


}