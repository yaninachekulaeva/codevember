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
    private By hoversLink = By.linkText("Hovers");
    private By keysLink = By.linkText("Key Presses");
    private By horizontalSliderLink = By.linkText("Horizontal Slider");
    private By javaScriptAlertsLink = By.linkText("JavaScript Alerts");

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

    public HoversPage clickHovers(){
        clickLink(hoversLink);
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink(keysLink);
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink(horizontalSliderLink);
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink(javaScriptAlertsLink);
        return new AlertsPage(driver);
    }

    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }

    private void clickLink(By element){
        driver.findElement(element).click();
    }

}
