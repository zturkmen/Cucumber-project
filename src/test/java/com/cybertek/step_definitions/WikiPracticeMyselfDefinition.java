package com.cybertek.step_definitions;

import com.cybertek.pages.WikiPracticeMyself;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WikiPracticeMyselfDefinition {
    WikiPracticeMyself wikiPracticeMyself=new WikiPracticeMyself();

    @Given("User is onWikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @Then("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikiPracticeMyself.searchBox.sendKeys("Steve Jobs");



    }

    @Then("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPracticeMyself.searchButton.click();


    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
        Assert.assertEquals(wikiPracticeMyself.header.getText(),"Steve Jobs");

    }

    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_is_in_the_image_header() {
       // String actualHeader = wikiPracticeMyself.image.getText();

       // Thread.sleep(2000);
        //Assert.assertEquals(actualHeader,"Steve Jobs");

        Assert.assertTrue(wikiPracticeMyself.image.getText().contains("Steve Jobs"));
    }




}
