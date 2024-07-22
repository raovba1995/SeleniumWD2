package testng;

import org.testng.annotations.Test;

public class OneTestCaseExample extends BaseClass {
	
	@Test(groups = {"regression", "sanity"} )
	public void TestCase01()  {
		System.out.println("Inside TC01");
	}

}
