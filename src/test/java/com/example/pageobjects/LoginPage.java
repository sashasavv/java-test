package com.example.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "inputEmail")
    WebElement inputEmail;

    @FindBy(id = "inputPassword")
    WebElement inputPassword;

    @FindBy(css = "button[type=submit]")
    WebElement signInBtn;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        Assert.assertTrue(inputEmail.isDisplayed(), "inputEmail element is not displayed on the page");
        Assert.assertTrue(inputPassword.isDisplayed(), "inputPassword element is not displayed on the page");
        inputEmail.clear();
        inputEmail.sendKeys(username);
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }
}
