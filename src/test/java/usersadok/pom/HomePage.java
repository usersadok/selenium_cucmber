package usersadok.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	/**
     * All WebElements are identified by @FindBy annotation (Page Factory)
     */
	private WebDriver driver;
	
	@FindBy(id = "search_query_top") 
	private WebElement searchBarInput;

	@FindBy(css = ".btn.btn-default.button-search")
	private WebElement searchButton;

	@FindBy(className = "heading-counter")
	private WebElement resultsCounterMessage;
	
	@FindBy(css = ".alert.alert-warning")
	private WebElement alertWarningMessage;
	
	public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }   
	
	public void inputItemToSearch(String item) {
		searchBarInput.clear();
		searchBarInput.sendKeys(item);
	}
	
	public void clickOnSearchButton() {
		 searchButton.click();
	}
	
	public String getResultsCounterMessage() {
		return resultsCounterMessage.getText();
	}
	
	public boolean isAlertWarningDisplayed() {
		return alertWarningMessage.isDisplayed();
	}
	
	public String getAlertWarningText() {
		return alertWarningMessage.getText();
	}
}
