package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wagwalking.BaseTest;

import java.util.List;

public class ThirdTest extends BaseTest {
    @Test
    public void ThirdTest() {

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-htpNat.jxwWGa"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFeilds = driver.findElements(By.cssSelector("input"));

        inputFeilds.get(0).click();
        inputFeilds.get(1).click();
        inputFeilds.get(2).click();
        inputFeilds.get(3).click();
        inputFeilds.get(4).click();
        inputFeilds.get(0).click();

        List<WebElement> requiredField = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));

        String emailError = requiredField.get(0).getText();
        String expEmailError = "required";
        Assert.assertEquals(expEmailError,emailError);


        String firstNameError = requiredField.get(2).getText();
        String expFirstNameError = "required";
        Assert.assertEquals(expFirstNameError, firstNameError);


        String lastNameError = requiredField.get(3).getText();
        String expLastNameError = "required";
        Assert.assertEquals(expLastNameError, lastNameError);


        String cellPhoneError = requiredField.get(4).getText();
        String expCellPhoneError = "required";
        Assert.assertEquals(expCellPhoneError, cellPhoneError);


    }


}
