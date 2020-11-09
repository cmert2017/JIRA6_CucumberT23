package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookModulePage_Muha extends BasePage_Muha{

    @FindBy(tagName = "th")
    public List<WebElement> tableHeaders;

}
