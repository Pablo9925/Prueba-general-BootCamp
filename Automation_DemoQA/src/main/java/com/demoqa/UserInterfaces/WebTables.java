package com.demoqa.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class WebTables extends PageObject {

    private static final String mail = "alden@example.com";

    public static final Target TABLE = Target.the("Web table").locatedBy("//*[@class='ReactTable -striped -highlight']");
    public static final Target DELETE = Target.the("Botón Delete").locatedBy("//div[contains(text(),'"+mail+"')]/..//span[@title='Delete']");
    public static final Target ADD = Target.the("Botón Add").locatedBy("//*[@id='addNewRecordButton']");
}

