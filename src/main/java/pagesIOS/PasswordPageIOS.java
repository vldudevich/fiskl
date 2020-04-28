package pagesIOS;

import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPageIOS extends PageObject  {
    public PasswordPageIOS(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }

    @FindBy(xpath="//XCUIElementTypeSecureTextField")
    public WebElement passwordField;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
    public WebElement continueBtn;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    private WebElement backBtn;

    public boolean isInitialized() {
        return passwordField.isDisplayed();
    }

    public void sendPasswordField(String password) {
        passwordField.sendKeys(password);
    }
    public void continueClk() {
        continueBtn.click();
    }
    public void backBtnClk() { backBtn.click(); }



}
