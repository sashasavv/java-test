package com.example.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ListPage {
    WebDriver driver;

    @FindBy(css = "ul.list-group")
    WebElement listGroup;

    public ListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void testListElementsNumber(Integer number) {
        List<WebElement> listItems = listGroup.findElements(By.tagName("li"));
        Assert.assertEquals(listItems.size(), number, "The unordered list does not have expected number of list items");
    }
}
