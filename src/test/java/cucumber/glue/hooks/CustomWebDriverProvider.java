package cucumber.glue.hooks;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CustomWebDriverProvider implements WebDriverProvider {

    private WebDriver webDriver;

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        String currentBrowser = System.getProperty("browser", "");
        switch(currentBrowser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(false);
                webDriver = new ChromeDriver(options);
                break;
            case "chromeHeadless":
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                ChromeOptions headlessOptions = new ChromeOptions();
                headlessOptions.setHeadless(true);
                webDriver = new ChromeDriver(headlessOptions);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setHeadless(false);
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case "firefoxHeadless":
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                FirefoxOptions headlessFirefoxOptions = new FirefoxOptions();
                headlessFirefoxOptions.setHeadless(true);
                webDriver = new FirefoxDriver(headlessFirefoxOptions);
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                ChromeOptions defaultBrowserOptions = new ChromeOptions();
                defaultBrowserOptions.setHeadless(false);
                webDriver = new ChromeDriver(defaultBrowserOptions);
                break;
        }
        return webDriver;
    }
}
