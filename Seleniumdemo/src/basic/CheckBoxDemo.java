package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		List<WebElement> listofCheckbox = driver.findElements(By.xpath("//div[@id='discount-checkbox']/div"));
		for (WebElement webElement : listofCheckbox) {
			System.out.println(webElement.getText());
		}
      int numberOfCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
      System.out.println(numberOfCheckbox);
      //radio button
      driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
      System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
	}

}
