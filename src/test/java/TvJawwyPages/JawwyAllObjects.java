package TvJawwyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//This class will include all objects from all pages which will be used in our project

public class JawwyAllObjects {
	
	//<<<<<<<<<<<<<<HomePage Objects>>>>>>>>>>>>>>>>>>
			//Change language label
		
			@FindBy(xpath="//button[contains(@class),'header__btn-lang-2')]")
			public WebElement ChangeLang;
		
			@FindBy(xpath="//a[@class='subs-btn']")
			public WebElement SubscribeButton;
			
			//Xpath format 
			//tag name[@ATTRIBUTE='attribute value'] 
	
		//<<<<<<<<<<<<<<subscribe Objects>>>>>>>>>>>>>>>>>>
			
			///Register button in case of Arabic
			@FindBy(xpath="//a[@href='/register']")
			public WebElement RegisterButtonAr;
			
			//<<<<<<<<<<<<<<subscribe Objects>>>>>>>>>>>>>>>>>>
			//register button in case of English
			@FindBy(xpath="//a[@href='/en/register']")
			public WebElement RegisterButtonEn;
			
			
		//<<<<<<<<<<<<<<register Objects>>>>>>>>>>>>>>>>>>
			@FindBy(xpath="//input[@name='jawwy_user_email']")
			public WebElement jawwy_user_email_TextBox;
			
			
			
			@FindBy(xpath="//button[@id='sub_form']")
			public WebElement signup_fromEmail_Button;
			
			
			
		//<<<<<<<<<<<<<<Enter Username and password Objects>>>>>>>>>>>>>>>>>>
			@FindBy(xpath="//input[@name='jawwy_user_pass']")
			public WebElement jawwy_user_Password_TextBox;
		
			
			@FindBy(xpath="//button[@class='signup-form__submit']")
			public WebElement jsignup_Email_Pass_Submit_Button;
		
		//<<<<<<<<<<<<<<Payment screen  Objects>>>>>>>>>>>>>>
		
			@FindBy(xpath="//button[@class='signup-form__back']")
			public WebElement jsignup_Back_Button;
		
		
			@FindBy(xpath="//select[@name='country']")
			public WebElement country_Dropdownlist;
		

			//get all payment list displayed 
			@FindBy(xpath="//input[@type='radio']")
			public WebElement Payment_list;
			
			
			
			//get Viva Bahrin payment  payment list displayed 
			@FindBy(xpath="//input[@id='operator-f-VB']")
			public WebElement Payment_VivaBahrin_list;
			
			
			//get Normal creditcard payment  payment list displayed
			@FindBy(xpath="//input[@id='operator-f-CC_BRN']")
			public WebElement Payment_CreditCard_list;
			

			//<<<<<<<<<<<<<<Subscribe screen  Objects>>>>>>>>>>>>>>
			///<<<<<<<Create your account page
			//NewSIgn In in case of english hyberlink 
			@FindBy(xpath="//a[@href='https://subscribe.jawwy.tv/en/user-status/']")
			public WebElement NewAcct_SignIn_EN;
			
			//NewSIgn In in case of Arabic hyberlink 
			@FindBy(xpath="//a[@href='https://subscribe.jawwy.tv/user-status/']")
			public WebElement NewAcct_SignIn_AR;
			
			
			
			
			///<<<<<<<Existing account page>>>>>>>>>>>>>>>>>>>
			//Subscribe_link In in case of english hyberlink 
			@FindBy(xpath="//a[@href='https://subscribe.jawwy.tv/en/']")
			public WebElement Subscribe_linkEN;
			
			//Subscribe_link In in case of Arabic hyberlink 
			@FindBy(xpath="//a[@href='https://subscribe.jawwy.tv/']")
			public WebElement Subscribe_linkAR;
			
			///////////Terms and conditions page\\\\\\\\\\\\\\\\\\
			//Terms and conds URL link as href identifier was not a URL hence below xpath used
			//*[@id="subscription-container"]/div/div/section/div[2]/p/a
			@FindBy(xpath="//*[@id=\"subscription-container\"]/div/div/section/div[2]/p/a")
			public WebElement TermsConditions_Url;
				
			// Terms and conds pop up window
			@FindBy(xpath="//section[@class='login-content']")
			public WebElement TandC_popUp;
			
			// Terms and conds pop up window title  الشروط والأحكام Terms and Conditions
			@FindBy(xpath="//h3[@class='signup-form-terms__title']")
			public WebElement TandC_popUp_Title;
			
			
 
}
