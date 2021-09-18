package com.moneyGaming.tests;

import com.moneyGaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

    WebDriver driver;

    @BeforeMethod
    public  void setup() throws InterruptedException {


        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

        Thread.sleep(2000);
    }

    @Test
    public void test() throws InterruptedException {
      WebElement nameBox= driver.findElement(By.cssSelector("#forname"));
      nameBox.sendKeys("Mike");

      WebElement surnameBox=driver.findElement(By.xpath("//input[@name='map(LastName)']"));
        surnameBox.sendKeys("Smith");


        Thread.sleep(3000);




    }

    @AfterMethod

    public void tearDown(){
        driver.close();
    }
}
