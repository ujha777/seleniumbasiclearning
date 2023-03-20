package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		//Mouse hover
		
		
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(searchElement).click().keyDown(Keys.SHIFT).sendKeys("boat").doubleClick().build().perform();
		a.moveToElement(element).contextClick().build().perform();
		
	}

}
