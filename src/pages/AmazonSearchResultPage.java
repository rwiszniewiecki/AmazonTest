package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchResultPage extends BasePage {

	@FindBy(id = "a-autoid-0")
	WebElement sortField;

	@FindBy(id = "s-result-sort-select_2")
	WebElement sortHighToLow;

	@FindBy(xpath = "//*[@data-index='2']//*[@class='a-price']")
	WebElement secondProduct;

	public AmazonSearchResultPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
    }

	public void sortResultsFromHighToLow() {
		sortField.click();
		sortHighToLow.click();
	}

	public void selectSecondProduct() {
		secondProduct.click();
	}

}
