package com.example.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OptionsSelectPage {

    WebDriver driver;

    @FindBy(id = "dropdownMenuButton")
    WebElement dropdownMenuButton;

    public OptionsSelectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void testDropdownDefaultValue(String value) {
        String actualValue = dropdownMenuButton.getText();
        Assert.assertEquals(actualValue, value, "The dropdown does not have the expected default value");
    }
}
