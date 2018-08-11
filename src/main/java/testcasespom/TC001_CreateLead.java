package testcasespom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotation;

public class TC001_CreateLead extends Annotation {
	
	
		
		@BeforeTest
		public void setvalues() {
			testname = "TC001";
			testdesc = "Create Lead";
			iteration = "Leads";
			author = "Ajithkumar";
			category = "smoke";
			excelfilename = "CreateLead";
			
		}
		
		@Test(dataProvider="fetchdata")
		public void  create(String cname, String fname, String lname, String pnumber, String emailid) {

			new MyHomePage()
			.clickleads()
			.clickcreateleads()
			.companyname(cname)
			.firstname(fname)
			.lastname(lname)
			.phonenumber(pnumber)
			.email(emailid)
			.submit()
			.verifyfirstname(fname);
			
			
			
			
	}
	

}
