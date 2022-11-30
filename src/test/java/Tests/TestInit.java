package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @AfterMethod
    public voidtearDown() {driver.quit();}

    public void voidsleep(int s){
        try {
            Thread.wakeUp(s * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public void goToGoogle(){
        driver.get("https://demoqa.com/webtables");
    }
}