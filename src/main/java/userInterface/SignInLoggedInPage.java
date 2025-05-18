package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignInLoggedInPage {
    public static Target txtMessage=Target.the("text of message when user is logged in").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[2]/app-login/div/div/div/p");
    public static Target btnProceed =Target.the("button proceed to checkut when user is logged in").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[2]/app-login/div/div/div/div/button");
}
