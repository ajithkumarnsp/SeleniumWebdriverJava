package testcase;

import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class MouseHover extends SeMethods {
@Test
	public void mousehover() throws InterruptedException
	{
		startApp("Chrome", "https://www.flipkart.com/");
		//Thread.sleep(5000);
		WebElement close = locateElement("xpath","//button[text()='✕']");
		click(close);
		WebElement tvappliance = locateElement("xpath","//span[text()='TVs & Appliances']");
		
		WebElement samsung = locateElement("xpath","(//span[text()='Samsung'])[2]");
		//WebElement mi = locateElement("xpath","(//a[@title='Mi'])[2]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(tvappliance).pause(3000).click(samsung).perform();
		//builder.moveToElement(tvappliance).pause(3000).click(mi).perform();
		
		WebElement mindropdown = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingText(mindropdown,"₹25000");
		WebElement maxdropdown = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(maxdropdown,"₹60000");

		Thread.sleep(3000);
		WebElement screensize = locateElement("xpath","//div[text()='Screen Size']");
		click(screensize);

		WebElement sizevalue = locateElement("xpath","//div[@title='48 - 55']");
		verifySelected(sizevalue);
		
		/*WebElement sizevalue1 = locateElement("xpath","//div[@title='28 - 32']");
		verifySelected(sizevalue1);
		
		Thread.sleep(3000);
		WebElement screensize1 = locateElement("xpath","//div[text()='Screen Size']");
		click(screensize1);
		
		WebElement sizevalue2 = locateElement("xpath","//div[@title='48 - 55']");
		verifySelected(sizevalue2);*/

		/*Thread.sleep(3000);
		WebElement firstoption = locateElement("xpath","//h1[text()='Televisions']//following::a[1]");
		click(firstoption);*/
		
		Thread.sleep(3000);
		WebElement firstoption = locateElement("xpath","//h1[contains(text(),'Televisions')]//following::a[1]");
		click(firstoption);

		switchToWindow(1);

		Thread.sleep(5000);
		WebElement compare = locateElement("xpath","(//div[@class='_1p7h2j'])[1]");
		verifySelected(compare);


		WebElement compareclick = locateElement("xpath","//span[text()='COMPARE']");
		click(compareclick);

		closeBrowser();

		switchToWindow(0);

		Thread.sleep(3000);
		WebElement secondoption = locateElement("xpath","//h1[contains(text(),'Televisions')]//following::a[2]");
		click(secondoption);

		switchToWindow(1);

		Thread.sleep(5000);
		WebElement compare2 = locateElement("xpath","(//div[@class='_1p7h2j'])[1]");
		verifySelected(compare2);


		WebElement compare2click = locateElement("xpath","//span[text()='COMPARE']");
		click(compare2click);

		WebElement firstprice = locateElement("xpath","(//div[@class='row'])[4]/div[2]/div//div[1]/div[1]");
		//(//div[text()='₹59,999'])[1]
		String firstpricevalue = getText(firstprice);
		

		String sNum = firstpricevalue.replaceAll("\\D", "");		
		int num = Integer.parseInt(sNum);
		



		//firstpricevalue.replace(target, replacement)


		WebElement secondprice = locateElement("xpath","(//div[@class='row'])[4]/div[3]/div//div[1]/div[1]");
		
				//(//div[text()='₹44,999'])[2]
		String secondpricevalue = getText(secondprice);

		String sNum1 = secondpricevalue.replaceAll("\\D", "");		
		int num1 = Integer.parseInt(sNum1);
		
		if(num<=num1)
		{
			WebElement comparevalues = locateElement("xpath","(//button[@type='button'])[1]");
			click(comparevalues);
			System.out.println("The Highest Price Product is Selected to the Cart");
		}
		else
		{
			WebElement compare2values = locateElement("xpath","(//button[@type='button'])[2]");
			click(compare2values);
			System.out.println("The Lowest Price Product is Selected to the Cart");
		}
		closeAllBrowsers();
	}
}
