package task;

import io.cucumber.java.eo.Se;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import question.ToastCorrectQuestion;
import userInterface.TextToast;
import util.WebUtil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class ToastConfirmSuccessTask implements Task {
    private final String messageText;

    public ToastConfirmSuccessTask(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TextToast.successfulPaymentMessage, isVisible()).forNoMoreThan(15).seconds());
        actor.should(seeThat(ToastCorrectQuestion.of(TextToast.successfulPaymentMessage), equalTo(messageText)));
        Serenity.takeScreenshot();
        WebUtil.waitTime(3);
    }

    public static Task compare(String messageText) {
        return instrumented(ToastConfirmSuccessTask.class, messageText);

    }
}
