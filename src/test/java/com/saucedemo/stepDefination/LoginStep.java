package com.saucedemo.stepDefination;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BasePage {

    LoginPage loginPage = new LoginPage(driver);

    @Given("I navigate to Sauce lab login page")
    public void i_navigate_to_sauce_lab_login_page() {

        System.out.println("    - Navigating to saucelab home page");
        loginPage.navigateToHomePage();


    }
    @When("I enter a valid {string}")
    public void i_enter_a_valid(String string) {

    }

    @When("I click on Login")
    public void i_click_on_login() {

    }

    @Then("Sauce lab user logged in successfully")
    public void sauce_lab_user_logged_in_successfully() {

    }

    @When("I enter a {string}")
    public void i_enter_a(String string) {

    }


    @Then("User not able to login")
    public void user_not_able_to_login() {

    }



















}
