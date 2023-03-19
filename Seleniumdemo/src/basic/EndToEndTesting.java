package basic;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEndTesting {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Explici wait
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(2000);
		////button[text()='ADD TO CART']
	
		String[] veggiesItems= {"Cucumber","Brocolli","Beetroot"};
		 
		 additems(driver,veggiesItems);
		 driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		 driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		 By locator1=By.xpath("//input[@class='promoCode']");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
		 
		 //after clicking proceed , page is taking time to load and show the promo code page
		 //to resolv it use implicit wait globally
		// Thread.sleep(5000);
		 driver.findElement(locator1).sendKeys("gangesh");
		 driver.findElement(By.xpath("//button[text()='Apply']")).click();
	
		 By locator2=By.xpath("//span[@class='promoInfo']");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
		 System.out.println(driver.findElement(locator2).getText());
		 
		 
	
		
	}
	
	public static void additems(WebDriver driver,String [] veggiesItems){
		 int j=0;
		 List<String> listofVeggies = Arrays.asList(veggiesItems);
		List<WebElement> listOfProduct = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<=listOfProduct.size();i++) {
			 String[] productname = listOfProduct.get(i).getText().split("-");
			 String formatedname = productname[0].trim();
			 
			 //convert array into arraylist so that we can use contains method;
			
			 //System.out.println(listofVeggies);
			if (listofVeggies.contains(formatedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==veggiesItems.length)
					break;
			}
		}
	}

}
