package com.companyname.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    //By GoogleTextBox = By.xpath("//textarea[@id='APjFqb']");

    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.edge.driver", "C:\\GIT-Workspaces\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //driver.findElement(GoogleTextBox).sendKeys("Hi Google");
    }
    //@AfterMethod
    public void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
}
