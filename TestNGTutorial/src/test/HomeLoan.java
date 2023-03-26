package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomeLoan {
	  @Test
	  public void MobileLoginHomeLoan() {
		  Reporter.log("Mobile_Home",true);
	  }
	  @Test
	  public void APILoginHomeLoan() {
		  Reporter.log("API_Home",true);
	  }
	  @Test
	  public void WebLoginHomeLoan() {
		  Reporter.log("Web_Home",true);
	  }
}
