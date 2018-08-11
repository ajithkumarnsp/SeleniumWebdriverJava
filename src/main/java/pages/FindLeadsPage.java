package pages;

import org.openqa.selenium.WebElement;

import wdMethods.Annotation;

public class FindLeadsPage extends Annotation {
	
	public FindLeadsPage enterfname(String fname) {
		
		WebElement firstname = locateElement("xpath",prop.getProperty("typefindleadspage.leads.xpath"));
		type(firstname, fname);
		return this;
		
	}
	
	public FindLeadsPage clickfindleads() {
		
	WebElement findleadsbutton = locateElement("xpath", prop.getProperty("clickfindleadspage.leads.xpath"));
	click(findleadsbutton);
		return this;
		
	}
	

	public ViewLeadPage clickleadidedit(String captureid) throws InterruptedException {
		
		/*WebElement firstleadID = locateElement("xpath",prop.getProperty("clickleadidedit.leads.xpath"));
		String leadid = firstleadID.getText();*/
		WebElement clickleadid = locateElement("linktext",captureid);
		Thread.sleep(5000);
		click(clickleadid);
		return new ViewLeadPage();
		
	}
	
public MergeLeadsPage clickleadidmerge(String captureid) throws InterruptedException {
		
		/*WebElement firstleadID = locateElement("xpath",prop.getProperty("clickleadidedit.leads.xpath"));
		String leadid = firstleadID.getText();*/
		WebElement clickleadid = locateElement("linktext",captureid);
		Thread.sleep(5000);
		click(clickleadid);
		//clickleadid.click();
		switchToWindow(0);
		return new MergeLeadsPage();
		
	}
	
	
	public String captureleadid() {
		WebElement firstleadID = locateElement("xpath",prop.getProperty("clickleadidedit.leads.xpath"));
		String leadid = firstleadID.getText();
		return leadid;
	}
	
	public FindLeadsPage clickphone() {
		WebElement phone = locateElement("xpath",prop.getProperty("findleadspageclickphone.leads.xpath"));
		click(phone);
		return this;
	}
	
	public FindLeadsPage enterphnumber(String pnumber) {
		
		WebElement enterphone = locateElement("name",prop.getProperty("findleadspageclearphnumber.leads.name"));
		clear(enterphone);
		WebElement enterphone1 = locateElement("name",prop.getProperty("findleadspageenterphonenumber.leads.name"));
		type(enterphone1,""+pnumber);
		return this;
	}
	
	public FindLeadsPage verifydeletedrecord() {
		WebElement verify = locateElement("xpath",prop.getProperty("viewleadspageverifydeletedrecords.leads.xpath"));
		String verifynorecords = getText(verify);
		verifyExactText(verify,verifynorecords);
		return this;
	}
	
	public FindLeadsPage enterleadid(String captureid) {
		WebElement leadid = locateElement("xpath",prop.getProperty("findleadspageenterleadid.leads.xpath"));
		type(leadid,captureid);
		return this;
	}
	
	public FindLeadsPage clickemail() {
		
		WebElement emailclick = locateElement("xpath",prop.getProperty("findleadspageclickemail.leads.xpath"));
		click(emailclick);
		return this;
	}
	
	public FindLeadsPage enteremailid(String emailid) {
		WebElement email = locateElement("name",prop.getProperty("findleadspageentermeailid.leads.name"));
		type(email, emailid);
		return this;
	}
	
	public String capturefirstname() {
		
		WebElement name = locateElement("xpath",prop.getProperty("findleadspagecapturefirstname.leads.xpath"));
		String capturename = getText(name);
		return capturename;
	}
	
	/*public MergeLeadsPage switchingwindowto0() {
		
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	*/
	

}
