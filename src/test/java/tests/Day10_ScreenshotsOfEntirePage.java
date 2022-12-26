package tests;

import org.junit.Test;
import utilities.TestBase;

import java.io.IOException;

public class Day10_ScreenshotsOfEntirePage extends TestBase {
    @Test
    public void takeScreenshotTest() throws IOException {
        //Given user search for "uni"
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");

        //TAKE A SCREENSHOT. CREATE A REUSABLE METHOD AND CALL THAT METHOD
        takeScreenshotOfPage();

        //And select United Kingdom
        takeScreenshotOfPage();
        //And click on submit button
        takeScreenshotOfPage();
        //Then verify the result contains United Kingdom
        takeScreenshotOfPage();

    }
}
