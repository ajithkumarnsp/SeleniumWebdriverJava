package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcase.ExcelRead;




public class Annotation extends SeMethods{

	public String iteration,testname,testdesc,author,category,excelfilename;
	
	
	@BeforeSuite/*(groups = {"smoke","sanity"})*/
	public void begin() {
		beginResult();
		loadobject();
	}

	@BeforeClass/*(groups = {"smoke","sanity"})*/
	public void  starttest(){
		startTest(testname, testdesc);
		System.out.println(startTest(testname, testdesc));
	}


	@Parameters({"url", "username", "password"})
	@BeforeMethod/*(groups = {"smoke","sanity"})*/
	public void login(String url, String username, String password) {
		startTestIteration(iteration,author,category);
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);

	}

	

	@AfterMethod(groups = {"smoke","sanity"})
	public void closeApp() {
		closeBrowser();
	}

	@AfterSuite/*(groups = {"smoke","sanity"})*/
	public void htmlflush() {
		endResult();
	}
	@DataProvider(name = "fetchdata"/*, indices = {0}*/)		
	public Object[][] getdata() throws IOException {

		ExcelRead excel = new ExcelRead();
		return excel.readexcel(excelfilename);

		/*Object[][] dataset = new Object[2][9];

			dataset[0][0] = "GISbiz Technology Pvt ltd";
			dataset[0][1] = "Ajithkumar";
			dataset[0][2] = "Nattamai Subramanian Purushothaman";
			dataset[0][3] = "Ajith";
			dataset[0][4] = "Kumar";
			dataset[0][5] = "Mr.Ajithkumar";	
			dataset[0][6] = "LEAD_EMPLOYEE";	
			dataset[0][7] = "9797979797";	
			dataset[0][8] = "ajithkumarnsp@gmail.com";	

			dataset[1][0] = "Valagenesis Technology Pvt ltd";
			dataset[1][1] = "Ajithkumar";
			dataset[1][2] = "Nattamai Subramanian Purushothaman";
			dataset[1][3] = "Ajith";
			dataset[1][4] = "Kumar";
			dataset[1][5] = "Mr.Ajithkumar";	
			dataset[1][6] = "LEAD_CONFERENCE";	
			dataset[1][7] = "9600869621";	
			dataset[1][8] = "ajithkumarnsp@gmail.com";	


			return dataset;*/
	}



}
