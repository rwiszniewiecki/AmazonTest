package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductDetailsPage extends BasePage {

	@FindBy(id = "productTitle")
	WebElement productTitle;

	public AmazonProductDetailsPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
    }

	public boolean checkIfProductTitleContainsText(String text) {
		String productTitleText = productTitle.getText();
		return productTitleText.contains(text);
	}

}
