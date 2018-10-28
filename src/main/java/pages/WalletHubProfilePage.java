package pages;

import elements.WalletHubProfilePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalletHubProfilePage extends BasePage{
    public WalletHubProfilePage(WebDriver driver)
    {
        super(driver, WalletHubProfilePageElements.MYPROFILE.getElement());
    }
    public char getRating()
    {
        driver.findElement(WalletHubProfilePageElements.REVIEWSBUTTON.getElement()).click();
        String rating=driver.findElement(WalletHubProfilePageElements.RATING.getElement()).getText();
        return rating.charAt(rating.length()-1);
    }
    public String getReviewText()
    {
        String review=driver.findElement(WalletHubProfilePageElements.REVIEWDATA.getElement()).getText();
        return review;
    }
}
