package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day09_Actions4 extends TestBase {

    @Test
    public void dragAndDropTest(){
        driver.get("https://jqueryui.com/droppable/");
        //and user moves the target element (Drag me to my target) in to destination (Drop here)

        //Below elements are in the iframes so switch to iframe first
        driver.switchTo().frame(0);//switching to the first index iframe
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        //user Actions class to move source into target
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void clickAndHoldTest(){
        driver.get("https://jqueryui.com/droppable/");
        //and user moves the target element (Drag me to my target) in to destination (Drop here)

        //Below elements are in the iframes so switch to iframe first
        driver.switchTo().frame(0);//switching to the first index iframe
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        //user Actions class to move source into target
        Actions actions=new Actions(driver);

        actions.clickAndHold(source).moveToElement(target).build().perform();

    }

    @Test
    public void moveByOffSetTest(){
        driver.get("https://jqueryui.com/droppable/");
        //and user moves the target element (Drag me to my target) in to destination (Drop here)

        //Below elements are in the iframes so switch to iframe first
        driver.switchTo().frame(0);//switching to the first index iframe
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        //user Actions class to move source into target
        Actions actions=new Actions(driver);
       // actions.clickAndHold(source).moveByOffset(160,30).build().perform();
        actions.clickAndHold(source).moveToElement(target).build().perform();
       // actions.dragAndDropBy(source,160,30).perform();
    }


}
/*
        When test fails:
        1. check locator
        2. wait issue or syncronization
        3. iframe--->> THIS WAS THE ISSUE
 */