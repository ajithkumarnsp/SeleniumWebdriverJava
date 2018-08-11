package testcase;

import org.junit.Test;

import wdMethods.SeMethods;

public class HomeWorkTwoFramesFramwork extends SeMethods{
	@Test
	public void frames()
	{
		startApp("chrome","http://layout.jquery-dev.com/demos/iframes_many.html");
		locateElement("","");
		
	}

}
