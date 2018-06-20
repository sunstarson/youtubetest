package pages;

import org.openqa.selenium.By;
import wrappers.BasePage;

public class ProfilePage extends BasePage{
    private By subscribeButton = By.id("subscribe-button");

    public void subscribeToUser() {
        clickByJs(subscribeButton);
    }
}

