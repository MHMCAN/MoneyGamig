package com.moneyGaming.tests;

import com.moneyGaming.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
    @BeforeMethod
    public  void setup(){


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void test(){

    }

    @AfterMethod

    public void tearDown(){

    }
}
