package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.LoginPage;
import util.WebUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginRegisterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String email = actor.recall("email");
        String password = actor.recall("password");
        actor.attemptsTo(
                WaitUntil.the(LoginPage.emailInput, isVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue(email).into(LoginPage.emailInput),
                Enter.theValue(password).into(LoginPage.passwordInput)
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(5);
        actor.attemptsTo(Click.on(LoginPage.loginEnterButton));
        WebUtil.waitTime(2);
    }

    public static Task select() {
        return instrumented(LoginRegisterTask.class);
    }
}
