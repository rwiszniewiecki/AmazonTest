package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver selectBrowser(String browser) {

		switch (browser.toUpperCase()) {
        case "CHROME":
            return new ChromeDriver();
        case "FIREFOX":
            return new FirefoxDriver();
        default:
            return new ChromeDriver();
		}

	}

}
