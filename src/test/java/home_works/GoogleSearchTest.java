package home_works;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearchTest {
    //Create a new class : GoogleSearchTest
    //Create main method and complete the following task.
    //When user goes to https://www.google.com/
    //Search for “porcelain teapot”
    //And print how many related results displayed on Google

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //When user goes to https://www.google.com/
        driver.get("https://www.google.com/");

        //Search for “porcelain teapot”
        WebElement abc=driver.findElement(By.cssSelector("input[class='gLFyf']"));
                abc.sendKeys("porcelain teapot");
                abc.submit();

        //driver.findElement(By.cssSelector("input[class='gNO89b']")).click();

        //And print how many related results displayed on Google
        String relatedResult=driver.findElement(By.id("result-stats")).getText();
        System.out.println(relatedResult);
    }
}
