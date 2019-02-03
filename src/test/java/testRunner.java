import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//        tags = {"(@EE-3027 or @FinalDecision) and not @DoNotRun"
//        tags = {"@happypath and not @DoNotRun"
        tags = {"@test"
                //+ "@full,"
                //+ " @EE-3027,"
                //+ "@identity,"
                //+ "@suitability,"
                //+ "@eligibility,"
                //+ "@finalDecision,"
                //+ "@script1a,"
                //+ "@script2a,"
                //+ "@testdebug,"
                //+ "@NotFullyImplemented,"
                //+ " ~@DoNotRun"
        },
        plugin = "pretty",
        features = "src/test/java/features/",
        glue = {"steps.LoginStep"

        }
)
public class testRunner {


}