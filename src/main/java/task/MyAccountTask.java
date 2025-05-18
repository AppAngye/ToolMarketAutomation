package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import question.ValidationAccount;
import userInterface.HomePage;
import userInterface.MyAccountPage;
import util.WebUtil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class MyAccountTask implements Task {
    private final String nameTitle;

    public MyAccountTask(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(ValidationAccount.of(MyAccountPage.textName), equalTo(nameTitle))
        );
    }

    public static Task select(String nameTitle) {
        return instrumented(MyAccountTask.class, nameTitle);
    }
}
