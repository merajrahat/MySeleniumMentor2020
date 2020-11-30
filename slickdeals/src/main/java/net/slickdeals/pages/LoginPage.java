package net.slickdeals.pages;

import com.peoplentech.myseleniummentor2020.base.TestBase;
import com.peoplentech.myseleniummentor2020.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends TestBase {
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(HomePage.class);


    @FindBy(linkText = "Log In")
    private WebElement userLogIn;

    @FindBy(id = "email")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmailSecond;

    @FindBy(id = "passwordInput")
    private WebElement userPassword;

    @FindBy(linkText = "merajrahat")
    private WebElement ableToClickUser;

    @FindBy(linkText = "Settings & Options")
    private WebElement clickOnSettingAndOPtions;

    @FindBy(linkText = "Reset password")
    private WebElement clickResetPassword;

    @FindBy(linkText = "Logout")
    private WebElement clickOnLogout;

    public void userAbleToLogIn(){
        userLogIn.click();
        sleepFor(3);
        userEmail.sendKeys("merajrahat@yahoo.com", Keys.RETURN);
        sleepFor(3);
        userPassword.sendKeys("Kkkrrish@18", Keys.RETURN);
        sleepFor(2);


    }

    public void userAbleResetPassword(){
        userAbleToLogIn();
        sleepFor(3);
        ableToClickUser.click();
        sleepFor(3);
        clickOnSettingAndOPtions.click();
        sleepFor(3);
        clickResetPassword.click();
        sleepFor(3);
        userEmail.sendKeys("merajrahat@yahoo.com",Keys.RETURN);
        sleepFor(2);

    }

    public void userAbleToLogOutAfterLoggedIn(){
        userAbleToLogIn();
        sleepFor(2);

        WebElement user = driver.findElement(By.linkText("merajrahat"));

        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        sleepFor(3);
        clickOnLogout.click();
        sleepFor(3);

    }

}
