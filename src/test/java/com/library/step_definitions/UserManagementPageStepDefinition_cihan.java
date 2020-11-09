package com.library.step_definitions;

import com.library.pages.UserManagementPage_Cihan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserManagementPageStepDefinition_cihan {

    UserManagementPage_Cihan userManagementPage = new UserManagementPage_Cihan();


    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String string) throws InterruptedException {
        Thread.sleep(3_000);

        userManagementPage.navigateTo(string);
    }



    @When("user enters the {string}")
    public void user_enters_the(String string) throws InterruptedException {
        Thread.sleep(3_000);
        userManagementPage.setSearchBox(string);
    }



    @Then("System should display the search Results")
    public void system_should_display_the_search_results() {

        userManagementPage.checkTableDataInfo();

    }







}
