package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.CheckoutLoginPage;
import util.WebUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SignInTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckoutLoginPage.registerButton,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckoutLoginPage.registerButton)
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(3);
    }
    public static Task selectRegister(){
        return instrumented(SignInTask.class);
    }
}
