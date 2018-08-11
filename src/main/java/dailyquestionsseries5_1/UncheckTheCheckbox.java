package dailyquestionsseries5_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckTheCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		String url = "http://testleaf.herokuapp.com/pages/checkbox.html";
		
		driver.get(url);
		
		Boolean checkbox6 = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		if(checkbox6 == true)
		{
			driver.findElementByXPath("(//input[@type='checkbox'])[6]").click();
			System.out.println("The Selenium Checkbox is Unchecked");
			
		}
		
		Boolean checkbox8 = driver.findElementByXPath("(//input[@type='checkbox'])[8]").isSelected();
		if(checkbox8 == true)
		{
			driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
			System.out.println("The Selenium Checkbox is Unchecked");
			Thread.sleep(5000);
			driver.close();
		}
	}

}
