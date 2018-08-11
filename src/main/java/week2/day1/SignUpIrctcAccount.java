package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpIrctcAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("ajithkumarnsp");
		driver.findElementById("userRegistrationForm:password").sendKeys("Irctcportal1234");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Irctcportal1234");
		WebElement id = driver.findElementById("userRegistrationForm:securityQ");
		Select dropdown = new Select(id);
		dropdown.selectByIndex(1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Thala");
		WebElement id1 = driver.findElementById("userRegistrationForm:prelan");
		Select dropdown1 = new Select(id1);
		dropdown1.selectByIndex(0);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Ajithkumar");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("nsp");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement id2 = driver.findElementById("userRegistrationForm:dobDay");
		Select dropdown2 = new Select(id2);
		dropdown2.selectByValue("13");
		WebElement id3 = driver.findElementById("userRegistrationForm:dobMonth");
		Select dropdown3 = new Select(id3);
		dropdown3.selectByVisibleText("JUN");
		WebElement id4 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropdown4 = new Select(id4);
		dropdown4.selectByVisibleText("1989");
		WebElement id5 = driver.findElementById("userRegistrationForm:occupation");
		Select dropdown5 = new Select(id5);
		dropdown5.selectByValue("3");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("1234567890");
		driver.findElementById("userRegistrationForm:idno").sendKeys("BSKPA0001");
		WebElement id6 = driver.findElementById("userRegistrationForm:countries");
		Select dropdown6 = new Select(id6);
		dropdown6.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("ajithkumarnsp@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9600869621");
		WebElement id7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdown7 = new Select(id7);
		dropdown7.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address")
		.sendKeys("9A,Rajakilpakkam,Chennai-600073");
		driver.findElementById("userRegistrationForm:street").sendKeys("Venkatachalapathy Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Rajakilpakkam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600073", Keys.TAB);
		Thread.sleep(5000);
		//driver.findElementById("userRegistrationForm:statesName").click();
		WebElement id8 = driver.findElementById("userRegistrationForm:cityName");
		Select dropdown8 = new Select(id8);
		dropdown8.selectByIndex(1);
		Thread.sleep(5000);
		WebElement id9 = driver.findElementById("userRegistrationForm:postofficeName");
		Select dropdown9 = new Select(id9);
		dropdown9.selectByVisibleText("Rajakilpakkam B.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("04520195757");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
