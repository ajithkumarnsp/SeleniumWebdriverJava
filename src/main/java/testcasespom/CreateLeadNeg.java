package testcasespom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotation;

public class CreateLeadNeg extends Annotation {
	
	
		
		@BeforeTest
		public void setvalues() {
			testname = "TC002";
			testdesc = "Create Lead Neg";
			iteration = "Leads";
			author = "Ajithkumar";
			category = "smoke";
			excelfilename = "CreateLeadNeg";
			
		}
		
		@Test(dataProvider="fetchdata")
		public void  create(String cname, String fname, String lname, String pnumber, String emailid, String exeText ) {

			new MyHomePage()
			.clickleads()
			.clickcreateleads()
			.companyname(cname)
			.firstname(fname)
			.lastname(lname)
			.phonenumber(pnumber)
			.email(emailid)
			.submitfail()
			.verifyerrormessage(exeText);
	}
	

}
