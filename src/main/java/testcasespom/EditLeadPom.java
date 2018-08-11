package testcasespom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.MyHomePage;
import wdMethods.Annotation;

public class EditLeadPom extends Annotation {
	
	@BeforeTest/*(groups = {"sanity"})*/
	public void setvalues() {
		testname = "TC002";
		testdesc = "Edit a Lead";
		iteration = "Leads";
		excelfilename = "EditLead";
		author = "Ajithkumar";
		category = "sanity";
	}
		
	@Test(/*groups = {"sanity"}, dependsOnGroups= {"smoke"} ,*/ dataProvider="fetchdata")
	public void edit(String fname, String editcname) throws InterruptedException {
		
		FindLeadsPage leadid = new FindLeadsPage();	
		
		new MyHomePage()
		.clickleads()
		.clickfindleads()
		.enterfname(fname)
		.clickfindleads();
		Thread.sleep(3000);
		String captureid = leadid.captureleadid();
		new FindLeadsPage()
		.clickleadidedit(captureid)
		.verifytitleviewlead()
		.clickedit()
		.editcompname(editcname)
		.clickupdateeditpage()
		.verifycname();
	}

}
