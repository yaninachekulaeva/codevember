package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test (priority = 1)
    public void testJSAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerJSAlert();
        alertsPage.clickAlertOK();
        assertEquals(alertsPage.getResultText(), "You successfuly clicked an alert", "Result text is incorrect!");
    }

    @Test (priority = 2)
    public void testJSConfirm(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerJSConfirm();
        String text = alertsPage.getAlertText();
        alertsPage.clickAlertCancel();
        assertEquals(text, "I am a JS Confirm", "Alert text is incorrect!");
        assertEquals(alertsPage.getResultText(), "You clicked: Cancel", "Result text is incorrect!");
        alertsPage.triggerJSConfirm();
        alertsPage.clickAlertOK();
        assertEquals(alertsPage.getResultText(), "You clicked: Ok", "Result text is incorrect!");
    }

    @Test (priority = 3)
    public void testJSPrompt(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerJSPrompt();
        String text = "Test for getting JS prompt text";
        alertsPage.enterAlertText(text);
        alertsPage.clickAlertOK();
        assertEquals(alertsPage.getResultText(), "You entered: " + text, "Result text is incorrect!");
    }
}
