package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotation;

public class MyHomePage extends Annotation {
	
	/*public MyHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Leads")
	WebElement eleLead;*/
	
	public MyLeadsPage clickleads() {
		
		WebElement eleLead = locateElement("xpath", prop.getProperty("myhomepage.leads.xpath"));
		System.out.println(eleLead);
		click(eleLead);
		return new MyLeadsPage();
	}
	
	
	
}
