package by.paulouskin.bdd.screenplay.todo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TodoList extends PageObject {

    public static final Target TODO_FIELD = Target
            .the("'What needs to be done?' field")
            .locatedBy(".new-todo");

    public static final Target LIST_ITEMS = Target
            .the("List of todo items")
            .locatedBy(".todo-list");
}
