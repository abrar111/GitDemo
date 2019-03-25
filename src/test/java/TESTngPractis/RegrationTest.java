package TESTngPractis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegrationTest {
	
	WebDriver dr;
	@Test
	public void test2() {
		Reporter.log("test2 is starting");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nazmus sakib\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		dr = new ChromeDriver();
		Reporter.log("opened driver");
		dr.get("https://www.facebook.com/");	
	}
	
	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nazmus sakib\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.google.com/");
		
		
	}

}
