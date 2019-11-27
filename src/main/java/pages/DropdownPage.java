package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDropdown(int index){
        String script = "arguments[0].value='" + index + "'";
        ((JavascriptExecutor)driver).executeScript(script, driver.findElement(dropdown));
    }

    public String getDropdownText(){
        Select select = new Select(driver.findElement(dropdown));
        WebElement selected = select.getFirstSelectedOption();
        return selected.getText();
    }
}
