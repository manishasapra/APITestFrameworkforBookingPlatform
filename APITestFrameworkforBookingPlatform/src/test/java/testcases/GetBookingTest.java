package testcases;
import lombok.*;
import org.junit.jupiter.api.Test;
import pages.Basetest;
import pages.Booking;
import pages.BookingDates;
import pages.BookingEndpoints;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetBookingTest extends Basetest {
    @Test
    public void testGetBooking(){
        BookingEndpoints endpoints = new BookingEndpoints ();
        BookingDates dates = new BookingDates("2023-09-01", "2023-09-10");
        Booking booking = new Booking("Pam", "Beesly", 200, false, dates, "Lunch");


        var createResponse = endpoints.createBooking(booking);
        assertThat(createResponse.statusCode(), is(200));

        int bookingId = createResponse.jsonPath().getInt("bookingid");

        // Step 2: Fetch the booking by ID
        var getResponse = endpoints.getBooking(bookingId);
        assertThat(getResponse.statusCode(), is(200));

        // Step 3: Verify response content
        Booking actualBooking = getResponse.as(Booking.class);

        assertThat(actualBooking.getFirstname(), equalTo(booking.getFirstname()));
        assertThat(actualBooking.getLastname(), equalTo(booking.getLastname()));
        assertThat(actualBooking.getTotalprice(), equalTo(booking.getTotalprice()));
        assertThat(actualBooking.isDepositpaid(), equalTo(booking.isDepositpaid()));
        assertThat(actualBooking.getBookingdates().getCheckin(), equalTo(booking.getBookingdates().getCheckin()));
        assertThat(actualBooking.getBookingdates().getCheckout(), equalTo(booking.getBookingdates().getCheckout()));
        assertThat(actualBooking.getAdditionalneeds(), equalTo(booking.getAdditionalneeds()));
    }

    }


