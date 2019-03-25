package TESTngPractis;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SmokeTest {
	
	@Parameters("browser")
	@Test(description="cross browsing")
	public void test1(String s) {
		if(s.equals("chrome")) {
			System.out.println("OPENED CHROME BROWSER");
		}
		else if(s.equals("firefox")) {
			System.out.println("OPENED FIREFOX");
		}
	}
	
	@Test(dataProviderClass=BaseTest.class,dataProvider="login")
	public void f(Integer n,String s) {
		
	}

}
