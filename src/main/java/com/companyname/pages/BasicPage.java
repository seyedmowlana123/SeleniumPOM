package com.companyname.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicPage extends BasePage{

    By GoogleTextBox = By.xpath("//textarea[@id='APjFqb']");
    By DontSwitchButton = By.xpath("//button[contains(text(),\"Don't switch\")]");
    public BasicPage(WebDriver driver) {
        super(driver);
    }

    public void clickDontSwitchButton() {
        //forceWait(10000);
        waitForElementPresent(DontSwitchButton);
        click(DontSwitchButton);
    }

    public void typeGoogleTextBox(String text) {
        //forceWait(5000);
        waitForElementPresent(GoogleTextBox);
        type(GoogleTextBox, text);
    }
}
