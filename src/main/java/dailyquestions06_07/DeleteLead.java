package dailyquestions06_07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {

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
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneCountryCode").sendKeys("91", Keys.TAB, "0", Keys.TAB, "9797123456");
		driver.findElementByXPath("//em[@unselectable='on']/following::button[6]").click();
		Thread.sleep(4000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']").getText();
		System.out.println("The Lead ID is " + leadID);
		Thread.sleep(4000);
		driver.findElementByLinkText(leadID).click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String errormessage = driver.findElementByXPath("(//div[@class='x-paging-info'])").getText();
		System.out.println(errormessage);
		String compareerrormessage = "No records to display";
		if(errormessage.equals(compareerrormessage))
		{
			System.out.println("Pass! The LeadId is Deleted");
		}
		else
		{
			System.out.println("Fail! The LeadId is not Deleted");
		}
		driver.close();
	}

}
