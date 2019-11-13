package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.xpath("//*[@id=\"content\"]/div/div/input");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectHorizontalSlider(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(horizontalSlider)).perform();
    }

    public void enterText(String text){
        driver.findElement(horizontalSlider).sendKeys(text);
    }

    public void dragHorizontalSlider(int xOffset){
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(horizontalSlider), xOffset, 0).perform();
    }

    public String getValue(){
        return driver.findElement(range).getText();
    }


}
