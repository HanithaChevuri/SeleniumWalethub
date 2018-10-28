package elements;

import org.openqa.selenium.By;


public enum WalletHubProfilePageElements
{
    MYPROFILE(By.xpath("//div[contains(text(),'My Profile')]")),
    RATING(By.xpath("//span[@class='rating wh-rating rating_5']")),
    REVIEWDATA(By.xpath("//div[@class='profile profile-company-name']/following-sibling::p")),
    REVIEWSBUTTON(By.xpath("//div[@class='profilenav']//li[3]")),
    ;
    private By by;
    private WalletHubProfilePageElements(By by)
    {
        this.by=by;
    }
    public By getElement()
    {
        return this.by;
    }
}


