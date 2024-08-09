package com.example.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ButtonPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[text()='Test 4']/following-sibling::button[1]")
    WebElement firstButton;

    @FindBy(xpath = "//h1[text()='Test 4']/following-sibling::button[2]")
    WebElement secondButton;

    @FindBy(id = "test5-button")
    WebElement loadingButton;

    @FindBy(id = "test5-alert")
    WebElement buttonAlert;

   
    public ButtonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void testButtonStatuses() {
        Assert.assertTrue(firstButton.isEnabled(), "The first button is not enabled");
        Assert.assertFalse(secondButton.isEnabled(), "The second button is not disabled");
    }

    public void testButtonTransitions() {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loadingButton));
        loadingButton.click();
        Assert.assertTrue(buttonAlert.isDisplayed(), "Button is not displayed");
        String buttonAlertText = buttonAlert.getText();
        Assert.assertEquals(buttonAlertText, "You clicked a button!", "The button alert does not have expected text");
        Assert.assertFalse(loadingButton.isEnabled(), "The button is not disabled");
    }
}
