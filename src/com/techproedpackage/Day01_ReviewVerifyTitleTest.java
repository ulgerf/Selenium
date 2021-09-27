package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ReviewVerifyTitleTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
        "C:/Users/ulger/Documents/Selenium Depencies/drivers/chromedriver.exe/");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String expectedTitle="www.google.com";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equals(driver.getTitle())){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expected :" +expectedTitle);
            System.out.println("actual: " +actualTitle);
        }
          driver.close();

    }




}
