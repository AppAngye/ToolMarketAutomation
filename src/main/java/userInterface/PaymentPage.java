package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage {
    public static Target paymentTitleLbl = Target.the("payment title label").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/h3");
    public static Target typePaymentSelect = Target.the("combo box type payments").locatedBy("//*[@id=\"payment-method\"]");
    public static Target confirmButton = Target.the("button confirm").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/div/button");

}
