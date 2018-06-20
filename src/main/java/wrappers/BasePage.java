package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public void waitUntilUrlContains(String text){
        wait.until(ExpectedConditions.urlContains(text));
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

    public void clickByJs(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
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
