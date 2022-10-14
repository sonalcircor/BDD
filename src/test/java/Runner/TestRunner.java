
package Runner;


        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        Features: Path of the feature file, where feature file is available,
//                  You can give direct feature package or file name.
        features = "C:\\Users\\Admin\\IdeaProjects\\SimpleBDDFramework\\src\\test\\resources\\Features\\Register.feature",
//        Glue: path of the step definitions file or folder name
        glue = {"StepDefinitions"}

)

public class TestRunner {
}
