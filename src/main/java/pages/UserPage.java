package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

    private WebDriver driver;
    private By titlePage = By.tagName("h1");

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(titlePage).getText();
    }

}
