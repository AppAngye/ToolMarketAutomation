package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import question.ToastCorrectQuestion;
import userInterface.Toast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class ValidateToastText implements Task {
    private final String toastText;

    public ValidateToastText(String toastText) {
        this.toastText = toastText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(ToastCorrectQuestion.of(Toast.productAddToast),equalTo(toastText)
        ));
    }
    public static Task toastValidate(String toastText){
        return instrumented(ValidateToastText.class,toastText);
    }
}
