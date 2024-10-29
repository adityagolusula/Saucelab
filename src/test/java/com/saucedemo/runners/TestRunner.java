package com.saucedemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/saucedemo/features"},

        glue     = {"src/test/java/com/saucedemo/stepDefination",
                    "src/test/java/com/saucedemo/hooks"},


        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true


)


 
public class TestRunner {


}
