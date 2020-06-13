package usersadok.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import usersadok.driver_config.DriverHandler;
import usersadok.pom.HomePage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SearchSteps {
	
	WebDriver driver;
	HomePage homePage;
	
	@Before
	public void setup() throws Exception {
		// Browser valid options ["chrome"|"firefox"|"ie"]
		final String browser = "chrome";
		driver = DriverHandler.getWebDriver(browser);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homePage = new HomePage(driver);
	}

	@After
	public void teardown() {
		driver.quit();
	}
	
	/**
     * -----------------------   SEARCH definitions
    */
	
	@Given("I visit the url {string}")
	public void i_visit_the_url(String url) {
		driver.get(url);
	}

	@When("I search for the article {string}")
	public void i_search_for_the_article(String article) {
	    homePage.inputItemToSearch(article);
	    homePage.clickOnSearchButton();
	}

	@Then("the page finds {string} results in the search")
	public void the_page_finds_results_in_the_search(String counter) {
	    String counterMessage = homePage.getResultsCounterMessage();
	    assertEquals(String.format("%s results have been found.", counter), counterMessage);
	}

	@Then("I get the not found message {string}")
	public void i_get_the_not_found_message(String expectedMessage) {
		if(homePage.isAlertWarningDisplayed()) {
			assertEquals(expectedMessage, homePage.getAlertWarningText());
		}else {
			assertFalse(String.format("The message '%s' was not displayed", expectedMessage),true);
		}
	}
}
