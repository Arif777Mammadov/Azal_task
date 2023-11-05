package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver getDriver(){
        WebDriver chrome;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        return chrome;
    }
}
