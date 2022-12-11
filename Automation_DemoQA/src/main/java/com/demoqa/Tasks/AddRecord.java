package com.demoqa.Tasks;

import com.demoqa.UserInterfaces.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class AddRecord implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(WebTables.ADD), Click.on(WebTables.ADD));
    }

    public static AddRecord addRecord(){
        return Tasks.instrumented(AddRecord.class);
    }
}


