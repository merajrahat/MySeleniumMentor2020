package net.slickdealstest;

import com.peoplentech.myseleniummentor2020.base.TestBase;
import net.slickdeals.pages.HomePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {


    @Test
    public void validateTypeInSearchBox(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchBar();
    }

    @Test (enabled = false)
    public void validateClickOnAuto(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ableToClickOnAuto();

    }

    @Test (enabled = false)
    public void validateClickOnAboutUs(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ableToClickOnAboutUs();
    }

    @Test (enabled = false)
    public void validatePageNavigation(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.pageBackwardAndForward();
    }
}
