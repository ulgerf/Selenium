package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Review_FirstSeleniumClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/users/ulger/Documents/Selenium Depencies/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("htpp://www.google.com");

    }
}
