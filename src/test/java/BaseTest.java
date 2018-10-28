import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public WebDriver driver;
    public ChromeOptions initDriverOptions()
    {
        Utils utils=new Utils();
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("enable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        return options;
    }
    public void driverSetUp()
    {
        driver=new ChromeDriver(initDriverOptions());
    }
}
