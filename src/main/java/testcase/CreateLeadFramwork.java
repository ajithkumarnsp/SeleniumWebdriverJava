package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wdMethods.Annotation;

public class CreateLeadFramwork extends Annotation {


	@BeforeTest(groups = {"smoke"})
	public void setvalues() {
		testname = "TC001";
		testdesc = "Create Lead";
		iteration = "Leads";
		author = "Ajithkumar";
		category = "smoke";
		excelfilename = "CreateLead";
		//sheetname = "CreateLead";
	}

	@Test(groups = {"smoke"}, dataProvider="fetchdata")
	public void  create(String cname, String fname, String lname, String pnumber, String emailid) {

		WebElement leads = locateElement("linktext","Leads");
		click(leads);
		WebElement createlead = locateElement("linktext","Create Lead");
		click(createlead);
		WebElement companyname = locateElement("id","createLeadForm_companyName");
		type(companyname,cname);
		WebElement firstname = locateElement("id","createLeadForm_firstName");
		type(firstname,fname);
		WebElement lastname = locateElement("id","createLeadForm_lastName");
		type(lastname,lname);
		/*WebElement firstnamelocalname = locateElement("id","createLeadForm_firstNameLocal");
		type(firstnamelocalname,flname);
		WebElement lastnamelocalname = locateElement("id","createLeadForm_lastNameLocal");
		type(lastnamelocalname,llname);
		WebElement saluatation = locateElement("id","createLeadForm_personalTitle");
		type(saluatation,salutation);
		WebElement source = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingValue(source,surce);*/
		/*WebElement title = locateElement("id","createLeadForm_generalProfTitle");
		type(title,"Manager");
		WebElement annualrevenue = locateElement("id","createLeadForm_annualRevenue");
		type(annualrevenue,"1Lakh");
		WebElement industry = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingValue(industry,"IND_AEROSPACE");
		WebElement ownership = locateElement("id","createLeadForm_ownershipEnumId");
		selectDropDownUsingText(ownership,"Corporation");
		WebElement siccode = locateElement("id","createLeadForm_sicCode");
		type(siccode,"123ABC");
		WebElement description = locateElement("id","createLeadForm_description");
		type(description,"Description");
		WebElement impnote = locateElement("id","createLeadForm_importantNote");
		type(impnote,"Note");
		WebElement conuntrycode = locateElement("id","createLeadForm_primaryPhoneCountryCode");
		type(conuntrycode,"91");
		WebElement areacode = locateElement("id","createLeadForm_primaryPhoneAreaCode");
		type(areacode,"0");
		WebElement phoneextension = locateElement("id","createLeadForm_primaryPhoneExtension");
		type(phoneextension,"044");
		WebElement dept = locateElement("id","createLeadForm_departmentName");
		type(dept,"IT");
		WebElement prefcountry = locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(prefcountry,"INR - Indian Rupee");
		WebElement numemp = locateElement("id","createLeadForm_numberEmployees");
		type(numemp,"100");
		WebElement tktsym = locateElement("id","createLeadForm_tickerSymbol");
		type(tktsym,"INTTN");
		WebElement personask = locateElement("id","createLeadForm_primaryPhoneAskForName");
		type(personask,"Nishanth");
		WebElement weburl = locateElement("id","createLeadForm_primaryWebUrl");
		type(weburl,"http://gisbiz.com");
		WebElement name = locateElement("id","createLeadForm_generalToName");
		type(name,"Nishanth");
		WebElement address1 = locateElement("id","createLeadForm_generalAddress1");
		type(address1,"Street no 1");
		WebElement address2 = locateElement("id","createLeadForm_generalAddress2");
		type(address2,"chennai");
		WebElement city = locateElement("id","createLeadForm_generalCity");
		type(city,"chennai");
		WebElement country = locateElement("id","createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(country,"India");
		WebElement state = locateElement("id","createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state,"TAMILNADU");
		WebElement zipcode = locateElement("id","createLeadForm_generalPostalCode");
		type(zipcode,"600044");
		WebElement zipext = locateElement("id","createLeadForm_generalPostalCodeExt");
		type(zipext,"123");
		WebElement markcamp = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingText(markcamp,"eCommerce Site Internal Campaign");*/
		WebElement phone = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(phone,""+pnumber);
		WebElement email = locateElement("id","createLeadForm_primaryEmail");
		type(email,emailid);
		WebElement createleadbutton = locateElement("class","smallSubmit");
		click(createleadbutton);
		WebElement verifyfirstname = locateElement("id","viewLead_firstName_sp");
		verifyPartialText(verifyfirstname,fname);



	}

	/*@DataProvider(name = "iteration")
	public Object[][] getdata() throws IOException {

		ExcelRead excel = new ExcelRead();
		return excel.readexcel(filename, sheetname);

		Object[][] dataset = new Object[2][9];

		dataset[0][0] = "GISbiz Technology Pvt ltd";
		dataset[0][1] = "Ajithkumar";
		dataset[0][2] = "Nattamai Subramanian Purushothaman";
		dataset[0][3] = "Ajith";
		dataset[0][4] = "Kumar";
		dataset[0][5] = "Mr.Ajithkumar";	
		dataset[0][6] = "LEAD_EMPLOYEE";	
		dataset[0][7] = "9797979797";	
		dataset[0][8] = "ajithkumarnsp@gmail.com";	

		dataset[1][0] = "Valagenesis Technology Pvt ltd";
		dataset[1][1] = "Ajithkumar";
		dataset[1][2] = "Nattamai Subramanian Purushothaman";
		dataset[1][3] = "Ajith";
		dataset[1][4] = "Kumar";
		dataset[1][5] = "Mr.Ajithkumar";	
		dataset[1][6] = "LEAD_CONFERENCE";	
		dataset[1][7] = "9600869621";	
		dataset[1][8] = "ajithkumarnsp@gmail.com";	


		return dataset;
	}*/


}

