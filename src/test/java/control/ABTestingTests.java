package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ABTestingPage;

import static org.testng.Assert.assertTrue;

/**
 * @author ychekulaeva
 */

public class ABTestingTests extends BaseTests {

    @Test
    public void testABTesting(){
        ABTestingPage abTestingPage = homePage.clickABTesting();
        String sPageTitle = homePage.getPageTitle();
        System.out.println(sPageTitle);
        assertTrue(sPageTitle.equals("A/B Test Variation 1") || sPageTitle.equals("A/B Test Control"), "Title text is different!");
        assertTrue(abTestingPage.getABTestingBlockText().contains("Also known as split testing."),
                "Block text is incorrect!");

    }

}
