package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_GetPageResource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ulger/Documents/Selenium Depencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //WebDriver driver = new ChromeDriver();//Fatma hanim iki tane driver object kullanamazsiniz ayni class ta
        //driver.manage().window().maximize();
//    Navigate to google homepage
        driver.get("https://www.amazon.com");

        //getPageSource() returns page source code as a string
        //We might use this to verify if a certain text exist in the entire page
        //Note that pageSource is not used a lot to do assertions
        //Because it is too general and can lead false result
        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
//        System.out.println(pageSource.contains("Sign in"));
        if (pageSource.contains("Best Sellers")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}










