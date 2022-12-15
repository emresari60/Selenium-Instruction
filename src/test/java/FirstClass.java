import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
//      1. Set up chrome driver
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");

//      2. Create chrome driver
        WebDriver driver=new ChromeDriver();

//      3. now that ve created webdriver, we can automate web application
        driver.get("https://techproeducation.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
