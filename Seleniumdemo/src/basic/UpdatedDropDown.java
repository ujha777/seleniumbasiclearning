package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000L);
		for(int i=1;i<5;i++)
		{
	      JavascriptExecutor js= (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].click()",driver.findElement(By.id("hrefIncAdt")));
		}
		
		Thread.sleep(5000L);
	      JavascriptExecutor js1= (JavascriptExecutor)driver;
	      js1.executeScript("arguments[0].click()", driver.findElement(By.id("btnclosepaxoption")));
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}


}
