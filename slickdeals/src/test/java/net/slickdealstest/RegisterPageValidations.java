package net.slickdealstest;

import com.peoplentech.myseleniummentor2020.base.TestBase;
import net.slickdeals.pages.InstagramPage;
import net.slickdeals.pages.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterPageValidations extends TestBase {

    @Test (enabled = false)
    public void validateUserCanCreateAccount(){
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        registerPage.createAccount();

    }
}
