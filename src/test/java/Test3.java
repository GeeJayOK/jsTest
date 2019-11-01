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
        baseTest.uploadFile("src/files/d1419eaf521bcd0cb9d84cab35a48815384a8c3ee21191122641d112b9c32a07.jpg");

    }

    @AfterEach
    void shotDown() {
        baseTest.tearDown();
    }
}
