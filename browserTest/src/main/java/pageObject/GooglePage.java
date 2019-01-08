package pageObject;

import org.openqa.selenium.WebDriver;

public class GooglePage {
    protected WebDriver driver;


    protected void gotoGoogle(){
        driver.get("https://www.google.com/");
    }

}
