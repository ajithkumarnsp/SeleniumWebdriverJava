package wdMethods;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeMethods extends Report  implements WdMethods{
	public static RemoteWebDriver driver ;
	public static Properties prop;
	//public static String firstleadid;
	int i = 1;
	
	
	public void loadobject() {
		
		 prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/main/resources/Config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void startApp(String browser, String url) {
	
			try {
				if (browser.equalsIgnoreCase("chrome"))  {
					System.setProperty("webdriver.chrome.driver", "E:/TestLeaf/Selenium/driver/chromedriver.exe");
					 driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
					 driver = new FirefoxDriver();
					
				}
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				reportStep("Pass!"  + browser +  "Browser not launched Successfully","pass");
			} 
			catch (WebDriverException e) {
				// TODO Auto-generated catch block
				//System.err.println("The Driver is not installed/driver path is not executable");
				 reportStep("Fail!" + browser + "browser is not launched","fail");
				//throw new WebDriverException();
			}
			//System.out.println("The Browser "+browser+" is Launched Successfully");
			takeSnap();
		} 
			


	public WebElement locateElement(String locator, String locValue)  {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "linktext": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);
			case "tag":return driver.findElementByTagName(locValue);
			}
		reportStep("WebElement" +locValue+ "is Located Successfully","pass");
		} catch (NoSuchElementException e) {
			//System.out.println("The element with locator "+locator+" and with value "+locValue+" not found.");
			reportStep("WebElement is Located Successfully" ,"fail");
			throw new RuntimeException();
		} 
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			reportStep("The data: "+data+" entered successfully", "pass");
		} catch (InvalidElementStateException  e) {
			// TODO Auto-generated catch block
			reportStep("The data: "+data+" could not entered", "fail");
			//System.err.println("NoSuchWindow Exception is Handled");
			//throw new NoSuchWindowException(data);
		} catch (WebDriverException e) {
			//System.out.println("WebDriverException"+e.getMessage());
			reportStep("The data: "+data+" could not entered", "fail");
		}
		finally {
			takeSnap();
			
		}
		
		//System.out.println("The Data "+data+" is Entered Successfully");
		
	}

	public void click(WebElement ele) {
		String text = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();	
			ele.click();
			reportStep("The Element"+ ele + "is clicked Successfully","pass");
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			reportStep("The Element"+ ele + "is clicked Successfully","fail");
		} catch (WebDriverException e) {
			//System.out.println("WebDriverException"+e.getMessage());
			reportStep("The Element"+ ele + "is clicked Successfully","fail");
		} 
		
		//System.out.println("The Element "+ele+" is clicked Successfully");	
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text ="";
		try {
			text = ele.getText();
			reportStep("The text"+ text +"Captured Successfully","pass");
			takeSnap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportStep("The text"+ text +"Captured Successfully","fail");
			takeSnap();
		}
		//System.out.println("The text  " + text + " Captured Successfullty");
		return text;
		
	}
	
	public String getTitl() {		
		String title = "";
		try {
			title =  driver.getTitle();
			//reportStep("The title "+ title +" is Captured Successfully","pass");
		} catch (WebDriverException e) {
			//System.out.println("WebDriverException"+e.getMessage());
			reportStep("The title "+ title +" is not Captured Successfully","fail");
		} 
		return title;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
		try {
			Select options = new Select(ele);
			options.selectByVisibleText(value);
			reportStep("The Dropdown "+ value +" is Captured Successfullty","pass");
			takeSnap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportStep("The Dropdown "+ value +" is Captured Successfullty","fail");
		}
		//System.out.println("The Dropdown is " + ele + " and the value of the dropdown is " + value);
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		try {
			Select options = new Select(ele);
			options.selectByIndex(index);
			reportStep("The Dropdown "+ index+" is selected Successfully","pass");
			takeSnap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportStep("The Dropdown "+ index +" is selected Successfully","fail");
		}
		//System.out.println("The Dropdown is " + ele + " and the value of the dropdown is " + index);
		
	}
	
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select options = new Select(ele);
			options.selectByValue(value);
			reportStep("The Dropdown "+ value +" is selected Successfully","pass");
			takeSnap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			reportStep("The Dropdown "+ value +" is selected Successfully","fail");
		}
		//System.out.println("The Dropdown is " + ele + " and the value of the dropdown is " + value);
		
	}
		
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		//String title = driver.getTitle();
		
		if(getTitl().equals(expectedTitle))
		{
			System.out.println(getTitl());
			//System.out.println(expectedTitle+ " Title is matched");
			reportStep("The Title "+expectedTitle+" is matched", "pass");
			return true;
		}
		else
		{
			//System.out.println(expectedTitle+ "Title is unmatched");
			reportStep("The Title "+expectedTitle+" is not matched","fail");
		}
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		
		String text = ele.getText();
		//System.out.println(text);
		if(text.equals(expectedText))
		{
			//System.out.println("Pass! The First name " + text + " is matched with the " + expectedText );
			reportStep("The error message "+ text + " Exactly matched " + expectedText,"pass");
		}
		else
		{
			//System.out.println("Fail! The First name " + text + " is not matched with the name " + expectedText );
			reportStep("The error message "+ text + " Exactly matched " + expectedText,"fail");
		}
		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		//System.out.println(text);
		if(text.contains(expectedText))
		{
			//System.out.println("Pass! The First name " + text + " contains " + expectedText );
			reportStep("The error message "+ text + "contains" + expectedText,"pass");
		}
		else
		{
			//System.out.println("Fail! The First name " + text + " is not matched with the name " + expectedText );
			reportStep("The error message "+ text + "contains" + expectedText,"fail");
		}
		takeSnap();
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String attributeval = ele.getAttribute(attribute);
		if(attributeval.equals(value))
		{
			System.out.println("The Attribute is " + attributeval + " and matched Successfully");
		}
		else
		{
			System.out.println("The Attribute is " + attributeval + " and not matched");
		}
	    
		
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
		String attributeval = ele.getAttribute(attribute);
		if(attributeval.contains(value))
		{
			System.out.println("The Attribute is " + attributeval + " and partially matched");
		}
		else
		{
			System.out.println("The Attribute is " + attributeval + " and doesn't match partially");
		}
	    
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
	boolean selected = ele.isSelected();
	if(selected == true)
	{
		System.out.println("The Checkbox is already Checked");
		ele.click();
		System.out.println("The Checkbox is unchecked Successfully");
	}
	else
	{
		System.out.println("The Checkbox is not selected");
		ele.click();
		System.out.println("The Checkbox is checked Successfully");
	}
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		boolean displayed = ele.isDisplayed();
		if(displayed == true)
		{
			System.out.println("The Webelement is Present in the page ");
		}
		else
		{
			System.out.println("The Webelement is not Present in the page");
			
		}
	}

	public void switchToWindow(int index) {
		
		Set<String> windowindentifiers = driver.getWindowHandles();
		List<String> listwindowindentifiers = new ArrayList<String>();
		listwindowindentifiers.addAll(windowindentifiers);
		driver.switchTo().window(listwindowindentifiers.get(index));
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("The Browser is switched to " + currentUrl + " Successfully" );
		System.out.println("The Current URL of the Browser is " + currentUrl);
		System.out.println("The title of the Current Instance of the Browser is " + title);
		//takeSnap();
		
		
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
	
		 driver.switchTo().frame(ele);
		System.out.println("The Frames switched Successfully to frame " + ele);
		
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		Alert myalert = driver.switchTo().alert();
		 myalert.accept();
		System.out.println("The focus is set to the Alert and accepted");
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		System.out.println("The Alert is dismissed/cancelled");
		
		
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		takeSnap();
		return alerttext;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		System.out.println("The Current Instance of the Browser was closed Successfully");
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
		System.out.println("All browser Instances are closed Successfully");
	}
	
	public void clear(WebElement ele) {
		
		ele.clear();
		System.out.println("The Element "+ele+" is cleared Successfully");
		takeSnap();
	}
	
/*public void mousehover(WebElement ele, WebElement ele1) {
		
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).pause(3000).click(ele1).build().perform();
		
	}*/
	
}
