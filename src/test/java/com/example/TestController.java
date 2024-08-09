package com.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestController {
    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        try {
            String driverPath = "/usr/local/bin/geckodriver";
            System.setProperty("webdriver.gecko.driver", driverPath);
            driver = new FirefoxDriver();
        } catch (Exception e) {
            System.err.println("Failed to initialize WebDriver: " + e.getMessage());
        }
        driver.get("http://127.0.0.1:8000");

    }

    @AfterClass(alwaysRun = true)
    public void closeDriver() {
        if (driver != null) {
            driver.close();
        }
    }
}

