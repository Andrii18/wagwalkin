package wagwalking;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import wagwalking.Client;

public class BaseTest {

    protected static WebDriver driver;

    protected static Client client;

    protected static Client client1;

    protected static Client clientLogin;

    protected static Client clientOrder;

    protected HomePage homePage;

//    protected ApplyPage applyPage;

    @BeforeClass
    public static void start() {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\andri\\Desktop\\chromedriver.exe");

    driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://wagwalking.com/");

    String actualTitle = driver.getTitle();

    System.out.println(actualTitle);

    String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

    Assert.assertEquals(expectedTitle, actualTitle);

    client = new Client("wrei@gmail.com", "12745r", "Ivan", "Ivanoiv",
            "1234567890","", "", "", "", "", "", "", "");

    client1 = new Client("123456790", "", "", "", "", "", "",
            "", "", "", "", "","");

    clientLogin = new Client("test16.av@gmail.com", "205r13R13", "Ivan", "Ivanov",
            "(413) 333 7271", "", "", "", "", "", "", "",
            "");

    clientOrder = new Client("test16.av@gmail.com", "205r13R13", "Ivan", "Ivanov",
            "4133337271", "BelRed", "Bellevue", "100", "WA", "10000",
            "12345678912345678", "10/20", "777");

    }



//   @AfterClass
//    public static void finish() {
//    driver.quit();

//    }

}
