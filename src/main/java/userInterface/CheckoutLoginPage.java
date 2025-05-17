package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutLoginPage {
    public static Target titleLabel = Target.the("name title").located(By.cssSelector("body > app-root > div > app-checkout > aw-wizard > div > aw-wizard-step:nth-child(2) > app-login > div > div > div > div > h3"));
    public static Target registerButton = Target.the("button new register").locatedBy("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[2]/app-login/div/div/div/div/form/div[4]/p/a[1]");
}
