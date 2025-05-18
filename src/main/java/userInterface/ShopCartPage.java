package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopCartPage {
    public static Target tableShopCartTools = Target.the("label cart").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table");
    public static Target nameProductLbl= Target.the("name of product selected").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table/tbody/tr/td[1]/span");
    public static Target toolCountInput=Target.the("quantity product added").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/table/tbody/tr/td[2]/input");
    public static Target proceedCheckoutButton = Target.the("proceed to checkout button").located(By.cssSelector("body > app-root > div > app-checkout > aw-wizard > div > aw-wizard-step:nth-child(1) > app-cart > div > div > button"));
    public static Target paymentTitleLbl = Target.the("payment title label").located(By.cssSelector("body > app-root > div > app-checkout > aw-wizard > div > aw-wizard-completion-step > app-payment > div > div > div > h3"));
    public static Target typePaymentSelect = Target.the("combo box type payments").locatedBy("//*[@id=\"payment-method\"]");

    public static Target listTypePayment(int count) {
        return Target.the("list of type payments").locatedBy("//*[@id=\"payment-method\"]/option[" + count + "]");
    }

    public static Target confirmButton = Target.the("button confirm").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/div");

}

