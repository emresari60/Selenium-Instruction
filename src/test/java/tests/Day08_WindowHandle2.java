package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class Day08_WindowHandle2 extends TestBase {
    @Test
    public void newWindowTest() throws InterruptedException {

        //open techproeducation
        driver.get("https://techproeducation.com");
        String techProTitle=driver.getTitle();
        Assert.assertTrue(techProTitle.contains("Techpro Education"));
        String techProHandle=driver.getWindowHandle();

        Thread.sleep(2000);
        //open amazon on a new window 2
        driver.switchTo().newWindow(WindowType.WINDOW);//create a new window and switches to that window automatically
        driver.get("https://wwww.amazon.com");

        String amazonTitle=driver.getTitle();
        Assert.assertTrue(amazonTitle.contains("Amazon"));
        String  amazonHandle=driver.getWindowHandle();//getting window 2 id

        //open linkedin on a new window 3
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);//create a new window and switches to that window automatically
        driver.get("https://www.linkedin.com");
        String linkedinTitle =driver.getTitle();
        Assert.assertTrue(linkedinTitle.contains("LinkedIn"));
        String linkedindHandle=driver.getWindowHandle();//getting window 3 id

        Thread.sleep(2000);
        //switch back to techproeducation
        driver.switchTo().window(techProHandle);
        System.out.println("Techpro " + driver.getCurrentUrl());

        Thread.sleep(2000);
        //switch back to Amazon
        driver.switchTo().window(amazonHandle);
        System.out.println("AMAZON " + driver.getCurrentUrl());

        Thread.sleep(2000);
        //switch back to LİNKEDİN
        driver.switchTo().window(linkedindHandle);
        System.out.println("Linkedin " + driver.getCurrentUrl());

    }

    @Test
    public void newTabTest() throws InterruptedException {
        //open techproeducation
        driver.get("https://techproeducation.com");
        String techProTitle=driver.getTitle();
        Assert.assertTrue(techProTitle.contains("Techpro Education"));
        String techProHandle=driver.getWindowHandle();//getting Tab 1 id

        Thread.sleep(2000);
        //open amazon on a new window 2
        driver.switchTo().newWindow(WindowType.TAB);//create a new Tab and switches to that Tab automatically
        driver.get("https://wwww.amazon.com");

        String amazonTitle=driver.getTitle();
        Assert.assertTrue(amazonTitle.contains("Amazon"));
        String  amazonHandle=driver.getWindowHandle();//getting Tab 2 id

        //open linkedin on a new window 3
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);//create a new Tab and switches to that Tab automatically
        driver.get("https://www.linkedin.com");
        String linkedinTitle =driver.getTitle();
        Assert.assertTrue(linkedinTitle.contains("LinkedIn"));
        String linkedindHandle=driver.getWindowHandle();//getting Tab 3 id

        Thread.sleep(2000);
        //switch back to techproeducation
        driver.switchTo().window(techProHandle);
        System.out.println("Techpro " + driver.getCurrentUrl());

        Thread.sleep(2000);
        //switch back to Amazon
        driver.switchTo().window(amazonHandle);
        System.out.println("AMAZON " + driver.getCurrentUrl());

        Thread.sleep(2000);
        //switch back to LİNKEDİN
        driver.switchTo().window(linkedindHandle);
        System.out.println("Linkedin " + driver.getCurrentUrl());

    }

}
