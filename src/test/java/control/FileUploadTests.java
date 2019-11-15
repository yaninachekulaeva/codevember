package control;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploaderPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploaderPage fileUploaderPage = homePage.clickFileUpload();
        fileUploaderPage.uploadFile("D:\\Desktop\\Selenium\\codevember\\src\\main\\resources\\chromedriver.exe");
        assertEquals(fileUploaderPage.getUploadedFiles(),"chromedriver.exe","Text is incorrect!");
    }
}
