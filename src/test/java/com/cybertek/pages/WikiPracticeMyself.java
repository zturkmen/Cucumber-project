package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPracticeMyself {

    /*
    TC#25: Wikipedia Search Functionality Title Verification
    1.User is onWikipedia home page
    2.User types Steve Jobs in the wiki search box
    3.User clicks wiki search button
    4.User sees Steve Jobs is in the wiki title
         Note: Follow POM

    TC#26: Wikipedia Search Functionality Header Verification
    1.User is onWikipedia home page
    2.User types Steve Jobs in the wiki search box
    3.User clicks wiki search button
    4.User sees Steve Jobs is in the main header
        Note: Follow POM

    TC#27: Wikipedia Search Functionality Image Header Verification
    1.User is onWikipedia home page
    2.User types Steve Jobs in the wiki search box
    3.User clicks wiki search button
    4.User sees Steve Jobs is in the image header
       Note: Follow POM
     */

    public WikiPracticeMyself(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id='firstHeading']")
    public WebElement header;

    @FindBy(xpath ="//div[@class='fn']")
    public WebElement image;
   // @FindBy(xpath = "//img[@alt='Steve Jobs Headshot 2010-CROP (cropped 2).jpg']")











}
