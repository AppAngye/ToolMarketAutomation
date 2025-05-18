package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class TextToast {
    public static Target successfulPaymentMessage = Target.the("message successful payment").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/form/div[2]/div");
    public static Target productAddToast = Target.the("toast product add shopcart").locatedBy("//*[@id=\"toast-container\"]");
}
