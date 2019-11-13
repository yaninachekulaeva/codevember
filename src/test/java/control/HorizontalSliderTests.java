package control;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertTrue;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testHorizontalSliderWithArrowKeys() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.selectHorizontalSlider();
        horizontalSliderPage.enterText("" + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        assertTrue(horizontalSliderPage.getValue().equals("1"));
        horizontalSliderPage.enterText("" + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        assertTrue(horizontalSliderPage.getValue().equals("2"));
        horizontalSliderPage.enterText("" + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        assertTrue(horizontalSliderPage.getValue().equals("3"));
        horizontalSliderPage.enterText("" + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        assertTrue(horizontalSliderPage.getValue().equals("4"));
        horizontalSliderPage.enterText("" + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        assertTrue(horizontalSliderPage.getValue().equals("5"));
    }

    @Test
    public void testHorizontalSliderWithDragAndDrop() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.dragHorizontalSlider(-30);
        assertTrue(horizontalSliderPage.getValue().equals("1"));
        horizontalSliderPage.dragHorizontalSlider(-10);
        assertTrue(horizontalSliderPage.getValue().equals("2"));
        horizontalSliderPage.dragHorizontalSlider(10);
        assertTrue(horizontalSliderPage.getValue().equals("3"));
        horizontalSliderPage.dragHorizontalSlider(30);
        assertTrue(horizontalSliderPage.getValue().equals("4"));
        horizontalSliderPage.dragHorizontalSlider(60);
        assertTrue(horizontalSliderPage.getValue().equals("5"));
    }

}
