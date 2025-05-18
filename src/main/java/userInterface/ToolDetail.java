package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ToolDetail {
    public static Target titleTool= Target.the("title tool selected").locatedBy("/html/body/app-root/div/app-detail/div[1]/div[2]/h1");
   public static Target toolCountInput = Target.the("count of tool").locatedBy("//*[@id=\"quantity-input\"]");
    public static Target addCartButton= Target.the("button add cartshop").locatedBy("//*[@id=\"btn-add-to-cart\"]");
    public static Target shopCartButton = Target.the("button shop cart").locatedBy("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a");

}
