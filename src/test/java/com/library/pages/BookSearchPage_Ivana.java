package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookSearchPage_Ivana extends BasePage_Ivana {

    public BookSearchPage_Ivana(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='col-md-6']")
    public WebElement bookCategories;

    @FindBy(xpath = "//select[@id='book_categories']")
    public  WebElement selection;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement booksModule;

    public void setBookCategories(){
        booksPageLink.click();
        booksModule.click();
    }










}
