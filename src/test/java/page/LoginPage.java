package page;

import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://login.yahoo.com/config/login_verify2?.intl=za&.src=ym";
    @FindBy(id = "login-username")
    private WebElement inputLogin;

    @FindBy(id = "login-passwd")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"login-signin\"]")
    private WebElement buttonSubmit;



    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public LoginPage openPage()
    {
        driver.navigate().to(PAGE_URL);
        driver.navigate().refresh();
        logger.info("Login page opened");
        return this;
    }

    public HomePage login(User user)
    {
        waitForElement(inputLogin, driver);
        inputLogin.sendKeys(user.getUsername());
        buttonSubmit.click();
        waitForElement(inputPassword, driver);
        inputPassword.sendKeys(user.getPassword());
        buttonSubmit.click();
        logger.info("Logged in");
        return new HomePage(driver);
    }
}
