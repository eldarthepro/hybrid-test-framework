package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage{
    protected WebDriver driver;

    protected abstract AbstractPage openPage();
    protected static final int WAIT_TIMEOUT_SECONDS = 30;

    protected AbstractPage(WebDriver driver)
    {
        this.driver = driver;
    }
    protected static void waitForElement(WebElement element, WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.elementToBeClickable(element));
    }
}
