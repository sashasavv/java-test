package com.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TablePage {
    WebDriver driver;

    @FindBy(tagName =  "table")
    private WebElement table;
   
    public TablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void testTableCell(String expectedValue, int row, int col) {
        WebElement cell = table.findElement(By.xpath(".//tr[" + (row + 1) + "]/td[" + (col + 1) + "]"));
        String cellValue = cell.getText();
        Assert.assertEquals(cellValue, expectedValue, "Cell value does not match");
    }
}
