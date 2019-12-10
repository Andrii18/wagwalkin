package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WagTagPage extends BasePage {

    public WagTagPage (WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.gYtgOP")
    private List<WebElement> WagTagButton;

    public WagTagPage clickOrderNowButton() {
        wait.until(ExpectedConditions.elementToBeClickable(WagTagButton.get(0)));
        WagTagButton.get(0).click();
        return new WagTagPage(driver);
    }



}
