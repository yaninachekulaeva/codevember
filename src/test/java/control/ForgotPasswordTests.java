package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;

/**
 * @author ychekulaeva
 */

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("test@test.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertEquals(emailSentPage.getSentMessage(), "Your e-mail's been sent!", "Message text is incorrect!");
    }

}
