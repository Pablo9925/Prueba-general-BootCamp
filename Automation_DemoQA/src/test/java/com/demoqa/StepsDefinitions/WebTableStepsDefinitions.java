package com.demoqa.StepsDefinitions;

import com.demoqa.Tasks.DeleteRegister;
import com.demoqa.Tasks.OpenElements;
import com.demoqa.Tasks.OpenWebTables;
import com.demoqa.UserInterfaces.HomePage;
import com.demoqa.Utilities.Constanst;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class WebTableStepsDefinitions {
    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }
    @Given("^El cliente esta en webtables$")
    public void elClienteEstaEnWebtables() {
        theActorCalled(Constanst.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(OpenElements.openElements());
        theActorInTheSpotlight().attemptsTo(OpenWebTables.openWebTable());
    }

    @When("^Desea eliminar un registro en especifico$")
    public void deseaEliminarUnRegistroEnEspecifico() {
       theActorInTheSpotlight().attemptsTo(DeleteRegister.deleteRegister());
    }

    @Then("^Se valida que el registro se elimino$")
    public void seValidaQueElRegistroSeElimino() {
    }
}
