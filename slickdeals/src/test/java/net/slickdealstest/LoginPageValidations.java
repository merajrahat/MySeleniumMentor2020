package net.slickdealstest;

import com.peoplentech.myseleniummentor2020.base.TestBase;
import net.slickdeals.pages.InstagramPage;
import net.slickdeals.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {


    @Test (enabled = false)
    public void validateUserAbleToLogIn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userAbleToLogIn();
    }

    @Test (enabled = false)
    public void validateUserAbleToResetPassword(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userAbleResetPassword();
    }

    @Test
    public void validateUserAbleToLogOutAfterLoggedIn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userAbleToLogOutAfterLoggedIn();
    }


}
