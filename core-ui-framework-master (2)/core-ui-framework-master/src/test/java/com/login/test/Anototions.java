package com.login.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anototions {
    @BeforeClass
    public void beforeClass(){
        System.out.println("This beforeClass method");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("This before method");
    }
    @Test
    public void testmethod(){
        System.out.println("This Test method");
    }
    @Test
    public void testmethod2(){
        System.out.println("This Test method 2");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("This after method ");
    }
}
