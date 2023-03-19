package basic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Give me the count link the page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println(count.size());
		
		//get me the count of links present in footer section
		//First find the locator of footer section then find the link of footer section.
		WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//Find the link from the 1st coloumn in foooter section
		WebElement getfirstcolumnLink = footerdriver.findElement(By.xpath("//td[1]/ul[1]"));
		int countfooterlink = getfirstcolumnLink.findElements(By.tagName("a")).size();
		System.out.println(countfooterlink);
		
		//Click each link in the 1st coloumn and check each page is opening or not
	
		for (int i = 1; i <countfooterlink; i++) {
			String clickonLinkText = Keys.chord(Keys.CONTROL,Keys.ENTER);
			getfirstcolumnLink.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkText);
			
			Thread.sleep(5000);
		}
		//get title of each tab
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		
		
		
	}

}
