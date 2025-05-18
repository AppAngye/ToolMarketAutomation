package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationClientLoggedIn implements Question<String> {
    private final Target messageText;

    public ValidationClientLoggedIn(Target messageText) {
        this.messageText = messageText;
    }
    public static ValidationClientLoggedIn of (Target messageText){
        return new ValidationClientLoggedIn(messageText);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(messageText).answeredBy(actor);
    }
}
