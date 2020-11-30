package net.slickdealstest;

import com.peoplentech.myseleniummentor2020.base.TestBase;
import net.slickdeals.pages.HomePage;
import net.slickdeals.pages.InstagramPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InstagramPageValidations extends TestBase {


    @Test (enabled = false)
    public void validatePageScroll(){
        InstagramPage instagramPage = PageFactory.initElements(driver, InstagramPage.class);
        instagramPage.userClickOnInstagram();
    }

    @Test (enabled = false)
    public void validateScrollToElement(){
        InstagramPage instagramPage = PageFactory.initElements(driver, InstagramPage.class);
        instagramPage.scrollToElement();
    }
}
