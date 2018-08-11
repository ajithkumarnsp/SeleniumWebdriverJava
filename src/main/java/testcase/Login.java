package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftap12.com/opentaps/control/login");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfatext = locateElement("linktext","CRM/SFA");
		getText(crmsfatext);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);
		
	}
	
}






