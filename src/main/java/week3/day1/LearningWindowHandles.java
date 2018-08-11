package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?\r\n" + 
				"filename=tryjsref_prompt");
		driver.manage().window().maximize();
		WebElement frameoutput = driver.findElementById("iframeResult");
		driver.switchTo().frame(frameoutput);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert myAlert = driver.switchTo().alert();
		String text = myAlert.getText();
		myAlert.sendKeys("ExampleText");
		myAlert.accept();
		String text2 = driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println("The Entered Text is " + text2);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElementByXPath("//a[@id='tryhome']").click();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> listofallwindows = new ArrayList();
		listofallwindows.addAll(allwindows);
		driver.switchTo().window(listofallwindows.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listofallwindows.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
