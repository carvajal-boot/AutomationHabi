package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.DataAvailable;
import questions.SizeAvailable;
import tasks.WhatToDoTask;
import tasks.MenuTask;
import tasks.OptionTask;
import userinterfaces.HomePageUserInterface;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static userinterfaces.WhatToDoUserInterface.*;


public class ToolsQaStepDefinition {


    @Managed(driver = "")
    WebDriver driver;
    private HomePageUserInterface homepage = new HomePageUserInterface();

    @Given("^The user (.*) login to the page$")
    public void login_to_the_page(String nameActor) {
        theActorCalled(nameActor).wasAbleTo(Open.browserOn(homepage));

    }
    @When("^the user choose navigate into of (.*)$")
    public void the_user_choose_navigate_into_of_menu(String menu) {
        theActorInTheSpotlight().wasAbleTo(
                MenuTask.chooseMenu(menu)
        );

    }

    @And("^the user get into in the part of (.*)$")
    public void the_user_get_into_in_the_part_of_option(String option) {
        theActorInTheSpotlight().wasAbleTo(
                OptionTask.chooseOption(option)
        );
    }

    @And("^the user choose your interation (.*)$")
    public void theUserChooseYourInterationAddRegister(String WhatToDo) {
        theActorInTheSpotlight().wasAbleTo(
                WhatToDoTask.chooseInteration(WhatToDo));
    }

    @Then("^the navigation is successful in Add Register$")
    public void the_navigation_is_successful_in_Add_Register() {
                theActorInTheSpotlight().should(
                        seeThat("The value in the field should be: ", DataAvailable.value(DATA_SUCCESSFUL), equalTo("Camilo")));
    }
    @Then("^the navigation is successful in Delete Register$")
    public void the_navigation_is_successful_in_Delete_Register() {
        theActorInTheSpotlight().should(
                seeThat("The size in the field should be: ", SizeAvailable.value(DATA_SIZE), equalTo(2)));
    }

}
