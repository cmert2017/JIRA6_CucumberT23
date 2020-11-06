package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserManagementPage extends BasePage{

    Select select;

    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;

    //@FindBy(xpath = "//th")
    @FindBy(tagName = "th")
    public List<WebElement> tableHeaders;

    @FindBy(id = "user_count")
    public WebElement userCount;



}
