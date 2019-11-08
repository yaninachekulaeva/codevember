package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ychekulaeva
 */

public class ABTestingPage {

    WebDriver driver;
    private By abTestingTextBlock = By.xpath("//div[@class='example']/p");

    public ABTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getABTestingBlockText(){
        return driver.findElement(abTestingTextBlock).getText();
    }

}
