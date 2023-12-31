package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/",
        glue = "src/test/java/steps/",
        dryRun = true,
        tags = "@fail",
        plugin={"pretty","rerun:target/failed.txt"}
)

public class RunnerClass {
}