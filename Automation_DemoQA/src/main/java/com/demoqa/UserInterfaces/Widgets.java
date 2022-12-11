package com.demoqa.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class Widgets extends PageObject{
    public static final Target DATE_PICKER = Target.the("Sección Date Picker").locatedBy("//*[@class='text' and text()='Date Picker']");
}
