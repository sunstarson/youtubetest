package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VideoPage;
import pages.YouTubePage;
import wrappers.BaseTest;

public class YouTubeTests extends BaseTest {

    @Test
    public void checkURL() {
        YouTubePage youTube = new YouTubePage();
        String url = youTube.getCurrentUrl();
        Assert.assertEquals("https://www.youtube.com/", url);
    }

    @Test
    public void checkTitle() {
        YouTubePage youTube = new YouTubePage();
        String title = youTube.getTitle();
        Assert.assertEquals("pages", title);
    }

    @Test
    public void mainTest() throws InterruptedException {
        YouTubePage youTube = new YouTubePage();
        youTube.type("234");
        youTube.submitSearch();
        youTube.selectResultOptionByIndex(3);
        VideoPage videoPage = new VideoPage();
        videoPage.openProfile();
    }
}
