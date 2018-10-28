package elements;

import org.openqa.selenium.By;


    public enum FaceBookPageElements
    {
        USERNAME(By.id("email")),
        PASSWORD(By.id("pass")),
        LOGINBUTTON(By.id("loginbutton")),
        MAKEPOST_BUTTON(By.xpath("//span[contains(text(),'Make Post')]")),
        STATUSTEXTBOX(By.xpath("//div[@contenteditable='true']")),
        NEWSFEED(By.xpath("//li[@data-destination='TIMELINE']")),
        SUBMIT_BUTTON(By.xpath("//button[@tabindex='-1' and @type='submit']")),
        ;
        private By by;
        private FaceBookPageElements(By by)
        {
            this.by=by;
        }
        public By getElement()
        {
            return this.by;
        }
    }


