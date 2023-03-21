package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaSriptExecuterDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> list = driver.findElements(By.cssSelector("td:nth-child(4)"));
		int count=driver.findElements(By.cssSelector(".tableFixHead  td:nth-child(4)")).size();
		int sum=0;
		for (int i = 0; i < count; i++) {
			sum=sum+Integer.parseInt(list.get(i).getText());
	
		}
		System.out.println(sum);
		
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Total Amount Collected: 296')]"));
		
		String value = text.getText();
		int total=Integer.parseInt(value.split(":")[1].trim());
		if(sum==total){
			System.out.println("Value matched");
		}
		
		
	}

}
