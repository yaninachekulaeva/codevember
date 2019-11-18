package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdPage;

import static org.testng.Assert.assertEquals;


public class EntryAdTests extends BaseTests {

    @Test
    public void testEntryAd() {
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        entryAdPage.verifyModal();
        assertEquals(entryAdPage.getModalTitle(), "THIS IS A MODAL WINDOW", "Title is incorrect!");
        entryAdPage.closeModal();
    }
}
