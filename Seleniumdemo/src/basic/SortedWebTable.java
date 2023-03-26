package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;

public class SortedWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/2023_Software/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on the coloumn
		driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();
		//capture all webelemnt into the list
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		int count=driver.findElements(By.xpath("//tbody/tr/td[1]")).size();
		
		//capture text of all webelemnt into the new list-->original list
		ArrayList<String> originallist= new ArrayList<String>();
		for (int i = 0; i <count; i++) {
			String text = list.get(i).getText();
			originallist.add(text);	
		}
		System.out.println(originallist);
		
		
		TreeSet<String> newlist= new TreeSet<String>();
		for (int i = 0; i <count; i++) {
			String text = list.get(i).getText();
			newlist.add(text);	
		}
		System.out.println(newlist);
		
		Assert.assertEquals(originallist, newlist);

		}
	    
	    

}
