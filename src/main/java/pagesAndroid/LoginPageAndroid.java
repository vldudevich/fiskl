package pagesAndroid;

import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPageAndroid extends PageObject {
    public LoginPageAndroid(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }
    @FindBy(id = "com.fiskl.dev:id/fr_reg_email")
    private WebElement emailField;
    @FindBy(id = "com.fiskl.dev:id/fr_reg_btn_back")
    private WebElement backBtn;
    @FindBy(id = "com.fiskl.dev:id/fr_reg_btn_continue")
    private WebElement continueBtn;
    @FindBy(id = "com.fiskl.dev:id/fr_reg_error")
    private WebElement erField;
    @FindBy(id = "com.fiskl.dev:id/fr_reg_subtitle")
    public WebElement title;

    public boolean checkEmail() {return erField.isDisplayed();}
    public void initLoginPageAndroid() {
        Assert.assertEquals(title.getText(), "Connect with your email");
    }
    public void clearField() {emailField.clear();}
    public void sendEmailField(String email) {
        emailField.sendKeys(email);
    }
    public void continueClk() {continueBtn.click();}
    public void backBtnClk() {backBtn.click();}
}
