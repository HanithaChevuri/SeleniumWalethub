package elements;

import org.openqa.selenium.By;


public enum WalletHubElements
{
    RATING(By.xpath("//span[@class='wh-rating rating_4_5']")),
    USERDROPDOWN(By.xpath("//a[@class='user']")),
    PROFILE(By.xpath("//a[contains(text(),'Profile')]")),
    LOGINBUTTON(By.xpath("//div[@class='login-join']//a[contains(text(),'Login')]")),
    RATING5(By.xpath("//div[@class='wh-rating-choices-holder']//a[text()='5']")),
    RATINGDESC(By.xpath("//em//span")),
    NOOFSTARSLITUP(By.xpath("//a[@class='hover']"));
    private By by;
    private WalletHubElements(By by)
    {
        this.by=by;
    }
    public By getElement()
    {
        return this.by;
    }
}


