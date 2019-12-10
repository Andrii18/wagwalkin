package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SecondTest {
    @Test
    public void SecondTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andri\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://wagwalking.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(expectedTitle, actualTitle);

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-htpNat.jxwWGa"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFeilds = driver.findElements(By.cssSelector("input"));

        inputFeilds.get(0).sendKeys("shto@gmail.com");
        inputFeilds.get(1).sendKeys("2567u");
        inputFeilds.get(2).sendKeys("Ivan");
        inputFeilds.get(3).sendKeys("Ivanov");
        inputFeilds.get(4).sendKeys("+174569");

        driver.quit();


    }
}
