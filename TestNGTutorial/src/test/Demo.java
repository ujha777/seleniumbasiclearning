package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void m1() {
		Reporter.log("Hi",true);
	}
	@Test(dependsOnMethods = {"m1"})
	public void m2()
	{
		Reporter.log("Hello",true);
	}
}
