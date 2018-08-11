package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkDay2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement title = driver.findElementByXPath("//div[@class='wp-page-heading']");
		String title1 = title.getText();
		System.out.println("The Text of the Page is " + title1);
		if(title.equals(title))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		boolean checkboxselect = driver.findElementByXPath("//font[text()[contains(.,'Handle Exceptions')]]/following::td[2]").isSelected();
		if(checkboxselect==false)
		{
			WebElement event = driver.findElementByXPath("//font[text()[contains(.,'Handle Exceptions')]]/following::td[2]");
			event.click();
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
		boolean checkboxdeselect = driver.findElementByXPath("(//input[@type= 'checkbox'])[3]").isSelected();
		if(checkboxdeselect==true)
		{
			WebElement event1 = driver.findElementByXPath("(//input[@type= 'checkbox'])[3]");
			event1.click();
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		Thread.sleep(5000);
		driver.close();
		
		
		/*driver.get("http://leafground.com/pages/table.html");
		List<WebElement> col = driver.findElementsByXPath("//table[@cellspacing = '0']//tr");
		System.out.println("The Total row in the create page " + col.size());
		List<WebElement> row = driver.findElementsByXPath("//table[@cellspacing = '0']//th");
		System.out.println("The Total column in the create page " + row.size());
		List<WebElement> cell = driver.findElementsByXPath("//table[@cellspacing = '0']//td");
		System.out.println("The Total cell in the create page " + cell.size());
		WebElement value = driver.findElementByXPath("//table[@cellspacing = '0']//tr[3]/td[2]");
		System.out.println("The Value from row 3 is " + value.getText());
		driver.close();
		WebElement percent = driver.findElementByXPath("//font[text()[contains(.,'Exception')]]/following::td[1]");
		System.out.println(percent.getText());*/

	}

}
