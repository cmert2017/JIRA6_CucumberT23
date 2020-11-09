package com.library.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);


    public static void wait(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void clickOnElement(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public static void visibilityOfElement(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));

    }



    public static void clickWithJS(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        ( (JavascriptExecutor)Driver.getDriver()).executeScript("argument[0].click()",element);

    }

    /**
     * This methods simply inserts the text
     * @param element
     * @param text
     */
    public static void enterText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);

        /**P.I.Q/Challenge: will wait until text is entered: otherwise driver will jump into the next step without completing long text entry */
        wait.until(ExpectedConditions.attributeToBe(element, "value", text));
        System.out.println("Entering text: "+text);

    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


    public static void waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
