package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs {


    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(xpath = "//input[@type='checkbox' and @name='confirm']")
    public WebElement confirmCheckBox;

    @FindBy(xpath = "//button[p[text()='Send Massage']]")
    public WebElement sendMessage;







}
