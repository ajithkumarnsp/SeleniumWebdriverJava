package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class DragDropXandYLocations extends SeMethods{

	@Test
	public void dragdropsort()
	{
		startApp("Chrome", "https://jqueryui.com/");
		WebElement sortable = locateElement("linktext","Sortable");
		click(sortable);
		WebElement frame = locateElement("xpath","//iframe[@class='demo-frame']");
		switchToFrame(frame);
		WebElement sourceelement = locateElement("xpath","//ul[@id='sortable']/li[1]");
		WebElement targetelement = locateElement("xpath","//ul[@id='sortable']/li[5]");
		int x = targetelement.getLocation().getX();
		int y = targetelement.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(sourceelement, x, y).perform();
		System.out.println("Drag and drop successful");
		
	}
}
