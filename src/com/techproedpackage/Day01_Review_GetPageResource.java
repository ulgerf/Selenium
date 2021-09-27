package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Review_GetPageResource {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ulger/Documents/Selenium Depencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http:www.amazon.com");

String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        System.out.println(pageSource.contains("sign in"));
    if(pageSource.contains("Best sellers")) {

        System.out.println("PASS");


    }else{
        System.out.println("FAIL");
    }
    driver.close();





    }
}
