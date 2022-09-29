package com.orangehrm;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static controllers.PageBase.getDriver;

public class DashboardPage {
    private static final Logger LOGGER = Logger.getLogger(DashboardPage.class);
    private static By hdrDashboard= By.xpath("//h1");

    public static boolean isDashboardPageDisplay() {

        return getDriver().findElement(hdrDashboard).isDisplayed();
    }
}
