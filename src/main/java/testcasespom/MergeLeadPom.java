package testcasespom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.MyHomePage;
import wdMethods.Annotation;

public class MergeLeadPom extends Annotation {
	
	@BeforeTest
	public void setvalues() {
		testname = "TC005";
		testdesc = "Merge many Leads into One";
		iteration = "Leads";
		excelfilename = "MergeLead";
		author = "Ajithkumar";
		category = "regression";
	}
	@Test(/*groups = {"regression"},*/ dataProvider = "fetchdata")/*(timeOut = 20000)*/
	public void mergelead(String leadidfrom, String leadidto) throws InterruptedException {
		
		FindLeadsPage captureid = new FindLeadsPage();
		

		new MyHomePage()
		.clickleads()
		.clickmergeleads()
		.clickfromleadicon()
		.enterleadid(leadidfrom)
		.clickfindleads();
		Thread.sleep(3000);
		String captureleadid = captureid.captureleadid();
		new FindLeadsPage()
		.clickleadidmerge(captureleadid)
		.clicktoleadicon()
		.enterleadid(leadidto)
		.clickfindleads();
		Thread.sleep(3000);
		String captureleadid1 = captureid.captureleadid();
		new FindLeadsPage()
		.clickleadidmerge(captureleadid1)
		.clickmergelead()
		.alertaccept()
		.clickfindleads()
		.enterleadid(captureleadid)
		.clickfindleads()
		.verifydeletedrecord();

}

}