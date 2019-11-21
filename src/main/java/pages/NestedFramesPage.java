package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private By topFrame = By.name("frame-top");
    private By topLeftFrame = By.name("frame-left");
    private By bodyFrame = By.tagName("body");
    private By bottomFrame = By.name("frame-bottom");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchTopFrame() {
        driver.switchTo().frame(driver.findElement(topFrame));
    }

    public void switchLeftTopFrame() {
        switchTopFrame();
        driver.switchTo().frame(driver.findElement(topLeftFrame));
    }

    public void switchBottomFrame() {
        driver.switchTo().frame(driver.findElement(bottomFrame));
    }

    public String getFrameText(){
       String text = driver.findElement(bodyFrame).getText();
       driver.switchTo().defaultContent();
       return text;
    }
}
