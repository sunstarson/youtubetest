package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = BaseTest.driver;
        this.wait = new WebDriverWait(driver, 5);
    }

    public void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(locator));
        input.sendKeys(text);
    }

    public void click(By locator) {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(locator));
        button.click();
    }

    public void click(WebElement element) {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(element));
        button.click();
    }

    public WebElement getElementFromListByIndex(By locator, Integer index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        List<WebElement> items = driver.findElements(locator);
        return items.get(index);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
