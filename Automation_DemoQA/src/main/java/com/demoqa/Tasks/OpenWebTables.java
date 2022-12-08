package com.demoqa.Tasks;

import com.demoqa.UserInterfaces.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class OpenWebTables implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(Elements.WEBTABLES), Click.on(Elements.WEBTABLES));
    }

    public static OpenWebTables openWebTable(){
        return Tasks.instrumented(OpenWebTables.class);
    }
}
