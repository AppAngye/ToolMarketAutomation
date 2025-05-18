package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ToolshopStepDefinition {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que un (.*) ingresa a la página web de TOOLSHOPDEMO")
    public void openPage(String actor) {
        theActorCalled(actor);
        theActorInTheSpotlight().attemptsTo(OpenPageTask.openPage("qa"));
    }

    @When("filtre por una categoria {string}")
    public void filterByCategory(String nameCategory) {
        theActorInTheSpotlight().attemptsTo(FilterByCategoryTask.filterByCategory(nameCategory));
    }

    @And("selecciona una herramienta de la lista {string}")
    public void selectTool(String productName) {
        theActorInTheSpotlight().attemptsTo(SelectToolTask.selectTool(productName));
    }


    @And("luego añade {int} producto al carrito de compras")
    public void addShopCart(int toolCount) {
        theActorInTheSpotlight().attemptsTo(DetailProductTask.addShopCart(toolCount));
    }

    @And("verifica el mensaje {string}")
    public void assertMessage(String toastText) {
        theActorInTheSpotlight().attemptsTo(ValidateToastText.toastValidate(toastText));
    }

    @And("selecciona el carrito de compras")
    public void seleccionaElCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(SaleShopCartTask.select());
    }

    @And("selecciona en proceder pago")
    public void selectProceedToCheckOut() {

    }
}
