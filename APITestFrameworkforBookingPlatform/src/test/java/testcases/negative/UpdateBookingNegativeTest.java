package testcases.negative;
import org.junit.jupiter.api.Test;
import api.utils.TokenUtil;
import io.restassured.response.Response;
import pages.Basetest;
import pages.Booking;
import pages.BookingDates;
import pages.BookingEndpoints;

public class UpdateBookingNegativeTest extends Basetest {
    @Test
    public void testUpdateNonExistentBooking() {
        BookingDates dates = new BookingDates("2023-08-01", "2023-08-10");
        Booking booking = new Booking("Andy", "Bernard", 400, true, dates, "Banjo");

        String token = TokenUtil.getToken();

        int nonExistentId = 999999;

        Response response = BookingEndpoints.updateBooking(nonExistentId, booking);

        response.then().statusCode(405);
    }
}