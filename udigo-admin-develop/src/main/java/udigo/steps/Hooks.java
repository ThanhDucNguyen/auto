package udigo.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import udigo.core.Driver;


public class Hooks {

    @Before("@ResetWeb")
    public void resetApp() {
        Driver.closeDriver();
    }

    @After
    public void autoAcceptAlertStillDisplayedOnScreen(Scenario scenario) {
        if (scenario.isFailed()) {
            embedScreenshotForReport(scenario);

        }
    }

    private void embedScreenshotForReport(Scenario scenario) {

    }
}
