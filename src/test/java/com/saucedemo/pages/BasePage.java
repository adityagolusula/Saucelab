package com.saucedemo.pages;

import com.saucedemo.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Configuration;
import utils.Environment;

import java.io.IOException;

public class BasePage extends DriverManager {
    public static String BASE_URL;

    private static String url()
    {
        try {
            if(new Environment().specifiedEnvironment() == null)
            {
                BASE_URL = new Configuration().getPropertiesParameter("prodUrl");
                System.out.println(BASE_URL);
            } else
            {
                BASE_URL = new Environment().specifiedEnvironment();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BASE_URL;
    }


    public static void launchUrl()
    {
        driver.navigate().to(url());
    }

    public void waitForElementToBeClickable(WebElement element)
    {
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}