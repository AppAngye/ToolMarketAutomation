package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BillingAddressStepPage {
    public static Target billingTitleLbl = Target.the("title billing address").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[3]/app-address/div/div/div/h3");
    public static Target nextbuttonstep3 = Target.the("button next step 3").located(By.cssSelector("body > app-root > div > app-checkout > aw-wizard > div > aw-wizard-step:nth-child(3) > app-address > div > div > div > div > button"));
}
