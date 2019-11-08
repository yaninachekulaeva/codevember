package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

import static org.testng.Assert.*;

/**
 * @author ychekulaeva
 */

public class AddRemoveElementsTests extends BaseTests {

    @Test
    public void testAddRemoveElements(){
        AddRemoveElementsPage addRemoveElementsPage = homePage.clickAddRemoveElements();
        addRemoveElementsPage.clickAddElementButton();
        assertTrue(addRemoveElementsPage.verifyDeleteButtonPresent(), "Delete button is not present!");
        addRemoveElementsPage.clickDeleteButton();
        assertFalse(addRemoveElementsPage.verifyDeleteButtonPresent(), "Delete button is present!");
    }

}
