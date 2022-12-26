package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
public class Day10_FileUpload extends TestBase {
    @Test
    public void fileUploadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
//        1. locate choose file and click choose a file
//        <input type="file">
        WebElement chooseAFileButton = driver.findElement(By.id("file-upload"));
        Thread.sleep(2000);
//        2. select a file from your computer
        String userHOME = System.getProperty("user.home");
        System.out.println("userHOME = " + userHOME);
        String pathOfFile = userHOME + "\\OneDrive\\Masaüstü\\logo.jpeg";
//      Sending the path of the file that I want to upload.
//      we can use send keys cause the input type file combination
        chooseAFileButton.sendKeys(pathOfFile);

//        3. then locate and click upload
        driver.findElement(By.id("file-submit")).click();

//      Asserting
        boolean isEqual = driver.findElement(By.xpath("//h3")).getText().equals("File Uploaded!");
        Assert.assertTrue(isEqual);

    }
}
/*
    How do you upload a file with selenium
    - First selenium has limitation automatin of files. but file upload ccan be done with selenium.
    We locate the choose file button and use sendkeys function to send path of file.
    Then we click upload button to upload the file
    Path of the file shoukd be dynamic-- we use System.getProperty("user.home");

    LIMITATION:
    Selenium has limitation automation  DESKTOP APPS
    For example, we can not find path of files, or verify if file exist on out machines with selenium


 */
