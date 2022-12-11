package com.demoqa.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class DatePicker extends PageObject {
    public static final Target MONTH_YEAR= Target.the("Date picker month and year").locatedBy("//*[@id='datePickerMonthYearInput']");
    public static final Target DATE_TIME= Target.the("Date and time picker").locatedBy("//*[@id='dateAndTimePickerInput']");
}
