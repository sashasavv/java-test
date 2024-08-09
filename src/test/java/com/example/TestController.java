package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestController {
    protected WebDriver driver;

    @Parameters({"env", "webdriver.path"})
    @BeforeClass(alwaysRun = true)
    public void setUp(String env, String webdriverPath) {
        System.out.println("Running tests in " + env + " environment");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        options.addArguments("--no-sandbox");
        System.setProperty("webdriver.gecko.driver", webdriverPath);
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

