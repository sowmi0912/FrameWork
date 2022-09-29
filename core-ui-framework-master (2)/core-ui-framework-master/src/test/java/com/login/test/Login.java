package com.login.test;

import controllers.MethodBase;


import controllers.TestBase;
import org.testng.annotations.Test;

public class Login extends TestBase {
    @Test
    public void logintest(){
        MethodBase.setText_ByXpath("//*[@id=\"txtUsername\"]","Admin");
        MethodBase.setText_ByXpath("//*[@id=\"txtPassword\"]","admin123");
        MethodBase.click_ById("btnLogin");
    }
    @Test
    public void logintest2(){
        MethodBase.setText_ByXpath("//*[@id=\"txtUsername\"]","Admin");
        MethodBase.setText_ByXpath("//*[@id=\"txtPassword\"]","admin123");
        MethodBase.click_ById("btnLogin");
    }
    @Test
    public  void loingtest3(){
        MethodBase.sendkey("XPATH","//*[@id=\"txtUsername\"]","Admin");
        MethodBase.sendkey("XPATH","//*[@id=\"txtPassword\"]","admin123");
       MethodBase.clicked("XPATH","//*[@id=\"txtPassword\"]");

}
}
