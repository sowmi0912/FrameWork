package com.orangehrm.test;

import com.orangehrm.DashboardPage;
import com.orangehrm.LoginPage;
import controllers.MethodBase;
import controllers.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    @Test
    public void VerifyloginTest() throws InterruptedException {
        softAssert = new SoftAssert();
        Thread.sleep(2000);
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Display");
        softAssert.assertTrue(LoginPage.isUserNameDisplay(), "Login username is not Display");
        LoginPage.setUserName("Admin");
        softAssert.assertTrue(LoginPage.isPasswordDisplay(), "Login Password is not Display");
        LoginPage.setPassword("admin123");
        softAssert.assertTrue(LoginPage.isLoginbuttonDisplay(), "Login button is not Display");
        LoginPage.clickLogin();

        softAssert.assertTrue(LoginPage.isAddbuttonDisplay(), "ok");
        LoginPage.clickAddEmp();
        softAssert.assertTrue(LoginPage.isFnameDispaly(), "ok");
        LoginPage.setEmpFname("Jegan");
        softAssert.assertTrue(LoginPage.isMnameDisplay(), "ok");
        LoginPage.setEmpMname("Supa");
        softAssert.assertTrue(LoginPage.isLnameDisplay(), "ok");
        LoginPage.setEmpLname("Sowmi");
        softAssert.assertTrue(LoginPage.isIdDisplay(), "ok");
        LoginPage.setEmpid("1209");
        softAssert.assertTrue(LoginPage.isSavebtnDisplay(),"Save button is not display");
        LoginPage.clickSaveEmp();
        softAssert.assertTrue(DashboardPage.isDashboardPageDisplay(), "Dashboard page is not Display");
        softAssert.assertAll();
    }
/* @Test
    public void VerifyEmpCreate() throws InterruptedException
    {
        softAssert = new SoftAssert();
        Thread.sleep(5000);
        softAssert.assertTrue(LoginPage.isAddbuttonDisplay(), "ok");
        LoginPage.clickAddEmp();
        softAssert.assertTrue(LoginPage.isFnameDispaly(), "ok");
        softAssert.assertTrue(LoginPage.isMnameDisplay(), "ok");
        softAssert.assertTrue(LoginPage.isLnameDisplay(), "ok");
        softAssert.assertTrue(LoginPage.isIdDisplay(), "ok");
        softAssert.assertAll();
    }
*/
//    @Test
//    public void VerifyMethodbaseloginTest() {
//        softAssert = new SoftAssert();
//        softAssert.assertTrue(    MethodBase.isDisplayed_ById("logInPanelHeading"),"Login Page is not Display");
//        MethodBase.setText_ByID("txtUsername","Admin");
//        MethodBase.setText_ByID("txtPassword","admin123");
//        MethodBase.click_ById("btnLogin");
//      //  MethodBase.isDisplayed_ByXpath("//h1");
//        MethodBase.assertEqual_Text_ByXpath("//h1","Dashboard");
//        softAssert.assertAll();
//
//    }
}