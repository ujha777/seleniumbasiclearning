package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CarLoan {
  @Test
  public void MobileLoginCarLoan() {
	  Reporter.log("Mobile_Car",true);
  }
  public void MobileSignInCar() {
	  Reporter.log("Mobile_Signin_Car",true);
  }
  public void MobilelogoutCar() {
	  Reporter.log("Mobile_logout_Car",true);
  }
  @Test
  public void APILoginCarLoan() {
	  Reporter.log("API_Car",true);
  }
  @Test
  public void WebLoginCarLoan() {
	  Reporter.log("Web_Car",true);
  }
}
