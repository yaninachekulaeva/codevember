package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPageExample1Page;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingExample1Tests extends BaseTests {

    @Test
    public void testDynamicLoadingEmaple1() {
        DynamicLoadingPageExample1Page dynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingPage.clickStartButton();
        assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "Text is incorrect!");
    }

}
