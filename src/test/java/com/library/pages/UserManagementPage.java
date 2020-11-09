package com.library.pages;

import com.library.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserManagementPage extends BasePage_Cihan {
    Select select;

    @FindBy(xpath = "//input[@class='form-control input-sm input-small input-inline']")
    private WebElement searchBox;
    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody/tr/td[2]")
    private List<WebElement> userIDs;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody/tr/td[3]")
    private  List<WebElement> fullName;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody/tr/td[4]")
    private  List<WebElement> email;


    @FindBy(xpath="//div[contains(text(),'Showing 1 to 1 of ')]")
    private WebElement tableDataInfo;

    public void setSearchBox(String searchValue){

        if(searchValue.equalsIgnoreCase("UserID")){
            //System.out.println(userIDs);
            System.out.println(userIDs.get(0));
            searchValue = userIDs.get(0).getText();

        }else if (searchValue.equalsIgnoreCase("FullName")){
            searchValue = fullName.get(0).getText();

        }else if (searchValue.equalsIgnoreCase("Email")){
            searchValue = email.get(0).getText();

        }

        searchBox.sendKeys(searchValue);

    }



    public void checkTableDataInfo(){


        wait.until(ExpectedConditions.visibilityOf(tableDataInfo));

        Assert.assertTrue(tableDataInfo.isDisplayed());

    }

    public void searchOmer(String link){

        BrowserUtils.waitForVisibility(dashboardPageLink, 5);


        switch (link.toLowerCase()){
            case "dashboard":
                dashboardPageLink.click();
                break;
            case "users":
               usersPageLink.click();
                break;
            case "books":
              booksPageLink.click();
                break;
        }
    }
    public void selectOmer(){

        BrowserUtils.waitForVisibility(showRecordsDropdown, 5);
        select = new Select(showRecordsDropdown);
    }


}
