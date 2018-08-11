package dailyquestionsseries5_1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastButOneDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		String url = "http://leafground.com/pages/Dropdown.html";
		
		driver.get(url);
		
		WebElement dropdownthree = driver.findElementById("dropdown3");
		Select option = new Select(dropdownthree);
		List<WebElement> alldropdownvalues = option.getOptions();
		int size = alldropdownvalues.size();
		//System.out.println(size);
		//System.out.println(dropdownthree.getText());
		option.selectByIndex(size-2);//Size - 1 one selects only the last value in the Dropdown, 
		//took size - 2 value. but size prints as 5.
		
	}

}
