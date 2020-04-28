package LoginTests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesIOS.HomePageIOS;
import pagesIOS.LoginPageIOS;

import java.net.MalformedURLException;
import java.util.Set;

public class GoogleLoginTest extends BaseTest {

    @Test
    public void Test001LoginByGoogle() throws InterruptedException {
        HomePageIOS homePageIOS = new HomePageIOS(driver);
        System.out.println(driver.getTitle());
        Assert.assertTrue(homePageIOS.isInitialized());
        homePageIOS.byGoogleClk();
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            wait.until(ExpectedConditions.alertIsPresent());
//            driver.switchTo().alert().accept();
//        } catch (Exception e) {
//            System.err.println("   no alert visible after 10 sec.");
//        }
//        Set contextName = driver.getContextHandles();
//        if (contextName.contains("NATIVE_APP")) {
//            System.out.println(“Show me:”+contextName);
//            Thread.sleep(1500);
//            driver.context("NATIVE_APP");
//            driver.findElement(By.xpath("//android.widget.Button 6[@text=‘Set’]")).click();
//        }
//        if (contextName.contains("WEBVIEW")) {
//            driver.context("WEBVIEW");
//            driver.findElement(By.xpath("//android.widget.Button 6[@text=‘Set’]")).click();
//        }
    }
}
