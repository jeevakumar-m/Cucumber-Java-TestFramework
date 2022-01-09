package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonPageAction {

    private static WebDriver driver;
    private static WebElement element;
    WebDriverWait wait;

    public CommonPageAction(WebDriver driver)
    {
        this.driver=driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    protected WebElement applyWait(String xPathOfWebElement)
    {
       return wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(xPathOfWebElement))));
    }

    protected void LoadPage(String URL)
    {
        driver.get(URL);
    }

    protected WebElement getElement(String xPathOfWebElement)
    {
        return applyWait(xPathOfWebElement);
    }

    protected void clickWebElement(String xPathOfWebElement)
    {
        getElement(xPathOfWebElement).click();
    }

    protected String getTextOfWebElement(String xPathOfWebElement)
    {
        return getElement(xPathOfWebElement).getText();
    }

    protected void enterTextInWebElement(String xPathOfWebElement,String valueToBeEntered)
    {
        getElement(xPathOfWebElement).sendKeys(valueToBeEntered);
    }


}
