package pages;

import org.openqa.selenium.WebDriver;

public class ExplorePage extends CommonPageAction {
    private static WebDriver driver;

    public ExplorePage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }
}
