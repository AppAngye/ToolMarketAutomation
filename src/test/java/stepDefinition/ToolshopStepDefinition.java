package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.OpenPageTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ToolshopStepDefinition {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que un (.*) ingresa a la página web de TOOLSHOPDEMO")
    public void openPage(String actor) {
        theActorCalled(actor);
        theActorInTheSpotlight().attemptsTo(OpenPageTask.openPage("qa"));
    }
}
