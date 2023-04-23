package test;

import model.User;
import org.testng.annotations.Test;
import page.LoginPage;
import service.UserCreator;
import static org.testng.AssertJUnit.assertTrue;

public class UserAccessTests extends CommonConditions{
    @Test
    public void LoginTest()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        assertTrue(driver.getTitle().contains(loggedInUserName));
    }
}