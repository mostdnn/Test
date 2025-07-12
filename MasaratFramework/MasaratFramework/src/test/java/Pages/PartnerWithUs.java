package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PartnerWithUs {


    @FindBy(id = "company_name")
    public WebElement companyName;

    @FindBy(id = "company_email")
    public WebElement companyEmail;

    @FindBy(id = "registration_number")
    public WebElement registrationNumber;

    @FindBy(id = "business_address")
    public WebElement businessAddress;

    @FindBy(id = "website_url")
    public WebElement websiteUrl;

    @FindBy(id = "industry")
    public WebElement industry;

    // point of contact elements


    @FindBy(xpath = "name")
    public WebElement name;

    @FindBy(id = "position")
    public WebElement position;


    @FindBy(id = "email")
    public WebElement email;


    @FindBy(id = "//input[@type='tel' and @placeholder='Phone number *']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@type='radio' and @value='pif' and @name='entity_type']")
    public WebElement pifRadioButton;

    @FindBy(xpath = "<input class=\"ant-radio-input\" type=\"radio\" value=\"private\" name=\"entity_type\">")
    public WebElement privateRadioButton;

    @FindBy(xpath = "//input[@type='radio' and @name='entity_type' and @value='public']")
    public WebElement publicRadioButton;

    @FindBy(xpath = "<input class=\"ant-radio-input\" type=\"radio\" value=\"individual\" name=\"entity_type\">")
    public WebElement individual;


    @FindBy(xpath = "//input[@type='checkbox' and @name='confirm' and contains(@class, 'ant-checkbox-input')]")
    public WebElement confirmCheckBox;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'primary-gradient') and .//p[text()='Send']]")
    public WebElement sendButton;


    @FindBy(xpath = "//div[@class='recaptcha-checkbox-borderAnimation' and @role='presentation']")
    public WebElement recaptcha;



















}
