package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationShopCartByName implements Question<String> {
    private final Target nameProductLbl;

    public ValidationShopCartByName(Target nameProductLbl) {
        this.nameProductLbl = nameProductLbl;
    }
    public static ValidationShopCartByName of (Target nameProductLbl){
        return new ValidationShopCartByName(nameProductLbl);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(nameProductLbl).answeredBy(actor).trim();
    }
}
