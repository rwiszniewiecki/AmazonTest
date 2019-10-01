package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AmazonHomePage;
import pages.AmazonProductDetailsPage;
import pages.AmazonSearchResultPage;
import util.Browser;
import cucumber.api.java.After;

public class StepDefinitions_AmazonTest {

	WebDriver driver = Browser.selectBrowser("chrome");

	AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
	AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage(driver);
	AmazonProductDetailsPage detailPage = new AmazonProductDetailsPage(driver);

	@Given("^Amazon\\.com page is opened$")
	public void amazon_com_page_is_opened() throws Throwable {
		amazonHomePage.openPage("https://www.amazon.com/");
	}

	@When("^I search for Nikon products$")
	public void i_search_for_Nikon_products() throws Throwable {
		amazonHomePage.searchWithText("Nikon");
	}

	@When("^I sort results from Highest to Lowest Price$")
	public void i_sort_results_from_Highest_to_Lowest_Price() throws Throwable {
		searchResultPage.sortResultsFromHighToLow();
	}

	@When("^I select second product$")
	public void i_select_second_product() throws Throwable {
		searchResultPage.selectSecondProduct();
	}

	@Then("^product detail page is opened and product title is checked$")
	public void product_detail_page_is_opened_and_product_title_is_checked() throws Throwable {
		assert detailPage.checkIfProductTitleContainsText("Nikon D3X");
	}

	@After
	public void closeBrowser() {
		driver.close();
	}

}
