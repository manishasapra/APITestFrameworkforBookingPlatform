package pages;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.Booking;
import api.utils.TokenUtil;

import static io.restassured.RestAssured.given;

public class BookingEndpoints {
    public static Response createBooking(Booking booking) {
        return given()
                .contentType(ContentType.JSON)
                .body(booking)
                .post("/booking");
    }

    public static Response getBooking(int bookingId) {
        return given()
                .get("/booking/" + bookingId);
    }

    public static Response updateBooking(int bookingId, Booking updatedBooking) {
        return given()
                .contentType(ContentType.JSON)
                .cookie("token", TokenUtil.getToken())
                .body(updatedBooking)
                .put("/booking/" + bookingId);
    }

    public static Response deleteBooking(int bookingId) {
        return given()
                .cookie("token", TokenUtil.getToken())
                .delete("/booking/" + bookingId);
    }
    // Delete without token
    public static Response deleteBookingWithoutToken(int bookingId) {
        return given()
                .when()
                .delete("/booking/" + bookingId);
    }
    // Delete with invalid ID (string instead of int)
    public static Response deleteBookingWithStringId(String id, String token) {
        return given()
                .cookie("token", token)
                .when()
                .delete("/booking/" + id);
    }
}


