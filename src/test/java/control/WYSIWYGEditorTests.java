package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditorTests extends BaseTests {

    @Test(priority = 1)
    public void testWYSIWYGEditor(){
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickWYSIWYGEditor();
        wysiwygEditorPage.clearTextArea();
        String text = "Test WYSIWYG Editor";
        wysiwygEditorPage.setTextArea(text);
        wysiwygEditorPage.selectTextArea();
        wysiwygEditorPage.clickBold();
        assertEquals(wysiwygEditorPage.getTextArea(), text, "Text from textarea is incorrect!");
    }

}
