package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target labelTitle = Target.the("title page").located(By.cssSelector("#Layer_1"));
    public static Target categorieButton = Target.the("button categories").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");

    public static Target selectCategorie(String count) {
        return Target.the("select categorie").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[" + count + "]");
    }

    public static Target contactButton = Target.the("button contact").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
    public static Target homePhoto = Target.the("image home").locatedBy("/html/body/app-root/div/app-overview/div[1]/p/img");
    public static Target shopcartButton = Target.the("button shop cart").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a/fa-icon/svg/path");
    public static Target comboBoxFilter = Target.the("combo box filter").locatedBy("//*[@id=\"filters\"]/form[1]/div/select");

    public static Target listComboBoxFilter(String value) {
        return Target.the("option combo box").locatedBy("//*[@id=\"filters\"]/form[1]/div/select/option[" + value + "]");
    }

}


