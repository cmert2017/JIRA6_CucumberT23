package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookSearchPage extends BasePage{

    public BookSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='col-md-6']")
    public WebElement bookCategories;

    @FindBy(xpath = "//select[@id='book_categories']")
    public  WebElement selection;










}
