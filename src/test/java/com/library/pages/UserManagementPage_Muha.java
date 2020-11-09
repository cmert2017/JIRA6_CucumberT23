package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserManagementPage_Muha extends BasePage_Muha {

    public UserManagementPage_Muha(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;

    //@FindBy(xpath = "//th")
    @FindBy(tagName = "th")
    public List<WebElement> tableHeaders;
}
