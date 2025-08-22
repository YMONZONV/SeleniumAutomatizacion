package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/feature/sauceDemo.feature"},
        glue = {"stepDefinition"},
        tags = "@Tag02",
        plugin = {"pretty"}

)

public class RunnerTest {
}
