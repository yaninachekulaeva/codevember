package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerJSAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerJSConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerJSPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public String getResultText(){
        return driver.findElement(result).getText();
    }

    public void clickAlertOK(){
        driver.switchTo().alert().accept();
    }

    public void clickAlertCancel(){
        driver.switchTo().alert().dismiss();
    }

    public void enterAlertText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

}
