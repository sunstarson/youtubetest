package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wrappers.BasePage;

public class YouTubePage extends BasePage{
    private By searchInput = By.id("search");
    private By submitButton = By.cssSelector("#search-icon-legacy");
    private By searchResults = By.cssSelector("ytd-video-renderer");

    public void type(String text) {
        type(searchInput, text);
    }

    public void search(String text) {
        type(text);
        submitSearch();
        waitUntilUrlContains(text);
    }

    public void submitSearch() {
        click(submitButton);
    }

    public void selectResultOptionByIndex(Integer index) {
        WebElement option = getElementFromListByIndex(searchResults, index);
        click(option);
    }

}
