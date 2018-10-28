import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FacebookPage;


public class FacebookTest extends BaseTest
{
    @BeforeClass
    public void initDriver()
    {
        driverSetUp();
        driver.get("https://www.facebook.com");
    }

    @Test
    public void verifyFacebookStatusUpdate()
    {
        FacebookPage facebookPage=new FacebookPage(driver);
        //To login into facebook
        //Please change credentials in FacebookLoginDetails.properties file for execution
        facebookPage.facebookLogin("FacebookLoginDetails.properties");
        //to post a status on facebook
        facebookPage.postAFacebookStatus();
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

