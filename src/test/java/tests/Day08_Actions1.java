package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions1 extends TestBase {

    @Test
    public void rightClickTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/context_menu");
//      When use Right click on the box
//      1. creaating action object to do right click
        Actions actions=new Actions(driver);
//      2. locating the element that Iwant to right click
        WebElement box=driver.findElement(By.id("hot-spot"));

//      3. use action object and oapropriate function to right click
        actions.contextClick(box).perform();

//      Then verify the alert message is "You selected a context menu"
        String text=driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",text);

//      Then accept the alert
        driver.switchTo().alert().accept();



    }


}
