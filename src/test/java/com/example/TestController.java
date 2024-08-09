package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestController {
    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        String driverPath = "/usr/local/bin/geckodriver";

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        options.addArguments("--no-sandbox");
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver(options);

        driver.get("http://127.0.0.1:8000");
    }

    @AfterClass(alwaysRun = true)
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

