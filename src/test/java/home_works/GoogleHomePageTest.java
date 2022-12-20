package home_works;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//Then create 3 different test methods using the following names. And Go to google.
//titleTest =>Verify if google title = “Google”
//imageTest => Verify if google image displays or not
//gmailLinkTest => Verify if the Gmail link is displayed or not
//Close the browser after each test
public class GoogleHomePageTest {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void titleTest(){
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle="Google";
        Assert.assertEquals("TITLE IS NOT'Google'",expectedTitle,actualTitle);
    }

    @Test
    public void imageTest(){
    WebElement googleImage=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
    Assert.assertTrue(googleImage.isDisplayed());
    }

    @Test
    public void gmailLinkTest(){
    WebElement gmailLink=driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));
    Assert.assertTrue(gmailLink.isDisplayed());
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
