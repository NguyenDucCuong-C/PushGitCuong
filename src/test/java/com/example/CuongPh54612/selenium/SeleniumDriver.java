package com.example.CuongPh54612.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {
    private WebDriver webDriver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }


    @Test
    void stepUp() throws InterruptedException {
        webDriver.get("https://github.com/");

        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("duccuongkun@gmail.com");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("029927182cuong");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]")).click();


    }
}
