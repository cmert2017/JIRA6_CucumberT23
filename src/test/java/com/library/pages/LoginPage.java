package com.library.pages;

import com.library.utils.BrowserUtils;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  BasePage{


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement usernameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    public void login(String usernameValue, String passwordValue) {
        usernameInput.sendKeys(usernameValue);
        passwordInput.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login() {
        String usernameValue = ConfigurationReader.getProperty("librarian");
        String passwordValue = ConfigurationReader.getProperty("librarianPD");

        usernameInput.sendKeys(usernameValue);
        passwordInput.sendKeys(passwordValue, Keys.ENTER);
    }


    public void login(String role) {
        String usernameValue = "";
        String passwordValue = "";

        if (role.equalsIgnoreCase("librarian")) {
            usernameValue = ConfigurationReader.getProperty("librarian");
            passwordValue = ConfigurationReader.getProperty("librarianPD");
        } else {
            usernameValue = ConfigurationReader.getProperty("student");
            passwordValue = ConfigurationReader.getProperty("student_pass");
        }

        BrowserUtils.visibilityOfElement(usernameInput);


        usernameInput.sendKeys(usernameValue);
        passwordInput.sendKeys(passwordValue, Keys.ENTER);
    }

}



