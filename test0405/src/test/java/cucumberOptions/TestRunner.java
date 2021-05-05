package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:src/test/java/features",
        glue = "classpath:stepDefinations"
   //     tags = "@test4"
)


public class TestRunner {
}
