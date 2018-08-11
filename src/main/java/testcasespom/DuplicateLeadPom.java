package testcasespom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.MyHomePage;
import wdMethods.Annotation;

public class DuplicateLeadPom extends Annotation {
	
	@BeforeTest
	public void setvalues() {
		testname = "TC004";
		testdesc = "Duplicate a Lead";
		iteration = "Leads";
		excelfilename = "DuplicateLead";
		author="Ajithkumar";
		category = "regression";
	}
	
	
	@Test(dataProvider = "fetchdata")/*(groups = {"regression"})*/
	public void duplicate(String emailid) throws InterruptedException {
		
		FindLeadsPage leadid = new FindLeadsPage();
		FindLeadsPage firstname = new FindLeadsPage();
		
		new MyHomePage()
		.clickleads()
		.clickfindleads()
		.clickemail()
		.enteremailid(emailid)
		.clickfindleads();
		Thread.sleep(3000);
		String capturename = firstname.capturefirstname();
		String captureid = leadid.captureleadid();
		new FindLeadsPage()
		.clickleadidedit(captureid)
		.clickduplicate()
		.verifyduplicateleadtitle()
		.clickcreatelead()
		.verifyfirstname(capturename);
		
		
		
	}
	

}
