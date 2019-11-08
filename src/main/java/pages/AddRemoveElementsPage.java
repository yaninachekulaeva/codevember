package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ychekulaeva
 */

public class AddRemoveElementsPage {

    WebDriver driver;
    private By addElementButton = org.openqa.selenium.By.cssSelector(".example > button");
    private By deleteElementButton = org.openqa.selenium.By.cssSelector("#elements button");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElementButton(){
        clickElement(addElementButton);
    }

    public void clickDeleteButton(){
        clickElement(deleteElementButton);
    }

    public boolean verifyDeleteButtonPresent(){
        return isElementPresent(deleteElementButton);
    }

    private void clickElement(By element){
        driver.findElement(element).click();
    }

    private boolean isElementPresent(By element) {
        try {
            driver.findElement(element);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
