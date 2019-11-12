package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;
import pages.UserPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTests  extends BaseTests {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed!");
        assertEquals(caption.getTitle(), "name: user1", "Title is incorrect!");
        assertEquals(caption.getLinkText(), "View profile", "Link text is incorrect!");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is incorrect!");
        UserPage userPage = hoversPage.clickLink(caption.getLinkText());
        assertEquals(userPage.getTitle(), "Not Found", "Title is incorrect!");
    }

    @Test
    public void testHoverUser2(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(2);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed!");
        assertEquals(caption.getTitle(), "name: user2", "Title is incorrect!");
        assertEquals(caption.getLinkText(), "View profile", "Link text is incorrect!");
        assertTrue(caption.getLink().endsWith("/users/2"), "Link is incorrect!");
        UserPage userPage = hoversPage.clickLink(caption.getLinkText());
        assertEquals(userPage.getTitle(), "Not Found", "Title is incorrect!");
    }

    @Test
    public void testHoverUser3(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(3);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed!");
        assertEquals(caption.getTitle(), "name: user3", "Title is incorrect!");
        assertEquals(caption.getLinkText(), "View profile", "Link text is incorrect!");
        assertTrue(caption.getLink().endsWith("/users/3"), "Link is incorrect!");
        UserPage userPage = hoversPage.clickLink(caption.getLinkText());
        assertEquals(userPage.getTitle(), "Not Found", "Title is incorrect!");
    }

}
