package com.demoqa.Tasks;

import com.demoqa.UserInterfaces.DatePicker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class OpenMonthYear implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(DatePicker.MONTH_YEAR), Click.on(DatePicker.MONTH_YEAR));
    }

    public static OpenMonthYear openMonthYear(){
        return Tasks.instrumented(OpenMonthYear.class);
    }
}
