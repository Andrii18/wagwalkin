package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ApplyExistingUserTest extends BaseTest {

    @Test
    public void ExistUserAppTest () throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookFirstWalkFreeButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmail("alex@gmail.com");

        applyPage.inputPassword("12345rtghf658");

        applyPage.inputFirstNameField("Alex");

        applyPage.inputLastNameField("Ivanov");

        applyPage.inputPhoneField("+1 19199387666");

        applyPage.clickNextButton();

//        Thread.sleep(3000);

        String messageNextButton = applyPage.existingMessageField();
        Assert.assertEquals("Email address already registered", messageNextButton);



}
}
