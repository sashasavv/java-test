package com.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestController {
    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        String driverPath = System.getProperty("user.dir") + "/bin/geckodriver";
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get("http://localhost:8000");
    }

    @AfterClass(alwaysRun = true)
    public void closeDriver() {
        driver.close();
    }
}

