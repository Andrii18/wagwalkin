package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);}

        @FindBy(css = "input")
        private List<WebElement> inputFields;

        @FindBy(css = "input[name=\"email\"]")
        private WebElement emailFields;

        @FindBy(css = "input[name=\"password\"]")
        private WebElement passwordField;

        @FindBy(css = "input[name=\"firstName\"]")
        private WebElement firstNameField;

        @FindBy(css = "input[name=\"lastName\"]")
        private WebElement lastNameField;

        @FindBy(css = "input[name=\"phone\"]")
        private WebElement phoneField;

    public void inputEmail (String email){
        wait.until(ExpectedConditions.visibilityOfAllElements(inputFields));
        inputFields.get(0).sendKeys(email);
//        emailField.sendKeys(email);


//        public String getEmai() {
//            wait.until(ExpectedConditions.visibilityOf(inputFields.get(0));
//            String email = inputFields.get(0).getAttribute("value");
//            return email;
//        }

    }
    public void inputPassword (String password){
        inputFields.get(1).sendKeys(password);
        passwordField.sendKeys(password);
    }
    public void inputFirstNameField(String firstName) {
        inputFields.get(2).sendKeys(firstName);
        firstNameField.sendKeys(firstName);
    }
    public void inputLastNameField(String lastName) {
        inputFields.get(3).sendKeys(lastName);
        lastNameField.sendKeys(lastName);
    }
    public void inputPhoneField(String phone) {
        inputFields.get(4).sendKeys(phone);
        phoneField.sendKeys(phone);
    }

    public void clickEmailFieid() {
        inputFields.get(0).click();
    }
    public void clickFirstNameField() {
        inputFields.get(2).click();
    }
    public void clickLastNameField() {
        inputFields.get(3).click();
    }
    public void clickPhoneField() {
        inputFields.get(4).click();
    }
    public void clickPasswordField() {
        inputFields.get(1).click();
    }


    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> errorField;

    public String errorEmailField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorField));
        return errorField.get(0).getText();
    }
    public String errorFirstNameField() {
        return errorField.get(2).getText();
    }
    public String errorLastNameField() {
        return errorField.get(3).getText();
    }
    public String errorPhoneField() {
        return errorField.get(4).getText();
    }

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> errorField2;

    public String errorMessagePassword1() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorField2));
        return errorField2.get(0).getText();
    }
    public String errorMessagePassword2() {
        return errorField2.get(1).getText();
    }
    public String errorMessagePassword3() {
        return errorField2.get(2).getText();
    }


    @FindBy(css = ".sc-gzVnrw.jvIbBW")
    private WebElement clickNextButton;
    public void clickNextButton() {
        wait.until(ExpectedConditions.visibilityOfAllElements(clickNextButton));
        clickNextButton.click();
    }

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement existUserMessageField;
    public String existingMessageField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(existUserMessageField));
        return existUserMessageField.getText();
    }

}
