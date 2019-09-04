package TvJawwyPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

	//Actions:
	  //to get displayed Payment options 
	 
	   public List<WebElement> getAvailablePaymentOptions(WebDriver driver)
	    {
	    	 // Find the checkbox or radio button element by its name.
	        List<WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
	        		
	        		
	    	//int itemCount = list.size();

	        return list;

	    }
	   
		  //to get displayed Payment options 
		 
	   public int getAvailablePaymentCount(List<WebElement> list)
	    {	   		
	    	int itemCount = list.size();
	        return itemCount;
	    }
	   
	   
	public String SelectedCountry_ValueDropdownlist(String CountryName)
	{
		String CountryValue = null;
//i will write the list of countries along with value for each one in case later there will be a change 
		//Arabic list\\
		/*
		 * <?xml version="1.0" encoding="UTF-8"?>
<select name="country" tabindex="1">
   <option value="BRN">البحرين</option>
   <option value="KUW">الكويت</option>
   <option value="KSA">المملكة العربية السعودية</option>
   <option value="ALG">الجزائر</option>
   <option value="CHA">تشاد</option>
   <option value="DJI">جيبوتي</option>
   <option value="IRQ">العراق</option>
   <option value="JOR">الأردن</option>
   <option value="LIB">لبنان</option>
   <option value="MAR">المغرب</option>
   <option value="OMA">سلطنة عمان</option>
   <option value="PLE">فلسطين</option>
   <option value="TUN">تونس</option>
   <option value="YEM">اليمن</option>
   <option value="UAE">الإمارات العربية المتحدة</option>
</select>

//English list 
 * <?xml version="1.0" encoding="UTF-8"?>
<select name="country" tabindex="1">
   <option value="BRN">Bahrain</option>
   <option value="KUW">Kuwait</option>
   <option value="KSA">Saudi Arabia</option>
   <option value="ALG">Algeria</option>
   <option value="CHA">Chad</option>
   <option value="DJI">Djibouti</option>
   <option value="IRQ">Iraq</option>
   <option value="JOR">Jordan</option>
   <option value="LIB">Lebanon</option>
   <option value="MAR">Morocco</option>
   <option value="OMA">Oman</option>
   <option value="PLE">Palestine</option>
   <option value="TUN">Tunisia</option>
   <option value="YEM">Yemen</option>
   <option value="UAE">UAE</option>
</select>
		 * */
		if (CountryName.equals("Lebanon"))
				CountryValue="LIB";
		else if (CountryName.equals("Bahrain"))
				CountryValue="BRN";
		
				return CountryValue;
						
	}
	
		/*public Boolean validatePaymentMethods(WebDriver driver, WebElement Countryname ,WebElement Paymentlist ){
			
			try{
				
	            if(Countryname.getTagName().contentEquals("")
	            		) {
	            	 driver.findElement(By.xpath(xpathExp));
	 	            // If element is found set the timeout back and return true
	 	            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	            return true;
	                return true;
	            } else {
	                return false;
	            }
	        } 
	        catch (NoSuchElementException e){
	            return(false);
	        } 
		}*/
	
}
