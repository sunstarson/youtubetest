import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
