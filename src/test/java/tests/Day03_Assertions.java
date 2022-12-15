package tests;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {

    @Test
    public void assertion(){
        /*
        What is assertion in testing?
        Assertion is done to check if expected result is equal to actual result
        -expected==actual->PASS
        -expected!=actual-FAIL
        ---------------------------------------------------------
        assertEqual("expected","actual");
        assertTrue(True);-->PASS
        assertTrue(False);-->FAIL
        assertFalse(True);-->FAIL
        assertFalse(False);-->PASS
        ----------------------------------------------------------
         */
        Assert.assertEquals(5,5);

       if("Java".contains("a")){  //-->FAILED
           System.out.println("PASS");
       }else{
           System.out.println("PASS");
       }

        Assert.assertEquals("java","java");
        Assert.assertEquals("java".contains("j"),true);
//      ----------------------------------------------------------
        Assert.assertTrue("java".contains("j"));
//      ---------------------------------------------------------
        Assert.assertFalse("Java".contains("j"));
//      TEST EXECUTION STOPS IF ONE THE ASSERTION FAILS. THIS IS CALLED HARD ASSERTION

//      TEST EXECUTION CONTINUES EVEN IF VERIFICATION FAILS. VERIFICATION MEANS LIKE IF STATEMENT

//      What is difference between Assertion and Verification?
//      -Assertion stops after assertion fails but Verification continues even after verification fails
//      JUnit assertion are hard assertion. If statement is verification
//      NOTE: TestNG has soft assertion as well. We will learn it in TestNG



    }
}
