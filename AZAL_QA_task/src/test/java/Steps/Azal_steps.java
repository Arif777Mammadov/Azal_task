package Steps;

import Driver.Driver;
import Elements.GeneralElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Azal_steps {
    protected WebDriver chrome = Driver.getDriver();

    @Given("Open Azal website")
    public void openAzalWebsite() throws InterruptedException {
        chrome.get("http://azal.az");
        Thread.sleep(11000);
    }

    GeneralElements g_elem = new GeneralElements(chrome);

    @And("Check {string}")
    public void check(String arg0) throws InterruptedException {
        g_elem.check_dest(arg0);
    }

    @When("Click on Origin section")
    public void clickOnOriginSection() throws InterruptedException {
        g_elem.click_orig_sect();
    }

    @And("Set {string} in Origin section")
    public void setOriginInOriginSection(String arg0) {
        g_elem.set_orig(arg0);
    }

    @Then("Click on Origin")
    public void clickOnOrigin() throws InterruptedException {
        g_elem.click_orig();
    }

    @When("Click on Destination section")
    public void clickOnDestinationSection() throws InterruptedException {
        g_elem.click_dest_sect();
    }

    @And("Set {string} in Destination section")
    public void setDestinationInDestinationSection(String arg0) {
        g_elem.set_dest(arg0);
    }

    @Then("Click on Destination")
    public void clickOnDestination() throws InterruptedException {
        g_elem.click_dest();
    }

    @Then("Click on Flight Date section")
    public void clickOnFlightDateSection() throws InterruptedException {
        g_elem.click_flight_date();
    }

    @And("Choose Outbound date")
    public void chooseOutboundDate() throws InterruptedException {
        g_elem.choose_outbound_date();
    }

    @Then("Click on Search button")
    public void clickOnSearchButton() throws InterruptedException {
        g_elem.click_search_btn();
    }

    @And("Click on Outbound section")
    public void clickOnOutboundSection() throws InterruptedException {
        g_elem.choose_outbound_sect();
    }

    @Then("Click on Economy Tariff section for {string} and {string}")
    public void clickOnEconomyTariffSection(String arg0, String arg1) throws InterruptedException {
        g_elem.click_tariff_btn(arg0, arg1);
    }

    @And("Choose Tariff with lowest cost")
    public void chooseTariffWithLowestCost() throws InterruptedException {
        g_elem.choose_low_tariff();
    }

    @Then("Close Browser")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        chrome.quit();
    }
}
