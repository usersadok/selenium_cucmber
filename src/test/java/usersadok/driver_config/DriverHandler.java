package usersadok.driver_config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverHandler {

	public static WebDriver getWebDriver(final String browser) throws Exception {

		WebDriver driver = null;
		
		switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--window-size=414,736");
				options.addArguments("--disable-gpu");
				driver = new ChromeDriver(options);
				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
				
			default:
                throw new Exception(browser.concat(" is not supported"));
        }

		return driver;
	}
}
