package com.library.pages;

import com.library.utils.BrowserUtils;
import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage_Ivana {

    public BasePage_Ivana(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/head/title")
    private WebElement pageTitle;

    @FindBy(linkText = "Users")
    private WebElement usersPageLink;

    @FindBy(linkText = "Books")
    private WebElement booksPageLink;

    @FindBy(linkText = "Dashboard")
    private WebElement dashboardPageLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    private WebElement accountUsername;

    @FindBy(xpath = "//*[@id='books']/div[1]/div[1]/span/a")
    private WebElement addBook;



    public String getPageTitleText() {
        return pageTitle.getText();
    }

    public void usersPageLink(){
        BrowserUtils.clickOnElement(usersPageLink);
    }

    public void booksPageLink(){
        BrowserUtils.clickOnElement(booksPageLink);
    }
    public void dashboardPageLink(){
        BrowserUtils.clickOnElement(dashboardPageLink);
    }
    public void accountUsername(){
        BrowserUtils.clickOnElement(accountUsername);
    }

    public void addBooksButton(){
        BrowserUtils.clickOnElement(addBook);
    }




}



