package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationAccount implements Question<String> {
    private final Target textName;

    public ValidationAccount(Target textName) {
        this.textName = textName;
    }

    public static ValidationAccount of(Target nameText) {
        return new ValidationAccount(nameText);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(textName).answeredBy(actor);
    }
}
