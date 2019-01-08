import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.GooglePage;

public class GoogleTest extends GooglePage{




    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/syedhasan/Desktop/browserTest/src/main/resources/chromedriver");
        driver = new ChromeDriver();

    }

    @Test
    public void  GooglePage(){
        gotoGoogle();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
