package forms;

import com.autong.base.PageBase;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static com.autong.base.TestBase.*;
import static locators.Locators.BookingLocators.*;

@Getter
public class BookingTests extends PageBase {

    public BookingTests(WebDriver driver) {
        super(driver);
    }

    public String userFirstName = "Automation";
    public String userLastName = "Tester";
    public String userEmailAddress = "test@gmail.com";

    @FindBy(xpath = INPUT_LOCATION)
    private WebElement inputLocation;

    @FindBy(css = SEARCH_BUTTON)
    private WebElement searchButton;

    @FindBy(xpath = SEE_AVAILABILITY_BUTTON)
    private WebElement seeAvailabilityButton;

    @FindBy(xpath = RESERVE_BUTTON)
    private WebElement reserveButton;

    @FindBy(xpath = ROOM_NUMBER_DD)
    private WebElement roomNumberDd;

    @FindBy(xpath = I_WILL_RESERVE_BUTTON)
    private WebElement iWillReserveButton;

    @FindBy(css = FIRST_NAME)
    private WebElement firstName;

    @FindBy(css = LAST_NAME)
    private WebElement lastName;

    @FindBy(css = USER_EMAIL)
    private WebElement userEmail;

    @FindBy(css = SUBMIT_BUTTON)
    private WebElement submitButton;

    @FindBy(css = PHONE)
    private WebElement phone;

    @FindBy(css = INPUT_MAIL_LIST)
    private WebElement inputMailList;

    @FindBy(css = INPUT_MAIL_LIST2)
    private WebElement inputMailList2;

    @FindBy(css = BOOK_BUTTON)
    private WebElement bookButton;

    @FindBy(xpath = ERROR_MESSAGE)
    private WebElement errorMessage;

    public void addLocationData(String location) {
        getInputLocation().click();
        getInputLocation().sendKeys(location);
        getInputLocation().sendKeys(Keys.ENTER);
    }

    public void addCheckInCheckOutDate(String checkIn, String checkOut) {
        getDriver().findElement(By.xpath(String.format(DATE, checkIn))).click();
        getDriver().findElement(By.xpath(String.format(DATE, checkOut))).click();
    }

    public void clickSearch() {
        getSearchButton().click();
    }

    public void seatAvailability() {
        getSeeAvailabilityButton().click();
    }

    public void clickReserve() {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        pause(5000);
        getReserveButton().click();
    }

    public void selectRoom(String roomNumber) {
        pause(5000);
        Select select = new Select(getRoomNumberDd());
        select.selectByValue(roomNumber);
        getIWillReserveButton().click();
        pause(5000);
    }

    public void addPersonalInformation() {
        getFirstName().sendKeys(userFirstName);
        getLastName().sendKeys(userLastName);
        getUserEmail().sendKeys(userEmailAddress);
        getSubmitButton().click();
    }

    public void addPhoneNumber(String phoneNumber) {
        pause(5000);
        getPhone().sendKeys(phoneNumber);
        javaScriptClick(getBookButton());
        pause(8000);
        javaScriptClick(getInputMailList());
        javaScriptClick(getInputMailList2());
        javaScriptClick(getBookButton());
        waitForElementVisible(10, getErrorMessage());
    }
}
