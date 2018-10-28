package elements;

import org.openqa.selenium.By;


public enum WalletHubReviewPageElements
{

    YourReviewText(By.xpath("//label[contains(text(),'Your Review ')]")),
    DOWNARROW(By.xpath("//span[@class='drop-arrow']")),
    HEALTHDROPDOWN(By.xpath("//li//a[@data-target='Health']")),
    SELECTRATING(By.xpath("//span[@id='overallRating']//a[@class='bf-icon-star-empty star bstar'][5]")),
    REVIEWTEXT(By.name("review")),
    SUBMITBUTTON(By.xpath("//input[@type='submit']")),
    RATINGDISPLAYED(By.xpath("//span[@class='rating-label']")),
    POSTED(By.xpath("//a[contains(text(),'has been posted.')]"));
    private By by;
    private WalletHubReviewPageElements(By by)
    {
        this.by=by;
    }
    public By getElement()
    {
        return this.by;
    }
}


