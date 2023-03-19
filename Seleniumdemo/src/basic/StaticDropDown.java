package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);
		String text = dropdown.getFirstSelectedOption().getText();
		System.out.println(text);
	}

}
