package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    WebDriver driver;
    private By emailField = By.name("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String sEmail){
        driver.findElement(emailField).sendKeys(sEmail);
    }

    public EmailSentPage clickRetrievePasswordButton(){
        clickElement(retrievePasswordButton);
        return new EmailSentPage(driver);
    }

    private void clickElement(By element){
        driver.findElement(element).click();
    }


}
