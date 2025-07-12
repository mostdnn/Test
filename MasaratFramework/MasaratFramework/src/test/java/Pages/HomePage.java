package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage  {

     WebDriver driver;
public HomePage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
}

    //header elements


    @FindBy(xpath = "//a[text()='Home']")
    WebElement homeHeader;

    @FindBy(xpath = "//a[text()='About Masarat']")
    public WebElement aboutMasaratHeader;

    @FindBy(xpath = "//a[text()='Our Services']")
    public WebElement ourServiceHeader;

    @FindBy(xpath = "//a[text()='Partner with us']")
    public WebElement partnerWithUsHeader;

    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUsHeader;

    @FindBy(xpath = "//a[text()='Career']")
    public WebElement career;

    @FindBy(xpath = "//p[text()='EN']")
    public WebElement languageDropDown;

    @FindBy(xpath = "//p[contains(@class, 'text-2xl')]")
    public WebElement contactus1;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div/div/a/p")
    public WebElement callus1;

    @FindBy(xpath = "//p[text()='Explore More']")
    public WebElement exploreMore1;

    @FindBy(xpath = "//p[text()='Call Us']")
    public WebElement callIcon;

    @FindBy(xpath = "//p[text()='Our Email']")
    public WebElement emailIcon;

    @FindBy(xpath = "//p[text()='Our Address']")
    public WebElement addressIcon;


    public WebElement clickHome(){
        homeHeader.click();
    }

    public WebElement clickAbout(){
        aboutMasarat.click();
    }

    public WebElement ourService(){
        ourServiceHeader.click();
    }

    public WebElement clickPartner(){
        partnerWithUs.click();
    }
    public WebElement clickCareer(){
        career.click();
    }



// footer elements:

    @FindBy(xpath = "//a[text()='About Masarat']")
    public WebElement aboutMasarat;

    @FindBy(xpath = "//a[text()='Partner with us']")
    public WebElement partnerWithUs;

    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUs;

    @FindBy(xpath = "//a[text()='Umrah']")
    public WebElement umrah;

    @FindBy(xpath = "//img[@alt='scroll up']")
    public WebElement scrollUp;









}
