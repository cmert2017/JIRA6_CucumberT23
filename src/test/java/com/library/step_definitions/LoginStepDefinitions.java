package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {


    LoginPage loginPage = new LoginPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.getProperty("LibraryURL");
        Driver.getDriver().get(url);
    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login();
    }

    @Then("Dashboard should be displayed")
    public void Dashboard_should_be_displayed() {

        String expected = "dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();

    }

    @When("user log in as a {string}")
    public void user_log_in_as_a(String string) {

        loginPage.login("student");
    }

    @Then("Books should be displayed")
    public void Books_should_be_displayed() {

        String expected = "books";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();
    }


}
