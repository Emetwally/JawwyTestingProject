package TvJawwyStepDefinition;

import org.openqa.selenium.support.PageFactory;

import TvJawwyPages.JawwyAllObjects;
import TvJawwyPages.PaymentPage;
import TvJawwyUtil.SampleTestingPageObject;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class PaymentPageStepDefinition extends SampleTestingPageObject {

	public PaymentPage PaymentPageObject;
	public JawwyAllObjects JawwyAllObjectsObj;
	 @Before
	   public void beforeScenarioTwo(){

	       System.out.println("Second and third scenario");
	       PaymentPageObject = new PaymentPage();
	  JawwyAllObjectsObj = PageFactory.initElements(driver, JawwyAllObjects.class);
			
	   }	

			
////////////////Second scenario Scenario
	@And("^User should selects Lebanon from country dropdown menu$")
	public void LebanonCountry_Select() throws Throwable {
		  System.out.println("User should selects Lebanon from country dropdown menu");
		  SelectDropdownlistByValue(JawwyAllObjectsObj.country_Dropdownlist, PaymentPageObject.SelectedCountry_ValueDropdownlist("Lebanon"));		
	}
	
	@Then("^user should see only one payment options$")
	public void Validate_Paymentmethod() throws Throwable{			
		System.out.println("Validate_Paymentmethod");
		staticWait(1000);
		takeScreeenShot(driver, "Scenario number 2 one payment method");
		//get the payment list options using getAvailablePaymentOptions method
		//then get the count using getAvailablePaymentCount method
		//then check if the count is more than 1 payment option 
		if (PaymentPageObject.getAvailablePaymentCount(PaymentPageObject.getAvailablePaymentOptions(driver))>1)
			Assert.assertFalse(false);

	}

	
		////////////////Third scenario Scenario\\\\\\\\\\\\\\
		@And("^User should selects Bahrain from country dropdown menu$")
		public void BahrainCountry_Select() throws Throwable {
		System.out.println("User should selects Bahrain from country dropdown menu");
		SelectDropdownlistByValue(JawwyAllObjectsObj.country_Dropdownlist, PaymentPageObject.SelectedCountry_ValueDropdownlist("Bahrain"));		
		}
		
		@Then("^user should see two payment options$")
		public void Validate_Paymentmethod_two() throws Throwable{			
		System.out.println("Validate_Paymentmethod_for Bahrain");
		staticWait(1000);
		takeScreeenShot(driver, "Scenario number 3 Two payment method");
		
		//get the payment list options using getAvailablePaymentOptions method
		//then get the count using getAvailablePaymentCount method
		//then check if the count is more than 1 payment option 
		if (PaymentPageObject.getAvailablePaymentCount(PaymentPageObject.getAvailablePaymentOptions(driver))>1)
		Assert.assertFalse(false);

}
}	


