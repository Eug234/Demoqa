package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaHomePage {

    public DemoqaHomePage(WebDriver.driver){
        super(driver);
    }
    WebDriver driver = new ChromeDriver();

    public WebElement getSolutions(){
        return driver.findElement(By.xpath("//*[@id=/headerPanel/]/ul[1]/li[1]"));
    }
    public WebElement getEnterBtn() {
        return driver.findElement(By.xpath("//a[text()='Увійти']"));
    }

}
