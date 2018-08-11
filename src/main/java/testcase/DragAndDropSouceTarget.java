package testcase;

import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class DragAndDropSouceTarget extends SeMethods {
	@Test
	public void dragdroptarget()
	{
		startApp("Chrome", "https://jqueryui.com/");
		WebElement droppable = locateElement("linktext","Droppable");
		click(droppable);
		WebElement frame = locateElement("xpath","//iframe[@class='demo-frame']");
		switchToFrame(frame);
		WebElement sourceelement = locateElement("xpath","//p[text()='Drag me to my target']");
		WebElement targetelement = locateElement("id","droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(sourceelement, targetelement).perform();
		System.out.println("Dragged the source Element Successfully to target element");
		
		
	}

}
