package Elements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class GeneralElements {
    WebDriver chrome;
    JavascriptExecutor js;
    public GeneralElements(WebDriver chrome) {
        PageFactory.initElements(chrome, this);
        this.chrome = chrome;
        js = (JavascriptExecutor) chrome;
    }

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/button")
    WebElement switcher;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div/label/div[1]/input")
    WebElement orig_sect;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/button")
    WebElement orig;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/label/div[1]/input")
    WebElement dest_sect;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul/button")
    WebElement dest;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/button")
    WebElement flight_date_btn;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div[3]/button[6]")
    WebElement outbound_date;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
    WebElement outbound_sect;

    @FindBy(xpath = "//*[@id=\"mainPage\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/button[2]")
    WebElement search_btn;

    WebElement ec_tariff_btn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[4]/div/div[2]/div[2]/div[1]/div/div/div[2]/div/article[1]/div/button")
    WebElement low_ec_tariff;

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void check_dest(String arg0) throws InterruptedException {
        sleep();
        if (Objects.equals(arg0, "Bakı")){
            switcher.click();
        }
    }

    public void click_orig_sect() throws InterruptedException {
        orig_sect.click();
    }

    public void set_orig(String arg0) {
        if(Objects.equals(arg0, "Bakı")) {
            orig_sect.sendKeys(Keys.SHIFT, Keys.HOME);
        } else {
            orig_sect.sendKeys(Keys.SHIFT, Keys.HOME);
            orig_sect.sendKeys(arg0);
        }
    }

    public void click_orig() throws InterruptedException {
        sleep();
        orig.click();
    }

    public void click_dest_sect() throws InterruptedException {
        sleep();
        dest_sect.click();
    }

    public void set_dest(String arg0) {
        if(Objects.equals(arg0, "Bakı")) {
            dest_sect.sendKeys(Keys.SHIFT, Keys.HOME);
        } else {
            dest_sect.sendKeys(arg0);
        }
    }

    public void click_dest() throws InterruptedException {
        sleep();
        dest.click();
    }

    public void click_flight_date() throws InterruptedException {
        sleep();
        flight_date_btn.click();
    }

    public void choose_outbound_date() throws InterruptedException {
        sleep();
        outbound_date.click();
    }

    public void click_search_btn() throws InterruptedException {
        sleep();
        search_btn.click();
    }

    public void choose_outbound_sect() throws InterruptedException {
        sleep();
        outbound_sect.click();
    }

    public void click_tariff_btn(String arg0, String arg1) throws InterruptedException {
        sleep();
        sleep();
        js.executeScript("window.scrollTo(0, 300)");
        if (arg0.equals("Bakı")) {
            ec_tariff_btn = chrome.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[4]/div/div[2]/div[2]/div[1]/button"));
            if (arg1.equals("London")) {
                chrome.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/button")).click();
            }
        } else {
            ec_tariff_btn = chrome.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[4]/div[2]/div[2]/div[2]/div[1]/button"));
        }
        sleep();
        ec_tariff_btn.click();
    }

    public void choose_low_tariff() throws InterruptedException {
        sleep();
        low_ec_tariff.click();
    }
}
