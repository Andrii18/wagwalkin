package wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wagwalking.BaseTest;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst() {

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-htpNat.jxwWGa"));
        bookFirstWalkFreeButton.click();

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailField.sendKeys(client.getEmail());

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));
        passwordField.sendKeys(client.getPassword());

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
        firstNameField.sendKeys(client.getFirstName());

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));
        lastNameField.sendKeys(client.getLastName());

        WebElement cellPhoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));
        cellPhoneField.sendKeys(client.getPhone());

    }
}
