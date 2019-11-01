import org.junit.jupiter.api.*;

public class TestJava extends BaseTest implements Locators {

    private static BaseTest baseTest;
    //private BaseTest baseTest = null;

    @BeforeAll
    public static void setUp() {
        baseTest = new BaseTest();
        baseTest.getDriver();
    }

    @Test
    @DisplayName("LEFT")
    void testLeftField() {
        baseTest.switchToFrame(FR_L);
        String a = baseTest.checker(L);
        System.out.println(a);
        Assertions.assertEquals(a,"LEFT");
        baseTest.switchBack();
    }

    @AfterAll
    public static void tearDown() {
        baseTest.tearDown();
    }
}
