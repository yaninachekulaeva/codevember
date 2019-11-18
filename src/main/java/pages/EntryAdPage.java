package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {

    private WebDriver driver;
    private By modal = By.id("modal");
    private By modalTitle = By.xpath("//*[@id=\"modal\"]/div[2]/div[1]/h3");
    private By modalClose = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyModal(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(modal);
    }

    public void closeModal(){
        driver.findElement(modalClose).click();
    }

    public String getModalTitle(){
        return driver.findElement(modalTitle).getText();
    }
}
