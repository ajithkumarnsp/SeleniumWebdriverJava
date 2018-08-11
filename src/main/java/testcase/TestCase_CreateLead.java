package testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestCase_CreateLead  {
	@Test
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//@BeforeSuite
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/report.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		//BeforeTest 
		String testcasename = "TC001";
		String testcasedesc = "Create a new lead in the project";
		
		//BeforeClass
		ExtentTest onetestcase = extent.createTest(testcasename,testcasedesc);
		
		//BeforeMethod
		ExtentTest passmultipledata = onetestcase.createNode("Leads");
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		passmultipledata.pass("The Browser is launched Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("GISBIZ Technologies Pvt limited");
		String firstname = "Ajithkumar";
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		driver.findElementById("createLeadForm_lastName").sendKeys("Nattamai Subramanian Purushothaman");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ajith");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kumar");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Salutation");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select option = new Select(source);
		option.selectByIndex(5);
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("LeadRole");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("3.5 Crore");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryoption = new Select(industry);
		industryoption.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipoption = new Select(ownership);
		ownershipoption.selectByVisibleText("Public Corporation");
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("ABC123");
		driver.findElementById("createLeadForm_description").sendKeys("A company overview "
				+ "(also known as company information or a company summary) "
				+ "is an essential part of a business plan. ... "
				+ "It usually appears after the executive summary in your business plan");
		
		driver.findElementById("createLeadForm_importantNote").sendKeys("It usually appears after the executive summary in your business plan");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("0452");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("213");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Information Technology");
		
		WebElement preferredcurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select preferredcurrencyoption = new Select(preferredcurrency);
		List<WebElement> choosecurrency = preferredcurrencyoption.getOptions();
		for(WebElement value : choosecurrency)
		{
			if(value.getText().equals("INR - Indian Rupee"))
			{
				preferredcurrencyoption.selectByVisibleText(value.getText());
			}
		}
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("250");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("R");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Administrator");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://gisbiz.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("The Manager");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Plot No.25, Ganesh Avenue, "
				+ "Near Shell Petrol Bunk, ");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Narayanapuram, Rose Avenue, Pallikaranai,"
				+ " Chennai, Tamil Nadu ");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryoption = new Select(country);
		List<WebElement> allcountry = countryoption.getOptions();
		for(WebElement value2 : allcountry)
		{
			if(value2.getText().contains("India"))
			{
				countryoption.selectByVisibleText(value2.getText());
			}
		}
		WebElement stateprovince = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select stateprovinceoption = new Select(stateprovince);
		List<WebElement> alloptions = stateprovinceoption.getOptions();
		for(WebElement value1 : alloptions)
		{
			if(value1.getText().contains("TAMILNADU"))
			{
				stateprovinceoption.selectByVisibleText(value1.getText());
			}
		}
		
		
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600100");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("100");
		
		WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingcampaignoption =  new Select(marketingcampaign);
		marketingcampaignoption.selectByVisibleText("Automobile");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9797123456");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("ajithkumarnsp@gmail.com");
		driver.findElementByName("submitButton").click();
		String verifyresult = driver.findElementByXPath("//span[text()='Ajithkumar']").getText();
		//System.out.println(verifyresult);
		if(firstname.equals(verifyresult))
		{
			System.out.println("Lead Created and First name verification Test case pass");
		}
		else
		{
			System.out.println("Test case Failed - First name is not matching");
		}
		
		extent.flush();
		driver.close();
	}

}
