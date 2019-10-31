package by.paulouskin.bdd.screenplay.todo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static by.paulouskin.bdd.screenplay.todo.ui.TodoList.LIST_ITEMS;

public class TodoItemsList implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(LIST_ITEMS)
                .viewedBy(actor)
                .asList();
    }

    public static Question<List<String>> displayed() {
        return new TodoItemsList();
    }
}
