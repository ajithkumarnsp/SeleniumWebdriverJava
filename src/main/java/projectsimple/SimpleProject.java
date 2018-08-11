package projectsimple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("createLeadForm_firstName").sendKeys("Ajithkumar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Nattamai Subramanian Purushothaman");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ajith");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kumar");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("TeamLoad");
		WebElement id2 = driver.findElementById("userRegistrationForm:dobDay");
		Select dropdown2 = new Select(id2);
		dropdown2.selectByValue("13");
		WebElement id3 = driver.findElementById("userRegistrationForm:dobMonth");
		Select dropdown3 = new Select(id3);
		dropdown3.selectByVisibleText("JUN");
		WebElement id4 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropdown4 = new Select(id4);
		dropdown4.selectByVisibleText("1989");
		
	}

}
