package wagwalking;

import org.junit.Assert;
import org.junit.Test;

public class ApplyTest extends BaseTest {


    @Test
    public void testApply() {

        ApplyPage applyPage = new ApplyPage(driver);

        homePage = new HomePage(driver);

        applyPage = homePage.clickBookFirstWalkFreeButton();

        applyPage.inputEmail("123@gmail.com");

        applyPage.inputPassword("12345rt");

        applyPage.inputFirstNameField("Ivan");

        applyPage.inputLastNameField("Ivanov");

        applyPage.inputPhoneField("+1 19199387666");

//        String email = applyPage.getEmail();

//        Assert.assertEquals("123@gmail.com", email);




    }




}
