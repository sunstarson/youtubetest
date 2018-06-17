package pages;

import org.openqa.selenium.By;
import wrappers.BasePage;

public class VideoPage extends BasePage{
    private By avatar = By.id("img");

    public void openProfile() {
        click(avatar);
    }
}
