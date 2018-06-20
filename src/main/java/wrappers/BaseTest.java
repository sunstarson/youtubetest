package wrappers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().window().setSize(new Dimension(2560, 1600));
        driver.manage().window().fullscreen(); // - развернул на весь экран
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeMethod
    public void openYoutube() {
        open("https://www.youtube.com/");
    }

    private void open(String url) {
        driver.get(url);
    }

}
