package home_works;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Array;
import java.time.Duration;
import java.util.*;

public class AmazonDropdown {
    //Create A Class: AmazonDropdown
    //Create A Method dropdownTest
    //Go to https://www.amazon.com/
    //Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
    //Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
    //Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
    //Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
    //Print the the total number of options in the dropdown
    //Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
    //      BONUS: Assert if the dropdown is in Alphabetical Order


    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void dropDownTest(){
        //Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));

        //Print the first selected option and assert if it equals “All Departments”.
        // If it fails, then comment that code out and continue rest of the test case.
        Select selectFirst=new Select(dropDown);
        Assert.assertEquals("FIRST SELECTED DOES NOT 'All Departments'","All Departments",selectFirst.getFirstSelectedOption().getText());


        //Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.
        // (after you select you need to use get first selected option method). If it fails,
        // then comment that code out and continue rest of the test case.
        Select select4thIndex =new Select(dropDown);
        select4thIndex.selectByIndex(3);
        String actual4thOption=select4thIndex.getFirstSelectedOption().getText();
        String  expected4ThOption="Amazon Devices";
        if(actual4thOption.equals(expected4ThOption)) System.out.println("TEST PASSES");else System.out.println("TEST FAILED.EXPECTED DATA IS"+expected4ThOption+"");

        //Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
        //Select selectAll=new Select(dropDown);
        List<WebElement> allOptions=selectFirst.getOptions();
        for(WebElement w:allOptions){
            System.out.println(w.getText());
        }

        //Print the the total number of options in the dropdown
        System.out.println("total number of options ="+allOptions.size());


        //Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
        if (allOptions.contains("Appliances")) System.out.println("True.“Appliances” is an option");else System.out.println("False.“Appliances” is not an option");

       // Assert.assertTrue(allOptions.contains("Appliances"));

        //      BONUS: Assert if the dropdown is in Alphabetical Order*/

        String[] flag=new String[allOptions.size()];
        String[] flag1=new String[allOptions.size()];
        int count=0;
        for (WebElement w:allOptions) {
           flag[count]=w.getText();
           flag1[count]=w.getText();
           count++;
        }
        Arrays.sort(flag);
        if (Arrays.equals(flag,flag1)) System.out.println("DROPDOWN IS ORDERED LIST");else System.out.println("DROPDOWN IS NOT IN ORDER");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
