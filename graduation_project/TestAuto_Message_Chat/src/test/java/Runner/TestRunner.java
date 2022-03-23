package Runner;

import io.cucumber.junit.CucumberOptions;

import java.io.File;

import org.junit.After;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/resources/TestMessage.feature"},
		glue = {"SeleniumGlueCode"}
				
        )
public class TestRunner {
	
	    
	
}