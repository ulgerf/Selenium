package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ulger/Documents/Selenium Depencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("Fail");
            System.out.println("expected:" + expectedTitle);
            System.out.println("actual:" + actualTitle);
        }

        String expectedURL="https://www.youtube.com/";
        String actualURL= driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected : "+ expectedURL);
            System.out.println("actual : " +actualURL );
        }


        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().refresh();
        driver.navigate().forward();




  String expectedTitle2="Amazon";
   String actualTitle2= driver.getTitle();
        if (expectedTitle.equals(actualTitle2)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected title is : "+expectedTitle2);
            System.out.println("Corrected ACTUAL : "+actualTitle2);
        }

driver.close();
        }
    }

