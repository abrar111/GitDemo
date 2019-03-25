package TESTngPractis;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
 
	@Test(alwaysRun=true)
	public void test0() {
		System.out.println("Test.....Test  0");
	}
	@Test
	public void test1() {
		System.out.println("Test.....Test  1");
	}
	@BeforeSuite
	public void test2() {
		System.out.println("Test....BeforeSuite");
	}
	@AfterSuite
	public void test3() {
		System.out.println("Test....AfterSuite");
	}
	@BeforeTest
	public void test4() {
		System.out.println("Test....BeforeTest");
	}
	@AfterTest
	public void test5() {
		System.out.println("Test....AfterTest");
	}
	@BeforeGroups
	public void test6() {
		System.out.println("Test....BeforeGroups");
	}
	@AfterGroups
	public void test7() {
		System.out.println("Test....AfterGroups");
	}
	@BeforeClass
	public void test8() {
		System.out.println("Test....BeforeClass");
	}
	@AfterClass
	public void test9() {
		System.out.println("Test.....AfterClass");
	}
	@BeforeMethod
	public void test10() {
		System.out.println("Test.....BeforeMethod");
	}
	public void takeScreenShot() {
		System.out.println("TOOK SCREENSHOT");
	}
	@AfterMethod
	public void test11(ITestResult r) {
		System.out.println("Test.....AfterMethod");
		switch (r.getStatus()) {
		case ITestResult.SUCCESS:{
			System.out.println("TEST CASE PASSED");
		}
		case ITestResult.FAILURE:{
			takeScreenShot();
		}
		
		}
	}
	
	

	
}
