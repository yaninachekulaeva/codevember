package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ychekulaeva
 */

public class HomePage {

    private WebDriver driver;
    private By pageTitle = By.xpath("//*[@id='content']/div/h3");
    private By abTestingLink = By.linkText("A/B Testing");
    private By addRemoveElementsLink = By.linkText("Add/Remove Elements");
    private By forgotPasswordLink = By.linkText("Forgot Password");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ABTestingPage clickABTesting(){
        clickLink(abTestingLink);
        return new ABTestingPage(driver);
    }

    public AddRemoveElementsPage clickAddRemoveElements(){
        clickLink(addRemoveElementsLink);
        return new AddRemoveElementsPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink(forgotPasswordLink);
        return new ForgotPasswordPage(driver);
    }

    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }

    private void clickLink(By element){
        driver.findElement(element).click();
    }

}
