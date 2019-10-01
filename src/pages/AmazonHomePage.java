package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends BasePage {
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchField;
		
	public AmazonHomePage(WebDriver driver) {
	    super(driver);
	    PageFactory.initElements(driver, this);
    }
	
	public void searchWithText(String text) {
		searchField.sendKeys(text);
		searchField.submit();
	}

}
