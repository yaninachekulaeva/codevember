package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeAndDeepDOMPage;


public class LargeAndDeepDOMTests extends BaseTests {

    @Test
    public void testLargeAndDeepDOM(){
        LargeAndDeepDOMPage largeAndDeepDOMPage = homePage.clickLargeAndDeepDOM();
        largeAndDeepDOMPage.scrollToTable();
    }
}
