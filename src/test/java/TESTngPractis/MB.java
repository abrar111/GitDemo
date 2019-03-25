package TESTngPractis;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class MB {
  @Test(dataProvider = "login")
  public void f(Integer n, String s) {
  }

  @DataProvider(name="login")
  public Object[][] dp() {
  //  return new Object[][] {
  //   new Object[] { 1, "a" },
  //   new Object[] { 2, "b" },
  // };
	  
	  Object [][] o=new Object[2][2];
	  o[0][0]=8;
	  o[0][1]=9;
	  o[1][0]=11;
	  o[1][1]=222;
	  return o;
  }
}
