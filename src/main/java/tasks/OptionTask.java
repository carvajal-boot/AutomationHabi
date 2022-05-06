package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MenuUserInterface.LISTA;

public class OptionTask implements Task {

    private  String option;

    public OptionTask (String option){
        this.option = option;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(LISTA.of(option)),
                Click.on(LISTA.of(option))
        );

    }
    public static OptionTask chooseOption(String option) {
        return instrumented(OptionTask.class, option);
    }
}
