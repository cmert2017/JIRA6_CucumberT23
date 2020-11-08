package com.library.step_definitions;

import com.library.pages.UserManagementPage;
import com.library.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserManagementPageStepDefinitions_muha {

    UserManagementPage userManagementPage = new UserManagementPage();
    Select select;

    @When("user click on {string} link")
    public void i_click_on_link(String link) {
        BrowserUtils.waitForVisibility(userManagementPage.dashboardPageLink, 5);

        switch (link.toLowerCase()){
            case "dashboard":
                userManagementPage.dashboardPageLink.click();
                break;
            case "users":
                userManagementPage.usersPageLink.click();
                break;
            case "books":
                userManagementPage.booksPageLink.click();
                break;
        }
    }


    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        BrowserUtils.waitForVisibility(userManagementPage.showRecordsDropdown, 5);
        select = new Select(userManagementPage.showRecordsDropdown);
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected+"", actual);

    }



    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> options) {

        select = new Select(userManagementPage.showRecordsDropdown);
        List<WebElement> webElements = select.getOptions();
        List<String> actualTexts = BrowserUtils.getElementsText(webElements);

        Assert.assertEquals(options, actualTexts);


    }



}
