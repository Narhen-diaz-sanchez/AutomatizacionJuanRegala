package co.com.juanregala.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\Features",
        tags = "@AgregarProducto",
        glue = "co.com.juanregala.StepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AgregarProductoRunner {
}
