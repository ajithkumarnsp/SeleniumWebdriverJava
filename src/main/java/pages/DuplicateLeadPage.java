package pages;

import org.openqa.selenium.WebElement;

import wdMethods.Annotation;

public class DuplicateLeadPage extends Annotation {
	
	
	public DuplicateLeadPage verifyduplicateleadtitle() {
		
		WebElement title = locateElement("id",prop.getProperty("duplicateleadspageverifytitle.leads.id"));
		String verify = getTitl();
		verifyTitle(verify);
		return this;
	}

	public ViewLeadPage clickcreatelead() {
		
		WebElement createleadclick = locateElement("xpath",prop.getProperty("duplicateleadspageclickcreatelead.leads.xpath"));
		click(createleadclick);
		return new ViewLeadPage();
	}
}
