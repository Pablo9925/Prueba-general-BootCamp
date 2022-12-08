package com.demoqa.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class Elements extends PageObject{
    public static final Target WEBTABLES = Target.the("Sección Web Tables").locatedBy("//*[@class='text' and text()='Web Tables']");
}
