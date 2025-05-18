package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BillingAddressLoggedInPage {
    public static Target addressInput= Target.the("input address").locatedBy("//*[@id=\"city\"]");
    public static Target cityInput=Target.the("input city").locatedBy("//*[@id=\"city\"]");
    public static Target stateInput =Target.the("input state").locatedBy("//*[@id=\"state\"]");
    public static Target countryInput=Target.the("input country").locatedBy("//*[@id=\"country\"]");
    public static Target postalInput=Target.the("code postal input").locatedBy("//*[@id=\"postal_code\"]");
    public static Target proceedBtn=Target.the("button proceed to checkout").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[3]/app-address/div/div/div/div/button");
}
