package locators;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Locators {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public class BookingLocators {
        public static final String INPUT_LOCATION = "//input[@placeholder='Where are you going?']";
        public static final String SEARCH_BUTTON = "button[type='submit']";
        public static final String DATE = "//td/span[@data-date='%s']";
        public static final String SEE_AVAILABILITY_BUTTON = "(//span[text()='See availability']/parent::a)[1]";
        public static final String RESERVE_BUTTON = "//button[@id='hp_book_now_button']";
        public static final String ROOM_NUMBER_DD = "//div[@class='hprt-block']/descendant::select[1]";
        public static final String I_WILL_RESERVE_BUTTON = "//span[contains(text(),'reserve')]/parent::button";
        public static final String FIRST_NAME = "input#firstname";
        public static final String LAST_NAME = "input#lastname";
        public static final String USER_EMAIL = "input#email";
        public static final String SUBMIT_BUTTON = "button[data-popover-content-id='bp-submit-popover']";
        public static final String PHONE = "input#phone";
        public static final String INPUT_MAIL_LIST = "input#mailinglist";
        public static final String INPUT_MAIL_LIST2 = "input#mailinglist_transport";
        public static final String BOOK_BUTTON = "button[name='book']";
        public static final String ERROR_MESSAGE = "//a[text()='We had a problem validating your card. Please try using a different card or payment method.']";
    }
}
