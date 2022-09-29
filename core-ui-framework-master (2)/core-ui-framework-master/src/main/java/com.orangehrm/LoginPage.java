package com.orangehrm;

import controllers.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


import org.apache.log4j.Logger;

public class LoginPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By hdrLogin = By.xpath("//*[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
    private static By txtUserName = By.name("username");
    private static By txtPassword = By.name("password");
    private static By btnLogin = By.xpath("//*[@type='submit']");
    private static By alert = By.id("spanMessage");

    private static By btnAddEmployee = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    private static By empFname = By.xpath("//*[@class='oxd-input oxd-input--active orangehrm-firstname']");
    private static By empMname = By.name("middleName");
    private static By empLname = By.name("lastName");
    private static By empId = By.xpath("//*[@class='oxd-input oxd-input--active']");
    private static By btnSave = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");


    public static boolean isLoginPageDisplay() {

        return getDriver().findElement(hdrLogin).isDisplayed();
    }

    public static boolean isUserNameDisplay() {

        return getDriver().findElement(txtUserName).isDisplayed();
    }

    public static boolean isPasswordDisplay() {

        return getDriver().findElement(txtPassword).isDisplayed();
    }

    public static boolean isLoginbuttonDisplay() {

        return getDriver().findElement(btnLogin).isDisplayed();
    }

    public static void setUserName(String userName) {

        getDriver().findElement(txtUserName).sendKeys(userName);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static boolean isLoginAlertDisplay() {
        return getDriver().findElement(alert).isDisplayed();
    }

    public static String getLoginAlert() {
        return getDriver().findElement(alert).getText();
    }


    public static boolean isAddbuttonDisplay() {
        return getDriver().findElement(btnAddEmployee).isDisplayed();
    }

    public static boolean isFnameDispaly() {
        return getDriver().findElement(empFname).isDisplayed();
    }

    public static boolean isMnameDisplay() {
        return getDriver().findElement(empMname).isDisplayed();
    }

    public static boolean isLnameDisplay() {
        return getDriver().findElement(empLname).isDisplayed();
    }

    public static boolean isIdDisplay() {
        return getDriver().findElement(empId).isDisplayed();
    }

    public static boolean isSavebtnDisplay() {
        return getDriver().findElement(btnSave).isDisplayed();
    }

    public static void clickAddEmp() {
        getDriver().findElement(btnAddEmployee).click();
    }

    public static void setEmpFname(String firstname){getDriver().findElement(empFname).sendKeys(firstname);}

    public static void setEmpMname(String middlename){getDriver().findElement(empMname).sendKeys(middlename);}

    public static void setEmpLname(String lastname){getDriver().findElement(empLname).sendKeys(lastname);}

    public static void setEmpid(String id){getDriver().findElement(empId).sendKeys(id);}

    public static void clickSaveEmp()
    {
        getDriver().findElement(btnSave).click();
    }

}