package com.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.pageobjects.LoginPage;
import com.example.pageobjects.OptionsSelectPage;
import com.example.pageobjects.ListPage;
import com.example.pageobjects.ButtonPage;
import com.example.pageobjects.TablePage;

public class AppTest extends TestController {
    private LoginPage loginPage;
    private ListPage listPage;
    private ButtonPage buttonPage;
    private TablePage tablePage;
    private OptionsSelectPage optionsSelectPage;
    private String username = "testUser";
    private String password = "testpassword123";

    @BeforeClass
    public void init() {
        loginPage = new LoginPage(driver);
        listPage = new ListPage(driver);
        buttonPage = new ButtonPage(driver);
        tablePage = new TablePage(driver);
        optionsSelectPage = new OptionsSelectPage(driver);
    }

    @Test(description = "TEST 1")
    public void login() {
        loginPage.login(username, password);
    }

    @Test(description = "TEST 2")
    public void testListElementsNumber() {
        listPage.testListElementsNumber(3);
    }

    @Test(description = "TEST 3")
    public void testDropdownDefaultValue() {
        optionsSelectPage.testDropdownDefaultValue("Option 1");
    }

    @Test(description = "TEST 4")
    public void testButtonStatuses() {
        buttonPage.testButtonStatuses();
    }

    @Test(description = "TEST 5")
    public void testButtonTransitions() {
        buttonPage.testButtonTransitions();
    }

    @Test(description = "TEST 6")
    public void testTableCell() {
        tablePage.testTableCell("Ventosanzap", 2, 2);
    }
}
