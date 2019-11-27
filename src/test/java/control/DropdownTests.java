package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;


public class DropdownTests  extends BaseTests {

    @Test
    public void testDropdown(){
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.selectDropdown(1);
        assertEquals(dropdownPage.getDropdownText(), "Option 1");
        dropdownPage.selectDropdown(2);
        assertEquals(dropdownPage.getDropdownText(), "Option 2");
    }
}
