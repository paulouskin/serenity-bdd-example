package by.paulouskin.bdd.screenplay.todo.tasks;

import by.paulouskin.bdd.screenplay.todo.ui.TodoList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddATodoItem implements Task {

    private String item;

    public AddATodoItem(String item) {
        this.item = item;
    }

    public static AddATodoItem called(String item) {
        return instrumented(AddATodoItem.class, item);
    }

    @Override
    @Step("{0} adds an item called '#item' ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(item)
                .into(TodoList.TODO_FIELD)
                .thenHit(Keys.RETURN)
        );
    }


}
