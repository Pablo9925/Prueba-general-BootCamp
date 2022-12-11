package com.demoqa.Tasks;


import com.demoqa.UserInterfaces.Widgets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class OpenDatePicker implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(Widgets.DATE_PICKER), Click.on(Widgets.DATE_PICKER));
    }

    public static OpenDatePicker openDatePicker(){
        return Tasks.instrumented(OpenDatePicker.class);
    }
}
