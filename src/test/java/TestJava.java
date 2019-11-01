import org.junit.jupiter.api.*;

public class TestJava extends BaseTest implements Locators {

    private static BaseTest baseTest;

    @BeforeAll
    static void setUp() {
        baseTest = new BaseTest();
        baseTest.getDriver();
    }

    @Test
    @DisplayName("Test left field")
    void testLeftField() {
        baseTest.switchToFrame(FR_TOP);
        baseTest.switchToFrame(FR_L);
        String a = baseTest.checker(BODY);
        Assertions.assertEquals(a, "LEFT");
    }

    @Test
    @DisplayName("Test middle field")
    void testMiddleField() {
        baseTest.switchToFrame(FR_TOP);
        baseTest.switchToFrame(FR_M);
        String a = baseTest.checker(MIDDLE);
        Assertions.assertEquals(a, "MIDDLE");
    }

    @Test
    @DisplayName("Test right field")
    void testRightField() {
        baseTest.switchToFrame(FR_TOP);
        baseTest.switchToFrame(FR_R);
        String a = baseTest.checker(BODY);
        Assertions.assertEquals(a, "RIGHT");
    }

    @Test
    @DisplayName("Test bottom field")
    void testBottomField() {
        baseTest.switchToFrame(FR_BOT);
        String a = baseTest.checker(BODY);
        Assertions.assertEquals(a, "BOTTOM");
    }

    @AfterEach
    void switchHome() {
        baseTest.switchBack();
    }

    @AfterAll
    static void shotDown() {
        baseTest.tearDown();
    }
}
