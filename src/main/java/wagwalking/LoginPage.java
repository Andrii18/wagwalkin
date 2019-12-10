package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement loginButton;

    public DogInfoPage clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        return new DogInfoPage(driver);
    }

    @FindBy(css = ".form-control")
    private List<WebElement> inputLoginFPasswordFields;

    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.visibilityOfAllElements(inputLoginFPasswordFields));
        inputLoginFPasswordFields.get(0).sendKeys(email);
    }

    public void inputPasswordField(String password) {
        wait.until(ExpectedConditions.visibilityOfAllElements(inputLoginFPasswordFields));
        inputLoginFPasswordFields.get(1).sendKeys(password);
    }

    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement clickLoginButton1;
    public void clickLoginButton1() {
       clickLoginButton1.click();
    }

}

