import elements.WalletHubElements;
import elements.WalletHubReviewPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WalletHubHomePage;
import pages.WalletHubPage;
import pages.WalletHubProfilePage;
import pages.WalletHubReviewPage;

public class WalletHubReviewTest extends BaseTest
{
    @BeforeClass
    public void initDriver()
    {
        driverSetUp();
        driver.get("https://wallethub.com/profile/test_insurance_company/");
    }

    @Test
    public void testPostAReview()
    {
        WalletHubPage walletHubPage=new WalletHubPage(driver);
        walletHubPage.clickLogin();
        WalletHubHomePage walletHubHomePage=new WalletHubHomePage(driver);
        //To login into WalletHub page
        //Please enter credentials in WalletHubLoginDetails to execute test case
        walletHubHomePage.login("WalletHubLoginDetails.properties");
        WalletHubPage walletHubPage1=new WalletHubPage(driver);
        //To hover over rating and check if 5 stars are lit up
        Assert.assertEquals(walletHubPage1.hoverRating(),4);
        driver.findElement(WalletHubElements.RATING5.getElement()).click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(WalletHubReviewPageElements.RATINGDISPLAYED.getElement()));
        WalletHubReviewPage walletHubReviewPage=new WalletHubReviewPage(driver);
        walletHubReviewPage.writeAReview();
        //To check if review is posted in Review posted page
        Assert.assertTrue(driver.findElement(WalletHubReviewPageElements.POSTED.getElement()).isDisplayed());
        walletHubHomePage.navigateToProfile();
        WalletHubProfilePage walletHubProfilePage=new WalletHubProfilePage(driver);
        //To validate rating and review on profile page
        Assert.assertEquals(walletHubProfilePage.getRating(),'5');
        Assert.assertEquals(walletHubProfilePage.getReviewText(),"Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing");
    }

    @AfterClass
    public void closeBrowser()
    {
        if(driver!=null)
        {
            driver.close();
        }
    }
}
