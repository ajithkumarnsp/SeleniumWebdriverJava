package dailyquestions06_07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("ajithkumarnsp@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		String leadsname = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]").getText();
		System.out.println(leadsname);
		Thread.sleep(5000);
		driver.findElementByLinkText(leadsname).click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String duplicatelead = "Duplicate Lead | opentaps CRM";
		System.out.println(duplicatelead);
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(duplicatelead.equals(title2))
		{
			System.out.println("Pass! The Duplicate Lead is Verified");
		}
		else
		{
			System.out.println("Fail! The Duplicate Lead is not Veriied");
		}
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		String compareduplicates = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(compareduplicates);
		if(leadsname.equals(compareduplicates))
		{
			System.out.println("Pass! - The Duplicated Lead Name is same as the Captured Lead Name");
		}
		else
		{
			System.out.println("Fail! - The Duplicated Lead Name is not same as the Captured Lead Name");
		}
		driver.close();
	}

}
