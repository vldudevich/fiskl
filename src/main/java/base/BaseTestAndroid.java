
package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTestAndroid {

    public static AppiumDriver driver;

    public String platformName = "Android";
    public String platformVersion = "7.0";
    public String deviceName = "emulator-5554";
    public String udid = "58EF07D4-CFD7-492C-9E3C-7BA20106AD13";
    public String app = "/Users/vladislav/Downloads/fiskl.apk";
    public String automationName = AutomationName.ANDROID_UIAUTOMATOR2;
    public String url = "http://127.0.0.1:4723/wd/hub";
    public Boolean noReset = false;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, noReset);

        driver = new AndroidDriver(new URL(url),capabilities);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void hideKeyboard() {
        driver.hideKeyboard();
    }

}
