package pagesIOS;

import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageIOS extends PageObject {
    public LoginPageIOS(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }

    @FindBy(xpath="//XCUIElementTypeTextField")
    public WebElement emailField;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
    private WebElement continueBtn;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    private WebElement backBtn;

    public boolean isInitialized() {
        return emailField.isDisplayed();
    }
    public void clearField() {emailField.clear();}
    public void sendEmailField(String email) {
        emailField.sendKeys(email);
    }
    public void continueClk() {continueBtn.click();}
    public void backBtnClk() {backBtn.click();}

}
