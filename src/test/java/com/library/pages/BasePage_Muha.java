package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage_Muha {

    public BasePage_Muha(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(linkText = "Users")
    public WebElement usersPageLinkk;

    @FindBy(linkText = "Books")
    public WebElement booksPageLinkk;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLinkk;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement accountUsername;
}
