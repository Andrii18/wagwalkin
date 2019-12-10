package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class ErrorTest extends BaseTest {

    private static Logger log = Logger.getLogger(ErrorTest.class.getName());

    @Test
    public void ErrorTest() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookFirstWalkFreeButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.clickEmailFieid();
        applyPage.clickFirstNameField();
        applyPage.clickLastNameField();
        applyPage.clickPhoneField();
        applyPage.clickPasswordField();

        String error1 = applyPage.errorEmailField();
        Assert.assertEquals("required", error1);

        String error2 = applyPage.errorFirstNameField();
        Assert.assertEquals("required", error2);

        String error3 = applyPage.errorLastNameField();
        Assert.assertEquals("required", error3);

        String error4 = applyPage.errorPhoneField();
        Assert.assertEquals("required", error4);

        String errorPassw1 = applyPage.errorMessagePassword1();
        Assert.assertEquals("8 Characters,", errorPassw1);

        String errorPassw2 = applyPage.errorMessagePassword2();
        Assert.assertEquals("1 Letter,", errorPassw2);

        String errorPassw3 = applyPage.errorMessagePassword3();
        Assert.assertEquals("1 Number)", errorPassw3);

    }
}
