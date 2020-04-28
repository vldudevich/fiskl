package pagesAndroid;

import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePageAndroid extends PageObject {

    @FindBy(id = "com.fiskl.dev:id/textView1")
    private WebElement byEmail;
    @FindBy(id = "com.fiskl.dev:id/textView15")
    private WebElement byGoogle;
    @FindBy(id = "com.fiskl.dev:id/fr_reg_subtitle")
    private WebElement title;

    public HomePageAndroid(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }

    public void byEmailClk() throws InterruptedException {
        byEmail.click();
    }
    public void byGoogleClk() throws InterruptedException {
        byGoogle.click();
    }
    public void initHomePageAndroid() {
        Assert.assertEquals(title.getText(), "How would you like to connect?");
    }

}
