package pages;

import org.openqa.selenium.By;
import wrappers.BasePage;

public class VideoPage extends BasePage{
    private By avatar = By.cssSelector("ytd-video-owner-renderer > a");

    public void openProfile() {
        click(avatar);
    }
}