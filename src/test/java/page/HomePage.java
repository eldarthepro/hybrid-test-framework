package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends AbstractPage{
    private final String BASE_URL = "https://github.com/";
    private final By loggedInUserLocator = By.xpath("//*[@id=\"Atom\"]/head/title");

    public HomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public HomePage openPage()
    {
        driver.navigate().to(BASE_URL);
        return this;
    }

    public String getLoggedInUserName()
    {
        return driver.findElement(loggedInUserLocator).getText();
    }
}
