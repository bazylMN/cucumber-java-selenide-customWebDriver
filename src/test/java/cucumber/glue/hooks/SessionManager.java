package cucumber.glue.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SessionManager {

    private SelenideWebDriverProvider selenideWebDriverProvider;

    public SessionManager(SelenideWebDriverProvider selenideWebDriverProvider) {
        this.selenideWebDriverProvider = selenideWebDriverProvider;
    }

    @Before
    public void setUp() {
    /*
      SelenideDriver driver= new SelenideDriver(new SelenideConfig().browser(CustomWebDriverProvider.class.getName()));
      is resolved in SelenideWebDriverProvider class
      Line above can be used alone in @Before without SelenideWebDriverProvider class and dependency injection
     */
        selenideWebDriverProvider.getDriver();
    }

    @After
    public void closeSession(){
        selenideWebDriverProvider.closeSession();
    }
}
