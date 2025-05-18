package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.ToolDetail;
import util.WebUtil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DetailProductTask implements Task {
    private final int toolCount;

    public DetailProductTask(int toolCount) {
        this.toolCount = toolCount;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ToolDetail.titleTool, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(String.valueOf(toolCount)).into(ToolDetail.toolCountInput)
//                Click.on(ToolDetail.addCartButton)
        );
        actor.remember("quantityTool",toolCount);
        Serenity.takeScreenshots();
        WebUtil.waitTime(4);
        actor.attemptsTo(Click.on(ToolDetail.addCartButton));
        Serenity.takeScreenshot();
        WebUtil.waitTime(4);


    }

    public static Task addShopCart(int toolCount) {
        return instrumented(DetailProductTask.class, toolCount);
    }
}
