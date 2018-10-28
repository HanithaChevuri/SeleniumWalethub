package pages;

import elements.WalletHubElements;
import elements.WalletHubReviewPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WalletHubPage extends BasePage {
    public WalletHubPage(WebDriver driver)
    {
        super(driver,By.xpath("//span[text()='Write a Review']"));
    }

    public int hoverRating()
    {
        driver.navigate().refresh();
        //Please uncomment below lines if Join WalletHub popup is coming out
        WebDriverWait wait=new WebDriverWait(driver,5);
        if(driver.findElements(By.xpath("//span[@class='cta_arrow down']")).size()>0)
        {
            driver.findElement(By.xpath("//span[@class='cta_arrow down']")).click();
        }

        WebElement web_Element_To_Be_Hovered = driver.findElement(WalletHubElements.RATING.getElement());
        Actions builder = new Actions(driver);
        builder.moveToElement(web_Element_To_Be_Hovered).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(WalletHubElements.RATING5.getElement()));
        WebElement web_Element_To_Be_Hovered2=driver.findElement(WalletHubElements.RATING5.getElement());
        builder.moveToElement(web_Element_To_Be_Hovered2).build().perform();
        List<WebElement> noOfStarsLitUp=driver.findElements(WalletHubElements.NOOFSTARSLITUP.getElement());
        return noOfStarsLitUp.size();
    }
    public void clickLogin() {
        driver.findElement(WalletHubElements.LOGINBUTTON.getElement()).click();
    }

}
