package dailyquestions06_07;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllCountriesFromDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		String dropdown = driver.findElementById("userRegistrationForm:countries").getText();
		System.out.println(dropdown);
			driver.close();
	
		
	}

}
