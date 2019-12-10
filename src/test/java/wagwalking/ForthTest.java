package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wagwalking.BaseTest;

import java.util.List;

public class ForthTest extends BaseTest {

    @Test
    public void forthTest() {

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-htpNat.jxwWGa"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFeilds = driver.findElements(By.cssSelector("input"));

        inputFeilds.get(0).click();
        inputFeilds.get(1).click();
        inputFeilds.get(2).click();

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailField.sendKeys(client1.getEmail());

        WebElement emailErrorMessage1 = driver.findElement(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));

        String emailEror1 = emailErrorMessage1.getText();
        String expMessage = "please provide a valid email";
        Assert.assertEquals(expMessage, emailEror1);

        List <WebElement> passwordErrorMessage = driver.findElements(By.cssSelector(".sc-gzVnrw.fzplxK"));

        String passwordErrorMessage1 = passwordErrorMessage.get(0).getText();
        String expMessage1 = "(8 Characters,";
        Assert.assertEquals(expMessage1, passwordErrorMessage1);

        String passwordErrorMessage2 = passwordErrorMessage.get(1).getText();
        String expMessage2 = "1 Letter,";
        Assert.assertEquals(expMessage2, passwordErrorMessage2);

        String passwordErrorMessage3 = passwordErrorMessage.get(2).getText();
        String expMessage3 = "1 Number)";
        Assert.assertEquals(expMessage3, passwordErrorMessage3);

    }







}
