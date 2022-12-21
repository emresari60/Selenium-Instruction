package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day08_Authentication extends TestBase {
    @Test
    public void authTest(){
        /*
        username:admin
        password: admin
        url:    : https://the-internet.herokuapp.com/basic_auth
        SPECIAL URL FOR AUTHENTICATION:
        RULE    : https://username:password@url
         */
        // THİS WİLL DO AUTH

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String successMessage=driver.findElement((By.xpath("//p"))).getText();
        Assert.assertTrue(successMessage.contains("Congratulations! You must have the proper credentials."));

    }


}
