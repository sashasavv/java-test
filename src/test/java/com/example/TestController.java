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
            String driverPath = System.getProperty("user.dir") + "/bin/geckodriver";
            System.setProperty("webdriver.gecko.driver", driverPath);
            driver = new FirefoxDriver();
        } catch (Exception e) {
            System.err.println("Failed to initialize WebDriver: " + e.getMessage());
            e.printStackTrace();
        }
        driver.get("http://127.0.0.1:8000");
    }

    @AfterClass(alwaysRun = true)
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

