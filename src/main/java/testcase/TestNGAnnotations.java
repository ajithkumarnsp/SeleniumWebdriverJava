package testcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGAnnotations implements IAnnotationTransformer, IRetryAnalyzer {
 int retrymax = 1;
	@Override
	public void transform(ITestAnnotation annotation, Class testclass, 
			Constructor testconstructor, Method testmethod) {
		// TODO Auto-generated method stub
	annotation.setInvocationCount(3);
		annotation.setRetryAnalyzer(this.getClass());
		if(!testmethod.getName().equals("create"));
		annotation.setEnabled(false);
		
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(!result.isSuccess() && retrymax < 3)
		{
			retrymax++;
			return true;
		}
		else
		return false;
	}
	

}
