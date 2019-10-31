package by.paulouskin.bdd.screenplay.todo.features;

import by.paulouskin.bdd.screenplay.todo.questions.TodoItemsList;
import by.paulouskin.bdd.screenplay.todo.tasks.AddATodoItem;
import by.paulouskin.bdd.screenplay.todo.tasks.Start;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.hasItem;

@RunWith(SerenityRunner.class)
public class AddNewToDoIT {

    Actor john = Actor.named("John");

    @Managed
    private WebDriver theBrowser;

    @Before
    public void johnCanBrowseTheWeb() {
        john.can(BrowseTheWeb.with(theBrowser));
    }

    @Test
    public void should_be_able_to_add_the_first_todo_item() {
        String todoItemTitle = "Make something useful.";
        givenThat(john).wasAbleTo(Start.withAnEmptyTodoList());
        when(john).attemptsTo(AddATodoItem.called(todoItemTitle));
        then(john).should(seeThat(TodoItemsList.displayed(), hasItem(todoItemTitle)));
    }
}
