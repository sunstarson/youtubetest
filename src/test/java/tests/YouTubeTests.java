package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YouTubePage;
import wrappers.BaseTest;

public class YouTubeTests extends BaseTest {

    @Test
    public void checkURL() {
        String url = getCurrentUrl();
        Assert.assertEquals("https://www.youtube.com/", url);
    }

    @Test
    public void checkTitle() {
        String title = getTitle();
        Assert.assertEquals("pages", title);
    }

    @Test
    public void fgjhfh() throws InterruptedException {
        YouTubePage youTube = new YouTubePage();
        youTube.type("234");
        youTube.submitSearch();
    }
}
