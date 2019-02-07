package cucumber.glue.pageObjects;

import cucumber.glue.hooks.SelenideWebDriverProvider;
import cucumber.glue.hooks.SessionManager;

public class NavigationPageObjects {

    private SessionManager sessionManager;
    private SelenideWebDriverProvider selenideWebDriverProvider;

    public NavigationPageObjects(SelenideWebDriverProvider selenideWebDriverProvider) {
        this.selenideWebDriverProvider = selenideWebDriverProvider;
    }

    public void getPage(String url) {
        selenideWebDriverProvider.get().open(url);
    }

    public String getCurrentUrl() {
        return selenideWebDriverProvider.get().url();
    }
}
