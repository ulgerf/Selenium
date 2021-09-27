package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ReviewVerifyUrlTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
    "C:/Users/ulger/Documents/Selenium Depencies/drivers/chromedriver.exe");


    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");//bu sekilde basina https koymazsaniz sitelere gitmez

    String expectedURL="www.google.com";
    String actualURL=driver.getCurrentUrl();

    if(expectedURL.equals(actualURL)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("expected :" +expectedURL);
        System.out.println("actual :" + actualURL);
    }


driver.close();


}
}