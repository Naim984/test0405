package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/dr/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }
}
