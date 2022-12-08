package com.demoqa.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class WebTables extends PageObject {
    public static final Target DELETE = Target.the("Botón Delete").locatedBy("//div[contains(text(),'cierra@example.com')]/..//span[@title='Delete']");
}
