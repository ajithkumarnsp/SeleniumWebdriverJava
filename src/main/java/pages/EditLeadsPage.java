package pages;

import org.openqa.selenium.WebElement;

import wdMethods.Annotation;

public class EditLeadsPage extends Annotation{
	
	public EditLeadsPage editcompname(String editcname) {
		
		WebElement cleartext = locateElement("id", prop.getProperty("clearcnameeditleadspage.leads.id"));
		clear(cleartext);
		WebElement changecompany = locateElement("id", prop.getProperty("editcnameeditleadspage.leads.id"));
		type(changecompany,editcname);
		return this;
	}

	public ViewLeadPage clickupdateeditpage() {
		
		WebElement update = locateElement("xpath",prop.getProperty("editleadspageupdate.leads.id"));
		click(update);
		return new ViewLeadPage();
	}
}
