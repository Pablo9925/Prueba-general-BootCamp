package com.demoqa.Tasks;

import com.demoqa.UserInterfaces.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class DeleteRecord implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(WebTables.DELETE), Click.on(WebTables.DELETE));
    }

    public static DeleteRecord deleteRegister(){
        return Tasks.instrumented(DeleteRecord.class);
    }
}
