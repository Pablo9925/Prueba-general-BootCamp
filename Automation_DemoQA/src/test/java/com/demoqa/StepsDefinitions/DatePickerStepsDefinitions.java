package com.demoqa.StepsDefinitions;


import com.demoqa.Tasks.OpenDatePicker;
import com.demoqa.Tasks.OpenElements;
import com.demoqa.Tasks.OpenMonthYear;
import com.demoqa.Tasks.OpenWidgets;
import com.demoqa.UserInterfaces.HomePage;
import com.demoqa.Utilities.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class DatePickerStepsDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }
    @Given("^El cliente esta en date picker$")
    public void elClienteEstaEnDatePicker() {
        theActorCalled(Constants.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(OpenWidgets.openWidgets());
        theActorInTheSpotlight().attemptsTo(OpenDatePicker.openDatePicker());
    }

    @When("^Selecciona fecha y hora$")
    public void seleccionaFechaYHora() {
        theActorInTheSpotlight().attemptsTo(OpenMonthYear.openMonthYear());
    }
}
