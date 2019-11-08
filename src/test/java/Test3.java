import org.junit.jupiter.api.*;

public class Test3 extends BaseTest implements Locators {

    private static BaseTest baseTest;

    @BeforeAll
    static void setUp() {
        baseTest = new BaseTest();
    }

    @Test
    @DisplayName("Test upload file")
    void testUpload() {
        baseTest.getDriver(URL_UPLD);
        baseTest.uploadFile("/home/user/IdeaProjects/jsTest/src/test/files/d1419eaf521bcd0cb9d84cab35a48815384a8c3ee21191122641d112b9c32a07.jpg");
        baseTest.clickOnElement(UPLD_BUTT);
        Assertions.assertTrue(baseTest.findElement(UPLOADED));
    }

    @Test
    @DisplayName("Test D&D functionality")
    void testUploadWithDandD() {
        baseTest.getDriver(URL_UPLD);
        baseTest.uploadFileDandD("/home/user/IdeaProjects/jsTest/src/test/files/d1419eaf521bcd0cb9d84cab35a48815384a8c3ee21191122641d112b9c32a07.jpg");
        Assertions.assertTrue(baseTest.findElement(DROPPED));
    }

    @AfterEach
    void shotDown() {
        baseTest.tearDown();
    }
}
