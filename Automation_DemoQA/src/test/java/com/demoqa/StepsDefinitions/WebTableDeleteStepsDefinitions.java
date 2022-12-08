package com.demoqa.StepsDefinitions;

import com.demoqa.Tasks.*;
import com.demoqa.UserInterfaces.HomePage;
import com.demoqa.UserInterfaces.RegistrationForm;
import com.demoqa.Utilities.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class WebTableDeleteStepsDefinitions {
    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }
    @Given("^El cliente esta en webtables$")
    public void elClienteEstaEnWebtables() {
        theActorCalled(Constants.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(OpenElements.openElements());
        theActorInTheSpotlight().attemptsTo(OpenWebTables.openWebTable());
    }

    @When("^Desea eliminar un registro en especifico$")
    public void deseaEliminarUnRegistroEnEspecifico() {
       theActorInTheSpotlight().attemptsTo(DeleteRecord.deleteRegister());
    }

    @Then("^Se valida que el registro se elimino$")
    public void seValidaQueElRegistroSeElimino() {
    }
}
