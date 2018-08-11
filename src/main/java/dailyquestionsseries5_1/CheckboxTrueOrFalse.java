package dailyquestionsseries5_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTrueOrFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		String url = "http://leafground.com/pages/checkbox.html";
		
		driver.get(url);
		Boolean checkbox = driver.findElementByXPath("(//input[@type='checkbox'])[14]").isSelected();
		System.out.println(checkbox);
		if(checkbox == false)
		{
			System.out.println("The checkbox is not selected");
		}
		Boolean checkbox1 = driver.findElementByXPath("(//input[@type='checkbox'])[14]").isSelected();
		if(checkbox1 == false)
		{
			driver.findElementByXPath("(//input[@type='checkbox'])[14]").click();
			
		}
		Boolean checkbox2 = driver.findElementByXPath("(//input[@type='checkbox'])[14]").isSelected();
		System.out.println(checkbox2);
		if(checkbox2 == true)
		{
			System.out.println("The checkbox is selected");
		}
	}

}
