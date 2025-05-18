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

public class FilterByCategoryTask implements Task {
    private final String nameCategory;

    public FilterByCategoryTask(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.handToolCheckBox(nameCategory),isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(HomePage.titleByCategory),
                Click.on(HomePage.handToolCheckBox(nameCategory))
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(5);
    }

    public static Task filterByCategory(String categoryId) {
        return instrumented(FilterByCategoryTask.class, categoryId);
    }
}
