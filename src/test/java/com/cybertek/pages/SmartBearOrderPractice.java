package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPractice {


    public SmartBearOrderPractice(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "ctl00$MainContent$username")
    public WebElement username;

    @FindBy(name="ctl00$MainContent$password")
    public WebElement password;

    @FindBy(name="ctl00$MainContent$login_button")
    public WebElement login;

    @FindBy(linkText = "Order")
    public WebElement orderlink;

    @FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    public WebElement productDropdown;

    @FindBy(name="ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement quantityy;

    @FindBy(name="ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerName;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement street;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zip;

    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardType;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNumber;

    @FindBy(name="ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expireDate;

    @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewPage;

    @FindBy(xpath = "//table[@class='SampleTable']//tr")
    public WebElement list;

    @FindBy(xpath = "//table[@class='SampleTable']//tr")
     public WebElement JohnWick;
























}
