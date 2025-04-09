package testcases.positive;

import api.utils.TokenUtil;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import pages.Basetest;
import pages.Booking;
import pages.BookingDates;
import pages.BookingEndpoints;

public class DeleteBookingTest extends Basetest {
    @Test

    public void testDeleteBooking() {
        // Step 1: Create booking
        BookingDates dates = new BookingDates("2023-10-01", "2023-10-10");
        Booking booking = new Booking("Jim", "Halpert", 300, true, dates, "Breakfast");
        Response createResponse = BookingEndpoints.createBooking(booking);
        int bookingId = createResponse.jsonPath().getInt("bookingid");

        // Step 2: Generate token
        String token = TokenUtil.getToken();

        // Step 3: Delete booking
        Response deleteResponse = BookingEndpoints.deleteBooking(bookingId);

        // Step 4: Assert deletion
        deleteResponse.then().statusCode(201); // 201 = Successfully deleted

        // Step 5: Confirm booking no longer exists
        Response getResponse = BookingEndpoints.getBooking(bookingId);
        getResponse.then().statusCode(404);
    }
}