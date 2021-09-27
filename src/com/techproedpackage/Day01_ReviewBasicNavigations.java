package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ReviewBasicNavigations {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:/users/ulger/Documents/Selenium Depencies/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("htpp://www.google.com/");
        driver.get("htpp:// www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("http://www.amazon.com/");
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
        driver.quit();


    }
}
