package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class HomeWorkOneWindowHandles extends SeMethods{
@Test
	public void windowhandles()
	{

		startApp("chrome","https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement contactus = locateElement("linktext","Contact Us");
		click(contactus);
		switchToWindow(1);
		switchToWindow(0);
		WebElement compatiblebrowser = locateElement("linktext","Compatible Browser");
		click(compatiblebrowser);
		switchToWindow(2);
		switchToWindow(1);
		closeBrowser();
		switchToWindow(1);
		WebElement browserlist = locateElement("xpath","//div[@class='content_12']");
		getText(browserlist);
		closeAllBrowsers();
		
	}

}
