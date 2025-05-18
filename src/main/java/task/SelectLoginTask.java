package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.HomePage;
import util.WebUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.homePhoto, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(HomePage.loginBtn)
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(3);
    }
    public static Task select(){
        return instrumented(SelectLoginTask.class);
    }
}
