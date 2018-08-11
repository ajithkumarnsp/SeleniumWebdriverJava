package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class ViewLeadPage extends Annotation {
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "viewLead_firstName_sp")
	WebElement eleverifyfirstname;
	
	public ViewLeadPage verifyfirstname(String verifyfname) {
		
		verifyExactText(eleverifyfirstname,verifyfname);
		return this;
	}

	public ViewLeadPage verifytitleviewlead() {
		
		WebElement title = locateElement("id",prop.getProperty("verifytitleviewlead.leads.id"));
		String titleheader = getTitl();
		System.out.println(titleheader);
		verifyTitle(titleheader);
		return this;
	}
	
	public EditLeadsPage clickedit() {
		
		WebElement edit = locateElement("xpath",prop.getProperty("viewleadspage.leads.xpath"));
		click(edit);
		return new EditLeadsPage();
	}
	
	public ViewLeadPage verifycname() {
		
		WebElement verifycompanyname = locateElement("xpath",prop.getProperty("viewleadspageverify.leads.id"));
		String updatedcompanyname = getText(verifycompanyname);
		System.out.println(updatedcompanyname);
		verifyExactText(verifycompanyname,updatedcompanyname);
		return this;
		
	}
	
	public MyLeadsPage clickdelete() {
		
		WebElement delete = locateElement("class",prop.getProperty("viewleadspageclickdelete.leads.class"));
		click(delete);
		return new MyLeadsPage();
	}
	
	public DuplicateLeadPage clickduplicate() {
		
		WebElement duplicatelead = locateElement("linktext", prop.getProperty("viewleadspageclickduplicate.leads.linktext"));
		click(duplicatelead);
		return new DuplicateLeadPage();
		
	}
	
	public FindLeadsPage clickfindleads() {
		
		WebElement findleads = locateElement("linktext", prop.getProperty("myleadspageeditlead.leads.linktext"));
		click(findleads);
		return new FindLeadsPage();
	
	}
}
