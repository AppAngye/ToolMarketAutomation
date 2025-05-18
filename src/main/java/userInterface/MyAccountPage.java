package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {
    public static Target textName =Target.the("title of section my account").locatedBy("/html/body/app-root/div/app-overview/h1");
    public static Target categoryButton = Target.the("button categories").locatedBy(" //*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
    public static Target selectCategory(String nameCategory) {
        return Target.the("select category").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[a[contains(text(), '"+nameCategory+"')]]/a");
    }}
