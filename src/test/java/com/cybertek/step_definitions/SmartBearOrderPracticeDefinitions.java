package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearOrderPractice;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrderPracticeDefinitions {
     /*
    TC#27: SmartBear order process
    1.User is logged into SmartBear Tester account and on Order page
    2.User fills out the form as followed:
    3.User selects FamilyAlbum from product dropdown
    4.User enters 4 to quantity
    5.User enters John Wick to costumer name
    6.User enters Kinzie Ave to street
    7.User enters Chicago to city
    8.User enters IL to state
    9.User enters 60056
    10.User selects Visa as card type
    11.User enters 1111222233334444 to card number
    12.User enters 12/22 to expiration date
    13.User clicks process button
    14.User verifies John Wick is in the list
    Note: Follow POM, and solution should be done using Cucumber parameterization
     */

    SmartBearOrderPractice smartBearOrderPractice=new SmartBearOrderPractice();


    @Given("User is logged into SmartBear Tester account")
    public void user_is_logged_into_smart_bear_tester_account() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearOrderPractice.username.sendKeys(ConfigurationReader.getProperty("username"));
        smartBearOrderPractice.password.sendKeys(ConfigurationReader.getProperty("password"));
        smartBearOrderPractice.login.click();


    }

    @When("on Order page")
    public void on_order_page() {
        smartBearOrderPractice.orderlink.click();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Web Orders");

    }

    @Then("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select select=new Select(smartBearOrderPractice.productDropdown);
        select.selectByVisibleText("FamilyAlbum");

    }

    @Then("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBearOrderPractice.quantityy.sendKeys(Keys.BACK_SPACE+quantity);

   }

    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {
        smartBearOrderPractice.customerName.sendKeys(name);

    }

    @Then("User enters {string} to street")
    public void user_enters_to_street(String str) {

     smartBearOrderPractice.street.sendKeys(str);
    }

    @Then("User enters {string} to city")
    public void user_enters_to_city(String cityy) {
        smartBearOrderPractice.city.sendKeys(cityy);

    }

    @Then("User enters {string} to state")
    public void user_enters_to_state(String statee) {
        smartBearOrderPractice.state.sendKeys(statee);

    }

    @Then("User enters {string} on zip")
    public void user_enters_on_zip(String zipp) {
        smartBearOrderPractice.zip.sendKeys(zipp);

    }

    @Then("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        smartBearOrderPractice.cardType.click();

    }

    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String cardnumberr) {
        smartBearOrderPractice.cardNumber.sendKeys(cardnumberr);

    }

    @Then("User enters {string} to expiration Date")
    public void user_enters_to_expiration_date(String expirationDate) {
        smartBearOrderPractice.expireDate.sendKeys(expirationDate);

    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBearOrderPractice.processButton.click();

    }

    @Then("User clicks view all Orders")
    public void user_clicks_view_all_orders() {
        smartBearOrderPractice.viewPage.click();

    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String name) {
       Assert.assertTrue(smartBearOrderPractice.JohnWick.isDisplayed());

    }


}
