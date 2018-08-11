package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTwoFrames {

	
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> grandparentframe = driver.findElementsByTagName("iframe");
		int grandparentframesize = grandparentframe.size();
		//System.out.println(grandparentframesize);
		int allframes = grandparentframesize;
		//System.out.println(allframes);
		
		driver.switchTo().frame(0);
		List<WebElement> childparentframe = driver.findElementsByTagName("iframe");
		int childparentframesize = childparentframe.size();
		//System.out.println(childparentframesize);
		allframes = allframes + childparentframesize;
		//System.out.println(allframes);
		List<WebElement> childframe = driver.findElementsByTagName("frame");
		int childframesize = childframe.size();
		//System.out.println(childframesize);
		allframes = allframes + childframesize;
		//System.out.println(allframes);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		List<WebElement> childparentframe1 = driver.findElementsByTagName("iframe");
		int childparentframe1size = childparentframe1.size();
		//System.out.println(childparentframe1size);
		allframes = allframes + childparentframe1size;
		//System.out.println(allframes);
		List<WebElement> childframe1 = driver.findElementsByTagName("frame");
		int childframe1size = childframe1.size();
		//System.out.println(childframe1size);
		allframes = allframes + childframe1size;
		//System.out.println(allframes);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		List<WebElement> childparentframe2 = driver.findElementsByTagName("iframe");
		int childparentframe2size = childparentframe2.size();
		//System.out.println(childparentframe2size);
		allframes = allframes + childparentframe2size;
		//System.out.println(allframes);
		List<WebElement> childframe2 = driver.findElementsByTagName("frame");
		int childframe2size = childframe2.size();
		//System.out.println(childframe2size);
		allframes = allframes + childframe2size;
		//System.out.println(allframes);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		List<WebElement> childparentframe3 = driver.findElementsByTagName("iframe");
		int childparentframe3size = childparentframe3.size();
		//System.out.println(childparentframe3size);
		allframes = allframes + childparentframe3size;
		//System.out.println(allframes);
		List<WebElement> childframe3 = driver.findElementsByTagName("frame");
		int childframe3size = childframe3.size();
		//System.out.println(childframe3size);
		allframes = allframes + childframe3size;
		//System.out.println(allframes);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(4);
		List<WebElement> childparentframe4 = driver.findElementsByTagName("iframe");
		int childparentframe4size = childparentframe4.size();
		//System.out.println(childparentframe4size);
		allframes = allframes + childparentframe4size;
		//System.out.println(allframes);
		List<WebElement> childframe4 = driver.findElementsByTagName("frame");
		int childframe4size = childframe4.size();
		//System.out.println(childframe4size);
		allframes = allframes + childframe4size;
		System.out.println(allframes);
		driver.switchTo().defaultContent();
		driver.close();
	}
}
