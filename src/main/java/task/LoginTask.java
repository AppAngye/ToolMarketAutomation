package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.LoginPage;
import util.WebUtil;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final Map<String,String> formData;

    public LoginTask(Map<String, String> formData) {
        this.formData = formData;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(formData.get("correo")).into(LoginPage.emailInput),
                Enter.theValue(formData.get("contraseña")).into(LoginPage.passwordInput),
                Click.on(LoginPage.viewPasswordBtn)
        );
        Serenity.takeScreenshot();
        actor.attemptsTo(Click.on(LoginPage.loginEnterButton));
        WebUtil.waitTime(5);
    }
    public static Task enter(Map<String,String> formData){
        return instrumented(LoginTask.class,formData);
    }
}
