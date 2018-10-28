package pages;

import Utils.Utils;

import elements.FaceBookPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPage extends BasePage
{

    public FacebookPage(WebDriver driver)  {
        super(driver,FaceBookPageElements.USERNAME.getElement());
    }
    public void facebookLogin(String filepath)
    {
        Utils utils = new Utils();
        driver.findElement(FaceBookPageElements.USERNAME.getElement()).sendKeys(utils.readProperty(filepath,"username"));
        driver.findElement(FaceBookPageElements.PASSWORD.getElement()).sendKeys(utils.readProperty(filepath,"password"));
        driver.findElement(FaceBookPageElements.LOGINBUTTON.getElement()).click();
    }
    public void postAFacebookStatus()
    {
        driver.findElement(FaceBookPageElements.MAKEPOST_BUTTON.getElement()).click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(FaceBookPageElements.STATUSTEXTBOX.getElement()));
        driver.findElement(FaceBookPageElements.STATUSTEXTBOX.getElement()).sendKeys("Hello World");
        driver.findElement(FaceBookPageElements.NEWSFEED.getElement()).click();
        driver.findElement(FaceBookPageElements.SUBMIT_BUTTON.getElement()).click();
    }
}

