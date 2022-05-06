package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userinterfaces.WhatToDoUserInterface;

import static userinterfaces.WhatToDoUserInterface.DATA_SUCCESSFUL;

public class DataAvailable implements Question<String> {
    private Target xpath;

    public DataAvailable(Target xpath) {
        this.xpath = xpath;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(xpath).viewedBy(actor).asString();
    }

    public static Question<String> value(Target xpath) {
        return new DataAvailable(xpath);
    }
}
