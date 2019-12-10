package wagwalking;

import org.junit.Test;

import java.util.logging.Logger;

public class WagTagTest extends BaseTest {

    public static Logger log = Logger.getLogger(WagTagTest.class.getName());

    @Test
    public void WagTagTest() throws InterruptedException {

        log.info("Starting HomePage");
        HomePage homePage = new HomePage(driver);

        log.info("Click WagTag button on HomePage");
        homePage.clickWagTagHPButton();

        log.info("Starting WagTagPage");
        WagTagPage wagTagPage = new WagTagPage(driver);

        log.info("Click NowOrderButton on WagTagPage");
        wagTagPage.clickOrderNowButton();

        log.info("Starting OrderYourWagTagPage");
        OrderYourWagTagPage orderYourWagTagPage = new OrderYourWagTagPage (driver);

        Thread.sleep(3000);

        log.info("input firstName in FirstField");
        orderYourWagTagPage.inputFirstField(clientOrder.getFirstName());

        log.info("input lastName in LastField");
        orderYourWagTagPage.inputLastField(clientOrder.getLastName());

        log.info("input email in EmailField");
        orderYourWagTagPage.inputLastField(clientOrder.getEmail());

        log.info("input street in StreetField");
        orderYourWagTagPage.inputStreetField(clientLogin.getStreet());

        log.info("input city in CityField");
        orderYourWagTagPage.inputCityField(clientOrder.getCity());

        log.info("input apt# in AptField");
        orderYourWagTagPage.inputAptField(clientOrder.getApt());

        log.info("input state in StateField");
        orderYourWagTagPage.inputStateField(clientOrder.getState());

        log.info("input zip code in ZipCodeField");
        orderYourWagTagPage.inputZipCodeField(clientOrder.getZipCode());

        log.info("input credit card number in CreditCardNumberField");
        orderYourWagTagPage.inputCreditCardNumberField(clientOrder.getCreditCardNumber());

        log.info("input mm/yy in MmField");
        orderYourWagTagPage.inputMmField(clientOrder.getMm());

        log.info("input cvc in CvcField");
        orderYourWagTagPage.inputCvcField(clientOrder.getCvc());














    }





}


