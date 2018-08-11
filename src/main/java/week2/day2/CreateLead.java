package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) {
login();
	}
	
	public static void login()
	{
		
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.irctc.co.in/eticketing/userSignUp.jsf";
		//String username = "DemoSalesManager";
		
		driver.get(url);
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select countries = new Select(country);
		List<WebElement> options = countries.getOptions();
		
		for(WebElement e : options)
		{
			if(e.getText().contains("Egypt"))
			{
				countries.selectByVisibleText(e.getText());
			}
			
		}
		}
		
	}


