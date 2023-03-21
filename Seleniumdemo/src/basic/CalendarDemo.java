package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		WebElement element = driver.findElement(By.xpath("//input[@id='departure']"));
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		JavascriptExecutor js1= (JavascriptExecutor)driver;
	    js1.executeScript("arguments[0].click();", element);
	  //  driver.findElement(By.className("flatpickr-current-month"));
//	    List<WebElement> dates = driver.findElements(By.className("dayContainer"));
//	    int count=driver.findElements(By.className("dayContainer")).size();
//	    for(int i=0;i<count;i++) {
//	    	String text=driver.findElements(By.className("dayContainer")).get(i).getText();
//	    	if(text.equalsIgnoreCase("21")){
//	    		driver.findElement(By.className("dayContainer")).click();
//	    		break;
//	    	}
	    	
//	    }
		

	}

}
