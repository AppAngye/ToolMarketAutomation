package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import question.ToastCorrectQuestion;
import userInterface.TextToast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class ToastConfirmSuccessTask implements Task {
    private final String messageText;

    public ToastConfirmSuccessTask(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(ToastCorrectQuestion.of(TextToast.successfulPaymentMessage),equalTo(messageText)));
    }
    public static Task compare(String messageText){
        return instrumented(ToastConfirmSuccessTask.class,messageText);

    }
}
