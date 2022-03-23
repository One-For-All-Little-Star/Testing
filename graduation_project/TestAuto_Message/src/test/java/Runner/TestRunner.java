package Runner;



import io.cucumber.junit.CucumberOptions;


import org.junit.After;
import org.junit.runner.RunWith;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/java/Resources/contact.feature"},
glue = {"StepDefinitions"}
        )
public class TestRunner {
@After
public void AfterScenario(Scenario scenario) {
}
}

