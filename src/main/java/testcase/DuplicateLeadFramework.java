package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotation;

public class DuplicateLeadFramework extends Annotation {
	@BeforeTest
	public void setvalues() {
		testname = "TC004";
		testdesc = "Duplicate a Lead";
		iteration = "Leads";
		excelfilename = "DuplicateLead";
		author="Ajithkumar";
		category = "sanity";
	}
	@Test(dataProvider = "fetchdata")/*(groups = {"regression"})*/
	public void duplicate(String emailid) throws InterruptedException {
		
		WebElement leads = locateElement("linktext", "Leads");
		click(leads);
		WebElement findlead = locateElement("linktext","Find Leads");
		click(findlead);
		WebElement emailclick = locateElement("xpath","//span[text()='Email']");
		click(emailclick);
		WebElement email = locateElement("name","emailAddress");
		type(email, emailid);
		WebElement clickfindlead = locateElement("xpath","//em[@unselectable='on']/following::button[6]");
		click(clickfindlead);
		WebElement name = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]");
		String capturename = getText(name);
		/*WebElement firstleadID = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]");
		String firstleadidtext = firstleadID.getText();*/
		WebElement clickname = locateElement("linktext",capturename);
		Thread.sleep(5000);
		click(clickname);
		WebElement duplicatelead = locateElement("linktext","Duplicate Lead");
		click(duplicatelead);
		WebElement title = locateElement("id","sectionHeaderTitle_leads");
		String verify = getTitl();
		verifyTitle(verify);
		WebElement createleadclick = locateElement("xpath","//input[@value='Create Lead']");
		click(createleadclick);
		WebElement verifyname = locateElement("id","viewLead_firstName_sp");
		verifyExactText(verifyname,capturename);
	}
	/*@DataProvider(name = "iteration")
	public Object[][] getdata() {

		Object[][] dataset = new Object[2][1];

		dataset[0][0] = "ajithkumarnsp@gmail.com";
			

		dataset[1][0] = "ajithkumarnsp@gmail.com";
		



		return dataset;
	}
*/
}
