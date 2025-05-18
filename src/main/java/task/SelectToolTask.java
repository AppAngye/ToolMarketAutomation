package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.HomePage;
import util.WebUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectToolTask implements Task {

    private final String productName;

    public SelectToolTask(String productName) {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.picturesCard(productName)),
                WaitUntil.the(HomePage.picturesCard(productName), isVisible()).forNoMoreThan(30).seconds(),
                Click.on(HomePage.picturesCard(productName))
        );
        actor.remember("selectedProduct",productName);
        Serenity.takeScreenshot();
        WebUtil.waitTime(5);
    }
    public static Task selectTool(String toolName){
        return instrumented(SelectToolTask.class,toolName);
    }
}
