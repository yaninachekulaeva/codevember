package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFrames(){
        NestedFramesPage nestedFramesPage = homePage.clickNestedFrames();
        nestedFramesPage.switchLeftTopFrame();
        assertEquals(nestedFramesPage.getFrameText(), "LEFT", "Left top frame text is incorrect!");
        nestedFramesPage.switchBottomFrame();
        assertEquals(nestedFramesPage.getFrameText(), "BOTTOM", "Bottom frame text is incorrect!");
    }
}
