package TvJawwyPages;

import org.openqa.selenium.WebDriver;
;

public class SubscribePage {
	//Actions:
	  //to get displayed URL in the current page
	 
			public String validateSubscribeURL(WebDriver driver){
				return driver.getCurrentUrl();
			}
		
}
