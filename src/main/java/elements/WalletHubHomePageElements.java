package elements;

import org.openqa.selenium.By;


public enum WalletHubHomePageElements
{
    USERNAME(By.xpath("//input[@placeholder='Email Address']")),
    PASSWORD(By.xpath("//input[@placeholder='Password']")),
    LOGINBUTTON(By.xpath("//button//span[text()='Login']")),
    ;
    private By by;
    private WalletHubHomePageElements(By by)
    {
        this.by=by;
    }
    public By getElement()
    {
        return this.by;
    }
}


