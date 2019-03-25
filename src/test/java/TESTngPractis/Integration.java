package TESTngPractis;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Integration extends BaseTest
{
	@Test
	public void test2() {
	//	dr.get("http://www.yahoo.com");
		Assert.assertTrue(6<8);
	}
	public void test3() {
	//	dr.get("http://www.target.com");
	}
	

}
