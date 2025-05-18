package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target labelTitle = Target.the("title page").located(By.cssSelector("#Layer_1"));
    public static Target categoryButton = Target.the("button categories").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");

    public static Target selectCategory(int count) {
        return Target.the("select categorie").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[" + count + "]");
    }

    public static Target contactButton = Target.the("button contact").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
    public static Target homePhoto = Target.the("image home").locatedBy("/html/body/app-root/div/app-overview/div[1]/p/img");
    public static Target titleByCategory= Target.the("title category by").locatedBy("//*[@id=\"filters\"]/h4[5]");
    public static Target titleSort=Target.the("title filter sort").locatedBy("//*[@id=\"filters\"]/h4[1]");
    public static Target comboBoxFilter = Target.the("combo box filter").locatedBy("//*[@id=\"filters\"]/form[1]/div/select");

    public static Target listComboBoxFilter(int count) {
        return Target.the("option combo box").locatedBy("//*[@id=\"filters\"]/form[1]/div/select/option[" + count + "]");
    }

    public static Target handToolCheckBox(String nameCategory) {
        return Target.the("check box hand tools").locatedBy("//*[@id=\"filters\"]/fieldset[1]/div[@class='checkbox']/label[contains(text(), '"+nameCategory+"')]");
    }

    public static Target picturesCard(String productName) {
//        return Target.the("card products").locatedBy("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a["+count+"]");
        return Target.the("card products").locatedBy("//a[.//div[@class='card-body']/h5[contains(text(), '"+productName+"')]]");
    }
}

///html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]