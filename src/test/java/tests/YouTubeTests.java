package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProfilePage;
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
    public void mainTest() {
        YouTubePage youTube = new YouTubePage();
        youTube.search("234");
        youTube.selectResultOptionByIndex(3);
        VideoPage videoPage = new VideoPage();
        videoPage.openProfile();
        ProfilePage profilePage = new ProfilePage();
        profilePage.subscribeToUser();
    }
}
