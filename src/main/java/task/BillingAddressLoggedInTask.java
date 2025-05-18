package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.BillingAddressLoggedInPage;
import util.WebUtil;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BillingAddressLoggedInTask implements Task {
    private  final Map<String,String> formData;

    public BillingAddressLoggedInTask(Map<String, String> formData) {
        this.formData = formData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BillingAddressLoggedInPage.addressInput, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(formData.get("direccion")).into(BillingAddressLoggedInPage.addressInput),
                Enter.theValue(formData.get("ciudad")).into(BillingAddressLoggedInPage.cityInput),
                Enter.theValue(formData.get("estado")).into(BillingAddressLoggedInPage.stateInput),
                Enter.theValue(formData.get("pais")).into(BillingAddressLoggedInPage.countryInput),
                Enter.theValue(formData.get("codigoPostal")).into(BillingAddressLoggedInPage.postalInput)
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(2);
        actor.attemptsTo(Click.on(BillingAddressLoggedInPage.proceedBtn));

    }
    public static Task insert(Map<String,String> formData){
        return instrumented(BillingAddressLoggedInTask.class,formData);
    }
}
