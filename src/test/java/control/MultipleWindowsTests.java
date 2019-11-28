package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MultipleWindowsPage;

public class MultipleWindowsTests extends BaseTests {

    @Test
    public void testMultipleWindows(){
        MultipleWindowsPage multipleWindowsPage = homePage.clickMultipleWindows();
        multipleWindowsPage.clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
