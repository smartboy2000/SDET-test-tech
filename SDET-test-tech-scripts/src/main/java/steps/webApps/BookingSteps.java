package steps.webApps;

import forms.BookingTests;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.autong.base.TestBase.getDriver;

public class BookingSteps {

    BookingTests bookingTests = new BookingTests(getDriver());

    @And("user adds location detail as {string}")
    public void addLocationData(String location) {
        bookingTests.addLocationData(location);
    }

    @And("user adds checkin checkOut date as {string} {string} respectively")
    public void addCheckInCheckOutDate(String checkIn, String checkOut) {
        bookingTests.addCheckInCheckOutDate(checkIn, checkOut);
    }

    @And("user clicks on search button")
    public void clickSearch() {
        bookingTests.clickSearch();
    }

    @And("user proceed to check seat availability")
    public void seatAvailability() {
        bookingTests.seatAvailability();
    }

    @And("user clicks on Reserve button")
    public void clickReserve() {
        bookingTests.clickReserve();
    }

    @And("user selects room as {string}")
    public void selectRoom(String roomNumber) {
        bookingTests.selectRoom(roomNumber);
    }

    @And("user adds person information")
    public void addPersonalInformation() {
        bookingTests.addPersonalInformation();
    }

    @And("user adds phone number as {string} along with consent")
    public void addPhoneNumber(String phoneNumber) {
        bookingTests.addPhoneNumber(phoneNumber);
    }

    @Then("user verifies the error message as account detail is invalid")
    public void verifyErrorMessage() {
        Assert.assertTrue(bookingTests.getErrorMessage().isDisplayed());
    }
}
