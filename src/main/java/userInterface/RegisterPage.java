package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static Target nameInput = Target.the("input first name").locatedBy("//*[@id=\"first_name\"]");
    public static Target lastNameInput = Target.the("input last name").locatedBy("//*[@id=\"last_name\"]");
    public static Target birthDateInput = Target.the("date birth input").locatedBy("//*[@id=\"dob\"]");
    public static Target streetInput = Target.the("address input").locatedBy("//*[@id=\"street\"]");
    public static Target postalCodeInput = Target.the("input postalcode").locatedBy("//*[@id=\"postal_code\"]");
    public static Target countrySelect = Target.the("combo box country").locatedBy("//*[@id=\"country\"]");

    public static Target listCountrySelect(int count) {
        return Target.the("list countries combo").locatedBy("//*[@id=\"country\"]/option[" + count + "]");
    }

    public static Target phoneInput = Target.the("input phone").locatedBy("//*[@id=\"phone\"]");
    public static Target emailInput = Target.the("input email").locatedBy("//*[@id=\"email\"]");
    public static Target passwordInput = Target.the("password input").locatedBy("//*[@id=\"password\"]");
    public static Target registerButton = Target.the("register button").locatedBy("/html/body/app-root/div/app-register/div/div/div/form/div/button");
}
