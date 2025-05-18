package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.HomePage;
import userInterface.MyAccountPage;
import util.WebUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCategoryMenuTask implements Task {
    private final String nameCategory;

    public SelectCategoryMenuTask(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MyAccountPage.textName, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MyAccountPage.categoryButton),
                Click.on(MyAccountPage.selectCategory(nameCategory))
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(6);
    }
    public static Task selecCategory(String nameCategory){
        return instrumented(SelectCategoryMenuTask.class,nameCategory);
    }
}
