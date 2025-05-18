package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.RegisterPage;
import util.WebUtil;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterNewAccountTask implements Task {
    private final Map<String, String> formData;
    public RegisterNewAccountTask(Map<String, String> formData) {
        this.formData = formData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegisterPage.nameInput, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(formData.get("nombre")).into(RegisterPage.nameInput),
                Enter.theValue(formData.get("apellido")).into(RegisterPage.lastNameInput),
                Enter.theValue(formData.get("fechaNacimiento")).into(RegisterPage.birthDateInput),
                Enter.theValue(formData.get("calle")).into(RegisterPage.streetInput),
                Enter.theValue(formData.get("codigoPostal")).into(RegisterPage.postalCodeInput),
                Enter.theValue(formData.get("ciudad")).into(RegisterPage.cityInput),
                Enter.theValue(formData.get("estado")).into(RegisterPage.stateInput),
                Select.option(formData.get("pais")).from(RegisterPage.countrySelect),
                Enter.theValue(formData.get("telefono")).into(RegisterPage.phoneInput),
                Enter.theValue(formData.get("correo")).into(RegisterPage.emailInput),
                Enter.theValue(formData.get("contraseña")).into(RegisterPage.passwordInput)
        );
        actor.remember("email",formData.get("correo"));
        actor.remember("password",formData.get("contraseña"));
        Serenity.takeScreenshot();
        WebUtil.waitTime(2);
        actor.attemptsTo(Click.on(RegisterPage.registerButton));
        WebUtil.waitTime(5);
    }

    public static Task register(Map<String, String> formData) {
        return instrumented(RegisterNewAccountTask.class,formData);
    }
}
