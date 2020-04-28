package LoginTests;

import base.BaseTestAndroid;

import base.Strings;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesAndroid.HomePageAndroid;
import pagesAndroid.LoginPageAndroid;
import pagesAndroid.PasswordPageAndroid;

import java.net.MalformedURLException;

public class LoginTestAnd extends BaseTestAndroid {

    @Test
    public void Test001failedLoginEmptyField() throws InterruptedException, MalformedURLException {
        HomePageAndroid homePageAndroid = new HomePageAndroid(driver);
        homePageAndroid.initHomePageAndroid();

        homePageAndroid.byEmailClk();
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.initLoginPageAndroid();

        loginPageAndroid.sendEmailField(Strings.testStr0);
        loginPageAndroid.continueClk();
        Assert.assertTrue(loginPageAndroid.checkEmail());
        loginPageAndroid.clearField();
    }

    @Test
    public void Test002failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.sendEmailField(Strings.testStr1);
        loginPageAndroid.continueClk();
        Assert.assertTrue(loginPageAndroid.checkEmail());
        loginPageAndroid.clearField();
        loginPageAndroid.initLoginPageAndroid();
    }
    @Test
    public void Test003failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.sendEmailField(Strings.testStr2);
        loginPageAndroid.continueClk();
        Assert.assertTrue(loginPageAndroid.checkEmail());
        loginPageAndroid.clearField();
        loginPageAndroid.initLoginPageAndroid();
    }
    @Test
    public void Test004failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.sendEmailField(Strings.testStr3);
        loginPageAndroid.continueClk();
        Assert.assertTrue(loginPageAndroid.checkEmail());
        loginPageAndroid.clearField();
        loginPageAndroid.initLoginPageAndroid();
    }
    @Test
    public void Test005failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.sendEmailField(Strings.testStr4);
        loginPageAndroid.continueClk();
        Assert.assertTrue(loginPageAndroid.checkEmail());
        loginPageAndroid.clearField();
        loginPageAndroid.initLoginPageAndroid();
    }
    @Test
    public void Test006failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.sendEmailField(Strings.testStr5);
        loginPageAndroid.continueClk();
        Assert.assertTrue(loginPageAndroid.checkEmail());
        loginPageAndroid.clearField();
        loginPageAndroid.initLoginPageAndroid();
    }
    @Test
    public void Test007failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.sendEmailField(Strings.testStr6);
        loginPageAndroid.continueClk();
        Assert.assertTrue(loginPageAndroid.checkEmail());
        loginPageAndroid.clearField();
    }
    @Test
    public void Test008SuccessEmailLogin() throws InterruptedException {
        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
        loginPageAndroid.clearField();
        loginPageAndroid.sendEmailField(Strings.testStrRight);
        loginPageAndroid.continueClk();
    }
    @Test
    public void Test009WrongPasswordLogin() throws InterruptedException {
        PasswordPageAndroid passwordPageAndroid = new PasswordPageAndroid(driver);
        passwordPageAndroid.clearField();
        passwordPageAndroid.sendPasswordField(Strings.testStr1);
        passwordPageAndroid.continueClk();
        passwordPageAndroid.backBtnClk();
    }
    @Test
    public void Test010RightPasswordLogin() throws InterruptedException {
        PasswordPageAndroid passwordPageAndroid = new PasswordPageAndroid(driver);
        passwordPageAndroid.clearField();
        passwordPageAndroid.sendPasswordField(Strings.testStrRight2);
        passwordPageAndroid.continueClk();
        Thread.sleep(5000);
    }
//    @Test
//    public void TestFastAuth() throws InterruptedException {
//        HomePageAndroid homePageAndroid = new HomePageAndroid(driver);
//        homePageAndroid.byEmailClk();
//
//        LoginPageAndroid loginPageAndroid = new LoginPageAndroid(driver);
//        loginPageAndroid.clearField();
//        loginPageAndroid.sendEmailField(Strings.testStrRight);
//        loginPageAndroid.continueClk();
//
//        PasswordPageAndroid passwordPageAndroid = new PasswordPageAndroid(driver);
//        passwordPageAndroid.clearField();
//        passwordPageAndroid.sendPasswordField(Strings.testStrRight2);
//        passwordPageAndroid.continueClk();
//
//        Thread.sleep(5000);
//    }
}
