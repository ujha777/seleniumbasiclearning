package test;



import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	  
	  @Test
	  public void MobileLoginHomeLoan() {
		  Reporter.log("Mobile_Home",true);
		 
	  }
	  @Test(enabled=false)
	  public void APILoginHomeLoan() {
		  Reporter.log("API_Home",true);
	  }
	
	  @Test(groups= {"Smoke"})
	  public void WebLoginHomeLoan() {
		  Reporter.log("Web_Home",true);
		
	  }
	  @Parameters({"URL"})
	  @Test
	  public void WebLoginHomeLoan(String url) {
		  Reporter.log(url,true);
	  }
}
