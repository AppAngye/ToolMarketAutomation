package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userInterface.Toast;

public class ToastCorrectQuestion implements Question<String> {
    private final Target toast;

    public ToastCorrectQuestion(Target toast) {
        this.toast = toast;
    }
    public static ToastCorrectQuestion of( Target toast){
        return new ToastCorrectQuestion(toast);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(toast).answeredBy(actor);
    }
}
