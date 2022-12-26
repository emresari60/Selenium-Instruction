package home_works;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonSearch {
    //Create a new class: AmazonSearch
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");

        //TC01_As user I want to know how many item are there on amazon in the first page after I search “porcelain teapot”?
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("porcelain teapot");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //driver.findElement(By.xpath("//div[@class='rush-component s-latency-cf-section']"))
        String result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText().substring(2,4);
        System.out.println("Total Items = " + result);  

        //TC02_Order the the tea pot prices, find the min, max, and average price to the nearest cent.

    }



}
