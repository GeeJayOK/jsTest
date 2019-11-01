import org.junit.jupiter.api.*;

public class Test2 extends BaseTest implements Locators {

    private static BaseTest baseTest;

    @BeforeAll
    static void setUp() {
        baseTest = new BaseTest();
    }

    @Test
    @DisplayName("Test first HW")
    void testHW1() {
        baseTest.getDriver(URL_HW1);
        baseTest.clickOnElement(START_BUTTON);
        Assertions.assertTrue(baseTest.findElement(HW));
    }

    @Test
    @DisplayName("Test second HW")
    void testHW2() {
        baseTest.getDriver(URL_HW2);
        baseTest.clickOnElement(START_BUTTON);
        Assertions.assertTrue(baseTest.findElement(HW));
    }

    @AfterEach
    void shotDown() {
        baseTest.tearDown();
    }
}
