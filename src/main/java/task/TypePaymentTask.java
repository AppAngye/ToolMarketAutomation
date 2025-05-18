package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.PaymentPage;
import util.WebUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TypePaymentTask implements Task {
    private final String paymentType;

    public TypePaymentTask(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PaymentPage.paymentTitleLbl, isVisible()).forNoMoreThan(5).seconds(),
                Select.option(paymentType).from(PaymentPage.typePaymentSelect)
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(2);
        actor.attemptsTo(Click.on(PaymentPage.confirmButton));
    }
    public static Task confirm(String paymentType){
        return instrumented(TypePaymentTask.class,paymentType);
    }
}
