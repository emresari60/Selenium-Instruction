package tests;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions3 extends TestBase {
    @Test
    public void pageDownTest() throws InterruptedException {

        driver.get("https://www.techproeducation.com");

        Actions actions=new Actions(driver);
        //sendKeys(Keys.PAGE_DOWN) is used to scroll the page dowm
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);

        // CHAIN METHOD
        // .build() is recommended ro be used when we chain multiple commends to make sure the connection is strong.
        //  .perform() is used to when there is single or multiple commends to execute the action
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();

        Thread.sleep(3000);
        //ARROW DOWN = SCROLL DOWN A LITTLE BIT. THIS SCROLLS LESS THAN PAGE DOWN
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);

        // PAGE_UP=SCROLL UP
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);

        //ARROW UP= SCROLL UP LİTTLE BIT
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(3000);
    }



}
