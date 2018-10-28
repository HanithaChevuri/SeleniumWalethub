package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver,By by)
    {
        this.driver=driver;
        waitForPageLoad(by);
    }
    public void waitForPageLoad(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
