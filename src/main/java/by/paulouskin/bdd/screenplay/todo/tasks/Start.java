package by.paulouskin.bdd.screenplay.todo.tasks;

import by.paulouskin.bdd.screenplay.todo.ui.ApplicationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private ApplicationHomePage applicationHomePage;

    @Override
    @Step("{0} starts with an empty todo list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(applicationHomePage)
        );
    }

    public static Start withAnEmptyTodoList() {
        return instrumented(Start.class);
    }
}
