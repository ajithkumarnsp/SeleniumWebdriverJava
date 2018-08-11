package wdMethods;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Report{
 
	public static ExtentReports extent;
	public static ExtentTest suiteTest ,test;
	
	 
	// This method creates the HTML report
	//@BeforeSuite
	public void beginResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);		
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	// This method creates the test case level report in HTML
	//@BeforeClass
	public ExtentTest startTest(String testname, String testdesc) {
		 suiteTest = extent.createTest(testname, testdesc);
		return suiteTest;
	}

	// This method create entry for every test case iteration
	//@BeforeMethod
	public ExtentTest startTestIteration(String iteration, String author, String category) {	
		 test = suiteTest.createNode(iteration);
		 test = suiteTest.assignAuthor(author);
		 test = suiteTest.assignCategory(category);
		return test;
	}
 
	// This method create entry for every step
	public void reportStep(String desc,String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc);
		}else if (status.equalsIgnoreCase("warning")) {
			test.warning(desc);
		}
	}

	//@AfterSuite
	// This method create the html report finally
	public void endResult() {
		extent.flush();
	}
	
  }

