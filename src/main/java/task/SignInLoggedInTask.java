package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import question.ValidationClientLoggedIn;
import userInterface.SignInLoggedInPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class SignInLoggedInTask implements Task {
    private final String messageText;

    public SignInLoggedInTask(String messageText) {
        this.messageText = messageText;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SignInLoggedInPage.txtMessage,isVisible()).forNoMoreThan(5).seconds()
        );
        actor.should(
                seeThat(ValidationClientLoggedIn.of(SignInLoggedInPage.txtMessage),equalTo(messageText))
        );
        actor.attemptsTo(Click.on(SignInLoggedInPage.btnProceed));


    }
    public static Task select(String messageText){
        return instrumented(SignInLoggedInTask.class,messageText);
    }
}
