package dailyquestions06_07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Ajithkumar");
		driver.findElementByXPath("//button[text()[contains(.,'Find Leads')]]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//a[text()='Ajithkumar']").click();
		String title = "View Lead | opentaps CRM";
		System.out.println(title);
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title.equals(title2))
		{
			System.out.println("Pass! The Title is Matched");
		}
		else
		{

			System.out.println("Fail! The Title is not Matched");
		}
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(4000);
		driver.findElementById("updateLeadForm_companyName").clear();
		String updatecompanyname = "GISbiz";
		driver.findElementById("updateLeadForm_companyName").sendKeys(updatecompanyname);
		driver.findElementByXPath("//input[@value='Update']").click();
		String companyverify = driver.findElementByXPath("//span[contains(text(),'GISbiz')]").getText();
		System.out.println(companyverify);
		if(companyverify.contains(updatecompanyname))
		{
			System.out.println("Pass! Company Name Matched");
		}
		else
		{
			System.out.println("Fail! Company Name not Matched");
		}
		
		driver.close();
	}

}
