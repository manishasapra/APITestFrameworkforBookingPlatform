package testcases;

import api.utils.TokenUtil;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import pages.Basetest;
import pages.Booking;
import pages.BookingDates;
import pages.BookingEndpoints;

public class UpdateBookingTest extends Basetest {
    @Test
    public void testUpdateBooking() {

        //create a new booking
        BookingDates dates = new BookingDates("2023-09-01", "2023-09-10");
        Booking booking = new Booking("Pam", "Beesly", 200, false, dates, "Lunch");
        Response response = BookingEndpoints.createBooking(booking);
        int bookingId = response.jsonPath().getInt("bookingid");

        // Generate token
        String token = TokenUtil.getToken();

        // Step 3: Prepare updated data
        Booking updatedBooking = new Booking("Pamela", "Halpert", 250, true, dates, "Dinner");

        // Step 4: Send PUT request to update booking
        Response updateResponse = BookingEndpoints.updateBooking(bookingId, updatedBooking);

        // Step 5: Verify updated fields
        updateResponse.then().statusCode(200);
        Assert.assertEquals(updateResponse.jsonPath().getString("firstname"), "Pamela");
        Assert.assertEquals(updateResponse.jsonPath().getString("lastname"), "Halpert");
        Assert.assertEquals(updateResponse.jsonPath().getInt("totalprice"), 250);
        Assert.assertEquals(updateResponse.jsonPath().getBoolean("depositpaid"), true);




    }
}
