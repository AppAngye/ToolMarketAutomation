package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.*;


import java.util.List;
import java.util.Map;

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
    public void selectCartShop() {
        theActorInTheSpotlight().attemptsTo(CartTask.select());
    }

    @And("selecciona en registrar tu cuenta")
    public void selectRegisterAccountBySignIn() {
        theActorInTheSpotlight().attemptsTo(SignInTask.selectRegister());
    }

    @And("completa el formulario del registro")
    public void formRegisterAccount(DataTable formData) {
        List<Map<String, String>> data = formData.asMaps();
        theActorInTheSpotlight().attemptsTo(RegisterNewAccountTask.register(data.getFirst()));

    }

    @And("completa los datos registrados para iniciar sesion")
    public void login() {
        theActorInTheSpotlight().attemptsTo(LoginRegisterTask.select());
    }

    @Then("validamos que muestre la seccion {string}")
    public void myAccountSection(String textName) {
        theActorInTheSpotlight().attemptsTo(MyAccountTask.select(textName));
    }

    @When("seleccione el boton Login")
    public void selectLoginByHome() {
        theActorInTheSpotlight().attemptsTo(SelectLoginTask.select());
    }

    @And("completa los datos para iniciar sesion")
    public void insertValueLogin(DataTable table) {
        List<Map<String, String>> data = table.asMaps();
        theActorInTheSpotlight().attemptsTo(LoginTask.enter(data.getFirst()));

    }

    @And("filtre desde el menu una categoria {string}")
    public void filterCategoryMenu(String nameCategory) {
        theActorInTheSpotlight().attemptsTo(SelectCategoryMenuTask.selecCategory(nameCategory));
    }

    @And("verifico el mensaje {string}")
    public void messageSignIn(String messageText) {
        theActorInTheSpotlight().attemptsTo(SignInLoggedInTask.select(messageText));
    }

    @And("completa los datos de dirección de envio")
    public void completeBillingAddress(DataTable table) {
        List<Map<String, String>> data = table.asMaps();
        theActorInTheSpotlight().attemptsTo(BillingAddressLoggedInTask.insert(data.getFirst()));
    }

    @And("elijo el metodo de pago {string}")
    public void elijoElMetodoDePago(String typePaymentName) {
        theActorInTheSpotlight().attemptsTo(TypePaymentTask.confirm(typePaymentName));
    }

    @Then("verifica se haya realizado la compra {string}")
    public void verificaSeHayaRealizadoLaCompra(String messageText) {
        theActorInTheSpotlight().attemptsTo(ToastConfirmSuccessTask.compare(messageText));
    }
}
