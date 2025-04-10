package testcases.negative;

import api.utils.TokenUtil;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import pages.Basetest;
import pages.BookingEndpoints;

public class DeleteBookingNegativeTest extends Basetest {
    @Test
    public void testDeleteBookingWithoutToken() {
        int bookingId = 1; // assuming booking with ID 1 exists

        // No token
        Response response = BookingEndpoints.deleteBookingWithoutToken(bookingId);

        response.then().statusCode(403);
    }
    @Test
    public void testDeleteNonExistentBooking() {
        int nonExistentId = 999999;
        String token = TokenUtil.getToken();

        Response response = BookingEndpoints.deleteBooking(nonExistentId);

        response.then().statusCode(405);
    }
    @Test
    public void testDeleteBookingWithInvalidIdFormat() {
        String invalidId = "abc"; // invalid format
        String token = TokenUtil.getToken();

        Response response = BookingEndpoints.deleteBookingWithStringId(invalidId, token);

        response.then().statusCode(405);
    }
}
