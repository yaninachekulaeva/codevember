package control;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {


    @Test(priority = 1)
    public void testTab(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("TEST1 " + Keys.TAB);
        assertEquals(keyPage.getResult(), "You entered: TAB");
    }

    @Test(priority = 2)
    public void testShift(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("TEST2 " + Keys.SHIFT);
        assertEquals(keyPage.getResult(), "You entered: SHIFT");
    }

    @Test(priority = 3)
    public void testCtrl(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("TEST3 " + Keys.CONTROL);
        assertEquals(keyPage.getResult(), "You entered: CONTROL");
    }

    @Test(priority = 4)
    public void testAlt(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("TEST4 " + Keys.ALT);
        assertEquals(keyPage.getResult(), "You entered: ALT");
    }

    @Test(priority = 5)
    public void testBackSpace(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("TEST5 " + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test(priority = 6)
    public void testPi(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals(keyPage.getResult(), "You entered: 4");
    }
}
