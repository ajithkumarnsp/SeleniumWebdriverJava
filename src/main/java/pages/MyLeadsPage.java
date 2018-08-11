package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class MyLeadsPage extends Annotation{

	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Create Lead")
	WebElement eleCreateLead;
	
public CreateLeadsPage clickcreateleads() {
		
		click(eleCreateLead);
		return new CreateLeadsPage();
	}
	
public FindLeadsPage clickfindleads() {
	
	WebElement findleads = locateElement("linktext", prop.getProperty("myleadspageeditlead.leads.linktext"));
	click(findleads);
	return new FindLeadsPage();
	
}

public MergeLeadsPage clickmergeleads() {
	
	WebElement mergelead = locateElement("linktext", prop.getProperty("mergeleadspageclickmergelead.leads.linktext"));
	click(mergelead);
	return new MergeLeadsPage();
	
}

	
}
