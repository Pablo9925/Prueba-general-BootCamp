package com.demoqa.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import com.demoqa.UserInterfaces.HomePage;

public class OpenElements implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(HomePage.ELEMENTS), Click.on(HomePage.ELEMENTS));
    }

    public static OpenElements openElements(){
        return Tasks.instrumented(OpenElements.class);
    }
}
