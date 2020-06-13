package usersadok.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/usersadok/features/api.feature", 
				 glue="",
				 plugin = {"pretty", "html:target/report"})
public class TestRunnerLogin {

}
