package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyTitleVerifDefinitions {

    /*
    TC#51: Etsy Title Verification
    1.User is on https://www.etsy.com
    2.User sees title is as expected.
         Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
     Note: Follow POM

     TC#52: Etsy Search Functionality Title Verification (without parameterization)
     1.User is on https://www.etsy.com
     2.User types Wooden Spoon in the search box
     3.User clicks search button
     4.User sees Wooden Spoon is in the title
     Note: Follow POM

     TC#53: Etsy Search Functionality Title Verification (with parameterization)
     1.User is on https://www.etsy.com
     2.User types Wooden Spoon in the search box
     3.User clicks search button
     4.User sees Wooden Spoon is in the title
     Note: Follow POM


     */

    public EtsyTitleVerifDefinitions(){


    }

    EtsySearchPage etsySearchPage=new EtsySearchPage();

    @Given("User is on https:\\/\\/www.etsy.com")
    public void user_is_on_https_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");

    }
    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
       etsySearchPage.searchBox.sendKeys("Wooden Spoon");

    }

    @Then("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();

    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title(){

        String actualTitle = Driver.getDriver().getTitle();
       Assert.assertTrue(actualTitle.contains("Wooden spoon"));
        // Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden Spoon"));

    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchWord) {
        etsySearchPage.searchBox.sendKeys(searchWord);

    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String searchWord) {
       Assert.assertTrue(Driver.getDriver().getTitle().contains(searchWord));



    }




}
