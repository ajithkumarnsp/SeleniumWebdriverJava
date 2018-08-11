package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeliniumTestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "E://TestLeaf//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		/*List<WebElement> totaldropdowns = driver.findElementsByTagName("select");
		int size = totaldropdowns.size();
		System.out.println("The Total dropdowns in the create page " + size);
		for (WebElement one : totaldropdowns)
		{
			if(one.equals("//select[@id='createLeadForm_dataSourceId']"))
			{
			WebElement dropdown = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
				Select options = new Select(dropdown);
				List<WebElement> list = options.getOptions();
				for(WebElement value : list )
				{
					if(value.getText().equals("Existing Customer"))
					{
						options.selectByVisibleText("Existing Customer");
						System.out.println("Test case Passed");
					}
				}
			}
			
		}
		
		*/
		
		
		
		
		
		driver.findElementById("createLeadForm_companyName").sendKeys("GISbiz");
		driver.findElementById("createLeadForm_firstName").sendKeys("GIS");
		driver.findElementById("createLeadForm_lastName").sendKeys("biz");
		
		WebElement varname = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(varname);
		 List<WebElement> options = dropdown.getOptions();
		 //dropdown.selectByIndex(5);
		 //int size = options.size();
		 //System.out.println(size);
		 //dropdown.selectByIndex(size-1);
		for(WebElement onevalue : options) 
		{
			//System.out.println(onevalue.getText());
			if(onevalue.getText().equals("Press"))
			{
			dropdown.selectByVisibleText(onevalue.getText());
			System.out.println("Test case Pass");
			}
			
			//String strname = onevalue.getText();
			//System.out.println(strname);
			
		//}

	
			
				
		//driver.findElementByName("submitButton").click();
		//driver.close();
	}

	}
}
