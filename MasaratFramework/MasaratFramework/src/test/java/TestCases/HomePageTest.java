package TestCases;

import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

HomePage homePage;

    @Test
    public void FirstTest(){
        homePage=new HomePage(driver);
        homePage.clickOnContact();
    }

}
