package com.demoqa.StepsDefinitions;

import com.demoqa.Tasks.*;
import com.demoqa.UserInterfaces.HomePage;
import com.demoqa.UserInterfaces.RegistrationForm;
import com.demoqa.UserInterfaces.WebTables;
import com.demoqa.Utilities.Constants;
import com.demoqa.Utilities.ErrorMessage;
import com.demoqa.exceptions.GeneralException;
import com.demoqa.questions.ValidateTextField;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.StringContains.containsString;

public class WebTableAddStepsDefinitions {
    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }
    @Given("^El cliente esta en la interfaz webtables$")
    public void elClienteEstaEnWebtables() {
        theActorCalled(Constants.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(OpenElements.openElements());
        theActorInTheSpotlight().attemptsTo(OpenWebTables.openWebTable());
    }

    @When("^Desea agregar un nuevo registro$")
    public void deseaAgregarUnNuevoRegistro() {
        theActorInTheSpotlight().attemptsTo(AddRecord.addRecord());
    }

    @And("^Ingresa nombre de usuario \"([^\"]*)\" \"([^\"]*)\", Email \"([^\"]*)\", Edad \"([^\"]*)\",Salario \"([^\"]*)\"  y departamento \"([^\"]*)\"$")
    public void ingresaNombreDeUsuarioEmailEdadSalarioYDepartamento(String fname, String lname, String mail, String age, String salary, String department) throws Throwable {
        theActorInTheSpotlight().attemptsTo(Registration.en(fname,lname,mail,age,salary,department, RegistrationForm.FIRST_NAME,RegistrationForm.LAST_NAME,RegistrationForm.EMAIL,RegistrationForm.AGE,RegistrationForm.SALARY,RegistrationForm.DEPARTMENT,RegistrationForm.BTN_SUBMIT));
    }

    @Then("^Se valida que el registro de \"([^\"]*)\" se agrego$")
    public void seValidaQueElRegistroDeSeAgrego(String mail) throws Throwable {
        theActorInTheSpotlight().should(seeThat(new ValidateTextField(WebTables.TABLE), containsString(mail)).orComplainWith(GeneralException.class, ErrorMessage.MSG_ERROR_ADD));
    }
}
