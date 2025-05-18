package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static Target emailInput = Target.the("input email login").located(By.cssSelector("#email"));
    public static Target passwordInput = Target.the("input password login").located(By.cssSelector("#password"));
    public static Target viewPasswordBtn =Target.the("button view password").locatedBy("/html/body/app-root/div/app-login/div/div/div/form/div[2]/app-password-input/div/div/button");
    public static Target loginEnterButton = Target.the("button enter login").locatedBy("/html/body/app-root/div/app-login/div/div/div/form/div[3]/input");

}
