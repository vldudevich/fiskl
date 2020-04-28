package LoginTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesIOS.HomePageIOS;
import pagesIOS.LoginPageIOS;
import pagesIOS.PasswordPageIOS;
import base.Strings;
import java.net.MalformedURLException;


public class LoginTest extends BaseTest {

    @Test
    public void Test001failedLoginEmptyField() throws InterruptedException, MalformedURLException {
        HomePageIOS homePageIOS = new HomePageIOS(driver);

        Assert.assertTrue(homePageIOS.isInitialized());
        homePageIOS.byEmailClk();
        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);

        Assert.assertTrue(loginPageIOS.isInitialized());

        loginPageIOS.sendEmailField(Strings.testStr0);
        hideKeyboard();
        loginPageIOS.clearField();
        Assert.assertTrue(loginPageIOS.isInitialized());

    }
    @Test
    public void Test002failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);
        loginPageIOS.sendEmailField(Strings.testStr1);
        hideKeyboard();
        loginPageIOS.clearField();

        Assert.assertTrue(loginPageIOS.isInitialized());
    }
    @Test
    public void Test003failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);
        loginPageIOS.sendEmailField(Strings.testStr2);
        hideKeyboard();
        loginPageIOS.clearField();

        Assert.assertTrue(loginPageIOS.isInitialized());
    }
    @Test
    public void Test004failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);
        loginPageIOS.sendEmailField(Strings.testStr3);
        hideKeyboard();
        loginPageIOS.clearField();

        Assert.assertTrue(loginPageIOS.isInitialized());
    }
    @Test
    public void Test005failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);
        loginPageIOS.sendEmailField(Strings.testStr4);
        hideKeyboard();
        loginPageIOS.clearField();

        Assert.assertTrue(loginPageIOS.isInitialized());
    }
    @Test
    public void Test006failedLoginWrongEmailFormat() throws InterruptedException {

        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);
        loginPageIOS.sendEmailField(Strings.testStr5);
        hideKeyboard();
        loginPageIOS.clearField();

        Assert.assertTrue(loginPageIOS.isInitialized());
    }
    @Test
    public void Test007failedLoginWrongEmailFormat() throws InterruptedException {

        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);
        loginPageIOS.sendEmailField(Strings.testStr6);
        hideKeyboard();
        loginPageIOS.clearField();

        Assert.assertTrue(loginPageIOS.isInitialized());
    }
    @Test
    public void Test008successEmailLogin() throws InterruptedException {

        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);
        loginPageIOS.sendEmailField(Strings.testStrRight);
        hideKeyboard();
    }

    @Test
    public void Test009WrongPasswordLogin() throws InterruptedException {
        PasswordPageIOS passwordPageIOS = new PasswordPageIOS(driver);
        passwordPageIOS.sendPasswordField(Strings.testStr0);
        hideKeyboard();

        passwordPageIOS.backBtnClk();
    }
    @Test
    public void Test010RightPasswordLogin() throws InterruptedException {
        PasswordPageIOS passwordPageIOS = new PasswordPageIOS(driver);
        passwordPageIOS.sendPasswordField(Strings.testStrRight2);
        hideKeyboard();
    }

    @Test
    public void TestFastAuth() throws InterruptedException {
        HomePageIOS homePageIOS = new HomePageIOS(driver);

        Assert.assertTrue(homePageIOS.isInitialized());
        homePageIOS.byEmailClk();
        LoginPageIOS loginPageIOS = new LoginPageIOS(driver);

        loginPageIOS.sendEmailField(Strings.testStrRight);
        hideKeyboard();

        PasswordPageIOS passwordPageIOS = new PasswordPageIOS(driver);
        passwordPageIOS.sendPasswordField(Strings.testStrRight2);
        hideKeyboard();

        acceptAlert();
    }

}
