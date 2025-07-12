package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Career{



  WebDriver driver;
  public Career(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
  }



@FindBy(xpath = "//input[contains(@class, 'ant-select-selection-search-input') and @id='rc_select_3']")
public WebElement jobOpening;


@FindBy(xpath = "//input[@placeholder='Phone Number' and @type='tel']")
public WebElement phoneNumber;

@FindBy(xpath = "email")
public WebElement email;

  @FindBy(xpath = "name")
  public WebElement name;

  @FindBy(xpath = "//input[@id='rc_select_4']")
  public WebElement countryOfResidence;

  @FindBy(xpath = "years_of_experience")
  public WebElement yearsOfExperience;

  @FindBy(xpath = "notice_period")
  public WebElement noticePeriod;

  @FindBy(xpath = "<input class=\"ant-checkbox-input\" type=\"checkbox\" name=\"on_site\">")
  public WebElement agreeCheckBox;
  @FindBy(xpath = "//input[@id='rc_select_5']")
  public WebElement currency;

  @FindBy(id = "current_salary")
  public WebElement currentSalary;

  @FindBy(xpath = "expected_salary")
  public WebElement expectedSalary;

  @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
  public WebElement reCaptcha;

  @FindBy(xpath = "//button[@type='submit']")
  public WebElement submit;

  @FindBy(xpath = "//button[.//p[text()='Discard']]")
  public WebElement discard;
  @FindBy(xpath = "//div[@class='recaptcha-checkbox-border' and @role='presentation']")
  public WebElement recaptcha;
}
