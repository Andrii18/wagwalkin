package wagwalking;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    private static Logger log = Logger.getLogger(LoginTest.class.getName());


    @Test
    public void LoginTest() {

        log.info("Starting HomePage");
        HomePage homePage = new HomePage(driver);

        log.info("Click loginButton on HomPage");
        homePage.clickLoginHPButton();

        log.info("Create new object");
        LoginPage loginPage = new LoginPage(driver);

        log.info("create new object DogInfoPage");
        DogInfoPage dogInfoPage = new DogInfoPage(driver);

        log.info("input Email in EmailField");
        loginPage.inputEmailField(clientLogin.getEmail());

        log.info("input Password in PasswordField");
        loginPage.inputPasswordField(clientLogin.getPassword());

        log.info("click LoginButton");
        loginPage.clickLoginButton();

    }



}
