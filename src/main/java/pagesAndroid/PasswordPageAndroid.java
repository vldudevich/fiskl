package pagesAndroid;
import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPageAndroid extends PageObject {
    public PasswordPageAndroid(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }
    @FindBy(id = "com.fiskl.dev:id/fr_reg_et_password")
    private WebElement passwordField;
    @FindBy(id = "com.fiskl.dev:id/fr_reg_btn_back")
    private WebElement backBtn;
    @FindBy(id = "com.fiskl.dev:id/fr_reg_btn_continue")
    private WebElement continueBtn;


    public boolean isInitialized() {
        return passwordField.isDisplayed();
    }

    public void sendPasswordField(String password) {
        passwordField.sendKeys(password);
    }
    public void continueClk() {
        continueBtn.click();
    }
    public void backBtnClk() { backBtn.click();}
    public void clearField() {passwordField.clear();}
}
