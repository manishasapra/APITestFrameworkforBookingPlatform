package testcases.negative;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.Basetest;

import static io.restassured.RestAssured.given;

public class GetBookingNegativeTest extends Basetest {
    @ParameterizedTest
    @ValueSource(strings = {"9999999", "abc", "@#!", "-1"})
    @DisplayName("GET /booking/{id} - Should return 404 for invalid or non-existent IDs")
    public void getBookingWithInvalidIds_ShouldReturn404(String invalidId) {
        given()
                .when()
                .get("/booking/" + invalidId)
                .then()
                .statusCode(404);
    }

}
