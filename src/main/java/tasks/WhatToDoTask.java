package tasks;

import interationes.WaitToLoad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.WhatToDoUserInterface.*;

public class WhatToDoTask implements Task {
    private String WhatToDo;
    public WhatToDoTask(String WhatToDo){
        this.WhatToDo = WhatToDo;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(WhatToDo.toLowerCase());
        switch (WhatToDo.toLowerCase()) {
            case "add register":
                actor.attemptsTo(Click.on(BUTTON_ADD));
                actor.attemptsTo(
                        Click.on(FIRST_NAME),Enter.theValue("Camilo").into(FIRST_NAME).thenHit(Keys.TAB),
                        Enter.theValue("Carvajal").into(LAST_NAME).thenHit(Keys.TAB),
                        Enter.theValue("pruebas@pruebas.com").into(EMAIL).thenHit(Keys.TAB),
                        Enter.theValue(""+12).into(AGE).thenHit(Keys.TAB),
                        Enter.theValue(""+1500000).into(SALARY).thenHit(Keys.TAB),
                        Enter.theValue("Tecnología").into(DEPARTMENT),
                        Click.on(SUBMIT_BUTTON)
                );

                break;
            case "delete register":
                actor.attemptsTo(Click.on(DELETE_ROW));

                break;
            case "select date":
               actor.attemptsTo(
                       Click.on(DATA_PICKER_ONE),
                       Clear.field(DATA_PICKER_ONE),
                       Enter.theValue("06/08/1996").into(DATA_PICKER_ONE).thenHit(Keys.ENTER)
               );

                break;
            case "date and time":
                actor.attemptsTo(
                        Click.on(DATA_PICKER_TWO),
                        Clear.field(DATA_PICKER_TWO),
                        Enter.theValue("May 24, 2019 10:15 PM").into(DATA_PICKER_TWO).thenHit(Keys.ENTER)
                );

                break;
            case "alert 1":
                actor.attemptsTo(
                        Click.on(ALERT_ONE)
                        );
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
                break;
            case "alert 2":
                actor.attemptsTo(
                        JavaScriptClick.on(ALERT_TWO), WaitToLoad.theMiliSeconds(6000)
                       );
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

                break;
            case "alert 3":
                actor.attemptsTo(
                        JavaScriptClick.on(ALERT_THREE)
                );

                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

                break;
            case "alert 4":
                actor.attemptsTo(
                        Click.on(ALERT_FOUR)
                );
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys("pruebas");
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
                break;

            default:
                // Default secuencia de sentencias.
        }



    }

    public static WhatToDoTask chooseInteration(String WhatToDo) {
        return instrumented(WhatToDoTask.class, WhatToDo);
    }

}
