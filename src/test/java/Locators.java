public interface Locators {

    //Test 1
    String URL_FRAME = "https://the-internet.herokuapp.com/nested_frames";
    String FR_TOP = "frame-top";
    String FR_BOT = "frame-bottom";
    String FR_L = "frame-left";
    String FR_M = "frame-middle";
    String FR_R = "frame-right";
    String BODY = "//body";
    String MIDDLE = "//div";

    //Test 2
    String URL_HW1 = "https://the-internet.herokuapp.com/dynamic_loading/1";
    String URL_HW2 = "https://the-internet.herokuapp.com/dynamic_loading/2";
    String START_BUTTON = "//button[contains(text(),'Start')]";
    String HW = "//h4[contains(text(),'Hello World!')]";

    //Test 3
    String URL_UPLD = "https://the-internet.herokuapp.com/upload";
    String F_INPUT = "//input[@type='file']";
    String UPLD_BUTT = "//input[@id='file-submit']";
    String UPLOADED = "//div[contains(text(),'d1419eaf521bcd0cb9d84cab35a48815384a8c3ee21191122641d112b9c32a07.jpg')]";
    String DDU = "//input[@class='dz-hidden-input']"; //"//div[@id='drag-drop-upload']";
    String DROPPED = "//span[contains(text(),'d1419eaf521bcd0cb9d84cab35a48815384a8c3ee21191122641d112b9c32a07.jpg')]";
}
