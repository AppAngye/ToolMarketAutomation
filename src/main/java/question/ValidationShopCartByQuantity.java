package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationShopCartByQuantity implements Question<Integer> {
    private final Target quantityProduct;

    public ValidationShopCartByQuantity(Target quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
public static ValidationShopCartByQuantity of (Target quantityProduct){
        return new ValidationShopCartByQuantity(quantityProduct);
}


    @Override
    public Integer answeredBy(Actor actor) {
        String quantityValue= Value.of(quantityProduct).answeredBy(actor);
        return Integer.parseInt(quantityValue);
    }
}
