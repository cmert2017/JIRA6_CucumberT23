package com.library.pages;

import com.library.utils.BrowserUtils;
import com.library.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage_Cihan {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);


    public BasePage_Cihan(){
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


    public void navigateTo(String menu){
        String menuPath= "//a[@href='#" + menu + "']";

        WebElement menuElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(menuPath)));

        wait.until(ExpectedConditions.elementToBeClickable(menuElement)).click();

    }




}



