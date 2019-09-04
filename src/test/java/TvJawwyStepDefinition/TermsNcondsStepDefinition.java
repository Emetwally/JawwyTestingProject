package TvJawwyStepDefinition;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;


import TvJawwyPages.JawwyAllObjects;
import TvJawwyUtil.SampleTestingPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TermsNcondsStepDefinition extends SampleTestingPageObject  {
	public JawwyAllObjects JawwyAllObjectsObj; 
	//setup and teardown code logic to handle the test execution
	//This will run before the Scenario
	   @Before
	   public void beforeScenario(){

	       System.out.println("Fifth Scenario Terms and conditions");
		 JawwyAllObjectsObj = PageFactory.initElements(driver, JawwyAllObjects.class);
			
	   }	
	   
////////////////Fifth scenario Scenario\\\\\\\\\\\\\\\\\\\\\\
	   
	   @And("^user clicks on Terms and Conditions link in create your account section$")
		public void Click_TermsNCondURL() throws Throwable {
		System.out.println("user clicks on Terms and Conditions link in create your account section");
		clickOnElement(JawwyAllObjectsObj.TermsConditions_Url);
	   }
	   
	   @Then("^user should see that Terms and Conditions section is displayed$")
		public void Verify_TermsNConditionsPage() throws Throwable {
		System.out.println("user should see that Terms and Conditions section is displayed");
		takeScreeenShot(driver, "Scenario number 5 Terms and conditions");
		
		//validate that T and C page show
		Assert.assertTrue(isElementPresent(JawwyAllObjectsObj.TandC_popUp));
		//Another validation added for T and C page title 
		
		 if (prop.getProperty("Selected_Language").equals("Arabic"))
			 Assert.assertTrue(JawwyAllObjectsObj.TandC_popUp_Title.getText().toLowerCase().contains("الشروط والأحكام".toLowerCase()));
			else 
				 Assert.assertTrue(JawwyAllObjectsObj.TandC_popUp_Title.getText().toLowerCase().contains("Terms and Conditions".toLowerCase()));
	    	
	   }
}
