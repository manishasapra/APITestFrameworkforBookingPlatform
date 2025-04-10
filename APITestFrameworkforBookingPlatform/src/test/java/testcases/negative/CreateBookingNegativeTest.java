package testcases.negative;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import pages.Basetest;
import pages.Booking;
import pages.BookingDates;
import pages.BookingEndpoints;

import static org.testng.AssertJUnit.assertEquals;

public class CreateBookingNegativeTest extends Basetest {
    @Test
    public void testCreateBookingWithMissingOrInvalidFields() {
        // Build invalid BookingDates (missing checkout)
        BookingDates dates = new BookingDates("2025-04-10", null);

        // Build invalid Booking (empty lastname, 0 price, null additionalneeds)
        Booking booking = new Booking("John", "", 0, true, dates, null);

        // Make the API call
        Response response = BookingEndpoints.createBooking(booking);

        // Print and validate response
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        response.prettyPrint();

        // Assert based on actual API behavior
        assertEquals(statusCode, 500); // or 500 depending on the real API
    }

}
