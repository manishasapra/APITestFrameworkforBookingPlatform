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
    public void testCreateBookingWithMissingFields() {
        BookingDates dates = new BookingDates("2023-09-01", "2023-09-10");
        Booking booking = new Booking(null, null, 100, true, dates, "Lunch");

        Response response = BookingEndpoints.createBooking(booking);

        assertEquals(response.getStatusCode(), 500); // or 400 depending on API
    }
}
