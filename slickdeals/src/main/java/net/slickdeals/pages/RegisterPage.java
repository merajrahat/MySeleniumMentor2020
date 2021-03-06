package net.slickdeals.pages;

import com.peoplentech.myseleniummentor2020.base.TestBase;
import com.peoplentech.myseleniummentor2020.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends TestBase {
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(linkText = "Sign Up")
    private WebElement clickSignUp;

    @FindBy(id = "email")
    private WebElement putEmail;


    public void createAccount(){
        clickSignUp.click();
        putEmail.sendKeys("",Keys.RETURN);
        sleepFor(4);
    }

}

