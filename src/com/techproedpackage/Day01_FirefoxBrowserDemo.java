package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day01_FirefoxBrowserDemo {

        public static void main(String[] args) {
//    Set Path
            System.setProperty("webdriver.chrome.driver",
                    "C:/Users/ulger/Documents/Selenium Depencies/drivers/geckodriver.exe");
            //windows -> C:\\techproed\\Documents\\selenium libraries\\drivers\\geckodriver.exe
//    Create gecko driver
            WebDriver driver = new FirefoxDriver();
//    Open google home page https://www.google.com/

            //ALL OTHER COMMENDS ARE THE SAME FOR ALL BROWSER TYPES
            driver.get("https://www.google.com/");
//    Maximize the window
            driver.manage().window().maximize();
//    Close/Quit the browser
            driver.close();
        }

    }



