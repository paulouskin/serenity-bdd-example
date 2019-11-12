package by.paulouskin.bdd.screenplay.todo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Refresh implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().deleteAllCookies();
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
    }

    public static Refresh theBrowserPage() {
        return instrumented(Refresh.class);
    }
}
