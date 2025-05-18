package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;
import util.WebUtil;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPageTask implements Task {
    //trae la configuración del serenity config
    EnvironmentVariables environment;
    private final String propertyUrl;

    public OpenPageTask(String propertyUrl) {
        this.propertyUrl = propertyUrl;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(EnvironmentSpecificConfiguration.from(environment).getProperty(propertyUrl))
        );
        Serenity.takeScreenshot();
        WebUtil.waitTime(2);
    }

    public static Task openPage(String environment) {
        String propertyUrl = "environments." + environment + ".toolshop.baseUrl";
        return instrumented(OpenPageTask.class, propertyUrl);
    }
}

