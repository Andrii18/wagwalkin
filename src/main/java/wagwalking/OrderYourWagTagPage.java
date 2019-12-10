package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class OrderYourWagTagPage extends BasePage {

    public OrderYourWagTagPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> inputDataOrderYourWagTagPage;

    public void inputFirstField(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(inputDataOrderYourWagTagPage.get(0)));
        inputDataOrderYourWagTagPage.get(0).sendKeys(firstName);
    }

    public void inputLastField(String lastName) {
        inputDataOrderYourWagTagPage.get(1).sendKeys(lastName);
    }

    public void inputEmailField(String email) {
        inputDataOrderYourWagTagPage.get(2).sendKeys(email);
    }

    public void inputStreetField(String street) {
        inputDataOrderYourWagTagPage.get(3).sendKeys(street);
    }

    public void inputCityField(String city) {
        inputDataOrderYourWagTagPage.get(4).sendKeys(city);
    }
    public void inputAptField(String apt) {
        inputDataOrderYourWagTagPage.get(5).sendKeys(apt);
    }

    public void inputStateField(String state) {
        inputDataOrderYourWagTagPage.get(6).sendKeys(state);
    }

    public void inputZipCodeField(String zipCode) {
        inputDataOrderYourWagTagPage.get(7).sendKeys(zipCode);
    }

    public void inputCreditCardNumberField(String creditCardNumber) {
        inputDataOrderYourWagTagPage.get(8).sendKeys(creditCardNumber);
    }
    public void inputMmField(String mm) {
        inputDataOrderYourWagTagPage.get(9).sendKeys(mm);
    }

    public void inputCvcField(String cvc) {
        inputDataOrderYourWagTagPage.get(10).sendKeys(cvc);
    }

}


