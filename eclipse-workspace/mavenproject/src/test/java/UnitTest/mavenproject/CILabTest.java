package UnitTest.mavenproject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CILabTest {

    private CILab tester;
    
    public void setUp() {
        tester = new CILab();
    }

    
    public void tearDown() {
        tester = null;
    }

    @Test
    public void detectCapitalUseTest1() {
    	setUp();
        tester.setString("USA");
        Assertions.assertTrue(tester.detectCapitalUse());
        tearDown();
    }

    @Test
    public void detectCapitalUseTest2() {
    	setUp();
        tester.setString("leetcode");
        Assertions.assertTrue(tester.detectCapitalUse());
        tearDown();
    }
    
    @Test
    public void detectCapitalUseTest3() {
    	setUp();
        tester.setString("Google");
        Assertions.assertTrue(tester.detectCapitalUse());
        tearDown();
    }

    @Test
    public void detectCapitalUseTest4() {
    	setUp();
        tester.setString("RiteshSamal");
        Assertions.assertTrue(tester.detectCapitalUse());
        tearDown();
    }

    @Test
    public void detectCapitalUseTest5() {
    	setUp();
        tester.setString("hello");
        Assertions.assertTrue(tester.detectCapitalUse());
        tearDown();
    }

    @Test
    public void detectCapitalUseTest6() {
    	setUp();
        tester.setString("WORLD");
        Assertions.assertFalse(tester.detectCapitalUse());
        tearDown();
    }

    @Test
    public void detectCapitalUseTest7() {
    	setUp();
        tester.setString("AbcDEfg");
        Assertions.assertFalse(tester.detectCapitalUse());
        tearDown();
    }
}