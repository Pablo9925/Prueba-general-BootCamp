package com.demoqa.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Registration implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;
    private Target fieldFirstName;
    private Target fieldLastName;
    private Target fieldEmail;
    private Target fieldAge;
    private Target fieldSalary;
    private Target fieldDepartment;
    private Target btnSubmit;

    public Registration(String firstName, String lastName, String email, String age, String salary, String department, Target... targets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.fieldFirstName = targets[0];
        this.fieldLastName = targets[1];
        this.fieldEmail = targets[2];
        this.fieldAge = targets[3];
        this.fieldSalary = targets[4];
        this.fieldDepartment = targets[5];
        this.btnSubmit = targets[6];
    }

    public static Registration en(String firstName, String lastName, String email, String age, String salary, String department, Target... targets) {
        return Tasks.instrumented(Registration.class, firstName, lastName, email, age, salary, department, targets);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(fieldFirstName), Enter.theValue(lastName).into(fieldLastName),
                Enter.theValue(email).into(fieldEmail), Enter.theValue(age).into(fieldAge), Enter.theValue(salary).into(fieldSalary),
                Enter.theValue(department).into(fieldDepartment), Click.on(btnSubmit));
    }
}
