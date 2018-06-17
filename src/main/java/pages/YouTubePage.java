package pages;

import org.openqa.selenium.By;
import wrappers.BasePage;

public class YouTubePage extends BasePage{
    private By searchInput = By.id("search");
    private By submitButton = By.cssSelector("#search-icon-legacy");

    public void type(String text) {
        type(searchInput, text);
    }

    public void submitSearch() {
        click(submitButton);
    }
}
