package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class InfiniteScrollTests extends BaseTests {

    @Test
    public void testInfiniteScroll(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(20);
    }
}
