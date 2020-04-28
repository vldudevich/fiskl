package pagesIOS;
import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageIOS extends PageObject {
    public HomePageIOS(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"With Email\"]")
    private WebElement byEmail;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"With Google\"]")
    private WebElement byGoogle;
    public void byEmailClk() throws InterruptedException {
        byEmail.click();
    }
    public void byGoogleClk() throws InterruptedException {
        byGoogle.click();
    }

    public boolean isInitialized() {
        return byEmail.isDisplayed();
    }


}
