package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuUserInterface {
    public static final Target TYPE_MENU = Target.the("Choose type of card elements into of menu").locatedBy("//div[@class='card-body']//*[contains(.,'{0}')]");
    public static final Target LISTA = Target.the("Choose type of card alerts into of menu").locatedBy("//div[@class='accordion']//ul[@class='menu-list']//li[contains(.,'{0}')]");
















}
