package net.slickdeals.pages;

import com.peoplentech.myseleniummentor2020.extent.ExtentTestManager;
import com.peoplentech.myseleniummentor2020.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.lang.invoke.SerializedLambda;
import java.security.PublicKey;

public class HomePage extends TestBase {
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(id = "globalSearchBox")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@id='globalSearchBox']")
    private WebElement searchBoxsecond;

    @FindBy(linkText = "AUTO")
    private WebElement clickOnAuto;

    @FindBy(id = "facet_12029")
    private WebElement chooseAmazonOnly;

    @FindBy(linkText = "About Us")
    private WebElement clickOnAboutUs;

    public void clickOnSearchBar(){
        searchBoxsecond.sendKeys("Laptop", Keys.RETURN);
        ExtentTestManager.log("User was able to type in search box and press enter");
        sleepFor(5);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/newsearch.php?src";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Validate url successfully");

    }

    public void ableToClickOnAuto(){

        clickOnAuto.click();
        ExtentTestManager.log("User able to click on Auto");
        sleepFor(3);

    }

    public void ableToClickOnAboutUs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(3);
        clickOnAboutUs.click();
        sleepFor(3);
        js.executeScript("window.scrollTo(0, 1996)");
        sleepFor(3);
    }

    public void pageBackwardAndForward(){
        ableToClickOnAuto();
        sleepFor(3);
        driver.navigate().back();
        sleepFor(2);
        driver.navigate().forward();
        sleepFor(2);
    }

}
