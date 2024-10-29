package com.saucedemo.hooks;

import com.saucedemo.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Configuration;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Hook extends BrowserManager {

    @Before
    public void setUp()
    {
        String browser;


        try {
            browser = new Configuration().getPropertiesParameter("browser");
            System.out.println("abc");
            launchBrowser(browser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @After
    public void takeScreenShot(Scenario scenario) {
        try {

            if (scenario.isFailed()) {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                byte[] fileContent = FileUtils.readFileToByteArray(src);
                scenario.attach(fileContent, "image/png", scenario.getName());
                scenario.log("ScreenShot attached");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("I'm closing the browser");
        closeBrowser();

    }





}
