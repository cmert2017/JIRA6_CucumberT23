package com.library.step_definitions;

import com.library.pages.BookSearchPage_Ivana;
import com.library.pages.LoginPage;
import com.library.utils.BrowserUtils;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class BookSearchPageStepDefinitions_Ivana {


    BookSearchPage_Ivana bookSearchPage = new BookSearchPage_Ivana();
    LoginPage loginPage = new LoginPage();

    @Given("As a Librarian member")
    public void as_a_librarian_member() {
        Driver.getDriver().get(ConfigurationReader.getProperty("LibraryURL"));
        loginPage.login();
    }

    @When("I click on a Book Category dropdown")
    public void i_click_on_a_book_category_dropdown() {

        bookSearchPage.booksPageLink.click();
        bookSearchPage.booksModule.click();
        BrowserUtils.clickOnElement(bookSearchPage.bookCategories);
        bookSearchPage.bookCategories.click();


    }
    @When("I select one genre")
    public void i_select_one_genre() {

        Select select = new Select(bookSearchPage.selection);
        select.selectByVisibleText("Humor");
        bookSearchPage.selection.click();

    }
    @Then("I should be able to search for any book by category")
    public void i_should_be_able_to_search_for_any_book_by_category() {
        Assert.assertTrue(bookSearchPage.selection.isDisplayed());

    }












}
