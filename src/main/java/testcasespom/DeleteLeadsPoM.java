package testcasespom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.MyHomePage;
import wdMethods.Annotation;

public class DeleteLeadsPoM extends Annotation{
	
	@BeforeTest/*(groups = {"sanity"})*/
	public void setvalues() {
		testname = "TC003";
		testdesc = "Delete a Lead";
		iteration = "Leads";
		excelfilename = "DeleteLead";
		category = "sanity";
		author = "Kannan";
		
	}
	@Test(/*groups = {"sanity"}, dependsOnGroups= {"smoke"},*/dataProvider="fetchdata")
	public void delete(String pnumber) throws InterruptedException {
		
		FindLeadsPage leadid = new 	FindLeadsPage();
		
		
		new MyHomePage()
		.clickleads()
		.clickfindleads()
		.clickphone()
		.enterphnumber(pnumber)
		.clickfindleads();
		Thread.sleep(3000);
		String captureid = leadid.captureleadid();
		new FindLeadsPage()
		.clickleadidedit(captureid)
		.clickdelete()
		.clickfindleads()
		.enterleadid(captureid)
		.clickfindleads()
		.verifydeletedrecord();
		
	}

}
