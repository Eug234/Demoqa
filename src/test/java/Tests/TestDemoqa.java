package Tests;

import PageObjects.DemoqaHomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestDemoqa extends TestInit{
    @Test
    public void clickEnterBtn(){
        goToDemoqa();
        DemoqaHomePage demoqaHomePage = new DemoqaHomePage(driver);
        demoqaHomePage.getEnterBtn().click();

    }
    @Test
    public void clickEnterBtnv2(){
        driver.get("https://demoqa.com/webtables");
        DemoqaHomePage demoqaHomePage = new DemoqaHomePage(driver);
        demoqaHomePage.getEnterBtn().click();

    }
}
//
//public class TestAmazon extends TestInit {
//    @Test
//    public void checkHeader(){
//        PageObject.AmazonHomePage amazonHomePage = new PageObject.AmazonHomePage(driver);
//        amazonHomePage.navigateAmazon();
//
//        Assert.assertTrue(amazonHomePage.getLogoImage().isDisplayed());
//        Assert.assertTrue(amazonHomePage.getDeliverTo().isDisplayed());
//        Assert.assertTrue(amazonHomePage.getSearchField().isDisplayed());
//        Assert.assertTrue(amazonHomePage.getSearchImageBtn().isDisplayed());
//    }
//    @Test
//    public void checkSearch(){
//        PageObject.AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
//        amazonHomePage.navigateAmazon();
//
//        amazonHomePage.getSearchField().sendKeys("hat");
//        amazonHomePage.getSearchImageBtn().click();
//
//        AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
//        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
//    }
//}
