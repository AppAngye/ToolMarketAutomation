package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Toast {
    public static Target successfulPaymentMessage = Target.the("message successful payment").located(By.cssSelector("body > app-root > div > app-checkout > aw-wizard > div > aw-wizard-completion-step > app-payment > div > div > div > form > div.alert.alert-success"));
    public static Target productAddToast = Target.the("toast product add shopcart").locatedBy("//*[@id=\"toast-container\"]");
}
