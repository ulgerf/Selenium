package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ulger/Documents/Selenium Depencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }
}