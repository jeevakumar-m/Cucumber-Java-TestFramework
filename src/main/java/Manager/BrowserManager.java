package Manager;

import Common.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserManager {

    private static WebDriver driver;

    public static WebDriver getDriver(String browserName)
    {

        switch(browserName)
        {
            case Constants.CHROME:
                 WebDriverManager.chromedriver().setup();
                 driver=new ChromeDriver();
                break;
            case Constants.FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case Constants.IE:
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
            case Constants.SAFARI:
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
        }

        return driver;
    }



}
