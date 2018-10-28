package pages;

import Utils.Utils;
import elements.WalletHubElements;
import elements.WalletHubHomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WalletHubHomePage extends BasePage {
    public WalletHubHomePage(WebDriver driver)
    {
        super(driver, WalletHubHomePageElements.USERNAME.getElement());
    }
    public void login(String filepath) {
        Utils utils=new Utils();
        driver.findElement(WalletHubHomePageElements.USERNAME.getElement()).sendKeys(utils.readProperty(filepath,"username"));
        driver.findElement(WalletHubHomePageElements.PASSWORD.getElement()).sendKeys(utils.readProperty(filepath,"password"));
        driver.findElement(WalletHubHomePageElements.LOGINBUTTON.getElement()).click();
    }
    public void navigateToProfile()
    {
        WebElement web_Element_To_Be_Hovered = driver.findElement(WalletHubElements.USERDROPDOWN.getElement());
        Actions builder = new Actions(driver);
        builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
        driver.findElement(WalletHubElements.PROFILE.getElement()).click();
    }
}
