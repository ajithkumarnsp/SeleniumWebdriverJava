package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotation;

public class DeleteLeadFramework extends Annotation {
	@BeforeTest/*(groups = {"sanity"})*/
	public void setvalues() {
		testname = "TC003";
		testdesc = "Delete a Lead";
		iteration = "Leads";
		excelfilename = "DeleteLead";
		category = "sanity";
		author = "Kannan";
		
	}
	@Test(/*groups = {"sanity"}, dependsOnGroups= {"smoke"},*/dataProvider="fetchdata")/*(dependsOnMethods= {"testcase.CreateLeadFramwork.create"})*/
	public void delete(String pnumber) throws InterruptedException {
		
		WebElement leads = locateElement("linktext", "Leads");
		click(leads);
		WebElement findlead = locateElement("linktext","Find Leads");
		click(findlead);
		WebElement phone = locateElement("xpath","//span[text()='Phone']");
		click(phone);
		WebElement enterphone = locateElement("name","phoneCountryCode");
		clear(enterphone);
		WebElement enterphone1 = locateElement("name","phoneNumber");
		type(enterphone1,""+pnumber);
		WebElement clickfindlead = locateElement("xpath","//em[@unselectable='on']/following::button[6]");
		click(clickfindlead);
		WebElement firstleadID = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]");
		String firstleadidtext = firstleadID.getText();
		WebElement clickid = locateElement("linktext",firstleadidtext);
		Thread.sleep(5000);
		click(clickid);
		WebElement delete = locateElement("class","subMenuButtonDangerous");
		click(delete);
		WebElement findleads = locateElement("linktext","Find Leads");
		click(findleads);
		WebElement leadid = locateElement("xpath","//input[@name='id']");
		type(leadid,firstleadidtext);
		WebElement findleadsbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(findleadsbutton);
		WebElement verify = locateElement("xpath","//div[@class='x-paging-info']");
		String verifynorecords = getText(verify);
		verifyExactText(verify,verifynorecords);
		
	}
	/*@DataProvider(name = "fetchdata")
	public Object[][] getdata() {

		Object[][] dataset = new Object[2][2];

		dataset[0][0] = "9797979797";
		dataset[0][1] = "9797979797";

		dataset[1][0] = "No records to display";
		dataset[1][1] = "No records to display";



		return dataset;
	}
*/
	
}
