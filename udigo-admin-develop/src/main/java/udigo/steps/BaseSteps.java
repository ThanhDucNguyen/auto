package udigo.steps;


import udigo.core.Driver;
import udigo.screens.account.AccountScreen;
import udigo.screens.customer.CustomerScreen;

import java.util.HashMap;

public class BaseSteps {

    static HashMap<String, Object> scenarioContainer;

    void openApp() {
        scenarioContainer = new HashMap<>();
        Driver.setUpDriver();
    }

    CustomerScreen getCustomerScreen() {
        return CustomerScreen.getInstance();
    }

    AccountScreen getAccountScreen() {
        return AccountScreen.getInstance();
    }


}
