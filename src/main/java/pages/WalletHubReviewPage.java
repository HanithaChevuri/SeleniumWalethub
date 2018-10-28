package pages;

import elements.WalletHubReviewPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WalletHubReviewPage extends BasePage {
    public WalletHubReviewPage(WebDriver driver)
    {
        super(driver, WalletHubReviewPageElements.YourReviewText.getElement());
    }

    public void writeAReview()
    {
        driver.findElement(WalletHubReviewPageElements.DOWNARROW.getElement()).click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(WalletHubReviewPageElements.HEALTHDROPDOWN.getElement()));
        driver.findElement(WalletHubReviewPageElements.HEALTHDROPDOWN.getElement()).click();
        wait.until(ExpectedConditions.elementToBeClickable(WalletHubReviewPageElements.SELECTRATING.getElement()));
        driver.findElement(WalletHubReviewPageElements.SELECTRATING.getElement()).click();
        driver.findElement(WalletHubReviewPageElements.REVIEWTEXT.getElement()).sendKeys("Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing");
        driver.findElement(WalletHubReviewPageElements.SUBMITBUTTON.getElement()).click();
    }
}
