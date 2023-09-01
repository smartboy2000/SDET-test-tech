package forms;

import com.autong.base.PageBase;
import com.autong.utilities.PropertyManager;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.autong.base.TestBase.*;

@Getter
public class LoginTests extends PageBase {

    /**
     * Instantiates a new adds the feedback page.
     *
     * @param driver the driver
     */
    public LoginTests(WebDriver driver) {
        super(driver);
    }

    PropertyManager propertyManager = new PropertyManager();
    public By closePopup = By.xpath("//button[contains(@aria-label,'Dismiss')]");

    public void openUrl() {
        setupBrowser(propertyManager.getResourceBundle.getProperty("browser"),
                propertyManager.getResourceBundle.getProperty("base_url"));
        pause(2000);
        waitForElementVisible(10, getDriver().findElement(closePopup));
        waitForElementToBeClickable(10, getDriver().findElement(closePopup));
        getDriver().findElement(closePopup).click();
    }
}
