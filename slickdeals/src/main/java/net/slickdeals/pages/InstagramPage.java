package net.slickdeals.pages;

import com.peoplentech.myseleniummentor2020.base.TestBase;
import com.peoplentech.myseleniummentor2020.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InstagramPage extends TestBase{
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(HomePage.class);



    @FindBy(linkText = "Instagram")
    private WebElement clickOnInstagram;

    @FindBy(linkText = "See All")
    private WebElement clickOnSeeAll;


    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(3);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        sleepFor(3);

    }

    public void userClickOnInstagram(){

        scrollPage();
        sleepFor(2);
        clickOnInstagram.click();
        sleepFor(5);
        scrollPage();
        sleepFor(2);
        clickOnSeeAll.click();
        sleepFor(3);

    }

    public void scrollToElement(){
        WebElement element = driver.findElement(By.linkText("Instagram"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(2);
        clickOnInstagram.click();
        sleepFor(2);

    }


}
