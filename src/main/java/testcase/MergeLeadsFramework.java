package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotation;


public class MergeLeadsFramework extends Annotation {
	@BeforeTest
	public void setvalues() {
		testname = "TC005";
		testdesc = "Merge many Leads into One";
		iteration = "Leads";
		excelfilename = "MergeLead";
		author = "Ajithkumar";
		category = "";
	}
	@Test(/*groups = {"regression"},*/ dataProvider = "fetchdata")/*(timeOut = 20000)*/
	public void mergelead(String leadidfrom, String leadidto) throws InterruptedException {

		WebElement leads = locateElement("linktext", "Create Lead");
		click(leads);
		WebElement mergelead = locateElement("linktext", "Merge Leads");
		click(mergelead);
		WebElement icon1 = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		click(icon1);
		switchToWindow(1);
		//EditLeadFramework object = new EditLeadFramework();
		//String leadID = object.edit();
		WebElement leadsIDinput = locateElement("xpath","//input[@name='id']");
		type(leadsIDinput,""+leadidfrom);
		
		WebElement clickfindleads = locateElement("xpath","//button[text()='Find Leads']");
		click(clickfindleads);
		WebElement lleadID = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]");
		String textid = lleadID.getText();
		WebElement clickleadid = locateElement("linktext",textid);
		Thread.sleep(1000);
		clickleadid.click();
		switchToWindow(0);
		WebElement icon2 = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		click(icon2);
		switchToWindow(1);
		WebElement leadsIDinput1 = locateElement("xpath","//input[@name='id']");
		type(leadsIDinput1,""+leadidto);
		WebElement tolead = locateElement("xpath","//button[text()='Find Leads']");
		click(tolead);
		WebElement lleadID1 = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]");
		String textid1 = lleadID1.getText();
		WebElement clickleadid1 = locateElement("linktext",textid1);
		//Thread.sleep(4000);
		clickleadid1.click();
		switchToWindow(0);
		WebElement merge = locateElement("xpath", "//a[text()='Merge']");
		merge.click();
		//Thread.sleep(5000);
		acceptAlert();
		WebElement findleads = locateElement("linktext", "Find Leads");
		click(findleads);
		WebElement enterleadid = locateElement("xpath","//input[@name='id']");
		type(enterleadid,textid);
		WebElement clickfindleads1 = locateElement("xpath","//button[text()='Find Leads']");
		click(clickfindleads1);
		WebElement verify = locateElement("xpath","//div[@class='x-paging-info']");
		String message = getText(verify);
		verifyExactText(verify,message);

	}
	
	/*@DataProvider(name = "iteration")
	public String[][] getdata() {

		String[][] dataset = new String[2][4];

		dataset[0][0] = "10025";
		dataset[0][1] = "10025";
		dataset[0][2] = "10025";
		dataset[0][3] = "No records to display";
			
		dataset[1][0] = "10025";
		dataset[1][1] = "10025";
		dataset[1][2] = "10025";
		dataset[1][3] = "No records to display";
		



		return dataset;
	}*/

}
