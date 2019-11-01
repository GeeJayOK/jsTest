import org.junit.jupiter.api.*;

public class Test3 extends BaseTest implements Locators {

    private static BaseTest baseTest;

    @BeforeAll
    static void setUp() {
        baseTest = new BaseTest();
    }

    @Test
    @DisplayName("Test upload file")
    void testHW1() {
        baseTest.getDriver(URL_UPLD);


    }

    @AfterEach
    void shotDown() {
        baseTest.tearDown();
    }
}
