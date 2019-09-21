import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

public class Test extends BaseTest {

    private static BaseTest baseTest;
    //private BaseTest baseTest = null;

    @BeforeAll
    public static void setUp() {
        baseTest = new BaseTest();
        baseTest.getDriver();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("LEFT")
    void testLeftField() {
        String a = baseTest.checker(locators.FR_L);
        System.out.println(a);
        //Assertions.assertEquals(baseTest.checker(locators.FR_L),"LEFT");
    }


    @AfterAll
    public static void tearDown() {
        baseTest.tearDown();
    }
}
