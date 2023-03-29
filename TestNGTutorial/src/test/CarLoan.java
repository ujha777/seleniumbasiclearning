package test;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
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
  @Test(groups= {"Smoke"})
  public void APILoginCarLoan() {
	  Reporter.log("API_Car",true);
  }
  @Test(timeOut=4000)
  public void WebLoginCarLoan() {
	  Reporter.log("Web_Car",true);
  }
  @Test(dataProvider = "getData")
  public void CarDhekhoLogin(String username,String password) {
	  Reporter.log(username);
	  Reporter.log(password);
  }
  @DataProvider
  public Object[][] getData(){
	  
	  
	  Object[][] data= new Object[3][2];
	  data[0][0]="firstusername";
	  data[0][1]="fisrtpassword";
	  
	  data[1][0]="secondusername";
	  data[1][1]="secondpassword";
	  
	  data[2][0]="thirdusername";
	  data[2][1]="thirdpassword";
	return data;
	  
	  
	  
	  
  }
  
  
}
