package testcases;
import org.junit.jupiter.api.Test;
import pages.Basetest;
import pages.Booking;
import pages.BookingDates;
import pages.BookingEndpoints;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class CreateBookingTest extends Basetest {
    @Test
    public void testCreateBooking() {
        BookingEndpoints endpoints = new BookingEndpoints();
        BookingDates dates = new BookingDates("2023-09-01", "2023-09-10");
        Booking booking = new Booking("Jim", "Halpert", 150, true, dates, "Breakfast");

        var response = endpoints.createBooking(booking);

        assertThat(response.statusCode(), is(200));
        assertThat(response.jsonPath().getString("booking.firstname"), equalTo("Jim"));
    }
}
