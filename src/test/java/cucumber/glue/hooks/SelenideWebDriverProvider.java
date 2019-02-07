package cucumber.glue.hooks;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;

public class SelenideWebDriverProvider {

    private CustomWebDriverProvider customWebDriverProvider;
    private SelenideDriver driver;
    private SelenideConfig selenideConfig;

    public SelenideWebDriverProvider(CustomWebDriverProvider customWebDriverProvider, SelenideDriver driver,
                                     SelenideConfig selenideConfig) {
        this.customWebDriverProvider = customWebDriverProvider;
        this.driver = driver;
        this.selenideConfig = selenideConfig;
    }

    public SelenideDriver get() {
        return driver;
    }

    public SelenideDriver getDriver() {
        driver = new SelenideDriver(getSelenideConfig());
        return driver;
    }

    public void closeSession() {
        driver.clearCookies();
        driver.close();
    }

    private SelenideConfig getSelenideConfig() {
        return selenideConfig.browser(customWebDriverProvider.getClass().getName());
    }
}
