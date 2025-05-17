package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static Target titleLoginLbl = Target.the("title login").located(By.cssSelector("body > app-root > div > app-login > div > div > div > h3"));
    public static Target emailInput = Target.the("input email login").located(By.cssSelector("#email"));
    public static Target passwordInput = Target.the("input password login").located(By.cssSelector("#password"));
    public static Target loginEnterButton = Target.the("button enter login").located(By.cssSelector("body > app-root > div > app-login > div > div > div > form > div.input-group.mb-3 > input"));

}
