package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    @BeforeTest
    public void setup()  {
        // Automatically download and set up ChromeDriver
//        WebDriverManager.chromedriver().setup();
        // Now you can initialize the WebDriver

        //  hi lets pull now
    }
}
