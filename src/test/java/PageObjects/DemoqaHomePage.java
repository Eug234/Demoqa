package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaHomePage extends BasePage{

    public DemoqaHomePage(WebDriver driver){
        super(driver);
    }
    WebDriver driver = new ChromeDriver(); //?

    public WebElement getWebTables(){
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/span"));
    }
    public WebElement getButtons() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/span"));
    }

}
//
//import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//
//public class GoogleHomePage extends BasePage {
//    public GoogleHomePage(WebDriver driver){
//        super(driver); /*this.driver=driver;*/
//    }
//    public WebElement getSearchField() {
//        return driver.findElement(By.xpath("//input[@name'q']"));
//    }
//
//    public WebElement getEnterBtn() {
//        return driver.findElement(By.xpath("//a[text()='Увійти']"));
//    }
//}
//---------------------------
//package PageObjectScheme;
//
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//
//public class AmazonSearchResultsPage extends BasePage {
//    public AmazonSearchResultsPage(WebDriver driver) {
//        super(driver);
//    }
//
//    public WebElement getResultsField(){
//        return driver.findElement(By.xpath("//span[text()='RESULTS']"));
//    }
//}
//------------------------------
//package PageObjectScheme;
//
//        import PageObject.BasePage;
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//
//public class AmazonHomePage extends BasePage {
//    public AmazonHomePage(WebDriver driver){
//        super(driver);
//    }
//
//    public void navigateAmazon(){
//        driver.get("https://www.amazon.com");
//    }
//
//    public WebElement getLogoImage(){
//        return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//    }
//
//    public WebElement getDeliverTo(){
//        return driver.findElement(By.xpath("//div[@id='glow-ingress-block']"));
//    }
//
//    public WebElement getSearchField(){
//        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//    }
//
//    public WebElement getSearchImageBtn(){
//        return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//    }
//}
