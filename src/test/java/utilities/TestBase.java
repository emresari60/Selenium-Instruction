package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class TestBase {
    protected static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        //driver.quit();
    }

    //AUTO COMPLETE REUSABLE METHOD
    //THIS CODE IS USED FOR SELECTING AND VERIFIYING OUR APP AUTO COMPLETE SEARCH FUNCTIONALITY
    //NOTE: THIS REUSABLE METHOD DESIGNED FOR OUR CURRENT PROJECT. THIS MAY NOT WORK FOR NEW PROJECT, BUT WE CAN BE MODIFIED AND USED FOR THAT NEW PROJECT
    //NOTE: YOU WILL SEE THIS KIND OF REUSABLE METHOD THAT IS SPECIFIC TO YOUR OWN PROJECT
    //THE POINT OF REUSABLE METHOD IS: WRITE ONCE USE MULTIPLE TIMES TO SAVE TIMEAND SHORT  TEST CLASSES
    public static void searchAndSelectFromList(String keyword,String textFromList){

        //Sending a KEYWORD DYNAMICALLY using PARAMETER 1
        driver.findElement(By.id("myCountry")).sendKeys(keyword);

        //Selecting an option from list DYNAMICALLY using PARAMETER 2
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='"+textFromList+"']")).click();

        //Nothing special. Just clicking on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();

        //Verifying if result contains my option that i selected DYNAMICALLY using PARAMETER 2
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains(textFromList));
    }

    //TAKE SCREENSHOT OF ENTIRE PAGE WITH THIS REUSABLE METHOD
    public void  takeScreenshotOfPage() throws IOException {
        //1. Take screenshot using  getScreenshotAs method and TakeScreenshot API-coming from selenium
        File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //2. Save the screenshot in a path and save with dynamic name
        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());//getting the current local date

        String path=System.getProperty("user.dir")+"/test-output/Screenshots/"+currentTime+".png";

        FileUtils.copyFile(image,new File(path));


    }



}
