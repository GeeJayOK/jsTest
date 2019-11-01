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
    @DisplayName("Test left field")
    void testLeftField() {
        baseTest.switchToFrame(FR_TOP);
        baseTest.switchToFrame(FR_L);
        String a = baseTest.checker(L);
        Assertions.assertEquals(a, "LEFT");
    }

    @Test
    @DisplayName("Test middle field")
    void testMiddleField() {
        baseTest.switchToFrame(FR_TOP);
        baseTest.switchToFrame(FR_M);
        String a = baseTest.checker(M);
        Assertions.assertEquals(a, "MIDDLE");
    }

    @Test
    @DisplayName("Test right field")
    void testRightField() {
        baseTest.switchToFrame(FR_TOP);
        baseTest.switchToFrame(FR_R);
        String a = baseTest.checker(R);
        Assertions.assertEquals(a, "RIGHT");
    }

    @Test
    @DisplayName("Test bottom field")
    void testBottomField() {
        baseTest.switchToFrame(FR_BOT);
        baseTest.switchToFrame(B);
        String a = baseTest.checker(B);
        Assertions.assertEquals(a, "BOTTOM");
    }

    @AfterEach
    void switchHome() {
        baseTest.switchBack();
    }

    @AfterAll
    public static void tearDown() {
        baseTest.tearDown();
    }
}
