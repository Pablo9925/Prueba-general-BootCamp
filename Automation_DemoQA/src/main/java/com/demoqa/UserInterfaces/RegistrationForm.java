package com.demoqa.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationForm{

    public static final Target FIRST_NAME = Target.the("Nombre").locatedBy("//*[@id='firstName']");

    public static final Target LAST_NAME = Target.the("Apellido").locatedBy("//*[@id='lastName']");

    public static final Target EMAIL = Target.the("Correo electrónico").locatedBy("//*[@id='userEmail']");

    public static final Target AGE = Target.the("Edad").locatedBy("//*[@id='age']");

    public static final Target SALARY = Target.the("Salario").locatedBy("//*[@id='salary']");

    public static final Target DEPARTMENT = Target.the("Departamento").locatedBy("//*[@id='department']");

    public static final Target BTN_SUBMIT = Target.the("Botón enviar").locatedBy("//*[@id='submit']");

}
