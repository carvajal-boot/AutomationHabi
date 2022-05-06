package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WhatToDoUserInterface {

    public static final Target BUTTON_ADD = Target.the("Do click in add button").located(By.id("addNewRecordButton"));
    public static final Target FIRST_NAME = Target.the("Write first name").located(By.xpath("//input[@id='firstName']"));
    public static final Target LAST_NAME = Target.the("Write last name").located(By.xpath("//input[@id='lastName']"));
    public static final Target EMAIL = Target.the("Write email").located(By.xpath("//input[@id='userEmail']"));
    public static final Target AGE = Target.the("Write age").located(By.xpath("//input[@id='age']"));
    public static final Target SALARY = Target.the("Write salary").located(By.xpath("//input[@id='salary']"));
    public static final Target DEPARTMENT = Target.the("Whrite department").located(By.xpath("//input[@id='department']"));

    public static final Target SUBMIT_BUTTON = Target.the("Do click in submit button").located(By.xpath("//button[@id='submit']"));

    public static final Target DELETE_ROW = Target.the("Delete row").located(By.xpath("//span[@id='delete-record-1']"));

    public static final Target DATA_PICKER_ONE = Target.the("Write date in data pricker").located(By.id("datePickerMonthYearInput"));

    public static final Target DATA_PICKER_TWO = Target.the("Write date and hour in datapicker").located(By.id("dateAndTimePickerInput"));

    public static final Target ALERT_ONE = Target.the("Use the diferents alerts").located(By.id("alertButton"));

    public static final Target ALERT_TWO = Target.the("Use the diferents alerts").located(By.id("timerAlertButton"));

    public static final Target ALERT_THREE = Target.the("Use the diferents alerts").located(By.xpath("//button[@id='confirmButton']"));

    public static final Target ALERT_FOUR = Target.the("Use the diferents alerts").located(By.id("promtButton"));

    public static final Target DATA_SUCCESSFUL = Target.the("Assert of data").located(By.xpath("(//div[@class='rt-tr-group'])[4]//div[1]//div[1]"));

    public static final Target DATA_SIZE = Target.the("Assert of size").located(By.xpath("//div[@class='action-buttons']"));




}
