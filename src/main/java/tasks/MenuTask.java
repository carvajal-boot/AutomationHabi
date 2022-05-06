package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import java.util.Collections;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MenuUserInterface.*;


public class MenuTask implements Task {


    private String menu;

    public MenuTask(String menu){
        this.menu = menu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Scroll.to(TYPE_MENU.of(menu)),
                    Click.on(TYPE_MENU.of(menu)));

    }
    public static MenuTask chooseMenu(String menu) {
        return instrumented(MenuTask.class, menu);
    }


}
