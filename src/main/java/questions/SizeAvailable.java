package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TheSize;
import net.serenitybdd.screenplay.targets.Target;

public class SizeAvailable implements Question<Integer>{
    private Target xpath;

    public SizeAvailable(Target xpath) {
        this.xpath = xpath;
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return TheSize.of(xpath).viewedBy(actor).asList().size();
    }

    public static Question<Integer> value(Target xpath) {
        return new SizeAvailable(xpath);
    }
}
