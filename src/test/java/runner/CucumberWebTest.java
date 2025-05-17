package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(CucumberWithSerenity.class)///Se usará Serenity BDD como motor para ejecutar las pruebas de Cucumber
@CucumberOptions(
        features = {"src/test/resources"}, // ruta de archivo feature
        glue = {"stepDefinition"},//Indica la ruta del paquete Java donde se encuentran las clases con los métodos de los pasos (@Given, @When, @Then).
        tags = "@TC1" // es el nombre del escenario que vamos a ejecutar
)
public class CucumberWebTest {
    @Managed(uniqueSession = true, clearCookies = BeforeEachTest)
    WebDriver driver;
}
