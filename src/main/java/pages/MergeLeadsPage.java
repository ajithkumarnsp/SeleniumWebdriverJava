package pages;

import org.openqa.selenium.WebElement;

import wdMethods.Annotation;

public class MergeLeadsPage extends Annotation {

	public FindLeadsPage clickfromleadicon() {
		
		WebElement icon1 = locateElement("xpath", prop.getProperty("mergeleadspageclickfromleadicon.leads.xpath"));
		click(icon1);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	public FindLeadsPage clicktoleadicon() {
	
		//switchToWindow(0);
		WebElement icon2 = locateElement("xpath", prop.getProperty("mergeleadspageclicktoleadicon.leads.xpath"));
		click(icon2);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage clickmergelead() {
		
		switchToWindow(0);
		WebElement merge = locateElement("xpath", "//a[text()='Merge']");
		merge.click();
		return this;
	}
	
	public ViewLeadPage alertaccept() {
		
		acceptAlert();
		return new ViewLeadPage();
		
	}
	
public MergeLeadsPage switchingwindowto0() {
		
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	
}
