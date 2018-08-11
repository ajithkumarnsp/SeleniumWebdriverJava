package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotation;

public class EditLeadFramework extends Annotation {
	@BeforeTest(groups = {"sanity"})
	public void setvalues() {
		testname = "TC002";
		testdesc = "Edit a Lead";
		iteration = "Leads";
		excelfilename = "EditLead";
		author = "Ajithkumar";
		category = "sanity";
	}
	@Test(groups = {"sanity"}, dependsOnGroups= {"smoke"},dataProvider="fetchdata") /*(dependsOnMethods= {"testcase.CreateLeadFramwork.create"})*/
	public void edit(String fname, String editcname) throws InterruptedException {
		
		
		
		WebElement leads = locateElement("linktext", "Leads");
		click(leads);
		WebElement findleads = locateElement("linktext", "Find Leads");
		click(findleads);
		WebElement firstname = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firstname, fname);
		WebElement findleadsbutton = locateElement("xpath", "//button[text()[contains(.,'Find Leads')]]");
		click(findleadsbutton);
		//WebElement firstlead = locateElement("xpath","//a[text()='Ajithkumar']");
		//String leadid = firstlead.getText();
		WebElement firstleadID = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]");
		String leadid = firstleadID.getText();
		WebElement clickleadid = locateElement("linktext",leadid);
		Thread.sleep(5000);
		click(clickleadid);
		WebElement title = locateElement("id","sectionHeaderTitle_leads");
		String titleheader = getTitl();
		System.out.println(titleheader);
		verifyTitle(titleheader);
		WebElement edit = locateElement("xpath","//a[text()='Edit']");
		click(edit);
		WebElement cleartext = locateElement("id","updateLeadForm_companyName");
		clear(cleartext);
		WebElement changecompany = locateElement("id","updateLeadForm_companyName");
		type(changecompany,editcname);
		WebElement update = locateElement("xpath","//input[@value='Update']");
		click(update);
		WebElement verifycompanyname = locateElement("xpath","//span[@id='viewLead_companyName_sp']");
		String updatedcompanyname = getText(verifycompanyname);
		System.out.println(updatedcompanyname);
		verifyExactText(verifycompanyname,updatedcompanyname);
		/*closeBrowser();*/
		
		//return leadid;
	}
	
	/*@DataProvider(name = "iteration")
	public String[][] getdata() {

		String[][] dataset = new String[2][3];

		dataset[0][0] = "Ajithkumar";
		dataset[0][1] = "GISbiz";
		dataset[0][2] = "View Lead | opentaps CRM";
			
		dataset[1][0] = "Ajithkumar";
		dataset[1][1] = "Valagenesis";
		dataset[1][2] = "View Lead | opentaps CRM";
		



		return dataset;
	}
*/
	
}
