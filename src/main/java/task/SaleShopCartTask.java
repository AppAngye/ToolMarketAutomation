package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import question.ValidationShopCartByName;
import question.ValidationShopCartByQuantity;
import userInterface.ShopCartPage;
import userInterface.ToolDetail;
import util.WebUtil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class SaleShopCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ToolDetail.shopCartButton),
                WaitUntil.the(ShopCartPage.tableShopCartTools, isVisible()).forNoMoreThan(10).seconds()
        );
        String selectedProduct=actor.recall("selectedProduct");
        int toolCount=actor.recall("quantityTool");
        actor.should(
                seeThat(ValidationShopCartByName.of(ShopCartPage.nameProductLbl),equalTo(selectedProduct.trim())),
                seeThat(ValidationShopCartByQuantity.of(ShopCartPage.toolCountInput),equalTo(toolCount))
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(5);
    }
    public static Task select(){
        return instrumented(SaleShopCartTask.class);
    }
}
