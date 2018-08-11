package projectsimple;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;



public class CreateContactFramework extends SeMethods {

	@Test
	public void createcontact() throws InterruptedException
	{
		
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);
		WebElement createcontact = locateElement("linktext","Create Contact");
		click(createcontact);
		WebElement Firstname = locateElement("id","firstNameField");
		type(Firstname,"Ajithkumar");
		WebElement lastname = locateElement("id","lastNameField");
		type(lastname,"Nattamai");
		WebElement firstnamelocalname = locateElement("id","createContactForm_firstNameLocal");
		type(firstnamelocalname,"Ajith");
		WebElement lastnamelocalname = locateElement("id","createContactForm_lastNameLocal");
		type(lastnamelocalname,"Thala");
		WebElement saluatation = locateElement("id","createContactForm_personalTitle");
		type(saluatation,"Mr.Employee");
		
		WebElement title = locateElement("id","createContactForm_generalProfTitle");
		type(title,"Title");
		WebElement department = locateElement("id","createContactForm_departmentName");
		type(department,"IT");
		
		
		
		
		WebElement currency = locateElement("id","createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(currency,"INR - Indian Rupee");
		
		
		WebElement description = locateElement("id","createContactForm_description");
		type(description,"Testing");
		WebElement impnote = locateElement("id","createContactForm_importantNote");
		type(impnote,"Plz Review");
		WebElement areacode = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(areacode,"48");
		WebElement extension = locateElement("id","createContactForm_primaryPhoneExtension");
		type(extension,"044");
		WebElement email = locateElement("id","createContactForm_primaryEmail");
		type(email,"ajithkumarnsp@gmail.com");
		WebElement phonenumber = locateElement("id","createContactForm_primaryPhoneNumber");
		type(phonenumber,"9600869621");
		WebElement persontoask = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(persontoask,"Nishanth");
		WebElement capturetoname = locateElement("id","generalToNameField");
		String toname = getText(capturetoname);
		
		WebElement address1 = locateElement("id","createContactForm_generalAddress1");
		type(address1,"1st Street");
		WebElement city = locateElement("id","createContactForm_generalCity");
		type(city,"Chennai");
		WebElement zip = locateElement("id","createContactForm_generalPostalCode");
		type(zip,"48");
		WebElement zipextension = locateElement("id","createContactForm_generalPostalCodeExt");
		type(zipextension,"044");
		WebElement attentname = locateElement("id","createContactForm_generalAttnName");
		type(attentname,"Manager");
		WebElement address2 = locateElement("id","createContactForm_generalAddress2");
		type(address2,"velacherry");
		
		
		
		WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(country,"India");
		WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state,"TAMILNADU");
		
		WebElement crcontact = locateElement("name","submitButton");
		click(crcontact);
		Thread.sleep(3000);
		
		WebElement capturefirstname = locateElement("id","viewContact_firstName_sp");
		
		verifyPartialText(capturefirstname,toname);
		Thread.sleep(3000);
		WebElement edit = locateElement("linktext","Edit");
		click(edit);
		WebElement marketcampaign = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(marketcampaign,"Road and Track");
		WebElement add = locateElement("xpath","//input[@value='Add']");
		click(add);
		
		WebElement verifycampaign = locateElement("linktext","Road and Track (CATRQ_ROADNTRACK)");
		String verify = getText(verifycampaign);
		WebElement update = locateElement("xpath","//input[@value='Update']");
		click(update);
		
		WebElement verifycampaignop = locateElement("id","viewContact_marketingCampaigns_sp");
		
		verifyExactText(verifycampaign,verify);
		
		
		closeBrowser();
		
		
	}
	
}
