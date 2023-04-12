package gangeshseleniumproject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gangeshseleniumproject.AbstractComponent.AbstractComponents;

public class ConfirmationPage extends AbstractComponents {
	WebDriver driver;
	
 public ConfirmationPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	 super(driver);
	 this.driver=driver;
	 PageFactory.initElements(driver, this);	 
}
    @FindBy(xpath="//h1[@class='hero-primary']")
	WebElement confirmMessage;
    
    public String getConfirmationMessage() {
    	return confirmMessage.getText();
    	
    }
}
