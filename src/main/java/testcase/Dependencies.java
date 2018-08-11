package testcase;

import org.testng.annotations.Test;

public class Dependencies {

	

		@Test
		public void methodA()
		{
			System.out.println("Method A");
		}
		@Test(dependsOnMethods = {"testcase.Dependencies.methodC"})
		public void methodB()
		{
			System.out.println("Method B");
		}
		@Test(dependsOnMethods = {"testcase.Dependencies.methodA"})
		public void methodC()
		{
			System.out.println("Method C");
		}
		@Test
		public void methodD()
		{
			System.out.println("Method D");
		}
	}


