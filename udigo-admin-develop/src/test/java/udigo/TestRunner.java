package udigo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (       features={"src/main/resources/features"},
                glue="udigo.steps",
                format={"pretty","html:cucumber-html-reports",
                        "json:cucumber-html-reports/cucumber.json"},
                tags = {"~@Skip"}
        )
public class TestRunner {

}
