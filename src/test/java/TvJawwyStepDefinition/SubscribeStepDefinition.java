package TvJawwyStepDefinition;

import org.openqa.selenium.support.PageFactory;


import TvJawwyPages.JawwyAllObjects;
import TvJawwyPages.SubscribePage;
import TvJawwyUtil.SampleTestingPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class SubscribeStepDefinition extends SampleTestingPageObject{
	public SubscribePage SubscribePageObject;
	public JawwyAllObjects JawwyAllObjectsObj;
	 @Before
	   public void beforeScenarioTwo(){
	       System.out.println("Fourth scenario");
	       SubscribePageObject = new SubscribePage();
	       JawwyAllObjectsObj = PageFactory.initElements(driver, JawwyAllObjects.class);		
	   }	
	 
		////////////////Fourth scenario Scenario\\\\\\\\\\\\\\
		////////////////4th step (the first three step was already implemented)\\\\\\\\\\\\\\
		@And("^user navigates back to subscribe now page$")
		public void NavigateBack_SubscribePage() throws Throwable {
		System.out.println("user navigates back to subscribe now page");
		clickOnElement(JawwyAllObjectsObj.jsignup_Back_Button);
		staticWait(1000);
		pressBack();
		if (prop.getProperty("Selected_Language").equals("Arabic"))
			clickOnElement(JawwyAllObjectsObj.RegisterButtonAr);
		else 
			clickOnElement(JawwyAllObjectsObj.RegisterButtonEn);
		}
		
		////////////////5th step (the first three step was already implemented)\\\\\\\\\\\\\\
		@And("^user clicks on Click here link in create your account section$")
		public void Click_CreateYourAccountPage() throws Throwable {
		staticWait(1000);
		System.out.println("user clicks on Click here link in create your account section");
		//As the sign in hyberlink is different based on the selected language
		//so below condition done to click on the corresponding url
		if (prop.getProperty("Selected_Language").equals("Arabic"))
			clickOnElement(JawwyAllObjectsObj.NewAcct_SignIn_AR);
		else 
			clickOnElement(JawwyAllObjectsObj.NewAcct_SignIn_EN);
		}
		
		
		////////////////6th step (the first three step was already implemented)\\\\\\\\\\\\\\
		@And("^user clicks on Subscribe link in Existing User section$")
		public void Click_SubscribeLink() throws Throwable {
		System.out.println("user clicks on Subscribe link in Existing User section");
		if (prop.getProperty("Selected_Language").equals("Arabic"))
			clickOnElement(JawwyAllObjectsObj.Subscribe_linkAR);
		else 
			clickOnElement(JawwyAllObjectsObj.Subscribe_linkEN);
		}
		
		////////////////7th step (the first three step was already implemented)\\\\\\\\\\\\\\
		@Then("^user should redirect to subscribe screen$")
		public void FinalStep_SubscribeScreen() throws Throwable {
		System.out.println("user should redirect to subscribe screen");
		takeScreeenShot(driver, "Scenario number 4 Subscribe");
		
		String actualText = SubscribePageObject.validateSubscribeURL(driver).toString();
	    Assert.assertTrue(actualText.toLowerCase().contains("https://subscribe.jawwy.tv".toLowerCase()));
	    
		}

		
}
